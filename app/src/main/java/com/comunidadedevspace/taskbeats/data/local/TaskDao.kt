package com.comunidadedevspace.taskbeats.data.local

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TaskDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(task: Task)

    @Query("Select * from task")
    fun getAll(): LiveData<List<Task>>

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(task: Task)

    //Delete todos
    @Query("Delete from task")
    suspend fun deleteAll()

    //Delete pelo id
    @Query("Delete from task where id =:id")
    suspend fun deleteById(id: Int)

}