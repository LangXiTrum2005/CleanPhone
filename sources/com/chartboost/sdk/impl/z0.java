package com.chartboost.sdk.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z0 {
    public static final String b(int i2) {
        if (i2 == 1) {
            return "STATE_IDLE";
        }
        if (i2 == 2) {
            return "STATE_BUFFERING";
        }
        if (i2 != 3) {
            return i2 != 4 ? "UNKNOWN" : "STATE_ENDED";
        }
        return "STATE_READY";
    }
}
