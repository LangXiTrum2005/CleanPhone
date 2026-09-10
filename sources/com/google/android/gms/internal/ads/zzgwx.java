package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.internal.Buffer;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgwx extends zzgwy {
    public static int zza(long j) {
        int i2 = (int) j;
        zzgqa.zze(((long) i2) == j, "Out of range: %s", j);
        return i2;
    }

    public static int zzb(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int zzc(int i2, int i3, int i4) {
        zzgqa.zzg(true, "min (%s) must be less than or equal to max (%s)", i3, 1073741823);
        return Math.min(Math.max(i2, i3), 1073741823);
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        zzgqa.zzg(length >= 4, "array too small: %s < %s", length, 4);
        return zze(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int zze(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << 24) | ((b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((b4 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b5 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public static int[] zzf(Collection collection) {
        if (collection instanceof zzgww) {
            zzgww zzgwwVar = (zzgww) collection;
            return Arrays.copyOfRange(zzgwwVar.zza, zzgwwVar.zzb, zzgwwVar.zzc);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            obj.getClass();
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List zzg(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new zzgww(iArr, 0, length);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer zzh(String str, int i2) {
        Long lValueOf;
        str.getClass();
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            int i3 = cCharAt == '-' ? 1 : 0;
            if (i3 != str.length()) {
                int i4 = i3 + 1;
                int iZza = zzgwz.zza(str.charAt(i3));
                if (iZza >= 0 && iZza < 10) {
                    long j = -iZza;
                    while (true) {
                        if (i4 >= str.length()) {
                            if (cCharAt != '-') {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i5 = i4 + 1;
                        int iZza2 = zzgwz.zza(str.charAt(i4));
                        if (iZza2 >= 0 && iZza2 < 10 && j >= Buffer.OVERFLOW_ZONE) {
                            long j2 = j * 10;
                            long j3 = iZza2;
                            if (j2 >= Long.MIN_VALUE + j3) {
                                j = j2 - j3;
                                i4 = i5;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    public static /* synthetic */ int zzi(int[] iArr, int i2, int i3, int i4) {
        while (i3 < i4) {
            if (iArr[i3] == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }
}
