package com.android.room.demo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by rizvan on 10/31/17.
 */

@Dao
public interface UserDao {

    @Query("SELECT * FROM user")
    List<User> getAllUsers();


    @Insert
    void insert(User user);

    @Update
    void update(User user);

    @Delete
    void delete(User user);

}
