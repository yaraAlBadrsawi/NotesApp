package com.kotlin.notesapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
@Entity
data class Note(

    @PrimaryKey(autoGenerate = true)
    var noteId:Int,
    var title:String,
    var content:String,
    var date:String,
    var color:Int=-1):Serializable {


}