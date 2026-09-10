package androidx.media3.exoplayer;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.BasePlayer;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SimpleExoPlayer extends BasePlayer implements ExoPlayer, ExoPlayer.AudioComponent, ExoPlayer.VideoComponent, ExoPlayer.TextComponent, ExoPlayer.DeviceComponent {

    @Deprecated
    public static final class Builder {
    }

    @Override // androidx.media3.common.Player
    public final long A() {
        throw null;
    }

    @Override // androidx.media3.common.BasePlayer
    public final void H(long j, int i2, boolean z2) {
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
    public final long getDuration() {
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
    public final float getVolume() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final CueGroup i() {
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
    public final Player.Commands p() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void prepare() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long q() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void release() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final VideoSize s() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void setPlayWhenReady(boolean z2) {
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
    public final void setVolume(float f) {
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
    public final MediaMetadata y() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void z(List list) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final ExoPlaybackException a() {
        throw null;
    }
}
