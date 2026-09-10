package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes3.dex */
public interface ExtractorOutput {
    public static final ExtractorOutput Q8 = new AnonymousClass1();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ExtractorOutput$1, reason: invalid class name */
    public class AnonymousClass1 implements ExtractorOutput {
        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public final void endTracks() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public final void g(SeekMap seekMap) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public final TrackOutput track(int i2, int i3) {
            throw new UnsupportedOperationException();
        }
    }

    void endTracks();

    void g(SeekMap seekMap);

    TrackOutput track(int i2, int i3);
}
