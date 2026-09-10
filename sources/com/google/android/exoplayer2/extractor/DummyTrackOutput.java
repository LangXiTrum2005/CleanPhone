package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class DummyTrackOutput implements TrackOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17532a = new byte[4096];

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int a(DataReader dataReader, int i2, boolean z2) throws EOFException {
        byte[] bArr = this.f17532a;
        int i3 = dataReader.read(bArr, 0, Math.min(bArr.length, i2));
        if (i3 != -1) {
            return i3;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void b(int i2, ParsableByteArray parsableByteArray) {
        parsableByteArray.G(i2);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void c(Format format) {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void f(long j, int i2, int i3, int i4, TrackOutput.CryptoData cryptoData) {
    }
}
