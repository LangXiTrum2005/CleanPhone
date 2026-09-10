package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DvbSubtitleReader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TrackOutput[] f7478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7479c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7480e;
    public long f = -9223372036854775807L;

    public DvbSubtitleReader(List list) {
        this.f7477a = list;
        this.f7478b = new TrackOutput[list.size()];
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) {
        boolean z2;
        boolean z3;
        if (this.f7479c) {
            if (this.d == 2) {
                if (parsableByteArray.a() == 0) {
                    z3 = false;
                } else {
                    if (parsableByteArray.u() != 32) {
                        this.f7479c = false;
                    }
                    this.d--;
                    z3 = this.f7479c;
                }
                if (!z3) {
                    return;
                }
            }
            if (this.d == 1) {
                if (parsableByteArray.a() == 0) {
                    z2 = false;
                } else {
                    if (parsableByteArray.u() != 0) {
                        this.f7479c = false;
                    }
                    this.d--;
                    z2 = this.f7479c;
                }
                if (!z2) {
                    return;
                }
            }
            int i2 = parsableByteArray.f5668b;
            int iA = parsableByteArray.a();
            for (TrackOutput trackOutput : this.f7478b) {
                parsableByteArray.G(i2);
                trackOutput.e(iA, parsableByteArray);
            }
            this.f7480e += iA;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f7479c = true;
        this.f = j;
        this.f7480e = 0;
        this.d = 2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(boolean z2) {
        if (this.f7479c) {
            Assertions.e(this.f != -9223372036854775807L);
            for (TrackOutput trackOutput : this.f7478b) {
                trackOutput.f(this.f, 1, this.f7480e, 0, null);
            }
            this.f7479c = false;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        int i2 = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.f7478b;
            if (i2 >= trackOutputArr.length) {
                return;
            }
            TsPayloadReader.DvbSubtitleInfo dvbSubtitleInfo = (TsPayloadReader.DvbSubtitleInfo) this.f7477a.get(i2);
            trackIdGenerator.a();
            trackIdGenerator.b();
            TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 3);
            Format.Builder builder = new Format.Builder();
            trackIdGenerator.b();
            builder.f5423a = trackIdGenerator.f7653e;
            builder.f5429l = MimeTypes.l("application/dvbsubs");
            builder.o = Collections.singletonList(dvbSubtitleInfo.f7646b);
            builder.d = dvbSubtitleInfo.f7645a;
            trackOutputTrack.b(new Format(builder));
            trackOutputArr[i2] = trackOutputTrack;
            i2++;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.f7479c = false;
        this.f = -9223372036854775807L;
    }
}
