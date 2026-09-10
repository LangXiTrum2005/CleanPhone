package androidx.collection;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0004*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0002\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0003\"\u00020\u00002\u00020\u0000¨\u0006\u0004"}, d2 = {"", "Bitmask", "Group", "StaticBitmask", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ScatterMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f3765a = {-9187201950435737345L, -1};

    static {
        int iC = c(0);
        int iMax = iC > 0 ? Math.max(7, b(iC)) : 0;
        if (iMax != 0) {
            long[] jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.u(jArr, -9187201950435737472L);
            int i2 = iMax >> 3;
            long j = 255 << ((7 & iMax) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        if (iMax != 0) {
            Object[] objArr = new Object[iMax];
        }
        if (iMax == 0) {
            return;
        }
        Object[] objArr2 = new Object[iMax];
    }

    public static final int a(int i2) {
        if (i2 == 7) {
            return 6;
        }
        return i2 - (i2 / 8);
    }

    public static final int b(int i2) {
        if (i2 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i2);
        }
        return 0;
    }

    public static final int c(int i2) {
        if (i2 == 7) {
            return 8;
        }
        return ((i2 - 1) / 7) + i2;
    }
}
