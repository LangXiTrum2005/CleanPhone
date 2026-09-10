package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.Timeline;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ForwardingTimeline extends Timeline {
    protected final Timeline timeline;

    public ForwardingTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getFirstWindowIndex(boolean z10) {
        return this.timeline.getFirstWindowIndex(z10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getIndexOfPeriod(Object obj) {
        return this.timeline.getIndexOfPeriod(obj);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getLastWindowIndex(boolean z10) {
        return this.timeline.getLastWindowIndex(z10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getNextWindowIndex(int i10, int i11, boolean z10) {
        return this.timeline.getNextWindowIndex(i10, i11, z10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
        return this.timeline.getPeriod(i10, period, z10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getPeriodCount() {
        return this.timeline.getPeriodCount();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getPreviousWindowIndex(int i10, int i11, boolean z10) {
        return this.timeline.getPreviousWindowIndex(i10, i11, z10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public Timeline.Window getWindow(int i10, Timeline.Window window, boolean z10, long j10) {
        return this.timeline.getWindow(i10, window, z10, j10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getWindowCount() {
        return this.timeline.getWindowCount();
    }
}
