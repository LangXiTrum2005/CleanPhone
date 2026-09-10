package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface AnalyticsCollector extends Player.Listener, MediaSourceEventListener, BandwidthMeter.EventListener, DrmSessionEventListener {
    void D(MediaMetricsListener mediaMetricsListener);

    void G(List list, MediaSource.MediaPeriodId mediaPeriodId);

    void a(String str);

    void b(String str);

    void c(Exception exc);

    void d(long j);

    void e(Exception exc);

    void f(long j, Object obj);

    void g(int i2, long j);

    void h(Exception exc);

    void i(int i2, long j, long j2);

    void j(DecoderCounters decoderCounters);

    void k(Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    void l(DecoderCounters decoderCounters);

    void n(DecoderCounters decoderCounters);

    void o(Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioDecoderInitialized(String str, long j, long j2);

    void onDroppedFrames(int i2, long j);

    void onVideoDecoderInitialized(String str, long j, long j2);

    void p(DecoderCounters decoderCounters);

    void release();

    void z(Player player, Looper looper);
}
