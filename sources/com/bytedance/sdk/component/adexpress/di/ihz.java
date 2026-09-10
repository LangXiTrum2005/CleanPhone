package com.bytedance.sdk.component.adexpress.di;

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
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ihz extends RelativeLayout {
    private AnimatorSet di;
    private TextView fi;
    private ImageView ik;
    private AnimatorSet jbs;
    private TextView ka;
    private ImageView lr;
    private AnimatorSet mj;
    private String qt;
    private ImageView ri;
    private int sf;
    private AnimatorSet xha;

    public ihz(Context context) {
        super(context);
        this.di = new AnimatorSet();
        this.xha = new AnimatorSet();
        this.mj = new AnimatorSet();
        this.jbs = new AnimatorSet();
        this.sf = 100;
        ri(context);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.di;
    }

    public void ik() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ri, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ri, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.ri, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), -this.sf));
        objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), this.sf));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.di.ihz.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (ihz.this.ik != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ihz.this.ik.getLayoutParams();
                    layoutParams.height = num.intValue();
                    ihz.this.ik.setLayoutParams(layoutParams);
                }
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.ik, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.ik, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.lr, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.lr, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.lr, "scaleX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.lr, "scaleY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.lr, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), -this.sf));
        objectAnimatorOfFloat10.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        this.xha.setDuration(50L);
        this.jbs.setDuration(1500L);
        this.mj.setDuration(50L);
        this.xha.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.mj.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.jbs.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt, objectAnimatorOfFloat10);
        this.di.playSequentially(this.mj, this.jbs, this.xha);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lr();
    }

    public void setGuideText(String str) {
        TextView textView = this.ka;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.fi != null) {
            if (TextUtils.isEmpty(str)) {
                this.fi.setText("");
            } else {
                this.fi.setText(str);
            }
        }
    }

    public void lr() {
        try {
            AnimatorSet animatorSet = this.di;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.mj;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.xha;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.jbs;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void ri(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ka.ri();
        }
        if (CampaignEx.CLICKMODE_ON.equals(this.qt)) {
            addView(com.bytedance.sdk.component.adexpress.ik.ri.di(context));
            this.sf = (int) (((double) this.sf) * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.ik.ri.fi(context));
        }
        this.ri = (ImageView) findViewById(2097610734);
        this.lr = (ImageView) findViewById(2097610735);
        this.ka = (TextView) findViewById(2097610730);
        this.ik = (ImageView) findViewById(2097610733);
        this.fi = (TextView) findViewById(2097610731);
    }

    public ihz(Context context, String str) {
        super(context);
        this.di = new AnimatorSet();
        this.xha = new AnimatorSet();
        this.mj = new AnimatorSet();
        this.jbs = new AnimatorSet();
        this.sf = 100;
        setClipChildren(false);
        this.qt = str;
        ri(context);
    }

    public void ri() {
        ik();
        this.di.start();
        this.di.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.di.ihz.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ihz.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.di.ihz.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ihz.this.di.start();
                    }
                }, 200L);
            }
        });
    }
}
