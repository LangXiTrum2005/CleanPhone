package s6;

import e6.i;
import g6.a0;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import n6.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f50193b = new c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50194a;

    public /* synthetic */ c(int i10) {
        this.f50194a = i10;
    }

    @Override // s6.a
    public final a0 a(a0 a0Var, i iVar) {
        byte[] bArrArray;
        switch (this.f50194a) {
            default:
                ByteBuffer byteBufferAsReadOnlyBuffer = ((r6.c) a0Var.get()).f49419a.f49418a.f49437a.f38740d.asReadOnlyBuffer();
                AtomicReference atomicReference = a7.c.f3418a;
                a7.b bVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new a7.b(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
                if (bVar != null && bVar.f3415b == 0 && bVar.f3416c == ((byte[]) bVar.f3417d).length) {
                    bArrArray = byteBufferAsReadOnlyBuffer.array();
                } else {
                    ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
                    byteBufferAsReadOnlyBuffer2.get(bArr);
                    bArrArray = bArr;
                }
                a0Var = new y(bArrArray);
            case 0:
                return a0Var;
        }
    }
}
