package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.ForwardingExtractorInput;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes3.dex */
final class StartOffsetExtractorInput extends ForwardingExtractorInput {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17658b;

    public StartOffsetExtractorInput(DefaultExtractorInput defaultExtractorInput, long j) {
        super(defaultExtractorInput);
        Assertions.b(defaultExtractorInput.d >= j);
        this.f17658b = j;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public final long getLength() {
        return super.getLength() - this.f17658b;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public final long getPeekPosition() {
        return super.getPeekPosition() - this.f17658b;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public final long getPosition() {
        return super.getPosition() - this.f17658b;
    }
}
