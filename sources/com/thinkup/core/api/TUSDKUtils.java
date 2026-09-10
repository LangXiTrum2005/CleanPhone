package com.thinkup.core.api;

import android.content.Context;
import com.thinkup.core.common.ooo.o00;
import com.thinkup.core.common.ooo.o0n;

/* JADX INFO: loaded from: classes6.dex */
public class TUSDKUtils {
    public static int dip2px(Context context, float f) {
        return o00.o(context, f);
    }

    public static double getRmbChangeToUsdRate() {
        return o0n.m();
    }

    public static double getUsdChangeToRmbRate() {
        return o0n.o();
    }

    public static int px2dip(Context context, float f) {
        return o00.m(context, f);
    }
}
