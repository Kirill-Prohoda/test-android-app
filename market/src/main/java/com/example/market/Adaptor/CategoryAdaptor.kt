package com.example.market.Adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.market.Domain.CategoryDomain
import com.example.market.R


class CategoryAdaptor(private val categoryDomain: ArrayList<CategoryDomain>) :
    RecyclerView.Adapter<CategoryAdaptor.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var categoryName: TextView
        lateinit var categoryPic: ImageView;
        lateinit var categoryMain: ConstraintLayout

        init {
            // Define click listener for the ViewHolder's View.
            categoryName = view.findViewById(R.id.categoryName)
            categoryPic = view.findViewById(R.id.categoryPic)
            categoryMain = view.findViewById(R.id.categoryMain)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.recyclerview_item, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        holder.categoryName.text = categoryDomain[position].name

        var picUrl = ""

        when (position) {
            0 -> {
                picUrl = "cat_1"
                holder.categoryMain.background =
                    ContextCompat.getDrawable(holder.itemView.context, R.drawable.cat_background1)
            }
            1 -> {
                picUrl = "cat_2"
                holder.categoryMain.background =
                    ContextCompat.getDrawable(holder.itemView.context, R.drawable.cat_background2)
            }
            2 -> {
                picUrl = "cat_3"
                holder.categoryMain.background =
                    ContextCompat.getDrawable(holder.itemView.context, R.drawable.cat_background3)
            }
        }
        var drawableResourceId =
            holder.itemView.context.resources.getIdentifier(
                picUrl,
                "drawable",
                holder.itemView.context.packageName
            )

//        Glide загрузка

    }
    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = categoryDomain.size

}