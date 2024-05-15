package entity;

public class ObservationFilter {
    public int priorDays;
    public int postDays;

    public int getPriorDays() {
        return priorDays;
    }

    public void setPriorDays(int priorDays) {
        this.priorDays = priorDays;
    }

    public int getPostDays() {
        return postDays;
    }

    public void setPostDays(int postDays) {
        this.postDays = postDays;
    }
}
