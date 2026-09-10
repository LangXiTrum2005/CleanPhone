package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzabk {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzabi zza(byte[] bArr) throws zzbc {
        return zzb(new zzdx(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
    
        if (r11 != 3) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzabi zzb(com.google.android.gms.internal.ads.zzdx r11, boolean r12) throws com.google.android.gms.internal.ads.zzbc {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabk.zzb(com.google.android.gms.internal.ads.zzdx, boolean):com.google.android.gms.internal.ads.zzabi");
    }

    private static int zzc(zzdx zzdxVar) {
        int iZzd = zzdxVar.zzd(5);
        return iZzd == 31 ? zzdxVar.zzd(6) + 32 : iZzd;
    }

    private static int zzd(zzdx zzdxVar) throws zzbc {
        int iZzd = zzdxVar.zzd(4);
        if (iZzd == 15) {
            if (zzdxVar.zza() >= 24) {
                return zzdxVar.zzd(24);
            }
            throw zzbc.zza("AAC header insufficient data", null);
        }
        if (iZzd < 13) {
            return zzb[iZzd];
        }
        throw zzbc.zza("AAC header wrong Sampling Frequency Index", null);
    }
}
