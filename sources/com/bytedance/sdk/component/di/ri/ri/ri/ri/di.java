package com.bytedance.sdk.component.di.ri.ri.ri.ri;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class di extends xha {
    public di(Context context, com.bytedance.sdk.component.di.ri.ka.lr.ri riVar) {
        super(context, riVar);
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ri.ri.xha
    public byte ik() {
        return (byte) 3;
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ri.ri.xha, com.bytedance.sdk.component.di.ri.ri.ri.ri.ik
    public String lr() {
        return com.bytedance.sdk.component.di.ri.xha.di().ik().fi();
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ri.ri.xha
    public byte ri() {
        return (byte) 1;
    }

    public static String ri(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
