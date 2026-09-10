package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class SingleSampleSeekMap implements SeekMap {
    @Override // androidx.media3.extractor.SeekMap
    public final long getDurationUs() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j) {
        SeekPoint seekPoint = new SeekPoint(j, 0L);
        return new SeekMap.SeekPoints(seekPoint, seekPoint);
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }
}
