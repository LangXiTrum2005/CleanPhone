package com.ironsource;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.xb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0660xb implements InterfaceC0408ja {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f31060b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f31063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f31064f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31059a = "INTERNAL";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31061c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f31062d = null;

    /* JADX INFO: renamed from: com.ironsource.xb$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C0660xb.this.f31064f.run();
        }
    }

    public C0660xb(long j10, Runnable runnable, boolean z10) {
        this.f31063e = j10;
        this.f31064f = runnable;
        if (z10) {
            g();
        }
    }

    private synchronized void f() {
        Timer timer = this.f31060b;
        if (timer != null) {
            timer.cancel();
            this.f31060b = null;
        }
    }

    private synchronized void h() {
        if (this.f31060b == null) {
            Timer timer = new Timer();
            this.f31060b = timer;
            timer.schedule(new a(), this.f31063e);
            Calendar.getInstance().setTimeInMillis(this.f31062d.longValue());
        }
    }

    @Override // com.ironsource.InterfaceC0408ja
    public void b() {
        Long l;
        if (this.f31060b == null && (l = this.f31062d) != null) {
            long jLongValue = l.longValue() - System.currentTimeMillis();
            this.f31063e = jLongValue;
            if (jLongValue > 0) {
                h();
            } else {
                e();
                this.f31064f.run();
            }
        }
    }

    public void e() {
        f();
        this.f31061c = false;
        this.f31062d = null;
        com.ironsource.lifecycle.b.d().b(this);
    }

    public void g() {
        if (this.f31061c) {
            return;
        }
        this.f31061c = true;
        com.ironsource.lifecycle.b.d().a(this);
        this.f31062d = Long.valueOf(System.currentTimeMillis() + this.f31063e);
        if (com.ironsource.lifecycle.b.d().e()) {
            return;
        }
        h();
    }

    @Override // com.ironsource.InterfaceC0408ja
    public void a() {
        if (this.f31060b != null) {
            f();
        }
    }

    @Override // com.ironsource.InterfaceC0408ja
    public void c() {
    }

    @Override // com.ironsource.InterfaceC0408ja
    public void d() {
    }
}
