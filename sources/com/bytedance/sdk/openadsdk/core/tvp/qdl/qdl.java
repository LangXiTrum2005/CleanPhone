package com.bytedance.sdk.openadsdk.core.tvp.qdl;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    public static Pair<Float, Float> qdl(Window window, int i2) {
        View decorView = window.getDecorView();
        float[] fArrQdl = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArrQdl[0] = ax.lnr(window.getContext(), fArrQdl[0]);
        float fLnr = ax.lnr(window.getContext(), fArrQdl[1]);
        fArrQdl[1] = fLnr;
        if (fArrQdl[0] < 10.0f || fLnr < 10.0f) {
            fArrQdl = qdl(window.getContext(), ax.lnr(window.getContext(), ax.qdl()), i2);
        }
        float fMax = Math.max(fArrQdl[0], fArrQdl[1]);
        float fMin = Math.min(fArrQdl[0], fArrQdl[1]);
        if (i2 == 1) {
            fArrQdl[0] = fMin;
            fArrQdl[1] = fMax;
        } else {
            fArrQdl[0] = fMax;
            fArrQdl[1] = fMin;
        }
        return new Pair<>(Float.valueOf(fArrQdl[0]), Float.valueOf(fArrQdl[1]));
    }

    public static float ud(Context context) {
        return ax.lnr(context, ax.exu(context));
    }

    private static float[] qdl(Context context, int i2, int i3) {
        float fQdl = qdl(context);
        float fUd = ud(context);
        if ((i3 == 1) != (fQdl > fUd)) {
            float f = fQdl + fUd;
            fUd = f - fUd;
            fQdl = f - fUd;
        }
        if (i3 == 1) {
            fQdl -= i2;
        } else {
            fUd -= i2;
        }
        return new float[]{fUd, fQdl};
    }

    public static float qdl(Context context) {
        return ax.lnr(context, ax.fs(context));
    }
}
