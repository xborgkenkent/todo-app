package com.example.todo_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var todo_recyclerview: RecyclerView?=null

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        todo_recyclerview = findViewById(R.id.todo_recyclerview)
        todo_recyclerview?.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val todoList = ArrayList<TodoClass>()

        todoList.add(TodoClass("Title1", "Note1"))
        todoList.add(TodoClass("Title2", "Note2"))
        todoList.add(TodoClass("Title3", "Note3"))
        todoList.add(TodoClass("Title4", "Note4"))

        val adapter = TodoAdapter(this, todoList)
        todo_recyclerview?.adapter = adapter

    }
}