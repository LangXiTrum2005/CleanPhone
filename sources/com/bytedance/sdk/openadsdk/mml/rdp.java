package com.bytedance.sdk.openadsdk.mml;

/* JADX INFO: loaded from: classes3.dex */
public class rdp {
    public static String qdl() {
        return "CREATE TABLE IF NOT EXISTS logstatsbatch (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public static String ud() {
        return "ALTER TABLE logstatsbatch ADD COLUMN encrypt INTEGER default 0";
    }
}
