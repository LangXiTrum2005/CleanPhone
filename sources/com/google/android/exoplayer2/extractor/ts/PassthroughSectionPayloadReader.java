package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class PassthroughSectionPayloadReader implements SectionPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Format f18036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TimestampAdjuster f18037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TrackOutput f18038c;

    public PassthroughSectionPayloadReader(String str) {
        Format.Builder builder = new Format.Builder();
        builder.k = str;
        this.f18036a = new Format(builder);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
    public final void a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.f18037b = timestampAdjuster;
        trackIdGenerator.a();
        trackIdGenerator.b();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 5);
        this.f18038c = trackOutputTrack;
        trackOutputTrack.c(this.f18036a);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
    public final void b(ParsableByteArray parsableByteArray) {
        long jC;
        long j;
        Assertions.e(this.f18037b);
        int i2 = Util.f18979a;
        TimestampAdjuster timestampAdjuster = this.f18037b;
        synchronized (timestampAdjuster) {
            try {
                long j2 = timestampAdjuster.f18978c;
                jC = j2 != -9223372036854775807L ? j2 + timestampAdjuster.f18977b : timestampAdjuster.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        TimestampAdjuster timestampAdjuster2 = this.f18037b;
        synchronized (timestampAdjuster2) {
            j = timestampAdjuster2.f18977b;
        }
        if (jC == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        Format format = this.f18036a;
        if (j != format.q0) {
            Format.Builder builderA = format.a();
            builderA.o = j;
            Format format2 = new Format(builderA);
            this.f18036a = format2;
            this.f18038c.c(format2);
        }
        int iA = parsableByteArray.a();
        this.f18038c.e(iA, parsableByteArray);
        this.f18038c.f(jC, 1, iA, 0, null);
    }
}
