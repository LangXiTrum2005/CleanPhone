package androidx.media3.extractor.ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class H263Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f7494l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserDataReader f7495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f7496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f7497c = new boolean[4];
    public final CsdBuffer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NalUnitTargetBuffer f7498e;
    public SampleReader f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f7499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TrackOutput f7500i;
    public boolean j;
    public long k;

    public static final class CsdBuffer {
        public static final byte[] f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7503c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f7504e;

        public final void a(byte[] bArr, int i2, int i3) {
            if (this.f7501a) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.f7504e;
                int length = bArr2.length;
                int i5 = this.f7503c + i4;
                if (length < i5) {
                    this.f7504e = Arrays.copyOf(bArr2, i5 * 2);
                }
                System.arraycopy(bArr, i2, this.f7504e, this.f7503c, i4);
                this.f7503c += i4;
            }
        }
    }

    public static final class SampleReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackOutput f7505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f7506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7507c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7508e;
        public int f;
        public long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f7509h;

        public SampleReader(TrackOutput trackOutput) {
            this.f7505a = trackOutput;
        }

        public final void a(byte[] bArr, int i2, int i3) {
            if (this.f7507c) {
                int i4 = this.f;
                int i5 = (i2 + 1) - i4;
                if (i5 >= i3) {
                    this.f = (i3 - i2) + i4;
                } else {
                    this.d = ((bArr[i5] & 192) >> 6) == 0;
                    this.f7507c = false;
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void b(long j, int i2, boolean z2) {
            Assertions.e(this.f7509h != -9223372036854775807L);
            if (this.f7508e == 182 && z2 && this.f7506b) {
                this.f7505a.f(this.f7509h, this.d ? 1 : 0, (int) (j - this.g), i2, null);
            }
            if (this.f7508e != 179) {
                this.g = j;
            }
        }
    }

    public H263Reader(UserDataReader userDataReader) {
        this.f7495a = userDataReader;
        CsdBuffer csdBuffer = new CsdBuffer();
        csdBuffer.f7504e = new byte[128];
        this.d = csdBuffer;
        this.k = -9223372036854775807L;
        this.f7498e = new NalUnitTargetBuffer(178);
        this.f7496b = new ParsableByteArray();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0257  */
    /* JADX WARN: Code duplicated, block: B:106:0x025c  */
    /* JADX WARN: Code duplicated, block: B:107:0x025e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0201  */
    /* JADX WARN: Code duplicated, block: B:90:0x0208  */
    /* JADX WARN: Code duplicated, block: B:93:0x0224  */
    /* JADX WARN: Code duplicated, block: B:95:0x022f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0233  */
    /* JADX WARN: Code duplicated, block: B:99:0x0250  */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) {
        int i2;
        int i3;
        char c2;
        boolean z2;
        boolean z3;
        int i4;
        float f;
        boolean z4 = true;
        Assertions.f(this.f);
        Assertions.f(this.f7500i);
        int i5 = parsableByteArray.f5668b;
        int i6 = parsableByteArray.f5669c;
        byte[] bArr = parsableByteArray.f5667a;
        this.g += (long) parsableByteArray.a();
        this.f7500i.e(parsableByteArray.a(), parsableByteArray);
        while (true) {
            int iB = NalUnitUtil.b(bArr, i5, i6, this.f7497c);
            CsdBuffer csdBuffer = this.d;
            NalUnitTargetBuffer nalUnitTargetBuffer = this.f7498e;
            if (iB == i6) {
                if (!this.j) {
                    csdBuffer.a(bArr, i5, i6);
                }
                this.f.a(bArr, i5, i6);
                if (nalUnitTargetBuffer != null) {
                    nalUnitTargetBuffer.a(bArr, i5, i6);
                    return;
                }
                return;
            }
            int i7 = iB + 3;
            byte b2 = parsableByteArray.f5667a[i7];
            int i8 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i9 = iB - i5;
            if (this.j) {
                i2 = i6;
                i3 = i7;
            } else {
                if (i9 > 0) {
                    csdBuffer.a(bArr, i5, iB);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = csdBuffer.f7502b;
                if (i11 != 0) {
                    i2 = i6;
                    if (i11 == z4) {
                        i3 = i7;
                        if (i8 != 181) {
                            Log.g("H263Reader", "Unexpected start code value");
                            csdBuffer.f7501a = false;
                            csdBuffer.f7503c = 0;
                            csdBuffer.f7502b = 0;
                        } else {
                            csdBuffer.f7502b = 2;
                        }
                    } else if (i11 != 2) {
                        i3 = i7;
                        if (i11 != 3) {
                            if (i11 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i8 == 179 || i8 == 181) {
                                csdBuffer.f7503c -= i10;
                                csdBuffer.f7501a = false;
                                TrackOutput trackOutput = this.f7500i;
                                int i12 = csdBuffer.d;
                                String str = this.f7499h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(csdBuffer.f7504e, csdBuffer.f7503c);
                                ParsableBitArray parsableBitArray = new ParsableBitArray(bArrCopyOf, bArrCopyOf.length);
                                parsableBitArray.p(i12);
                                parsableBitArray.p(4);
                                parsableBitArray.n();
                                parsableBitArray.o(8);
                                if (parsableBitArray.f()) {
                                    parsableBitArray.o(4);
                                    parsableBitArray.o(3);
                                }
                                int iG = parsableBitArray.g(4);
                                if (iG == 15) {
                                    int iG2 = parsableBitArray.g(8);
                                    int iG3 = parsableBitArray.g(8);
                                    if (iG3 == 0) {
                                        Log.g("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    } else {
                                        f = iG2 / iG3;
                                    }
                                } else if (iG < 7) {
                                    f = f7494l[iG];
                                } else {
                                    Log.g("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                }
                                if (parsableBitArray.f()) {
                                    parsableBitArray.o(2);
                                    parsableBitArray.o(1);
                                    if (parsableBitArray.f()) {
                                        parsableBitArray.o(15);
                                        parsableBitArray.n();
                                        parsableBitArray.o(15);
                                        parsableBitArray.n();
                                        parsableBitArray.o(15);
                                        parsableBitArray.n();
                                        parsableBitArray.o(3);
                                        parsableBitArray.o(11);
                                        parsableBitArray.n();
                                        parsableBitArray.o(15);
                                        parsableBitArray.n();
                                    }
                                }
                                if (parsableBitArray.g(2) != 0) {
                                    Log.g("H263Reader", "Unhandled video object layer shape");
                                }
                                parsableBitArray.n();
                                int iG4 = parsableBitArray.g(16);
                                parsableBitArray.n();
                                if (parsableBitArray.f()) {
                                    if (iG4 == 0) {
                                        Log.g("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i13 = 0;
                                        for (int i14 = iG4 - 1; i14 > 0; i14 >>= 1) {
                                            i13++;
                                        }
                                        parsableBitArray.o(i13);
                                    }
                                }
                                parsableBitArray.n();
                                int iG5 = parsableBitArray.g(13);
                                parsableBitArray.n();
                                int iG6 = parsableBitArray.g(13);
                                parsableBitArray.n();
                                parsableBitArray.n();
                                Format.Builder builder = new Format.Builder();
                                builder.f5423a = str;
                                builder.f5429l = MimeTypes.l("video/mp4v-es");
                                builder.r = iG5;
                                builder.s = iG6;
                                builder.v = f;
                                builder.o = Collections.singletonList(bArrCopyOf);
                                trackOutput.b(new Format(builder));
                                this.j = true;
                            }
                            this.f.a(bArr, i5, iB);
                            if (nalUnitTargetBuffer == null) {
                                z4 = true;
                            } else {
                                if (i9 > 0) {
                                    nalUnitTargetBuffer.a(bArr, i5, iB);
                                    i4 = 0;
                                } else {
                                    i4 = -i9;
                                }
                                if (nalUnitTargetBuffer.b(i4)) {
                                    int iF = NalUnitUtil.f(nalUnitTargetBuffer.d, nalUnitTargetBuffer.f7588e);
                                    int i15 = Util.f5683a;
                                    byte[] bArr2 = nalUnitTargetBuffer.d;
                                    ParsableByteArray parsableByteArray2 = this.f7496b;
                                    parsableByteArray2.E(bArr2, iF);
                                    this.f7495a.a(this.k, parsableByteArray2);
                                }
                                if (i8 == 178) {
                                    z4 = true;
                                    if (parsableByteArray.f5667a[iB + 2] == 1) {
                                        nalUnitTargetBuffer.d(i8);
                                    }
                                } else {
                                    z4 = true;
                                }
                            }
                            int i16 = i2 - iB;
                            this.f.b(this.g - ((long) i16), i16, this.j);
                            SampleReader sampleReader = this.f;
                            long j = this.k;
                            sampleReader.f7508e = i8;
                            sampleReader.d = false;
                            if (i8 != 182 || i8 == 179) {
                                z2 = z4;
                            } else {
                                z2 = false;
                            }
                            sampleReader.f7506b = z2;
                            if (i8 == 182) {
                                z3 = z4;
                            } else {
                                z3 = false;
                            }
                            sampleReader.f7507c = z3;
                            sampleReader.f = 0;
                            sampleReader.f7509h = j;
                            i6 = i2;
                            i5 = i3;
                        } else if ((b2 & 240) != 32) {
                            Log.g("H263Reader", "Unexpected start code value");
                            csdBuffer.f7501a = false;
                            csdBuffer.f7503c = 0;
                            csdBuffer.f7502b = 0;
                        } else {
                            csdBuffer.d = csdBuffer.f7503c;
                            csdBuffer.f7502b = 4;
                        }
                    } else {
                        i3 = i7;
                        if (i8 > 31) {
                            Log.g("H263Reader", "Unexpected start code value");
                            csdBuffer.f7501a = false;
                            csdBuffer.f7503c = 0;
                            csdBuffer.f7502b = 0;
                        } else {
                            csdBuffer.f7502b = 3;
                        }
                    }
                } else {
                    i2 = i6;
                    i3 = i7;
                    if (i8 == 176) {
                        csdBuffer.f7502b = 1;
                        csdBuffer.f7501a = true;
                    }
                }
                c2 = 3;
                csdBuffer.a(CsdBuffer.f, 0, 3);
                this.f.a(bArr, i5, iB);
                if (nalUnitTargetBuffer == null) {
                    z4 = true;
                } else {
                    if (i9 > 0) {
                        nalUnitTargetBuffer.a(bArr, i5, iB);
                        i4 = 0;
                    } else {
                        i4 = -i9;
                    }
                    if (nalUnitTargetBuffer.b(i4)) {
                        int iF2 = NalUnitUtil.f(nalUnitTargetBuffer.d, nalUnitTargetBuffer.f7588e);
                        int i17 = Util.f5683a;
                        byte[] bArr3 = nalUnitTargetBuffer.d;
                        ParsableByteArray parsableByteArray3 = this.f7496b;
                        parsableByteArray3.E(bArr3, iF2);
                        this.f7495a.a(this.k, parsableByteArray3);
                    }
                    if (i8 == 178) {
                        z4 = true;
                        if (parsableByteArray.f5667a[iB + 2] == 1) {
                            nalUnitTargetBuffer.d(i8);
                        }
                    } else {
                        z4 = true;
                    }
                }
                int i18 = i2 - iB;
                this.f.b(this.g - ((long) i18), i18, this.j);
                SampleReader sampleReader2 = this.f;
                long j2 = this.k;
                sampleReader2.f7508e = i8;
                sampleReader2.d = false;
                if (i8 != 182) {
                    z2 = z4;
                } else {
                    z2 = z4;
                }
                sampleReader2.f7506b = z2;
                if (i8 == 182) {
                    z3 = z4;
                } else {
                    z3 = false;
                }
                sampleReader2.f7507c = z3;
                sampleReader2.f = 0;
                sampleReader2.f7509h = j2;
                i6 = i2;
                i5 = i3;
            }
            c2 = 3;
            this.f.a(bArr, i5, iB);
            if (nalUnitTargetBuffer == null) {
                z4 = true;
            } else {
                if (i9 > 0) {
                    nalUnitTargetBuffer.a(bArr, i5, iB);
                    i4 = 0;
                } else {
                    i4 = -i9;
                }
                if (nalUnitTargetBuffer.b(i4)) {
                    int iF3 = NalUnitUtil.f(nalUnitTargetBuffer.d, nalUnitTargetBuffer.f7588e);
                    int i19 = Util.f5683a;
                    byte[] bArr4 = nalUnitTargetBuffer.d;
                    ParsableByteArray parsableByteArray4 = this.f7496b;
                    parsableByteArray4.E(bArr4, iF3);
                    this.f7495a.a(this.k, parsableByteArray4);
                }
                if (i8 == 178) {
                    z4 = true;
                    if (parsableByteArray.f5667a[iB + 2] == 1) {
                        nalUnitTargetBuffer.d(i8);
                    }
                } else {
                    z4 = true;
                }
            }
            int i110 = i2 - iB;
            this.f.b(this.g - ((long) i110), i110, this.j);
            SampleReader sampleReader3 = this.f;
            long j3 = this.k;
            sampleReader3.f7508e = i8;
            sampleReader3.d = false;
            if (i8 != 182) {
                z2 = z4;
            } else {
                z2 = z4;
            }
            sampleReader3.f7506b = z2;
            if (i8 == 182) {
                z3 = z4;
            } else {
                z3 = false;
            }
            sampleReader3.f7507c = z3;
            sampleReader3.f = 0;
            sampleReader3.f7509h = j3;
            i6 = i2;
            i5 = i3;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        this.k = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(boolean z2) {
        Assertions.f(this.f);
        if (z2) {
            this.f.b(this.g, 0, this.j);
            SampleReader sampleReader = this.f;
            sampleReader.f7506b = false;
            sampleReader.f7507c = false;
            sampleReader.d = false;
            sampleReader.f7508e = -1;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f7499h = trackIdGenerator.f7653e;
        trackIdGenerator.b();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 2);
        this.f7500i = trackOutputTrack;
        this.f = new SampleReader(trackOutputTrack);
        this.f7495a.b(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        NalUnitUtil.a(this.f7497c);
        CsdBuffer csdBuffer = this.d;
        csdBuffer.f7501a = false;
        csdBuffer.f7503c = 0;
        csdBuffer.f7502b = 0;
        SampleReader sampleReader = this.f;
        if (sampleReader != null) {
            sampleReader.f7506b = false;
            sampleReader.f7507c = false;
            sampleReader.d = false;
            sampleReader.f7508e = -1;
        }
        NalUnitTargetBuffer nalUnitTargetBuffer = this.f7498e;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }
}
