package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcnr implements zzeew {
    private final zzcmv zza;
    private Context zzb;

    public /* synthetic */ zzcnr(zzcmv zzcmvVar, byte[] bArr) {
        this.zza = zzcmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeew
    public final zzeex zza() {
        zzijo.zzc(this.zzb, Context.class);
        return new zzcns(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeew
    public final /* bridge */ /* synthetic */ zzeew zzb(Context context) {
        this.zzb = context;
        return this;
    }
}
