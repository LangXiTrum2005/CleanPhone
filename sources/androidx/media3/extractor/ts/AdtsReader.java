package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class AdtsReader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f7456w = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7457a;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7460e;
    public String f;
    public TrackOutput g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TrackOutput f7461h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7463l;
    public boolean m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7465p;
    public boolean q;
    public int s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TrackOutput f7466u;
    public long v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableBitArray f7458b = new ParsableBitArray(new byte[7], 7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f7459c = new ParsableByteArray(Arrays.copyOf(f7456w, 10));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7462i = 0;
    public int j = 0;
    public int k = 256;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7464n = -1;
    public int o = -1;
    public long r = -9223372036854775807L;
    public long t = -9223372036854775807L;

    public AdtsReader(int i2, String str, boolean z2) {
        this.f7457a = z2;
        this.d = str;
        this.f7460e = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
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
    /* JADX WARN: Type inference failed for: r24v0, types: [androidx.media3.common.util.ParsableByteArray] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v27 */
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
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.media3.common.util.ParsableBitArray] */
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
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) throws ParserException {
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
        this.g.getClass();
        int i7 = Util.f5683a;
        while (parsableByteArray.a() > 0) {
            int i8 = this.f7462i;
            ?? r8 = this.f7458b;
            int i9 = 4;
            int i10 = 3;
            ParsableByteArray parsableByteArray2 = this.f7459c;
            if (i8 == 0) {
                int i11 = 7;
                byte[] bArr = parsableByteArray.f5667a;
                int i12 = parsableByteArray.f5668b;
                int i13 = parsableByteArray.f5669c;
                ?? r7 = r2;
                ?? r9 = r6;
                while (true) {
                    if (i12 < i13) {
                        int i14 = i12 + 1;
                        byte b2 = bArr[i12];
                        int i15 = i10;
                        int i16 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (this.k == 512 && ((65280 | (((byte) i16) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) & 65526) == 65520) {
                            if (this.m) {
                                i2 = i5;
                                r22 = r9;
                            } else {
                                int i17 = i12 - 1;
                                parsableByteArray.G(i12);
                                byte[] bArr2 = r8.f5663a;
                                if (parsableByteArray.a() < r9) {
                                    r25 = r9;
                                } else {
                                    parsableByteArray.e(bArr2, r7, r9);
                                    r8.m(i9);
                                    int iG = r8.g(r9);
                                    int i18 = this.f7464n;
                                    if (i18 == -1 || iG == i18) {
                                        if (this.o != -1) {
                                            byte[] bArr3 = r8.f5663a;
                                            if (parsableByteArray.a() < r9) {
                                                r22 = r9;
                                            } else {
                                                parsableByteArray.e(bArr3, r7, r9);
                                                r8.m(2);
                                                i4 = 4;
                                                r23 = r9;
                                                if (r8.g(4) == this.o) {
                                                    r25 = r23;
                                                    parsableByteArray.G(i14);
                                                    r22 = r23;
                                                }
                                            }
                                            i2 = -1;
                                        } else {
                                            r22 = r9;
                                            i4 = 4;
                                        }
                                        byte[] bArr4 = r8.f5663a;
                                        if (parsableByteArray.a() >= i4) {
                                            parsableByteArray.e(bArr4, r7, i4);
                                            r8.m(14);
                                            int iG2 = r8.g(13);
                                            if (iG2 >= i11) {
                                                byte[] bArr5 = parsableByteArray.f5667a;
                                                int i19 = parsableByteArray.f5669c;
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
                            this.f7465p = (b2 & 8) >> 3;
                            this.f7463l = (b2 & 1) == 0 ? r22 : 0;
                            if (this.m) {
                                r5 = r22;
                                this.f7462i = i15;
                                this.j = 0;
                            } else {
                                ?? r11 = r22;
                                this.f7462i = r11 == true ? 1 : 0;
                                this.j = 0;
                                r5 = r11;
                            }
                            parsableByteArray.G(i14);
                            i6 = 2;
                            r10 = 0;
                            r3 = r5;
                        } else {
                            i2 = i5;
                            r4 = r9;
                        }
                        int i24 = this.k;
                        int i25 = i24 | i16;
                        if (i25 == 329) {
                            i6 = 2;
                            c2 = 256;
                            i3 = 3;
                            z2 = false;
                            this.k = 768;
                        } else if (i25 == 511) {
                            i6 = 2;
                            c2 = 256;
                            i3 = 3;
                            z2 = false;
                            this.k = 512;
                        } else if (i25 == 836) {
                            i6 = 2;
                            c2 = 256;
                            i3 = 3;
                            z2 = false;
                            this.k = 1024;
                        } else if (i25 != 1075) {
                            c2 = 256;
                            if (i24 != 256) {
                                this.k = 256;
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
                            this.f7462i = 2;
                            this.j = 3;
                            r10 = 0;
                            this.s = 0;
                            parsableByteArray2.G(0);
                            parsableByteArray.G(i14);
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
                        parsableByteArray.G(i12);
                    }
                    r6 = r3;
                    i5 = i2;
                    r2 = r10;
                }
            } else if (i8 != r6) {
                if (i8 == i6) {
                    byte[] bArr6 = parsableByteArray2.f5667a;
                    int iMin = Math.min(parsableByteArray.a(), 10 - this.j);
                    parsableByteArray.e(bArr6, this.j, iMin);
                    int i26 = this.j + iMin;
                    this.j = i26;
                    if (i26 == 10) {
                        this.f7461h.e(10, parsableByteArray2);
                        parsableByteArray2.G(6);
                        TrackOutput trackOutput = this.f7461h;
                        int iT = parsableByteArray2.t() + 10;
                        this.f7462i = 4;
                        this.j = 10;
                        this.f7466u = trackOutput;
                        this.v = 0L;
                        this.s = iT;
                    }
                } else if (i8 == 3) {
                    int i27 = this.f7463l ? 7 : 5;
                    byte[] bArr7 = r8.f5663a;
                    int iMin2 = Math.min(parsableByteArray.a(), i27 - this.j);
                    parsableByteArray.e(bArr7, this.j, iMin2);
                    int i28 = this.j + iMin2;
                    this.j = i28;
                    if (i28 == i27) {
                        r8.m(r2 == true ? 1 : 0);
                        if (this.q) {
                            r8.o(10);
                        } else {
                            int iG3 = r8.g(i6) + (r6 == true ? 1 : 0);
                            if (iG3 != i6) {
                                Log.g("AdtsReader", "Detected audio object type: " + iG3 + ", but assuming AAC LC.");
                                iG3 = i6;
                            }
                            r8.o(5);
                            int iG4 = r8.g(3);
                            int i29 = this.o;
                            byte b5 = (byte) (((iG3 << 3) & 248) | ((i29 >> 1) & 7));
                            byte b6 = (byte) (((iG4 << 3) & 120) | ((i29 << 7) & 128));
                            byte[] bArr8 = new byte[i6];
                            bArr8[r2 == true ? 1 : 0] = b5;
                            bArr8[r6 == true ? 1 : 0] = b6;
                            AacUtil.Config configB = AacUtil.b(new ParsableBitArray(bArr8, i6), r2);
                            Format.Builder builder = new Format.Builder();
                            builder.f5423a = this.f;
                            builder.f5429l = MimeTypes.l("audio/mp4a-latm");
                            builder.f5428i = configB.f6700c;
                            builder.f5434z = configB.f6699b;
                            builder.f5418A = configB.f6698a;
                            builder.o = Collections.singletonList(bArr8);
                            builder.d = this.d;
                            builder.f = this.f7460e;
                            Format format = new Format(builder);
                            this.r = 1024000000 / ((long) format.f5401B);
                            this.g.b(format);
                            this.q = r6;
                        }
                        r8.o(4);
                        int iG5 = r8.g(13);
                        int i30 = iG5 - 7;
                        if (this.f7463l) {
                            i30 = iG5 - 9;
                        }
                        TrackOutput trackOutput2 = this.g;
                        long j = this.r;
                        this.f7462i = 4;
                        this.j = r2 == true ? 1 : 0;
                        this.f7466u = trackOutput2;
                        this.v = j;
                        this.s = i30;
                    }
                } else {
                    if (i8 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(parsableByteArray.a(), this.s - this.j);
                    this.f7466u.e(iMin3, parsableByteArray);
                    int i31 = this.j + iMin3;
                    this.j = i31;
                    if (i31 == this.s) {
                        Assertions.e(this.t != -9223372036854775807L ? r6 == true ? 1 : 0 : r2 == true ? 1 : 0);
                        this.f7466u.f(this.t, 1, this.s, 0, null);
                        this.t += this.v;
                        this.f7462i = r2 == true ? 1 : 0;
                        this.j = r2 == true ? 1 : 0;
                        this.k = 256;
                    }
                }
            } else if (parsableByteArray.a() != 0) {
                r8.f5663a[r2 == true ? 1 : 0] = parsableByteArray.f5667a[parsableByteArray.f5668b];
                r8.m(i6);
                int iG6 = r8.g(4);
                int i32 = this.o;
                if (i32 == i5 || iG6 == i32) {
                    if (!this.m) {
                        this.m = r6;
                        this.f7464n = this.f7465p;
                        this.o = iG6;
                    }
                    this.f7462i = 3;
                    this.j = r2 == true ? 1 : 0;
                } else {
                    this.m = r2;
                    this.f7462i = r2 == true ? 1 : 0;
                    this.j = r2 == true ? 1 : 0;
                    this.k = 256;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        this.t = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(boolean z2) {
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f = trackIdGenerator.f7653e;
        trackIdGenerator.b();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 1);
        this.g = trackOutputTrack;
        this.f7466u = trackOutputTrack;
        if (!this.f7457a) {
            this.f7461h = new DiscardingTrackOutput();
            return;
        }
        trackIdGenerator.a();
        trackIdGenerator.b();
        TrackOutput trackOutputTrack2 = extractorOutput.track(trackIdGenerator.d, 5);
        this.f7461h = trackOutputTrack2;
        Format.Builder builder = new Format.Builder();
        trackIdGenerator.b();
        builder.f5423a = trackIdGenerator.f7653e;
        builder.f5429l = MimeTypes.l("application/id3");
        trackOutputTrack2.b(new Format(builder));
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.t = -9223372036854775807L;
        this.m = false;
        this.f7462i = 0;
        this.j = 0;
        this.k = 256;
    }
}
