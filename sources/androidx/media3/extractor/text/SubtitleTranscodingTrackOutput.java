package androidx.media3.extractor.text;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.TrackOutput;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
final class SubtitleTranscodingTrackOutput implements TrackOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackOutput f7223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SubtitleParser.Factory f7224b;
    public SubtitleParser g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Format f7227h;
    public int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7226e = 0;
    public byte[] f = Util.f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f7225c = new ParsableByteArray();

    public SubtitleTranscodingTrackOutput(TrackOutput trackOutput, SubtitleParser.Factory factory) {
        this.f7223a = trackOutput;
        this.f7224b = factory;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void a(ParsableByteArray parsableByteArray, int i2, int i3) {
        if (this.g == null) {
            this.f7223a.a(parsableByteArray, i2, i3);
            return;
        }
        g(i2);
        parsableByteArray.e(this.f, this.f7226e, i2);
        this.f7226e += i2;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void b(Format format) {
        format.m.getClass();
        String str = format.m;
        Assertions.b(MimeTypes.g(str) == 3);
        boolean zEquals = format.equals(this.f7227h);
        SubtitleParser.Factory factory = this.f7224b;
        if (!zEquals) {
            this.f7227h = format;
            this.g = factory.a(format) ? factory.c(format) : null;
        }
        SubtitleParser subtitleParser = this.g;
        TrackOutput trackOutput = this.f7223a;
        if (subtitleParser == null) {
            trackOutput.b(format);
            return;
        }
        Format.Builder builderA = format.a();
        builderA.f5429l = MimeTypes.l("application/x-media3-cues");
        builderA.f5428i = str;
        builderA.q = Long.MAX_VALUE;
        builderA.f5421F = factory.b(format);
        trackOutput.b(new Format(builderA));
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int d(DataReader dataReader, int i2, boolean z2) throws EOFException {
        if (this.g == null) {
            return this.f7223a.d(dataReader, i2, z2);
        }
        g(i2);
        int i3 = dataReader.read(this.f, this.f7226e, i2);
        if (i3 != -1) {
            this.f7226e += i3;
            return i3;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void f(final long j, final int i2, int i3, int i4, TrackOutput.CryptoData cryptoData) {
        if (this.g == null) {
            this.f7223a.f(j, i2, i3, i4, cryptoData);
            return;
        }
        Assertions.a("DRM on subtitles is not supported", cryptoData == null);
        int i5 = (this.f7226e - i4) - i3;
        this.g.a(this.f, i5, i3, SubtitleParser.OutputOptions.f7216c, new Consumer() { // from class: androidx.media3.extractor.text.c
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput = this.X;
                Assertions.f(subtitleTranscodingTrackOutput.f7227h);
                byte[] bArrA = CueEncoder.a(cuesWithTiming.f7206c, cuesWithTiming.f7204a);
                ParsableByteArray parsableByteArray = subtitleTranscodingTrackOutput.f7225c;
                parsableByteArray.getClass();
                parsableByteArray.E(bArrA, bArrA.length);
                subtitleTranscodingTrackOutput.f7223a.e(bArrA.length, parsableByteArray);
                long j2 = cuesWithTiming.f7205b;
                long j3 = j;
                if (j2 == -9223372036854775807L) {
                    Assertions.e(subtitleTranscodingTrackOutput.f7227h.r == Long.MAX_VALUE);
                } else {
                    long j4 = subtitleTranscodingTrackOutput.f7227h.r;
                    j3 = j4 == Long.MAX_VALUE ? j3 + j2 : j2 + j4;
                }
                subtitleTranscodingTrackOutput.f7223a.f(j3, i2, bArrA.length, 0, null);
            }
        });
        int i6 = i5 + i3;
        this.d = i6;
        if (i6 == this.f7226e) {
            this.d = 0;
            this.f7226e = 0;
        }
    }

    public final void g(int i2) {
        int length = this.f.length;
        int i3 = this.f7226e;
        if (length - i3 >= i2) {
            return;
        }
        int i4 = i3 - this.d;
        int iMax = Math.max(i4 * 2, i2 + i4);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i4);
        this.d = 0;
        this.f7226e = i4;
        this.f = bArr2;
    }
}
