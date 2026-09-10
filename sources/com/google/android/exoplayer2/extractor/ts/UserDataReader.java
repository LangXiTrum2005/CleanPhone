package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.CeaUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class UserDataReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TrackOutput[] f18102b;

    public UserDataReader(List list) {
        this.f18101a = list;
        this.f18102b = new TrackOutput[list.size()];
    }

    public final void a(long j, ParsableByteArray parsableByteArray) {
        if (parsableByteArray.a() < 9) {
            return;
        }
        int iG = parsableByteArray.g();
        int iG2 = parsableByteArray.g();
        int iU = parsableByteArray.u();
        if (iG == 434 && iG2 == 1195456820 && iU == 3) {
            CeaUtil.b(j, parsableByteArray, this.f18102b);
        }
    }

    public final void b(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        int i2 = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.f18102b;
            if (i2 >= trackOutputArr.length) {
                return;
            }
            trackIdGenerator.a();
            trackIdGenerator.b();
            TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 3);
            Format format = (Format) this.f18101a.get(i2);
            String str = format.m0;
            Assertions.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            Format.Builder builder = new Format.Builder();
            trackIdGenerator.b();
            builder.f17081a = trackIdGenerator.f18100e;
            builder.k = str;
            builder.d = format.e0;
            builder.f17083c = format.Z;
            builder.C = format.E0;
            builder.m = format.o0;
            trackOutputTrack.c(new Format(builder));
            trackOutputArr[i2] = trackOutputTrack;
            i2++;
        }
    }
}
