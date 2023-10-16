public abstract class myBookAct {
    private String title;
    double price;

    public myBookAct(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();
}
