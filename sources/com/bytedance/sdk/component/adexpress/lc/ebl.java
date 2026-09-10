package com.bytedance.sdk.component.adexpress.lc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class ebl extends HD {
    private View LD;
    private TextView Lxb;
    private AnimatorSet lk;

    public ebl(Context context) {
        super(context);
        this.lk = new AnimatorSet();
        LD(context);
    }

    private void LD(Context context) {
        View viewLxb = com.bytedance.sdk.component.adexpress.lk.Lxb.Lxb(context);
        this.LD = viewLxb;
        addView(viewLxb);
        setClipChildren(false);
        this.Lxb = (TextView) findViewById(2097610748);
    }

    private void ZU() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LD, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LD, "alpha", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.lk.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.lk.setDuration(1000L);
        this.lk.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.lc.HD
    public void Lxb(Context context) {
    }

    public void setButtonText(String str) {
        if (this.Lxb == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.Lxb.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.lc.HD
    public void Lxb() {
        ZU();
    }

    @Override // com.bytedance.sdk.component.adexpress.lc.HD
    public void LD() {
        this.lk.cancel();
    }
}
