package com.startapp.sdk.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f41210a = new Exception();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile k7 f41211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f41212c;

    public lb(k7 k7Var) {
        this.f41211b = k7Var;
    }

    public final Object a() {
        Object objA;
        Object obj = this.f41212c;
        if (obj != null) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f41212c;
                if (objA == null) {
                    k7 k7Var = this.f41211b;
                    this.f41211b = null;
                    if (k7Var == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("3");
                        illegalStateException.addSuppressed(this.f41210a);
                        throw illegalStateException;
                    }
                    try {
                        objA = k7Var.a();
                        if (objA == null) {
                            IllegalStateException illegalStateException2 = new IllegalStateException("2");
                            illegalStateException2.addSuppressed(this.f41210a);
                            throw illegalStateException2;
                        }
                        this.f41212c = objA;
                    } catch (Error e2) {
                        e = e2;
                        Log.println(7, "StartAppSDK", Log.getStackTraceString(e));
                        e.addSuppressed(this.f41210a);
                        throw e;
                    } catch (RuntimeException e3) {
                        e = e3;
                        Log.println(7, "StartAppSDK", Log.getStackTraceString(e));
                        e.addSuppressed(this.f41210a);
                        throw e;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
