package com.example.roomdbdemo;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = userData.class, exportSchema = false, version = 1)
public abstract class DatabaseHelper extends RoomDatabase {
    private static final  String DB_NAME = "userDataDB";
    private static volatile DatabaseHelper instance;

    public static synchronized DatabaseHelper getDB(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context, DatabaseHelper.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

    /*static DatabaseHelper getInstance(Context context){
        if(instance == null){
            synchronized(DatabaseHelper.class){
                if(instance == null){
                    instance = Room.databaseBuilder(context.getApplicationContext(),DatabaseHelper.class,DB_NAME).build();
                }
            }
        }
        return instance;
    }*/

    public abstract UserDataDao userDataDao();
}
