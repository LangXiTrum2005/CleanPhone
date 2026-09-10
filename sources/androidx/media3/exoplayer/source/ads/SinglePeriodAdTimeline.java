package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.source.ForwardingTimeline;

/* JADX INFO: loaded from: classes.dex */
public final class SinglePeriodAdTimeline extends ForwardingTimeline {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdPlaybackState f6474c;

    public SinglePeriodAdTimeline(Timeline timeline, AdPlaybackState adPlaybackState) {
        super(timeline);
        Assertions.e(timeline.h() == 1);
        Assertions.e(timeline.o() == 1);
        this.f6474c = adPlaybackState;
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
        long j;
        this.f6366b.f(i2, period, z2);
        long j2 = period.d;
        if (j2 == -9223372036854775807L) {
            this.f6474c.getClass();
            j = -9223372036854775807L;
        } else {
            j = j2;
        }
        period.h(period.f5508a, period.f5509b, period.f5510c, j, period.f5511e, this.f6474c, period.f);
        return period;
    }
}
