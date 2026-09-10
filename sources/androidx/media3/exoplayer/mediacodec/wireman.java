package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.polloi;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: MediaCodecAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public interface wireman {

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final marial f12104attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final int f12105beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final polloi f12106dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final MediaCrypto f12107marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final MediaFormat f12108saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final Surface f12109wireman;

        public attabal(marial marialVar, MediaFormat mediaFormat, polloi polloiVar, Surface surface, MediaCrypto mediaCrypto, int i) {
            this.f12104attabal = marialVar;
            this.f12108saneness = mediaFormat;
            this.f12106dern = polloiVar;
            this.f12109wireman = surface;
            this.f12107marial = mediaCrypto;
            this.f12105beachfront = i;
        }

        public static attabal attabal(marial marialVar, MediaFormat mediaFormat, polloi polloiVar, MediaCrypto mediaCrypto) {
            return new attabal(marialVar, mediaFormat, polloiVar, null, mediaCrypto, 0);
        }

        public static attabal saneness(marial marialVar, MediaFormat mediaFormat, polloi polloiVar, Surface surface, MediaCrypto mediaCrypto) {
            return new attabal(marialVar, mediaFormat, polloiVar, surface, mediaCrypto, 0);
        }
    }

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public interface saneness {
        wireman attabal(attabal attabalVar) throws IOException;
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.wireman$wireman, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public interface InterfaceC0087wireman {
        void attabal(wireman wiremanVar, long j, long j2);
    }

    int apical();

    void attabal(int i, int i2, miliaria.dern dernVar, long j, int i3);

    MediaFormat beachfront();

    ByteBuffer competently(int i);

    void cutely(int i, long j);

    void dern(Bundle bundle);

    void flush();

    int formularize(MediaCodec.BufferInfo bufferInfo);

    void impassible(int i, boolean z);

    void impromptu(Surface surface);

    void marial(InterfaceC0087wireman interfaceC0087wireman, Handler handler);

    void release();

    void saneness(int i, int i2, int i3, long j, int i4);

    void setVideoScalingMode(int i);

    boolean taiyuan();

    ByteBuffer triweekly(int i);

    default boolean wireman(dern dernVar) {
        return false;
    }

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public interface dern {
        default void attabal() {
        }

        default void saneness() {
        }
    }
}
