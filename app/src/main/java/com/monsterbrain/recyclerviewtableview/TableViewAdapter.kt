package com.monsterbrain.recyclerviewtableview

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.table_list_item.view.*

class TableViewAdapter(private val movieList: List<MovieModel>) : RecyclerView.Adapter<TableViewAdapter.RowViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.table_list_item, parent, false)
        return RowViewHolder(itemView)
    }

    private fun setHeaderBg(view: View) {
        view.setBackgroundResource(R.drawable.table_header_cell_bg)
    }

    private fun setContentBg(view: View) {
        view.setBackgroundResource(R.drawable.table_content_cell_bg)
    }

    override fun onBindViewHolder(holder: RowViewHolder, position: Int) {
        val rowPos = holder.adapterPosition

        if (rowPos == 0) {
            // Header Cells. Main Headings appear here
            holder.itemView.apply {
                setHeaderBg(txtRank)
                setHeaderBg(txtMovieName)
                setHeaderBg(txtYear)
                setHeaderBg(txtCost)

                txtRank.text = "Rank"
                txtMovieName.text = "Name"
                txtYear.text = "Year"
                txtCost.text = "Budget (in Millions)"
            }
        } else {
            val modal = movieList[rowPos - 1]

            holder.itemView.apply {
                setContentBg(txtRank)
                setContentBg(txtMovieName)
                setContentBg(txtYear)
                setContentBg(txtCost)

                txtRank.text = modal.rank.toString()
                txtMovieName.text = modal.movieName
                txtYear.text = modal.year.toString()
                txtCost.text = modal.budgetInMillions.toString()
            }
        }
    }

    override fun getItemCount(): Int {
        return movieList.size + 1 // one more to add header row
    }

    inner class RowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}