package x0;

import java.nio.ByteBuffer;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f53542d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f53544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f53545c = 0;

    public q(u uVar, int i10) {
        this.f53544b = uVar;
        this.f53543a = i10;
    }

    public final int a(int i10) {
        y0.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f45720d;
        int i11 = iA + aVarB.f45717a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final y0.a b() {
        ThreadLocal threadLocal = f53542d;
        y0.a aVar = (y0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new y0.a();
            threadLocal.set(aVar);
        }
        y0.b bVar = (y0.b) this.f53544b.f54879b;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i10 = iA + bVar.f45717a;
            int i11 = (this.f53543a * 4) + ((ByteBuffer) bVar.f45720d).getInt(i10) + i10 + 4;
            int i12 = ((ByteBuffer) bVar.f45720d).getInt(i11) + i11;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f45720d;
            aVar.f45720d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f45717a = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                aVar.f45718b = i13;
                aVar.f45719c = ((ByteBuffer) aVar.f45720d).getShort(i13);
                return aVar;
            }
            aVar.f45717a = 0;
            aVar.f45718b = 0;
            aVar.f45719c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        y0.a aVarB = b();
        int iA = aVarB.a(4);
        sb2.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f45720d).getInt(iA + aVarB.f45717a) : 0));
        sb2.append(", codepoints:");
        y0.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i11 = iA2 + aVarB2.f45717a;
            i10 = ((ByteBuffer) aVarB2.f45720d).getInt(((ByteBuffer) aVarB2.f45720d).getInt(i11) + i11);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(Integer.toHexString(a(i12)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
