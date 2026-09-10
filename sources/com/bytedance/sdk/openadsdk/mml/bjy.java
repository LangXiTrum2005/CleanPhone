package com.bytedance.sdk.openadsdk.mml;

/* JADX INFO: loaded from: classes3.dex */
public class bjy {
    public static String qdl() {
        return "CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , encrypt INTEGER default 0 , retry INTEGER default 0)";
    }

    public static String ud() {
        return "ALTER TABLE logstats ADD COLUMN encrypt INTEGER default 0";
    }
}
