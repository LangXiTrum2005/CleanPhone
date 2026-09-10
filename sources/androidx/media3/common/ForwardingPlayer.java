package androidx.media3.common;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.text.CueGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingPlayer implements Player {

    public static final class ForwardingListener implements Player.Listener {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForwardingListener)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onAvailableCommandsChanged(Player.Commands commands) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onCues(List list) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onEvents(Player player, Player.Events events) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onIsLoadingChanged(boolean z2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onIsPlayingChanged(boolean z2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onLoadingChanged(boolean z2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onMediaItemTransition(MediaItem mediaItem, int i2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onMetadata(Metadata metadata) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayWhenReadyChanged(boolean z2, int i2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaybackStateChanged(int i2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaybackSuppressionReasonChanged(int i2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayerError(PlaybackException playbackException) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayerErrorChanged(PlaybackException playbackException) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayerStateChanged(boolean z2, int i2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPositionDiscontinuity(int i2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onRenderedFirstFrame() {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onRepeatModeChanged(int i2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onShuffleModeEnabledChanged(boolean z2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSkipSilenceEnabledChanged(boolean z2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSurfaceSizeChanged(int i2, int i3) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onTimelineChanged(Timeline timeline, int i2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onTracksChanged(Tracks tracks) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onVideoSizeChanged(VideoSize videoSize) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onVolumeChanged(float f) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onCues(CueGroup cueGroup) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
            throw null;
        }
    }

    @Override // androidx.media3.common.Player
    public final long A() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackException a() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long b() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void c(PlaybackParameters playbackParameters) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoTextureView(TextureView textureView) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final Tracks d() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int e() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int f() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void g() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long getContentPosition() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdGroupIndex() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdIndexInAdGroup() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentPeriodIndex() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final Timeline getCurrentTimeline() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean getPlayWhenReady() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackParameters getPlaybackParameters() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackState() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int getRepeatMode() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean getShuffleModeEnabled() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final CueGroup i() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlaying() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlayingAd() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void j(Player.Listener listener) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean k(int i2) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void l(Player.Listener listener) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final Looper m() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final TrackSelectionParameters n() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void o() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void pause() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void play() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void prepare() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long r() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final VideoSize s() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void seekTo(long j) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void seekToDefaultPosition() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void setRepeatMode(int i2) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void setShuffleModeEnabled(boolean z2) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void setVideoTextureView(TextureView textureView) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void stop() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long t() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void u(TrackSelectionParameters trackSelectionParameters) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long v() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void w() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void x() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata y() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void seekTo(int i2, long j) {
        throw null;
    }
}
