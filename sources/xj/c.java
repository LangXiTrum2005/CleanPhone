package xj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, i11, "index: ", ", size: "));
        }
    }

    public static void b(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(defpackage.e.g(i10, i11, "index: ", ", size: "));
        }
    }

    public static void c(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbL = l1.d.l("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            sbL.append(i12);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(defpackage.e.g(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }

    public static int d(int i10, int i11) {
        int i12 = i10 + (i10 >> 1);
        if (i12 - i11 < 0) {
            i12 = i11;
        }
        if (i12 - 2147483639 > 0) {
            return i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        return i12;
    }
}
