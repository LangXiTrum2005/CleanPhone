package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzzk extends zzzm implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzzk(int i2, zzbg zzbgVar, int i3, zzzf zzzfVar, int i4, String str, String str2) {
        int iZzj;
        super(i2, zzbgVar, i3);
        int i5 = 0;
        this.zzf = zzmk.zzaa(i4, false);
        int i6 = this.zzd.zze;
        int i7 = zzzfVar.zzC;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        zzgtd zzgtdVarZzj = str2 != null ? zzgtd.zzj(str2) : zzzfVar.zzy.isEmpty() ? zzgtd.zzj("") : zzzfVar.zzy;
        int i8 = 0;
        while (true) {
            if (i8 >= zzgtdVarZzj.size()) {
                iZzj = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzzu.zzj(this.zzd, (String) zzgtdVarZzj.get(i8), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.zzi = i8;
        this.zzj = iZzj;
        int iZzm = zzzu.zzm(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = iZzm;
        zzv zzvVar = this.zzd;
        this.zzn = (1088 & zzvVar.zzf) != 0;
        int iZzn = zzzu.zzn(zzvVar, zzzfVar.zzz);
        this.zzl = iZzn;
        int iZzj2 = zzzu.zzj(this.zzd, str, zzzu.zzi(str) == null);
        this.zzm = iZzj2;
        boolean z2 = iZzj > 0 || (zzzfVar.zzy.isEmpty() && iZzm > 0) || ((zzzfVar.zzy.isEmpty() && iZzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && iZzj2 > 0));
        if (zzmk.zzaa(i4, zzzfVar.zzV) && z2) {
            i5 = 1;
        }
        this.zze = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzk zzzkVar) {
        zzgsq zzgsqVarZza = zzgsq.zzg().zzd(this.zzf, zzzkVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzzkVar.zzi), zzgux.zzb().zza());
        int i2 = this.zzj;
        zzgsq zzgsqVarZzb = zzgsqVarZza.zzb(i2, zzzkVar.zzj);
        int i3 = this.zzk;
        zzgsq zzgsqVarZzb2 = zzgsqVarZzb.zzb(i3, zzzkVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzzkVar.zzl), zzgux.zzb().zza()).zzd(this.zzg, zzzkVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzzkVar.zzh), i2 == 0 ? zzgux.zzb() : zzgux.zzb().zza()).zzb(this.zzm, zzzkVar.zzm);
        if (i3 == 0) {
            zzgsqVarZzb2 = zzgsqVarZzb2.zzc(this.zzn, zzzkVar.zzn);
        }
        return zzgsqVarZzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final /* bridge */ /* synthetic */ boolean zzc(zzzm zzzmVar) {
        return false;
    }
}
