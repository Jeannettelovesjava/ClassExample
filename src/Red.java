/**
 * Created by Grand Circus Student on 7/24/2017.
 */

public class Red extends Wine {
    private String grapes;
    private double alcoholcontent;

    public Red(String grapes, int calories,
               double alcoholcontent) {
        super(grapes, calories, alcoholcontent);

        String variety = null;
        this.grapes = variety;
        this.alcoholcontent = alcoholcontent;
    }

    public String getGrapes() {
        return grapes;
    }

    public void setGrapes(String grapes) {
        this.grapes = grapes;
    }

    public double getAlcoholcontent() {
        return alcoholcontent;
    }

    public void setAlcoholcontent(int alcoholcontent) {
        this.alcoholcontent = alcoholcontent;
    }

    public void raiseContent (double raise) {
        alcoholcontent = (int)(alcoholcontent * (1 + raise));
    }

    @Override
    public String toString() {
        return "Red Wine: " + super.toString() + grapes + "/" + alcoholcontent;
    }
}