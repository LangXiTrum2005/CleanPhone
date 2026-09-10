package com.bytedance.sdk.component.adexpress.lc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes2.dex */
public class HD extends RelativeLayout {
    private int JVA;
    private TextView JXs;
    private ImageView LD;
    private ImageView Lxb;
    private AnimatorSet OY;
    private AnimatorSet QAg;
    private TextView ZU;
    private AnimatorSet ebl;
    private AnimatorSet lc;
    private ImageView lk;
    private String nBu;

    public HD(Context context) {
        super(context);
        this.lc = new AnimatorSet();
        this.ebl = new AnimatorSet();
        this.OY = new AnimatorSet();
        this.QAg = new AnimatorSet();
        this.JVA = 100;
        Lxb(context);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.lc;
    }

    public void lk() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.Lxb, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.Lxb, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.Lxb, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), -this.JVA));
        objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), this.JVA));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.lc.HD.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (HD.this.lk != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) HD.this.lk.getLayoutParams();
                    layoutParams.height = num.intValue();
                    HD.this.lk.setLayoutParams(layoutParams);
                }
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.lk, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.lk, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.LD, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.LD, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.LD, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.LD, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.LD, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), -this.JVA));
        objectAnimatorOfFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.ebl.setDuration(50L);
        this.QAg.setDuration(1500L);
        this.OY.setDuration(50L);
        this.ebl.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.OY.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.QAg.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt, objectAnimatorOfFloat10);
        this.lc.playSequentially(this.OY, this.QAg, this.ebl);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LD();
    }

    public void setGuideText(String str) {
        TextView textView = this.ZU;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.JXs != null) {
            if (TextUtils.isEmpty(str)) {
                this.JXs.setText("");
            } else {
                this.JXs.setText(str);
            }
        }
    }

    public void LD() {
        try {
            AnimatorSet animatorSet = this.lc;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.OY;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.ebl;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.QAg;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.LD(e.getMessage());
        }
    }

    public void Lxb(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ZU.Lxb();
        }
        if (CampaignEx.CLICKMODE_ON.equals(this.nBu)) {
            addView(com.bytedance.sdk.component.adexpress.lk.Lxb.lc(context));
            this.JVA = (int) (((double) this.JVA) * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.lk.Lxb.JXs(context));
        }
        this.Lxb = (ImageView) findViewById(2097610734);
        this.LD = (ImageView) findViewById(2097610735);
        this.ZU = (TextView) findViewById(2097610730);
        this.lk = (ImageView) findViewById(2097610733);
        this.JXs = (TextView) findViewById(2097610731);
    }

    public HD(Context context, String str) {
        super(context);
        this.lc = new AnimatorSet();
        this.ebl = new AnimatorSet();
        this.OY = new AnimatorSet();
        this.QAg = new AnimatorSet();
        this.JVA = 100;
        setClipChildren(false);
        this.nBu = str;
        Lxb(context);
    }

    public void Lxb() {
        lk();
        this.lc.start();
        this.lc.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.lc.HD.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                HD.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.lc.HD.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        HD.this.lc.start();
                    }
                }, 200L);
            }
        });
    }
}
