package androidx.media3.extractor.mp3;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;

/* JADX INFO: loaded from: classes.dex */
final class IndexSeeker implements Seeker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7030a;

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long a() {
        return 0L;
    }

    public final boolean b(long j) {
        throw null;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final int g() {
        return 0;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long getDurationUs() {
        return this.f7030a;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        Util.c(null, j);
        throw null;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long getTimeUs(long j) {
        Util.c(null, j);
        throw null;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}
