package com.mbridge.msdk.playercommon.exoplayer2.text.ssa;

import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class SsaSubtitle implements Subtitle {
    private final long[] cueTimesUs;
    private final Cue[] cues;

    public SsaSubtitle(Cue[] cueArr, long[] jArr) {
        this.cues = cueArr;
        this.cueTimesUs = jArr;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j10) {
        Cue cue;
        int iBinarySearchFloor = Util.binarySearchFloor(this.cueTimesUs, j10, true, false);
        return (iBinarySearchFloor == -1 || (cue = this.cues[iBinarySearchFloor]) == null) ? Collections.EMPTY_LIST : Collections.singletonList(cue);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public long getEventTime(int i10) {
        Assertions.checkArgument(i10 >= 0);
        Assertions.checkArgument(i10 < this.cueTimesUs.length);
        return this.cueTimesUs[i10];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.cueTimesUs.length;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j10) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.cueTimesUs, j10, false, false);
        if (iBinarySearchCeil < this.cueTimesUs.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
