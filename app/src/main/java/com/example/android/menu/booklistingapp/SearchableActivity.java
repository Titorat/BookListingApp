package com.example.android.menu.booklistingapp;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.support.v7.widget.SearchView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by tito rat on 5/23/2017.
 */

public class SearchableActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView    searchView    =  (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(false);
        return true;
    }
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);


        Intent intent = getIntent();
        if(Intent.ACTION_SEARCH.equals(intent.getAction())){

            String query = intent.getStringExtra(SearchManager.QUERY);

            ListView listView = (ListView) findViewById(R.id.list);

            ArrayList<Books> books = QueryUtils.fetchBooksData();

           final BookAdapter bookAdapter = new BookAdapter(this,books);

           listView.setAdapter(bookAdapter);







        }
    }
    @Override
    protected void onNewIntent (Intent intent) {
        super.onNewIntent(intent);
       if (Intent.ACTION_SEARCH.equals(intent.getAction())){

            String query = intent.getStringExtra(SearchManager.QUERY);
           ListView listView = (ListView) findViewById(R.id.list);

           ArrayList<Books> books = QueryUtils.fetchBooksData();

           final BookAdapter bookAdapter = new BookAdapter(this,books);

           listView.setAdapter(bookAdapter);

            listView.requestFocus();

        }
    }

}

