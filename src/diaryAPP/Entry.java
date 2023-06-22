package diaryAPP;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;
    private   String body;
    private LocalDateTime dateCreated;
    public void setId(){

    }
    public String getTitle(){
        return title;
    }
    public String getBody(){
        return body;
    }

//    public Entry(int id, String title, String body, LocalDateTime dateCreated){
//        this
//
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Entry(int id, String title, String body, LocalDateTime dateCreated) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateCreated = dateCreated;
    }
}
