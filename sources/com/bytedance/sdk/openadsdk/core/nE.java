package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class nE {
    private static boolean LD(View view) {
        return view != null && view.isShown();
    }

    private static boolean Lxb(View view, int i) {
        float fLxb = Lxb(view);
        return fLxb > 0.0f && fLxb >= ((float) i) / 100.0f;
    }

    private static int ZU(View view, int i) {
        if (i == 3) {
            return le.ZU(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static int lk(View view, int i) {
        if (i == 3) {
            return (int) (((double) le.lk(view.getContext().getApplicationContext())) * 0.7d);
        }
        return 20;
    }

    private static boolean LD(View view, int i) {
        return view.getWidth() >= lk(view, i) && view.getHeight() >= ZU(view, i);
    }

    public static float Lxb(View view) {
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

    private static int LD(View view, int i, int i2) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!LD(view)) {
            return 1;
        }
        if (LD(view, i2)) {
            return !Lxb(view, i) ? 3 : 0;
        }
        return 6;
    }

    public static boolean Lxb(View view, int i, int i2) {
        if (i2 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof com.bytedance.sdk.openadsdk.core.OY.tD) || (view instanceof com.bytedance.sdk.openadsdk.core.lk.lk)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable unused) {
                }
            }
        }
        return LD(view, i, i2) == 0;
    }
}
