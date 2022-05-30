package com.monsterbrain.recyclerviewtableview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerViewMovieList = findViewById<RecyclerView>(R.id.recyclerViewMovieList)
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
        add(MovieModel(10, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(11, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(12, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(13, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(14, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(15, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(16, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(17, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(18, "Star Wars: The Last Jedi", 2017, 263))
        add(MovieModel(19, "Tangled", 2010, 260))
        add(MovieModel(20, "Tangled", 2010, 260))
        add(MovieModel(21, "Tangled", 2010, 260))
        add(MovieModel(22, "Tangled", 2010, 260))
        add(MovieModel(23, "Tangled", 2010, 260))
        add(MovieModel(24, "Tangled", 2010, 260))
        add(MovieModel(25, "Tangled", 2010, 260))
        add(MovieModel(26, "Tangled", 2010, 260))
        add(MovieModel(27, "Tangled", 2010, 260))
    }
}