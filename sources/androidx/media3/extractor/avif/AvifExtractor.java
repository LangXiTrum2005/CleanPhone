package androidx.media3.extractor.avif;

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
public final class AvifExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f6862a = new ParsableByteArray(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SingleSampleExtractor f6863b = new SingleSampleExtractor(-1, -1, "image/avif");

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.c(4, false);
        ParsableByteArray parsableByteArray = this.f6862a;
        parsableByteArray.D(4);
        defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 4, false);
        if (parsableByteArray.w() == 1718909296) {
            parsableByteArray.D(4);
            defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 4, false);
            if (parsableByteArray.w() == 1635150182) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f6863b.d(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.f6863b.f(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f6863b.seek(j, j2);
    }
}
