package xn;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String a8 = (String) obj;
        String b10 = (String) obj2;
        kotlin.jvm.internal.n.f(a8, "a");
        kotlin.jvm.internal.n.f(b10, "b");
        int iMin = Math.min(a8.length(), b10.length());
        for (int i10 = 4; i10 < iMin; i10++) {
            char cCharAt = a8.charAt(i10);
            char cCharAt2 = b10.charAt(i10);
            if (cCharAt != cCharAt2) {
                return kotlin.jvm.internal.n.h(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = a8.length();
        int length2 = b10.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
