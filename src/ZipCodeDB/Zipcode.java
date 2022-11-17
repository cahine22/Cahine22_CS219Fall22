package ZipCodeDB;


// hold data about one zipcode

public class Zipcode {
    private String code;
    private String state; // two character code abreviation for the state
    private String city;
    private double log;
    private double lat;
    private int pop;

    public Zipcode(String code, String state, String city, double log, double lat, int pop) {
        this.code = code;
        this.state = state;
        this.city = city;
        this.log = log;
        this.lat = lat;
        this.pop = pop;
    }

    @Override
    public String toString() {
        return "Zipcode{" +
                "code='" + code + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", log=" + log +
                ", lat=" + lat +
                ", pop=" + pop +
                '}';
    }
}
