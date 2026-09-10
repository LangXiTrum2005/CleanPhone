package androidx.media3.extractor;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingExtractorInput implements ExtractorInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultExtractorInput f6770a;

    public ForwardingExtractorInput(DefaultExtractorInput defaultExtractorInput) {
        this.f6770a = defaultExtractorInput;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void advancePeekPosition(int i2) throws EOFException, InterruptedIOException {
        this.f6770a.c(i2, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getLength() {
        return this.f6770a.f6741c;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.f6770a.getPeekPosition();
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPosition() {
        return this.f6770a.d;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final boolean peekFully(byte[] bArr, int i2, int i3, boolean z2) {
        return this.f6770a.peekFully(bArr, 0, i3, z2);
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        return this.f6770a.read(bArr, i2, i3);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final boolean readFully(byte[] bArr, int i2, int i3, boolean z2) {
        return this.f6770a.readFully(bArr, 0, i3, z2);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void resetPeekPosition() {
        this.f6770a.f = 0;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void skipFully(int i2) throws EOFException, InterruptedIOException {
        this.f6770a.skipFully(i2);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void peekFully(byte[] bArr, int i2, int i3) {
        this.f6770a.peekFully(bArr, i2, i3, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void readFully(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        this.f6770a.readFully(bArr, i2, i3, false);
    }
}
