package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.audio.Ac3Util;
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
public final class Ac3Extractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ac3Reader f17894a = new Ac3Reader(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f17895b = new ParsableByteArray(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17896c;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int iA;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        int i2 = 0;
        while (true) {
            defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 10, false);
            parsableByteArray.F(0);
            if (parsableByteArray.w() != 4801587) {
                break;
            }
            parsableByteArray.G(3);
            int iT = parsableByteArray.t();
            i2 += iT + 10;
            defaultExtractorInput.c(iT, false);
        }
        defaultExtractorInput.f = 0;
        defaultExtractorInput.c(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 6, false);
            parsableByteArray.F(0);
            if (parsableByteArray.z() != 2935) {
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
                byte[] bArr = parsableByteArray.f18956a;
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

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) throws EOFException, InterruptedIOException {
        ParsableByteArray parsableByteArray = this.f17895b;
        int i2 = ((DefaultExtractorInput) extractorInput).read(parsableByteArray.f18956a, 0, 2786);
        if (i2 == -1) {
            return -1;
        }
        parsableByteArray.F(0);
        parsableByteArray.E(i2);
        boolean z2 = this.f17896c;
        Ac3Reader ac3Reader = this.f17894a;
        if (!z2) {
            ac3Reader.c(4, 0L);
            this.f17896c = true;
        }
        ac3Reader.b(parsableByteArray);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f17894a.d(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
        extractorOutput.g(new SeekMap.Unseekable(-9223372036854775807L));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f17896c = false;
        this.f17894a.seek();
    }
}
