package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3595k4 implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a;

    public C3595k4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C3613l4 c3613l4 = new C3613l4(th);
        if (c3613l4.d()) {
            new J5(c3613l4.b(), "" + System.currentTimeMillis(), "Crash").a();
        }
        this.a.uncaughtException(thread, th);
    }
}
