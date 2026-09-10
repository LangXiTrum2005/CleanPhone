package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap;

/* JADX INFO: loaded from: classes3.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public final long a() {
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public final long getTimeUs(long j) {
        return (Math.max(0L, j - this.f17522b) * 8000000) / ((long) this.f17524e);
    }
}
