package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ScatterSetKt {
    static {
        long[] jArr;
        MutableScatterSet mutableScatterSet = new MutableScatterSet();
        mutableScatterSet.f3766a = ScatterMapKt.f3765a;
        mutableScatterSet.f3767b = ContainerHelpersKt.f3777c;
        int iC = ScatterMapKt.c(0);
        int iMax = iC > 0 ? Math.max(7, ScatterMapKt.b(iC)) : 0;
        mutableScatterSet.f3768c = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f3765a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.u(jArr, -9187201950435737472L);
        }
        mutableScatterSet.f3766a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        ScatterMapKt.a(mutableScatterSet.f3768c);
        mutableScatterSet.f3767b = iMax == 0 ? ContainerHelpersKt.f3777c : new Object[iMax];
    }
}
