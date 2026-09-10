package com.google.android.gms.internal.ads;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeri implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzeri(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzerg zzb() {
        return new zzerg(((zzche) this.zza).zza(), (Intent) this.zzb.zzb());
    }
}
