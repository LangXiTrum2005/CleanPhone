package com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nJ;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZU implements nJ {
    com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb LD;
    public View lk;
    private Set<ScheduledFuture<?>> ZU = new HashSet();
    public List<ObjectAnimator> Lxb = Lxb();

    public class Lxb implements Runnable {
        ScheduledFuture<?> LD;
        ObjectAnimator Lxb;

        public Lxb(ObjectAnimator objectAnimator) {
            this.Lxb = objectAnimator;
        }

        public void Lxb(ScheduledFuture<?> scheduledFuture) {
            this.LD = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk() != null) {
                com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().lk().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.ZU.Lxb.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Lxb.this.Lxb.resume();
                    }
                });
                if (this.LD != null) {
                    ZU.this.ZU.remove(this.LD);
                }
            }
        }
    }

    public ZU(View view, com.bytedance.sdk.component.adexpress.dynamic.ZU.Lxb lxb) {
        this.lk = view;
        this.LD = lxb;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nJ
    public void LD() {
        List<ObjectAnimator> list = this.Lxb;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.ZU.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    public abstract List<ObjectAnimator> Lxb();

    public void lk() {
        List<ObjectAnimator> list = this.Lxb;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.LD.kqm() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.ZU.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        Lxb lxb = ZU.this.new Lxb(objectAnimator);
                        ScheduledFuture<?> scheduledFutureLxb = com.bytedance.sdk.component.adexpress.ZU.ZU.Lxb(lxb, (long) (ZU.this.LD.kqm() * 1000.0d), TimeUnit.MILLISECONDS);
                        lxb.Lxb(scheduledFutureLxb);
                        ZU.this.ZU.add(scheduledFutureLxb);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    public ObjectAnimator Lxb(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.LD.STP() * 1000.0d));
        if (this.LD.IeN() > 0) {
            objectAnimator.setRepeatCount(this.LD.IeN() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.LD.VVE())) {
            if ("alternate".equals(this.LD.VVE()) || "alternate-reverse".equals(this.LD.VVE())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.LD.NXR())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.LD.VVE())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.LD.VVE())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.Lxb.ZU.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    ZU.this.lk.setVisibility(0);
                    if (ZU.this.lk.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lc) {
                        ((View) ZU.this.lk.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }
}
