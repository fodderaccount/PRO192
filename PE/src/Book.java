public class Book {
    public Book() {
    }
    String title;
    int price;
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }
    public String getTitle() {
        return title.toUpperCase();
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}
