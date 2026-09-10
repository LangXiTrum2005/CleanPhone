package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
final class zzeyx implements zzfuc {
    final /* synthetic */ zzezb zza;

    public zzeyx(zzezb zzezbVar) {
        this.zza = zzezbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        com.google.android.gms.ads.internal.util.client.zzo.zzh("", (zzdyh) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzezb zzezbVar = this.zza;
        zzezbVar.zzd = new zzeyz(null, zzezbVar.zze(), null);
        return this.zza.zzd;
    }
}
