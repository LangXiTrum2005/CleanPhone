package com.google.android.exoplayer2;

import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.MediaClock;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
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

    void b(int i2, PlayerId playerId);

    default void d(float f, float f2) {
    }

    void disable();

    long e();

    void g(Format[] formatArr, SampleStream sampleStream, long j, long j2);

    RendererCapabilities getCapabilities();

    MediaClock getMediaClock();

    String getName();

    int getState();

    SampleStream getStream();

    int getTrackType();

    void h(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j, boolean z2, boolean z3, long j2, long j3);

    boolean hasReadStreamToEnd();

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError();

    void render(long j, long j2);

    void reset();

    void resetPosition(long j);

    void setCurrentStreamFinal();

    void start();

    void stop();
}
