package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzxd extends zzxo implements Comparable {
    private final int zze;
    private final boolean zzf;

    @Nullable
    private final String zzg;
    private final zzxh zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final boolean zzw;

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    public zzxd(int i, zzbr zzbrVar, int i2, zzxh zzxhVar, int i3, boolean z, zzfuo zzfuoVar, int i4) {
        int i5;
        int iZzc;
        byte b;
        boolean z2;
        int iZzc2;
        boolean z3;
        super(i, zzbrVar, i2);
        this.zzh = zzxhVar;
        int i6 = 1;
        int i7 = true != zzxhVar.zzM ? 16 : 24;
        this.zzg = zzxt.zzh(this.zzd.zzd);
        this.zzi = zzlk.zza(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= zzxhVar.zzo.size()) {
                i8 = Integer.MAX_VALUE;
                iZzc = 0;
                break;
            } else {
                iZzc = zzxt.zzc(this.zzd, (String) zzxhVar.zzo.get(i8), false);
                if (iZzc > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.zzk = i8;
        this.zzj = iZzc;
        this.zzl = zzxt.zzb(this.zzd.zzf, 0);
        zzab zzabVar = this.zzd;
        int i9 = zzabVar.zzf;
        this.zzm = i9 == 0 || (i9 & 1) != 0;
        this.zzp = 1 == (zzabVar.zze & 1);
        String str = zzabVar.zzo;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2123537834) {
                if (iHashCode != 187078297) {
                    if (iHashCode == 1504698186 && str.equals("audio/iamf")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("audio/ac4")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0 || b == 1 || b == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.zzw = z2;
        this.zzq = zzabVar.zzD;
        this.zzr = zzabVar.zzE;
        this.zzs = zzabVar.zzj;
        this.zzf = zzfuoVar.zza(zzabVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = zzei.zza >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            strArrSplit[i10] = zzei.zzE(strArrSplit[i10]);
        }
        int i11 = 0;
        while (true) {
            if (i11 >= strArrSplit.length) {
                i11 = Integer.MAX_VALUE;
                iZzc2 = 0;
                break;
            } else {
                iZzc2 = zzxt.zzc(this.zzd, strArrSplit[i11], false);
                if (iZzc2 > 0) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.zzn = i11;
        this.zzo = iZzc2;
        for (int i12 = 0; i12 < zzxhVar.zzs.size(); i12++) {
            String str2 = this.zzd.zzo;
            if (str2 != null && str2.equals(zzxhVar.zzs.get(i12))) {
                i5 = i12;
                break;
            }
        }
        this.zzt = i5;
        this.zzu = (i3 & 384) == 128;
        this.zzv = (i3 & 64) == 64;
        zzxh zzxhVar2 = this.zzh;
        if (!zzlk.zza(i3, zzxhVar2.zzO) || (!(z3 = this.zzf) && !zzxhVar2.zzH)) {
            i6 = 0;
        } else if (zzlk.zza(i3, false) && z3 && this.zzd.zzj != -1 && ((zzxhVar2.zzQ || !z) && (i7 & i3) != 0)) {
            i6 = 2;
        }
        this.zze = i6;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxd zzxdVar) {
        zzfyy zzfyyVarZza = (this.zzf && this.zzi) ? zzxt.zzc : zzxt.zzc.zza();
        zzfxc zzfxcVarZzc = zzfxc.zzj().zzd(this.zzi, zzxdVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzxdVar.zzk), zzfyy.zzc().zza()).zzb(this.zzj, zzxdVar.zzj).zzb(this.zzl, zzxdVar.zzl).zzd(this.zzp, zzxdVar.zzp).zzd(this.zzm, zzxdVar.zzm).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzxdVar.zzn), zzfyy.zzc().zza()).zzb(this.zzo, zzxdVar.zzo).zzd(this.zzf, zzxdVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzxdVar.zzt), zzfyy.zzc().zza());
        boolean z = this.zzh.zzz;
        zzfxc zzfxcVarZzc2 = zzfxcVarZzc.zzd(this.zzu, zzxdVar.zzu).zzd(this.zzv, zzxdVar.zzv).zzd(this.zzw, zzxdVar.zzw).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzxdVar.zzq), zzfyyVarZza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzxdVar.zzr), zzfyyVarZza);
        if (Objects.equals(this.zzg, zzxdVar.zzg)) {
            zzfxcVarZzc2 = zzfxcVarZzc2.zzc(Integer.valueOf(this.zzs), Integer.valueOf(zzxdVar.zzs), zzfyyVarZza);
        }
        return zzfxcVarZzc2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final /* bridge */ /* synthetic */ boolean zzc(zzxo zzxoVar) {
        String str;
        zzxd zzxdVar = (zzxd) zzxoVar;
        boolean z = this.zzh.zzK;
        zzab zzabVar = this.zzd;
        int i = zzabVar.zzD;
        if (i == -1) {
            return false;
        }
        zzab zzabVar2 = zzxdVar.zzd;
        if (i != zzabVar2.zzD || (str = zzabVar.zzo) == null || !TextUtils.equals(str, zzabVar2.zzo)) {
            return false;
        }
        boolean z2 = this.zzh.zzJ;
        int i2 = this.zzd.zzE;
        return i2 != -1 && i2 == zzxdVar.zzd.zzE && this.zzu == zzxdVar.zzu && this.zzv == zzxdVar.zzv;
    }
}
