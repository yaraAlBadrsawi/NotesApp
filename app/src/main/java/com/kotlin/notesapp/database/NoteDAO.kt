package com.kotlin.notesapp.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.kotlin.notesapp.data.Note

@Dao
interface NoteDAO {

@Insert(onConflict = OnConflictStrategy.IGNORE)
suspend fun addNote(note:Note)
@Update
suspend fun updateNote(note:Note)

@Query("SELECT * FROM NOTE ORDER BY noteId DESC ")
fun getAllNote():LiveData<List<Note>>

@Query("SELECT * FROM NOTE WHERE title LIKE :query OR content LIKE :query OR date LIKE :query ORDER BY noteID DESC")
fun search(query: Query):LiveData<List<Note>>

@Delete
suspend fun deleteNote(note:Note)

}