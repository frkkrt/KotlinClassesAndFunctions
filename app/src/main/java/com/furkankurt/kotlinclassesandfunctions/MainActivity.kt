package com.furkankurt.kotlinclassesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    var name=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
        //mySum(10,20)
        //Return
        val Result= myMultiply(10,20)
        //txtInput.text="Result: ${Result}"

        /*
        button.setOnClickListener {
            println("clicked")
        }
         */
        //Class
        //Object-Instance
        val homer=Simpson("Homer Simpson",50,"Nuclear")
        homer.hairColor="Yellow"

        //homer.age =60
        //homer.job="Nuc"
        //homer.name="Homer"

        println(homer.hairColor)
        //Nullability(Bir şeyin boş olması durumu)
        //Nullable(?) & Non-null
        //!!işareti koyulursa eğer sol taraftaki deger kesinlikle doludur demektir.
        var myString : String? = null
        var myAge:Int? = null
        //(1)Null Safety
        if(myAge!=null)
        {
            println(myAge*10)
        }
        else
        {
            println("my age null")
        }
        //2(safe call)
        println(myAge?.compareTo(2))

        //3(elvis)

        val myResult=myAge?.compareTo(2)?:-100
        println(myResult)

    }
    fun test ()
    {
        println("test function")
    }
    //Input ve Return
    fun mySum(a: Int,b: Int)
    {
        //txtInput.text ="Result: ${a+b}"
    }
    fun myMultiply(x:Int, y:Int) :Int
    {
        return x*y
    }
    fun makeSimpson(view:View)
    {
        name=nameText.text.toString()
        var age=ageText.text.toString().toIntOrNull()
        if(age==null)
        {
            age=0
        }
        val jub=jobText.text.toString()
        val simpson=Simpson(name,age,jub)
        resultText.text="Name: ${simpson.name},Age :${simpson.age}, Job:${simpson.job}"
    }

    fun scopeExample(view : View)
    {
        //Scope(Kapsama)
        println(name)

    }

}