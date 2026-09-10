package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzzt extends zzzm {
    private final boolean zze;
    private final zzzf zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    /* JADX WARN: Code duplicated, block: B:120:0x017e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX WARN: Code duplicated, block: B:33:0x004d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0124  */
    public zzzt(int i2, zzbg zzbgVar, int i3, zzzf zzzfVar, int i4, String str, int i5, boolean z2) {
        boolean z3;
        boolean z4;
        int i6;
        int iZzj;
        int i7;
        byte b2;
        boolean z5;
        zzv zzvVar;
        int i8;
        int i9;
        int i10;
        zzv zzvVar2;
        int i11;
        int i12;
        int i13;
        super(i2, zzbgVar, i3);
        this.zzf = zzzfVar;
        int i14 = 1;
        int i15 = true != zzzfVar.zzM ? 16 : 24;
        if (!z2 || (((i11 = (zzvVar2 = this.zzd).zzv) != -1 && i11 > zzzfVar.zza) || ((i12 = zzvVar2.zzw) != -1 && i12 > zzzfVar.zzb))) {
            z3 = false;
        } else {
            float f = zzvVar2.zzz;
            if ((f == -1.0f || f <= zzzfVar.zzc) && ((i13 = zzvVar2.zzj) == -1 || i13 <= zzzfVar.zzd)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.zze = z3;
        if (!z2 || (((i8 = (zzvVar = this.zzd).zzv) != -1 && i8 < 0) || ((i9 = zzvVar.zzw) != -1 && i9 < 0))) {
            z4 = false;
        } else {
            float f2 = zzvVar.zzz;
            if ((f2 == -1.0f || f2 >= 0.0f) && ((i10 = zzvVar.zzj) == -1 || i10 >= 0)) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        this.zzg = z4;
        this.zzh = zzmk.zzaa(i4, false);
        zzv zzvVar3 = this.zzd;
        float f3 = zzvVar3.zzz;
        this.zzi = f3 != -1.0f && f3 >= 10.0f;
        this.zzj = zzvVar3.zzj;
        this.zzk = zzvVar3.zzc();
        int i16 = 0;
        while (true) {
            i6 = Integer.MAX_VALUE;
            if (i16 >= zzzfVar.zzo.size()) {
                iZzj = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzzu.zzj(this.zzd, (String) zzzfVar.zzo.get(i16), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.zzm = i16;
        this.zzn = iZzj;
        this.zzo = zzzu.zzm(this.zzd.zzf, 0);
        int i17 = this.zzd.zzf;
        this.zzq = i17 == 0 || (i17 & 1) != 0;
        this.zzr = zzzu.zzj(this.zzd, str, zzzu.zzi(str) == null);
        for (int i18 = 0; i18 < zzzfVar.zzm.size(); i18++) {
            String str2 = this.zzd.zzo;
            if (str2 != null && str2.equals(zzzfVar.zzm.get(i18))) {
                i6 = i18;
                break;
            }
        }
        this.zzl = i6;
        this.zzp = zzzu.zzn(this.zzd, zzzfVar.zzn);
        this.zzt = (i4 & 384) == 128;
        this.zzu = (i4 & 64) == 64;
        zzv zzvVar4 = this.zzd;
        String str3 = zzvVar4.zzo;
        if (str3 == null) {
            i7 = 0;
        } else {
            i7 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    b2 = 0;
                    break;
                case "video/av01":
                    b2 = 1;
                    break;
                case "video/hevc":
                    b2 = 2;
                    break;
                case "video/avc":
                    b2 = 4;
                    break;
                case "video/x-vnd.on2.vp9":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                i7 = 5;
            } else if (b2 != 1) {
                if (b2 == 2) {
                    i7 = 3;
                } else if (b2 == 3) {
                    i7 = 2;
                } else if (b2 != 4) {
                    i7 = 0;
                } else {
                    i7 = 1;
                }
            }
        }
        this.zzv = i7;
        if ((zzvVar4.zzf & 16384) != 0) {
            i14 = 0;
        } else {
            zzzf zzzfVar2 = this.zzf;
            if (!zzmk.zzaa(i4, zzzfVar2.zzV) || (!(z5 = this.zze) && !zzzfVar2.zzK)) {
                i14 = 0;
            } else if (zzmk.zzaa(i4, false) && this.zzg && z5 && zzvVar4.zzj != -1 && (i15 & i4) != 0) {
                i14 = 2;
            }
        }
        this.zzs = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzzt zzztVar, zzzt zzztVar2) {
        zzgsq zzgsqVarZza = zzgsq.zzg().zzd(zzztVar.zzh, zzztVar2.zzh).zza(Integer.valueOf(zzztVar.zzm), Integer.valueOf(zzztVar2.zzm), zzgux.zzb().zza()).zzb(zzztVar.zzn, zzztVar2.zzn).zzb(zzztVar.zzo, zzztVar2.zzo).zza(Integer.valueOf(zzztVar.zzp), Integer.valueOf(zzztVar2.zzp), zzgux.zzb().zza()).zzd(zzztVar.zzq, zzztVar2.zzq).zzb(zzztVar.zzr, zzztVar2.zzr).zzd(zzztVar.zzi, zzztVar2.zzi).zzd(zzztVar.zze, zzztVar2.zze).zzd(zzztVar.zzg, zzztVar2.zzg).zza(Integer.valueOf(zzztVar.zzl), Integer.valueOf(zzztVar2.zzl), zzgux.zzb().zza());
        boolean z2 = zzztVar.zzt;
        zzgsq zzgsqVarZzd = zzgsqVarZza.zzd(z2, zzztVar2.zzt);
        boolean z3 = zzztVar.zzu;
        zzgsq zzgsqVarZzd2 = zzgsqVarZzd.zzd(z3, zzztVar2.zzu);
        if (z2 && z3) {
            zzgsqVarZzd2 = zzgsqVarZzd2.zzb(zzztVar.zzv, zzztVar2.zzv);
        }
        return zzgsqVarZzd2.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzzt zzztVar, zzzt zzztVar2) {
        zzgux zzguxVarZza = (zzztVar.zze && zzztVar.zzh) ? zzzu.zzc : zzzu.zzc.zza();
        zzgsq zzgsqVarZzg = zzgsq.zzg();
        boolean z2 = zzztVar.zzf.zzF;
        return zzgsqVarZzg.zza(Integer.valueOf(zzztVar.zzk), Integer.valueOf(zzztVar2.zzk), zzguxVarZza).zza(Integer.valueOf(zzztVar.zzj), Integer.valueOf(zzztVar2.zzj), zzguxVarZza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final /* bridge */ /* synthetic */ boolean zzc(zzzm zzzmVar) {
        zzzt zzztVar = (zzzt) zzzmVar;
        if (!Objects.equals(this.zzd.zzo, zzztVar.zzd.zzo)) {
            return false;
        }
        boolean z2 = this.zzf.zzN;
        return this.zzt == zzztVar.zzt && this.zzu == zzztVar.zzu;
    }
}
