package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class zzdjw {
    private final zzdlh zza;
    private final zzcir zzb;

    public zzdjw(zzdlh zzdlhVar, zzcir zzcirVar) {
        this.zza = zzdlhVar;
        this.zzb = zzcirVar;
    }

    public final zzdlh zza() {
        return this.zza;
    }

    public final zzcir zzb() {
        return this.zzb;
    }

    public final View zzc() {
        zzcir zzcirVar = this.zzb;
        if (zzcirVar != null) {
            return zzcirVar.zzD();
        }
        return null;
    }

    public final View zzd() {
        zzcir zzcirVar = this.zzb;
        if (zzcirVar == null) {
            return null;
        }
        return zzcirVar.zzD();
    }

    public Set zze(zzczb zzczbVar) {
        return Collections.singleton(new zzdij(zzczbVar, zzcdo.zzg));
    }

    public Set zzf(zzczb zzczbVar) {
        return Collections.singleton(new zzdij(zzczbVar, zzcdo.zzg));
    }

    public final zzdij zzg(Executor executor) {
        final zzcir zzcirVar = this.zzb;
        return new zzdij(new zzdfh() { // from class: com.google.android.gms.internal.ads.zzdju
            @Override // com.google.android.gms.internal.ads.zzdfh
            public final /* synthetic */ void zza() {
                com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL;
                zzcir zzcirVar2 = zzcirVar;
                if (zzcirVar2 == null || (zzmVarZzL = zzcirVar2.zzL()) == null) {
                    return;
                }
                zzmVarZzL.zzb();
            }
        }, executor);
    }
}
