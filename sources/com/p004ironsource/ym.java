package com.p004ironsource;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes5.dex */
public class ym {
    private static final String g = "ym";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.p004ironsource.lifecycle.b f27794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f27795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ew f27796c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f27797e;
    private final Object d = new Object();
    private final uk f = new a();

    public class a implements uk {
        public a() {
        }

        @Override // com.p004ironsource.uk
        public void a() {
        }

        @Override // com.p004ironsource.uk
        public void b() {
            ym.this.f27796c.c(System.currentTimeMillis());
            ym.this.c();
        }

        @Override // com.p004ironsource.uk
        public void c() {
            ym.this.f27796c.b(System.currentTimeMillis());
            ym ymVar = ym.this;
            ymVar.b(ymVar.f27796c.a());
        }

        @Override // com.p004ironsource.uk
        public void d() {
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ym.this.f27794a.b(ym.this.f);
            ym.this.f27796c.b();
            ym.this.f27795b.run();
        }
    }

    public ym(Runnable runnable, com.p004ironsource.lifecycle.b bVar, ew ewVar) {
        this.f27795b = runnable;
        this.f27794a = bVar;
        this.f27796c = ewVar;
    }

    public void b() {
        c();
        this.f27794a.b(this.f);
        this.f27796c.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        synchronized (this.d) {
            c();
            Timer timer = new Timer();
            this.f27797e = timer;
            timer.schedule(new b(), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.d) {
            try {
                Timer timer = this.f27797e;
                if (timer != null) {
                    timer.cancel();
                    this.f27797e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void a(long j) {
        if (j < 0) {
            Log.d(g, "cannot start timer with delay < 0");
            return;
        }
        this.f27794a.a(this.f);
        this.f27796c.a(j);
        if (this.f27794a.e()) {
            this.f27796c.c(System.currentTimeMillis());
        } else {
            b(j);
        }
    }
}
