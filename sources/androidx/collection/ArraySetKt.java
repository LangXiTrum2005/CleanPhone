package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ArraySetKt {
    public static final void a(ArraySet arraySet, int i2) {
        Intrinsics.f(arraySet, "<this>");
        arraySet.X = new int[i2];
        arraySet.f3735Y = new Object[i2];
    }

    public static final int b(ArraySet arraySet, Object obj, int i2) {
        Intrinsics.f(arraySet, "<this>");
        int i3 = arraySet.Z;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iA = ContainerHelpersKt.a(arraySet.Z, i2, arraySet.X);
            if (iA < 0 || Intrinsics.a(obj, arraySet.f3735Y[iA])) {
                return iA;
            }
            int i4 = iA + 1;
            while (i4 < i3 && arraySet.X[i4] == i2) {
                if (Intrinsics.a(obj, arraySet.f3735Y[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iA - 1; i5 >= 0 && arraySet.X[i5] == i2; i5--) {
                if (Intrinsics.a(obj, arraySet.f3735Y[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
