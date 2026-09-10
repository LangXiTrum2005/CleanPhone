package com.google.common.collect;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: CompactHashing.java */
/* JADX INFO: loaded from: classes3.dex */
public final class empress {
    public static Object attabal(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            return i <= 65536 ? new short[i] : new int[i];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i);
    }

    public static int beachfront(@CheckForNull Object obj, @CheckForNull Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, @CheckForNull Object[] objArr2) {
        int iDern = lightstruck.dern(obj);
        int i2 = iDern & i;
        int iImpromptu = impromptu(obj3, i2);
        if (iImpromptu == 0) {
            return -1;
        }
        int iSaneness = saneness(iDern, i);
        int i3 = -1;
        while (true) {
            int i4 = iImpromptu - 1;
            int i5 = iArr[i4];
            if (saneness(i5, i) == iSaneness && com.google.common.base.taiyuan.attabal(obj, objArr[i4]) && (objArr2 == null || com.google.common.base.taiyuan.attabal(obj2, objArr2[i4]))) {
                int iDern2 = dern(i5, i);
                if (i3 == -1) {
                    taiyuan(obj3, i2, iDern2);
                    return i4;
                }
                iArr[i3] = wireman(iArr[i3], iDern2, i);
                return i4;
            }
            int iDern3 = dern(i5, i);
            if (iDern3 == 0) {
                return -1;
            }
            i3 = i4;
            iImpromptu = iDern3;
        }
    }

    public static void competently(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static int cutely(int i) {
        return Math.max(4, lightstruck.attabal(i + 1, 1.0d));
    }

    public static int dern(int i, int i2) {
        return i & i2;
    }

    public static int impromptu(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static int marial(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    public static int saneness(int i, int i2) {
        return i & (~i2);
    }

    public static void taiyuan(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int wireman(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }
}
