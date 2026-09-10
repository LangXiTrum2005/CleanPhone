package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: renamed from: com.ironsource.qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3713qf extends Thread {
    private static C3713qf b;
    private a a;

    /* JADX INFO: renamed from: com.ironsource.qf$a */
    public class a extends HandlerThread {
        private Handler a;

        public a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }

        public Handler a() {
            return this.a;
        }

        public void b() {
            this.a = new Handler(getLooper());
        }
    }

    private C3713qf() {
        a aVar = new a(getClass().getSimpleName());
        this.a = aVar;
        aVar.start();
        this.a.b();
    }

    public static synchronized C3713qf a() {
        try {
            if (b == null) {
                b = new C3713qf();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public synchronized void a(Runnable runnable) {
        a aVar = this.a;
        if (aVar == null) {
            return;
        }
        Handler handlerA = aVar.a();
        if (handlerA != null) {
            handlerA.post(runnable);
        }
    }
}
