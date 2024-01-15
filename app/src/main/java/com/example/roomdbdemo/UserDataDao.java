package com.example.roomdbdemo;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDataDao {
    @Query("Select * from UserData")
    List<userData> getAllUserData();

    @Insert
    void addData(userData userData);

    @Update
    void updateData(userData userData);

    @Delete
    void deleteData(userData userData);
}
