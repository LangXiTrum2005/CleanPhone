package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
final class IndexSeeker implements Seeker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17730a;

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public final long a() {
        return 0L;
    }

    public final boolean b(long j) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.f17730a;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        Util.c(null, j);
        throw null;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public final long getTimeUs(long j) {
        Util.c(null, j);
        throw null;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}
