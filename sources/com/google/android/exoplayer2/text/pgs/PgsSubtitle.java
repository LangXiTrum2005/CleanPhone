package com.google.android.exoplayer2.text.pgs;

import com.google.android.exoplayer2.text.Subtitle;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class PgsSubtitle implements Subtitle {
    public final List X;

    public PgsSubtitle(List list) {
        this.X = list;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final List getCues(long j) {
        return this.X;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final long getEventTime(int i2) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        return -1;
    }
}
