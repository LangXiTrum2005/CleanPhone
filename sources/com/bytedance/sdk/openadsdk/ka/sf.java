package com.bytedance.sdk.openadsdk.ka;

/* JADX INFO: loaded from: classes2.dex */
public class sf extends ka {
    public static String ik() {
        return "CREATE TABLE IF NOT EXISTS loghighpriority (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public static String ka() {
        return "ALTER TABLE loghighpriority ADD COLUMN encrypt INTEGER default 0";
    }
}
