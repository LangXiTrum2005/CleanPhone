package com.p004ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import com.p004ironsource.mediationsdk.logger.d;

/* JADX INFO: loaded from: classes5.dex */
public class wu extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static wu f27642b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f27643a;

    public class a extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f27644a;

        public a(String str) {
            super(str);
            setUncaughtExceptionHandler(new d());
        }

        public Handler a() {
            return this.f27644a;
        }

        public void b() {
            this.f27644a = new Handler(getLooper());
        }
    }

    private wu() {
        a aVar = new a(getClass().getSimpleName());
        this.f27643a = aVar;
        aVar.start();
        this.f27643a.b();
    }

    public static synchronized wu a() {
        try {
            if (f27642b == null) {
                f27642b = new wu();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f27642b;
    }

    public synchronized void a(Runnable runnable) {
        a aVar = this.f27643a;
        if (aVar == null) {
            return;
        }
        Handler handlerA = aVar.a();
        if (handlerA != null) {
            handlerA.post(runnable);
        }
    }
}
