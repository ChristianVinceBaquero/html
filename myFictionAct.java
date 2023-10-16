public class myFictionAct extends myBookAct {
    public myFictionAct(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        super.price = 24.99;
    }
}
