package assignmentbuoi10;

public class News implements INews {
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float  AverrageRate;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void setAverrageRate(float averrageRate) {
        AverrageRate = averrageRate;
    }
    @Override
    public void display() {
        System.out.println(Title);
        System.out.println(PublishDate);
        System.out.println(Author);
        System.out.println(Author);
        System.out.println(AverrageRate);
    }

    int [] RateList = new int[3];
    public float Calculate( int x,int y,int z ) {
        float a = (float) (x+y+z) / 3;
        return a;
    }
}
