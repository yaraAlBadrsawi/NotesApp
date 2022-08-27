package com.kotlin.notesapp.repository

import androidx.room.Query
import com.kotlin.notesapp.data.Note
import com.kotlin.notesapp.database.NoteDB

class NoteRepository(private val db: NoteDB) {

    fun getAllNote()=db.getNoteDao().getAllNote()

    fun searchNote(query: String)=db.getNoteDao().search(query)

    suspend fun addNote(note: Note)=db.getNoteDao().addNote(note)

    suspend fun updateNote(note:Note)=db.getNoteDao().updateNote(note)

    suspend fun deleteNote(note:Note)=db.getNoteDao().updateNote(note)




}