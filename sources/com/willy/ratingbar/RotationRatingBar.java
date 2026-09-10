package com.willy.ratingbar;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes6.dex */
public class RotationRatingBar extends AnimationRatingBar {

    /* JADX INFO: renamed from: com.willy.ratingbar.RotationRatingBar$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // com.willy.ratingbar.BaseRatingBar
    public final void a(float f) {
        if (this.x0 != null) {
            this.w0.removeCallbacksAndMessages(this.y0);
        }
        for (final PartialView partialView : this.v0) {
            final int iIntValue = ((Integer) partialView.getTag()).intValue();
            final double dCeil = Math.ceil(f);
            if (iIntValue > dCeil) {
                partialView.a();
            } else {
                final float f2 = f;
                Runnable runnable = new Runnable() { // from class: com.willy.ratingbar.RotationRatingBar.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = iIntValue;
                        double d = i2;
                        double d2 = dCeil;
                        PartialView partialView2 = partialView;
                        float f3 = f2;
                        if (d == d2) {
                            partialView2.b(f3);
                        } else {
                            partialView2.e0.setImageLevel(10000);
                            partialView2.f0.setImageLevel(0);
                        }
                        if (i2 == f3) {
                            partialView2.startAnimation(AnimationUtils.loadAnimation(RotationRatingBar.this.getContext(), com.charging.screenshow.battery.animations.themes.R.anim.rotation));
                        }
                    }
                };
                this.x0 = runnable;
                if (this.w0 == null) {
                    this.w0 = new Handler();
                }
                this.w0.postAtTime(runnable, this.y0, SystemClock.uptimeMillis() + 15);
                f = f2;
            }
        }
    }
}
