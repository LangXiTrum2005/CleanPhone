package eb;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lb.a f40006a = lb.a.a(new byte[0]);

    public static final lb.a a(int i10) {
        return lb.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final lb.a b(int i10) {
        return lb.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
