package m0;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f45760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f45761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f45762c;

    public x(View view, Runnable runnable) {
        this.f45760a = view;
        this.f45761b = view.getViewTreeObserver();
        this.f45762c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        x xVar = new x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(xVar);
        view.addOnAttachStateChangeListener(xVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f45761b.isAlive();
        View view = this.f45760a;
        if (zIsAlive) {
            this.f45761b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f45762c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f45761b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f45761b.isAlive();
        View view2 = this.f45760a;
        if (zIsAlive) {
            this.f45761b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
