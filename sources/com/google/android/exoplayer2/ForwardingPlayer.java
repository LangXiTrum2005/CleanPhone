package com.google.android.exoplayer2;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ForwardingPlayer implements Player {

    public static final class ForwardingListener implements Player.Listener {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForwardingListener)) {
                return false;
            }
            ((ForwardingListener) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onAvailableCommandsChanged(Player.Commands commands) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onCues(List list) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onDeviceVolumeChanged(int i2, boolean z2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onEvents(Player player, Player.Events events) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onIsLoadingChanged(boolean z2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onIsPlayingChanged(boolean z2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onLoadingChanged(boolean z2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onMediaItemTransition(MediaItem mediaItem, int i2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onMetadata(Metadata metadata) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onPlayWhenReadyChanged(boolean z2, int i2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onPlaybackStateChanged(int i2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onPlaybackSuppressionReasonChanged(int i2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onPlayerError(PlaybackException playbackException) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onPlayerErrorChanged(PlaybackException playbackException) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onPlayerStateChanged(boolean z2, int i2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onPositionDiscontinuity(int i2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onRenderedFirstFrame() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onSkipSilenceEnabledChanged(boolean z2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onSurfaceSizeChanged(int i2, int i3) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onTimelineChanged(Timeline timeline, int i2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onTracksChanged(Tracks tracks) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onVideoSizeChanged(VideoSize videoSize) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onVolumeChanged(float f) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onCues(CueGroup cueGroup) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final PlaybackException a() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long b() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final Tracks d() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int e() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int f() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentPosition() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdGroupIndex() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdIndexInAdGroup() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentPeriodIndex() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentPosition() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final Timeline getCurrentTimeline() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean getPlayWhenReady() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPlaybackState() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isPlayingAd() {
        throw null;
    }
}
