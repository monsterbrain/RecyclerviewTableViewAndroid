package com.safecare.recyclerviewtableview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewDeliveryProductList);

        TableViewAdapter adapter = new TableViewAdapter(getMovieList());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(adapter);
    }

    private List<MovieModal> getMovieList() {
        List<MovieModal> movieList = new ArrayList<>();
        // src Wikipedia
        movieList.add(new MovieModal(1, "Pirates of the Caribbean: On Stranger Tides", 2011, 378));
        movieList.add(new MovieModal(2, "Avengers: Age of Ultron", 2015, 365));
        movieList.add(new MovieModal(3, "Avengers: Infinity War", 2018, 316));
        movieList.add(new MovieModal(4, "Pirates of the Caribbean: At World's End", 2007, 300));
        movieList.add(new MovieModal(5, "Justice League", 2017, 300));
        movieList.add(new MovieModal(6, "Solo: A Star Wars Story", 2018, 275));
        movieList.add(new MovieModal(7, "John Carter", 2012, 264));
        movieList.add(new MovieModal(8, "Batman v Superman: Dawn of Justice", 2016, 263));
        movieList.add(new MovieModal(9, "Star Wars: The Last Jedi", 2017, 263));
        movieList.add(new MovieModal(9, "Star Wars: The Last Jedi", 2017, 263));
        movieList.add(new MovieModal(9, "Star Wars: The Last Jedi", 2017, 263));
        movieList.add(new MovieModal(9, "Star Wars: The Last Jedi", 2017, 263));
        movieList.add(new MovieModal(9, "Star Wars: The Last Jedi", 2017, 263));
        movieList.add(new MovieModal(9, "Star Wars: The Last Jedi", 2017, 263));
        movieList.add(new MovieModal(9, "Star Wars: The Last Jedi", 2017, 263));
        movieList.add(new MovieModal(9, "Star Wars: The Last Jedi", 2017, 263));
        movieList.add(new MovieModal(9, "Star Wars: The Last Jedi", 2017, 263));
        movieList.add(new MovieModal(9, "Star Wars: The Last Jedi", 2017, 263));
        movieList.add(new MovieModal(10, "Tangled", 2010, 260));
        movieList.add(new MovieModal(10, "Tangled", 2010, 260));
        movieList.add(new MovieModal(10, "Tangled", 2010, 260));
        movieList.add(new MovieModal(10, "Tangled", 2010, 260));
        movieList.add(new MovieModal(10, "Tangled", 2010, 260));
        movieList.add(new MovieModal(10, "Tangled", 2010, 260));
        movieList.add(new MovieModal(10, "Tangled", 2010, 260));
        movieList.add(new MovieModal(10, "Tangled", 2010, 260));
        movieList.add(new MovieModal(10, "Tangled", 2010, 260));

        return movieList;
    }
}
