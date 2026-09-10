package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzvm implements zzwr, zztg {
    final /* synthetic */ zzvo zza;
    private final Object zzb;
    private zzwq zzc;
    private zztf zzd;

    public zzvm(zzvo zzvoVar, Object obj) {
        Objects.requireNonNull(zzvoVar);
        this.zza = zzvoVar;
        this.zzc = zzvoVar.zzf(null);
        this.zzd = zzvoVar.zzh(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i2, zzwg zzwgVar) {
        zzwg zzwgVarZzx;
        if (zzwgVar != null) {
            zzwgVarZzx = this.zza.zzx(this.zzb, zzwgVar);
            if (zzwgVarZzx == null) {
                return false;
            }
        } else {
            zzwgVarZzx = null;
        }
        zzvo zzvoVar = this.zza;
        zzvoVar.zzw(this.zzb, 0);
        zzwq zzwqVar = this.zzc;
        int i3 = zzwqVar.zza;
        if (!Objects.equals(zzwqVar.zzb, zzwgVarZzx)) {
            this.zzc = zzvoVar.zzg(0, zzwgVarZzx);
        }
        zztf zztfVar = this.zzd;
        int i4 = zztfVar.zza;
        if (Objects.equals(zztfVar.zzb, zzwgVarZzx)) {
            return true;
        }
        this.zzd = zzvoVar.zzi(0, zzwgVarZzx);
        return true;
    }

    private final zzwc zzg(zzwc zzwcVar, zzwg zzwgVar) {
        zzvo zzvoVar = this.zza;
        Object obj = this.zzb;
        zzvoVar.zzy(obj, zzwcVar.zzc, zzwgVar);
        zzvoVar.zzy(obj, zzwcVar.zzd, zzwgVar);
        return zzwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzai(int i2, zzwg zzwgVar, zzvx zzvxVar, zzwc zzwcVar, int i3) {
        if (zzf(0, zzwgVar)) {
            zzwq zzwqVar = this.zzc;
            zzg(zzwcVar, zzwgVar);
            zzwqVar.zzd(zzvxVar, zzwcVar, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzaj(int i2, zzwg zzwgVar, zzvx zzvxVar, zzwc zzwcVar) {
        if (zzf(0, zzwgVar)) {
            zzwq zzwqVar = this.zzc;
            zzg(zzwcVar, zzwgVar);
            zzwqVar.zze(zzvxVar, zzwcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzak(int i2, zzwg zzwgVar, zzvx zzvxVar, zzwc zzwcVar) {
        if (zzf(0, zzwgVar)) {
            zzwq zzwqVar = this.zzc;
            zzg(zzwcVar, zzwgVar);
            zzwqVar.zzf(zzvxVar, zzwcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzal(int i2, zzwg zzwgVar, zzvx zzvxVar, zzwc zzwcVar, IOException iOException, boolean z2) {
        if (zzf(0, zzwgVar)) {
            zzwq zzwqVar = this.zzc;
            zzg(zzwcVar, zzwgVar);
            zzwqVar.zzg(zzvxVar, zzwcVar, iOException, z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzam(int i2, zzwg zzwgVar, zzwc zzwcVar) {
        if (zzf(0, zzwgVar)) {
            zzwq zzwqVar = this.zzc;
            zzg(zzwcVar, zzwgVar);
            zzwqVar.zzh(zzwcVar);
        }
    }
}
