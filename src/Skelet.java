public class Skelet extends Boss{

    private int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
    public String skeletInfo(){
        return "; Number of arrows: " + numberOfArrows;
    }
}
