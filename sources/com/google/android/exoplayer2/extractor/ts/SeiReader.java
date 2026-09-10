package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SeiReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TrackOutput[] f18068b;

    public SeiReader(List list) {
        this.f18067a = list;
        this.f18068b = new TrackOutput[list.size()];
    }

    public final void a(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        int i2 = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.f18068b;
            if (i2 >= trackOutputArr.length) {
                return;
            }
            trackIdGenerator.a();
            trackIdGenerator.b();
            TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 3);
            Format format = (Format) this.f18067a.get(i2);
            String str = format.m0;
            Assertions.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = format.X;
            if (str2 == null) {
                trackIdGenerator.b();
                str2 = trackIdGenerator.f18100e;
            }
            Format.Builder builder = new Format.Builder();
            builder.f17081a = str2;
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
