package com.pgl.ssdk;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public class o0 {
    public static Handler a() {
        return w0.a().b();
    }

    public static Handler b() {
        return w0.a().c();
    }

    public static void a(Runnable runnable) {
        Handler handlerA;
        if (runnable == null || (handlerA = a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }

    public static void b(Runnable runnable) {
        Handler handlerB;
        if (runnable == null || (handlerB = b()) == null) {
            return;
        }
        handlerB.post(runnable);
    }
}
