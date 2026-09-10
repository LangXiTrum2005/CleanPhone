package kotlinx.serialization.json.internal;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class impromptu {
    public static /* synthetic */ String attabal(long j, int i) {
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, i);
        }
        if (i < 2 || i > 36) {
            i = 10;
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i2--;
                cArr[i2] = Character.forDigit(((int) j) & i3, i);
                j >>>= iNumberOfTrailingZeros;
            } while (j != 0);
        } else {
            long jAttabal = (i & 1) == 0 ? (j >>> 1) / ((long) (i >>> 1)) : p002kotlin.text.cuirassed.attabal(j, i);
            long j2 = i;
            cArr[63] = Character.forDigit((int) (j - (jAttabal * j2)), i);
            i2 = 63;
            while (jAttabal > 0) {
                i2--;
                cArr[i2] = Character.forDigit((int) (jAttabal % j2), i);
                jAttabal /= j2;
            }
        }
        return new String(cArr, i2, 64 - i2);
    }
}
