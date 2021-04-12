package l5hac2;

public class Book {

    private String author;
    private String chapterNames [] = new String[100];
    
    Book(){
        
    }
    Book(String A, String chaps[]){
        this.chapterNames = chaps;
        this.author = A;
    }
    public void set_author(String A){
        this.author = A;
    }
    public void set_chaps(String chaps[]){
        this.chapterNames = chaps; 
    }
    public String get_author(){
        return author;
    }
    public String[] get_chaps(){
        return chapterNames;
    }
    public void compareBooks(Book first, Book second){
        if(first.get_author()==second.get_author()){
            System.out.println("Equal");
        }
        
    }
    public void compareChapters(Book first, Book second){
        if(first.get_chaps()==second.get_chaps()){
            System.out.println("");
        }
        
    }
}
