package com.mbridge.msdk.playercommon.exoplayer2.text;

import com.mbridge.msdk.playercommon.exoplayer2.decoder.OutputBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class SubtitleOutputBuffer extends OutputBuffer implements Subtitle {
    private long subsampleOffsetUs;
    private Subtitle subtitle;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        this.subtitle = null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j10) {
        return this.subtitle.getCues(j10 - this.subsampleOffsetUs);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public long getEventTime(int i10) {
        return this.subtitle.getEventTime(i10) + this.subsampleOffsetUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.subtitle.getEventTimeCount();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j10) {
        return this.subtitle.getNextEventTimeIndex(j10 - this.subsampleOffsetUs);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.OutputBuffer
    public abstract void release();

    public void setContent(long j10, Subtitle subtitle, long j11) {
        this.timeUs = j10;
        this.subtitle = subtitle;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.subsampleOffsetUs = j10;
    }
}
