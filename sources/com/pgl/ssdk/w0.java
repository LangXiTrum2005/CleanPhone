package com.pgl.ssdk;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0<x0> f2460a;
    private a1 b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final w0 f2461a = new w0();
    }

    public static w0 a() {
        return b.f2461a;
    }

    public a1 b() {
        if (this.b == null) {
            synchronized (w0.class) {
                try {
                    if (this.b == null) {
                        this.b = a("ssdk_net_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }

    public a1 c() {
        if (this.b == null) {
            synchronized (w0.class) {
                try {
                    if (this.b == null) {
                        this.b = a("ssdk_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }

    private w0() {
        this.f2460a = z0.a(2);
    }

    public a1 a(String str) {
        return b(null, str);
    }

    private x0 a(a1.a aVar, String str) {
        if (n0.b().a()) {
            return null;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            return new x0(handlerThread, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public a1 b(a1.a aVar, String str) {
        x0 x0Var = (x0) this.f2460a.a();
        if (x0Var != null) {
            x0Var.a(aVar);
            x0Var.a(str);
            return x0Var;
        }
        return a(aVar, str);
    }
}
