package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.SystemClock;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public interface Renderer extends PlayerMessage.Target {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessageType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public interface WakeupListener {
        void a();

        void b();
    }

    default void b() {
    }

    default void d(float f, float f2) {
    }

    void disable();

    long e();

    RendererCapabilities getCapabilities();

    MediaClock getMediaClock();

    String getName();

    int getState();

    SampleStream getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    void i(int i2, PlayerId playerId, SystemClock systemClock);

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void k(Format[] formatArr, SampleStream sampleStream, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId);

    void l(Timeline timeline);

    void m(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, boolean z2, boolean z3, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId);

    void maybeThrowStreamError();

    default void release() {
    }

    void render(long j, long j2);

    void reset();

    void resetPosition(long j);

    void setCurrentStreamFinal();

    void start();

    void stop();
}
