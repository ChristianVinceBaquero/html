public class myUseBookAct{
    public static void main(String[] args){
        myFictionAct fictionBook = new myFictionAct("War and Peace by Leo Tolstoy");
        myNonFictionAct nonFictionBook = new myNonFictionAct("Thinking, Fast and Slow by Daniel Kahneman");

        System.out.println("Fiction Book Title: " + fictionBook.getTitle());
        System.out.println("Fiction Book Price: $" + fictionBook.getPrice());

        System.out.println("NonFiction Book Title: " + nonFictionBook.getTitle());
        System.out.println("NonFiction Book Price: $" + nonFictionBook.getPrice());
    }
}
