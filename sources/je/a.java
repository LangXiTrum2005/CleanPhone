package je;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f43819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f43820d;

    public a(f fVar, int i10, int i11) {
        super(fVar);
        this.f43819c = (short) i10;
        this.f43820d = (short) i11;
    }

    @Override // je.f
    public final void a(ke.a aVar, byte[] bArr) {
        int i10 = 0;
        while (true) {
            short s10 = this.f43820d;
            if (i10 >= s10) {
                return;
            }
            if (i10 == 0 || (i10 == 31 && s10 <= 62)) {
                aVar.b(31, 5);
                if (s10 > 62) {
                    aVar.b(s10 - 31, 16);
                } else if (i10 == 0) {
                    aVar.b(Math.min((int) s10, 31), 5);
                } else {
                    aVar.b(s10 - 31, 5);
                }
            }
            aVar.b(bArr[this.f43819c + i10], 8);
            i10++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        short s10 = this.f43819c;
        sb2.append((int) s10);
        sb2.append("::");
        sb2.append((s10 + this.f43820d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
