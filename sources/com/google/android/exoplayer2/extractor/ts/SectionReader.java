package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class SectionReader implements TsPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SectionPayloadReader f18063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f18064b = new ParsableByteArray(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18065c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18066e;
    public boolean f;

    public SectionReader(SectionPayloadReader sectionPayloadReader) {
        this.f18063a = sectionPayloadReader;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void a(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.f18063a.a(timestampAdjuster, extractorOutput, trackIdGenerator);
        this.f = true;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void b(int i2, ParsableByteArray parsableByteArray) {
        boolean z2 = (i2 & 1) != 0;
        int iU = z2 ? parsableByteArray.f18957b + parsableByteArray.u() : -1;
        if (this.f) {
            if (!z2) {
                return;
            }
            this.f = false;
            parsableByteArray.F(iU);
            this.d = 0;
        }
        while (parsableByteArray.a() > 0) {
            int i3 = this.d;
            ParsableByteArray parsableByteArray2 = this.f18064b;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iU2 = parsableByteArray.u();
                    parsableByteArray.F(parsableByteArray.f18957b - 1);
                    if (iU2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(parsableByteArray.a(), 3 - this.d);
                parsableByteArray.e(parsableByteArray2.f18956a, this.d, iMin);
                int i4 = this.d + iMin;
                this.d = i4;
                if (i4 == 3) {
                    parsableByteArray2.F(0);
                    parsableByteArray2.E(3);
                    parsableByteArray2.G(1);
                    int iU3 = parsableByteArray2.u();
                    int iU4 = parsableByteArray2.u();
                    this.f18066e = (iU3 & 128) != 0;
                    int i5 = (((iU3 & 15) << 8) | iU4) + 3;
                    this.f18065c = i5;
                    byte[] bArr = parsableByteArray2.f18956a;
                    if (bArr.length < i5) {
                        parsableByteArray2.b(Math.min(4098, Math.max(i5, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(parsableByteArray.a(), this.f18065c - this.d);
                parsableByteArray.e(parsableByteArray2.f18956a, this.d, iMin2);
                int i6 = this.d + iMin2;
                this.d = i6;
                int i7 = this.f18065c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.f18066e) {
                        byte[] bArr2 = parsableByteArray2.f18956a;
                        int i8 = Util.f18979a;
                        int i9 = -1;
                        for (int i10 = 0; i10 < i7; i10++) {
                            i9 = Util.f18985l[((i9 >>> 24) ^ (bArr2[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) & 255] ^ (i9 << 8);
                        }
                        if (i9 != 0) {
                            this.f = true;
                            return;
                        }
                        parsableByteArray2.E(this.f18065c - 4);
                    } else {
                        parsableByteArray2.E(i7);
                    }
                    parsableByteArray2.F(0);
                    this.f18063a.b(parsableByteArray2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader
    public final void seek() {
        this.f = true;
    }
}
