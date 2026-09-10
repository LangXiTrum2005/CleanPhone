package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcnk implements zzdyv {
    private final zzcmv zza;
    private Context zzb;
    private zzbon zzc;

    public /* synthetic */ zzcnk(zzcmv zzcmvVar, byte[] bArr) {
        this.zza = zzcmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyv
    public final zzdyw zza() {
        zzijo.zzc(this.zzb, Context.class);
        zzijo.zzc(this.zzc, zzbon.class);
        return new zzcnl(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdyv
    public final /* bridge */ /* synthetic */ zzdyv zzb(zzbon zzbonVar) {
        zzbonVar.getClass();
        this.zzc = zzbonVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdyv
    public final /* bridge */ /* synthetic */ zzdyv zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
