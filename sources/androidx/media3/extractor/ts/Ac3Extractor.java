package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class Ac3Extractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ac3Reader f7430a = new Ac3Reader();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f7431b = new ParsableByteArray(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7432c;

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int iA;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        int i2 = 0;
        while (true) {
            defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 10, false);
            parsableByteArray.G(0);
            if (parsableByteArray.x() != 4801587) {
                break;
            }
            parsableByteArray.H(3);
            int iT = parsableByteArray.t();
            i2 += iT + 10;
            defaultExtractorInput.c(iT, false);
        }
        defaultExtractorInput.f = 0;
        defaultExtractorInput.c(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 6, false);
            parsableByteArray.G(0);
            if (parsableByteArray.A() != 2935) {
                defaultExtractorInput.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                defaultExtractorInput.c(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = parsableByteArray.f5667a;
                if (bArr.length < 6) {
                    iA = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iA = ((((bArr[2] & 7) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + 1) * 2;
                } else {
                    byte b2 = bArr[4];
                    iA = Ac3Util.a((b2 & 192) >> 6, b2 & 63);
                }
                if (iA == -1) {
                    break;
                }
                defaultExtractorInput.c(iA - 6, false);
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f7430a.e(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
        extractorOutput.e(new SeekMap.Unseekable(-9223372036854775807L));
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws EOFException, InterruptedIOException {
        ParsableByteArray parsableByteArray = this.f7431b;
        int i2 = ((DefaultExtractorInput) extractorInput).read(parsableByteArray.f5667a, 0, 2786);
        if (i2 == -1) {
            return -1;
        }
        parsableByteArray.G(0);
        parsableByteArray.F(i2);
        boolean z2 = this.f7432c;
        Ac3Reader ac3Reader = this.f7430a;
        if (!z2) {
            ac3Reader.m = 0L;
            this.f7432c = true;
        }
        ac3Reader.a(parsableByteArray);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f7432c = false;
        this.f7430a.seek();
    }
}
