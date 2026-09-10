package androidx.media3.extractor;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;

/* JADX INFO: loaded from: classes.dex */
public final class SingleSampleExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6803c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6804e;
    public ExtractorOutput f;
    public TrackOutput g;

    public SingleSampleExtractor(int i2, int i3, String str) {
        this.f6801a = i2;
        this.f6802b = i3;
        this.f6803c = str;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) {
        int i2 = this.f6802b;
        int i3 = this.f6801a;
        Assertions.e((i3 == -1 || i2 == -1) ? false : true);
        ParsableByteArray parsableByteArray = new ParsableByteArray(i2);
        ((DefaultExtractorInput) extractorInput).peekFully(parsableByteArray.f5667a, 0, i2, false);
        return parsableByteArray.A() == i3;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f = extractorOutput;
        TrackOutput trackOutputTrack = extractorOutput.track(1024, 4);
        this.g = trackOutputTrack;
        Format.Builder builder = new Format.Builder();
        builder.f5429l = MimeTypes.l(this.f6803c);
        trackOutputTrack.b(new Format(builder));
        this.f.endTracks();
        this.f.e(new SingleSampleSeekMap());
        this.f6804e = 1;
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int i2 = this.f6804e;
        if (i2 != 1) {
            if (i2 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        TrackOutput trackOutput = this.g;
        trackOutput.getClass();
        int iC = trackOutput.c(extractorInput, 1024, true);
        if (iC != -1) {
            this.d += iC;
            return 0;
        }
        this.f6804e = 2;
        this.g.f(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        if (j == 0 || this.f6804e == 1) {
            this.f6804e = 1;
            this.d = 0;
        }
    }
}
