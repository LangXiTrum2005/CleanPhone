package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Serializable, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f22923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile transient boolean f22924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object f22925c;

    public y(x xVar) {
        this.f22923a = xVar;
    }

    public final String toString() {
        return defpackage.e.o("Suppliers.memoize(", (this.f22924b ? defpackage.e.o("<supplier that returned ", String.valueOf(this.f22925c), ">") : this.f22923a).toString(), ")");
    }

    @Override // com.google.android.gms.internal.auth.x
    public final Object zza() {
        if (!this.f22924b) {
            synchronized (this) {
                try {
                    if (!this.f22924b) {
                        Object objZza = this.f22923a.zza();
                        this.f22925c = objZza;
                        this.f22924b = true;
                        return objZza;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f22925c;
    }
}
