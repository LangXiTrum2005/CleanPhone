package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcth implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcth(zzctg zzctgVar, zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb((Context) this.zza.zzb(), (zzbxu) this.zzb.zzb(), null);
    }
}
