package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class JVA extends OY {
    private long LD;
    private long Lxb;

    public JVA(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public void LD(com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i) {
        if (isShown()) {
            return;
        }
        LD();
        setVisibility(0);
        this.Lxb = SystemClock.elapsedRealtime();
        Lxb(tDVar, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.OY
    public boolean Lxb() {
        return false;
    }

    public boolean ZU() {
        return this.Lxb > 0 && this.LD > 0;
    }

    public long getDisplayDuration() {
        if (this.Lxb == 0) {
            return 0L;
        }
        if (this.LD == 0) {
            this.LD = SystemClock.elapsedRealtime();
        }
        return this.LD - this.Lxb;
    }

    public void lk() {
        setVisibility(8);
        if (this.Lxb != 0) {
            this.LD = SystemClock.elapsedRealtime();
        }
    }
}
