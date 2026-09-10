package com.ironsource;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.wb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0642wb {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f30944g = "wb";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.ironsource.lifecycle.b f30945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f30946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0432kg f30947c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f30949e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f30948d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0408ja f30950f = new a();

    /* JADX INFO: renamed from: com.ironsource.wb$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C0642wb c0642wb = C0642wb.this;
            c0642wb.f30945a.b(c0642wb.f30950f);
            C0642wb.this.f30947c.b();
            C0642wb.this.f30946b.run();
        }
    }

    public C0642wb(Runnable runnable, com.ironsource.lifecycle.b bVar, C0432kg c0432kg) {
        this.f30946b = runnable;
        this.f30945a = bVar;
        this.f30947c = c0432kg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f30948d) {
            try {
                Timer timer = this.f30949e;
                if (timer != null) {
                    timer.cancel();
                    this.f30949e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void b() {
        c();
        this.f30945a.b(this.f30950f);
        this.f30947c.b();
    }

    public void a(long j10) {
        if (j10 < 0) {
            Log.d(f30944g, "cannot start timer with delay < 0");
            return;
        }
        this.f30945a.a(this.f30950f);
        this.f30947c.a(j10);
        if (this.f30945a.e()) {
            this.f30947c.c(System.currentTimeMillis());
        } else {
            b(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j10) {
        synchronized (this.f30948d) {
            c();
            Timer timer = new Timer();
            this.f30949e = timer;
            timer.schedule(new b(), j10);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wb$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements InterfaceC0408ja {
        public a() {
        }

        @Override // com.ironsource.InterfaceC0408ja
        public void a() {
            C0642wb.this.f30947c.c(System.currentTimeMillis());
            C0642wb.this.c();
        }

        @Override // com.ironsource.InterfaceC0408ja
        public void b() {
            C0642wb.this.f30947c.b(System.currentTimeMillis());
            C0642wb c0642wb = C0642wb.this;
            c0642wb.b(c0642wb.f30947c.a());
        }

        @Override // com.ironsource.InterfaceC0408ja
        public void c() {
        }

        @Override // com.ironsource.InterfaceC0408ja
        public void d() {
        }
    }
}
