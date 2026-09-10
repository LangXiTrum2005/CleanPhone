package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.l4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0438l4 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f29153a;

    public C0438l4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f29153a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        C0456m4 c0456m4 = new C0456m4(th2);
        if (c0456m4.d()) {
            new K5(c0456m4.b(), "" + System.currentTimeMillis(), "Crash").a();
        }
        this.f29153a.uncaughtException(thread, th2);
    }
}
