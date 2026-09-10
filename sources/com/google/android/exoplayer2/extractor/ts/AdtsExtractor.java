package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.p004ironsource.mediationsdk.metadata.a;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public final class AdtsExtractor implements Extractor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f17916c;
    public final ParsableBitArray d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExtractorOutput f17917e;
    public long f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17919i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdtsReader f17914a = new AdtsReader(true, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f17915b = new ParsableByteArray(a.f25965n);
    public long g = -1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AdtsExtractor() {
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        this.f17916c = parsableByteArray;
        byte[] bArr = parsableByteArray.f18956a;
        this.d = new ParsableBitArray(bArr, bArr.length);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        int i2 = 0;
        while (true) {
            ParsableByteArray parsableByteArray = this.f17916c;
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
        if (this.g == -1) {
            this.g = i2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        do {
            ParsableByteArray parsableByteArray2 = this.f17916c;
            defaultExtractorInput.peekFully(parsableByteArray2.f18956a, 0, 2, false);
            parsableByteArray2.F(0);
            if ((parsableByteArray2.z() & 65526) == 65520) {
                i4++;
                if (i4 >= 4 && i5 > 188) {
                    return true;
                }
                defaultExtractorInput.peekFully(parsableByteArray2.f18956a, 0, 4, false);
                ParsableBitArray parsableBitArray = this.d;
                parsableBitArray.l(14);
                int iG = parsableBitArray.g(13);
                if (iG <= 6) {
                    i3++;
                    defaultExtractorInput.f = 0;
                    defaultExtractorInput.c(i3, false);
                } else {
                    defaultExtractorInput.c(iG - 6, false);
                    i5 += iG;
                }
            } else {
                i3++;
                defaultExtractorInput.f = 0;
                defaultExtractorInput.c(i3, false);
            }
            i4 = 0;
            i5 = 0;
        } while (i3 - i2 < 8192);
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) throws EOFException, InterruptedIOException {
        Assertions.e(this.f17917e);
        long j = ((DefaultExtractorInput) extractorInput).f17527c;
        ParsableByteArray parsableByteArray = this.f17915b;
        int i2 = ((DefaultExtractorInput) extractorInput).read(parsableByteArray.f18956a, 0, a.f25965n);
        boolean z2 = i2 == -1;
        if (!this.f17919i) {
            this.f17917e.g(new SeekMap.Unseekable(-9223372036854775807L));
            this.f17919i = true;
        }
        if (z2) {
            return -1;
        }
        parsableByteArray.F(0);
        parsableByteArray.E(i2);
        boolean z3 = this.f17918h;
        AdtsReader adtsReader = this.f17914a;
        if (!z3) {
            adtsReader.c(4, this.f);
            this.f17918h = true;
        }
        adtsReader.b(parsableByteArray);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f17917e = extractorOutput;
        this.f17914a.d(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f17918h = false;
        this.f17914a.seek();
        this.f = j2;
    }
}
