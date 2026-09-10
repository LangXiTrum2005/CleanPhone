package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes.dex */
public final class PassthroughSectionPayloadReader implements SectionPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Format f7589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TimestampAdjuster f7590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TrackOutput f7591c;

    public PassthroughSectionPayloadReader(String str) {
        Format.Builder builder = new Format.Builder();
        builder.f5429l = MimeTypes.l(str);
        this.f7589a = new Format(builder);
    }

    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    public final void a(ParsableByteArray parsableByteArray) {
        long jD;
        long j;
        Assertions.f(this.f7590b);
        int i2 = Util.f5683a;
        TimestampAdjuster timestampAdjuster = this.f7590b;
        synchronized (timestampAdjuster) {
            try {
                long j2 = timestampAdjuster.f5682c;
                jD = j2 != -9223372036854775807L ? j2 + timestampAdjuster.f5681b : timestampAdjuster.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        TimestampAdjuster timestampAdjuster2 = this.f7590b;
        synchronized (timestampAdjuster2) {
            j = timestampAdjuster2.f5681b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        Format format = this.f7589a;
        if (j != format.r) {
            Format.Builder builderA = format.a();
            builderA.q = j;
            Format format2 = new Format(builderA);
            this.f7589a = format2;
            this.f7591c.b(format2);
        }
        int iA = parsableByteArray.a();
        this.f7591c.e(iA, parsableByteArray);
        this.f7591c.f(jD, 1, iA, 0, null);
    }

    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    public final void b(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.f7590b = timestampAdjuster;
        trackIdGenerator.a();
        trackIdGenerator.b();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 5);
        this.f7591c = trackOutputTrack;
        trackOutputTrack.b(this.f7589a);
    }
}
