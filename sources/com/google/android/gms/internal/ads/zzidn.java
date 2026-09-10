package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Utf8;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
final class zzidn {
    public static /* synthetic */ boolean zza(byte b2) {
        return b2 >= 0;
    }

    public static /* synthetic */ boolean zzb(byte b2) {
        return b2 < -32;
    }

    public static /* synthetic */ boolean zzc(byte b2) {
        return b2 < -16;
    }

    public static /* synthetic */ void zzd(byte b2, byte b3, char[] cArr, int i2) throws zzibg {
        if (b2 < -62 || zzg(b3)) {
            throw new zzibg("Protocol message had invalid UTF-8.");
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    public static /* synthetic */ void zze(byte b2, byte b3, byte b4, char[] cArr, int i2) throws zzibg {
        if (!zzg(b3)) {
            if (b2 != -32) {
                if (b2 != -19) {
                    if (!zzg(b4)) {
                        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                        return;
                    }
                } else if (b3 < -96) {
                    b2 = -19;
                    if (!zzg(b4)) {
                        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                        return;
                    }
                }
            } else if (b3 >= -96) {
                b2 = -32;
                if (b2 != -19) {
                    if (!zzg(b4)) {
                        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                        return;
                    }
                } else if (b3 < -96) {
                    b2 = -19;
                    if (!zzg(b4)) {
                        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                        return;
                    }
                }
            }
        }
        throw new zzibg("Protocol message had invalid UTF-8.");
    }

    public static /* synthetic */ void zzf(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws zzibg {
        if (!zzg(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !zzg(b4) && !zzg(b5)) {
                int i3 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i2 + 1] = (char) ((i3 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw new zzibg("Protocol message had invalid UTF-8.");
    }

    private static boolean zzg(byte b2) {
        return b2 > -65;
    }
}
