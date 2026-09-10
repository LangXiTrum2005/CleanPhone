package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingSeekMap implements SeekMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SeekMap f6771a;

    public ForwardingSeekMap(SeekMap seekMap) {
        this.f6771a = seekMap;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.f6771a.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        return this.f6771a.getSeekPoints(j);
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean isSeekable() {
        return this.f6771a.isSeekable();
    }
}
