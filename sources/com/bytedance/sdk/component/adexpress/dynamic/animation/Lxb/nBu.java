package com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class nBu extends ZU {
    private float JXs;
    private Lxb ZU;
    private float lc;

    public class Lxb {
        private View LD;

        public Lxb(View view) {
            this.LD = view;
        }

        public void Lxb(int i) {
            if (!"top".equals(nBu.this.LD.Lxb())) {
                ViewGroup.LayoutParams layoutParams = this.LD.getLayoutParams();
                layoutParams.height = i;
                this.LD.setLayoutParams(layoutParams);
                this.LD.requestLayout();
                return;
            }
            if (nBu.this.lk instanceof ViewGroup) {
                for (int i2 = 0; i2 < ((ViewGroup) nBu.this.lk).getChildCount(); i2++) {
                    ((ViewGroup) nBu.this.lk).getChildAt(i2).setTranslationY(i - nBu.this.JXs);
                }
            }
            nBu nbu = nBu.this;
            nbu.lk.setTranslationY(nbu.JXs - i);
        }
    }

    public nBu(View view, com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb lxb) {
        super(view, lxb);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.ZU
    public List<ObjectAnimator> Lxb() {
        int i;
        String str;
        View view = this.lk;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JXs)) {
            this.lk = (View) this.lk.getParent();
        }
        this.lk.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lk, "alpha", 0.0f, 1.0f).setDuration((int) (this.LD.nBu() * 1000.0d));
        this.ZU = new Lxb(this.lk);
        final int i2 = this.lk.getLayoutParams().height;
        this.JXs = i2;
        this.lc = this.lk.getLayoutParams().width;
        if (TtmlNode.LEFT.equals(this.LD.Lxb()) || TtmlNode.RIGHT.equals(this.LD.Lxb())) {
            i = (int) this.lc;
            str = "width";
        } else {
            str = "height";
            i = i2;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.ZU, str, 0, i).setDuration((int) (this.LD.nBu() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Lxb(duration));
        arrayList.add(Lxb(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.nBu.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                nBu.this.ZU.Lxb(i2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z) {
            }
        });
        return arrayList;
    }
}
