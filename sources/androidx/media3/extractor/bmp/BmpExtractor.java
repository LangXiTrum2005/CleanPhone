package androidx.media3.extractor.bmp;

import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;

/* JADX INFO: loaded from: classes.dex */
public final class BmpExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SingleSampleExtractor f6864a = new SingleSampleExtractor(16973, 2, "image/bmp");

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) {
        return this.f6864a.c(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f6864a.d(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.f6864a.f(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f6864a.seek(j, j2);
    }
}
