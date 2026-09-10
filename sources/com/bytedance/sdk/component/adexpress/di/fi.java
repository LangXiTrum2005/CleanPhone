package com.bytedance.sdk.component.adexpress.di;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends FrameLayout {
    private AnimatorSet lr;
    private ImageView ri;

    public fi(Context context) {
        super(context);
        ik();
        ka();
    }

    private void ik() {
        ImageView imageView = new ImageView(getContext());
        this.ri = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.uq.ka(getContext(), "tt_white_hand"));
        int iRi = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iRi, iRi);
        layoutParams.gravity = 17;
        addView(this.ri, layoutParams);
    }

    private void ka() {
        this.lr = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ri, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ri, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.lr.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void lr() {
        AnimatorSet animatorSet = this.lr;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void ri() {
        AnimatorSet animatorSet = this.lr;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
