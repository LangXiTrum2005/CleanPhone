package com.startapp.sdk.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f41178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f41179c;
    public final long d;

    public k6(Context context) {
        this.f41177a = context;
        this.d = 900000L;
    }

    public Object a() {
        return null;
    }

    public final Object b() {
        Object objA = this.f41178b;
        if (objA == null || this.f41179c + this.d < SystemClock.uptimeMillis()) {
            synchronized (this) {
                try {
                    objA = this.f41178b;
                    boolean z2 = this.f41179c + this.d < SystemClock.uptimeMillis();
                    if (objA == null || z2) {
                        try {
                            objA = a(z2);
                        } catch (Throwable th) {
                            if (!vi.a(th, RemoteException.class)) {
                                g9.a(th);
                            }
                        }
                        if (objA != null) {
                            this.f41178b = objA;
                            this.f41179c = SystemClock.uptimeMillis();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return objA != null ? objA : c();
    }

    public abstract Object c();

    public Object a(boolean z2) {
        return a();
    }

    public k6(Context context, long j) {
        this.f41177a = context;
        this.d = j;
    }
}
