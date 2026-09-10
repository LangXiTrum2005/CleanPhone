package com.bytedance.sdk.component.adexpress.lc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends FrameLayout {
    private AnimatorSet LD;
    private ImageView Lxb;

    public JXs(Context context) {
        super(context);
        lk();
        ZU();
    }

    private void ZU() {
        this.LD = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.Lxb, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.Lxb, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.LD.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void lk() {
        ImageView imageView = new ImageView(getContext());
        this.Lxb = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.tD.ZU(getContext(), "tt_white_hand"));
        int iLxb = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLxb, iLxb);
        layoutParams.gravity = 17;
        addView(this.Lxb, layoutParams);
    }

    public void LD() {
        AnimatorSet animatorSet = this.LD;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void Lxb() {
        AnimatorSet animatorSet = this.LD;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
