package com.p004ironsource;

import com.p004ironsource.lifecycle.b;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes5.dex */
public class zm implements uk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f27931b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f27933e;
    private Runnable f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27930a = "INTERNAL";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27932c = false;
    private Long d = null;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            zm.this.f.run();
        }
    }

    public zm(long j, Runnable runnable, boolean z2) {
        this.f27933e = j;
        this.f = runnable;
        if (z2) {
            g();
        }
    }

    private synchronized void f() {
        Timer timer = this.f27931b;
        if (timer != null) {
            timer.cancel();
            this.f27931b = null;
        }
    }

    private synchronized void h() {
        if (this.f27931b == null) {
            Timer timer = new Timer();
            this.f27931b = timer;
            timer.schedule(new a(), this.f27933e);
            Calendar.getInstance().setTimeInMillis(this.d.longValue());
        }
    }

    @Override // com.p004ironsource.uk
    public void b() {
        if (this.f27931b != null) {
            f();
        }
    }

    @Override // com.p004ironsource.uk
    public void c() {
        Long l2;
        if (this.f27931b == null && (l2 = this.d) != null) {
            long jLongValue = l2.longValue() - System.currentTimeMillis();
            this.f27933e = jLongValue;
            if (jLongValue > 0) {
                h();
            } else {
                e();
                this.f.run();
            }
        }
    }

    @Override // com.p004ironsource.uk
    public void d() {
    }

    public void e() {
        f();
        this.f27932c = false;
        this.d = null;
        b.d().b(this);
    }

    public void g() {
        if (this.f27932c) {
            return;
        }
        this.f27932c = true;
        b.d().a(this);
        this.d = Long.valueOf(System.currentTimeMillis() + this.f27933e);
        if (b.d().e()) {
            return;
        }
        h();
    }

    @Override // com.p004ironsource.uk
    public void a() {
    }
}
