package com.google.android.exoplayer2;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
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
        @Override // com.google.android.exoplayer2.Timeline
        public final int b(Object obj) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Period g(Object obj, Timeline.Period period) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final int h() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Object l(int i2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public final Timeline.Window m(int i2, Timeline.Window window, long j) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.Timeline
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

    @Override // com.google.android.exoplayer2.Player
    public final PlaybackException a() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long b() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final Tracks d() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int e() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int f() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentPosition() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdGroupIndex() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdIndexInAdGroup() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentPeriodIndex() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentPosition() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final Timeline getCurrentTimeline() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean getPlayWhenReady() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPlaybackState() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getRepeatMode() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean getShuffleModeEnabled() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void i(List list) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isPlayingAd() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlayWhenReady(boolean z2) {
        Thread.currentThread();
        throw null;
    }
}
