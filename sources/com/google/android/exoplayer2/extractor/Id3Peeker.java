package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class Id3Peeker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f17550a = new ParsableByteArray(10);

    public final Metadata a(DefaultExtractorInput defaultExtractorInput, Id3Decoder.FramePredicate framePredicate) {
        ParsableByteArray parsableByteArray = this.f17550a;
        Metadata metadataC = null;
        int i2 = 0;
        while (true) {
            try {
                defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 10, false);
                parsableByteArray.F(0);
                if (parsableByteArray.w() != 4801587) {
                    break;
                }
                parsableByteArray.G(3);
                int iT = parsableByteArray.t();
                int i3 = iT + 10;
                if (metadataC == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(parsableByteArray.f18956a, 0, bArr, 0, 10);
                    defaultExtractorInput.peekFully(bArr, 10, iT, false);
                    metadataC = new Id3Decoder(framePredicate).c(i3, bArr);
                } else {
                    defaultExtractorInput.c(iT, false);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        defaultExtractorInput.f = 0;
        defaultExtractorInput.c(i2, false);
        return metadataC;
    }
}
