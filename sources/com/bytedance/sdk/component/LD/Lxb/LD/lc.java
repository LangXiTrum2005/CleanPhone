package com.bytedance.sdk.component.LD.Lxb.LD;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
final class lc {
    static long LD;
    static JXs Lxb;

    private lc() {
    }

    public static JXs Lxb() {
        synchronized (lc.class) {
            JXs jXs = Lxb;
            if (jXs == null) {
                return new JXs();
            }
            Lxb = jXs.lc;
            jXs.lc = null;
            LD -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return jXs;
        }
    }

    public static void Lxb(JXs jXs) {
        if (jXs.lc == null && jXs.ebl == null) {
            if (jXs.ZU) {
                return;
            }
            synchronized (lc.class) {
                try {
                    long j = LD;
                    if (j + PlaybackStateCompat.ACTION_PLAY_FROM_URI > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        return;
                    }
                    LD = j + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    jXs.lc = Lxb;
                    jXs.lk = 0;
                    jXs.LD = 0;
                    Lxb = jXs;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
