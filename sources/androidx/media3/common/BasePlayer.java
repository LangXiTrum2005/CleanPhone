package androidx.media3.common;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePlayer implements Player {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Timeline.Window f5377a = new Timeline.Window();

    public final boolean B() {
        int iE;
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            iE = -1;
        } else {
            int iF = f();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iE = currentTimeline.e(iF, repeatMode, getShuffleModeEnabled());
        }
        return iE != -1;
    }

    public final boolean C() {
        int iK;
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            iK = -1;
        } else {
            int iF = f();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iK = currentTimeline.k(iF, repeatMode, getShuffleModeEnabled());
        }
        return iK != -1;
    }

    public final void D(int i2) {
        H(-9223372036854775807L, -1, false);
    }

    public final boolean E() {
        Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(f(), this.f5377a, 0L).f5517h;
    }

    public final boolean F() {
        Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(f(), this.f5377a, 0L).a();
    }

    public final boolean G() {
        Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(f(), this.f5377a, 0L).g;
    }

    public abstract void H(long j, int i2, boolean z2);

    @Override // androidx.media3.common.Player
    public final void g() {
        int iK;
        int iK2;
        if (getCurrentTimeline().p() || isPlayingAd()) {
            D(7);
            return;
        }
        boolean zC = C();
        if (F() && !G()) {
            if (!zC) {
                D(7);
                return;
            }
            Timeline currentTimeline = getCurrentTimeline();
            if (currentTimeline.p()) {
                iK2 = -1;
            } else {
                int iF = f();
                int repeatMode = getRepeatMode();
                if (repeatMode == 1) {
                    repeatMode = 0;
                }
                iK2 = currentTimeline.k(iF, repeatMode, getShuffleModeEnabled());
            }
            if (iK2 == -1) {
                D(7);
                return;
            } else if (iK2 == f()) {
                H(-9223372036854775807L, f(), true);
                return;
            } else {
                H(-9223372036854775807L, iK2, false);
                return;
            }
        }
        if (!zC || getCurrentPosition() > q()) {
            H(0L, f(), false);
            return;
        }
        Timeline currentTimeline2 = getCurrentTimeline();
        if (currentTimeline2.p()) {
            iK = -1;
        } else {
            int iF2 = f();
            int repeatMode2 = getRepeatMode();
            if (repeatMode2 == 1) {
                repeatMode2 = 0;
            }
            iK = currentTimeline2.k(iF2, repeatMode2, getShuffleModeEnabled());
        }
        if (iK == -1) {
            D(7);
        } else if (iK == f()) {
            H(-9223372036854775807L, f(), true);
        } else {
            H(-9223372036854775807L, iK, false);
        }
    }

    @Override // androidx.media3.common.Player
    public final void h(MediaItem mediaItem) {
        z(ImmutableList.z(mediaItem));
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && e() == 0;
    }

    @Override // androidx.media3.common.Player
    public final boolean k(int i2) {
        return p().f5497a.f5397a.get(i2);
    }

    @Override // androidx.media3.common.Player
    public final void o() {
        int iE;
        if (getCurrentTimeline().p() || isPlayingAd()) {
            D(9);
            return;
        }
        if (!B()) {
            if (F() && E()) {
                H(-9223372036854775807L, f(), false);
                return;
            } else {
                D(9);
                return;
            }
        }
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            iE = -1;
        } else {
            int iF = f();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iE = currentTimeline.e(iF, repeatMode, getShuffleModeEnabled());
        }
        if (iE == -1) {
            D(9);
        } else if (iE == f()) {
            H(-9223372036854775807L, f(), true);
        } else {
            H(-9223372036854775807L, iE, false);
        }
    }

    @Override // androidx.media3.common.Player
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // androidx.media3.common.Player
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // androidx.media3.common.Player
    public final long r() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return -9223372036854775807L;
        }
        return Util.T(currentTimeline.m(f(), this.f5377a, 0L).f5519l);
    }

    @Override // androidx.media3.common.Player
    public final void seekTo(int i2, long j) {
        H(j, i2, false);
    }

    @Override // androidx.media3.common.Player
    public final void seekToDefaultPosition() {
        H(-9223372036854775807L, f(), false);
    }

    @Override // androidx.media3.common.Player
    public final void w() {
        long currentPosition = getCurrentPosition() + t();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        H(Math.max(currentPosition, 0L), f(), false);
    }

    @Override // androidx.media3.common.Player
    public final void x() {
        long currentPosition = getCurrentPosition() + (-A());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        H(Math.max(currentPosition, 0L), f(), false);
    }

    @Override // androidx.media3.common.Player
    public final void seekTo(long j) {
        H(j, f(), false);
    }
}
