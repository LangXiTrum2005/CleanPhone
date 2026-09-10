package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;

/* JADX INFO: loaded from: classes3.dex */
public final class StartOffsetExtractorOutput implements ExtractorOutput {
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ExtractorOutput f17659Y;

    public StartOffsetExtractorOutput(long j, ExtractorOutput extractorOutput) {
        this.X = j;
        this.f17659Y = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public final void endTracks() {
        this.f17659Y.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public final void g(final SeekMap seekMap) {
        this.f17659Y.g(new SeekMap() { // from class: com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorOutput.1
            @Override // com.google.android.exoplayer2.extractor.SeekMap
            public final long getDurationUs() {
                return seekMap.getDurationUs();
            }

            @Override // com.google.android.exoplayer2.extractor.SeekMap
            public final SeekMap.SeekPoints getSeekPoints(long j) {
                SeekMap.SeekPoints seekPoints = seekMap.getSeekPoints(j);
                SeekPoint seekPoint = seekPoints.f17555a;
                long j2 = seekPoint.f17560a;
                long j3 = seekPoint.f17561b;
                long j4 = StartOffsetExtractorOutput.this.X;
                SeekPoint seekPoint2 = new SeekPoint(j2, j3 + j4);
                SeekPoint seekPoint3 = seekPoints.f17556b;
                return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPoint3.f17560a, seekPoint3.f17561b + j4));
            }

            @Override // com.google.android.exoplayer2.extractor.SeekMap
            public final boolean isSeekable() {
                return seekMap.isSeekable();
            }
        });
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public final TrackOutput track(int i2, int i3) {
        return this.f17659Y.track(i2, i3);
    }
}
