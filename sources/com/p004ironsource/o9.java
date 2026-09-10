package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public class o9 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f26357a;

    public o9(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f26357a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        p9 p9Var = new p9(th);
        if (p9Var.getIsIronsourceCrash()) {
            new mc(p9Var.getStackTrace(), "" + System.currentTimeMillis(), "Crash").a();
        }
        this.f26357a.uncaughtException(thread, th);
    }
}
