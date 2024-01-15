package com.example.roomdbdemo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "UserData")
public class userData {
    @PrimaryKey(autoGenerate = true)
    private int uid;
    @ColumnInfo(name = "PhNum")
    private String phNum;
    @ColumnInfo(name = "UserName")
    private String name;
    @ColumnInfo(name = "userAddress")
    private String address;

    userData(int uid, String phNum, String name, String address){
        this.uid = uid;
        this.phNum = phNum;
        this.name = name;
        this.address = address;
    }
    @Ignore
    userData(String phNum, String name, String address){
        this.phNum = phNum;
        this.name = name;
        this.address = address;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
