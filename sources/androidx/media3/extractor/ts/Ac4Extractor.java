package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
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
public final class Ac4Extractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ac4Reader f7440a = new Ac4Reader(null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f7441b = new ParsableByteArray(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7442c;

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int i2;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        int i3 = 0;
        while (true) {
            defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 10, false);
            parsableByteArray.G(0);
            if (parsableByteArray.x() != 4801587) {
                break;
            }
            parsableByteArray.H(3);
            int iT = parsableByteArray.t();
            i3 += iT + 10;
            defaultExtractorInput.c(iT, false);
        }
        defaultExtractorInput.f = 0;
        defaultExtractorInput.c(i3, false);
        int i4 = 0;
        int i5 = i3;
        while (true) {
            int i6 = 7;
            defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 7, false);
            parsableByteArray.G(0);
            int iA = parsableByteArray.A();
            if (iA == 44096 || iA == 44097) {
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] bArr = parsableByteArray.f5667a;
                if (bArr.length < 7) {
                    i2 = -1;
                } else {
                    int i7 = ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    if (i7 == 65535) {
                        i7 = ((bArr[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    } else {
                        i6 = 4;
                    }
                    if (iA == 44097) {
                        i6 += 2;
                    }
                    i2 = i7 + i6;
                }
                if (i2 == -1) {
                    break;
                }
                defaultExtractorInput.c(i2 - 7, false);
            } else {
                defaultExtractorInput.f = 0;
                i5++;
                if (i5 - i3 >= 8192) {
                    break;
                }
                defaultExtractorInput.c(i5, false);
                i4 = 0;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f7440a.e(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
        extractorOutput.e(new SeekMap.Unseekable(-9223372036854775807L));
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws EOFException, InterruptedIOException {
        ParsableByteArray parsableByteArray = this.f7441b;
        int i2 = ((DefaultExtractorInput) extractorInput).read(parsableByteArray.f5667a, 0, 16384);
        if (i2 == -1) {
            return -1;
        }
        parsableByteArray.G(0);
        parsableByteArray.F(i2);
        boolean z2 = this.f7442c;
        Ac4Reader ac4Reader = this.f7440a;
        if (!z2) {
            ac4Reader.m = 0L;
            this.f7442c = true;
        }
        ac4Reader.a(parsableByteArray);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f7442c = false;
        this.f7440a.seek();
    }
}
