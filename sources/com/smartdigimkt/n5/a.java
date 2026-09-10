package com.smartdigimkt.n5;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements com.smartdigimkt.m5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected View f37084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ValueAnimator f37085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f37086c;
    protected int d;

    /* JADX INFO: renamed from: com.smartdigimkt.n5.a$a, reason: collision with other inner class name */
    public class RunnableC0551a implements Runnable {
        public RunnableC0551a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ValueAnimator valueAnimator = a.this.f37085b;
            if (valueAnimator == null || valueAnimator.isStarted()) {
                return;
            }
            a.this.b();
            try {
                a.this.f37085b.start();
            } catch (Throwable unused) {
            }
        }
    }

    public a(View view) {
        this.f37084a = view;
    }

    public ValueAnimator a() {
        return null;
    }

    public void b() {
        View view = this.f37084a;
        if (view == null) {
            return;
        }
        if (this.f37086c == 0 || this.d == 0) {
            this.f37086c = view.getWidth();
            this.d = this.f37084a.getHeight();
        }
    }

    @Override // com.smartdigimkt.m5.b
    public void pause() {
        ValueAnimator valueAnimator = this.f37085b;
        if (valueAnimator != null) {
            try {
                valueAnimator.pause();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.smartdigimkt.m5.b
    public void resume() {
        ValueAnimator valueAnimator = this.f37085b;
        if (valueAnimator != null) {
            try {
                valueAnimator.resume();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.smartdigimkt.m5.b
    public synchronized void start() {
        if (this.f37084a == null) {
            return;
        }
        stop();
        ValueAnimator valueAnimatorA = a();
        this.f37085b = valueAnimatorA;
        if (valueAnimatorA != null) {
            this.f37084a.post(new RunnableC0551a());
        }
    }

    @Override // com.smartdigimkt.m5.b
    public void stop() {
        ValueAnimator valueAnimator = this.f37085b;
        if (valueAnimator != null) {
            try {
                valueAnimator.cancel();
                this.f37085b = null;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    @Override // com.smartdigimkt.m5.b
    public void a(Canvas canvas) {
    }

    @Override // com.smartdigimkt.m5.b
    public void a(int i2, int i3) {
        this.f37086c = i2;
        this.d = i3;
    }
}
