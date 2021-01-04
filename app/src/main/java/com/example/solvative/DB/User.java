package com.example.solvative.DB;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name="firstName")
    public String fname;

    @ColumnInfo(name="lastName")
    public String lname;

    @ColumnInfo(name="email")
    public String email;

    @ColumnInfo(name="avtar")
    public String url;
}
