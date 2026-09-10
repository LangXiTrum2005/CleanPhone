package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: loaded from: classes4.dex */
class ClearTextEndIconDelegate extends EndIconDelegate {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19497e;
    public final int f;
    public final TimeInterpolator g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f19498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f19499i;
    public final a j;
    public final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f19500l;
    public ValueAnimator m;

    public ClearTextEndIconDelegate(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.j = new a(this, 0);
        this.k = new b(this, 0);
        this.f19497e = MotionUtils.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 100);
        this.f = MotionUtils.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 150);
        this.g = MotionUtils.d(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.f19078a);
        this.f19498h = MotionUtils.d(endCompoundLayout.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.d);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void a() {
        if (this.f19512b.t0 != null) {
            return;
        }
        t(u());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void m(EditText editText) {
        this.f19499i = editText;
        this.f19511a.setEndIconVisible(u());
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void p(boolean z2) {
        if (this.f19512b.t0 == null) {
            return;
        }
        t(z2);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f19498h);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new c(this, 1));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f19497e;
        valueAnimatorOfFloat2.setDuration(i2);
        valueAnimatorOfFloat2.addUpdateListener(new c(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f19500l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f19500l.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                ClearTextEndIconDelegate.this.f19512b.h(true);
            }
        });
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new c(this, 0));
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ClearTextEndIconDelegate.this.f19512b.h(false);
            }
        });
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void s() {
        EditText editText = this.f19499i;
        if (editText != null) {
            editText.post(new d(this, 0));
        }
    }

    public final void t(boolean z2) {
        boolean z3 = this.f19512b.d() == z2;
        if (z2 && !this.f19500l.isRunning()) {
            this.m.cancel();
            this.f19500l.start();
            if (z3) {
                this.f19500l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f19500l.cancel();
        this.m.start();
        if (z3) {
            this.m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f19499i;
        if (editText != null) {
            return (editText.hasFocus() || this.d.hasFocus()) && this.f19499i.getText().length() > 0;
        }
        return false;
    }
}
