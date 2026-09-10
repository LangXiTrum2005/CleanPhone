package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzccw extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcda zza;

    public zzccw(zzcda zzcdaVar) {
        Objects.requireNonNull(zzcdaVar);
        this.zza = zzcdaVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzcda zzcdaVar = this.zza;
        zzbgn zzbgnVar = new zzbgn(zzcdaVar.zzz(), zzcdaVar.zzA().afmaVersion);
        synchronized (zzcdaVar.zzy()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzm();
                zzbgq.zza(zzcdaVar.zzB(), zzbgnVar);
            } catch (IllegalArgumentException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot config CSI reporter.", e2);
            }
        }
    }
}
