package ig;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface a {
    void a(vf.c cVar, MediaFormat mediaFormat);

    void c(vf.c cVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    void release();

    void stop();
}
