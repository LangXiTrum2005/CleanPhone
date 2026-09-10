package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import androidx.media3.common.Format;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface AnalyticsCollector extends Player.Listener, MediaSourceEventListener, BandwidthMeter.EventListener, DrmSessionEventListener {
    void K(MediaMetricsListener mediaMetricsListener);

    void T(Player player, Looper looper);

    void a(String str);

    void b(String str);

    void c(Exception exc);

    void d(long j);

    void e(Exception exc);

    void f(long j, Object obj);

    void g(int i2, long j);

    void h(Exception exc);

    void i(int i2, long j, long j2);

    void j(AudioSink.AudioTrackConfig audioTrackConfig);

    void k(AudioSink.AudioTrackConfig audioTrackConfig);

    void l(DecoderCounters decoderCounters);

    void n(DecoderCounters decoderCounters);

    void o(Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioDecoderInitialized(String str, long j, long j2);

    void onDroppedFrames(int i2, long j);

    void onVideoDecoderInitialized(String str, long j, long j2);

    void p(DecoderCounters decoderCounters);

    void q(Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    void release();

    void t(DecoderCounters decoderCounters);

    void w(List list, MediaSource.MediaPeriodId mediaPeriodId);

    void y();
}
