package androidx.media3.extractor.webp;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class WebpExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f7683a = new ParsableByteArray(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SingleSampleExtractor f7684b = new SingleSampleExtractor(-1, -1, "image/webp");

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        ParsableByteArray parsableByteArray = this.f7683a;
        parsableByteArray.D(4);
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 4, false);
        if (parsableByteArray.w() == 1380533830) {
            defaultExtractorInput.c(4, false);
            parsableByteArray.D(4);
            defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 4, false);
            if (parsableByteArray.w() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f7684b.d(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.f7684b.f(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f7684b.seek(j, j2);
    }
}
