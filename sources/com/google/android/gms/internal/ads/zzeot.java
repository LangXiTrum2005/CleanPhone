package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeot implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzeot(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeoj(((zzetz) this.zza).zzb(), 2147483647L, (Clock) this.zzb.zzb(), zzffh.zzc(), (zzdrw) this.zzc.zzb());
    }
}
