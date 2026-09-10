package com.bytedance.sdk.component.adexpress.dynamic.animation.ri;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ka implements dzy {
    public View ik;
    com.bytedance.sdk.component.adexpress.dynamic.ka.ri lr;
    private Set<ScheduledFuture<?>> ka = new HashSet();
    public List<ObjectAnimator> ri = ri();

    public class ri implements Runnable {
        ScheduledFuture<?> lr;
        ObjectAnimator ri;

        public ri(ObjectAnimator objectAnimator) {
            this.ri = objectAnimator;
        }

        public void ri(ScheduledFuture<?> scheduledFuture) {
            this.lr = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik() != null) {
                com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().ik().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka.ri.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ri.this.ri.resume();
                    }
                });
                if (this.lr != null) {
                    ka.this.ka.remove(this.lr);
                }
            }
        }
    }

    public ka(View view, com.bytedance.sdk.component.adexpress.dynamic.ka.ri riVar) {
        this.ik = view;
        this.lr = riVar;
    }

    public void ik() {
        List<ObjectAnimator> list = this.ri;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.lr.bu() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        ri riVar = ka.this.new ri(objectAnimator);
                        ScheduledFuture<?> scheduledFutureRi = com.bytedance.sdk.component.adexpress.ka.ka.ri(riVar, (long) (ka.this.lr.bu() * 1000.0d), TimeUnit.MILLISECONDS);
                        riVar.ri(scheduledFutureRi);
                        ka.this.ka.add(scheduledFutureRi);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dzy
    public void lr() {
        List<ObjectAnimator> list = this.ri;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.ka.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    public abstract List<ObjectAnimator> ri();

    public ObjectAnimator ri(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.lr.bgr() * 1000.0d));
        if (this.lr.vr() > 0) {
            objectAnimator.setRepeatCount(this.lr.vr() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.lr.slm())) {
            if ("alternate".equals(this.lr.slm()) || "alternate-reverse".equals(this.lr.slm())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.lr.aw())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.lr.slm())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.lr.slm())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ri.ka.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    ka.this.ik.setVisibility(0);
                    if (ka.this.ik.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.di) {
                        ((View) ka.this.ik.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }
}
