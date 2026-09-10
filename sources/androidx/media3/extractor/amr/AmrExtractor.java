package androidx.media3.extractor.amr;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import com.google.common.base.Charsets;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class AmrExtractor implements Extractor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f6821n = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f6822p;
    public static final byte[] q;
    public static final int r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6825c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6826e;
    public boolean f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6828i;
    public ExtractorOutput j;
    public TrackOutput k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SeekMap f6829l;
    public boolean m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6823a = new byte[1];
    public int g = -1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        o = iArr;
        int i2 = Util.f5683a;
        Charset charset = Charsets.f19705c;
        f6822p = "#!AMR\n".getBytes(charset);
        q = "#!AMR-WB\n".getBytes(charset);
        r = iArr[8];
    }

    public final int a(DefaultExtractorInput defaultExtractorInput) throws ParserException {
        boolean z2;
        defaultExtractorInput.f = 0;
        byte[] bArr = this.f6823a;
        defaultExtractorInput.peekFully(bArr, 0, 1, false);
        byte b2 = bArr[0];
        if ((b2 & 131) > 0) {
            throw ParserException.a(null, "Invalid padding bits for frame header " + ((int) b2));
        }
        int i2 = (b2 >> 3) & 15;
        if (i2 >= 0 && i2 <= 15 && (((z2 = this.f6824b) && (i2 < 10 || i2 > 13)) || (!z2 && (i2 < 12 || i2 > 14)))) {
            return z2 ? o[i2] : f6821n[i2];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f6824b ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i2);
        throw ParserException.a(null, sb.toString());
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) {
        return g((DefaultExtractorInput) extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.j = extractorOutput;
        this.k = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException {
        int iC;
        int i2;
        Assertions.f(this.k);
        int i3 = Util.f5683a;
        if (((DefaultExtractorInput) extractorInput).d == 0 && !g((DefaultExtractorInput) extractorInput)) {
            throw ParserException.a(null, "Could not find AMR header.");
        }
        if (!this.m) {
            this.m = true;
            boolean z2 = this.f6824b;
            String str = z2 ? "audio/amr-wb" : "audio/3gpp";
            int i4 = z2 ? 16000 : 8000;
            TrackOutput trackOutput = this.k;
            Format.Builder builder = new Format.Builder();
            builder.f5429l = MimeTypes.l(str);
            builder.m = r;
            builder.f5434z = 1;
            builder.f5418A = i4;
            trackOutput.b(new Format(builder));
        }
        int i5 = -1;
        if (this.f6826e == 0) {
            try {
                int iA = a((DefaultExtractorInput) extractorInput);
                this.d = iA;
                this.f6826e = iA;
                if (this.g == -1) {
                    long j = ((DefaultExtractorInput) extractorInput).d;
                    this.g = iA;
                }
                if (this.g == iA) {
                    this.f6827h++;
                }
                iC = this.k.c(extractorInput, this.f6826e, true);
                if (iC != -1) {
                    i2 = this.f6826e - iC;
                    this.f6826e = i2;
                    i5 = 0;
                    if (i2 <= 0) {
                        this.k.f(this.f6825c + this.f6828i, 1, this.d, 0, null);
                        this.f6825c += 20000;
                    }
                }
            } catch (EOFException unused) {
            }
        } else {
            iC = this.k.c(extractorInput, this.f6826e, true);
            if (iC != -1) {
                i2 = this.f6826e - iC;
                this.f6826e = i2;
                i5 = 0;
                if (i2 <= 0) {
                    this.k.f(this.f6825c + this.f6828i, 1, this.d, 0, null);
                    this.f6825c += 20000;
                }
            }
        }
        if (!this.f) {
            SeekMap.Unseekable unseekable = new SeekMap.Unseekable(-9223372036854775807L);
            this.f6829l = unseekable;
            this.j.e(unseekable);
            this.f = true;
        }
        return i5;
    }

    public final boolean g(DefaultExtractorInput defaultExtractorInput) throws EOFException, InterruptedIOException {
        defaultExtractorInput.f = 0;
        byte[] bArr = f6822p;
        byte[] bArr2 = new byte[bArr.length];
        defaultExtractorInput.peekFully(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f6824b = false;
            defaultExtractorInput.skipFully(bArr.length);
            return true;
        }
        defaultExtractorInput.f = 0;
        byte[] bArr3 = q;
        byte[] bArr4 = new byte[bArr3.length];
        defaultExtractorInput.peekFully(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f6824b = true;
        defaultExtractorInput.skipFully(bArr3.length);
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f6825c = 0L;
        this.d = 0;
        this.f6826e = 0;
        if (j != 0) {
            SeekMap seekMap = this.f6829l;
            if (seekMap instanceof ConstantBitrateSeekMap) {
                ConstantBitrateSeekMap constantBitrateSeekMap = (ConstantBitrateSeekMap) seekMap;
                this.f6828i = (Math.max(0L, j - constantBitrateSeekMap.f6736b) * 8000000) / ((long) constantBitrateSeekMap.f6738e);
                return;
            }
        }
        this.f6828i = 0L;
    }
}
