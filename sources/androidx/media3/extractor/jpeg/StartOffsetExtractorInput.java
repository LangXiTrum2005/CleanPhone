package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.ForwardingExtractorInput;

/* JADX INFO: loaded from: classes.dex */
final class StartOffsetExtractorInput extends ForwardingExtractorInput {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6908b;

    public StartOffsetExtractorInput(DefaultExtractorInput defaultExtractorInput, long j) {
        super(defaultExtractorInput);
        Assertions.b(defaultExtractorInput.d >= j);
        this.f6908b = j;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public final long getLength() {
        return super.getLength() - this.f6908b;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public final long getPeekPosition() {
        return super.getPeekPosition() - this.f6908b;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public final long getPosition() {
        return super.getPosition() - this.f6908b;
    }
}
