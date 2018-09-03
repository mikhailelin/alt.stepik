package constructor;
//https://alt.stepik.org/topics/lesson/63564
public class Constructor8 {
}
class Book{
    String title;
    int yearOfPublishing;
    String[] authors;
    public Book(String title, int yearOfPublishing, String[] authors){
        this.title= title;
        this.yearOfPublishing=yearOfPublishing;
        this.authors= new String[authors.length];
        for (int i = 0; i <authors.length ; i++) {
            this.authors[i]=authors[i];
        }
    }
}
