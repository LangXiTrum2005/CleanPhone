package com.bytedance.sdk.component.adexpress.dynamic.animation.qdl;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mzz extends mml {
    public mzz(View view, com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar) {
        super(view, qdlVar);
    }

    private void lnr(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), this.ud.aaj())).setDuration((int) (this.ud.to() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mzz.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                mzz.this.lnr.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(qdl(duration));
    }

    private void mml(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), this.ud.aaj())).setDuration((int) (this.ud.to() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(qdl(duration));
    }

    private void ud(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), this.ud.aaj())).setDuration((int) (this.ud.to() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mzz.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                mzz.this.lnr.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(qdl(duration));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.qdl.mml
    public List<ObjectAnimator> qdl() {
        byte b2;
        ArrayList arrayList = new ArrayList();
        switch (this.ud.jyq()) {
            case "both":
                b2 = 0;
                break;
            case "none":
                b2 = 3;
                break;
            case "forwards":
                b2 = 1;
                break;
            case "backwards":
                b2 = 2;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            qdl(arrayList);
            return arrayList;
        }
        if (b2 == 1) {
            mml(arrayList);
            return arrayList;
        }
        if (b2 != 2) {
            lnr(arrayList);
            return arrayList;
        }
        ud(arrayList);
        return arrayList;
    }

    private void qdl(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.lnr, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), this.ud.aaj())).setDuration(((int) (this.ud.to() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        com.bytedance.sdk.component.adexpress.dynamic.mml.qdl qdlVar = this.ud;
        qdlVar.mo(qdlVar.bjy() * 2);
        list.add(qdl(duration));
    }
}
