package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4829a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4830b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4831c;

    public n(View view) {
        this.f4831c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f4829a) {
            case 0:
                this.f4830b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f4829a;
        Object obj = this.f4831c;
        switch (i10) {
            case 0:
                p pVar = (p) obj;
                if (this.f4830b) {
                    this.f4830b = false;
                } else if (((Float) pVar.f4880z.getAnimatedValue()).floatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    pVar.A = 2;
                    pVar.f4873s.invalidate();
                } else {
                    pVar.A = 0;
                    pVar.e(0);
                }
                break;
            default:
                View view = (View) obj;
                o4.c cVar = o4.y.f47176a;
                view.setTransitionAlpha(1.0f);
                if (this.f4830b) {
                    view.setLayerType(0, null);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f4829a) {
            case 1:
                View view = (View) this.f4831c;
                WeakHashMap weakHashMap = m0.s0.f45746a;
                if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                    this.f4830b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public n(p pVar) {
        this.f4831c = pVar;
    }
}
