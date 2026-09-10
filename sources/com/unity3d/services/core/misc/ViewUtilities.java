package com.unity3d.services.core.misc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.core.log.DeviceLog;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class ViewUtilities {
    public static float dpFromPx(Context context, float f10) {
        return f10 / context.getResources().getDisplayMetrics().density;
    }

    public static float pxFromDp(Context context, float f10) {
        return f10 * context.getResources().getDisplayMetrics().density;
    }

    public static void removeViewFromParent(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        try {
            ((ViewGroup) view.getParent()).removeView(view);
        } catch (Exception e10) {
            DeviceLog.exception("Error while removing view from it's parent", e10);
        }
    }

    public static void setBackground(View view, Drawable drawable) {
        try {
            View.class.getMethod("setBackground", Drawable.class).invoke(view, drawable);
        } catch (Exception e10) {
            DeviceLog.exception("Couldn't run".concat("setBackground"), e10);
        }
    }
}
