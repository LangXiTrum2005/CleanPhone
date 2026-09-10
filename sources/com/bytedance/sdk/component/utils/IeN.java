package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes2.dex */
public class IeN {
    public static boolean JXs(Context context) {
        return lk(context) == 5;
    }

    public static int LD(Context context) {
        int iLk = lk(context);
        if (iLk == 1) {
            return 0;
        }
        if (iLk == 4) {
            return 1;
        }
        if (iLk == 5) {
            return 4;
        }
        if (iLk != 6) {
            return iLk;
        }
        return 6;
    }

    public static boolean Lxb(Context context) {
        return lk(context) != 0;
    }

    public static boolean OY(Context context) {
        if (context == null) {
            return false;
        }
        int iLk = lk(context);
        return iLk == 2 || iLk == 3 || iLk == 4 || iLk == 5 || iLk == 6;
    }

    public static boolean ZU(Context context) {
        return lk(context) == 4;
    }

    public static String ebl(Context context) {
        int iLk = lk(context);
        if (iLk == 2) {
            return NetworkUtil.NETWORK_CLASS_2G;
        }
        if (iLk == 3) {
            return NetworkUtil.NETWORK_CLASS_3G;
        }
        if (iLk == 4) {
            return NetworkUtil.NETWORK_TYPE_WIFI;
        }
        if (iLk != 5) {
            return iLk != 6 ? "mobile" : NetworkUtil.NETWORK_CLASS_5G;
        }
        return NetworkUtil.NETWORK_CLASS_4G;
    }

    public static boolean lc(Context context) {
        return lk(context) == 6;
    }

    public static int lk(Context context) {
        return HD.Lxb(context, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public static boolean Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }
}
