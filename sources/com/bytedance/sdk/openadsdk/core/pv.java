package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class pv {
    private static int ik(View view, int i) {
        if (i == 3) {
            return com.bytedance.sdk.openadsdk.utils.qd.fi(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static boolean lr(View view) {
        return view != null && view.isShown();
    }

    private static boolean ri(View view, int i) {
        float fRi = ri(view);
        return fRi > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fRi >= ((float) i) / 100.0f;
    }

    private static int lr(View view, int i) {
        if (i == 3) {
            return (int) (((double) com.bytedance.sdk.openadsdk.utils.qd.ik(view.getContext().getApplicationContext())) * 0.7d);
        }
        return 20;
    }

    public static float ri(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    Rect rect = new Rect();
                    if (!view.getGlobalVisibleRect(rect)) {
                        return -1.0f;
                    }
                    long jHeight = ((long) rect.height()) * ((long) rect.width());
                    long height = ((long) view.getHeight()) * ((long) view.getWidth());
                    if (height <= 0) {
                        return -1.0f;
                    }
                    return jHeight / height;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static int lr(View view, int i, int i2, boolean z) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!lr(view)) {
            return 1;
        }
        if (ri(view, i2, z)) {
            return !ri(view, i) ? 3 : 0;
        }
        return 6;
    }

    private static boolean ri(View view, int i, boolean z) {
        int iLr = lr(view, i);
        int iIk = ik(view, i);
        if (i == 1 && z) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }
        return view.getWidth() >= iLr && view.getHeight() >= iIk;
    }

    public static boolean ri(View view, int i, int i2, boolean z) {
        if (i2 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof com.bytedance.sdk.openadsdk.core.jbs.ac) || (view instanceof com.bytedance.sdk.openadsdk.core.ka.ka)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable unused) {
                }
            }
            if (z) {
                i = 0;
            }
        }
        return lr(view, i, i2, z) == 0;
    }
}
