package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f4782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f4784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f4785e;

    public /* synthetic */ h(k kVar, i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f4781a = i10;
        this.f4785e = kVar;
        this.f4782b = iVar;
        this.f4783c = viewPropertyAnimator;
        this.f4784d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4781a) {
            case 0:
                this.f4783c.setListener(null);
                View view = this.f4784d;
                view.setAlpha(1.0f);
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i iVar = this.f4782b;
                h1 h1Var = iVar.f4786a;
                k kVar = this.f4785e;
                kVar.c(h1Var);
                kVar.f4811r.remove(iVar.f4786a);
                kVar.i();
                break;
            default:
                this.f4783c.setListener(null);
                View view2 = this.f4784d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i iVar2 = this.f4782b;
                h1 h1Var2 = iVar2.f4787b;
                k kVar2 = this.f4785e;
                kVar2.c(h1Var2);
                kVar2.f4811r.remove(iVar2.f4787b);
                kVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4781a) {
            case 0:
                h1 h1Var = this.f4782b.f4786a;
                this.f4785e.getClass();
                break;
            default:
                h1 h1Var2 = this.f4782b.f4787b;
                this.f4785e.getClass();
                break;
        }
    }
}
