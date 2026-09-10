package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface MediaCodecAdapter {

    public static final class Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaCodecInfo f18166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f18167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Format f18168c;
        public final Surface d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f18169e;

        public Configuration(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat, Format format, Surface surface, MediaCrypto mediaCrypto) {
            this.f18166a = mediaCodecInfo;
            this.f18167b = mediaFormat;
            this.f18168c = format;
            this.d = surface;
            this.f18169e = mediaCrypto;
        }
    }

    public interface Factory {
        MediaCodecAdapter a(Configuration configuration);
    }

    public interface OnFrameRenderedListener {
        void a(long j);
    }

    void a(Bundle bundle);

    void b(int i2, int i3, int i4, long j);

    MediaFormat c();

    void d(OnFrameRenderedListener onFrameRenderedListener, Handler handler);

    ByteBuffer e(int i2);

    void f(Surface surface);

    void flush();

    void g(int i2, long j);

    int h();

    int i(MediaCodec.BufferInfo bufferInfo);

    void j(int i2, boolean z2);

    ByteBuffer k(int i2);

    void l(int i2, CryptoInfo cryptoInfo, long j);

    void release();

    void setVideoScalingMode(int i2);
}
