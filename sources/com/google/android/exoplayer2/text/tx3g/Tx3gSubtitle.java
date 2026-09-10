package com.google.android.exoplayer2.text.tx3g;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class Tx3gSubtitle implements Subtitle {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Tx3gSubtitle f18628Y = new Tx3gSubtitle();
    public final List X;

    public Tx3gSubtitle(Cue cue) {
        this.X = Collections.singletonList(cue);
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

    public Tx3gSubtitle() {
        this.X = Collections.EMPTY_LIST;
    }
}
