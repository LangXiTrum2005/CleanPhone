package com.google.android.exoplayer2.video;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;

/* JADX INFO: loaded from: classes3.dex */
public interface VideoRendererEventListener {

    public static final class EventDispatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f19024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final VideoRendererEventListener f19025b;

        public EventDispatcher(Handler handler, VideoRendererEventListener videoRendererEventListener) {
            this.f19024a = handler;
            this.f19025b = videoRendererEventListener;
        }
    }

    default void a(String str) {
    }

    default void e(Exception exc) {
    }

    default void k(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void l(DecoderCounters decoderCounters) {
    }

    default void onDroppedFrames(int i2, long j) {
    }

    default void onVideoDecoderInitialized(String str, long j, long j2) {
    }

    default void onVideoSizeChanged(VideoSize videoSize) {
    }

    default void p(DecoderCounters decoderCounters) {
    }

    default void f(long j, Object obj) {
    }

    default void g(int i2, long j) {
    }
}
