package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public class qt extends xha {
    private long lr;
    private long ri;

    public qt(Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public long getDisplayDuration() {
        if (this.ri == 0) {
            return 0L;
        }
        if (this.lr == 0) {
            this.lr = SystemClock.elapsedRealtime();
        }
        return this.lr - this.ri;
    }

    public void ik() {
        setVisibility(8);
        if (this.ri != 0) {
            this.lr = SystemClock.elapsedRealtime();
        }
    }

    public boolean ka() {
        return this.ri > 0 && this.lr > 0;
    }

    public void lr(wjv wjvVar, int i) {
        if (isShown()) {
            return;
        }
        lr();
        setVisibility(0);
        this.ri = SystemClock.elapsedRealtime();
        ri(wjvVar, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.xha
    public boolean ri() {
        return false;
    }
}
