package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzyr extends zzzm implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzzf zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    public zzyr(int i2, zzbg zzbgVar, int i3, zzzf zzzfVar, int i4, boolean z2, zzgqb zzgqbVar, int i5) {
        int i6;
        int iZzj;
        byte b2;
        boolean z3;
        int iZzj2;
        boolean z4;
        super(i2, zzbgVar, i3);
        this.zzh = zzzfVar;
        int i7 = 1;
        int i8 = true != zzzfVar.zzT ? 16 : 24;
        this.zzg = zzzu.zzi(this.zzd.zzd);
        this.zzi = zzmk.zzaa(i4, false);
        int i9 = 0;
        while (true) {
            i6 = Integer.MAX_VALUE;
            if (i9 >= zzzfVar.zzq.size()) {
                iZzj = 0;
                i9 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzzu.zzj(this.zzd, (String) zzzfVar.zzq.get(i9), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.zzk = i9;
        this.zzj = iZzj;
        this.zzl = zzzu.zzm(this.zzd.zzf, 0);
        this.zzm = zzzu.zzn(this.zzd, zzzfVar.zzr);
        zzv zzvVar = this.zzd;
        int i10 = zzvVar.zzf;
        this.zzn = i10 == 0 || (i10 & 1) != 0;
        this.zzq = 1 == (zzvVar.zze & 1);
        String str = zzvVar.zzo;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2123537834) {
                if (iHashCode != 187078297) {
                    if (iHashCode == 1504698186 && str.equals("audio/iamf")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("audio/ac4")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("audio/eac3-joc")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0 || b2 == 1 || b2 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        this.zzx = z3;
        int i11 = zzvVar.zzG;
        this.zzr = i11;
        this.zzs = zzvVar.zzH;
        int i12 = zzvVar.zzj;
        this.zzt = i12;
        this.zzf = (i12 == -1 || i12 <= zzzfVar.zzu) && (i11 == -1 || i11 <= zzzfVar.zzt) && zzgqbVar.zza(zzvVar);
        String str2 = zzfj.zza;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i13 = 0; i13 < strArrSplit.length; i13++) {
            strArrSplit[i13] = zzfj.zzh(strArrSplit[i13]);
        }
        int i14 = 0;
        while (true) {
            if (i14 >= strArrSplit.length) {
                iZzj2 = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj2 = zzzu.zzj(this.zzd, strArrSplit[i14], false);
                if (iZzj2 > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.zzo = i14;
        this.zzp = iZzj2;
        for (int i15 = 0; i15 < zzzfVar.zzv.size(); i15++) {
            String str3 = this.zzd.zzo;
            if (str3 != null && str3.equals(zzzfVar.zzv.get(i15))) {
                i6 = i15;
                break;
            }
        }
        this.zzu = i6;
        this.zzv = (i4 & 384) == 128;
        this.zzw = (i4 & 64) == 64;
        zzzf zzzfVar2 = this.zzh;
        if (zzmk.zzaa(i4, zzzfVar2.zzV) && ((z4 = this.zzf) || zzzfVar2.zzO)) {
            int i16 = zzzfVar2.zzw.zzb;
            if (zzmk.zzaa(i4, false) && z4 && this.zzd.zzj != -1 && ((zzzfVar2.zzX || !z2) && (i8 & i4) != 0)) {
                i7 = 2;
            }
        } else {
            i7 = 0;
        }
        this.zze = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyr zzyrVar) {
        boolean z2 = this.zzf;
        zzgux zzguxVarZza = (z2 && this.zzi) ? zzzu.zzc : zzzu.zzc.zza();
        zzgsq zzgsqVarZza = zzgsq.zzg().zzd(this.zzi, zzyrVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzyrVar.zzk), zzgux.zzb().zza()).zzb(this.zzj, zzyrVar.zzj).zzb(this.zzl, zzyrVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzyrVar.zzm), zzgux.zzb().zza()).zzd(this.zzq, zzyrVar.zzq).zzd(this.zzn, zzyrVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzyrVar.zzo), zzgux.zzb().zza()).zzb(this.zzp, zzyrVar.zzp).zzd(z2, zzyrVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzyrVar.zzu), zzgux.zzb().zza());
        boolean z3 = this.zzh.zzF;
        zzgsq zzgsqVarZza2 = zzgsqVarZza.zzd(this.zzv, zzyrVar.zzv).zzd(this.zzw, zzyrVar.zzw).zzd(this.zzx, zzyrVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzyrVar.zzr), zzguxVarZza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzyrVar.zzs), zzguxVarZza);
        if (Objects.equals(this.zzg, zzyrVar.zzg)) {
            zzgsqVarZza2 = zzgsqVarZza2.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzyrVar.zzt), zzguxVarZza);
        }
        return zzgsqVarZza2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final /* bridge */ /* synthetic */ boolean zzc(zzzm zzzmVar) {
        String str;
        int i2;
        zzyr zzyrVar = (zzyr) zzzmVar;
        boolean z2 = this.zzh.zzR;
        zzv zzvVar = this.zzd;
        int i3 = zzvVar.zzG;
        if (i3 == -1) {
            return false;
        }
        zzv zzvVar2 = zzyrVar.zzd;
        return i3 == zzvVar2.zzG && (str = zzvVar.zzo) != null && TextUtils.equals(str, zzvVar2.zzo) && (i2 = zzvVar.zzH) != -1 && i2 == zzvVar2.zzH && this.zzv == zzyrVar.zzv && this.zzw == zzyrVar.zzw;
    }
}
