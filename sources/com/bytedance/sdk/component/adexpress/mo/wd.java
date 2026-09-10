package com.bytedance.sdk.component.adexpress.mo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class wd extends oth {
    private AnimatorSet lnr;
    private TextView qdl;
    private View ud;

    public wd(Context context) {
        super(context);
        this.lnr = new AnimatorSet();
        ud(context);
    }

    private void mml() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ud, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.mml.wd.qdl(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.ud, "alpha", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.lnr.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.lnr.setDuration(1000L);
        this.lnr.start();
    }

    private void ud(Context context) {
        View viewQdl = com.bytedance.sdk.component.adexpress.lnr.qdl.qdl(context);
        this.ud = viewQdl;
        addView(viewQdl);
        setClipChildren(false);
        this.qdl = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.mo.oth
    public void qdl(Context context) {
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
        this.lnr.cancel();
    }
}
