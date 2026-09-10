package com.bytedance.sdk.component.di.ri.ri.ri.ri;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends ri {
    public ka(Context context, com.bytedance.sdk.component.di.ri.ka.lr.ri riVar) {
        super(context, riVar);
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ri.ri.ik
    public long di() {
        return com.bytedance.sdk.component.di.ri.xha.ri.lr();
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ri.ri.ri
    public byte ik() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ri.ri.ri
    public byte ka() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.di.ri.ri.ri.ri.ri, com.bytedance.sdk.component.di.ri.ri.ri.ri.ik
    public String lr() {
        com.bytedance.sdk.component.di.ri.ri.fi fiVarIk = com.bytedance.sdk.component.di.ri.xha.di().ik();
        if (fiVarIk != null) {
            return fiVarIk.ri();
        }
        return null;
    }

    public static String ik(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
