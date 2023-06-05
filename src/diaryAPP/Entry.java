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

    public Entry(int id, String title, String body){

    }
}
