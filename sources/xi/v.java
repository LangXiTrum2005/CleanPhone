package xi;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f53830b = new v(u.f53827a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f53831a;

    public v(u uVar) {
        this.f53831a = uVar;
    }

    @Override // xi.q
    public final m a(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        u uVar = this.f53831a;
        Object objE = uVar.e(byteBuffer);
        Object objE2 = uVar.e(byteBuffer);
        if (!(objE instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new m((String) objE, objE2);
    }

    @Override // xi.q
    public final ByteBuffer b(Object obj) throws IOException {
        hk.a aVar = new hk.a();
        aVar.write(0);
        this.f53831a.k(aVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.d(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // xi.q
    public final Object c(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b10 = byteBuffer.get();
        u uVar = this.f53831a;
        if (b10 != 0) {
            if (b10 == 1) {
            }
            throw new IllegalArgumentException("Envelope corrupted");
        }
        Object objE = uVar.e(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return objE;
        }
        Object objE2 = uVar.e(byteBuffer);
        Object objE3 = uVar.e(byteBuffer);
        Object objE4 = uVar.e(byteBuffer);
        if ((objE2 instanceof String) && ((objE3 == null || (objE3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new i((String) objE2, (String) objE3, objE4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // xi.q
    public final ByteBuffer d(m mVar) {
        hk.a aVar = new hk.a();
        String str = mVar.f53822a;
        u uVar = this.f53831a;
        uVar.k(aVar, str);
        uVar.k(aVar, mVar.f53823b);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.d(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // xi.q
    public final ByteBuffer e(String str, String str2) throws IOException {
        hk.a aVar = new hk.a();
        aVar.write(1);
        u uVar = this.f53831a;
        uVar.k(aVar, "error");
        uVar.k(aVar, str);
        uVar.k(aVar, null);
        uVar.k(aVar, str2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.d(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // xi.q
    public final ByteBuffer f(String str, String str2, Object obj) throws IOException {
        hk.a aVar = new hk.a();
        aVar.write(1);
        u uVar = this.f53831a;
        uVar.k(aVar, str);
        uVar.k(aVar, str2);
        if (obj instanceof Throwable) {
            uVar.k(aVar, Log.getStackTraceString((Throwable) obj));
        } else {
            uVar.k(aVar, obj);
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.d(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }
}
