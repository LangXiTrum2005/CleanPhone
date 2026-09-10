package com.bytedance.sdk.openadsdk.core.OY.Lxb;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public static float LD(Context context) {
        return le.ZU(context, le.nBu(context));
    }

    @NonNull
    public static Pair<Float, Float> Lxb(Window window, int i) {
        View decorView = window.getDecorView();
        float[] fArrLxb = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArrLxb[0] = le.ZU(window.getContext(), fArrLxb[0]);
        float fZU = le.ZU(window.getContext(), fArrLxb[1]);
        fArrLxb[1] = fZU;
        if (fArrLxb[0] < 10.0f || fZU < 10.0f) {
            fArrLxb = Lxb(window.getContext(), le.ZU(window.getContext(), le.Lxb()), i);
        }
        float fMax = Math.max(fArrLxb[0], fArrLxb[1]);
        float fMin = Math.min(fArrLxb[0], fArrLxb[1]);
        if (i == 1) {
            fArrLxb[0] = fMin;
            fArrLxb[1] = fMax;
        } else {
            fArrLxb[0] = fMax;
            fArrLxb[1] = fMin;
        }
        return new Pair<>(Float.valueOf(fArrLxb[0]), Float.valueOf(fArrLxb[1]));
    }

    private static float[] Lxb(Context context, int i, int i2) {
        float fLxb = Lxb(context);
        float fLD = LD(context);
        if ((i2 == 1) != (fLxb > fLD)) {
            float f = fLxb + fLD;
            fLD = f - fLD;
            fLxb = f - fLD;
        }
        if (i2 == 1) {
            fLxb -= i;
        } else {
            fLD -= i;
        }
        return new float[]{fLD, fLxb};
    }

    public static float Lxb(Context context) {
        return le.ZU(context, le.QAg(context));
    }
}
