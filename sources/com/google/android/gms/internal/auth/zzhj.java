package com.google.android.gms.internal.auth;

import com.applovin.shadow.okio.Utf8;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
final class zzhj {
    public static /* bridge */ /* synthetic */ void zza(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws zzfa {
        if (!zze(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !zze(b4) && !zze(b5)) {
                int i3 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i2 + 1] = (char) ((i3 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw zzfa.zzb();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    public static /* bridge */ /* synthetic */ void zzb(byte b2, byte b3, byte b4, char[] cArr, int i2) throws zzfa {
        if (!zze(b3)) {
            if (b2 != -32) {
                if (b2 != -19) {
                    if (!zze(b4)) {
                        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                        return;
                    }
                } else if (b3 < -96) {
                    b2 = -19;
                    if (!zze(b4)) {
                        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                        return;
                    }
                }
            } else if (b3 >= -96) {
                b2 = -32;
                if (b2 != -19) {
                    if (!zze(b4)) {
                        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                        return;
                    }
                } else if (b3 < -96) {
                    b2 = -19;
                    if (!zze(b4)) {
                        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
                        return;
                    }
                }
            }
        }
        throw zzfa.zzb();
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b2, byte b3, char[] cArr, int i2) throws zzfa {
        if (b2 < -62 || zze(b3)) {
            throw zzfa.zzb();
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b2) {
        return b2 >= 0;
    }

    private static boolean zze(byte b2) {
        return b2 > -65;
    }
}
