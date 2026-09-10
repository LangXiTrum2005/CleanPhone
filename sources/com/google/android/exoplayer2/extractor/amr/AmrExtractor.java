package com.google.android.exoplayer2.extractor.amr;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
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

/* JADX INFO: loaded from: classes3.dex */
public final class AmrExtractor implements Extractor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f17578n = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f17579p;
    public static final byte[] q;
    public static final int r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17582c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17583e;
    public boolean f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17585i;
    public ExtractorOutput j;
    public TrackOutput k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SeekMap f17586l;
    public boolean m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17580a = new byte[1];
    public int g = -1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        o = iArr;
        int i2 = Util.f18979a;
        Charset charset = Charsets.f19705c;
        f17579p = "#!AMR\n".getBytes(charset);
        q = "#!AMR-WB\n".getBytes(charset);
        r = iArr[8];
    }

    public final int a(DefaultExtractorInput defaultExtractorInput) throws ParserException {
        boolean z2;
        defaultExtractorInput.f = 0;
        byte[] bArr = this.f17580a;
        defaultExtractorInput.peekFully(bArr, 0, 1, false);
        byte b2 = bArr[0];
        if ((b2 & 131) > 0) {
            throw ParserException.a(null, "Invalid padding bits for frame header " + ((int) b2));
        }
        int i2 = (b2 >> 3) & 15;
        if (i2 >= 0 && i2 <= 15 && (((z2 = this.f17581b) && (i2 < 10 || i2 > 13)) || (!z2 && (i2 < 12 || i2 > 14)))) {
            return z2 ? o[i2] : f17578n[i2];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f17581b ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i2);
        throw ParserException.a(null, sb.toString());
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean b(ExtractorInput extractorInput) {
        return e((DefaultExtractorInput) extractorInput);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int c(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException {
        int iD;
        int i2;
        Assertions.e(this.k);
        int i3 = Util.f18979a;
        if (((DefaultExtractorInput) extractorInput).d == 0 && !e((DefaultExtractorInput) extractorInput)) {
            throw ParserException.a(null, "Could not find AMR header.");
        }
        if (!this.m) {
            this.m = true;
            boolean z2 = this.f17581b;
            String str = z2 ? "audio/amr-wb" : "audio/3gpp";
            int i4 = z2 ? 16000 : 8000;
            TrackOutput trackOutput = this.k;
            Format.Builder builder = new Format.Builder();
            builder.k = str;
            builder.f17087l = r;
            builder.x = 1;
            builder.y = i4;
            trackOutput.c(new Format(builder));
        }
        int i5 = -1;
        if (this.f17583e == 0) {
            try {
                int iA = a((DefaultExtractorInput) extractorInput);
                this.d = iA;
                this.f17583e = iA;
                if (this.g == -1) {
                    long j = ((DefaultExtractorInput) extractorInput).d;
                    this.g = iA;
                }
                if (this.g == iA) {
                    this.f17584h++;
                }
                iD = this.k.d(extractorInput, this.f17583e, true);
                if (iD != -1) {
                    i2 = this.f17583e - iD;
                    this.f17583e = i2;
                    i5 = 0;
                    if (i2 <= 0) {
                        this.k.f(this.f17582c + this.f17585i, 1, this.d, 0, null);
                        this.f17582c += 20000;
                    }
                }
            } catch (EOFException unused) {
            }
        } else {
            iD = this.k.d(extractorInput, this.f17583e, true);
            if (iD != -1) {
                i2 = this.f17583e - iD;
                this.f17583e = i2;
                i5 = 0;
                if (i2 <= 0) {
                    this.k.f(this.f17582c + this.f17585i, 1, this.d, 0, null);
                    this.f17582c += 20000;
                }
            }
        }
        if (!this.f) {
            SeekMap.Unseekable unseekable = new SeekMap.Unseekable(-9223372036854775807L);
            this.f17586l = unseekable;
            this.j.g(unseekable);
            this.f = true;
        }
        return i5;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        this.j = extractorOutput;
        this.k = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    public final boolean e(DefaultExtractorInput defaultExtractorInput) throws EOFException, InterruptedIOException {
        defaultExtractorInput.f = 0;
        byte[] bArr = f17579p;
        byte[] bArr2 = new byte[bArr.length];
        defaultExtractorInput.peekFully(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f17581b = false;
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
        this.f17581b = true;
        defaultExtractorInput.skipFully(bArr3.length);
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        this.f17582c = 0L;
        this.d = 0;
        this.f17583e = 0;
        if (j != 0) {
            SeekMap seekMap = this.f17586l;
            if (seekMap instanceof ConstantBitrateSeekMap) {
                ConstantBitrateSeekMap constantBitrateSeekMap = (ConstantBitrateSeekMap) seekMap;
                this.f17585i = (Math.max(0L, j - constantBitrateSeekMap.f17522b) * 8000000) / ((long) constantBitrateSeekMap.f17524e);
                return;
            }
        }
        this.f17585i = 0L;
    }
}
