package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f18188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f18189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f18190c;

    public static class Factory implements MediaCodecAdapter.Factory {
        public static MediaCodec b(MediaCodecAdapter.Configuration configuration) throws IOException {
            configuration.f18166a.getClass();
            String str = configuration.f18166a.f18170a;
            TraceUtil.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            TraceUtil.b();
            return mediaCodecCreateByCodecName;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
        public final MediaCodecAdapter a(MediaCodecAdapter.Configuration configuration) {
            MediaCodec mediaCodecB = null;
            try {
                mediaCodecB = b(configuration);
                TraceUtil.a("configureCodec");
                mediaCodecB.configure(configuration.f18167b, configuration.d, configuration.f18169e, 0);
                TraceUtil.b();
                TraceUtil.a("startCodec");
                mediaCodecB.start();
                TraceUtil.b();
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
        this.f18188a = mediaCodec;
        if (Util.f18979a < 21) {
            this.f18189b = mediaCodec.getInputBuffers();
            this.f18190c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void a(Bundle bundle) {
        this.f18188a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void b(int i2, int i3, int i4, long j) {
        this.f18188a.queueInputBuffer(i2, 0, i3, j, i4);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final MediaFormat c() {
        return this.f18188a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void d(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.f18188a.setOnFrameRenderedListener(new a(this, onFrameRenderedListener, 1), handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final ByteBuffer e(int i2) {
        return Util.f18979a >= 21 ? this.f18188a.getInputBuffer(i2) : this.f18189b[i2];
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void f(Surface surface) {
        this.f18188a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void flush() {
        this.f18188a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void g(int i2, long j) {
        this.f18188a.releaseOutputBuffer(i2, j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final int h() {
        return this.f18188a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f18188a;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && Util.f18979a < 21) {
                this.f18190c = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void j(int i2, boolean z2) {
        this.f18188a.releaseOutputBuffer(i2, z2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final ByteBuffer k(int i2) {
        return Util.f18979a >= 21 ? this.f18188a.getOutputBuffer(i2) : this.f18190c[i2];
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void l(int i2, CryptoInfo cryptoInfo, long j) {
        this.f18188a.queueSecureInputBuffer(i2, 0, cryptoInfo.f17423i, j, 0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void release() {
        this.f18189b = null;
        this.f18190c = null;
        this.f18188a.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void setVideoScalingMode(int i2) {
        this.f18188a.setVideoScalingMode(i2);
    }
}
