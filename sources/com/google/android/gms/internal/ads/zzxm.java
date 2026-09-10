package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzxm extends zzxo implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzxm(int i, zzbr zzbrVar, int i2, zzxh zzxhVar, int i3, @Nullable String str) {
        int iZzc;
        super(i, zzbrVar, i2);
        int i4 = 0;
        this.zzf = zzlk.zza(i3, false);
        int i5 = this.zzd.zze;
        int i6 = zzxhVar.zzw;
        this.zzg = 1 == (i5 & 1);
        this.zzh = (i5 & 2) != 0;
        zzfxn zzfxnVarZzo = zzxhVar.zzu.isEmpty() ? zzfxn.zzo("") : zzxhVar.zzu;
        int i7 = 0;
        while (true) {
            if (i7 >= zzfxnVarZzo.size()) {
                i7 = Integer.MAX_VALUE;
                iZzc = 0;
                break;
            } else {
                iZzc = zzxt.zzc(this.zzd, (String) zzfxnVarZzo.get(i7), false);
                if (iZzc > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.zzi = i7;
        this.zzj = iZzc;
        int iZzb = zzxt.zzb(this.zzd.zzf, zzxhVar.zzv);
        this.zzk = iZzb;
        this.zzm = (this.zzd.zzf & 1088) != 0;
        int iZzc2 = zzxt.zzc(this.zzd, str, zzxt.zzh(str) == null);
        this.zzl = iZzc2;
        boolean z = iZzc > 0 || (zzxhVar.zzu.isEmpty() && iZzb > 0) || this.zzg || (this.zzh && iZzc2 > 0);
        if (zzlk.zza(i3, zzxhVar.zzO) && z) {
            i4 = 1;
        }
        this.zze = i4;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxm zzxmVar) {
        zzfxc zzfxcVarZzb = zzfxc.zzj().zzd(this.zzf, zzxmVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzxmVar.zzi), zzfyy.zzc().zza()).zzb(this.zzj, zzxmVar.zzj).zzb(this.zzk, zzxmVar.zzk).zzd(this.zzg, zzxmVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzxmVar.zzh), this.zzj == 0 ? zzfyy.zzc() : zzfyy.zzc().zza()).zzb(this.zzl, zzxmVar.zzl);
        if (this.zzk == 0) {
            zzfxcVarZzb = zzfxcVarZzb.zze(this.zzm, zzxmVar.zzm);
        }
        return zzfxcVarZzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final /* bridge */ /* synthetic */ boolean zzc(zzxo zzxoVar) {
        return false;
    }
}
