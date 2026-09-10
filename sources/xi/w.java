package xi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f53832a = Charset.forName("UTF8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f53833b = new w();

    public static String c(ByteBuffer byteBuffer) {
        byte[] bArrArray;
        int iArrayOffset;
        if (byteBuffer == null) {
            return null;
        }
        int iRemaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArrArray = byteBuffer.array();
            iArrayOffset = byteBuffer.arrayOffset();
        } else {
            bArrArray = new byte[iRemaining];
            byteBuffer.get(bArrArray);
            iArrayOffset = 0;
        }
        return new String(bArrArray, iArrayOffset, iRemaining, f53832a);
    }

    public static ByteBuffer d(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f53832a);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bytes.length);
        byteBufferAllocateDirect.put(bytes);
        return byteBufferAllocateDirect;
    }

    @Override // xi.l
    public final /* bridge */ /* synthetic */ ByteBuffer a(Object obj) {
        return d((String) obj);
    }

    @Override // xi.l
    public final /* bridge */ /* synthetic */ Object b(ByteBuffer byteBuffer) {
        return c(byteBuffer);
    }
}
