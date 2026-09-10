package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3742sb {
    private static final String g = "sb";
    private final com.ironsource.lifecycle.b a;
    private final Runnable b;
    private final Rf c;
    private Timer e;
    private final Object d = new Object();
    private final InterfaceC3530ga f = new a();

    /* JADX INFO: renamed from: com.ironsource.sb$b */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3742sb c3742sb = C3742sb.this;
            c3742sb.a.b(c3742sb.f);
            C3742sb.this.c.b();
            C3742sb.this.b.run();
        }
    }

    public C3742sb(Runnable runnable, com.ironsource.lifecycle.b bVar, Rf rf) {
        this.b = runnable;
        this.a = bVar;
        this.c = rf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.d) {
            try {
                Timer timer = this.e;
                if (timer != null) {
                    timer.cancel();
                    this.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void b() {
        c();
        this.a.b(this.f);
        this.c.b();
    }

    public void a(long j) {
        if (j < 0) {
            return;
        }
        this.a.a(this.f);
        this.c.a(j);
        if (this.a.e()) {
            this.c.c(System.currentTimeMillis());
        } else {
            b(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        synchronized (this.d) {
            c();
            Timer timer = new Timer();
            this.e = timer;
            timer.schedule(new b(), j);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sb$a */
    public class a implements InterfaceC3530ga {
        public a() {
        }

        @Override // com.ironsource.InterfaceC3530ga
        public void a() {
            C3742sb.this.c.c(System.currentTimeMillis());
            C3742sb.this.c();
        }

        @Override // com.ironsource.InterfaceC3530ga
        public void b() {
            C3742sb.this.c.b(System.currentTimeMillis());
            C3742sb c3742sb = C3742sb.this;
            c3742sb.b(c3742sb.c.a());
        }

        @Override // com.ironsource.InterfaceC3530ga
        public void c() {
        }

        @Override // com.ironsource.InterfaceC3530ga
        public void d() {
        }
    }
}
