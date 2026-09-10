package o4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends AnimatorListenerAdapter implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f47101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f47103c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47106f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f47104d = true;

    public c0(View view, int i10) {
        this.f47101a = view;
        this.f47102b = i10;
        this.f47103c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // o4.q
    public final void a() {
        f(false);
    }

    @Override // o4.q
    public final void c(r rVar) {
        if (!this.f47106f) {
            c cVar = y.f47176a;
            this.f47101a.setTransitionVisibility(this.f47102b);
            ViewGroup viewGroup = this.f47103c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        rVar.v(this);
    }

    @Override // o4.q
    public final void d() {
        f(true);
    }

    public final void f(boolean z10) {
        ViewGroup viewGroup;
        if (!this.f47104d || this.f47105e == z10 || (viewGroup = this.f47103c) == null) {
            return;
        }
        this.f47105e = z10;
        viewGroup.suppressLayout(z10);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f47106f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f47106f) {
            c cVar = y.f47176a;
            this.f47101a.setTransitionVisibility(this.f47102b);
            ViewGroup viewGroup = this.f47103c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f47106f) {
            return;
        }
        c cVar = y.f47176a;
        this.f47101a.setTransitionVisibility(this.f47102b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f47106f) {
            return;
        }
        c cVar = y.f47176a;
        this.f47101a.setTransitionVisibility(0);
    }

    @Override // o4.q
    public final void b() {
    }

    @Override // o4.q
    public final void e(r rVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
