package je;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f43826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f43827d;

    public d(f fVar, int i10, int i11) {
        super(fVar);
        this.f43826c = (short) i10;
        this.f43827d = (short) i11;
    }

    @Override // je.f
    public final void a(ke.a aVar, byte[] bArr) {
        aVar.b(this.f43826c, this.f43827d);
    }

    public final String toString() {
        short s10 = this.f43827d;
        return "<" + Integer.toBinaryString((this.f43826c & ((1 << s10) - 1)) | (1 << s10) | (1 << s10)).substring(1) + '>';
    }
}
