package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Df extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Df f25989b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f25990a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f25991a;

        public a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }

        public Handler a() {
            return this.f25991a;
        }

        public void b() {
            this.f25991a = new Handler(getLooper());
        }
    }

    private Df() {
        a aVar = new a(getClass().getSimpleName());
        this.f25990a = aVar;
        aVar.start();
        this.f25990a.b();
    }

    public static synchronized Df a() {
        try {
            if (f25989b == null) {
                f25989b = new Df();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f25989b;
    }

    public synchronized void a(Runnable runnable) {
        a aVar = this.f25990a;
        if (aVar == null) {
            return;
        }
        Handler handlerA = aVar.a();
        if (handlerA != null) {
            handlerA.post(runnable);
        }
    }
}
