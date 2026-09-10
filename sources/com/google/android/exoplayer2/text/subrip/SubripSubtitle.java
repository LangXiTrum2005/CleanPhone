package com.google.android.exoplayer2.text.subrip;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class SubripSubtitle implements Subtitle {
    public final Cue[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long[] f18589Y;

    public SubripSubtitle(Cue[] cueArr, long[] jArr) {
        this.X = cueArr;
        this.f18589Y = jArr;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final List getCues(long j) {
        Cue cue;
        int iF = Util.f(this.f18589Y, j, false);
        return (iF == -1 || (cue = this.X[iF]) == Cue.s0) ? Collections.EMPTY_LIST : Collections.singletonList(cue);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final long getEventTime(int i2) {
        Assertions.b(i2 >= 0);
        long[] jArr = this.f18589Y;
        Assertions.b(i2 < jArr.length);
        return jArr[i2];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        return this.f18589Y.length;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        long[] jArr = this.f18589Y;
        int iB = Util.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }
}
