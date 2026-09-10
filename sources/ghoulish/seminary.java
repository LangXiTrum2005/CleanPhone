package ghoulish;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: TsUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class seminary {
    public static int attabal(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long dern(decarock.stratoscope stratoscopeVar, int i, int i2) {
        stratoscopeVar.mathsort(i);
        if (stratoscopeVar.attabal() < 5) {
            return C.TIME_UNSET;
        }
        int iMonoploid = stratoscopeVar.monoploid();
        if ((8388608 & iMonoploid) != 0 || ((2096896 & iMonoploid) >> 8) != i2 || (iMonoploid & 32) == 0 || stratoscopeVar.supplicat() < 7 || stratoscopeVar.attabal() < 7 || (stratoscopeVar.supplicat() & 16) != 16) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        stratoscopeVar.formularize(bArr, 0, 6);
        return wireman(bArr);
    }

    public static boolean saneness(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * Opcodes.NEWARRAY) + i3;
            if (i6 < i || i6 >= i2 || bArr[i6] != 71) {
                i4 = 0;
            } else {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long wireman(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
