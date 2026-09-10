package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class Id3Peeker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f6781a = new ParsableByteArray(10);

    public final Metadata a(DefaultExtractorInput defaultExtractorInput, Id3Decoder.FramePredicate framePredicate) throws Throwable {
        ParsableByteArray parsableByteArray = this.f6781a;
        Metadata metadataC = null;
        int i2 = 0;
        while (true) {
            try {
                defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 10, false);
                parsableByteArray.G(0);
                if (parsableByteArray.x() != 4801587) {
                    break;
                }
                parsableByteArray.H(3);
                int iT = parsableByteArray.t();
                int i3 = iT + 10;
                if (metadataC == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(parsableByteArray.f5667a, 0, bArr, 0, 10);
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
