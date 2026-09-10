package com.bytedance.sdk.openadsdk.ZU;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    public static String LD() {
        return "ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0";
    }

    public static String Lxb() {
        return "CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0 , channel INTEGER default 0)";
    }
}
