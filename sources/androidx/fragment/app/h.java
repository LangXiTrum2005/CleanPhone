package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c2 f4350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f4351e;

    public h(ViewGroup viewGroup, View view, boolean z10, c2 c2Var, i iVar) {
        this.f4347a = viewGroup;
        this.f4348b = view;
        this.f4349c = z10;
        this.f4350d = c2Var;
        this.f4351e = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        kotlin.jvm.internal.n.f(anim, "anim");
        ViewGroup viewGroup = this.f4347a;
        View viewToAnimate = this.f4348b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z10 = this.f4349c;
        c2 c2Var = this.f4350d;
        if (z10 || c2Var.f4271a == 3) {
            int i10 = c2Var.f4271a;
            kotlin.jvm.internal.n.e(viewToAnimate, "viewToAnimate");
            defpackage.e.a(i10, viewToAnimate, viewGroup);
        }
        i iVar = this.f4351e;
        iVar.f4353c.f4379a.c(iVar);
        if (g1.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + c2Var + " has ended.");
        }
    }
}
