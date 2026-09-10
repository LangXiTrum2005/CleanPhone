package com.bytedance.sdk.openadsdk.core.jbs.ri;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public static float lr(Context context) {
        return qd.ik(context, qd.aw(context));
    }

    public static Pair<Float, Float> ri(Window window, int i) {
        View decorView = window.getDecorView();
        float[] fArrRi = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArrRi[0] = qd.ik(window.getContext(), fArrRi[0]);
        float fIk = qd.ik(window.getContext(), fArrRi[1]);
        fArrRi[1] = fIk;
        if (fArrRi[0] < 10.0f || fIk < 10.0f) {
            fArrRi = ri(window.getContext(), qd.ik(window.getContext(), qd.ri()), i);
        }
        float fMax = Math.max(fArrRi[0], fArrRi[1]);
        float fMin = Math.min(fArrRi[0], fArrRi[1]);
        if (i == 1) {
            fArrRi[0] = fMin;
            fArrRi[1] = fMax;
        } else {
            fArrRi[0] = fMax;
            fArrRi[1] = fMin;
        }
        return new Pair<>(Float.valueOf(fArrRi[0]), Float.valueOf(fArrRi[1]));
    }

    private static float[] ri(Context context, int i, int i2) {
        float fRi = ri(context);
        float fLr = lr(context);
        if ((i2 == 1) != (fRi > fLr)) {
            float f = fRi + fLr;
            fLr = f - fLr;
            fRi = f - fLr;
        }
        if (i2 == 1) {
            fRi -= i;
        } else {
            fLr -= i;
        }
        return new float[]{fLr, fRi};
    }

    public static float ri(Context context) {
        return qd.ik(context, qd.co(context));
    }
}
