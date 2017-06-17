package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ankit on 26-12-2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {
private int mcatageryColorID;


        public WordAdapter(Context context, ArrayList<Word> objects,int catageryColorID) {
            super(context, 0, objects);
            mcatageryColorID = catageryColorID;


        }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Word currentWord = getItem(position);

        if (currentWord.hasmresourceId()) {


            TextView textView = (TextView) listItemView.findViewById(R.id.text_view1);

            textView.setText(currentWord.getmMiwok());

            TextView textView1 = (TextView) listItemView.findViewById(R.id.text_view2);

            textView1.setText(currentWord.getmEnglish());


            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
            imageView.setImageResource(currentWord.getmresourceId());


            imageView.setVisibility(View.VISIBLE);
        }

        if (!currentWord.hasmresourceId()){

            TextView textView = (TextView) listItemView.findViewById(R.id.text_view1);

            textView.setText(currentWord.getmMiwok());

            TextView textView1 = (TextView) listItemView.findViewById(R.id.text_view2);

            textView1.setText(currentWord.getmEnglish());

            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
            imageView.setImageResource(currentWord.getmresourceId());

            imageView.setVisibility(View.GONE);




        }

        View linearLayout = listItemView.findViewById(R.id.text_container);

        int color= ContextCompat.getColor(getContext(),mcatageryColorID);

        linearLayout.setBackgroundColor(color);

        return listItemView;

        }




}

