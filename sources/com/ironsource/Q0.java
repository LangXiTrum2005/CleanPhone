package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O0 f27066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Fb f27067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0642wb f27068c = c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Timer f27069d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Q0.this.f27067b.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Q0.this.f27067b.b();
        }
    }

    public Q0(O0 o6, Fb fb2) {
        this.f27066a = o6;
        this.f27067b = fb2;
    }

    private synchronized void b(long j10) {
        j();
        Timer timer = new Timer();
        this.f27069d = timer;
        timer.schedule(new b(), j10);
    }

    private C0642wb c() {
        return new C0642wb(new a(), com.ironsource.lifecycle.b.d(), new C0432kg());
    }

    private synchronized void j() {
        Timer timer = this.f27069d;
        if (timer != null) {
            timer.cancel();
            this.f27069d = null;
        }
    }

    public boolean d() {
        return this.f27066a.c() > 0;
    }

    public void e() {
        if (this.f27066a.e()) {
            IronLog.INTERNAL.verbose();
            b(this.f27066a.c());
        }
    }

    public void f() {
        if (this.f27066a.a() == O0.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            b(this.f27066a.d());
        }
    }

    public void g() {
        if (this.f27066a.e()) {
            IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void h() {
        if (this.f27066a.a() != O0.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f27066a.d() < 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        b(this.f27066a.d());
    }

    public void i() {
        C0642wb c0642wb = this.f27068c;
        if (c0642wb != null) {
            c0642wb.b();
        }
    }

    public void k() {
        if (this.f27066a.a() != O0.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.f27066a.b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.f27066a.b());
    }

    public void a() {
        if (this.f27066a.a() == O0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    public O0 b() {
        return this.f27066a;
    }

    public void a(long j10) {
        C0642wb c0642wb = this.f27068c;
        if (c0642wb != null) {
            c0642wb.a(j10);
        }
    }
}
