package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f4461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f4462b;

    public r0(s0 s0Var, o1 o1Var) {
        this.f4462b = s0Var;
        this.f4461a = o1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        o1 o1Var = this.f4461a;
        Fragment fragment = o1Var.f4414c;
        o1Var.k();
        r.j((ViewGroup) fragment.mView.getParent(), this.f4462b.f4467a).i();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
