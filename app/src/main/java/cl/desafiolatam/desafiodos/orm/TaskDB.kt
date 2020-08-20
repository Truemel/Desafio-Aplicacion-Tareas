package cl.desafiolatam.desafiodos.orm

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Task::class), version = 1, exportSchema = false)
abstract class TaskDB:RoomDatabase() {

    abstract fun getTaskDAO():TaskDAO

    companion object{
        @Volatile
        private var db:TaskDB? = null
        private val DB_NAME:String = "tasks_Database"

        fun getDB(context: Context):TaskDB{
            if(db != null)
                return db!!

            synchronized(this){
                db = Room.databaseBuilder(context.applicationContext, TaskDB::class.java, DB_NAME).build()
                return db!!
            }
        }
    }

}