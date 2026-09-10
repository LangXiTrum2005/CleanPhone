package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DvbSubtitleReader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TrackOutput[] f17938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17939c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17940e;
    public long f = -9223372036854775807L;

    public DvbSubtitleReader(List list) {
        this.f17937a = list;
        this.f17938b = new TrackOutput[list.size()];
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void b(ParsableByteArray parsableByteArray) {
        boolean z2;
        boolean z3;
        if (this.f17939c) {
            if (this.d == 2) {
                if (parsableByteArray.a() == 0) {
                    z3 = false;
                } else {
                    if (parsableByteArray.u() != 32) {
                        this.f17939c = false;
                    }
                    this.d--;
                    z3 = this.f17939c;
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
                        this.f17939c = false;
                    }
                    this.d--;
                    z2 = this.f17939c;
                }
                if (!z2) {
                    return;
                }
            }
            int i2 = parsableByteArray.f18957b;
            int iA = parsableByteArray.a();
            for (TrackOutput trackOutput : this.f17938b) {
                parsableByteArray.F(i2);
                trackOutput.e(iA, parsableByteArray);
            }
            this.f17940e += iA;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f17939c = true;
        if (j != -9223372036854775807L) {
            this.f = j;
        }
        this.f17940e = 0;
        this.d = 2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void d(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        int i2 = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.f17938b;
            if (i2 >= trackOutputArr.length) {
                return;
            }
            TsPayloadReader.DvbSubtitleInfo dvbSubtitleInfo = (TsPayloadReader.DvbSubtitleInfo) this.f17937a.get(i2);
            trackIdGenerator.a();
            trackIdGenerator.b();
            TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 3);
            Format.Builder builder = new Format.Builder();
            trackIdGenerator.b();
            builder.f17081a = trackIdGenerator.f18100e;
            builder.k = "application/dvbsubs";
            builder.m = Collections.singletonList(dvbSubtitleInfo.f18093b);
            builder.f17083c = dvbSubtitleInfo.f18092a;
            trackOutputTrack.c(new Format(builder));
            trackOutputArr[i2] = trackOutputTrack;
            i2++;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
        if (this.f17939c) {
            if (this.f != -9223372036854775807L) {
                for (TrackOutput trackOutput : this.f17938b) {
                    trackOutput.f(this.f, 1, this.f17940e, 0, null);
                }
            }
            this.f17939c = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.f17939c = false;
        this.f = -9223372036854775807L;
    }
}
