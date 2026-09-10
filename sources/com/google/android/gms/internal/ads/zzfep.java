package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzfep implements zzfkt {
    public final zzffi zza;
    public final zzffk zzb;
    public final com.google.android.gms.ads.internal.client.zzm zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzx zzf;
    public final zzfkj zzg;

    public zzfep(zzffi zzffiVar, zzffk zzffkVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzx zzxVar, zzfkj zzfkjVar) {
        this.zza = zzffiVar;
        this.zzb = zzffkVar;
        this.zzc = zzmVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzxVar;
        this.zzg = zzfkjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final Executor zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final zzfkj zzb() {
        return this.zzg;
    }
}
