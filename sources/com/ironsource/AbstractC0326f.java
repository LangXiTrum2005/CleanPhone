package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0326f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f28600a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f28601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f28602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected T f28603d;

    /* JADX INFO: renamed from: com.ironsource.f$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC0326f.this.b();
        }
    }

    public AbstractC0326f() {
    }

    public boolean a() {
        return this.f28602c <= 0;
    }

    public abstract void b();

    public void c() {
        synchronized (this.f28600a) {
            try {
                Timer timer = this.f28601b;
                if (timer != null) {
                    timer.cancel();
                    this.f28601b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        this.f28603d = null;
    }

    public void a(T t10) {
        if (a() || t10 == null) {
            return;
        }
        this.f28603d = t10;
        c();
        synchronized (this.f28600a) {
            Timer timer = new Timer();
            this.f28601b = timer;
            timer.schedule(new a(), this.f28602c);
        }
    }

    public AbstractC0326f(long j10) {
        this.f28602c = j10;
    }
}
