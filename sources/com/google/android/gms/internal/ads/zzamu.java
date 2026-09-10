package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
final class zzamu {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgtn zze = zzgtn.zzj("auto", "none");
    private static final zzgtn zzf = zzgtn.zzk("dot", "sesame", "circle");
    private static final zzgtn zzg = zzgtn.zzj("filled", MRAIDPresenter.OPEN);
    private static final zzgtn zzh = zzgtn.zzk("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzamu(int i2, int i3, int i4) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public static zzamu zza(String str) {
        byte b2;
        int i2;
        if (str == null) {
            return null;
        }
        String strZza = zzgpj.zza(str.trim());
        if (strZza.isEmpty()) {
            return null;
        }
        zzgtn zzgtnVarZzp = zzgtn.zzp(TextUtils.split(strZza, zzd));
        String str2 = (String) zzgtr.zzb(zzgvn.zza(zzh, zzgtnVarZzp), "outside");
        int iHashCode = str2.hashCode();
        int i3 = -1;
        int i4 = 0;
        if (iHashCode != -1106037339) {
            if (iHashCode == 92734940 && str2.equals("after")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
        } else if (str2.equals("outside")) {
            b2 = 1;
        } else {
            b2 = -1;
        }
        if (b2 != 0) {
            i2 = b2 != 1 ? 1 : -2;
        } else {
            i2 = 2;
        }
        zzgvm zzgvmVarZza = zzgvn.zza(zze, zzgtnVarZzp);
        if (zzgvmVarZza.isEmpty()) {
            zzgvm zzgvmVarZza2 = zzgvn.zza(zzg, zzgtnVarZzp);
            zzgvm zzgvmVarZza3 = zzgvn.zza(zzf, zzgtnVarZzp);
            if (!zzgvmVarZza2.isEmpty() || !zzgvmVarZza3.isEmpty()) {
                String str3 = (String) zzgtr.zzb(zzgvmVarZza2, "filled");
                int i5 = (str3.hashCode() == 3417674 && str3.equals(MRAIDPresenter.OPEN)) ? 2 : 1;
                String str4 = (String) zzgtr.zzb(zzgvmVarZza3, "circle");
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals("dot")) {
                        i3 = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i3 = 1;
                }
                if (i3 == 0) {
                    i3 = 2;
                } else if (i3 != 1) {
                    i4 = i5;
                    i3 = 1;
                } else {
                    i3 = 3;
                }
                i4 = i5;
            }
        } else {
            String str5 = (String) zzgvmVarZza.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i3 = 0;
            }
        }
        return new zzamu(i3, i4, i2);
    }
}
