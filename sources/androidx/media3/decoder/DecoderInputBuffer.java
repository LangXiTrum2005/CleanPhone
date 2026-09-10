package androidx.media3.decoder;

import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class DecoderInputBuffer extends Buffer {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Format f5801Y;
    public final CryptoInfo Z = new CryptoInfo();
    public ByteBuffer e0;
    public boolean f0;
    public long g0;
    public ByteBuffer h0;
    public final int i0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface BufferReplacementMode {
    }

    public static final class InsufficientCapacityException extends IllegalStateException {
    }

    static {
        MediaLibraryInfo.a("media3.decoder");
    }

    public DecoderInputBuffer(int i2) {
        this.i0 = i2;
    }

    public void d() {
        this.X = 0;
        ByteBuffer byteBuffer = this.e0;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.h0;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f0 = false;
    }

    public final ByteBuffer f(int i2) {
        int i3 = this.i0;
        if (i3 == 1) {
            return ByteBuffer.allocate(i2);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i2);
        }
        ByteBuffer byteBuffer = this.e0;
        throw new InsufficientCapacityException(a.e(byteBuffer == null ? 0 : byteBuffer.capacity(), i2, "Buffer too small (", " < ", ")"));
    }

    public final void g(int i2) {
        ByteBuffer byteBuffer = this.e0;
        if (byteBuffer == null) {
            this.e0 = f(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.e0 = byteBuffer;
            return;
        }
        ByteBuffer byteBufferF = f(i3);
        byteBufferF.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferF.put(byteBuffer);
        }
        this.e0 = byteBufferF;
    }

    public final void h() {
        ByteBuffer byteBuffer = this.e0;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.h0;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
