package com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl;

import android.content.Context;
import android.support.v4.media.a;
import com.bytedance.sdk.component.mo.qdl.jpc;

/* JADX INFO: loaded from: classes.dex */
public class mml extends qdl {
    public mml(Context context, com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar) {
        super(context, qdlVar);
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.qdl
    public byte lnr() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.qdl
    public byte mml() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.lnr
    public long mo() {
        return com.bytedance.sdk.component.mo.qdl.wd.qdl.ud();
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.qdl, com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.lnr
    public String ud() {
        com.bytedance.sdk.component.mo.qdl.qdl.mzz mzzVarMml = jpc.wd().mml();
        if (mzzVarMml != null) {
            return mzzVarMml.qdl();
        }
        return null;
    }

    public static String lnr(String str) {
        return a.n("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
