package plateau;

public class PaireTriominos{

  private Triomino[] paire;
  private int x, y;

  public PaireTriominos(int x, int y){
    this.x = x;
    this.y = y;
    this.paire = new Triomino[2];
    this.paire[0] = null;
    this.paire[1] = null;
  }

  public boolean addTriomino(Triomino t, int orientation){
    Triomino tri;
    if(this.paire[0orientation/3] == null){
      return false;
    }
    tri = paire[orientation/3];
    if(!tri.remplacable(t, orientation)){
      return false;
    }
    this.parie[orientation/3] = t;
    t.positionner(this.x, this.y, orientation);
    return true;
  }

  public void setPosition(int x, int y){
    this.x = x;
    this.y = y;
  }

}
