package lightstruck;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: GrowingArrayUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class competently {
    public static int[] attabal(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[dern(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    public static int dern(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    public static <T> T[] saneness(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), dern(i));
            System.arraycopy(tArr, 0, objArr, 0, i);
            tArr = (T[]) objArr;
        }
        tArr[i] = t;
        return tArr;
    }
}
