package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f6313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f6314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f6315c;

    public static class Factory implements MediaCodecAdapter.Factory {
        public static MediaCodec b(MediaCodecAdapter.Configuration configuration) throws IOException {
            MediaCodecInfo mediaCodecInfo = configuration.f6288a;
            StringBuilder sb = new StringBuilder("createCodec:");
            String str = mediaCodecInfo.f6292a;
            sb.append(str);
            Trace.beginSection(sb.toString());
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            return mediaCodecCreateByCodecName;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        public final MediaCodecAdapter a(MediaCodecAdapter.Configuration configuration) {
            MediaCodec mediaCodecB = null;
            try {
                mediaCodecB = b(configuration);
                Trace.beginSection("configureCodec");
                mediaCodecB.configure(configuration.f6289b, configuration.d, configuration.f6291e, 0);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecB.start();
                Trace.endSection();
                return new SynchronousMediaCodecAdapter(mediaCodecB);
            } catch (IOException | RuntimeException e2) {
                if (mediaCodecB != null) {
                    mediaCodecB.release();
                }
                throw e2;
            }
        }
    }

    public SynchronousMediaCodecAdapter(MediaCodec mediaCodec) {
        this.f6313a = mediaCodec;
        if (Util.f5683a < 21) {
            this.f6314b = mediaCodec.getInputBuffers();
            this.f6315c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void a(Bundle bundle) {
        this.f6313a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void b(int i2, int i3, int i4, long j) {
        this.f6313a.queueInputBuffer(i2, 0, i3, j, i4);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final MediaFormat c() {
        return this.f6313a.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void d(int i2, CryptoInfo cryptoInfo, long j, int i3) {
        this.f6313a.queueSecureInputBuffer(i2, 0, cryptoInfo.f5798i, j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final ByteBuffer e(int i2) {
        return Util.f5683a >= 21 ? this.f6313a.getInputBuffer(i2) : this.f6314b[i2];
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void f(Surface surface) {
        this.f6313a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void flush() {
        this.f6313a.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void g(int i2, long j) {
        this.f6313a.releaseOutputBuffer(i2, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final int h() {
        return this.f6313a.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f6313a;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && Util.f5683a < 21) {
                this.f6315c = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void j(int i2, boolean z2) {
        this.f6313a.releaseOutputBuffer(i2, z2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final ByteBuffer k(int i2) {
        return Util.f5683a >= 21 ? this.f6313a.getOutputBuffer(i2) : this.f6315c[i2];
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void m(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.f6313a.setOnFrameRenderedListener(new a(this, onFrameRenderedListener, 1), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void release() {
        MediaCodec mediaCodec = this.f6313a;
        this.f6314b = null;
        this.f6315c = null;
        try {
            int i2 = Util.f5683a;
            if (i2 >= 30 && i2 < 33) {
                mediaCodec.stop();
            }
        } finally {
            mediaCodec.release();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void setVideoScalingMode(int i2) {
        this.f6313a.setVideoScalingMode(i2);
    }
}
