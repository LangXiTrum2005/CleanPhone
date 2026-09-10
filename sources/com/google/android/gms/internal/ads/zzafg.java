package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafg {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = zzfj.zza;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.zza = i2;
            this.zzb = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza(zzap zzapVar) {
        zzgtd zzgtdVarZze = zzapVar.zze(zzaia.class, zzaff.zza);
        int size = zzgtdVarZze.size();
        int i2 = 0;
        while (i2 < size) {
            boolean zZzc = zzc(((zzaia) zzgtdVarZze.get(i2)).zzc);
            i2++;
            if (zZzc) {
                return true;
            }
        }
        zzgtd zzgtdVarZze2 = zzapVar.zze(zzaii.class, zzafe.zza);
        int size2 = zzgtdVarZze2.size();
        int i3 = 0;
        while (i3 < size2) {
            boolean zZzc2 = zzc(((zzaii) zzgtdVarZze2.get(i3)).zzc);
            i3++;
            if (zZzc2) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzb() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }
}
