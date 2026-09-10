package com.bytedance.sdk.openadsdk.VVE.lk;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private final SharedPreferences Lxb;

    public Lxb(Context context) {
        this.Lxb = context.getSharedPreferences("pag_monitor_record", 0);
    }

    public long Lxb() {
        return this.Lxb.getLong("last_upload_time", 0L);
    }

    public void Lxb(long j) {
        SharedPreferences.Editor editorEdit = this.Lxb.edit();
        editorEdit.putLong("last_upload_time", j);
        editorEdit.apply();
    }
}
