package com.p004ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes5.dex */
public class fs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o5 f25087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gs f25088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Timer f25089c = null;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            fs.this.f25088b.b();
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            fs.this.f25088b.b();
        }
    }

    public fs(o5 o5Var, gs gsVar) {
        this.f25087a = o5Var;
        this.f25088b = gsVar;
    }

    private void d() {
        Timer timer = this.f25089c;
        if (timer != null) {
            timer.cancel();
            this.f25089c = null;
        }
    }

    public void b() {
        synchronized (this) {
            d();
        }
        this.f25088b.b();
    }

    public synchronized void c() {
        d();
        Timer timer = new Timer();
        this.f25089c = timer;
        timer.schedule(new a(), this.f25087a.j());
    }

    public synchronized void a() {
        d();
        Timer timer = new Timer();
        this.f25089c = timer;
        timer.schedule(new b(), this.f25087a.b());
    }
}
