package androidx.media3.extractor.ts;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import com.p004ironsource.mediationsdk.metadata.a;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public final class AdtsExtractor implements Extractor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f7452c;
    public final ParsableBitArray d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExtractorOutput f7453e;
    public long f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7455i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdtsReader f7450a = new AdtsReader(0, null, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f7451b = new ParsableByteArray(a.f25965n);
    public long g = -1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AdtsExtractor() {
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        this.f7452c = parsableByteArray;
        byte[] bArr = parsableByteArray.f5667a;
        this.d = new ParsableBitArray(bArr, bArr.length);
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        int i2 = 0;
        while (true) {
            ParsableByteArray parsableByteArray = this.f7452c;
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
        if (this.g == -1) {
            this.g = i2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        do {
            ParsableByteArray parsableByteArray2 = this.f7452c;
            defaultExtractorInput.peekFully(parsableByteArray2.f5667a, 0, 2, false);
            parsableByteArray2.G(0);
            if ((parsableByteArray2.A() & 65526) == 65520) {
                i4++;
                if (i4 >= 4 && i5 > 188) {
                    return true;
                }
                defaultExtractorInput.peekFully(parsableByteArray2.f5667a, 0, 4, false);
                ParsableBitArray parsableBitArray = this.d;
                parsableBitArray.m(14);
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

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.f7453e = extractorOutput;
        this.f7450a.e(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException, EOFException, InterruptedIOException {
        Assertions.f(this.f7453e);
        long j = ((DefaultExtractorInput) extractorInput).f6741c;
        ParsableByteArray parsableByteArray = this.f7451b;
        int i2 = ((DefaultExtractorInput) extractorInput).read(parsableByteArray.f5667a, 0, a.f25965n);
        boolean z2 = i2 == -1;
        if (!this.f7455i) {
            this.f7453e.e(new SeekMap.Unseekable(-9223372036854775807L));
            this.f7455i = true;
        }
        if (z2) {
            return -1;
        }
        parsableByteArray.G(0);
        parsableByteArray.F(i2);
        boolean z3 = this.f7454h;
        AdtsReader adtsReader = this.f7450a;
        if (!z3) {
            adtsReader.t = this.f;
            this.f7454h = true;
        }
        adtsReader.a(parsableByteArray);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f7454h = false;
        this.f7450a.seek();
        this.f = j2;
    }
}
