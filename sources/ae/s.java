package ae;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f3539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3540b;

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f3539a[i10];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f3539a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return new String(this.f3539a, i10, i11 - i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f3540b == null) {
            this.f3540b = new String(this.f3539a);
        }
        return this.f3540b;
    }
}
