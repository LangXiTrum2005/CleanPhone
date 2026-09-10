package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import atria.beachfront;
import atria.wireman;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import gown.apical;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes3.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f19610adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public AccessibilityManager f19611arytenoidectomy;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public int f19612cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public ViewPropertyAnimator f19613cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public TimeInterpolator f19614dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public TimeInterpolator f19615gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public int f19616graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public beachfront f19617kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final LinkedHashSet<dern> f19618molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f19619monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f19620polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public int f19621preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public int f19622rotuma;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public boolean f19623stratoscope;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static final int f19608trm = bubbles.dern.motionDurationLong2;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public static final int f19607oilcan = bubbles.dern.motionDurationMedium4;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public static final int f19609yemenite = bubbles.dern.motionEasingEmphasizedInterpolator;

    public interface dern {
        void attabal(View view, int i);
    }

    public class saneness extends AnimatorListenerAdapter {
        public saneness() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior.this.f19613cuirassed = null;
        }
    }

    public HideViewOnScrollBehavior() {
        this.f19620polloi = true;
        this.f19618molybdenite = new LinkedHashSet<>();
        this.f19622rotuma = 0;
        this.f19621preprohormone = 2;
        this.f19612cord = 0;
        this.f19623stratoscope = false;
    }

    private void merc(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f19613cuirassed = this.f19617kowloon.wireman(v, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new saneness());
    }

    private void polder(final V v) {
        if (this.f19611arytenoidectomy == null) {
            this.f19611arytenoidectomy = (AccessibilityManager) picketboat.saneness.getSystemService(v.getContext(), AccessibilityManager.class);
        }
        if (this.f19611arytenoidectomy == null || this.f19619monoploid != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: atria.marial
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                HideViewOnScrollBehavior.yemenite(this.f14737attabal, v, z);
            }
        };
        this.f19619monoploid = touchExplorationStateChangeListener;
        this.f19611arytenoidectomy.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        v.addOnAttachStateChangeListener(new attabal());
    }

    private void splinterproof(V v, int i) {
        this.f19621preprohormone = i;
        Iterator<dern> it = this.f19618molybdenite.iterator();
        while (it.hasNext()) {
            it.next().attabal(v, this.f19621preprohormone);
        }
    }

    public static /* synthetic */ void yemenite(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view, boolean z) {
        if (hideViewOnScrollBehavior.f19620polloi && z && hideViewOnScrollBehavior.privatdozent()) {
            hideViewOnScrollBehavior.hydrovane(view);
        }
    }

    public final void creditor(V v, int i) {
        if (this.f19623stratoscope) {
            return;
        }
        int i2 = ((CoordinatorLayout.marial) v.getLayoutParams()).f9093dern;
        if (seminary(i2)) {
            starveling(1);
        } else {
            starveling(grimness(Gravity.getAbsoluteGravity(i2, i)) ? 2 : 0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean cuirassed(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean formularize(CoordinatorLayout coordinatorLayout, V v, int i) {
        polder(v);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        creditor(v, i);
        this.f19622rotuma = this.f19617kowloon.attabal(v, marginLayoutParams);
        this.f19616graveside = apical.beachfront(v.getContext(), f19608trm, Sdk$SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        this.f19610adultoid = apical.beachfront(v.getContext(), f19607oilcan, Opcodes.DRETURN);
        Context context = v.getContext();
        int i2 = f19609yemenite;
        this.f19614dovishness = apical.competently(context, i2, phrasemonger.saneness.f35311wireman);
        this.f19615gintrap = apical.competently(v.getContext(), i2, phrasemonger.saneness.f35308dern);
        return super.formularize(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void graveside(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            peridotite(v);
        } else if (i2 < 0) {
            hydrovane(v);
        }
    }

    public final boolean grimness(int i) {
        return i == 3 || i == 19;
    }

    public void hydrovane(V v) {
        walach(v, true);
    }

    public void mathsort(V v, boolean z) {
        AccessibilityManager accessibilityManager;
        if (privatdozent()) {
            return;
        }
        if (this.f19620polloi && (accessibilityManager = this.f19611arytenoidectomy) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f19613cuirassed;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        splinterproof(v, 1);
        int i = this.f19622rotuma + this.f19612cord;
        if (z) {
            merc(v, i, this.f19610adultoid, this.f19615gintrap);
        } else {
            this.f19617kowloon.marial(v, i);
        }
    }

    public void peridotite(V v) {
        mathsort(v, true);
    }

    public boolean privatdozent() {
        return this.f19621preprohormone == 1;
    }

    public boolean saran() {
        return this.f19621preprohormone == 2;
    }

    public final boolean seminary(int i) {
        return i == 80 || i == 81;
    }

    public final void starveling(int i) {
        beachfront beachfrontVar = this.f19617kowloon;
        if (beachfrontVar == null || beachfrontVar.dern() != i) {
            if (i == 0) {
                this.f19617kowloon = new wireman();
                return;
            }
            if (i == 1) {
                this.f19617kowloon = new atria.saneness();
                return;
            }
            if (i == 2) {
                this.f19617kowloon = new atria.dern();
                return;
            }
            throw new IllegalArgumentException("Invalid view edge position value: " + i + ". Must be 0, 1 or 2.");
        }
    }

    public void walach(V v, boolean z) {
        if (saran()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f19613cuirassed;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        splinterproof(v, 2);
        int iSaneness = this.f19617kowloon.saneness();
        if (z) {
            merc(v, iSaneness, this.f19616graveside, this.f19614dovishness);
        } else {
            this.f19617kowloon.marial(v, iSaneness);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19620polloi = true;
        this.f19618molybdenite = new LinkedHashSet<>();
        this.f19622rotuma = 0;
        this.f19621preprohormone = 2;
        this.f19612cord = 0;
        this.f19623stratoscope = false;
    }

    public class attabal implements View.OnAttachStateChangeListener {
        public attabal() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideViewOnScrollBehavior.this.f19619monoploid == null || HideViewOnScrollBehavior.this.f19611arytenoidectomy == null) {
                return;
            }
            HideViewOnScrollBehavior.this.f19611arytenoidectomy.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.f19619monoploid);
            HideViewOnScrollBehavior.this.f19619monoploid = null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
