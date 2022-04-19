package `in`.bitcode.taskmanager

import android.icu.text.Transliterator.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class  TaskAdapter (private val List : ArrayList<String>): RecyclerView.Adapter<TaskAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.taskmanager , parent,false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: TaskAdapter.ViewHolder, position: Int) {
        val itemView = List[position]

        holder.textView.setText(itemView)
    }

    override fun getItemCount(): Int {
        return List.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){
        var textView: TextView
        init {
            textView = itemView.findViewById(R.id.txtTitle)
        }

    }    }


