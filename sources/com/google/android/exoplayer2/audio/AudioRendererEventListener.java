package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;

/* JADX INFO: loaded from: classes3.dex */
public interface AudioRendererEventListener {

    public static final class EventDispatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f17291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioRendererEventListener f17292b;

        public EventDispatcher(Handler handler, AudioRendererEventListener audioRendererEventListener) {
            this.f17291a = handler;
            this.f17292b = audioRendererEventListener;
        }

        public final void a(DecoderCounters decoderCounters) {
            synchronized (decoderCounters) {
            }
            Handler handler = this.f17291a;
            if (handler != null) {
                handler.post(new b(this, decoderCounters, 1));
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

    default void j(DecoderCounters decoderCounters) {
    }

    default void n(DecoderCounters decoderCounters) {
    }

    default void o(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onAudioDecoderInitialized(String str, long j, long j2) {
    }

    default void onSkipSilenceEnabledChanged(boolean z2) {
    }
}
