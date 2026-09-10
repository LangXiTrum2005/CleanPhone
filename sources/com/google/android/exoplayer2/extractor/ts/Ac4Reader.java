package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes3.dex */
public final class Ac4Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableBitArray f17907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f17908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17909c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TrackOutput f17910e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17912i;
    public Format j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17913l;

    public Ac4Reader(String str) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[16], 16);
        this.f17907a = parsableBitArray;
        this.f17908b = new ParsableByteArray(parsableBitArray.f18952a);
        this.f = 0;
        this.g = 0;
        this.f17911h = false;
        this.f17913l = -9223372036854775807L;
        this.f17909c = str;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void b(ParsableByteArray parsableByteArray) {
        Assertions.e(this.f17910e);
        while (parsableByteArray.a() > 0) {
            int i2 = this.f;
            ParsableByteArray parsableByteArray2 = this.f17908b;
            if (i2 == 0) {
                while (parsableByteArray.a() > 0) {
                    if (this.f17911h) {
                        int iU = parsableByteArray.u();
                        this.f17911h = iU == 172;
                        if (iU == 64 || iU == 65) {
                            boolean z2 = iU == 65;
                            this.f = 1;
                            byte[] bArr = parsableByteArray2.f18956a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z2 ? 65 : 64);
                            this.g = 2;
                            break;
                        }
                    } else {
                        this.f17911h = parsableByteArray.u() == 172;
                    }
                }
            } else if (i2 == 1) {
                byte[] bArr2 = parsableByteArray2.f18956a;
                int iMin = Math.min(parsableByteArray.a(), 16 - this.g);
                parsableByteArray.e(bArr2, this.g, iMin);
                int i3 = this.g + iMin;
                this.g = i3;
                if (i3 == 16) {
                    ParsableBitArray parsableBitArray = this.f17907a;
                    parsableBitArray.l(0);
                    Ac4Util.SyncFrameInfo syncFrameInfoB = Ac4Util.b(parsableBitArray);
                    Format format = this.j;
                    int i4 = syncFrameInfoB.f17276a;
                    if (format == null || 2 != format.z0 || i4 != format.A0 || !"audio/ac4".equals(format.m0)) {
                        Format.Builder builder = new Format.Builder();
                        builder.f17081a = this.d;
                        builder.k = "audio/ac4";
                        builder.x = 2;
                        builder.y = i4;
                        builder.f17083c = this.f17909c;
                        Format format2 = new Format(builder);
                        this.j = format2;
                        this.f17910e.c(format2);
                    }
                    this.k = syncFrameInfoB.f17277b;
                    this.f17912i = (((long) syncFrameInfoB.f17278c) * 1000000) / ((long) this.j.A0);
                    parsableByteArray2.F(0);
                    this.f17910e.e(16, parsableByteArray2);
                    this.f = 2;
                }
            } else if (i2 == 2) {
                int iMin2 = Math.min(parsableByteArray.a(), this.k - this.g);
                this.f17910e.e(iMin2, parsableByteArray);
                int i5 = this.g + iMin2;
                this.g = i5;
                int i6 = this.k;
                if (i5 == i6) {
                    long j = this.f17913l;
                    if (j != -9223372036854775807L) {
                        this.f17910e.f(j, 1, i6, 0, null);
                        this.f17913l += this.f17912i;
                    }
                    this.f = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        if (j != -9223372036854775807L) {
            this.f17913l = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void d(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.d = trackIdGenerator.f18100e;
        trackIdGenerator.b();
        this.f17910e = extractorOutput.track(trackIdGenerator.d, 1);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.f = 0;
        this.g = 0;
        this.f17911h = false;
        this.f17913l = -9223372036854775807L;
    }
}
