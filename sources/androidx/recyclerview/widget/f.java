package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4762a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f4763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f4764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f4766e;

    public f(k kVar, h1 h1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4766e = kVar;
        this.f4763b = h1Var;
        this.f4765d = viewPropertyAnimator;
        this.f4764c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f4762a) {
            case 1:
                this.f4764c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4762a) {
            case 0:
                this.f4765d.setListener(null);
                this.f4764c.setAlpha(1.0f);
                k kVar = this.f4766e;
                h1 h1Var = this.f4763b;
                kVar.c(h1Var);
                kVar.f4810q.remove(h1Var);
                kVar.i();
                break;
            default:
                this.f4765d.setListener(null);
                k kVar2 = this.f4766e;
                h1 h1Var2 = this.f4763b;
                kVar2.c(h1Var2);
                kVar2.f4808o.remove(h1Var2);
                kVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4762a) {
            case 0:
                this.f4766e.getClass();
                break;
            default:
                this.f4766e.getClass();
                break;
        }
    }

    public f(k kVar, h1 h1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4766e = kVar;
        this.f4763b = h1Var;
        this.f4764c = view;
        this.f4765d = viewPropertyAnimator;
    }
}
