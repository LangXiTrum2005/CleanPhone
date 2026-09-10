package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class AdtsReader implements ElementaryStreamReader {
    public static final byte[] v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17920a;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17923e;
    public TrackOutput f;
    public TrackOutput g;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17926l;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17928p;
    public int r;
    public TrackOutput t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f17929u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableBitArray f17921b = new ParsableBitArray(new byte[7], 7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f17922c = new ParsableByteArray(Arrays.copyOf(v, 10));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17924h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17925i = 0;
    public int j = 256;
    public int m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17927n = -1;
    public long q = -9223372036854775807L;
    public long s = -9223372036854775807L;

    public AdtsReader(boolean z2, String str) {
        this.f17920a = z2;
        this.d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.exoplayer2.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.exoplayer2.util.ParsableBitArray] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void b(ParsableByteArray parsableByteArray) {
        ?? r10;
        int i2;
        ?? r3;
        ?? r4;
        char c2;
        int i3;
        boolean z2;
        ?? r22;
        ?? r5;
        int i4;
        ?? r23;
        ?? r24;
        ?? r25;
        ?? r2 = 0;
        int i5 = -1;
        int i6 = 2;
        ?? r6 = 1;
        this.f.getClass();
        int i7 = Util.f18979a;
        while (parsableByteArray.a() > 0) {
            int i8 = this.f17924h;
            ?? r8 = this.f17921b;
            int i9 = 4;
            int i10 = 3;
            ParsableByteArray parsableByteArray2 = this.f17922c;
            if (i8 == 0) {
                int i11 = 7;
                byte[] bArr = parsableByteArray.f18956a;
                int i12 = parsableByteArray.f18957b;
                int i13 = parsableByteArray.f18958c;
                ?? r7 = r2;
                ?? r9 = r6;
                while (true) {
                    if (i12 < i13) {
                        int i14 = i12 + 1;
                        byte b2 = bArr[i12];
                        int i15 = i10;
                        int i16 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (this.j == 512 && ((65280 | (((byte) i16) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) & 65526) == 65520) {
                            if (this.f17926l) {
                                i2 = i5;
                                r22 = r9;
                            } else {
                                int i17 = i12 - 1;
                                parsableByteArray.F(i12);
                                byte[] bArr2 = r8.f18952a;
                                if (parsableByteArray.a() < r9) {
                                    r25 = r9;
                                } else {
                                    parsableByteArray.e(bArr2, r7, r9);
                                    r8.l(i9);
                                    int iG = r8.g(r9);
                                    int i18 = this.m;
                                    if (i18 == -1 || iG == i18) {
                                        if (this.f17927n != -1) {
                                            byte[] bArr3 = r8.f18952a;
                                            if (parsableByteArray.a() < r9) {
                                                r22 = r9;
                                            } else {
                                                parsableByteArray.e(bArr3, r7, r9);
                                                r8.l(2);
                                                i4 = 4;
                                                r23 = r9;
                                                if (r8.g(4) == this.f17927n) {
                                                    r25 = r23;
                                                    parsableByteArray.F(i14);
                                                    r22 = r23;
                                                }
                                            }
                                            i2 = -1;
                                        } else {
                                            r22 = r9;
                                            i4 = 4;
                                        }
                                        byte[] bArr4 = r8.f18952a;
                                        if (parsableByteArray.a() >= i4) {
                                            parsableByteArray.e(bArr4, r7, i4);
                                            r8.l(14);
                                            int iG2 = r8.g(13);
                                            if (iG2 >= i11) {
                                                byte[] bArr5 = parsableByteArray.f18956a;
                                                int i19 = parsableByteArray.f18958c;
                                                int i20 = i17 + iG2;
                                                if (i20 >= i19) {
                                                    r25 = r22;
                                                } else {
                                                    byte b3 = bArr5[i20];
                                                    i2 = -1;
                                                    if (b3 == -1) {
                                                        int i21 = i20 + 1;
                                                        if (i21 == i19) {
                                                            r25 = r22;
                                                        } else {
                                                            byte b4 = bArr5[i21];
                                                            if (((65280 | (b4 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) & 65526) == 65520 && ((b4 & 8) >> 3) == iG) {
                                                                r25 = r22;
                                                                r24 = r22;
                                                                r24 = r22;
                                                            }
                                                        }
                                                    } else if (b3 == 73) {
                                                        int i22 = i20 + 1;
                                                        if (i22 == i19) {
                                                            r25 = r22;
                                                            r24 = r22;
                                                        } else if (bArr5[i22] == 68) {
                                                            int i23 = i20 + 2;
                                                            if (i23 == i19) {
                                                                r25 = r22;
                                                                r24 = r22;
                                                                r24 = r22;
                                                            } else if (bArr5[i23] == 51) {
                                                                r25 = r22;
                                                                r24 = r22;
                                                                r24 = r22;
                                                                r24 = r22;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i2 = -1;
                                    } else {
                                        r24 = r9;
                                        i2 = -1;
                                    }
                                    r25 = r22;
                                    r24 = r22;
                                    r24 = r22;
                                    r24 = r22;
                                    r25 = r22;
                                    r24 = r22;
                                    r24 = r22;
                                    r25 = r22;
                                    r24 = r22;
                                    r25 = r22;
                                    r24 = r22;
                                    r24 = r22;
                                    r25 = r22;
                                    r24 = r22;
                                    r4 = r24;
                                }
                                r25 = r22;
                                r25 = r23;
                                i2 = -1;
                                r24 = r25;
                                r25 = r22;
                                r24 = r22;
                                r24 = r22;
                                r24 = r22;
                                r25 = r22;
                                r24 = r22;
                                r24 = r22;
                                r25 = r22;
                                r24 = r22;
                                r25 = r22;
                                r24 = r22;
                                r24 = r22;
                                r25 = r22;
                                r24 = r22;
                                r4 = r24;
                            }
                            this.o = (b2 & 8) >> 3;
                            this.k = (b2 & 1) == 0 ? r22 : 0;
                            if (this.f17926l) {
                                r5 = r22;
                                this.f17924h = i15;
                                this.f17925i = 0;
                            } else {
                                ?? r11 = r22;
                                this.f17924h = r11 == true ? 1 : 0;
                                this.f17925i = 0;
                                r5 = r11;
                            }
                            parsableByteArray.F(i14);
                            i6 = 2;
                            r10 = 0;
                            r3 = r5;
                        } else {
                            i2 = i5;
                            r4 = r9;
                        }
                        int i24 = this.j;
                        int i25 = i24 | i16;
                        if (i25 == 329) {
                            i6 = 2;
                            c2 = 256;
                            i3 = 3;
                            z2 = false;
                            this.j = 768;
                        } else if (i25 == 511) {
                            i6 = 2;
                            c2 = 256;
                            i3 = 3;
                            z2 = false;
                            this.j = 512;
                        } else if (i25 == 836) {
                            i6 = 2;
                            c2 = 256;
                            i3 = 3;
                            z2 = false;
                            this.j = 1024;
                        } else if (i25 != 1075) {
                            c2 = 256;
                            if (i24 != 256) {
                                this.j = 256;
                                i6 = 2;
                                i3 = 3;
                                z2 = false;
                            } else {
                                i6 = 2;
                                i3 = 3;
                                z2 = false;
                            }
                            i10 = i3;
                            i11 = 7;
                            r9 = r4 == true ? 1 : 0;
                            i5 = i2;
                            r7 = z2;
                            i9 = 4;
                        } else {
                            i6 = 2;
                            this.f17924h = 2;
                            this.f17925i = 3;
                            r10 = 0;
                            this.r = 0;
                            parsableByteArray2.F(0);
                            parsableByteArray.F(i14);
                            r3 = r4;
                        }
                        i12 = i14;
                        i10 = i3;
                        i11 = 7;
                        r9 = r4 == true ? 1 : 0;
                        i5 = i2;
                        r7 = z2;
                        i9 = 4;
                    } else {
                        r10 = r7;
                        i2 = i5;
                        r3 = r9;
                        parsableByteArray.F(i12);
                    }
                    r6 = r3;
                    i5 = i2;
                    r2 = r10;
                }
            } else if (i8 != r6) {
                if (i8 == i6) {
                    byte[] bArr6 = parsableByteArray2.f18956a;
                    int iMin = Math.min(parsableByteArray.a(), 10 - this.f17925i);
                    parsableByteArray.e(bArr6, this.f17925i, iMin);
                    int i26 = this.f17925i + iMin;
                    this.f17925i = i26;
                    if (i26 == 10) {
                        this.g.e(10, parsableByteArray2);
                        parsableByteArray2.F(6);
                        TrackOutput trackOutput = this.g;
                        int iT = parsableByteArray2.t() + 10;
                        this.f17924h = 4;
                        this.f17925i = 10;
                        this.t = trackOutput;
                        this.f17929u = 0L;
                        this.r = iT;
                    }
                } else if (i8 == 3) {
                    int i27 = this.k ? 7 : 5;
                    byte[] bArr7 = r8.f18952a;
                    int iMin2 = Math.min(parsableByteArray.a(), i27 - this.f17925i);
                    parsableByteArray.e(bArr7, this.f17925i, iMin2);
                    int i28 = this.f17925i + iMin2;
                    this.f17925i = i28;
                    if (i28 == i27) {
                        r8.l(r2 == true ? 1 : 0);
                        if (this.f17928p) {
                            r8.n(10);
                        } else {
                            int iG3 = r8.g(i6) + (r6 == true ? 1 : 0);
                            if (iG3 != i6) {
                                Log.g("AdtsReader", "Detected audio object type: " + iG3 + ", but assuming AAC LC.");
                                iG3 = i6;
                            }
                            r8.n(5);
                            int iG4 = r8.g(3);
                            int i29 = this.f17927n;
                            byte b5 = (byte) (((iG3 << 3) & 248) | ((i29 >> 1) & 7));
                            byte b6 = (byte) (((iG4 << 3) & 120) | ((i29 << 7) & 128));
                            byte[] bArr8 = new byte[i6];
                            bArr8[r2 == true ? 1 : 0] = b5;
                            bArr8[r6 == true ? 1 : 0] = b6;
                            AacUtil.Config configB = AacUtil.b(new ParsableBitArray(bArr8, i6), r2);
                            Format.Builder builder = new Format.Builder();
                            builder.f17081a = this.f17923e;
                            builder.k = "audio/mp4a-latm";
                            builder.f17085h = configB.f17270c;
                            builder.x = configB.f17269b;
                            builder.y = configB.f17268a;
                            builder.m = Collections.singletonList(bArr8);
                            builder.f17083c = this.d;
                            Format format = new Format(builder);
                            this.q = 1024000000 / ((long) format.A0);
                            this.f.c(format);
                            this.f17928p = r6;
                        }
                        r8.n(4);
                        int iG5 = r8.g(13);
                        int i30 = iG5 - 7;
                        if (this.k) {
                            i30 = iG5 - 9;
                        }
                        TrackOutput trackOutput2 = this.f;
                        long j = this.q;
                        this.f17924h = 4;
                        this.f17925i = r2 == true ? 1 : 0;
                        this.t = trackOutput2;
                        this.f17929u = j;
                        this.r = i30;
                    }
                } else {
                    if (i8 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(parsableByteArray.a(), this.r - this.f17925i);
                    this.t.e(iMin3, parsableByteArray);
                    int i31 = this.f17925i + iMin3;
                    this.f17925i = i31;
                    int i32 = this.r;
                    if (i31 == i32) {
                        long j2 = this.s;
                        if (j2 != -9223372036854775807L) {
                            this.t.f(j2, 1, i32, 0, null);
                            this.s += this.f17929u;
                        }
                        this.f17924h = r2 == true ? 1 : 0;
                        this.f17925i = r2 == true ? 1 : 0;
                        this.j = 256;
                    }
                }
            } else if (parsableByteArray.a() != 0) {
                r8.f18952a[r2 == true ? 1 : 0] = parsableByteArray.f18956a[parsableByteArray.f18957b];
                r8.l(i6);
                int iG6 = r8.g(4);
                int i33 = this.f17927n;
                if (i33 == i5 || iG6 == i33) {
                    if (!this.f17926l) {
                        this.f17926l = r6;
                        this.m = this.o;
                        this.f17927n = iG6;
                    }
                    this.f17924h = 3;
                    this.f17925i = r2 == true ? 1 : 0;
                } else {
                    this.f17926l = r2;
                    this.f17924h = r2 == true ? 1 : 0;
                    this.f17925i = r2 == true ? 1 : 0;
                    this.j = 256;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        if (j != -9223372036854775807L) {
            this.s = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void d(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f17923e = trackIdGenerator.f18100e;
        trackIdGenerator.b();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 1);
        this.f = trackOutputTrack;
        this.t = trackOutputTrack;
        if (!this.f17920a) {
            this.g = new DummyTrackOutput();
            return;
        }
        trackIdGenerator.a();
        trackIdGenerator.b();
        TrackOutput trackOutputTrack2 = extractorOutput.track(trackIdGenerator.d, 5);
        this.g = trackOutputTrack2;
        Format.Builder builder = new Format.Builder();
        trackIdGenerator.b();
        builder.f17081a = trackIdGenerator.f18100e;
        builder.k = "application/id3";
        trackOutputTrack2.c(new Format(builder));
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.s = -9223372036854775807L;
        this.f17926l = false;
        this.f17924h = 0;
        this.f17925i = 0;
        this.j = 256;
    }
}
