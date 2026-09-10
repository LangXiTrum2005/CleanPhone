package androidx.collection.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContainerHelpersKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f3775a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f3776b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f3777c = new Object[0];

    public static final int a(int i2, int i3, int[] array) {
        Intrinsics.f(array, "array");
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = array[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int b(long[] array, int i2, long j) {
        Intrinsics.f(array, "array");
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j2 = array[i5];
            if (j2 < j) {
                i4 = i5 + 1;
            } else {
                if (j2 <= j) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
