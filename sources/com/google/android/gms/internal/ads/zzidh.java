package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzidh extends zzidf {
    @Override // com.google.android.gms.internal.ads.zzidf
    public final /* bridge */ /* synthetic */ void zza(Object obj, int i2, long j) {
        ((zzidg) obj).zzk(i2 << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final /* bridge */ /* synthetic */ void zzb(Object obj, int i2, int i3) {
        ((zzidg) obj).zzk((i2 << 3) | 5, Integer.valueOf(i3));
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final /* bridge */ /* synthetic */ void zzc(Object obj, int i2, long j) {
        ((zzidg) obj).zzk((i2 << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i2, zzhzl zzhzlVar) {
        ((zzidg) obj).zzk((i2 << 3) | 2, zzhzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i2, Object obj2) {
        ((zzidg) obj).zzk((i2 << 3) | 3, (zzidg) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final /* synthetic */ Object zzf() {
        return zzidg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final /* synthetic */ Object zzg(Object obj) {
        zzidg zzidgVar = (zzidg) obj;
        zzidgVar.zzd();
        return zzidgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zziar zziarVar = (zziar) obj;
        zzidg zzidgVar = zziarVar.zzt;
        if (zzidgVar != zzidg.zza()) {
            return zzidgVar;
        }
        zzidg zzidgVarZzb = zzidg.zzb();
        zziarVar.zzt = zzidgVarZzb;
        return zzidgVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zziar) obj).zzt = (zzidg) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzidf
    public final void zzj(Object obj) {
        ((zziar) obj).zzt.zzd();
    }
}
