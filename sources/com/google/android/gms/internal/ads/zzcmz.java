package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcmz implements zzfcu {
    private final zzcmv zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcmz(zzcmv zzcmvVar, byte[] bArr) {
        this.zza = zzcmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcu
    public final zzfcv zza() {
        zzijo.zzc(this.zzb, Context.class);
        zzijo.zzc(this.zzc, String.class);
        return new zzcna(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfcu
    public final /* bridge */ /* synthetic */ zzfcu zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcu
    public final /* bridge */ /* synthetic */ zzfcu zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
