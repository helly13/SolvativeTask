package com.example.solvative.DB;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {User.class},version = 1)
public abstract class databse extends RoomDatabase {

    public abstract UserDAO userDAO();
    public static databse INSTANCE;
    public static databse getDbInstance(Context context)
    {
        if(INSTANCE==null)
        {
            INSTANCE= Room.databaseBuilder(context.getApplicationContext(),databse.class,"Userdb")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }
}
