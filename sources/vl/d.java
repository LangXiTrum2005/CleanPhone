package vl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52629b;

    public d(int i10, int i11) {
        this.f52628a = i10;
        this.f52629b = i11;
    }

    public static b a(d dVar) {
        return new b(dVar.f52628a + dVar.f52629b, 1);
    }

    public static b b() {
        return new b(0, 1);
    }
}
