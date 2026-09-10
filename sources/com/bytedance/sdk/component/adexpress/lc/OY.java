package com.bytedance.sdk.component.adexpress.lc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class OY extends HD {
    private int JXs;
    private ImageView LD;
    private TextView Lxb;
    private ImageView ZU;
    private AnimatorSet lc;
    private ImageView lk;

    public OY(Context context) {
        super(context);
        this.lc = new AnimatorSet();
        LD(context);
    }

    private void LD(Context context) {
        addView(com.bytedance.sdk.component.adexpress.lk.Lxb.LD(context));
        this.LD = (ImageView) findViewById(2097610751);
        this.lk = (ImageView) findViewById(2097610750);
        this.ZU = (ImageView) findViewById(2097610749);
        this.Lxb = (TextView) findViewById(2097610748);
    }

    private void ZU() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    @Override // com.bytedance.sdk.component.adexpress.lc.HD
    public void Lxb(Context context) {
    }

    public float getAlphaColor() {
        return this.JXs;
    }

    public void setAlphaColor(int i) {
        if (i < 0 || i > 60) {
            return;
        }
        int i2 = i + 195;
        ImageView imageView = this.ZU;
        int iRgb = Color.rgb(i2, i2, i2);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(iRgb, mode);
        int i3 = ((i + 20) % 60) + 195;
        this.lk.setColorFilter(Color.rgb(i3, i3, i3), mode);
        int i4 = ((i + 40) % 60) + 195;
        this.LD.setColorFilter(Color.rgb(i4, i4, i4), mode);
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
        this.lc.cancel();
    }
}
