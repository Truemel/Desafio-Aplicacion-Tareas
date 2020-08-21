package cl.desafiolatam.desafiodos.orm

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tareas")
data class Task(@PrimaryKey(autoGenerate = true) @NonNull val id:Short = 0, var homework:String)