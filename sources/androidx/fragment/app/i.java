package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f4353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimatorSet f4354d;

    public i(g gVar) {
        this.f4353c = gVar;
    }

    @Override // androidx.fragment.app.b2
    public final void b(ViewGroup container) {
        kotlin.jvm.internal.n.f(container, "container");
        AnimatorSet animatorSet = this.f4354d;
        g gVar = this.f4353c;
        if (animatorSet == null) {
            gVar.f4379a.c(this);
            return;
        }
        c2 c2Var = gVar.f4379a;
        if (c2Var.f4277g) {
            k.f4369a.a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (g1.J(2)) {
            StringBuilder sb2 = new StringBuilder("Animator from operation ");
            sb2.append(c2Var);
            sb2.append(" has been canceled");
            sb2.append(c2Var.f4277g ? " with seeking." : ".");
            sb2.append(' ');
            Log.v("FragmentManager", sb2.toString());
        }
    }

    @Override // androidx.fragment.app.b2
    public final void c(ViewGroup container) {
        kotlin.jvm.internal.n.f(container, "container");
        c2 c2Var = this.f4353c.f4379a;
        AnimatorSet animatorSet = this.f4354d;
        if (animatorSet == null) {
            c2Var.c(this);
            return;
        }
        animatorSet.start();
        if (g1.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + c2Var + " has started.");
        }
    }

    @Override // androidx.fragment.app.b2
    public final void d(f.a aVar, ViewGroup container) {
        kotlin.jvm.internal.n.f(container, "container");
        c2 c2Var = this.f4353c.f4379a;
        AnimatorSet animatorSet = this.f4354d;
        if (animatorSet == null) {
            c2Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !c2Var.f4273c.mTransitioning) {
            return;
        }
        if (g1.J(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + c2Var);
        }
        long jA = j.f4365a.a(animatorSet);
        long j10 = (long) (aVar.f40207c * jA);
        if (j10 == 0) {
            j10 = 1;
        }
        if (j10 == jA) {
            j10 = jA - 1;
        }
        if (g1.J(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j10 + " for Animator " + animatorSet + " on operation " + c2Var);
        }
        k.f4369a.b(animatorSet, j10);
    }

    @Override // androidx.fragment.app.b2
    public final void e(ViewGroup container) {
        i iVar;
        kotlin.jvm.internal.n.f(container, "container");
        g gVar = this.f4353c;
        if (gVar.a()) {
            return;
        }
        Context context = container.getContext();
        kotlin.jvm.internal.n.e(context, "context");
        m0 m0VarB = gVar.b(context);
        this.f4354d = m0VarB != null ? (AnimatorSet) m0VarB.f4385b : null;
        c2 c2Var = gVar.f4379a;
        Fragment fragment = c2Var.f4273c;
        boolean z10 = c2Var.f4271a == 3;
        View view = fragment.mView;
        container.startViewTransition(view);
        AnimatorSet animatorSet = this.f4354d;
        if (animatorSet != null) {
            iVar = this;
            animatorSet.addListener(new h(container, view, z10, c2Var, iVar));
        } else {
            iVar = this;
        }
        AnimatorSet animatorSet2 = iVar.f4354d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
