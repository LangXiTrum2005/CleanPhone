package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfc {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzbfa zza() {
        return (zzbfa) zza.get();
    }

    public static zzbfb zzb() {
        return (zzbfb) zzb.get();
    }

    public static void zzc(zzbfa zzbfaVar) {
        zza.set(zzbfaVar);
    }
}
