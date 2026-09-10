package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fx1 implements kx1, dx1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f14571c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile kx1 f14572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f14573b = f14571c;

    public fx1(kx1 kx1Var) {
        this.f14572a = kx1Var;
    }

    public static fx1 a(kx1 kx1Var) {
        return kx1Var instanceof fx1 ? (fx1) kx1Var : new fx1(kx1Var);
    }

    public static dx1 b(kx1 kx1Var) {
        if (kx1Var instanceof dx1) {
            return (dx1) kx1Var;
        }
        kx1Var.getClass();
        return new fx1(kx1Var);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        Object obj = this.f14573b;
        Object obj2 = f14571c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f14573b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objZzb = this.f14572a.zzb();
                Object obj4 = this.f14573b;
                if (obj4 != obj2 && obj4 != objZzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZzb + ". This is likely due to a circular dependency.");
                }
                this.f14573b = objZzb;
                this.f14572a = null;
                return objZzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
