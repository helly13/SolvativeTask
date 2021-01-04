package com.example.solvative.DB;


import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDAO {

    @Query("Select * from User")
    List<User> getAllUser();
}
