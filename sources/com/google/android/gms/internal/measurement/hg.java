package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.zs;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hg extends yf implements ag {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zs f23550g = new zs(5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Exception f23551f;

    public hg(UUID uuid, String str, Exception exc, rg rgVar) {
        super("<missing root>", uuid, str, rgVar);
        this.f23551f = exc;
    }

    @Override // com.google.android.gms.internal.measurement.sg
    public final sg f(String str, ng ngVar, rg rgVar) {
        AtomicReference atomicReference = dg.f23392a;
        return m(str, ngVar, true, rgVar);
    }

    @Override // com.google.android.gms.internal.measurement.ag
    public final ig m(String str, ng ngVar, boolean z10, rg rgVar) {
        if (z10) {
            AtomicReference atomicReference = dg.f23392a;
        }
        return new ig(str, this, ngVar, z10, rgVar);
    }

    @Override // com.google.android.gms.internal.measurement.ag
    public final Exception zzf() {
        return this.f23551f;
    }

    @Override // com.google.android.gms.internal.measurement.sg
    public final ng zzh() {
        return mg.f23751e;
    }
}
