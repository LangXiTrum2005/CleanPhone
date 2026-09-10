package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.DefaultAllocator;

/* JADX INFO: loaded from: classes.dex */
public interface LoadControl {

    public static final class Parameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerId f5912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f5914c;
        public final boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f5915e;

        public Parameters(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, float f, boolean z2, long j3) {
            this.f5912a = playerId;
            this.f5913b = j2;
            this.f5914c = f;
            this.d = z2;
            this.f5915e = j3;
        }
    }

    default boolean a(Parameters parameters) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    default void b(PlayerId playerId) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default void c(PlayerId playerId) {
        throw new IllegalStateException("onReleased not implemented");
    }

    default boolean d(Parameters parameters) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default void e(PlayerId playerId) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void f(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    DefaultAllocator getAllocator();

    default long getBackBufferDurationUs() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default boolean retainBackBufferFromKeyframe() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }
}
