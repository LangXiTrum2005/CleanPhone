package com.efs.sdk.memleaksdk.monitor.internal;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static r f694a;
    static long b;

    private s() {
    }

    public static r a() {
        synchronized (s.class) {
            try {
                r rVar = f694a;
                if (rVar == null) {
                    return new r();
                }
                f694a = rVar.f;
                rVar.f = null;
                b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return rVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(r rVar) {
        if (rVar.f == null && rVar.g == null) {
            if (rVar.d) {
                return;
            }
            synchronized (s.class) {
                try {
                    long j = b;
                    if (j + PlaybackStateCompat.ACTION_PLAY_FROM_URI > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        return;
                    }
                    b = j + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    rVar.f = f694a;
                    rVar.c = 0;
                    rVar.b = 0;
                    f694a = rVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
