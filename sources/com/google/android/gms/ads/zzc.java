package com.google.android.gms.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc {
    public static AdSize zza(int i10, int i11, String str) {
        return new AdSize(i10, i11, str);
    }

    public static AdSize zzb(int i10, int i11) {
        AdSize adSize = new AdSize(i10, i11);
        adSize.f10635f = true;
        adSize.f10636g = i11;
        return adSize;
    }

    public static AdSize zzc(int i10, int i11) {
        AdSize adSize = new AdSize(i10, i11);
        adSize.f10637h = true;
        adSize.f10638i = i11;
        return adSize;
    }

    public static boolean zzd(AdSize adSize) {
        return adSize.f10637h;
    }

    public static int zze(AdSize adSize) {
        return adSize.f10638i;
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.f10633d;
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.f10635f;
    }

    public static int zzh(AdSize adSize) {
        return adSize.f10636g;
    }

    public static boolean zzi(AdSize adSize) {
        return adSize.f10634e;
    }
}
