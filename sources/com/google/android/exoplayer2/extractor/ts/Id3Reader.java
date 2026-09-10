package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes3.dex */
public final class Id3Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TrackOutput f18012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18013c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18014e;
    public int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f18011a = new ParsableByteArray(10);
    public long d = -9223372036854775807L;

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void b(ParsableByteArray parsableByteArray) {
        Assertions.e(this.f18012b);
        if (this.f18013c) {
            int iA = parsableByteArray.a();
            int i2 = this.f;
            if (i2 < 10) {
                int iMin = Math.min(iA, 10 - i2);
                byte[] bArr = parsableByteArray.f18956a;
                int i3 = parsableByteArray.f18957b;
                ParsableByteArray parsableByteArray2 = this.f18011a;
                System.arraycopy(bArr, i3, parsableByteArray2.f18956a, this.f, iMin);
                if (this.f + iMin == 10) {
                    parsableByteArray2.F(0);
                    if (73 != parsableByteArray2.u() || 68 != parsableByteArray2.u() || 51 != parsableByteArray2.u()) {
                        Log.g("Id3Reader", "Discarding invalid ID3 tag");
                        this.f18013c = false;
                        return;
                    } else {
                        parsableByteArray2.G(3);
                        this.f18014e = parsableByteArray2.t() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f18014e - this.f);
            this.f18012b.e(iMin2, parsableByteArray);
            this.f += iMin2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f18013c = true;
        if (j != -9223372036854775807L) {
            this.d = j;
        }
        this.f18014e = 0;
        this.f = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void d(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 5);
        this.f18012b = trackOutputTrack;
        Format.Builder builder = new Format.Builder();
        trackIdGenerator.b();
        builder.f17081a = trackIdGenerator.f18100e;
        builder.k = "application/id3";
        trackOutputTrack.c(new Format(builder));
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
        int i2;
        Assertions.e(this.f18012b);
        if (this.f18013c && (i2 = this.f18014e) != 0 && this.f == i2) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                this.f18012b.f(j, 1, i2, 0, null);
            }
            this.f18013c = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.f18013c = false;
        this.d = -9223372036854775807L;
    }
}
