package h2;

import com.google.android.gms.internal.ads.rx1;
import go.k;
import java.nio.ByteBuffer;
import k3.i;
import k3.m;
import o1.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g implements k3.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f42076n;

    public b(m mVar) {
        super(new i[2], new k3.c[2]);
        int i10 = this.f47049g;
        o1.d[] dVarArr = this.f47047e;
        k.t(i10 == dVarArr.length);
        for (o1.d dVar : dVarArr) {
            dVar.i(1024);
        }
        this.f42076n = mVar;
    }

    @Override // o1.g
    public final o1.d c() {
        return new i(1);
    }

    @Override // o1.g
    public final o1.e d() {
        return new k3.c(this);
    }

    @Override // o1.g
    public final rx1 e(Throwable th2) {
        return new k3.f("Unexpected decode error", th2);
    }

    @Override // o1.g
    public final rx1 f(o1.d dVar, o1.e eVar, boolean z10) {
        i iVar = (i) dVar;
        k3.c cVar = (k3.c) eVar;
        try {
            ByteBuffer byteBuffer = iVar.f47035e;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            m mVar = this.f42076n;
            if (z10) {
                mVar.reset();
            }
            k3.d dVarG = mVar.g(bArrArray, 0, iLimit);
            long j10 = iVar.f47037g;
            long j11 = iVar.f44291j;
            cVar.f47040c = j10;
            cVar.f44275e = dVarG;
            if (j11 != Long.MAX_VALUE) {
                j10 = j11;
            }
            cVar.f44276f = j10;
            cVar.f47041d = false;
            return null;
        } catch (k3.f e10) {
            return e10;
        }
    }

    @Override // k3.e
    public final void setPositionUs(long j10) {
    }
}
