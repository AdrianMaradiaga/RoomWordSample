package hn.uth.roomwordsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

public class NewWordActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.wordlistsql.REPLY";
    public static final String EXTRA_REPLY_SENTENCE = "com.example.android.wordlistsql.REPLY_SENTENCE";

    private EditText mEditWordView;
    private EditText mEditSentenceView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);
        mEditWordView = findViewById(R.id.edit_word);
        mEditSentenceView = findViewById(R.id.edit_sentence);

        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener(view -> {
            Intent replyIntent = new Intent();
            if (TextUtils.isEmpty(mEditWordView.getText())) {
                setResult(RESULT_CANCELED, replyIntent);
            } else {
                String word = mEditWordView.getText().toString();
                String sentence = mEditSentenceView.getText().toString(); // Agregar esta línea para obtener el valor de la oración
                replyIntent.putExtra(EXTRA_REPLY, word);
                replyIntent.putExtra(EXTRA_REPLY_SENTENCE, sentence); // Agregar esta línea para incluir la oración en el Intent de respuesta
                setResult(RESULT_OK, replyIntent);
            }
            finish();
        });

    }
}