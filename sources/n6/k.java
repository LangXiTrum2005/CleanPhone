package n6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l {
    @Override // n6.l
    public final int a(int i10, int i11, int i12, int i13) {
        return l.f46593d ? 2 : 1;
    }

    @Override // n6.l
    public final float b(int i10, int i11, int i12, int i13) {
        if (l.f46593d) {
            return Math.min(i12 / i10, i13 / i11);
        }
        int iMax = Math.max(i11 / i13, i10 / i12);
        if (iMax == 0) {
            return 1.0f;
        }
        return 1.0f / Integer.highestOneBit(iMax);
    }
}
