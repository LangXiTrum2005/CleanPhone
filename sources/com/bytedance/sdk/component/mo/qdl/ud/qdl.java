package com.bytedance.sdk.component.mo.qdl.ud;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.bytedance.sdk.component.mo.qdl.jpc;
import com.bytedance.sdk.component.mo.qdl.qdl.mzz;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    public static boolean lnr() {
        mzz mzzVarMml = jpc.wd().mml();
        return (mzzVarMml == null || TextUtils.isEmpty(mzzVarMml.mml())) ? false : true;
    }

    public static boolean mml() {
        mzz mzzVarMml = jpc.wd().mml();
        return (mzzVarMml == null || TextUtils.isEmpty(mzzVarMml.mzz())) ? false : true;
    }

    public static boolean mo() {
        mzz mzzVarMml = jpc.wd().mml();
        return (mzzVarMml == null || TextUtils.isEmpty(mzzVarMml.mo())) ? false : true;
    }

    public static boolean mzz() {
        mzz mzzVarMml = jpc.wd().mml();
        return (mzzVarMml == null || TextUtils.isEmpty(mzzVarMml.lnr())) ? false : true;
    }

    public static long qdl(int i2, Context context) {
        return ud(i2, context);
    }

    private static long ud(int i2, Context context) {
        if (context == null) {
            return i2;
        }
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        long jMaxMemory = (runtime.maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) - (runtime.totalMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            return jFreeMemory <= 10 ? Math.min(i2, 10) : Math.min((jFreeMemory / 2) * 10, i2);
        }
        long j = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j <= 2) {
            return 1L;
        }
        return j <= 10 ? Math.min(i2, 10) : Math.min(j * 10, i2);
    }

    public static boolean qdl() {
        mzz mzzVarMml = jpc.wd().mml();
        return (mzzVarMml == null || TextUtils.isEmpty(mzzVarMml.qdl())) ? false : true;
    }

    public static boolean ud() {
        mzz mzzVarMml = jpc.wd().mml();
        return (mzzVarMml == null || TextUtils.isEmpty(mzzVarMml.ud())) ? false : true;
    }
}
