package androidx.media3.common;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.grimness;

/* JADX INFO: compiled from: BasePlayer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class beachfront implements cord {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final oilcan.dern f10811attabal = new oilcan.dern();

    public final int adultoid() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    @Override // androidx.media3.common.cord
    public final boolean competently() {
        return molybdenite() != -1;
    }

    @Override // androidx.media3.common.cord
    public final void dern() {
        wireman(0, Integer.MAX_VALUE);
    }

    public abstract void dovishness(int i, long j, int i2, boolean z);

    @Override // androidx.media3.common.cord
    public final int getBufferedPercentage() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == C.TIME_UNSET || duration == C.TIME_UNSET) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return grimness.kowloon((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    public final void gintrap(long j, int i) {
        dovishness(arytenoidectomy(), j, i, false);
    }

    public final int graveside() {
        oilcan currentTimeline = getCurrentTimeline();
        if (currentTimeline.monoploid()) {
            return -1;
        }
        return currentTimeline.formularize(arytenoidectomy(), adultoid(), getShuffleModeEnabled());
    }

    @Override // androidx.media3.common.cord
    public final boolean impassible() {
        return graveside() != -1;
    }

    @Override // androidx.media3.common.cord
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && apical() == 0;
    }

    public final int molybdenite() {
        oilcan currentTimeline = getCurrentTimeline();
        if (currentTimeline.monoploid()) {
            return -1;
        }
        return currentTimeline.marial(arytenoidectomy(), adultoid(), getShuffleModeEnabled());
    }

    @Override // androidx.media3.common.cord
    public final boolean monoploid() {
        oilcan currentTimeline = getCurrentTimeline();
        return !currentTimeline.monoploid() && currentTimeline.triweekly(arytenoidectomy(), this.f10811attabal).beachfront();
    }

    @Override // androidx.media3.common.cord
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // androidx.media3.common.cord
    public final void play() {
        setPlayWhenReady(true);
    }

    public final long polloi() {
        oilcan currentTimeline = getCurrentTimeline();
        return currentTimeline.monoploid() ? C.TIME_UNSET : currentTimeline.triweekly(arytenoidectomy(), this.f10811attabal).wireman();
    }

    @Override // androidx.media3.common.cord
    public final void seekTo(long j) {
        gintrap(j, 5);
    }

    @Override // androidx.media3.common.cord
    public final boolean taiyuan() {
        oilcan currentTimeline = getCurrentTimeline();
        return !currentTimeline.monoploid() && currentTimeline.triweekly(arytenoidectomy(), this.f10811attabal).f11126taiyuan;
    }

    @Override // androidx.media3.common.cord
    public final boolean triweekly() {
        oilcan currentTimeline = getCurrentTimeline();
        return !currentTimeline.monoploid() && currentTimeline.triweekly(arytenoidectomy(), this.f10811attabal).f11122impromptu;
    }
}
