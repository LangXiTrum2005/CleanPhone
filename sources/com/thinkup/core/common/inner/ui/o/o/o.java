package com.thinkup.core.common.inner.ui.o.o;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o implements com.thinkup.core.common.inner.ui.o.m {
    protected ValueAnimator m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f41855n;
    protected View o;
    protected int o0;

    public o(View view) {
        this.o = view;
    }

    @Override // com.thinkup.core.common.inner.ui.o.m
    public void m() {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            try {
                valueAnimator.pause();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.thinkup.core.common.inner.ui.o.m
    public void n() {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            try {
                valueAnimator.resume();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.thinkup.core.common.inner.ui.o.m
    public void o(Canvas canvas) {
    }

    @Override // com.thinkup.core.common.inner.ui.o.m
    public void o0() {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            try {
                valueAnimator.cancel();
                this.m = null;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public void om() {
        View view = this.o;
        if (view == null) {
            return;
        }
        if (this.f41855n == 0 || this.o0 == 0) {
            this.f41855n = view.getWidth();
            this.o0 = this.o.getHeight();
        }
    }

    public ValueAnimator oo() {
        return null;
    }

    @Override // com.thinkup.core.common.inner.ui.o.m
    public void o(int i2, int i3) {
        this.f41855n = i2;
        this.o0 = i3;
    }

    @Override // com.thinkup.core.common.inner.ui.o.m
    public synchronized void o() {
        if (this.o == null) {
            return;
        }
        o0();
        ValueAnimator valueAnimatorOo = oo();
        this.m = valueAnimatorOo;
        if (valueAnimatorOo != null) {
            this.o.post(new Runnable() { // from class: com.thinkup.core.common.inner.ui.o.o.o.1
                @Override // java.lang.Runnable
                public final void run() {
                    ValueAnimator valueAnimator = o.this.m;
                    if (valueAnimator == null || valueAnimator.isStarted()) {
                        return;
                    }
                    o.this.om();
                    try {
                        o.this.m.start();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
