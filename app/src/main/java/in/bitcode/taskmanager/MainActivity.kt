
package `in`.bitcode.taskmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView

    private lateinit var imgAddText : ImageView
    lateinit var txtAddText :EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.customviewlayout)

        recyclerView = findViewById(R.id.recyclerView)
        imgAddText = findViewById(R.id.imageBtn)
        txtAddText = findViewById(R.id.txtAddText)

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        var data = ArrayList<String>()


        val adapter = TaskAdapter(data)
        recyclerView.adapter = adapter

        imgAddText.setOnClickListener{
            data.add(txtAddText.text.toString())
            adapter.notifyDataSetChanged()

            txtAddText.setText("")
        }
    }

    }
