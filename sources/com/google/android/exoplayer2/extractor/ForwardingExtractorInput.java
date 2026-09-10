package com.google.android.exoplayer2.extractor;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public class ForwardingExtractorInput implements ExtractorInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultExtractorInput f17546a;

    public ForwardingExtractorInput(DefaultExtractorInput defaultExtractorInput) {
        this.f17546a = defaultExtractorInput;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public final void advancePeekPosition(int i2) throws EOFException, InterruptedIOException {
        this.f17546a.c(i2, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return this.f17546a.f17527c;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.f17546a.getPeekPosition();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return this.f17546a.d;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public final boolean peekFully(byte[] bArr, int i2, int i3, boolean z2) {
        return this.f17546a.peekFully(bArr, 0, i3, z2);
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        return this.f17546a.read(bArr, i2, i3);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public final boolean readFully(byte[] bArr, int i2, int i3, boolean z2) {
        return this.f17546a.readFully(bArr, 0, i3, z2);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public final void resetPeekPosition() {
        this.f17546a.f = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public final void skipFully(int i2) throws EOFException, InterruptedIOException {
        this.f17546a.skipFully(i2);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public final void peekFully(byte[] bArr, int i2, int i3) {
        this.f17546a.peekFully(bArr, i2, i3, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public final void readFully(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        this.f17546a.readFully(bArr, i2, i3, false);
    }
}
