package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
final class zzamp {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzamp(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = i9;
        this.zzi = i10;
        this.zzj = i11;
        this.zzk = i12;
    }

    public static zzamp zza(String str) {
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i2 >= length) {
                if (i3 != -1) {
                    return new zzamp(i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, length);
                }
                return null;
            }
            switch (zzgpj.zza(strArrSplit[i2].trim())) {
                case "name":
                    i3 = i2;
                    break;
                case "alignment":
                    i4 = i2;
                    break;
                case "primarycolour":
                    i5 = i2;
                    break;
                case "outlinecolour":
                    i6 = i2;
                    break;
                case "fontsize":
                    i7 = i2;
                    break;
                case "bold":
                    i8 = i2;
                    break;
                case "italic":
                    i9 = i2;
                    break;
                case "underline":
                    i10 = i2;
                    break;
                case "strikeout":
                    i11 = i2;
                    break;
                case "borderstyle":
                    i12 = i2;
                    break;
            }
            i2++;
        }
    }
}
