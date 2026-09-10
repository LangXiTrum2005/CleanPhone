package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes5.dex */
public class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m2 f26330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hn f26331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ym f26332c = c();
    private Timer d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o2.this.f26331b.b();
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            o2.this.f26331b.b();
        }
    }

    public o2(m2 m2Var, hn hnVar) {
        this.f26330a = m2Var;
        this.f26331b = hnVar;
    }

    private ym c() {
        return new ym(new a(), com.p004ironsource.lifecycle.b.d(), new ew());
    }

    private synchronized void j() {
        Timer timer = this.d;
        if (timer != null) {
            timer.cancel();
            this.d = null;
        }
    }

    public m2 b() {
        return this.f26330a;
    }

    public boolean d() {
        return this.f26330a.c() > 0;
    }

    public void e() {
        if (this.f26330a.e()) {
            IronLog.INTERNAL.verbose();
            b(this.f26330a.c());
        }
    }

    public void f() {
        if (this.f26330a.a() == m2.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            b(this.f26330a.d());
        }
    }

    public void g() {
        if (this.f26330a.e()) {
            IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void h() {
        if (this.f26330a.a() != m2.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f26330a.d() < 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        b(this.f26330a.d());
    }

    public void i() {
        ym ymVar = this.f26332c;
        if (ymVar != null) {
            ymVar.b();
        }
    }

    public void k() {
        if (this.f26330a.a() != m2.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.f26330a.b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.f26330a.b());
    }

    private synchronized void b(long j) {
        j();
        Timer timer = new Timer();
        this.d = timer;
        timer.schedule(new b(), j);
    }

    public void a() {
        if (this.f26330a.a() == m2.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    public void a(long j) {
        ym ymVar = this.f26332c;
        if (ymVar != null) {
            ymVar.a(j);
        }
    }
}
