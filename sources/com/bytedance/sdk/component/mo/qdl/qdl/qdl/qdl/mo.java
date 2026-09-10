package com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl;

import android.content.Context;
import android.support.v4.media.a;
import com.bytedance.sdk.component.mo.qdl.jpc;

/* JADX INFO: loaded from: classes.dex */
public class mo extends wd {
    public mo(Context context, com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar) {
        super(context, qdlVar);
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.wd
    public byte lnr() {
        return (byte) 3;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.wd
    public byte qdl() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.wd, com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.lnr
    public String ud() {
        return jpc.wd().mml().mzz();
    }

    public static String qdl(String str) {
        return a.n("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
