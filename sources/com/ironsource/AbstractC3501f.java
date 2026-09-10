package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3501f<T> {
    private Object a = new Object();
    private Timer b;
    protected long c;
    protected T d;

    /* JADX INFO: renamed from: com.ironsource.f$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC3501f.this.b();
        }
    }

    public AbstractC3501f() {
    }

    public boolean a() {
        return this.c <= 0;
    }

    public abstract void b();

    public void c() {
        synchronized (this.a) {
            try {
                Timer timer = this.b;
                if (timer != null) {
                    timer.cancel();
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        this.d = null;
    }

    public void a(T t) {
        if (a() || t == null) {
            return;
        }
        this.d = t;
        c();
        synchronized (this.a) {
            Timer timer = new Timer();
            this.b = timer;
            timer.schedule(new a(), this.c);
        }
    }

    public AbstractC3501f(long j) {
        this.c = j;
    }
}
