package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.video.VideoSize;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaybackStatsListener implements AnalyticsListener, PlaybackSessionManager.Listener {

    public interface Callback {
    }

    public static final class PlaybackStatsTracker {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void B(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void H(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void I(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void d(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void j(Player player, AnalyticsListener.Events events) {
        FlagSet flagSet = events.f17219a;
        if (flagSet.f18903a.size() == 0) {
            return;
        }
        if (flagSet.f18903a.size() <= 0) {
            throw null;
        }
        int iA = flagSet.a(0);
        events.b(iA);
        if (iA != 0 && iA != 11) {
            throw null;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void L(AnalyticsListener.EventTime eventTime, int i2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void g(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, IOException iOException) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void u(int i2, long j, AnalyticsListener.EventTime eventTime) {
    }
}
