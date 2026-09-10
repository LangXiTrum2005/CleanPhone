package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile x f22791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f22792b;

    public final String toString() {
        Object objO = this.f22791a;
        if (objO == z.f22929a) {
            objO = defpackage.e.o("<supplier that returned ", String.valueOf(this.f22792b), ">");
        }
        return defpackage.e.o("Suppliers.memoize(", String.valueOf(objO), ")");
    }

    @Override // com.google.android.gms.internal.auth.x
    public final Object zza() {
        x xVar = this.f22791a;
        z zVar = z.f22929a;
        if (xVar != zVar) {
            synchronized (this) {
                try {
                    if (this.f22791a != zVar) {
                        Object objZza = this.f22791a.zza();
                        this.f22792b = objZza;
                        this.f22791a = zVar;
                        return objZza;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f22792b;
    }
}
