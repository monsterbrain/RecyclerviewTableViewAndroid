# TableView using Recyclerview (Android)
A sample Android Studio Project showing using a Recyclerview as a Table View.

## Upgraded to Kotlin (38% code reduction :))
### (older java version can be found [here](https://github.com/monsterbrain/RecyclerviewTableViewAndroid/tree/v1.0-java)

## Here's the preview
![TableView Demo Gif](https://github.com/monsterbrain/RecyclerviewTableViewAndroid/blob/master/tableview_demo.gif)

## Code Snippets

Here's the Recyclerview xml in the main layout.

    <!-- Table View-->
    <HorizontalScrollView
      android:layout_width="match_parent"
      android:layout_height="match_parent">

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recyclerViewMovieList"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:nestedScrollingEnabled="false"
        tools:listitem="@layout/table_list_item" />

    </HorizontalScrollView>
    
Here's the Recyclerview Adapter onBinding (all other stuffs are the same)

## Kotlin Version
    val rowPos = holder.adapterPosition

    if (rowPos == 0) {
        // Header Cells. Main Headings appear here
        holder.itemView.apply {
            setHeaderBg(txtMovieName)
            txtMovieName.text = "Name"
        }
    } else {
        val modal = movieList[rowPos - 1]

        holder.itemView.apply {
            setContentBg(txtMovieName)
            txtMovieName.text = modal.movieName
        }
    }

## Java Version

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RowViewHolder rowViewHolder = (RowViewHolder) holder;

        int rowPos = rowViewHolder.getAdapterPosition();

        if (rowPos == 0) {
            // Header Cells. Main Headings appear here
            rowViewHolder.txtRank.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.txtMovieName.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.txtYear.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.txtCost.setBackgroundResource(R.drawable.table_header_cell_bg);

            rowViewHolder.txtRank.setText("Rank");
            rowViewHolder.txtMovieName.setText("Name");
            rowViewHolder.txtYear.setText("Year");
            rowViewHolder.txtCost.setText("Budget (in Millions)");
        } else {
            MovieModal modal = movieList.get(rowPos-1);

            // Content Cells. Content appear here
            rowViewHolder.txtRank.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.txtMovieName.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.txtYear.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.txtCost.setBackgroundResource(R.drawable.table_content_cell_bg);

            rowViewHolder.txtRank.setText(modal.getRank()+"");
            rowViewHolder.txtMovieName.setText(modal.getMovieName());
            rowViewHolder.txtYear.setText(modal.getYear()+"");
            rowViewHolder.txtCost.setText(modal.getBudgetInMillions()+"");
        }
    }

    @Override
    public int getItemCount() {
        return movieList.size()+1; // one more to add header row
    }

# Motivation
While searching for TableView plugins, I found out that many of the Tableviews are really hard to setup and customize.
So had to make one using Recyclerview, for adjusting the row height based on the content text.

# Some Useful Tableview Plugins
[TableRecycleView Plugin by HYY-yu](https://github.com/HYY-yu/TableRecyclerView)
