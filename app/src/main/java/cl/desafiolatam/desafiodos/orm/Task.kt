package cl.desafiolatam.desafiodos.orm

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tareas")
class Task(@PrimaryKey(autoGenerate = true) @NonNull val id:Short, val homework:String) {
}