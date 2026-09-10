package com.smartdigimkt.v0;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f38999a = 10;

    private m() {
    }

    public static final long a() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis > 0) {
                return (jCurrentTimeMillis / 10) * 10;
            }
        } catch (Exception unused) {
        }
        return 0L;
    }
}
