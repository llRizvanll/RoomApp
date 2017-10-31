package com.android.room.demo;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by rizvan on 10/31/17.
 */
@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static final String DB_NAME = "UserDatabase.db";
    private static volatile AppDatabase appDatabase;

    static synchronized AppDatabase getInstance(Context context){
        if (appDatabase == null) appDatabase = create(context);
        return appDatabase;
    }

    private static AppDatabase create(final Context context){
            return Room.databaseBuilder(context,AppDatabase.class,DB_NAME).build();
    }

    public abstract UserDao userDao();

}
