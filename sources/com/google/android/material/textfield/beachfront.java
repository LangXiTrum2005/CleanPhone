package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.unity3d.services.UnityAdsConstants;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public class beachfront extends graveside {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final View.OnFocusChangeListener f21144apical;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f21145beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final TimeInterpolator f21146competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final View.OnClickListener f21147cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public AnimatorSet f21148formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public ValueAnimator f21149impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final TimeInterpolator f21150impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f21151marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public EditText f21152taiyuan;

    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    public class attabal extends AnimatorListenerAdapter {
        public attabal() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            beachfront.this.f21204saneness.itchy(true);
        }
    }

    /* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
    public class saneness extends AnimatorListenerAdapter {
        public saneness() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            beachfront.this.f21204saneness.itchy(false);
        }
    }

    public beachfront(molybdenite molybdeniteVar) {
        super(molybdeniteVar);
        this.f21147cutely = new View.OnClickListener() { // from class: com.google.android.material.textfield.attabal
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                beachfront.dovishness(this.f21143kowloon, view);
            }
        };
        this.f21144apical = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.saneness
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                beachfront beachfrontVar = this.f21261kowloon;
                beachfrontVar.cuirassed(beachfrontVar.yemenite());
            }
        };
        this.f21151marial = gown.apical.beachfront(molybdeniteVar.getContext(), bubbles.dern.motionDurationShort3, 100);
        this.f21145beachfront = gown.apical.beachfront(molybdeniteVar.getContext(), bubbles.dern.motionDurationShort3, Opcodes.FCMPG);
        this.f21146competently = gown.apical.competently(molybdeniteVar.getContext(), bubbles.dern.motionEasingLinearInterpolator, phrasemonger.saneness.f35307attabal);
        this.f21150impromptu = gown.apical.competently(molybdeniteVar.getContext(), bubbles.dern.motionEasingEmphasizedInterpolator, phrasemonger.saneness.f35311wireman);
    }

    public static /* synthetic */ void dovishness(beachfront beachfrontVar, View view) {
        EditText editText = beachfrontVar.f21152taiyuan;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        beachfrontVar.polloi();
    }

    public static /* synthetic */ void preprohormone(beachfront beachfrontVar, ValueAnimator valueAnimator) {
        beachfrontVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        beachfrontVar.f21205wireman.setScaleX(fFloatValue);
        beachfrontVar.f21205wireman.setScaleY(fFloatValue);
    }

    public static /* synthetic */ void rotuma(beachfront beachfrontVar, ValueAnimator valueAnimator) {
        beachfrontVar.getClass();
        beachfrontVar.f21205wireman.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // com.google.android.material.textfield.graveside
    public void adultoid() {
        EditText editText = this.f21152taiyuan;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.wireman
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21264kowloon.cuirassed(true);
                }
            });
        }
    }

    @Override // com.google.android.material.textfield.graveside
    public void attabal(Editable editable) {
        if (this.f21204saneness.preprohormone() != null) {
            return;
        }
        cuirassed(yemenite());
    }

    @Override // com.google.android.material.textfield.graveside
    public View.OnClickListener beachfront() {
        return this.f21147cutely;
    }

    @Override // com.google.android.material.textfield.graveside
    public View.OnFocusChangeListener competently() {
        return this.f21144apical;
    }

    public final void cuirassed(boolean z) {
        boolean z2 = this.f21204saneness.restrictive() == z;
        if (z && !this.f21148formularize.isRunning()) {
            this.f21149impassible.cancel();
            this.f21148formularize.start();
            if (z2) {
                this.f21148formularize.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f21148formularize.cancel();
        this.f21149impassible.start();
        if (z2) {
            this.f21149impassible.end();
        }
    }

    @Override // com.google.android.material.textfield.graveside
    public int dern() {
        return bubbles.apical.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.graveside
    public View.OnFocusChangeListener marial() {
        return this.f21144apical;
    }

    @Override // com.google.android.material.textfield.graveside
    public void molybdenite() {
        oilcan();
    }

    @Override // com.google.android.material.textfield.graveside
    public void monoploid(boolean z) {
        if (this.f21204saneness.preprohormone() == null) {
            return;
        }
        cuirassed(z);
    }

    public final void oilcan() {
        ValueAnimator valueAnimatorTrm = trm();
        ValueAnimator valueAnimatorStratoscope = stratoscope(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f21148formularize = animatorSet;
        animatorSet.playTogether(valueAnimatorTrm, valueAnimatorStratoscope);
        this.f21148formularize.addListener(new attabal());
        ValueAnimator valueAnimatorStratoscope2 = stratoscope(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f21149impassible = valueAnimatorStratoscope2;
        valueAnimatorStratoscope2.addListener(new saneness());
    }

    public final ValueAnimator stratoscope(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f21146competently);
        valueAnimatorOfFloat.setDuration(this.f21151marial);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.dern
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                beachfront.rotuma(this.f21166attabal, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.textfield.graveside
    public void triweekly(EditText editText) {
        this.f21152taiyuan = editText;
        this.f21202attabal.setEndIconVisible(yemenite());
    }

    public final ValueAnimator trm() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f21150impromptu);
        valueAnimatorOfFloat.setDuration(this.f21145beachfront);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.marial
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                beachfront.preprohormone(this.f21210attabal, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.textfield.graveside
    public int wireman() {
        return bubbles.beachfront.mtrl_ic_cancel;
    }

    public final boolean yemenite() {
        EditText editText = this.f21152taiyuan;
        if (editText != null) {
            return (editText.hasFocus() || this.f21205wireman.hasFocus()) && this.f21152taiyuan.getText().length() > 0;
        }
        return false;
    }
}
