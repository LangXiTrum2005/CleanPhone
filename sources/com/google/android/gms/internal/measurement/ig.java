package com.google.android.gms.internal.measurement;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ig extends bg implements ag {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Exception f23596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f23597h;

    /* JADX WARN: Multi-variable type inference failed */
    public ig(String str, ag agVar, ng ngVar, boolean z10, rg rgVar) {
        super("<missing root>:".concat(str), (yf) agVar, ng.a(ngVar, mg.f23752f), rgVar);
        this.f23596g = agVar.zzf();
        this.f23597h = z10;
    }

    @Override // com.google.android.gms.internal.measurement.sg
    public final sg f(String str, ng ngVar, rg rgVar) {
        AtomicReference atomicReference = dg.f23392a;
        return m(str, ngVar, true, rgVar);
    }

    @Override // com.google.android.gms.internal.measurement.ag
    public final ig m(String str, ng ngVar, boolean z10, rg rgVar) {
        boolean z11 = this.f23597h;
        if (z10 && !z11) {
            AtomicReference atomicReference = dg.f23392a;
        }
        boolean z12 = true;
        if ((!z10 || z11) && !z11) {
            z12 = false;
        }
        return new ig(str, this, ngVar, z12, rgVar);
    }

    @Override // com.google.android.gms.internal.measurement.ag
    public final Exception zzf() {
        return this.f23596g;
    }

    @Override // com.google.android.gms.internal.measurement.sg
    public final ng zzl() {
        return mg.f23751e;
    }

    public ig(UUID uuid, String str, String str2, ng ngVar, Exception exc, rg rgVar) {
        super("<missing root>:".concat(str2), uuid, str, ng.a(ngVar, mg.f23752f), rgVar);
        this.f23596g = exc;
        this.f23597h = false;
    }
}
