package com.example.navigationcomponentex

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView


class TodoListAdapter (val data: MutableList<String>): RecyclerView.Adapter<TodoListAdapter.TodoItemViewHolder>(){
    class TodoItemViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView){
        private lateinit var task: String

        init {
            itemView.setOnClickListener {
                val action = ListFragmentDirections.actionListFragmentToTaskDetailFragment(task)
                Navigation.findNavController(itemView).navigate(action)


            }
        }
        fun bind(task: String)
        {
            this.task = task
            val taskname = itemView.findViewById<TextView>(R.id.taskname)
            val desc = itemView.findViewById<TextView>(R.id.description)
            taskname.text = task
            desc.text = "to be completed"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.listitem_view,
            parent, false)
        return TodoItemViewHolder(layout)
    }

    override fun onBindViewHolder(holder: TodoItemViewHolder, position: Int) {
        holder.bind(data.get(position))
    }

    override fun getItemCount(): Int {
        return data.size
    }
}