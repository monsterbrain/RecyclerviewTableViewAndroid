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
        recyclerViewMovieList.adapter = TableViewAdapter(
            listOf(
                "Movie Name", "Release Date", "Director", "Story / Screenplay", "Screenplay"
            ),
            pixarMoviesList)
    }

    // source wiki : https://en.wikipedia.org/wiki/List_of_Pixar_films
    // Some details dropped for brevity. Sorry guys
    private val pixarMoviesList = arrayListOf(
        PixarMovieModel(
            "Toy Story",
            "November 22, 1995",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "A Bug's Life",
            "November 25, 1998",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story 2",
            "November 24, 1999",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Monsters, Inc.",
            "November 2, 2001",
            "Pete Docter",
            "Pete Docter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Finding Nemo",
            "May 30, 2003",
            "Andrew Stanton",
            "Andrew Stanton",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story",
            "November 22, 1995",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "A Bug's Life",
            "November 25, 1998",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story 2",
            "November 24, 1999",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Monsters, Inc.",
            "November 2, 2001",
            "Pete Docter",
            "Pete Docter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Finding Nemo",
            "May 30, 2003",
            "Andrew Stanton",
            "Andrew Stanton",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story",
            "November 22, 1995",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "A Bug's Life",
            "November 25, 1998",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story 2",
            "November 24, 1999",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Monsters, Inc.",
            "November 2, 2001",
            "Pete Docter",
            "Pete Docter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Finding Nemo",
            "May 30, 2003",
            "Andrew Stanton",
            "Andrew Stanton",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story",
            "November 22, 1995",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "A Bug's Life",
            "November 25, 1998",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story 2",
            "November 24, 1999",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Monsters, Inc.",
            "November 2, 2001",
            "Pete Docter",
            "Pete Docter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Finding Nemo",
            "May 30, 2003",
            "Andrew Stanton",
            "Andrew Stanton",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story",
            "November 22, 1995",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "A Bug's Life",
            "November 25, 1998",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story 2",
            "November 24, 1999",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Monsters, Inc.",
            "November 2, 2001",
            "Pete Docter",
            "Pete Docter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Finding Nemo",
            "May 30, 2003",
            "Andrew Stanton",
            "Andrew Stanton",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story",
            "November 22, 1995",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "A Bug's Life",
            "November 25, 1998",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story 2",
            "November 24, 1999",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Monsters, Inc.",
            "November 2, 2001",
            "Pete Docter",
            "Pete Docter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Finding Nemo",
            "May 30, 2003",
            "Andrew Stanton",
            "Andrew Stanton",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story",
            "November 22, 1995",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "A Bug's Life",
            "November 25, 1998",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story 2",
            "November 24, 1999",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Monsters, Inc.",
            "November 2, 2001",
            "Pete Docter",
            "Pete Docter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Finding Nemo",
            "May 30, 2003",
            "Andrew Stanton",
            "Andrew Stanton",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story",
            "November 22, 1995",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "A Bug's Life",
            "November 25, 1998",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story 2",
            "November 24, 1999",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Monsters, Inc.",
            "November 2, 2001",
            "Pete Docter",
            "Pete Docter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Finding Nemo",
            "May 30, 2003",
            "Andrew Stanton",
            "Andrew Stanton",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story",
            "November 22, 1995",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "A Bug's Life",
            "November 25, 1998",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story 2",
            "November 24, 1999",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Monsters, Inc.",
            "November 2, 2001",
            "Pete Docter",
            "Pete Docter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Finding Nemo",
            "May 30, 2003",
            "Andrew Stanton",
            "Andrew Stanton",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story",
            "November 22, 1995",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "A Bug's Life",
            "November 25, 1998",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story 2",
            "November 24, 1999",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Monsters, Inc.",
            "November 2, 2001",
            "Pete Docter",
            "Pete Docter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Finding Nemo",
            "May 30, 2003",
            "Andrew Stanton",
            "Andrew Stanton",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story",
            "November 22, 1995",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "A Bug's Life",
            "November 25, 1998",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Toy Story 2",
            "November 24, 1999",
            "John Lasseter",
            "John Lasseter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Monsters, Inc.",
            "November 2, 2001",
            "Pete Docter",
            "Pete Docter",
            "Andrew Stanton"
        ),
        PixarMovieModel(
            "Finding Nemo",
            "May 30, 2003",
            "Andrew Stanton",
            "Andrew Stanton",
            "Andrew Stanton"
        )
    )
}