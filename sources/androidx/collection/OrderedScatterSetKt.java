package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OrderedScatterSetKt {
    static {
        long[] jArr;
        long[] jArr2;
        MutableOrderedScatterSet mutableOrderedScatterSet = new MutableOrderedScatterSet();
        mutableOrderedScatterSet.f3760a = ScatterMapKt.f3765a;
        mutableOrderedScatterSet.f3761b = ContainerHelpersKt.f3777c;
        mutableOrderedScatterSet.f3762c = SieveCacheKt.f3770a;
        mutableOrderedScatterSet.d = Integer.MAX_VALUE;
        int iC = ScatterMapKt.c(0);
        int iMax = iC > 0 ? Math.max(7, ScatterMapKt.b(iC)) : 0;
        mutableOrderedScatterSet.f3763e = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f3765a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.u(jArr, -9187201950435737472L);
        }
        mutableOrderedScatterSet.f3760a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        ScatterMapKt.a(mutableOrderedScatterSet.f3763e);
        mutableOrderedScatterSet.f3761b = iMax == 0 ? ContainerHelpersKt.f3777c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = SieveCacheKt.f3770a;
        } else {
            jArr2 = new long[iMax];
            ArraysKt.u(jArr2, 4611686018427387903L);
        }
        mutableOrderedScatterSet.f3762c = jArr2;
    }
}
