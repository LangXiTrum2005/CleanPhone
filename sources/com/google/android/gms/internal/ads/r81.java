package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r81 implements Serializable, q81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient u81 f19463a = new u81();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q81 f19464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile transient boolean f19465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object f19466d;

    public r81(q81 q81Var) {
        this.f19464b = q81Var;
    }

    public final String toString() {
        Object objJ;
        if (this.f19465c) {
            String strValueOf = String.valueOf(this.f19466d);
            objJ = q4.a.j(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        } else {
            objJ = this.f19464b;
        }
        String string = objJ.toString();
        return q4.a.j(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final Object zza() {
        if (!this.f19465c) {
            synchronized (this.f19463a) {
                try {
                    if (!this.f19465c) {
                        Object objZza = this.f19464b.zza();
                        this.f19466d = objZza;
                        this.f19465c = true;
                        return objZza;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f19466d;
    }
}
