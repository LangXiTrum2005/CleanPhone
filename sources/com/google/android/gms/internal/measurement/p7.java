package com.google.android.gms.internal.measurement;

import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p7 extends y7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c8 f23840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f23841g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7(c8 c8Var, Object obj, int i10) {
        super(c8Var, true);
        this.f23839e = i10;
        this.f23841g = obj;
        this.f23840f = c8Var;
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public final void a() {
        switch (this.f23839e) {
            case 0:
                y6 y6Var = this.f23840f.f23358f;
                k9.c0.h(y6Var);
                y6Var.setMeasurementEnabled(((Boolean) this.f23841g).booleanValue(), this.f24171a);
                break;
            case 1:
                y6 y6Var2 = this.f23840f.f23358f;
                k9.c0.h(y6Var2);
                y6Var2.retrieveAndUploadBatches(new t7(this, (ta.i0) this.f23841g));
                break;
            case 2:
                y6 y6Var3 = this.f23840f.f23358f;
                k9.c0.h(y6Var3);
                y6Var3.setSgtmDebugInfo((Intent) this.f23841g);
                break;
            default:
                y6 y6Var4 = this.f23840f.f23358f;
                k9.c0.h(y6Var4);
                y6Var4.registerOnMeasurementEventListener((z7) this.f23841g);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(c8 c8Var, Boolean bool) {
        super(c8Var, true);
        this.f23839e = 0;
        this.f23841g = bool;
        Objects.requireNonNull(c8Var);
        this.f23840f = c8Var;
    }
}
