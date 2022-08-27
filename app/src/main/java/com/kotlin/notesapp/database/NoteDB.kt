package com.kotlin.notesapp.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kotlin.notesapp.data.Note
import android.content.Context
import kotlin.coroutines.coroutineContext


@Database(entities = [Note::class],
    version = 1 , exportSchema = false)


abstract class NoteDB:RoomDatabase(){
    abstract fun getNoteDao(): NoteDAO

    companion object {
        private var INSTACNE:NoteDB?=null
        private val LOCK=Any()

         fun createDatabase(context:Context)= Room.databaseBuilder(
            context,NoteDB::class.java, "Note"
        ).build()

        operator fun invoke(context:Context)= INSTACNE?: synchronized(LOCK){
            INSTACNE?:createDatabase(context).also {
                INSTACNE=it
            }
        }
    }

}

