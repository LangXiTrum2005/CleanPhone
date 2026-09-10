package com.bytedance.sdk.component.lc.Lxb.LD;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.bytedance.sdk.component.lc.Lxb.Lxb.JXs;
import com.bytedance.sdk.component.lc.Lxb.OY;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public static boolean JXs() {
        JXs jXsZU = OY.ebl().ZU();
        return (jXsZU == null || TextUtils.isEmpty(jXsZU.lk())) ? false : true;
    }

    private static long LD(int i, Context context) {
        if (context == null) {
            return i;
        }
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        long jMaxMemory = (runtime.maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) - (runtime.totalMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            return jFreeMemory <= 10 ? Math.min(i, 10) : Math.min((jFreeMemory / 2) * 10, i);
        }
        long j = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j <= 2) {
            return 1L;
        }
        return j <= 10 ? Math.min(i, 10) : Math.min(j * 10, i);
    }

    public static long Lxb(int i, Context context) {
        return LD(i, context);
    }

    public static boolean ZU() {
        JXs jXsZU = OY.ebl().ZU();
        return (jXsZU == null || TextUtils.isEmpty(jXsZU.JXs())) ? false : true;
    }

    public static boolean lc() {
        JXs jXsZU = OY.ebl().ZU();
        return (jXsZU == null || TextUtils.isEmpty(jXsZU.lc())) ? false : true;
    }

    public static boolean lk() {
        JXs jXsZU = OY.ebl().ZU();
        return (jXsZU == null || TextUtils.isEmpty(jXsZU.ZU())) ? false : true;
    }

    public static boolean Lxb() {
        JXs jXsZU = OY.ebl().ZU();
        return (jXsZU == null || TextUtils.isEmpty(jXsZU.Lxb())) ? false : true;
    }

    public static boolean LD() {
        JXs jXsZU = OY.ebl().ZU();
        return (jXsZU == null || TextUtils.isEmpty(jXsZU.LD())) ? false : true;
    }
}
