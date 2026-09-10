package o;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f46915b;

    public /* synthetic */ e(u uVar, int i10) {
        this.f46914a = i10;
        this.f46915b = uVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f46914a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f46914a) {
            case 0:
                g gVar = (g) this.f46915b;
                ViewTreeObserver viewTreeObserver = gVar.f46941x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f46941x = view.getViewTreeObserver();
                    }
                    gVar.f46941x.removeGlobalOnLayoutListener(gVar.f46927i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                d0 d0Var = (d0) this.f46915b;
                ViewTreeObserver viewTreeObserver2 = d0Var.f46908o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.f46908o = view.getViewTreeObserver();
                    }
                    d0Var.f46908o.removeGlobalOnLayoutListener(d0Var.f46903i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
