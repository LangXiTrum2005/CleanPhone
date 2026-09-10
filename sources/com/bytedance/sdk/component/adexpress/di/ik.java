package com.bytedance.sdk.component.adexpress.di;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.dw;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends FrameLayout {
    private AnimatorSet di;
    private slm fi;
    private ImageView ik;
    private TextView ka;
    private ImageView lr;
    private Context ri;

    public ik(Context context) {
        super(context);
        this.di = new AnimatorSet();
        this.ri = context;
        fi();
        di();
    }

    private void di() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ik, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ik, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.di.setDuration(800L);
        this.di.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void fi() {
        FrameLayout frameLayout = new FrameLayout(this.ri);
        this.fi = new slm(this.ri);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 95.0f), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.fi, layoutParams);
        this.lr = new ImageView(this.ri);
        int iRi = dw.ri(this.ri, 60.0f);
        this.lr.setImageDrawable(com.bytedance.sdk.component.adexpress.ka.mj.ri(1, null, null, new int[]{iRi, iRi}, Integer.valueOf(dw.ri(this.ri, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 75.0f), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.lr, layoutParams2);
        this.ik = new ImageView(this.ri);
        int iRi2 = dw.ri(this.ri, 50.0f);
        this.ik.setImageDrawable(com.bytedance.sdk.component.adexpress.ka.mj.ri(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{iRi2, iRi2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 63.0f), (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.ri, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.ik, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.ri);
        this.ka = textView;
        textView.setTextColor(-1);
        this.ka.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.ka, layoutParams4);
    }

    public void ik() {
        this.fi.ri();
    }

    public void ka() {
        this.fi.lr();
        this.fi.ik();
    }

    public void lr() {
        this.di.cancel();
    }

    public void ri() {
        this.di.start();
    }

    public void setGuideText(String str) {
        this.ka.setText(str);
    }
}
