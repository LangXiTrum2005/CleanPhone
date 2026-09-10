package com.bytedance.sdk.component.adexpress.mo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class jpc extends oth {
    private ImageView lnr;
    private ImageView mml;
    private AnimatorSet mo;
    private int mzz;
    private TextView qdl;
    private ImageView ud;

    public jpc(Context context) {
        super(context);
        this.mo = new AnimatorSet();
        ud(context);
    }

    private void mml() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    private void ud(Context context) {
        addView(com.bytedance.sdk.component.adexpress.lnr.qdl.ud(context));
        this.ud = (ImageView) findViewById(2097610751);
        this.lnr = (ImageView) findViewById(2097610750);
        this.mml = (ImageView) findViewById(2097610749);
        this.qdl = (TextView) findViewById(2097610748);
    }

    public float getAlphaColor() {
        return this.mzz;
    }

    @Override // com.bytedance.sdk.component.adexpress.mo.oth
    public void qdl(Context context) {
    }

    public void setAlphaColor(int i2) {
        if (i2 < 0 || i2 > 60) {
            return;
        }
        int i3 = i2 + 195;
        ImageView imageView = this.mml;
        int iRgb = Color.rgb(i3, i3, i3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(iRgb, mode);
        int i4 = ((i2 + 20) % 60) + 195;
        this.lnr.setColorFilter(Color.rgb(i4, i4, i4), mode);
        int i5 = ((i2 + 40) % 60) + 195;
        this.ud.setColorFilter(Color.rgb(i5, i5, i5), mode);
    }

    public void setButtonText(String str) {
        if (this.qdl == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.qdl.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.mo.oth
    public void qdl() {
        mml();
    }

    @Override // com.bytedance.sdk.component.adexpress.mo.oth
    public void ud() {
        this.mo.cancel();
    }
}
