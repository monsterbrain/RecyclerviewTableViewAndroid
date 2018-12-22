package com.safecare.recyclerviewtableview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TableViewAdapter extends RecyclerView.Adapter {
    List<MovieModal> movieList;

    public TableViewAdapter(List<MovieModal> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.table_list_item, parent, false);

        return new RowViewHolder(itemView);
    }

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

    public class RowViewHolder extends RecyclerView.ViewHolder {
        protected TextView txtRank;
        protected TextView txtMovieName;
        protected TextView txtYear;
        protected TextView txtCost;

        public RowViewHolder(View itemView) {
            super(itemView);

            txtRank = itemView.findViewById(R.id.txtRank);
            txtMovieName = itemView.findViewById(R.id.txtMovieName);
            txtYear = itemView.findViewById(R.id.txtYear);
            txtCost = itemView.findViewById(R.id.txtCost);
        }
    }
}
