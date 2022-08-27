package com.kotlin.notesapp.data.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kotlin.notesapp.data.Note
import com.kotlin.notesapp.repository.NoteRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NoteViewModel(private val repository: NoteRepository) : ViewModel() {

    fun saveNote(note: Note) =
        viewModelScope.launch(Dispatchers.IO) {
            repository.addNote(note)
        }

    fun updateNote(note: Note) =
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateNote(note)
        }

    fun deleteNote(note: Note) =
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteNote(note)
        }

    fun searchNote(query: String): LiveData<List<Note>> =
        repository.searchNote(query)

    fun getAllNotes(): LiveData<List<Note>> =
        repository.getAllNote()


}