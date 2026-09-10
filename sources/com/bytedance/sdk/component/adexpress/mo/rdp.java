package com.bytedance.sdk.component.adexpress.mo;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class rdp extends FrameLayout {
    private mml lnr;
    private AnimatorSet mml;
    private TextView mo;
    private boolean mzz;
    private Context qdl;
    private ImageView ud;

    public rdp(Context context) {
        super(context);
        this.mzz = true;
        this.qdl = context;
        this.mml = new AnimatorSet();
        lnr();
        mml();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.mo.rdp.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rdp.this.ud.getLayoutParams();
                layoutParams.topMargin = ((int) ((rdp.this.lnr.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.mml.wd.qdl(rdp.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(rdp.this.qdl, 20.0f));
                layoutParams.leftMargin = ((int) ((rdp.this.lnr.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.mml.wd.qdl(rdp.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(rdp.this.qdl, 20.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.mml.wd.qdl(rdp.this.getContext(), 5.0f) + ((-rdp.this.lnr.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.mml.wd.qdl(rdp.this.getContext(), 5.0f) + ((-rdp.this.lnr.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                rdp.this.ud.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.mo.setText(str);
    }

    public void setGuideTextColor(int i2) {
        this.mo.setTextColor(i2);
    }

    private void lnr() {
        this.lnr = new mml(this.qdl);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 80.0f), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 20.0f);
        int iQdl = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 20.0f);
        layoutParams.leftMargin = iQdl;
        layoutParams.setMarginStart(iQdl);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.lnr, layoutParams);
        this.lnr.qdl();
        this.ud = new ImageView(this.qdl);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 80.0f), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 80.0f));
        this.ud.setImageResource(com.bytedance.sdk.component.utils.ljh.mml(this.qdl, "tt_splash_hand"));
        addView(this.ud, layoutParams2);
        TextView textView = new TextView(this.qdl);
        this.mo = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 10.0f);
        addView(this.mo, layoutParams3);
    }

    private void mml() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ud, "scaleX", 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.mo.rdp.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (rdp.this.mzz) {
                    rdp.this.lnr.qdl();
                    rdp.this.lnr.setAlpha(1.0f);
                } else {
                    rdp.this.lnr.ud();
                    rdp.this.lnr.setAlpha(0.0f);
                }
                rdp rdpVar = rdp.this;
                rdpVar.mzz = !rdpVar.mzz;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(rdp.this.ud, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                rdp.this.ud.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ud, "scaleY", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.mml.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void ud() {
        AnimatorSet animatorSet = this.mml;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            mmlVar.ud();
        }
    }

    public void qdl() {
        this.mml.start();
    }
}
