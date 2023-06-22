import diaryAPP.Diary;
import diaryAPP.Entry;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    Diary diary;
    @BeforeEach void setUp() {
        diary= new Diary("username", "password");
    }
    @Test void createDiary(){
        diary.createDiary("uche");
        assertTrue(diary.createEntry());
    }
    @Test void checkIfDiaryExisting(){
        diary.diaryExisting("1111");
        assertTrue(diary.createEntry());
    }
    @Test void diaryIsNotNull() {
        assertNotNull(diary);
    }
    @Test void wrongPasswordWillNotOpenDiary(){
        diary.unlockDiary("passingWord");
        assertTrue(diary.getIsLocked());
    }
    @Test void toUnlockDiary(){
        diary.unlockDiary("password");
        assertFalse(diary.getIsLocked());
    }
    @Test void toLockDiary() {
        diary.lockDiary();
        assertTrue(diary.getIsLocked());
    }
    @Test void toCreateEntry(){
        diary.getEntries();
        assertTrue(diary.createEntry("topic","body"));
    }
    @Test void toDeleteEntry(){
        diary.deleteEntry();
        assertTrue(diary.deleteEntry());
    }
    @Test void toUpdateEntry(){
        diary.getEntries();
        assertNotEquals("id","topic","body");
    }
    @Test void toSetLoked(){
        diary.setLocked();
        assertTrue(diary.setLocked());
    }
    @Test void toSetUsername(){
        diary.setUsername("username");
        assertNotNull("username", "message");
    }
    @Test void toSetPassword(){
        diary.setPassword("password");
        assertNotNull(diary.getIsLocked());
    }
    @Test void toSetEntries(){
        LocalDateTime dateTime = LocalDateTime.of(2023, 6, 21, 9, 30);
        Entry entries = new Entry(1, "Java",
                "Hey", dateTime);
        ;
        diary.setEntries(entries);
        assertNull(diary.getEntries());
    }

}

