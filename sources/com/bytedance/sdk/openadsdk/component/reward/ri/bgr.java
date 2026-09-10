package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.ironsource.Ua;

/* JADX INFO: loaded from: classes2.dex */
public class bgr {
    private com.bytedance.sdk.openadsdk.core.widget.xha di;
    private final ri fi;
    private final Context ik;
    private final int ka;
    private final wjv lr;
    com.bytedance.sdk.openadsdk.core.widget.mj ri;
    private AnimatorSet xha;

    public bgr(ri riVar) {
        this.ik = riVar.srn;
        this.lr = riVar.lr;
        this.ka = riVar.bnj;
        this.fi = riVar;
    }

    public void ik() {
        AnimatorSet animatorSet = this.xha;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public View ka() {
        return this.di;
    }

    public void lr() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 80);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.bgr.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.mj mjVar = bgr.this.ri;
                if (mjVar != null) {
                    mjVar.setProgress(iIntValue);
                }
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(81, 99);
        valueAnimatorOfInt2.setDuration(Ua.C);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.bgr.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.mj mjVar = bgr.this.ri;
                if (mjVar != null) {
                    mjVar.setProgress(iIntValue);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.xha = animatorSet;
        animatorSet.play(valueAnimatorOfInt).before(valueAnimatorOfInt2);
        this.xha.start();
    }

    public void ri() {
        try {
            if (dw.ik(this.lr)) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.widget.xha xhaVar = new com.bytedance.sdk.openadsdk.core.widget.xha(this.ik);
            this.di = xhaVar;
            this.ri = xhaVar.getLoadingProgressBar();
            com.bytedance.sdk.openadsdk.core.di.mj downloadButton = this.di.getDownloadButton();
            if (downloadButton != null) {
                downloadButton.setOnClickListener(this.fi.su.fi());
            }
            this.di.ri(this.lr, this.ka);
        } catch (Throwable unused) {
        }
    }
}
