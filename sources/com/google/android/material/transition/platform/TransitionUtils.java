package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.google.android.material.canvas.CanvasCompat;

/* JADX INFO: loaded from: classes4.dex */
class TransitionUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RectF f19644a = new RectF();

    public interface CornerSizeBinaryOperator {
    }

    public static View a(View view) {
        String resourceName = view.getResources().getResourceName(0);
        while (view != null) {
            if (view.getId() != 0) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(android.support.v4.media.a.m(resourceName, " is not a valid ancestor"));
    }

    public static RectF b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        return new RectF(i2, i3, view.getWidth() + i2, view.getHeight() + i3);
    }

    public static float c(float f, float f2, float f3) {
        return android.support.v4.media.a.a(f2, f, f3, f);
    }

    public static float d(float f, float f2, float f3, float f4, float f5, boolean z2) {
        if (z2 && (f5 < 0.0f || f5 > 1.0f)) {
            return c(f, f2, f5);
        }
        if (f5 < f3) {
            return f;
        }
        return f5 > f4 ? f2 : c(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int e(float f, float f2, float f3, int i2, int i3) {
        if (f3 < f) {
            return i2;
        }
        return f3 > f2 ? i3 : (int) c(i2, i3, (f3 - f) / (f2 - f));
    }

    public static void f(Canvas canvas, Rect rect, float f, float f2, float f3, int i2, CanvasCompat.CanvasOperation canvasOperation) {
        if (i2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        if (i2 < 255) {
            RectF rectF = f19644a;
            rectF.set(rect);
            canvas.saveLayerAlpha(rectF, i2);
        }
        canvasOperation.a(canvas);
        canvas.restoreToCount(iSave);
    }
}
