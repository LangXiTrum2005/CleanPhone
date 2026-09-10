package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeei implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzeei(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeeh zzb() {
        return new zzeeh((Context) this.zza.zzb(), (zzcpq) this.zzb.zzb());
    }
}
