package cl.desafiolatam.desafiodos.task

import cl.desafiolatam.desafiodos.orm.Task

interface OnItemClickListener {
    fun onItemClick(taskItem: Task)
}