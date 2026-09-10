package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes.dex */
public final class Ac4Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableBitArray f7443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f7444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7445c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7446e;
    public TrackOutput f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7448i;
    public long j;
    public Format k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7449l;
    public long m;

    public Ac4Reader(String str, int i2) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[16], 16);
        this.f7443a = parsableBitArray;
        this.f7444b = new ParsableByteArray(parsableBitArray.f5663a);
        this.g = 0;
        this.f7447h = 0;
        this.f7448i = false;
        this.m = -9223372036854775807L;
        this.f7445c = str;
        this.d = i2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) {
        Assertions.f(this.f);
        while (parsableByteArray.a() > 0) {
            int i2 = this.g;
            ParsableByteArray parsableByteArray2 = this.f7444b;
            if (i2 == 0) {
                while (parsableByteArray.a() > 0) {
                    if (this.f7448i) {
                        int iU = parsableByteArray.u();
                        this.f7448i = iU == 172;
                        if (iU == 64 || iU == 65) {
                            boolean z2 = iU == 65;
                            this.g = 1;
                            byte[] bArr = parsableByteArray2.f5667a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z2 ? 65 : 64);
                            this.f7447h = 2;
                            break;
                        }
                    } else {
                        this.f7448i = parsableByteArray.u() == 172;
                    }
                }
            } else if (i2 == 1) {
                byte[] bArr2 = parsableByteArray2.f5667a;
                int iMin = Math.min(parsableByteArray.a(), 16 - this.f7447h);
                parsableByteArray.e(bArr2, this.f7447h, iMin);
                int i3 = this.f7447h + iMin;
                this.f7447h = i3;
                if (i3 == 16) {
                    ParsableBitArray parsableBitArray = this.f7443a;
                    parsableBitArray.m(0);
                    Ac4Util.SyncFrameInfo syncFrameInfoB = Ac4Util.b(parsableBitArray);
                    Format format = this.k;
                    int i4 = syncFrameInfoB.f6706a;
                    if (format == null || 2 != format.f5400A || i4 != format.f5401B || !"audio/ac4".equals(format.m)) {
                        Format.Builder builder = new Format.Builder();
                        builder.f5423a = this.f7446e;
                        builder.f5429l = MimeTypes.l("audio/ac4");
                        builder.f5434z = 2;
                        builder.f5418A = i4;
                        builder.d = this.f7445c;
                        builder.f = this.d;
                        Format format2 = new Format(builder);
                        this.k = format2;
                        this.f.b(format2);
                    }
                    this.f7449l = syncFrameInfoB.f6707b;
                    this.j = (((long) syncFrameInfoB.f6708c) * 1000000) / ((long) this.k.f5401B);
                    parsableByteArray2.G(0);
                    this.f.e(16, parsableByteArray2);
                    this.g = 2;
                }
            } else if (i2 == 2) {
                int iMin2 = Math.min(parsableByteArray.a(), this.f7449l - this.f7447h);
                this.f.e(iMin2, parsableByteArray);
                int i5 = this.f7447h + iMin2;
                this.f7447h = i5;
                if (i5 == this.f7449l) {
                    Assertions.e(this.m != -9223372036854775807L);
                    this.f.f(this.m, 1, this.f7449l, 0, null);
                    this.m += this.j;
                    this.g = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        this.m = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(boolean z2) {
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f7446e = trackIdGenerator.f7653e;
        trackIdGenerator.b();
        this.f = extractorOutput.track(trackIdGenerator.d, 1);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.g = 0;
        this.f7447h = 0;
        this.f7448i = false;
        this.m = -9223372036854775807L;
    }
}
