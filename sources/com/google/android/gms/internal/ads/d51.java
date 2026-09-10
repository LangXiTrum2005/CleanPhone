package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d51 implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g51 f13427b;

    public /* synthetic */ d51(g51 g51Var, int i10) {
        this.f13426a = i10;
        this.f13427b = g51Var;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        switch (this.f13426a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                g51 g51Var = this.f13427b;
                if (zBooleanValue) {
                    return g51Var.b(0);
                }
                g51Var.f14769d.b(1003);
                return zw1.d(f51.f14252b);
            default:
                i31 i31Var = (i31) obj;
                c61 c61Var = this.f13427b.f14768c;
                if (i31Var.G() == 2) {
                    return c61Var.a(i31Var.z(), i31Var.A().h());
                }
                if (i31Var.G() == 3) {
                    return c61Var.b(i31Var.z(), i31Var.B().h(), i31Var.A().h());
                }
                throw new AssertionError("Unreachable");
        }
    }
}
