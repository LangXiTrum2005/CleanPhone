package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzerx implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzerx(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4) {
        this.zza = zzhfjVar2;
        this.zzb = zzhfjVar3;
        this.zzc = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzerv(zzffh.zzc(), ((zzcvk) this.zza).zza(), (PackageInfo) this.zzb.zzb(), ((zzchb) this.zzc).zzb());
    }
}
