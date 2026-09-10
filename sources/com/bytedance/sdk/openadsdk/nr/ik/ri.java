package com.bytedance.sdk.openadsdk.nr.ik;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.component.utils.ihz;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private final SharedPreferences ri;

    public ri(Context context) {
        if (ihz.ri(context)) {
            this.ri = context.getSharedPreferences("pag_monitor_record", 0);
            return;
        }
        this.ri = context.getSharedPreferences("pag_monitor_record_" + ihz.ik(context), 0);
    }

    public long ri() {
        return this.ri.getLong("last_upload_time", 0L);
    }

    public void ri(long j) {
        SharedPreferences.Editor editorEdit = this.ri.edit();
        editorEdit.putLong("last_upload_time", j);
        editorEdit.apply();
    }
}
