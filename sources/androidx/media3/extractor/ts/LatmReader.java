package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class LatmReader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f7557c;
    public final ParsableBitArray d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TrackOutput f7558e;
    public String f;
    public Format g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7560i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7561l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7562n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7563p;
    public boolean q;
    public long r;
    public int s;
    public long t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7564u;
    public String v;

    public LatmReader(String str, int i2) {
        this.f7555a = str;
        this.f7556b = i2;
        ParsableByteArray parsableByteArray = new ParsableByteArray(1024);
        this.f7557c = parsableByteArray;
        byte[] bArr = parsableByteArray.f5667a;
        this.d = new ParsableBitArray(bArr, bArr.length);
        this.f7561l = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) throws ParserException {
        int iG;
        boolean zF;
        Assertions.f(this.f7558e);
        while (parsableByteArray.a() > 0) {
            int i2 = this.f7559h;
            if (i2 != 0) {
                if (i2 != 1) {
                    ParsableByteArray parsableByteArray2 = this.f7557c;
                    ParsableBitArray parsableBitArray = this.d;
                    if (i2 == 2) {
                        int iU = ((this.k & (-225)) << 8) | parsableByteArray.u();
                        this.j = iU;
                        if (iU > parsableByteArray2.f5667a.length) {
                            parsableByteArray2.D(iU);
                            byte[] bArr = parsableByteArray2.f5667a;
                            parsableBitArray.getClass();
                            parsableBitArray.l(bArr, bArr.length);
                        }
                        this.f7560i = 0;
                        this.f7559h = 3;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(parsableByteArray.a(), this.j - this.f7560i);
                        parsableByteArray.e(parsableBitArray.f5663a, this.f7560i, iMin);
                        int i3 = this.f7560i + iMin;
                        this.f7560i = i3;
                        if (i3 == this.j) {
                            parsableBitArray.m(0);
                            if (parsableBitArray.f()) {
                                if (this.m) {
                                }
                                this.f7559h = 0;
                            } else {
                                this.m = true;
                                int iG2 = parsableBitArray.g(1);
                                int iG3 = iG2 == 1 ? parsableBitArray.g(1) : 0;
                                this.f7562n = iG3;
                                if (iG3 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG2 == 1) {
                                    parsableBitArray.g((parsableBitArray.g(2) + 1) * 8);
                                }
                                if (!parsableBitArray.f()) {
                                    throw ParserException.a(null, null);
                                }
                                this.o = parsableBitArray.g(6);
                                int iG4 = parsableBitArray.g(4);
                                int iG5 = parsableBitArray.g(3);
                                if (iG4 != 0 || iG5 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG2 == 0) {
                                    int iE = parsableBitArray.e();
                                    int iB = parsableBitArray.b();
                                    AacUtil.Config configB = AacUtil.b(parsableBitArray, true);
                                    this.v = configB.f6700c;
                                    this.s = configB.f6698a;
                                    this.f7564u = configB.f6699b;
                                    int iB2 = iB - parsableBitArray.b();
                                    parsableBitArray.m(iE);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    parsableBitArray.h(iB2, bArr2);
                                    Format.Builder builder = new Format.Builder();
                                    builder.f5423a = this.f;
                                    builder.f5429l = MimeTypes.l("audio/mp4a-latm");
                                    builder.f5428i = this.v;
                                    builder.f5434z = this.f7564u;
                                    builder.f5418A = this.s;
                                    builder.o = Collections.singletonList(bArr2);
                                    builder.d = this.f7555a;
                                    builder.f = this.f7556b;
                                    Format format = new Format(builder);
                                    if (!format.equals(this.g)) {
                                        this.g = format;
                                        this.t = 1024000000 / ((long) format.f5401B);
                                        this.f7558e.b(format);
                                    }
                                } else {
                                    int iG6 = parsableBitArray.g((parsableBitArray.g(2) + 1) * 8);
                                    int iB3 = parsableBitArray.b();
                                    AacUtil.Config configB2 = AacUtil.b(parsableBitArray, true);
                                    this.v = configB2.f6700c;
                                    this.s = configB2.f6698a;
                                    this.f7564u = configB2.f6699b;
                                    parsableBitArray.o(iG6 - (iB3 - parsableBitArray.b()));
                                }
                                int iG7 = parsableBitArray.g(3);
                                this.f7563p = iG7;
                                if (iG7 == 0) {
                                    parsableBitArray.o(8);
                                } else if (iG7 == 1) {
                                    parsableBitArray.o(9);
                                } else if (iG7 == 3 || iG7 == 4 || iG7 == 5) {
                                    parsableBitArray.o(6);
                                } else {
                                    if (iG7 != 6 && iG7 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    parsableBitArray.o(1);
                                }
                                boolean zF2 = parsableBitArray.f();
                                this.q = zF2;
                                this.r = 0L;
                                if (zF2) {
                                    if (iG2 == 1) {
                                        this.r = parsableBitArray.g((parsableBitArray.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zF = parsableBitArray.f();
                                            this.r = (this.r << 8) + ((long) parsableBitArray.g(8));
                                        } while (zF);
                                    }
                                }
                                if (parsableBitArray.f()) {
                                    parsableBitArray.o(8);
                                }
                            }
                            if (this.f7562n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.o != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.f7563p != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i4 = 0;
                            do {
                                iG = parsableBitArray.g(8);
                                i4 += iG;
                            } while (iG == 255);
                            int iE2 = parsableBitArray.e();
                            if ((iE2 & 7) == 0) {
                                parsableByteArray2.G(iE2 >> 3);
                            } else {
                                parsableBitArray.h(i4 * 8, parsableByteArray2.f5667a);
                                parsableByteArray2.G(0);
                            }
                            this.f7558e.e(i4, parsableByteArray2);
                            Assertions.e(this.f7561l != -9223372036854775807L);
                            this.f7558e.f(this.f7561l, 1, i4, 0, null);
                            this.f7561l += this.t;
                            if (this.q) {
                                parsableBitArray.o((int) this.r);
                            }
                            this.f7559h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iU2 = parsableByteArray.u();
                    if ((iU2 & 224) == 224) {
                        this.k = iU2;
                        this.f7559h = 2;
                    } else if (iU2 != 86) {
                        this.f7559h = 0;
                    }
                }
            } else if (parsableByteArray.u() == 86) {
                this.f7559h = 1;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        this.f7561l = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(boolean z2) {
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f7558e = extractorOutput.track(trackIdGenerator.d, 1);
        trackIdGenerator.b();
        this.f = trackIdGenerator.f7653e;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.f7559h = 0;
        this.f7561l = -9223372036854775807L;
        this.m = false;
    }
}
