package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

const   val KEY_1="name"
const   val KEY_2="age"
const   val KEY_3="isStudent"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener{
            val a= Intent(this,MainActivity2::class.java)
             startActivity(a)


        }
       button2.setOnClickListener{
           val i= Intent(this,MainActivity2::class.java)


           i.putExtra(KEY_1,"PULKIT")
           i.putExtra(KEY_2,20)
           i.putExtra(KEY_3,false)
           startActivity(i)
       }
       button3.setOnClickListener{
           val email=editTextTextPersonName.text.toString()
           val i=Intent()
           i.action=Intent.ACTION_SENDTO
           i.data= Uri.parse("mailto:$email")
           i.putExtra(Intent.EXTRA_SUBJECT,"Implicit Intents")
           startActivity(i)
       }
       button4.setOnClickListener{
           val address=editTextTextPersonName.text.toString()
           val i=Intent()
           i.action=Intent.ACTION_VIEW
           i.data= Uri.parse("http://$address")
           i.putExtra(Intent.EXTRA_SUBJECT,"Implicit Intents")
           startActivity(i)
       }
       button5.setOnClickListener{
           val mobile=editTextTextPersonName.text.toString()
           val i=Intent()
           i.action=Intent.ACTION_VIEW
           i.data= Uri.parse("tel:$mobile")
           i.putExtra(Intent.EXTRA_SUBJECT,"Implicit Intents")
           startActivity(i)
       }
    }
}