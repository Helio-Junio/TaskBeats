package com.comunidadedevspace.taskbeats.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TaskDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(task: Task)

    @Query("Select * from task")
    fun getAll(): LiveData<List<Task>>

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(task: Task)

    //Delete todos
    @Query("Delete from task")
    fun deleteAll()

    //Delete pelo id
    @Query("Delete from task where id =:id")
    fun deleteById(id: Int)

}