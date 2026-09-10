package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45756a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45758c;

    public v0(x0 x0Var, View view) {
        this.f45757b = x0Var;
        this.f45758c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f45756a) {
            case 0:
                ((x0) this.f45757b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45756a) {
            case 0:
                ((x0) this.f45757b).c();
                break;
            default:
                ((x.e) this.f45757b).remove(animator);
                ((o4.r) this.f45758c).f47154k.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f45756a) {
            case 0:
                ((x0) this.f45757b).b();
                break;
            default:
                ((o4.r) this.f45758c).f47154k.add(animator);
                break;
        }
    }

    public v0(o4.r rVar, x.e eVar) {
        this.f45758c = rVar;
        this.f45757b = eVar;
    }
}
