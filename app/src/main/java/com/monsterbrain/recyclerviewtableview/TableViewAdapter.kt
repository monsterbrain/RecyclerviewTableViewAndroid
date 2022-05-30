package com.monsterbrain.recyclerviewtableview

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

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
        val rowPos = holder.bindingAdapterPosition

        if (rowPos == 0) {
            // Header Cells. Main Headings appear here
            holder.apply {
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

            holder.apply {
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

    inner class RowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtRank: TextView = itemView.findViewById(R.id.txtRank)
        val txtMovieName: TextView = itemView.findViewById(R.id.txtMovieName)
        val txtYear: TextView = itemView.findViewById(R.id.txtYear)
        val txtCost: TextView = itemView.findViewById(R.id.txtCost)
    }
}