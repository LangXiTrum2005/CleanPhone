package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

/* JADX INFO: loaded from: classes.dex */
public interface AudioRendererEventListener {

    public static final class EventDispatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f6080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioRendererEventListener f6081b;

        public EventDispatcher(Handler handler, AudioRendererEventListener audioRendererEventListener) {
            this.f6080a = handler;
            this.f6081b = audioRendererEventListener;
        }

        public final void a(DecoderCounters decoderCounters) {
            synchronized (decoderCounters) {
            }
            Handler handler = this.f6080a;
            if (handler != null) {
                handler.post(new a(this, decoderCounters, 1));
            }
        }
    }

    default void b(String str) {
    }

    default void c(Exception exc) {
    }

    default void d(long j) {
    }

    default void h(Exception exc) {
    }

    default void i(int i2, long j, long j2) {
    }

    default void j(AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void k(AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void l(DecoderCounters decoderCounters) {
    }

    default void o(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onAudioDecoderInitialized(String str, long j, long j2) {
    }

    default void onSkipSilenceEnabledChanged(boolean z2) {
    }

    default void p(DecoderCounters decoderCounters) {
    }
}
