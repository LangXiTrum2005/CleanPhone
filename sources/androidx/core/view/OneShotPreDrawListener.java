package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class OneShotPreDrawListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ViewTreeObserver f4455Y;
    public final Runnable Z;

    public OneShotPreDrawListener(View view, Runnable runnable) {
        this.X = view;
        this.f4455Y = view.getViewTreeObserver();
        this.Z = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        OneShotPreDrawListener oneShotPreDrawListener = new OneShotPreDrawListener(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(oneShotPreDrawListener);
        view.addOnAttachStateChangeListener(oneShotPreDrawListener);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f4455Y.isAlive();
        View view = this.X;
        if (zIsAlive) {
            this.f4455Y.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.Z.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f4455Y = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f4455Y.isAlive();
        View view2 = this.X;
        if (zIsAlive) {
            this.f4455Y.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
