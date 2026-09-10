package com.umeng.analytics.pro;

import com.umeng.analytics.AnalyticsConfig;

/* JADX INFO: loaded from: classes3.dex */
public class r implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f2591a;
    private v b;

    public r() {
        if (Thread.getDefaultUncaughtExceptionHandler() == this) {
            return;
        }
        this.f2591a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public void a(v vVar) {
        this.b = vVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        a(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f2591a;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == Thread.getDefaultUncaughtExceptionHandler()) {
            return;
        }
        this.f2591a.uncaughtException(thread, th);
    }

    private void a(Throwable th) {
        if (AnalyticsConfig.CATCH_EXCEPTION) {
            this.b.a(th);
        } else {
            this.b.a(null);
        }
    }
}
