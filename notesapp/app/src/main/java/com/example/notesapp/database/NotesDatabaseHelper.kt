package com.example.notesapp.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns._ID

class NotesDatabaseHelper(
    context: Context,
) : SQLiteOpenHelper(context, DATABASE_NAME, null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("""CREATE TABLE $TABLE_NOTES
                ($_ID INTEGER NOT NULL PRIMARY KEY,
                $TITLE_NOTES TEXT NOT NULL,
                $DESCRIPTION_NOTES TEXT NOT NULL)
            """.trimMargin().trim())
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

    companion object{
        val DATABASE_NAME = "notes.db"
        val TABLE_NOTES = "Notes"
        val TITLE_NOTES = "title"
        val DESCRIPTION_NOTES = "description"
    }
}