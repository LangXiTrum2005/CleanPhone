package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;

/* JADX INFO: loaded from: classes.dex */
public final class SectionReader implements TsPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SectionPayloadReader f7616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f7617b = new ParsableByteArray(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7618c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7619e;
    public boolean f;

    public SectionReader(SectionPayloadReader sectionPayloadReader) {
        this.f7616a = sectionPayloadReader;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void a(int i2, ParsableByteArray parsableByteArray) {
        int iU;
        boolean z2 = (i2 & 1) != 0;
        if (z2) {
            iU = parsableByteArray.f5668b + parsableByteArray.u();
        } else {
            iU = -1;
        }
        if (this.f) {
            if (!z2) {
                return;
            }
            this.f = false;
            parsableByteArray.G(iU);
            this.d = 0;
        }
        while (parsableByteArray.a() > 0) {
            int i3 = this.d;
            ParsableByteArray parsableByteArray2 = this.f7617b;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iU2 = parsableByteArray.u();
                    parsableByteArray.G(parsableByteArray.f5668b - 1);
                    if (iU2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(parsableByteArray.a(), 3 - this.d);
                parsableByteArray.e(parsableByteArray2.f5667a, this.d, iMin);
                int i4 = this.d + iMin;
                this.d = i4;
                if (i4 == 3) {
                    parsableByteArray2.G(0);
                    parsableByteArray2.F(3);
                    parsableByteArray2.H(1);
                    int iU3 = parsableByteArray2.u();
                    int iU4 = parsableByteArray2.u();
                    this.f7619e = (iU3 & 128) != 0;
                    int i5 = (((iU3 & 15) << 8) | iU4) + 3;
                    this.f7618c = i5;
                    byte[] bArr = parsableByteArray2.f5667a;
                    if (bArr.length < i5) {
                        parsableByteArray2.b(Math.min(4098, Math.max(i5, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(parsableByteArray.a(), this.f7618c - this.d);
                parsableByteArray.e(parsableByteArray2.f5667a, this.d, iMin2);
                int i6 = this.d + iMin2;
                this.d = i6;
                int i7 = this.f7618c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.f7619e) {
                        parsableByteArray2.F(i7);
                    } else {
                        if (Util.l(0, i7, -1, parsableByteArray2.f5667a) != 0) {
                            this.f = true;
                            return;
                        }
                        parsableByteArray2.F(this.f7618c - 4);
                    }
                    parsableByteArray2.G(0);
                    this.f7616a.a(parsableByteArray2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void b(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.f7616a.b(timestampAdjuster, extractorOutput, trackIdGenerator);
        this.f = true;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public final void seek() {
        this.f = true;
    }
}
