package androidx.media3.common;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.text.CueGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleBasePlayer extends BasePlayer {

    public static final class MediaItemData {

        public static final class Builder {
        }

        public static Object a(MediaItemData mediaItemData, int i2) {
            mediaItemData.getClass();
            throw null;
        }

        public static void b(MediaItemData mediaItemData, int i2, int i3, Timeline.Period period) {
            mediaItemData.getClass();
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaItemData)) {
                return false;
            }
            ((MediaItemData) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public static final class PeriodData {

        public static final class Builder {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PeriodData)) {
                return false;
            }
            ((PeriodData) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public static final class PlaceholderUid {
    }

    public static final class PlaylistTimeline extends Timeline {
        @Override // androidx.media3.common.Timeline
        public final int b(Object obj) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Period g(Object obj, Timeline.Period period) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int h() {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Object l(int i2) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Window m(int i2, Timeline.Window window, long j) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int o() {
            throw null;
        }
    }

    public interface PositionSupplier {
    }

    public static final class State {

        public static final class Builder {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            ((State) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    @Override // androidx.media3.common.Player
    public final long A() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.BasePlayer
    public final void H(long j, int i2, boolean z2) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackException a() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long b() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void c(PlaybackParameters playbackParameters) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoTextureView(TextureView textureView) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final Tracks d() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int e() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int f() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long getContentPosition() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdGroupIndex() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdIndexInAdGroup() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentPeriodIndex() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final Timeline getCurrentTimeline() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long getDuration() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean getPlayWhenReady() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackParameters getPlaybackParameters() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackState() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int getRepeatMode() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean getShuffleModeEnabled() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final CueGroup i() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlayingAd() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void j(Player.Listener listener) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void l(Player.Listener listener) {
        listener.getClass();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final Looper m() {
        return null;
    }

    @Override // androidx.media3.common.Player
    public final TrackSelectionParameters n() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final Player.Commands p() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void prepare() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long q() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final VideoSize s() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void setPlayWhenReady(boolean z2) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void setRepeatMode(int i2) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void setShuffleModeEnabled(boolean z2) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void setVideoTextureView(TextureView textureView) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long t() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void u(TrackSelectionParameters trackSelectionParameters) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long v() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata y() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void z(List list) {
        Thread.currentThread();
        throw null;
    }
}
