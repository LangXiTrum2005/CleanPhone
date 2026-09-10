package g3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f41456c;

    public e(float f10, int i10, int i11) {
        this.f41454a = i10;
        this.f41455b = i11;
        this.f41456c = f10;
    }

    public static e a(int i10) {
        int i11 = (i10 >> 13) & 7;
        if (i11 == 0) {
            return null;
        }
        return new e(((i10 & 511) * ((i10 & 512) != 0 ? -1 : 1)) / 10.0f, i11, (i10 >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f41454a == eVar.f41454a && this.f41455b == eVar.f41455b && Float.compare(this.f41456c, eVar.f41456c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f41456c) + (((this.f41454a * 31) + this.f41455b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f41454a + ", originator=" + this.f41455b + ", gain=" + this.f41456c + '}';
    }
}
