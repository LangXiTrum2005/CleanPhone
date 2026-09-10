package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.T3;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes2.dex */
public class nr {
    public static boolean di(Context context) {
        return ik(context) == 6;
    }

    public static boolean fi(Context context) {
        return ik(context) == 5;
    }

    public static int ik(Context context) {
        return su.ri(context, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public static boolean ka(Context context) {
        return ik(context) == 4;
    }

    public static int lr(Context context) {
        int iIk = ik(context);
        if (iIk == 1) {
            return 0;
        }
        if (iIk == 4) {
            return 1;
        }
        if (iIk == 5) {
            return 4;
        }
        if (iIk != 6) {
            return iIk;
        }
        return 6;
    }

    public static boolean mj(Context context) {
        if (context == null) {
            return false;
        }
        int iIk = ik(context);
        return iIk == 2 || iIk == 3 || iIk == 4 || iIk == 5 || iIk == 6;
    }

    public static boolean ri(Context context) {
        return ik(context) != 0;
    }

    public static String xha(Context context) {
        int iIk = ik(context);
        if (iIk == 2) {
            return "2g";
        }
        if (iIk == 3) {
            return T3.a;
        }
        if (iIk == 4) {
            return T3.b;
        }
        if (iIk != 5) {
            return iIk != 6 ? "mobile" : "5g";
        }
        return "4g";
    }

    public static boolean ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }
}
