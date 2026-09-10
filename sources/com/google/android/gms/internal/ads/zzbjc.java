package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbjc {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzbja zza() {
        return (zzbja) zza.get();
    }

    public static zzbjb zzb() {
        return (zzbjb) zzb.get();
    }

    public static void zzc(zzbja zzbjaVar) {
        zza.set(zzbjaVar);
    }
}
