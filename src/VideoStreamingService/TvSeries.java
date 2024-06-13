package src.VideoStreamingService;
//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

public class TvSeries extends Video{
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        setEpisodes(episodes);
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        String text;
        text="Video's Properties:\n"
                +"Title: "
                +this.getTitle()+"\n"
                + "Duration: "+this.getDuration()+"\n"
                + "Episodes: "+this.getEpisodes()+"\n";
        return text;
    }
}
