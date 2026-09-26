package ch.zhaw.avalanger.model;

public class Avalange {
    private String country;
    private String state;
    private String description;

    public Avalange(String country, String state, String description) {
        this.country = country;
        this.state = state;
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
