package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.Format;
import androidx.media3.decoder.CryptoInfo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface MediaCodecAdapter {

    public static final class Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaCodecInfo f6288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f6289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Format f6290c;
        public final Surface d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f6291e;

        public Configuration(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat, Format format, Surface surface, MediaCrypto mediaCrypto) {
            this.f6288a = mediaCodecInfo;
            this.f6289b = mediaFormat;
            this.f6290c = format;
            this.d = surface;
            this.f6291e = mediaCrypto;
        }
    }

    public interface Factory {
        MediaCodecAdapter a(Configuration configuration);
    }

    public interface OnBufferAvailableListener {
    }

    public interface OnFrameRenderedListener {
        void a(long j);
    }

    void a(Bundle bundle);

    void b(int i2, int i3, int i4, long j);

    MediaFormat c();

    void d(int i2, CryptoInfo cryptoInfo, long j, int i3);

    ByteBuffer e(int i2);

    void f(Surface surface);

    void flush();

    void g(int i2, long j);

    int h();

    int i(MediaCodec.BufferInfo bufferInfo);

    void j(int i2, boolean z2);

    ByteBuffer k(int i2);

    default boolean l(OnBufferAvailableListener onBufferAvailableListener) {
        return false;
    }

    void m(OnFrameRenderedListener onFrameRenderedListener, Handler handler);

    void release();

    void setVideoScalingMode(int i2);
}
