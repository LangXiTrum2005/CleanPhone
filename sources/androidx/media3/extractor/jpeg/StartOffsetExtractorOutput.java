package androidx.media3.extractor.jpeg;

import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ForwardingSeekMap;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes.dex */
public final class StartOffsetExtractorOutput implements ExtractorOutput {
    public final long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ExtractorOutput f6909Y;

    public StartOffsetExtractorOutput(long j, ExtractorOutput extractorOutput) {
        this.X = j;
        this.f6909Y = extractorOutput;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void e(final SeekMap seekMap) {
        this.f6909Y.e(new ForwardingSeekMap(seekMap) { // from class: androidx.media3.extractor.jpeg.StartOffsetExtractorOutput.1
            @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
            public final SeekMap.SeekPoints getSeekPoints(long j) {
                SeekMap.SeekPoints seekPoints = seekMap.getSeekPoints(j);
                SeekPoint seekPoint = seekPoints.f6794a;
                long j2 = seekPoint.f6799a;
                long j3 = StartOffsetExtractorOutput.this.X;
                SeekPoint seekPoint2 = new SeekPoint(j2, seekPoint.f6800b + j3);
                SeekPoint seekPoint3 = seekPoints.f6795b;
                return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPoint3.f6799a, seekPoint3.f6800b + j3));
            }
        });
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void endTracks() {
        this.f6909Y.endTracks();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final TrackOutput track(int i2, int i3) {
        return this.f6909Y.track(i2, i3);
    }
}
