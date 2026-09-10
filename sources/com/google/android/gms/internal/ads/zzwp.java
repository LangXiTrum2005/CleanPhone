package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwp {
    private final zzcx zza = zzcx.zza;

    public final zzwq zza(zzbr zzbrVar, int[] iArr, int i, zzyj zzyjVar, zzfxn zzfxnVar) {
        return new zzwq(zzbrVar, iArr, 0, zzyjVar, WorkRequest.MIN_BACKOFF_MILLIS, 25000L, 25000L, 1279, 719, 0.7f, 0.75f, zzfxnVar, this.zza);
    }
}
