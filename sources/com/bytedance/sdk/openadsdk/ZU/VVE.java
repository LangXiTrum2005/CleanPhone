package com.bytedance.sdk.openadsdk.ZU;

/* JADX INFO: loaded from: classes2.dex */
public class VVE extends ZU {
    public static String lk() {
        return "CREATE TABLE IF NOT EXISTS adevent_applog (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0, channel INTEGER default 0)";
    }
}
