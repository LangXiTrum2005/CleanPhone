package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.eK;

/* JADX INFO: loaded from: classes2.dex */
public class VVE {
    private final Lxb JXs;
    private final com.bytedance.sdk.openadsdk.core.model.tD LD;
    com.bytedance.sdk.openadsdk.core.widget.QAg Lxb;
    private final int ZU;
    private AnimatorSet ebl;
    private com.bytedance.sdk.openadsdk.core.widget.OY lc;
    private final Context lk;

    public VVE(Lxb lxb) {
        this.lk = lxb.NDz;
        this.LD = lxb.LD;
        this.ZU = lxb.Ns;
        this.JXs = lxb;
    }

    public void LD() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 80);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.VVE.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.QAg qAg = VVE.this.Lxb;
                if (qAg != null) {
                    qAg.setProgress(iIntValue);
                }
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(81, 99);
        valueAnimatorOfInt2.setDuration(3000L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.VVE.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.QAg qAg = VVE.this.Lxb;
                if (qAg != null) {
                    qAg.setProgress(iIntValue);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.ebl = animatorSet;
        animatorSet.play(valueAnimatorOfInt).before(valueAnimatorOfInt2);
        this.ebl.start();
    }

    public void Lxb() {
        try {
            if (eK.lk(this.LD)) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.widget.OY oy = new com.bytedance.sdk.openadsdk.core.widget.OY(this.lk);
            this.lc = oy;
            this.Lxb = oy.getLoadingProgressBar();
            com.bytedance.sdk.openadsdk.core.JXs.OY downloadButton = this.lc.getDownloadButton();
            if (downloadButton != null) {
                downloadButton.setOnClickListener(this.JXs.KPU.JXs());
            }
            this.lc.Lxb(this.LD, this.ZU);
        } catch (Throwable unused) {
        }
    }

    public View ZU() {
        return this.lc;
    }

    public void lk() {
        AnimatorSet animatorSet = this.ebl;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
