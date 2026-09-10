package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
final class zzamn {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzamn(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
    }

    public static zzamn zza(String str) {
        byte b2;
        zzgqa.zza(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i2 >= length) {
                if (i4 == -1 || i5 == -1 || i7 == -1) {
                    return null;
                }
                return new zzamn(i3, i4, i5, i6, i7, length);
            }
            switch (zzgpj.zza(strArrSplit[i2].trim())) {
                case "end":
                    b2 = 2;
                    break;
                case "text":
                    b2 = 4;
                    break;
                case "layer":
                    b2 = 0;
                    break;
                case "start":
                    b2 = 1;
                    break;
                case "style":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                i3 = i2;
            } else if (b2 == 1) {
                i4 = i2;
            } else if (b2 == 2) {
                i5 = i2;
            } else if (b2 == 3) {
                i6 = i2;
            } else if (b2 == 4) {
                i7 = i2;
            }
            i2++;
        }
    }
}
