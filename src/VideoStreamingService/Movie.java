package src.VideoStreamingService;
//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

public class Movie extends Video{

    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        setRating(rating);
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        String text;
        text="Video's Properties:\n"
                +"Title: "
                +this.getTitle()+"\n"
                + "Duration: "+this.getDuration()+"\n"
                + "Rating: "+this.getRating()+"\n";
        return text;
    }
}
