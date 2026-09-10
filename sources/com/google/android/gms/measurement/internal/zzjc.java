package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
final class zzjc implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzlk zzc;
    final /* synthetic */ zzjz zzd;

    public zzjc(zzjz zzjzVar, zzq zzqVar, boolean z, zzlk zzlkVar) {
        this.zzd = zzjzVar;
        this.zza = zzqVar;
        this.zzb = z;
        this.zzc = zzlkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVar = this.zzd;
        zzej zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            DM.w(zzjzVar.zzt, "Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zzD(zzejVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzQ();
    }
}
