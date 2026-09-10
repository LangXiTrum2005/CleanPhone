package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class BatchBuffer extends DecoderInputBuffer {
    public long j0;
    public int k0;
    public int l0;

    @Override // androidx.media3.decoder.DecoderInputBuffer
    public final void d() {
        super.d();
        this.k0 = 0;
    }

    public final boolean i(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        Assertions.b(!decoderInputBuffer.b(1073741824));
        Assertions.b(!decoderInputBuffer.b(268435456));
        Assertions.b(!decoderInputBuffer.b(4));
        if (j()) {
            if (this.k0 >= this.l0) {
                return false;
            }
            ByteBuffer byteBuffer2 = decoderInputBuffer.e0;
            if (byteBuffer2 != null && (byteBuffer = this.e0) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i2 = this.k0;
        this.k0 = i2 + 1;
        if (i2 == 0) {
            this.g0 = decoderInputBuffer.g0;
            if (decoderInputBuffer.b(1)) {
                this.X = 1;
            }
        }
        ByteBuffer byteBuffer3 = decoderInputBuffer.e0;
        if (byteBuffer3 != null) {
            g(byteBuffer3.remaining());
            this.e0.put(byteBuffer3);
        }
        this.j0 = decoderInputBuffer.g0;
        return true;
    }

    public final boolean j() {
        return this.k0 > 0;
    }
}
