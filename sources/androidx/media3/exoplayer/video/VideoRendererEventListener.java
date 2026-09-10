package androidx.media3.exoplayer.video;

import android.os.Handler;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

/* JADX INFO: loaded from: classes.dex */
public interface VideoRendererEventListener {

    public static final class EventDispatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f6666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final VideoRendererEventListener f6667b;

        public EventDispatcher(Handler handler, VideoRendererEventListener videoRendererEventListener) {
            this.f6666a = handler;
            this.f6667b = videoRendererEventListener;
        }

        public final void a(VideoSize videoSize) {
            Handler handler = this.f6666a;
            if (handler != null) {
                handler.post(new f(this, videoSize, 0));
            }
        }
    }

    default void a(String str) {
    }

    default void e(Exception exc) {
    }

    default void n(DecoderCounters decoderCounters) {
    }

    default void onDroppedFrames(int i2, long j) {
    }

    default void onVideoDecoderInitialized(String str, long j, long j2) {
    }

    default void onVideoSizeChanged(VideoSize videoSize) {
    }

    default void q(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void t(DecoderCounters decoderCounters) {
    }

    default void f(long j, Object obj) {
    }

    default void g(int i2, long j) {
    }
}
