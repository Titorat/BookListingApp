package com.example.android.menu.booklistingapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

/**
 * Created by tito rat on 6/2/2017.
 */

public class BookAdapter extends ArrayAdapter<Books> {

    public BookAdapter(Activity context, ArrayList<Books> data ){
        super(context,0,data);
    }

    @Override
    @Nullable
    public View getView(int position,@Nullable View convertView, ViewGroup parent){
        View searchItemView = convertView;
        if(searchItemView==null){
            searchItemView= LayoutInflater.from(getContext()).inflate(R.layout.custom_search_item,parent,false);

        }
        Books currentObject = getItem(position);

        TextView mtitle = (TextView) searchItemView.findViewById(R.id.title);
        mtitle.setText(String.valueOf( currentObject.getTitle()));

        TextView msubtitle = (TextView) searchItemView.findViewById(R.id.subtitle);
        msubtitle.setText(String.valueOf( currentObject.getSubtitle()));

        TextView mdescription = (TextView) searchItemView.findViewById(R.id.description);
        mdescription.setText(String.valueOf( currentObject.getDescription()));

        ImageView mImageView = (ImageView) searchItemView.findViewById(R.id.Thumbnail);
        Picasso.with(getContext())
                .load(currentObject.getImageUrl())
                .resize(200, 240)
                .into(mImageView);




        return searchItemView;
    }
}
