package androidx.media3.common;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Util;
import com.google.common.base.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface Player {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Command {
    }

    public static final class Commands {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlagSet f5497a;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FlagSet.Builder f5498a = new FlagSet.Builder();

            public final void a(int i2, boolean z2) {
                FlagSet.Builder builder = this.f5498a;
                if (z2) {
                    builder.a(i2);
                } else {
                    builder.getClass();
                }
            }
        }

        static {
            new Builder().f5498a.b();
            Util.E(0);
        }

        public Commands(FlagSet flagSet) {
            this.f5497a = flagSet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Commands) {
                return this.f5497a.equals(((Commands) obj).f5497a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f5497a.hashCode();
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DiscontinuityReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Event {
    }

    public static final class Events {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlagSet f5499a;

        public Events(FlagSet flagSet) {
            this.f5499a = flagSet;
        }

        public final boolean a(int... iArr) {
            FlagSet flagSet = this.f5499a;
            for (int i2 : iArr) {
                if (flagSet.f5397a.get(i2)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Events) {
                return this.f5499a.equals(((Events) obj).f5499a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f5499a.hashCode();
        }
    }

    public interface Listener {
        default void onAvailableCommandsChanged(Commands commands) {
        }

        default void onCues(CueGroup cueGroup) {
        }

        default void onEvents(Player player, Events events) {
        }

        default void onIsLoadingChanged(boolean z2) {
        }

        default void onIsPlayingChanged(boolean z2) {
        }

        default void onLoadingChanged(boolean z2) {
        }

        default void onMediaItemTransition(MediaItem mediaItem, int i2) {
        }

        default void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        default void onMetadata(Metadata metadata) {
        }

        default void onPlayWhenReadyChanged(boolean z2, int i2) {
        }

        default void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        default void onPlaybackStateChanged(int i2) {
        }

        default void onPlaybackSuppressionReasonChanged(int i2) {
        }

        default void onPlayerError(PlaybackException playbackException) {
        }

        default void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        default void onPlayerStateChanged(boolean z2, int i2) {
        }

        default void onPositionDiscontinuity(int i2) {
        }

        default void onRenderedFirstFrame() {
        }

        default void onRepeatModeChanged(int i2) {
        }

        default void onShuffleModeEnabledChanged(boolean z2) {
        }

        default void onSkipSilenceEnabledChanged(boolean z2) {
        }

        default void onSurfaceSizeChanged(int i2, int i3) {
        }

        default void onTimelineChanged(Timeline timeline, int i2) {
        }

        default void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        }

        default void onTracksChanged(Tracks tracks) {
        }

        default void onVideoSizeChanged(VideoSize videoSize) {
        }

        default void onVolumeChanged(float f) {
        }

        default void onCues(List list) {
        }

        default void onPositionDiscontinuity(PositionInfo positionInfo, PositionInfo positionInfo2, int i2) {
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaItemTransitionReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayWhenReadyChangeReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackSuppressionReason {
    }

    public static final class PositionInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f5500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MediaItem f5502c;
        public final Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5503e;
        public final long f;
        public final long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f5504h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f5505i;

        static {
            a.s(0, 1, 2, 3, 4);
            Util.E(5);
            Util.E(6);
        }

        public PositionInfo(Object obj, int i2, MediaItem mediaItem, Object obj2, int i3, long j, long j2, int i4, int i5) {
            this.f5500a = obj;
            this.f5501b = i2;
            this.f5502c = mediaItem;
            this.d = obj2;
            this.f5503e = i3;
            this.f = j;
            this.g = j2;
            this.f5504h = i4;
            this.f5505i = i5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PositionInfo.class == obj.getClass()) {
                PositionInfo positionInfo = (PositionInfo) obj;
                if (this.f5501b == positionInfo.f5501b && this.f5503e == positionInfo.f5503e && this.f == positionInfo.f && this.g == positionInfo.g && this.f5504h == positionInfo.f5504h && this.f5505i == positionInfo.f5505i && Objects.a(this.f5502c, positionInfo.f5502c) && Objects.a(this.f5500a, positionInfo.f5500a) && Objects.a(this.d, positionInfo.d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f5500a, Integer.valueOf(this.f5501b), this.f5502c, this.d, Integer.valueOf(this.f5503e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.f5504h), Integer.valueOf(this.f5505i)});
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TimelineChangeReason {
    }

    long A();

    PlaybackException a();

    long b();

    void c(PlaybackParameters playbackParameters);

    void clearVideoSurfaceView(SurfaceView surfaceView);

    void clearVideoTextureView(TextureView textureView);

    Tracks d();

    int e();

    int f();

    void g();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    Timeline getCurrentTimeline();

    long getDuration();

    boolean getPlayWhenReady();

    PlaybackParameters getPlaybackParameters();

    int getPlaybackState();

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    float getVolume();

    void h(MediaItem mediaItem);

    CueGroup i();

    boolean isPlaying();

    boolean isPlayingAd();

    void j(Listener listener);

    boolean k(int i2);

    void l(Listener listener);

    Looper m();

    TrackSelectionParameters n();

    void o();

    Commands p();

    void pause();

    void play();

    void prepare();

    long q();

    long r();

    VideoSize s();

    void seekTo(int i2, long j);

    void seekTo(long j);

    void seekToDefaultPosition();

    void setPlayWhenReady(boolean z2);

    void setRepeatMode(int i2);

    void setShuffleModeEnabled(boolean z2);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVideoTextureView(TextureView textureView);

    void setVolume(float f);

    void stop();

    long t();

    void u(TrackSelectionParameters trackSelectionParameters);

    long v();

    void w();

    void x();

    MediaMetadata y();

    void z(List list);
}
