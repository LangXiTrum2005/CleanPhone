package androidx.media3.exoplayer.analytics;

import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.source.MediaLoadData;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStatsListener implements AnalyticsListener, PlaybackSessionManager.Listener {

    public interface Callback {
    }

    public static final class PlaybackStatsTracker {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void L(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void M(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void N(Player player, AnalyticsListener.Events events) {
        FlagSet flagSet = events.f5996a;
        if (flagSet.f5397a.size() == 0) {
            return;
        }
        if (flagSet.f5397a.size() <= 0) {
            throw null;
        }
        int iA = flagSet.a(0);
        events.b(iA);
        if (iA != 0 && iA != 11) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void p(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void s(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void G(AnalyticsListener.EventTime eventTime, int i2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void F(int i2, long j, AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public final void n(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, IOException iOException) {
    }
}
