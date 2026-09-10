package com.thinkup.core.common.no.n;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes6.dex */
final class oo0 {
    static o0n m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static long f42095n = 0;
    static final long o = 65536;

    private oo0() {
    }

    public static o0n o() {
        synchronized (oo0.class) {
            o0n o0nVar = m;
            if (o0nVar == null) {
                return new o0n();
            }
            m = o0nVar.m0;
            o0nVar.m0 = null;
            f42095n -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return o0nVar;
        }
    }

    public static void o(o0n o0nVar) {
        if (o0nVar.m0 == null && o0nVar.mo == null) {
            if (o0nVar.om) {
                return;
            }
            synchronized (oo0.class) {
                try {
                    long j = f42095n;
                    if (j + PlaybackStateCompat.ACTION_PLAY_FROM_URI > 65536) {
                        return;
                    }
                    f42095n = j + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    o0nVar.m0 = m;
                    o0nVar.oo = 0;
                    o0nVar.o0 = 0;
                    m = o0nVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
