package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SubtitleOutputBuffer extends DecoderOutputBuffer implements Subtitle {
    public Subtitle e0;
    public long f0;

    public final void f(long j, Subtitle subtitle, long j2) {
        this.f17434Y = j;
        this.e0 = subtitle;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f0 = j;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final List getCues(long j) {
        Subtitle subtitle = this.e0;
        subtitle.getClass();
        return subtitle.getCues(j - this.f0);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final long getEventTime(int i2) {
        Subtitle subtitle = this.e0;
        subtitle.getClass();
        return subtitle.getEventTime(i2) + this.f0;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        Subtitle subtitle = this.e0;
        subtitle.getClass();
        return subtitle.getEventTimeCount();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        Subtitle subtitle = this.e0;
        subtitle.getClass();
        return subtitle.getNextEventTimeIndex(j - this.f0);
    }
}
