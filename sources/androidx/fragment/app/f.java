package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f4316c;

    public f(g gVar) {
        this.f4316c = gVar;
    }

    @Override // androidx.fragment.app.b2
    public final void b(ViewGroup container) {
        kotlin.jvm.internal.n.f(container, "container");
        g gVar = this.f4316c;
        c2 c2Var = gVar.f4379a;
        View view = c2Var.f4273c.mView;
        view.clearAnimation();
        container.endViewTransition(view);
        gVar.f4379a.c(this);
        if (g1.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + c2Var + " has been cancelled.");
        }
    }

    @Override // androidx.fragment.app.b2
    public final void c(ViewGroup container) {
        kotlin.jvm.internal.n.f(container, "container");
        g gVar = this.f4316c;
        c2 c2Var = gVar.f4379a;
        if (gVar.a()) {
            c2Var.c(this);
            return;
        }
        Context context = container.getContext();
        View view = c2Var.f4273c.mView;
        kotlin.jvm.internal.n.e(context, "context");
        m0 m0VarB = gVar.b(context);
        if (m0VarB == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) m0VarB.f4384a;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (c2Var.f4271a != 1) {
            view.startAnimation(animation);
            c2Var.c(this);
            return;
        }
        container.startViewTransition(view);
        n0 n0Var = new n0(animation, container, view);
        n0Var.setAnimationListener(new e(c2Var, container, view, this));
        view.startAnimation(n0Var);
        if (g1.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + c2Var + " has started.");
        }
    }
}
