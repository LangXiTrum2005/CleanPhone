package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes.dex */
public final class Id3Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TrackOutput f7552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7553c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7554e;
    public int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f7551a = new ParsableByteArray(10);
    public long d = -9223372036854775807L;

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) {
        Assertions.f(this.f7552b);
        if (this.f7553c) {
            int iA = parsableByteArray.a();
            int i2 = this.f;
            if (i2 < 10) {
                int iMin = Math.min(iA, 10 - i2);
                byte[] bArr = parsableByteArray.f5667a;
                int i3 = parsableByteArray.f5668b;
                ParsableByteArray parsableByteArray2 = this.f7551a;
                System.arraycopy(bArr, i3, parsableByteArray2.f5667a, this.f, iMin);
                if (this.f + iMin == 10) {
                    parsableByteArray2.G(0);
                    if (73 != parsableByteArray2.u() || 68 != parsableByteArray2.u() || 51 != parsableByteArray2.u()) {
                        Log.g("Id3Reader", "Discarding invalid ID3 tag");
                        this.f7553c = false;
                        return;
                    } else {
                        parsableByteArray2.H(3);
                        this.f7554e = parsableByteArray2.t() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f7554e - this.f);
            this.f7552b.e(iMin2, parsableByteArray);
            this.f += iMin2;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f7553c = true;
        this.d = j;
        this.f7554e = 0;
        this.f = 0;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(boolean z2) {
        int i2;
        Assertions.f(this.f7552b);
        if (this.f7553c && (i2 = this.f7554e) != 0 && this.f == i2) {
            Assertions.e(this.d != -9223372036854775807L);
            this.f7552b.f(this.d, 1, this.f7554e, 0, null);
            this.f7553c = false;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 5);
        this.f7552b = trackOutputTrack;
        Format.Builder builder = new Format.Builder();
        trackIdGenerator.b();
        builder.f5423a = trackIdGenerator.f7653e;
        builder.f5429l = MimeTypes.l("application/id3");
        trackOutputTrack.b(new Format(builder));
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.f7553c = false;
        this.d = -9223372036854775807L;
    }
}
