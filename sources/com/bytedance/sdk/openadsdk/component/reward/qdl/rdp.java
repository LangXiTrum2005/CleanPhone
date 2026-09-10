package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.smartdigimkt.u2.m;

/* JADX INFO: loaded from: classes3.dex */
public class rdp {
    private final Context lnr;
    private final int mml;
    private com.bytedance.sdk.openadsdk.core.widget.wd mo;
    private final qdl mzz;
    com.bytedance.sdk.openadsdk.core.widget.jpc qdl;
    private final ljh ud;
    private AnimatorSet wd;

    public rdp(qdl qdlVar) {
        this.lnr = qdlVar.om;
        this.ud = qdlVar.ud;
        this.mml = qdlVar.zlt;
        this.mzz = qdlVar;
    }

    public void lnr() {
        AnimatorSet animatorSet = this.wd;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public View mml() {
        return this.mo;
    }

    public void qdl() {
        try {
            if (vu.lnr(this.ud)) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.widget.wd wdVar = new com.bytedance.sdk.openadsdk.core.widget.wd(this.lnr);
            this.mo = wdVar;
            this.qdl = wdVar.getLoadingProgressBar();
            com.bytedance.sdk.openadsdk.core.mo.jpc downloadButton = this.mo.getDownloadButton();
            if (downloadButton != null) {
                downloadButton.setOnClickListener(this.mzz.vu.mzz());
            }
            this.mo.qdl(this.ud, this.mml);
        } catch (Throwable unused) {
        }
    }

    public void ud() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 80);
        valueAnimatorOfInt.setDuration(2000L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.rdp.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.jpc jpcVar = rdp.this.qdl;
                if (jpcVar != null) {
                    jpcVar.setProgress(iIntValue);
                }
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(81, 99);
        valueAnimatorOfInt2.setDuration(m.D0);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.rdp.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.jpc jpcVar = rdp.this.qdl;
                if (jpcVar != null) {
                    jpcVar.setProgress(iIntValue);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.wd = animatorSet;
        animatorSet.play(valueAnimatorOfInt).before(valueAnimatorOfInt2);
        this.wd.start();
    }
}
