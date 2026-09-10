package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class LatmReader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f18016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableBitArray f18017c;
    public TrackOutput d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18018e;
    public Format f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18020i;
    public int j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18021l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18022n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f18023p;
    public long q;
    public int r;
    public long s;
    public int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f18024u;

    public LatmReader(String str) {
        this.f18015a = str;
        ParsableByteArray parsableByteArray = new ParsableByteArray(1024);
        this.f18016b = parsableByteArray;
        byte[] bArr = parsableByteArray.f18956a;
        this.f18017c = new ParsableBitArray(bArr, bArr.length);
        this.k = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void b(ParsableByteArray parsableByteArray) throws ParserException {
        int iG;
        boolean zF;
        Assertions.e(this.d);
        while (parsableByteArray.a() > 0) {
            int i2 = this.g;
            if (i2 != 0) {
                if (i2 != 1) {
                    ParsableByteArray parsableByteArray2 = this.f18016b;
                    ParsableBitArray parsableBitArray = this.f18017c;
                    if (i2 == 2) {
                        int iU = ((this.j & (-225)) << 8) | parsableByteArray.u();
                        this.f18020i = iU;
                        if (iU > parsableByteArray2.f18956a.length) {
                            parsableByteArray2.C(iU);
                            byte[] bArr = parsableByteArray2.f18956a;
                            parsableBitArray.getClass();
                            parsableBitArray.k(bArr, bArr.length);
                        }
                        this.f18019h = 0;
                        this.g = 3;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(parsableByteArray.a(), this.f18020i - this.f18019h);
                        parsableByteArray.e(parsableBitArray.f18952a, this.f18019h, iMin);
                        int i3 = this.f18019h + iMin;
                        this.f18019h = i3;
                        if (i3 == this.f18020i) {
                            parsableBitArray.l(0);
                            if (parsableBitArray.f()) {
                                if (this.f18021l) {
                                }
                                this.g = 0;
                            } else {
                                this.f18021l = true;
                                int iG2 = parsableBitArray.g(1);
                                int iG3 = iG2 == 1 ? parsableBitArray.g(1) : 0;
                                this.m = iG3;
                                if (iG3 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG2 == 1) {
                                    parsableBitArray.g((parsableBitArray.g(2) + 1) * 8);
                                }
                                if (!parsableBitArray.f()) {
                                    throw ParserException.a(null, null);
                                }
                                this.f18022n = parsableBitArray.g(6);
                                int iG4 = parsableBitArray.g(4);
                                int iG5 = parsableBitArray.g(3);
                                if (iG4 != 0 || iG5 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG2 == 0) {
                                    int iE = parsableBitArray.e();
                                    int iB = parsableBitArray.b();
                                    AacUtil.Config configB = AacUtil.b(parsableBitArray, true);
                                    this.f18024u = configB.f17270c;
                                    this.r = configB.f17268a;
                                    this.t = configB.f17269b;
                                    int iB2 = iB - parsableBitArray.b();
                                    parsableBitArray.l(iE);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    parsableBitArray.h(iB2, bArr2);
                                    Format.Builder builder = new Format.Builder();
                                    builder.f17081a = this.f18018e;
                                    builder.k = "audio/mp4a-latm";
                                    builder.f17085h = this.f18024u;
                                    builder.x = this.t;
                                    builder.y = this.r;
                                    builder.m = Collections.singletonList(bArr2);
                                    builder.f17083c = this.f18015a;
                                    Format format = new Format(builder);
                                    if (!format.equals(this.f)) {
                                        this.f = format;
                                        this.s = 1024000000 / ((long) format.A0);
                                        this.d.c(format);
                                    }
                                } else {
                                    int iG6 = parsableBitArray.g((parsableBitArray.g(2) + 1) * 8);
                                    int iB3 = parsableBitArray.b();
                                    AacUtil.Config configB2 = AacUtil.b(parsableBitArray, true);
                                    this.f18024u = configB2.f17270c;
                                    this.r = configB2.f17268a;
                                    this.t = configB2.f17269b;
                                    parsableBitArray.n(iG6 - (iB3 - parsableBitArray.b()));
                                }
                                int iG7 = parsableBitArray.g(3);
                                this.o = iG7;
                                if (iG7 == 0) {
                                    parsableBitArray.n(8);
                                } else if (iG7 == 1) {
                                    parsableBitArray.n(9);
                                } else if (iG7 == 3 || iG7 == 4 || iG7 == 5) {
                                    parsableBitArray.n(6);
                                } else {
                                    if (iG7 != 6 && iG7 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    parsableBitArray.n(1);
                                }
                                boolean zF2 = parsableBitArray.f();
                                this.f18023p = zF2;
                                this.q = 0L;
                                if (zF2) {
                                    if (iG2 == 1) {
                                        this.q = parsableBitArray.g((parsableBitArray.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zF = parsableBitArray.f();
                                            this.q = (this.q << 8) + ((long) parsableBitArray.g(8));
                                        } while (zF);
                                    }
                                }
                                if (parsableBitArray.f()) {
                                    parsableBitArray.n(8);
                                }
                            }
                            if (this.m != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.f18022n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.o != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i4 = 0;
                            do {
                                iG = parsableBitArray.g(8);
                                i4 += iG;
                            } while (iG == 255);
                            int iE2 = parsableBitArray.e();
                            if ((iE2 & 7) == 0) {
                                parsableByteArray2.F(iE2 >> 3);
                            } else {
                                parsableBitArray.h(i4 * 8, parsableByteArray2.f18956a);
                                parsableByteArray2.F(0);
                            }
                            this.d.e(i4, parsableByteArray2);
                            long j = this.k;
                            if (j != -9223372036854775807L) {
                                this.d.f(j, 1, i4, 0, null);
                                this.k += this.s;
                            }
                            if (this.f18023p) {
                                parsableBitArray.n((int) this.q);
                            }
                            this.g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iU2 = parsableByteArray.u();
                    if ((iU2 & 224) == 224) {
                        this.j = iU2;
                        this.g = 2;
                    } else if (iU2 != 86) {
                        this.g = 0;
                    }
                }
            } else if (parsableByteArray.u() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void d(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.d = extractorOutput.track(trackIdGenerator.d, 1);
        trackIdGenerator.b();
        this.f18018e = trackIdGenerator.f18100e;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.f18021l = false;
    }
}
