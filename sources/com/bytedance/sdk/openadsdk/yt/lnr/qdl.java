package com.bytedance.sdk.openadsdk.yt.lnr;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private final SharedPreferences qdl;

    public qdl(Context context) {
        this.qdl = context.getSharedPreferences("pag_monitor_record", 0);
    }

    public long qdl() {
        return this.qdl.getLong("last_upload_time", 0L);
    }

    public void qdl(long j) {
        SharedPreferences.Editor editorEdit = this.qdl.edit();
        editorEdit.putLong("last_upload_time", j);
        editorEdit.apply();
    }
}
