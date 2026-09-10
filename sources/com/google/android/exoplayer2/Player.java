package com.google.android.exoplayer2;

import android.view.SurfaceView;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.base.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface Player {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Command {
    }

    public static final class Commands implements Bundleable {
        public final FlagSet X;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FlagSet.Builder f17186a = new FlagSet.Builder();

            public final void a(int i2, boolean z2) {
                FlagSet.Builder builder = this.f17186a;
                if (z2) {
                    builder.a(i2);
                } else {
                    builder.getClass();
                }
            }

            public final Commands b() {
                return new Commands(this.f17186a.b());
            }
        }

        static {
            new Builder().b();
            int i2 = Util.f18979a;
            Integer.toString(0, 36);
        }

        public Commands(FlagSet flagSet) {
            this.X = flagSet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Commands) {
                return this.X.equals(((Commands) obj).X);
            }
            return false;
        }

        public final int hashCode() {
            return this.X.hashCode();
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
        public final FlagSet f17187a;

        public Events(FlagSet flagSet) {
            this.f17187a = flagSet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Events) {
                return this.f17187a.equals(((Events) obj).f17187a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f17187a.hashCode();
        }
    }

    public interface Listener {
        default void onAvailableCommandsChanged(Commands commands) {
        }

        default void onCues(CueGroup cueGroup) {
        }

        default void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        default void onDeviceVolumeChanged(int i2, boolean z2) {
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

        default void onSkipSilenceEnabledChanged(boolean z2) {
        }

        default void onSurfaceSizeChanged(int i2, int i3) {
        }

        default void onTimelineChanged(Timeline timeline, int i2) {
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

    public static final class PositionInfo implements Bundleable {
        public final Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f17188Y;
        public final MediaItem Z;
        public final Object e0;
        public final int f0;
        public final long g0;
        public final long h0;
        public final int i0;
        public final int j0;

        static {
            int i2 = Util.f18979a;
            Integer.toString(0, 36);
            Integer.toString(1, 36);
            Integer.toString(2, 36);
            Integer.toString(3, 36);
            Integer.toString(4, 36);
            Integer.toString(5, 36);
            Integer.toString(6, 36);
        }

        public PositionInfo(Object obj, int i2, MediaItem mediaItem, Object obj2, int i3, long j, long j2, int i4, int i5) {
            this.X = obj;
            this.f17188Y = i2;
            this.Z = mediaItem;
            this.e0 = obj2;
            this.f0 = i3;
            this.g0 = j;
            this.h0 = j2;
            this.i0 = i4;
            this.j0 = i5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PositionInfo.class == obj.getClass()) {
                PositionInfo positionInfo = (PositionInfo) obj;
                if (this.f17188Y == positionInfo.f17188Y && this.f0 == positionInfo.f0 && this.g0 == positionInfo.g0 && this.h0 == positionInfo.h0 && this.i0 == positionInfo.i0 && this.j0 == positionInfo.j0 && Objects.a(this.X, positionInfo.X) && Objects.a(this.e0, positionInfo.e0) && Objects.a(this.Z, positionInfo.Z)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.X, Integer.valueOf(this.f17188Y), this.Z, this.e0, Integer.valueOf(this.f0), Long.valueOf(this.g0), Long.valueOf(this.h0), Integer.valueOf(this.i0), Integer.valueOf(this.j0)});
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

    PlaybackException a();

    long b();

    Tracks d();

    int e();

    int f();

    void g(MediaItem mediaItem);

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    Timeline getCurrentTimeline();

    long getDuration();

    boolean getPlayWhenReady();

    int getPlaybackState();

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    float getVolume();

    void h(Listener listener);

    void i(List list);

    boolean isPlaying();

    boolean isPlayingAd();

    void pause();

    void play();

    void prepare();

    void release();

    void setPlayWhenReady(boolean z2);

    void setVideoSurfaceView(SurfaceView surfaceView);

    void setVolume(float f);

    void stop();
}
