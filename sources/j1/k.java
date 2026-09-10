package j1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f43603a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    h a(h hVar);

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();

    default long b(long j10) {
        return j10;
    }
}
