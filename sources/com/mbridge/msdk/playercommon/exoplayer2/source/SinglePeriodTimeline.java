package com.mbridge.msdk.playercommon.exoplayer2.source;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class SinglePeriodTimeline extends Timeline {
    private static final Object UID = new Object();
    private final boolean isDynamic;
    private final boolean isSeekable;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;

    @Nullable
    private final Object tag;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;

    public SinglePeriodTimeline(long j10, boolean z10, boolean z11) {
        this(j10, z10, z11, null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getIndexOfPeriod(Object obj) {
        return UID.equals(obj) ? 0 : -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public Timeline.Period getPeriod(int i10, Timeline.Period period, boolean z10) {
        Assertions.checkIndex(i10, 0, 1);
        return period.set(null, z10 ? UID : null, 0, this.periodDurationUs, -this.windowPositionInPeriodUs);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getPeriodCount() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[PHI: r1
  0x0031: PHI (r1v4 long) = (r1v3 long), (r1v3 long), (r1v5 long) binds: [B:8:0x0015, B:10:0x001b, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public Timeline.Window getWindow(int i10, Timeline.Window window, boolean z10, long j10) {
        long j11;
        Assertions.checkIndex(i10, 0, 1);
        Object obj = z10 ? this.tag : null;
        long j12 = this.windowDefaultStartPositionUs;
        boolean z11 = this.isDynamic;
        if (!z11 || j10 == 0) {
            j11 = j12;
        } else {
            long j13 = this.windowDurationUs;
            if (j13 != C.TIME_UNSET) {
                j12 += j10;
                if (j12 <= j13) {
                    j11 = j12;
                }
            }
            j11 = -9223372036854775807L;
        }
        return window.set(obj, this.presentationStartTimeMs, this.windowStartTimeMs, this.isSeekable, z11, j11, this.windowDurationUs, 0, 0, this.windowPositionInPeriodUs);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Timeline
    public int getWindowCount() {
        return 1;
    }

    public SinglePeriodTimeline(long j10, boolean z10, boolean z11, @Nullable Object obj) {
        this(j10, j10, 0L, 0L, z10, z11, obj);
    }

    public SinglePeriodTimeline(long j10, long j11, long j12, long j13, boolean z10, boolean z11, @Nullable Object obj) {
        this(C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12, j13, z10, z11, obj);
    }

    public SinglePeriodTimeline(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, @Nullable Object obj) {
        this.presentationStartTimeMs = j10;
        this.windowStartTimeMs = j11;
        this.periodDurationUs = j12;
        this.windowDurationUs = j13;
        this.windowPositionInPeriodUs = j14;
        this.windowDefaultStartPositionUs = j15;
        this.isSeekable = z10;
        this.isDynamic = z11;
        this.tag = obj;
    }
}
