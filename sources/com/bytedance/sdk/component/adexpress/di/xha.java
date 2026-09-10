package com.bytedance.sdk.component.adexpress.di;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends ihz {
    private AnimatorSet ik;
    private View lr;
    private TextView ri;

    public xha(Context context) {
        super(context);
        this.ik = new AnimatorSet();
        lr(context);
    }

    private void ka() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.lr, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.ka.xha.ri(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.lr, "alpha", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.ik.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.ik.setDuration(1000L);
        this.ik.start();
    }

    private void lr(Context context) {
        View viewRi = com.bytedance.sdk.component.adexpress.ik.ri.ri(context);
        this.lr = viewRi;
        addView(viewRi);
        setClipChildren(false);
        this.ri = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.di.ihz
    public void ri(Context context) {
    }

    public void setButtonText(String str) {
        if (this.ri == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.ri.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.di.ihz
    public void ri() {
        ka();
    }

    @Override // com.bytedance.sdk.component.adexpress.di.ihz
    public void lr() {
        this.ik.cancel();
    }
}
