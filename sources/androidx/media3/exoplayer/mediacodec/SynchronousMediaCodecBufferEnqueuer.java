package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import androidx.media3.decoder.CryptoInfo;

/* JADX INFO: loaded from: classes.dex */
class SynchronousMediaCodecBufferEnqueuer implements MediaCodecBufferEnqueuer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f6316a;

    public SynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec) {
        this.f6316a = mediaCodec;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void a(Bundle bundle) {
        this.f6316a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void b(int i2, int i3, int i4, long j) {
        this.f6316a.queueInputBuffer(i2, 0, i3, j, i4);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void c() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void d(int i2, CryptoInfo cryptoInfo, long j, int i3) {
        this.f6316a.queueSecureInputBuffer(i2, 0, cryptoInfo.f5798i, j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void flush() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void shutdown() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void start() {
    }
}
