package javaPractice.exception;

public class Address {
    private String state;
    private String city;
    private int plot;

    public Address(String state,String city,int plot)
    {
        this.state=state;
        this.city=city;
        this.plot=plot;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public int getPlot() {
        return plot;
    }
}
