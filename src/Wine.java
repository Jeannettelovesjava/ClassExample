/**
 * Created by Grand Circus Student on 7/24/2017.
 */
public class Wine {

    private String grapes;
    private int calories;
    private double alcoholcontent;

    public static int count = 0;

    public Wine() {
        String grapes;
        grapes = "";
        calories = Integer.parseInt("");
        alcoholcontent = ();
    }

    public Wine(String grapes, int calories, double alcoholcontent) {
        count++;

        this.grapes = grapes;
        this.calories = calories;
        this.alcoholcontent = alcoholcontent;
        alcoholcontent = ();
    }

    public String getGrapes() {
        return grapes;
    }

    public void setGrapes(String grapes) {
        this.grapes = grapes;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getAlcoholcontent() {
        return alcoholcontent;
    }

    public void setAlcoholcontent(double alcoholcontent) {
        this.alcoholcontent = alcoholcontent;
    }

    @Override
    public String toString() {
        return calories + ", " + grapes
                + "(" + alcoholcontent + ") ";
    }
}

