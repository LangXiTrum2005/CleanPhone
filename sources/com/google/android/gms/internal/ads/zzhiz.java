package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhiz {
    private static final zzhiz zza = new zzhiz();
    private static final zzhiy zzb = new zzhiy(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzhiz zza() {
        return zza;
    }

    public final zzhir zzb() {
        zzhir zzhirVar = (zzhir) this.zzc.get();
        return zzhirVar == null ? zzb : zzhirVar;
    }
}
