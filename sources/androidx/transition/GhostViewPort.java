package androidx.transition;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class GhostViewPort extends ViewGroup implements GhostView {
    public static final /* synthetic */ int g0 = 0;
    public ViewGroup e0;
    public View f0;

    /* JADX INFO: renamed from: androidx.transition.GhostViewPort$1, reason: invalid class name */
    public class AnonymousClass1 implements ViewTreeObserver.OnPreDrawListener {
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            CanvasUtils.Api29Impl.b(canvas);
        } else {
            if (i2 == 28) {
                throw new IllegalStateException("This method doesn't work on Pie!");
            }
            if (!CanvasUtils.f8398c) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    CanvasUtils.f8396a = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    CanvasUtils.f8397b = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                CanvasUtils.f8398c = true;
            }
            try {
                Method method = CanvasUtils.f8396a;
                if (method != null) {
                    method.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        canvas.setMatrix(null);
        ViewUtils.b(null, 0);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        throw null;
    }
}
