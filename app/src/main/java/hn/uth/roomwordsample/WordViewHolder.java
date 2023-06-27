package hn.uth.roomwordsample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class WordViewHolder extends RecyclerView.ViewHolder {
    private final TextView wordItemView;
    private TextView sentenceTextView;


    private WordViewHolder(View itemView) {
        super(itemView);
        wordItemView = itemView.findViewById(R.id.textViewWord);
        sentenceTextView = itemView.findViewById(R.id.textViewSentence);
    }

    public void bind(Word word) {
        wordItemView.setText(word.getWord());
        sentenceTextView.setText(word.getSentence());
    }

    static WordViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new WordViewHolder(view);
    }
}
