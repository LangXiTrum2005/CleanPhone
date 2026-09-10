package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class CeaSubtitle implements Subtitle {
    public final List X;

    public CeaSubtitle(List list) {
        this.X = list;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final List getCues(long j) {
        return j >= 0 ? this.X : Collections.EMPTY_LIST;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final long getEventTime(int i2) {
        Assertions.b(i2 == 0);
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }
}
