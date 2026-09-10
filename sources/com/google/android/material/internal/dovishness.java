package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import java.util.Map;

/* JADX INFO: compiled from: TextScale.java */
/* JADX INFO: loaded from: classes3.dex */
public class dovishness extends Transition {

    /* JADX INFO: compiled from: TextScale.java */
    public class attabal implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ TextView f20452attabal;

        public attabal(TextView textView) {
            this.f20452attabal = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f20452attabal.setScaleX(fFloatValue);
            this.f20452attabal.setScaleY(fFloatValue);
        }
    }

    private void hardpan(earstone.stratoscope stratoscopeVar) {
        View view = stratoscopeVar.f25563saneness;
        if (view instanceof TextView) {
            stratoscopeVar.f25561attabal.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    public void apical(earstone.stratoscope stratoscopeVar) {
        hardpan(stratoscopeVar);
    }

    @Override // androidx.transition.Transition
    public Animator molybdenite(ViewGroup viewGroup, earstone.stratoscope stratoscopeVar, earstone.stratoscope stratoscopeVar2) {
        if (stratoscopeVar == null || stratoscopeVar2 == null || !(stratoscopeVar.f25563saneness instanceof TextView)) {
            return null;
        }
        View view = stratoscopeVar2.f25563saneness;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = stratoscopeVar.f25561attabal;
        Map<String, Object> map2 = stratoscopeVar2.f25561attabal;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new attabal(textView));
        return valueAnimatorOfFloat;
    }

    @Override // androidx.transition.Transition
    public void triweekly(earstone.stratoscope stratoscopeVar) {
        hardpan(stratoscopeVar);
    }
}
