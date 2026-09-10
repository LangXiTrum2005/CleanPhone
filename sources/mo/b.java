package mo;

import kotlin.jvm.internal.n;
import lo.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f46263a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c4) {
        if ('0' <= c4 && c4 < ':') {
            return c4 - '0';
        }
        if ('a' <= c4 && c4 < 'g') {
            return c4 - 'W';
        }
        if ('A' <= c4 && c4 < 'G') {
            return c4 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c4);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    public static final int b(q qVar, int i10) {
        int i11;
        int[] iArr = qVar.f45670f;
        int i12 = i10 + 1;
        int length = qVar.f45669e.length;
        n.f(iArr, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (i14 <= i13) {
            i11 = (i14 + i13) >>> 1;
            int i15 = iArr[i11];
            if (i15 < i12) {
                i14 = i11 + 1;
            } else {
                if (i15 <= i12) {
                    if (i11 >= 0) {
                        return i11;
                    }
                    return ~i11;
                }
                i13 = i11 - 1;
            }
        }
        i11 = (-i14) - 1;
        if (i11 >= 0) {
            return i11;
        }
        return ~i11;
    }
}
