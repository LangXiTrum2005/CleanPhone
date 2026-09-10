package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes3.dex */
public final class SinglePeriodAdTimeline extends ForwardingTimeline {
    public final AdPlaybackState Z;

    public SinglePeriodAdTimeline(Timeline timeline, AdPlaybackState adPlaybackState) {
        super(timeline);
        Assertions.d(timeline.h() == 1);
        Assertions.d(timeline.o() == 1);
        this.Z = adPlaybackState;
    }

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
    public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
        this.f18333Y.f(i2, period, z2);
        long j = period.e0;
        if (j == -9223372036854775807L) {
            j = this.Z.Z;
        }
        period.g(period.X, period.f17208Y, period.Z, j, period.f0, this.Z, period.g0);
        return period;
    }
}
