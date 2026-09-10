package m0;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f45759a;

    public w0(View view) {
        this.f45759a = new WeakReference(view);
    }

    public final void a(float f10) {
        View view = (View) this.f45759a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = (View) this.f45759a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = (View) this.f45759a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(x0 x0Var) {
        View view = (View) this.f45759a.get();
        if (view != null) {
            if (x0Var != null) {
                view.animate().setListener(new v0(x0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = (View) this.f45759a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
