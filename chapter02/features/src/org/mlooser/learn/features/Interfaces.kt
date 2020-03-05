package org.mlooser.learn.features

import java.io.InputStream
import java.io.OutputStream

interface Document {
    val size: Long
    val version: Long

    val name: String
        get() = "NoName"

    fun save(input:InputStream)
    fun load(stream:OutputStream)

    fun getDescription() : String{
        return "Document $name, version $version, size $size"
    }
}

class MyDocument (override val name : String, override val version : Long ): Document{
    override val  size: Long
        get() = 10

    override fun save(input: InputStream) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun load(stream: OutputStream) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main(){
    val myDoc = MyDocument("My cool dock", 123)
    println( myDoc.getDescription() )
}