package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public class mrf {
    public long qdl;
    private long ud;

    private mrf(boolean z2) {
        if (z2) {
            mzz();
        }
    }

    public static mrf lnr() {
        return new mrf(false);
    }

    public static mrf ud() {
        return new mrf(true);
    }

    public long mml() {
        return SystemClock.elapsedRealtime() - this.ud;
    }

    public boolean mo() {
        return this.ud > 0;
    }

    public void mzz() {
        this.qdl = System.currentTimeMillis();
        this.ud = SystemClock.elapsedRealtime();
    }

    public long qdl() {
        return this.ud;
    }

    public String toString() {
        return String.valueOf(this.qdl);
    }

    public long qdl(mrf mrfVar) {
        return Math.abs(mrfVar.ud - this.ud);
    }
}
