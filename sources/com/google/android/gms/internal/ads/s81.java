package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s81 implements q81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u81 f19895a = new u81();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile q81 f19896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f19897c;

    public s81(q81 q81Var) {
        this.f19896b = q81Var;
    }

    public final String toString() {
        Object objJ = this.f19896b;
        if (objJ == null) {
            String strValueOf = String.valueOf(this.f19897c);
            objJ = q4.a.j(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        }
        String string = objJ.toString();
        return q4.a.j(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final Object zza() {
        if (this.f19896b != null) {
            synchronized (this.f19895a) {
                try {
                    if (this.f19896b != null) {
                        Object objZza = this.f19896b.zza();
                        this.f19897c = objZza;
                        this.f19896b = null;
                        return objZza;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f19897c;
    }
}
