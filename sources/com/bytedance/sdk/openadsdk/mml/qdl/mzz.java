package com.bytedance.sdk.openadsdk.mml.qdl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public class mzz implements com.bytedance.sdk.component.mo.qdl.qdl.mzz {
    public static final mzz qdl = new mzz();
    private volatile SQLiteDatabase ud;

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mzz
    public String lnr() {
        return null;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mzz
    public String mml() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mzz
    public String mo() {
        return null;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mzz
    public String mzz() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mzz
    public SQLiteDatabase qdl(Context context) {
        if (this.ud == null) {
            synchronized (this) {
                try {
                    if (this.ud == null) {
                        this.ud = com.bytedance.sdk.openadsdk.core.mzz.qdl(context).qdl().qdl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.ud;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mzz
    public String ud() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mzz
    public String qdl() {
        return "loghighpriority";
    }
}
