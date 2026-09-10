package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class pv {
    private long lr;
    public long ri;

    private pv(boolean z) {
        if (z) {
            fi();
        }
    }

    public static pv ik() {
        return new pv(false);
    }

    public static pv lr() {
        return new pv(true);
    }

    public boolean di() {
        return this.lr > 0;
    }

    public void fi() {
        this.ri = System.currentTimeMillis();
        this.lr = SystemClock.elapsedRealtime();
    }

    public long ka() {
        return SystemClock.elapsedRealtime() - this.lr;
    }

    public long ri() {
        return this.lr;
    }

    public String toString() {
        return String.valueOf(this.ri);
    }

    public long ri(pv pvVar) {
        return Math.abs(pvVar.lr - this.lr);
    }
}
