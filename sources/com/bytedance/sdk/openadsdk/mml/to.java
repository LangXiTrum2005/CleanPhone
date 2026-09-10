package com.bytedance.sdk.openadsdk.mml;

/* JADX INFO: loaded from: classes3.dex */
public class to extends mml {
    public static String lnr() {
        return "CREATE TABLE IF NOT EXISTS loghighpriority (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public static String mml() {
        return "ALTER TABLE loghighpriority ADD COLUMN encrypt INTEGER default 0";
    }
}
