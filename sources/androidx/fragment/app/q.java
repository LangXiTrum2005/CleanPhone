package androidx.fragment.app;

import android.transition.Transition;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(c2 c2Var, boolean z10, boolean z11) {
        super(c2Var);
        Fragment fragment = c2Var.f4273c;
        this.f4439b = c2Var.f4271a == 2 ? z10 ? fragment.getReenterTransition() : fragment.getEnterTransition() : z10 ? fragment.getReturnTransition() : fragment.getExitTransition();
        this.f4440c = c2Var.f4271a == 2 ? z10 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
        this.f4441d = z11 ? z10 ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
    }

    public final y1 b() {
        Object obj = this.f4439b;
        y1 y1VarC = c(obj);
        Object obj2 = this.f4441d;
        y1 y1VarC2 = c(obj2);
        if (y1VarC == null || y1VarC2 == null || y1VarC == y1VarC2) {
            return y1VarC == null ? y1VarC2 : y1VarC;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f4379a.f4273c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final y1 c(Object obj) {
        if (obj == null) {
            return null;
        }
        w1 w1Var = r1.f4463a;
        if (obj instanceof Transition) {
            return w1Var;
        }
        y1 y1Var = r1.f4464b;
        if (y1Var != null && y1Var.e(obj)) {
            return y1Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f4379a.f4273c + " is not a valid framework Transition or AndroidX Transition");
    }
}
