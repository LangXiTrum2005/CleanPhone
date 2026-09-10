package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcne implements zzfeh {
    private final zzcmv zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzr zzd;

    public /* synthetic */ zzcne(zzcmv zzcmvVar, byte[] bArr) {
        this.zza = zzcmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfeh
    public final zzfei zza() {
        zzijo.zzc(this.zzb, Context.class);
        zzijo.zzc(this.zzc, String.class);
        zzijo.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzr.class);
        return new zzcnf(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfeh
    public final /* bridge */ /* synthetic */ zzfeh zzb(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.zzd = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfeh
    public final /* bridge */ /* synthetic */ zzfeh zzc(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfeh
    public final /* bridge */ /* synthetic */ zzfeh zzd(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
