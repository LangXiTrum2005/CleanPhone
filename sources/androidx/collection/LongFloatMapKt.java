package androidx.collection;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LongFloatMapKt {
    static {
        long[] jArr = ScatterMapKt.f3765a;
        int i2 = LongSetKt.f3744a;
        int i3 = FloatSetKt.f3740a;
        int iC = ScatterMapKt.c(0);
        int iMax = iC > 0 ? Math.max(7, ScatterMapKt.b(iC)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.u(jArr, -9187201950435737472L);
        }
        int i4 = iMax >> 3;
        long j = 255 << ((7 & iMax) << 3);
        jArr[i4] = (jArr[i4] & (~j)) | j;
        long[] jArr2 = new long[iMax];
        float[] fArr = new float[iMax];
    }
}
