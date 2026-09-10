package com.bytedance.sdk.openadsdk.mml;

/* JADX INFO: loaded from: classes3.dex */
public class yt extends mml {
    public static String lnr() {
        return "CREATE TABLE IF NOT EXISTS adevent_applog (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0, channel INTEGER default 0)";
    }
}
