package com.bytedance.sdk.component.ud.qdl.ud;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes.dex */
final class mo {
    static mzz qdl;
    static long ud;

    private mo() {
    }

    public static mzz qdl() {
        synchronized (mo.class) {
            mzz mzzVar = qdl;
            if (mzzVar == null) {
                return new mzz();
            }
            qdl = mzzVar.mo;
            mzzVar.mo = null;
            ud -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return mzzVar;
        }
    }

    public static void qdl(mzz mzzVar) {
        if (mzzVar.mo == null && mzzVar.wd == null) {
            if (mzzVar.mml) {
                return;
            }
            synchronized (mo.class) {
                try {
                    long j = ud;
                    if (j + PlaybackStateCompat.ACTION_PLAY_FROM_URI > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        return;
                    }
                    ud = j + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    mzzVar.mo = qdl;
                    mzzVar.lnr = 0;
                    mzzVar.ud = 0;
                    qdl = mzzVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
