package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes3.dex */
public final class DummyExtractorOutput implements ExtractorOutput {
    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public final void endTracks() {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public final void g(SeekMap seekMap) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public final TrackOutput track(int i2, int i3) {
        return new DummyTrackOutput();
    }
}
