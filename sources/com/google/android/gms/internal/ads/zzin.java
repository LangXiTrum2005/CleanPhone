package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzin implements zzaah {
    final /* synthetic */ zzip zza;
    private final HashMap zzb;
    private final zzpn zzc;

    public zzin(zzip zzipVar, zzpn zzpnVar) {
        Objects.requireNonNull(zzipVar);
        this.zza = zzipVar;
        this.zzb = new HashMap();
        this.zzc = zzpnVar;
    }

    private final void zze(zzaaf zzaafVar) {
        zzpn zzpnVar = (zzpn) this.zzb.remove(zzaafVar);
        zzpnVar.getClass();
        zzio zzioVar = (zzio) this.zza.zzl().get(zzpnVar);
        if (zzioVar != null) {
            zzioVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final synchronized zzaaf zza() {
        zzaaf zzaafVarZza;
        zzip zzipVar = this.zza;
        zzaan zzaanVarZzk = zzipVar.zzk();
        HashMap map = this.zzb;
        zzaafVarZza = zzaanVarZzk.zza();
        zzpn zzpnVar = this.zzc;
        map.put(zzaafVarZza, zzpnVar);
        zzio zzioVar = (zzio) zzipVar.zzl().get(zzpnVar);
        if (zzioVar != null) {
            zzioVar.zza();
        }
        return zzaafVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final synchronized void zzb(zzaaf zzaafVar) {
        this.zza.zzk().zzb(zzaafVar);
        zze(zzaafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final synchronized void zzc(zzaag zzaagVar) {
        this.zza.zzk().zzc(zzaagVar);
        while (zzaagVar != null) {
            zze(zzaagVar.zzd());
            zzaagVar = zzaagVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final synchronized void zzd() {
        this.zza.zzk().zzd();
    }
}
