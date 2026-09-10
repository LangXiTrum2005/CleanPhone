package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
public final class zzecx implements zzecw {

    @VisibleForTesting
    public final zzecw zza;
    private final zzfuc zzb;

    public zzecx(zzecw zzecwVar, zzfuc zzfucVar) {
        this.zza = zzecwVar;
        this.zzb = zzfucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final AI zza(zzfca zzfcaVar, zzfbo zzfboVar) {
        return zzgch.zzm(this.zza.zza(zzfcaVar, zzfboVar), this.zzb, zzbzw.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfcaVar, zzfbo zzfboVar) {
        return this.zza.zzb(zzfcaVar, zzfboVar);
    }
}
