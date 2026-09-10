package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcnv implements zzfhk {
    private final zzcmv zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcnv(zzcmv zzcmvVar, byte[] bArr) {
        this.zza = zzcmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    public final zzfhl zza() {
        zzijo.zzc(this.zzb, Context.class);
        return new zzcnw(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    public final /* synthetic */ zzfhk zzb(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhk
    public final /* bridge */ /* synthetic */ zzfhk zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
