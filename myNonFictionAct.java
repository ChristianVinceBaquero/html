public class myNonFictionAct extends myBookAct {
    public myNonFictionAct(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        super.price = 37.99;
    }
}
