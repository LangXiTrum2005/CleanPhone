package com.p004ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3354f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f24949a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f24950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f24951c;
    protected T d;

    /* JADX INFO: renamed from: com.ironsource.f$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC3354f.this.b();
        }
    }

    public AbstractC3354f() {
    }

    public void a(T t) {
        if (a() || t == null) {
            return;
        }
        this.d = t;
        c();
        synchronized (this.f24949a) {
            Timer timer = new Timer();
            this.f24950b = timer;
            timer.schedule(new a(), this.f24951c);
        }
    }

    public abstract void b();

    public void c() {
        synchronized (this.f24949a) {
            try {
                Timer timer = this.f24950b;
                if (timer != null) {
                    timer.cancel();
                    this.f24950b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        this.d = null;
    }

    public AbstractC3354f(long j) {
        this.f24951c = j;
    }

    public boolean a() {
        return this.f24951c <= 0;
    }
}
