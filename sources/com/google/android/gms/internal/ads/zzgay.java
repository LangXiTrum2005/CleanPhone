package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgay {
    public static String zza(byte[] bArr, boolean z2) {
        return zzc(z2).zzj(bArr, 0, bArr.length);
    }

    public static byte[] zzb(String str, boolean z2) throws IllegalArgumentException {
        byte[] bArrZzk = zzc(z2).zzk(str);
        if (bArrZzk.length != 0 || str.length() <= 0) {
            return bArrZzk;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    private static zzgvy zzc(boolean z2) {
        return z2 ? zzgvy.zzm().zzh() : zzgvy.zzl();
    }
}
