package com.google.android.material.navigationrail;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import com.unity3d.services.UnityAdsConstants;
import earstone.stratoscope;

/* JADX INFO: compiled from: LabelMoveTransition.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness extends Transition {
    @Override // androidx.transition.Transition
    public void apical(stratoscope stratoscopeVar) {
        stratoscopeVar.f25561attabal.put("NavigationRailLabelVisibility", Integer.valueOf(stratoscopeVar.f25563saneness.getVisibility()));
    }

    @Override // androidx.transition.Transition
    public Animator molybdenite(ViewGroup viewGroup, stratoscope stratoscopeVar, stratoscope stratoscopeVar2) {
        if (stratoscopeVar == null || stratoscopeVar2 == null || stratoscopeVar.f25561attabal.get("NavigationRailLabelVisibility") == null || stratoscopeVar2.f25561attabal.get("NavigationRailLabelVisibility") == null) {
            return super.molybdenite(viewGroup, stratoscopeVar, stratoscopeVar2);
        }
        if (((Integer) stratoscopeVar.f25561attabal.get("NavigationRailLabelVisibility")).intValue() != 8 || ((Integer) stratoscopeVar2.f25561attabal.get("NavigationRailLabelVisibility")).intValue() != 0) {
            return super.molybdenite(viewGroup, stratoscopeVar, stratoscopeVar2);
        }
        final View view = stratoscopeVar2.f25563saneness;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigationrail.attabal
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setTranslationX((1.0f - valueAnimator.getAnimatedFraction()) * (-30.0f));
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // androidx.transition.Transition
    public void triweekly(stratoscope stratoscopeVar) {
        stratoscopeVar.f25561attabal.put("NavigationRailLabelVisibility", Integer.valueOf(stratoscopeVar.f25563saneness.getVisibility()));
    }
}
