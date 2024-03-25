package com.monsterbrain.recyclerviewtableview

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class TableViewAdapter(
    private val headerList: List<String>,
    private val movieList: List<PixarMovieModel>
) : RecyclerView.Adapter<TableViewAdapter.RowViewHolder>() {

    private val isMerged = false

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.table_list_item, parent, false)
        return RowViewHolder(itemView)
    }

    private fun View.setHeaderBg() {
        setBackgroundResource(R.drawable.table_header_cell_bg)
    }

    private fun View.setContentBg() {
        setBackgroundResource(R.drawable.table_content_cell_bg)
    }

    override fun onBindViewHolder(holder: RowViewHolder, position: Int) {
        val rowPos = holder.bindingAdapterPosition

        if (rowPos == 0) {
            // Header Cells. Main Headings appear here
            holder.apply {
                setHeaderStyle()
                if (!isMerged) {
                    // make this header cell width = cell width + next cell width ..
                    val params = txtStoryWriter.layoutParams
                    params.width = params.width + txtScreenplayWriter.layoutParams.width
                    txtStoryWriter.layoutParams = params
                    // and hide the next cell to merge them
                    txtScreenplayWriter.visibility = View.GONE
                    isMerged = true
                }

                txtMovieName.text = headerList[0]
                txtReleaseDate.text = headerList[1]
                txtDirector.text = headerList[2]
                txtStoryWriter.text = headerList[3]
                txtScreenplayWriter.text = headerList[4]
            }
        } else {
            val model = movieList[rowPos - 1]

            holder.apply {
                setContentStyle()

                if (isMerged) {
                    // in case this is a merged cell, unmerge this
                    txtScreenplayWriter.visibility = View.VISIBLE

                    // in case this is a merged cell, unmerge this
                    val params = txtStoryWriter.layoutParams
                    params.width -= txtScreenplayWriter.layoutParams.width
                    txtStoryWriter.layoutParams = params
                    isMerged = false
                }


                txtMovieName.text = model.name
                txtReleaseDate.text = model.releaseDate
                txtDirector.text = model.director
                txtStoryWriter.text = model.story
                txtScreenplayWriter.text = model.screenplay
            }
        }
    }

    override fun getItemCount(): Int {
        return movieList.size + 1 // one more to add header row
    }

    inner class RowViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var isMerged = false

        val txtMovieName: TextView = itemView.findViewById(R.id.txtMovieName)
        val txtReleaseDate: TextView = itemView.findViewById(R.id.txtReleaseDate)
        val txtDirector: TextView = itemView.findViewById(R.id.txtDirector)
        val txtStoryWriter: TextView = itemView.findViewById(R.id.txtStoryWriter)
        val txtScreenplayWriter: TextView = itemView.findViewById(R.id.txtScreenplayWriter)

        private fun allCells() = listOf(txtMovieName, txtReleaseDate, txtDirector, txtStoryWriter, txtScreenplayWriter)

        fun setHeaderStyle() {
            allCells().forEach {
                it.setHeaderBg()
            }
        }

        fun setContentStyle() {
            allCells().forEach {
                it.setContentBg()
            }
        }
    }
}