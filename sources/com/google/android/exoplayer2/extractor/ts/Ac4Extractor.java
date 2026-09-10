package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class Ac4Extractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ac4Reader f17904a = new Ac4Reader(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f17905b = new ParsableByteArray(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17906c;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int i2;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        int i3 = 0;
        while (true) {
            defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 10, false);
            parsableByteArray.F(0);
            if (parsableByteArray.w() != 4801587) {
                break;
            }
            parsableByteArray.G(3);
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
            defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 7, false);
            parsableByteArray.F(0);
            int iZ = parsableByteArray.z();
            if (iZ == 44096 || iZ == 44097) {
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] bArr = parsableByteArray.f18956a;
                if (bArr.length < 7) {
                    i2 = -1;
                } else {
                    int i7 = ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    if (i7 == 65535) {
                        i7 = ((bArr[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    } else {
                        i6 = 4;
                    }
                    if (iZ == 44097) {
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

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) throws EOFException, InterruptedIOException {
        ParsableByteArray parsableByteArray = this.f17905b;
        int i2 = ((DefaultExtractorInput) extractorInput).read(parsableByteArray.f18956a, 0, 16384);
        if (i2 == -1) {
            return -1;
        }
        parsableByteArray.F(0);
        parsableByteArray.E(i2);
        boolean z2 = this.f17906c;
        Ac4Reader ac4Reader = this.f17904a;
        if (!z2) {
            ac4Reader.c(4, 0L);
            this.f17906c = true;
        }
        ac4Reader.b(parsableByteArray);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f17904a.d(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
        extractorOutput.g(new SeekMap.Unseekable(-9223372036854775807L));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f17906c = false;
        this.f17904a.seek();
    }
}
