package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n6 implements s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i5 f23115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y6 f23116b;

    public n6(y6 y6Var, i5 i5Var) {
        o4 o4Var = r5.f23180a;
        this.f23116b = y6Var;
        this.f23115a = i5Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final void a(Object obj) {
        this.f23116b.getClass();
        x6 x6Var = ((w5) obj).zzc;
        if (x6Var.f23274d) {
            x6Var.f23274d = false;
        }
        o4 o4Var = r5.f23180a;
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final int b(w5 w5Var) {
        w5Var.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final boolean c(w5 w5Var, w5 w5Var2) {
        return w5Var.zzc.equals(w5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final void d(Object obj, g6 g6Var) {
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final void e(Object obj, Object obj2) {
        t6.o(obj, obj2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final int f(i5 i5Var) {
        x6 x6Var = ((w5) i5Var).zzc;
        int i10 = x6Var.f23273c;
        if (i10 != -1) {
            return i10;
        }
        x6Var.f23273c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final boolean g(Object obj) {
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final w5 zzc() {
        i5 i5Var = this.f23115a;
        return i5Var instanceof w5 ? (w5) ((w5) i5Var).f(4) : ((v5) ((w5) i5Var).f(5)).b();
    }
}
