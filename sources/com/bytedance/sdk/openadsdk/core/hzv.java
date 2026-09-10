package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class hzv {
    private static int lnr(View view, int i2) {
        if (i2 == 3) {
            return ax.mzz(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static boolean qdl(View view, int i2) {
        float fQdl = qdl(view);
        return fQdl > 0.0f && fQdl >= ((float) i2) / 100.0f;
    }

    private static boolean ud(View view) {
        return view != null && view.isShown();
    }

    public static float qdl(View view) {
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

    private static int ud(View view, int i2) {
        if (i2 == 3) {
            return (int) (((double) ax.lnr(view.getContext().getApplicationContext())) * 0.7d);
        }
        return 20;
    }

    private static int ud(View view, int i2, int i3, boolean z2) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!ud(view)) {
            return 1;
        }
        if (qdl(view, i3, z2)) {
            return !qdl(view, i2) ? 3 : 0;
        }
        return 6;
    }

    private static boolean qdl(View view, int i2, boolean z2) {
        int iUd = ud(view, i2);
        int iLnr = lnr(view, i2);
        if (i2 == 1 && z2) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }
        return view.getWidth() >= iUd && view.getHeight() >= iLnr;
    }

    public static boolean qdl(View view, int i2, int i3, boolean z2) {
        if (i3 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof com.bytedance.sdk.openadsdk.core.tvp.aaj) || (view instanceof com.bytedance.sdk.openadsdk.core.mml.mml)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable unused) {
                }
            }
            if (z2) {
                i2 = 0;
            }
        }
        return ud(view, i2, i3, z2) == 0;
    }
}
