package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j7 implements l7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f23061c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile k7 f23062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f23063b;

    /* JADX WARN: Multi-variable type inference failed */
    public static j7 a(k7 k7Var) {
        if (k7Var instanceof j7) {
            return (j7) k7Var;
        }
        j7 j7Var = new j7();
        j7Var.f23063b = f23061c;
        j7Var.f23062a = k7Var;
        return j7Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l7
    public final Object zzb() {
        Object obj = this.f23063b;
        Object obj2 = f23061c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f23063b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objZzb = this.f23062a.zzb();
                Object obj4 = this.f23063b;
                if (obj4 != obj2 && obj4 != objZzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZzb + ". This is likely due to a circular dependency.");
                }
                this.f23063b = objZzb;
                this.f23062a = null;
                return objZzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
