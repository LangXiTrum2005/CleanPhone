package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgsl {
    public static Object zza(int i2) {
        if (i2 < 2 || i2 > 1073741824 || Integer.highestOneBit(i2) != i2) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.g(i2, "must be power of 2 between 2^1 and 2^30: ", new StringBuilder(String.valueOf(i2).length() + 41)));
        }
        if (i2 <= 256) {
            return new byte[i2];
        }
        return i2 <= 65536 ? new short[i2] : new int[i2];
    }

    public static int zzb(Object obj, int i2) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i2] : ((int[]) obj)[i2];
    }

    public static void zzc(Object obj, int i2, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static int zzd(int i2) {
        return (i2 + 1) * (i2 < 32 ? 4 : 2);
    }

    public static int zze(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iZzb = zzgsw.zzb(obj);
        int i3 = iZzb & i2;
        int iZzb2 = zzb(obj3, i3);
        if (iZzb2 != 0) {
            int i4 = ~i2;
            int i5 = iZzb & i4;
            int i6 = -1;
            while (true) {
                int i7 = iZzb2 - 1;
                int i8 = iArr[i7];
                int i9 = i8 & i2;
                if ((i8 & i4) != i5 || !Objects.equals(obj, objArr[i7]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i7]))) {
                    if (i9 == 0) {
                        break;
                    }
                    i6 = i7;
                    iZzb2 = i9;
                } else {
                    if (i6 == -1) {
                        zzc(obj3, i3, i9);
                        return i7;
                    }
                    iArr[i6] = (iArr[i6] & i4) | (i9 & i2);
                    return i7;
                }
            }
        }
        return -1;
    }
}
