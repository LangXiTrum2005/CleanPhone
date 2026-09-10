package com.pgl.ssdk;

/* JADX INFO: loaded from: classes2.dex */
public class n0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile n0 f2446a;
    private volatile boolean c = false;
    private final Thread.UncaughtExceptionHandler b = Thread.getDefaultUncaughtExceptionHandler();

    private n0() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static n0 b() {
        if (f2446a == null) {
            synchronized (n0.class) {
                try {
                    if (f2446a == null) {
                        f2446a = new n0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2446a;
    }

    public boolean a() {
        return this.c;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.c = true;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
