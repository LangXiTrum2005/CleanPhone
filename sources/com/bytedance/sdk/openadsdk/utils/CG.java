package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class CG {
    private long LD;
    public long Lxb;

    private CG(boolean z) {
        if (z) {
            JXs();
        }
    }

    public static CG LD() {
        return new CG(true);
    }

    public static CG lk() {
        return new CG(false);
    }

    public void JXs() {
        this.Lxb = System.currentTimeMillis();
        this.LD = SystemClock.elapsedRealtime();
    }

    public long Lxb() {
        return this.LD;
    }

    public long ZU() {
        return SystemClock.elapsedRealtime() - this.LD;
    }

    public boolean lc() {
        return this.LD > 0;
    }

    public String toString() {
        return String.valueOf(this.Lxb);
    }

    public long Lxb(CG cg) {
        return Math.abs(cg.LD - this.LD);
    }
}
