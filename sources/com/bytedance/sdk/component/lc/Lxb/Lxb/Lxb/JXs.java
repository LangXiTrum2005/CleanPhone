package com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public class JXs implements com.bytedance.sdk.component.lc.Lxb.Lxb.JXs {
    public static final JXs Lxb = new JXs();
    private volatile SQLiteDatabase LD;

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.JXs
    public String JXs() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.JXs
    public String LD() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.JXs
    public SQLiteDatabase Lxb(Context context) {
        if (this.LD == null) {
            synchronized (this) {
                try {
                    if (this.LD == null) {
                        this.LD = new ZU(context).getWritableDatabase();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.LD;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.JXs
    public String ZU() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.JXs
    public String lc() {
        return null;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.JXs
    public String lk() {
        return null;
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.JXs
    public String Lxb() {
        return "loghighpriority";
    }
}
