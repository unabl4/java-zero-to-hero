package ee.itcollage.level12;

public class Car {

    private String model;
    private boolean electric;
    private Double userRating;
    private Integer cost;

    private String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    public boolean isElectric() {
        return electric;
    }

    void setElectric(boolean electric) {
        this.electric = electric;
    }

    public Double getUserRating() {
        return userRating;
    }

    void setUserRating(Double userRating) {
        this.userRating = userRating;
    }

    Integer getCost() {
        return cost;
    }

    void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.model;
    }
}
