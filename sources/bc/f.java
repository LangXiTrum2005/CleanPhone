package bc;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rc.d f5546c = new rc.d(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5548b;

    public f(fc.f fVar) {
        this.f5547a = fVar;
        this.f5548b = f5546c;
    }

    @Override // bc.l
    public void a(k kVar, int i10) throws IOException {
        int[] iArr = (int[]) this.f5548b;
        try {
            kVar.read((byte[]) this.f5547a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            kVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f5547a = bArr;
        this.f5548b = iArr;
    }
}
