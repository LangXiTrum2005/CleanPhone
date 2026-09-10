package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class DummyExtractorOutput implements ExtractorOutput {
    @Override // androidx.media3.extractor.ExtractorOutput
    public final void e(SeekMap seekMap) {
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void endTracks() {
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final TrackOutput track(int i2, int i3) {
        return new DiscardingTrackOutput();
    }
}
