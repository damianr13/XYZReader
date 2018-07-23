package com.example.xyzreader.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xyzreader.R;

import java.util.List;

/**
 * Created by robert_damian on 23.07.2018.
 */

public class ParagraphViewAdapter extends RecyclerView.Adapter<ParagraphViewAdapter.MyViewHolder> {

    private List<String> mParagraphs;
    private Context mContext;

    public ParagraphViewAdapter(Context context, List<String> paragraphs) {
        this.mParagraphs = paragraphs;
        this.mContext = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(
                R.layout.article_body_paragraph, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.setText(mParagraphs.get(position));
    }

    @Override
    public int getItemCount() {
        if (mParagraphs == null) {
            return 0;
        }

        return mParagraphs.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        MyViewHolder(View itemView) {
            super(itemView);
        }

        void setText(String text) {
            ((TextView) itemView).setText(text);
        }
    }
}
