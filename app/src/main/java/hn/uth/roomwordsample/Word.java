package hn.uth.roomwordsample;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    @NonNull
    @ColumnInfo(name = "sentence")
    private String mSentence;

    public Word(@NonNull String word, String sentence) {
        this.mWord = word;
        this.mSentence = sentence;
    }

    public String getWord(){
        return this.mWord;
    }

    public String getSentence() {
        return this.mSentence;
    }
}
