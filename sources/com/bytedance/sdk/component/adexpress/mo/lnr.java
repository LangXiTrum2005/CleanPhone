package com.bytedance.sdk.component.adexpress.mo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.rc;

/* JADX INFO: loaded from: classes.dex */
public class lnr extends FrameLayout {
    private ImageView lnr;
    private TextView mml;
    private AnimatorSet mo;
    private yt mzz;
    private Context qdl;
    private ImageView ud;

    public lnr(Context context) {
        super(context);
        this.mo = new AnimatorSet();
        this.qdl = context;
        mzz();
        mo();
    }

    private void mo() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.lnr, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.lnr, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.mo.setDuration(800L);
        this.mo.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void mzz() {
        FrameLayout frameLayout = new FrameLayout(this.qdl);
        this.mzz = new yt(this.qdl);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 95.0f), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.mzz, layoutParams);
        this.ud = new ImageView(this.qdl);
        int iQdl = rc.qdl(this.qdl, 60.0f);
        this.ud.setImageDrawable(com.bytedance.sdk.component.adexpress.mml.jpc.qdl(1, null, null, new int[]{iQdl, iQdl}, Integer.valueOf(rc.qdl(this.qdl, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 75.0f), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.ud, layoutParams2);
        this.lnr = new ImageView(this.qdl);
        int iQdl2 = rc.qdl(this.qdl, 50.0f);
        this.lnr.setImageDrawable(com.bytedance.sdk.component.adexpress.mml.jpc.qdl(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{iQdl2, iQdl2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 63.0f), (int) com.bytedance.sdk.component.adexpress.mml.wd.qdl(this.qdl, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.lnr, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.qdl);
        this.mml = textView;
        textView.setTextColor(-1);
        this.mml.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.mml, layoutParams4);
    }

    public void lnr() {
        this.mzz.qdl();
    }

    public void mml() {
        this.mzz.ud();
        this.mzz.lnr();
    }

    public void qdl() {
        this.mo.start();
    }

    public void setGuideText(String str) {
        this.mml.setText(str);
    }

    public void ud() {
        this.mo.cancel();
    }
}
