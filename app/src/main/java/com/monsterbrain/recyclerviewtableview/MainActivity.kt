package com.monsterbrain.recyclerviewtableview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewMovieList.layoutManager = LinearLayoutManager(this)
        recyclerViewMovieList.adapter = TableViewAdapter(movieList)
    }

    // src Wikipedia
    private val movieList = ArrayList<MovieModel>().apply {
        add(MovieModel(1, "Pirates of the Caribbean: On Stranger Tides", 2011, 378))
        add(MovieModel(2, "Avengers: Age of Ultron", 2015, 365))
        add(MovieModel(3, "Avengers: Infinity War", 2018, 316))
        add(MovieModel(4, "Pirates of the Caribbean: At World's End", 2007, 300))
        add(MovieModel(5, "Justice League", 2017, 300))
        add(MovieModel(6, "Solo: A Star Wars Story", 2018, 275))
        add(MovieModel(7, "John Carter", 2012, 264))
        add(MovieModel(8, "Batman v Superman: Dawn of Justice", 2016, 263))
        add(MovieModel(9, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(9, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(9, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(9, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(9, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(9, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(9, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(9, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(9, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(9, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(10, "Tangled", 2010, 260))
        add(MovieModel(10, "Tangled", 2010, 260))
        add(MovieModel(10, "Tangled", 2010, 260))
        add(MovieModel(10, "Tangled", 2010, 260))
        add(MovieModel(10, "Tangled", 2010, 260))
        add(MovieModel(10, "Tangled", 2010, 260))
        add(MovieModel(10, "Tangled", 2010, 260))
        add(MovieModel(10, "Tangled", 2010, 260))
        add(MovieModel(10, "Tangled", 2010, 260))
    }
}