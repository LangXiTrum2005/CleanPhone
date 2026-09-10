package com.bytedance.sdk.component.adexpress.lc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends FrameLayout {
    private kqm JXs;
    private ImageView LD;
    private Context Lxb;
    private TextView ZU;
    private AnimatorSet lc;
    private ImageView lk;

    public lk(@NonNull Context context) {
        super(context);
        this.lc = new AnimatorSet();
        this.Lxb = context;
        JXs();
        lc();
    }

    private void JXs() {
        FrameLayout frameLayout = new FrameLayout(this.Lxb);
        this.JXs = new kqm(this.Lxb);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 95.0f), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.JXs, layoutParams);
        this.LD = new ImageView(this.Lxb);
        int iLxb = com.bytedance.sdk.component.utils.CSn.Lxb(this.Lxb, 60.0f);
        this.LD.setImageDrawable(com.bytedance.sdk.component.adexpress.ZU.QAg.Lxb(1, null, null, new int[]{iLxb, iLxb}, Integer.valueOf(com.bytedance.sdk.component.utils.CSn.Lxb(this.Lxb, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 75.0f), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.LD, layoutParams2);
        this.lk = new ImageView(this.Lxb);
        int iLxb2 = com.bytedance.sdk.component.utils.CSn.Lxb(this.Lxb, 50.0f);
        this.lk.setImageDrawable(com.bytedance.sdk.component.adexpress.ZU.QAg.Lxb(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{iLxb2, iLxb2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 63.0f), (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.Lxb, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.lk, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.Lxb);
        this.ZU = textView;
        textView.setTextColor(-1);
        this.ZU.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.ZU, layoutParams4);
    }

    private void lc() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.lk, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.lk, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.lc.setDuration(800L);
        this.lc.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void LD() {
        this.lc.cancel();
    }

    public void Lxb() {
        this.lc.start();
    }

    public void ZU() {
        this.JXs.LD();
        this.JXs.lk();
    }

    public void lk() {
        this.JXs.Lxb();
    }

    public void setGuideText(String str) {
        this.ZU.setText(str);
    }
}
