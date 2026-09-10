package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class Mp4WebvttSubtitle implements Subtitle {
    public final List X;

    public Mp4WebvttSubtitle(ArrayList arrayList) {
        this.X = Collections.unmodifiableList(arrayList);
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
