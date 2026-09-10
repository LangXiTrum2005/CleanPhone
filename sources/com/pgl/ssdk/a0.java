package com.pgl.ssdk;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes5.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a3<a1> f33381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a4 f33382b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a0 f33383a = new a0();
    }

    public static a0 a() {
        return b.f33383a;
    }

    public a4 b() {
        if (this.f33382b == null) {
            synchronized (a0.class) {
                try {
                    if (this.f33382b == null) {
                        this.f33382b = a("ssdk_net_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f33382b;
    }

    public a4 c() {
        if (this.f33382b == null) {
            synchronized (a0.class) {
                try {
                    if (this.f33382b == null) {
                        this.f33382b = a("ssdk_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f33382b;
    }

    private a0() {
        this.f33381a = a3.a(2);
    }

    public a4 a(String str) {
        return b(null, str);
    }

    private a1 a(a4.a aVar, String str) {
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            return new a1(handlerThread, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public a4 b(a4.a aVar, String str) {
        a1 a1Var = (a1) this.f33381a.a();
        if (a1Var != null) {
            a1Var.a(aVar);
            a1Var.a(str);
            return a1Var;
        }
        return a(aVar, str);
    }
}
