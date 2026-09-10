package androidx.media3.extractor.text;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import com.google.common.primitives.Ints;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class SubtitleExtractor implements Extractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubtitleParser f7208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f7209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f7210c;
    public TrackOutput f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f7213i;
    public long j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f7211e = Util.f;
    public final ParsableByteArray d = new ParsableByteArray();

    public static class Sample implements Comparable<Sample> {
        public final long X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final byte[] f7214Y;

        public Sample(long j, byte[] bArr) {
            this.X = j;
            this.f7214Y = bArr;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Sample sample) {
            return Long.compare(this.X, sample.X);
        }
    }

    public SubtitleExtractor(SubtitleParser subtitleParser, Format format) {
        this.f7208a = subtitleParser;
        Format.Builder builderA = format.a();
        builderA.f5429l = MimeTypes.l("application/x-media3-cues");
        builderA.f5428i = format.m;
        builderA.f5421F = subtitleParser.c();
        this.f7209b = new Format(builderA);
        this.f7210c = new ArrayList();
        this.f7212h = 0;
        this.f7213i = Util.g;
        this.j = -9223372036854775807L;
    }

    public final void a(Sample sample) {
        Assertions.f(this.f);
        byte[] bArr = sample.f7214Y;
        int length = bArr.length;
        ParsableByteArray parsableByteArray = this.d;
        parsableByteArray.getClass();
        parsableByteArray.E(bArr, bArr.length);
        this.f.e(length, parsableByteArray);
        this.f.f(sample.X, 1, length, 0, null);
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean c(ExtractorInput extractorInput) {
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void d(ExtractorOutput extractorOutput) {
        Assertions.e(this.f7212h == 0);
        TrackOutput trackOutputTrack = extractorOutput.track(0, 3);
        this.f = trackOutputTrack;
        trackOutputTrack.b(this.f7209b);
        extractorOutput.endTracks();
        extractorOutput.e(new IndexSeekMap(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f7212h = 1;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: RuntimeException -> 0x00cb, TryCatch #0 {RuntimeException -> 0x00cb, blocks: (B:33:0x0080, B:35:0x0086, B:38:0x0091, B:39:0x00b6, B:41:0x00bc, B:44:0x00cd, B:37:0x008e), top: B:69:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008e A[Catch: RuntimeException -> 0x00cb, TryCatch #0 {RuntimeException -> 0x00cb, blocks: (B:33:0x0080, B:35:0x0086, B:38:0x0091, B:39:0x00b6, B:41:0x00bc, B:44:0x00cd, B:37:0x008e), top: B:69:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bc A[Catch: RuntimeException -> 0x00cb, LOOP:1: B:39:0x00b6->B:41:0x00bc, LOOP_END, TryCatch #0 {RuntimeException -> 0x00cb, blocks: (B:33:0x0080, B:35:0x0086, B:38:0x0091, B:39:0x00b6, B:41:0x00bc, B:44:0x00cd, B:37:0x008e), top: B:69:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0080 A[EXC_TOP_SPLITTER, PHI: r15
  0x0080: PHI (r15v3 long) = (r15v4 long), (r15v5 long) binds: [B:32:0x007e, B:29:0x007a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException, EOFException, InterruptedIOException {
        long j;
        long j2;
        SubtitleParser.OutputOptions outputOptions;
        int i2;
        int i3 = this.f7212h;
        Assertions.e((i3 == 0 || i3 == 5) ? false : true);
        if (this.f7212h == 1) {
            int iB = ((DefaultExtractorInput) extractorInput).f6741c != -1 ? Ints.b(((DefaultExtractorInput) extractorInput).f6741c) : 1024;
            if (iB > this.f7211e.length) {
                this.f7211e = new byte[iB];
            }
            this.g = 0;
            this.f7212h = 2;
        }
        int i4 = this.f7212h;
        ArrayList arrayList = this.f7210c;
        if (i4 == 2) {
            byte[] bArr = this.f7211e;
            if (bArr.length == this.g) {
                this.f7211e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f7211e;
            int i5 = this.g;
            DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            int i6 = defaultExtractorInput.read(bArr2, i5, bArr2.length - i5);
            if (i6 != -1) {
                this.g += i6;
            }
            long j3 = defaultExtractorInput.f6741c;
            if (j3 != -1) {
                j = -1;
                if (this.g == j3) {
                    try {
                        j2 = this.j;
                        if (j2 != -9223372036854775807L) {
                            outputOptions = new SubtitleParser.OutputOptions(j2, true);
                        } else {
                            outputOptions = SubtitleParser.OutputOptions.f7216c;
                        }
                        this.f7208a.a(this.f7211e, 0, this.g, outputOptions, new b(this, 0));
                        Collections.sort(arrayList);
                        this.f7213i = new long[arrayList.size()];
                        for (i2 = 0; i2 < arrayList.size(); i2++) {
                            this.f7213i[i2] = ((Sample) arrayList.get(i2)).X;
                        }
                        this.f7211e = Util.f;
                        this.f7212h = 4;
                    } catch (RuntimeException e2) {
                        throw ParserException.a(e2, "SubtitleParser failed.");
                    }
                }
            } else {
                j = -1;
            }
            if (i6 == -1) {
                j2 = this.j;
                if (j2 != -9223372036854775807L) {
                    outputOptions = new SubtitleParser.OutputOptions(j2, true);
                } else {
                    outputOptions = SubtitleParser.OutputOptions.f7216c;
                }
                this.f7208a.a(this.f7211e, 0, this.g, outputOptions, new b(this, 0));
                Collections.sort(arrayList);
                this.f7213i = new long[arrayList.size()];
                while (i2 < arrayList.size()) {
                    this.f7213i[i2] = ((Sample) arrayList.get(i2)).X;
                }
                this.f7211e = Util.f;
                this.f7212h = 4;
            }
        } else {
            j = -1;
        }
        if (this.f7212h == 3) {
            if (((DefaultExtractorInput) extractorInput).g(((DefaultExtractorInput) extractorInput).f6741c != j ? Ints.b(((DefaultExtractorInput) extractorInput).f6741c) : 1024) == -1) {
                long j4 = this.j;
                for (int iE = j4 == -9223372036854775807L ? 0 : Util.e(this.f7213i, j4, true); iE < arrayList.size(); iE++) {
                    a((Sample) arrayList.get(iE));
                }
                this.f7212h = 4;
            }
        }
        return this.f7212h == 4 ? -1 : 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        if (this.f7212h == 5) {
            return;
        }
        this.f7208a.reset();
        this.f7212h = 5;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void seek(long j, long j2) {
        int i2 = this.f7212h;
        Assertions.e((i2 == 0 || i2 == 5) ? false : true);
        this.j = j2;
        if (this.f7212h == 2) {
            this.f7212h = 1;
        }
        if (this.f7212h == 4) {
            this.f7212h = 3;
        }
    }
}
