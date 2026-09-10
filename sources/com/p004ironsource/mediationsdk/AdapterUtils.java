package com.p004ironsource.mediationsdk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: loaded from: classes5.dex */
public class AdapterUtils {
    public static final int MIN_TABLET_DP_SIZE = 600;

    public static int dpToPixels(Context context, int i2) {
        if (context != null) {
            return (int) TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils dpToPixels - context is null, returning dpSize", 3);
        return i2;
    }

    public static String getScreenSizeParams(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.heightPixels;
        float f2 = displayMetrics.density;
        float fMin = Math.min(displayMetrics.widthPixels / f2, f / f2);
        float f3 = displayMetrics.xdpi;
        float f4 = displayMetrics.ydpi;
        float f5 = displayMetrics.widthPixels / f3;
        float f6 = displayMetrics.heightPixels / f4;
        double dSqrt = Math.sqrt((f6 * f6) + (f5 * f5));
        int i2 = context.getResources().getConfiguration().smallestScreenWidthDp;
        StringBuilder sb = new StringBuilder("smallestWidth = ");
        sb.append(fMin);
        sb.append(" diagonalInches = ");
        sb.append(dSqrt);
        return a.g(i2, " smallScreenDpApi =  ", sb);
    }

    public static boolean isLargeScreen(Context context) {
        if (context != null) {
            return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils isLargeScreen - context is null", 3);
        return false;
    }
}
