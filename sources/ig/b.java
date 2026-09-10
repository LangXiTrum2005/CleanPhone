package ig;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vf.c f43005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f43006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43009e;

    public b(vf.c cVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.f43005a = cVar;
        this.f43006b = byteBuffer;
        this.f43007c = bufferInfo.size;
        this.f43008d = bufferInfo.presentationTimeUs;
        this.f43009e = bufferInfo.flags;
    }
}
