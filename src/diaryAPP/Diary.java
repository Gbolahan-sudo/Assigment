package diaryAPP;

import java.util.List;

public class Diary {
    private boolean isLocked;
    private String username;
    private String password;
    private int deleteEntry;
    private void createEntry() {
    }
    private List<Entry> entries;



    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void unlockDiary(String password) {
        if (this.password.equals(password)) {
            isLocked = false;
        } else {
            isLocked = true;
        }
    }

    public void lockDiary() {
        isLocked = true;
    }
    public boolean getIsLocked() {
        return isLocked;
    }

    public boolean createEntry(String topic, String body) {
        return true;
    }

    public boolean deleteEntry() {
        return true;
    }

    public void updateEntry(int id, String topic, String body) {
    }

    public boolean setLocked(){
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String setPassword(String password) {
        this.password = password;
        return this.password;

    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void updateEntry() {
    }


    //    public void username(String username,String password) {
//        this.username = username;
//        isLocked = true;
//    }
//    public String getName() {
//        return username;
//    }
//
//    public boolean isLocked() {
//        return isLocked;
//    }
//
//    public void setLocked(boolean locked) {
//        this.isLocked = locked;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}
