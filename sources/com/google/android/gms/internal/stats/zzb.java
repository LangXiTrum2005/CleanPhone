package com.google.android.gms.internal.stats;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzb implements Closeable {
    private static final zzb zza = new zzb(false, null);

    private zzb(boolean z2, zzd zzdVar) {
    }

    public static zzb zza(boolean z2, zzc zzcVar) {
        return zza;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
