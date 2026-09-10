package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcxk implements com.google.android.gms.ads.internal.client.zza {
    private final zzcxo zza;
    private final zzfik zzb;

    public zzcxk(zzcxo zzcxoVar, zzfik zzfikVar) {
        this.zza = zzcxoVar;
        this.zzb = zzfikVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}
