package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class H263Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f17954l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserDataReader f17955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f17956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f17957c = new boolean[4];
    public final CsdBuffer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NalUnitTargetBuffer f17958e;
    public SampleReader f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f17959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TrackOutput f17960i;
    public boolean j;
    public long k;

    public static final class CsdBuffer {
        public static final byte[] f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17963c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f17964e;

        public final void a(byte[] bArr, int i2, int i3) {
            if (this.f17961a) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.f17964e;
                int length = bArr2.length;
                int i5 = this.f17963c + i4;
                if (length < i5) {
                    this.f17964e = Arrays.copyOf(bArr2, i5 * 2);
                }
                System.arraycopy(bArr, i2, this.f17964e, this.f17963c, i4);
                this.f17963c += i4;
            }
        }
    }

    public static final class SampleReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackOutput f17965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f17966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17967c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17968e;
        public int f;
        public long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f17969h;

        public SampleReader(TrackOutput trackOutput) {
            this.f17965a = trackOutput;
        }

        public final void a(byte[] bArr, int i2, int i3) {
            if (this.f17967c) {
                int i4 = this.f;
                int i5 = (i2 + 1) - i4;
                if (i5 >= i3) {
                    this.f = (i3 - i2) + i4;
                } else {
                    this.d = ((bArr[i5] & 192) >> 6) == 0;
                    this.f17967c = false;
                }
            }
        }
    }

    public H263Reader(UserDataReader userDataReader) {
        this.f17955a = userDataReader;
        CsdBuffer csdBuffer = new CsdBuffer();
        csdBuffer.f17964e = new byte[128];
        this.d = csdBuffer;
        this.k = -9223372036854775807L;
        this.f17958e = new NalUnitTargetBuffer(178);
        this.f17956b = new ParsableByteArray();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0253  */
    /* JADX WARN: Code duplicated, block: B:107:0x0271  */
    /* JADX WARN: Code duplicated, block: B:110:0x027e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0283  */
    /* JADX WARN: Code duplicated, block: B:116:0x0288  */
    /* JADX WARN: Code duplicated, block: B:117:0x028a  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0204  */
    /* JADX WARN: Code duplicated, block: B:93:0x0220  */
    /* JADX WARN: Code duplicated, block: B:95:0x022b  */
    /* JADX WARN: Code duplicated, block: B:96:0x022f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0242 A[ADDED_TO_REGION] */
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
    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void b(ParsableByteArray parsableByteArray) {
        int i2;
        int i3;
        char c2;
        int i4;
        long j;
        SampleReader sampleReader;
        boolean z2;
        boolean z3;
        long j2;
        int i5;
        float f;
        boolean z4 = true;
        Assertions.e(this.f);
        Assertions.e(this.f17960i);
        int i6 = parsableByteArray.f18957b;
        int i7 = parsableByteArray.f18958c;
        byte[] bArr = parsableByteArray.f18956a;
        this.g += (long) parsableByteArray.a();
        this.f17960i.e(parsableByteArray.a(), parsableByteArray);
        while (true) {
            int iB = NalUnitUtil.b(bArr, i6, i7, this.f17957c);
            CsdBuffer csdBuffer = this.d;
            NalUnitTargetBuffer nalUnitTargetBuffer = this.f17958e;
            if (iB == i7) {
                if (!this.j) {
                    csdBuffer.a(bArr, i6, i7);
                }
                this.f.a(bArr, i6, i7);
                if (nalUnitTargetBuffer != null) {
                    nalUnitTargetBuffer.a(bArr, i6, i7);
                    return;
                }
                return;
            }
            int i8 = iB + 3;
            int i9 = parsableByteArray.f18956a[i8];
            int i10 = i9 & 255;
            int i11 = iB - i6;
            if (this.j) {
                i2 = i7;
                i3 = i8;
            } else {
                if (i11 > 0) {
                    csdBuffer.a(bArr, i6, iB);
                }
                int i12 = i11 < 0 ? -i11 : 0;
                int i13 = csdBuffer.f17962b;
                if (i13 != 0) {
                    i2 = i7;
                    if (i13 == z4) {
                        i3 = i8;
                        if (i10 != 181) {
                            Log.g("H263Reader", "Unexpected start code value");
                            csdBuffer.f17961a = false;
                            csdBuffer.f17963c = 0;
                            csdBuffer.f17962b = 0;
                        } else {
                            csdBuffer.f17962b = 2;
                        }
                    } else if (i13 != 2) {
                        i3 = i8;
                        if (i13 != 3) {
                            if (i13 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                csdBuffer.f17963c -= i12;
                                csdBuffer.f17961a = false;
                                TrackOutput trackOutput = this.f17960i;
                                int i14 = csdBuffer.d;
                                String str = this.f17959h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(csdBuffer.f17964e, csdBuffer.f17963c);
                                ParsableBitArray parsableBitArray = new ParsableBitArray(bArrCopyOf, bArrCopyOf.length);
                                parsableBitArray.o(i14);
                                parsableBitArray.o(4);
                                parsableBitArray.m();
                                parsableBitArray.n(8);
                                if (parsableBitArray.f()) {
                                    parsableBitArray.n(4);
                                    parsableBitArray.n(3);
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
                                    f = f17954l[iG];
                                } else {
                                    Log.g("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                }
                                if (parsableBitArray.f()) {
                                    parsableBitArray.n(2);
                                    parsableBitArray.n(1);
                                    if (parsableBitArray.f()) {
                                        parsableBitArray.n(15);
                                        parsableBitArray.m();
                                        parsableBitArray.n(15);
                                        parsableBitArray.m();
                                        parsableBitArray.n(15);
                                        parsableBitArray.m();
                                        parsableBitArray.n(3);
                                        parsableBitArray.n(11);
                                        parsableBitArray.m();
                                        parsableBitArray.n(15);
                                        parsableBitArray.m();
                                    }
                                }
                                if (parsableBitArray.g(2) != 0) {
                                    Log.g("H263Reader", "Unhandled video object layer shape");
                                }
                                parsableBitArray.m();
                                int iG4 = parsableBitArray.g(16);
                                parsableBitArray.m();
                                if (parsableBitArray.f()) {
                                    if (iG4 == 0) {
                                        Log.g("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i15 = 0;
                                        for (int i16 = iG4 - 1; i16 > 0; i16 >>= 1) {
                                            i15++;
                                        }
                                        parsableBitArray.n(i15);
                                    }
                                }
                                parsableBitArray.m();
                                int iG5 = parsableBitArray.g(13);
                                parsableBitArray.m();
                                int iG6 = parsableBitArray.g(13);
                                parsableBitArray.m();
                                parsableBitArray.m();
                                Format.Builder builder = new Format.Builder();
                                builder.f17081a = str;
                                builder.k = "video/mp4v-es";
                                builder.f17089p = iG5;
                                builder.q = iG6;
                                builder.t = f;
                                builder.m = Collections.singletonList(bArrCopyOf);
                                trackOutput.c(new Format(builder));
                                this.j = true;
                            }
                            this.f.a(bArr, i6, iB);
                            if (nalUnitTargetBuffer == null) {
                                z4 = true;
                            } else {
                                if (i11 > 0) {
                                    nalUnitTargetBuffer.a(bArr, i6, iB);
                                    i5 = 0;
                                } else {
                                    i5 = -i11;
                                }
                                if (nalUnitTargetBuffer.b(i5)) {
                                    int iE = NalUnitUtil.e(nalUnitTargetBuffer.d, nalUnitTargetBuffer.f18035e);
                                    int i17 = Util.f18979a;
                                    byte[] bArr2 = nalUnitTargetBuffer.d;
                                    ParsableByteArray parsableByteArray2 = this.f17956b;
                                    parsableByteArray2.D(bArr2, iE);
                                    this.f17955a.a(this.k, parsableByteArray2);
                                }
                                if (i10 == 178) {
                                    z4 = true;
                                    if (parsableByteArray.f18956a[iB + 2] == 1) {
                                        nalUnitTargetBuffer.d(i10);
                                    }
                                } else {
                                    z4 = true;
                                }
                            }
                            i4 = i2 - iB;
                            j = this.g - ((long) i4);
                            sampleReader = this.f;
                            boolean z5 = this.j;
                            if (sampleReader.f17968e == 182 && z5 && sampleReader.f17966b) {
                                j2 = sampleReader.f17969h;
                                if (j2 != -9223372036854775807L) {
                                    sampleReader.f17965a.f(j2, sampleReader.d ? 1 : 0, (int) (j - sampleReader.g), i4, null);
                                }
                            }
                            if (sampleReader.f17968e != 179) {
                                sampleReader.g = j;
                            }
                            SampleReader sampleReader2 = this.f;
                            long j3 = this.k;
                            sampleReader2.f17968e = i10;
                            sampleReader2.d = false;
                            if (i10 != 182 || i10 == 179) {
                                z2 = z4;
                            } else {
                                z2 = false;
                            }
                            sampleReader2.f17966b = z2;
                            if (i10 == 182) {
                                z3 = z4;
                            } else {
                                z3 = false;
                            }
                            sampleReader2.f17967c = z3;
                            sampleReader2.f = 0;
                            sampleReader2.f17969h = j3;
                            i7 = i2;
                            i6 = i3;
                        } else if ((i9 & com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) != 32) {
                            Log.g("H263Reader", "Unexpected start code value");
                            csdBuffer.f17961a = false;
                            csdBuffer.f17963c = 0;
                            csdBuffer.f17962b = 0;
                        } else {
                            csdBuffer.d = csdBuffer.f17963c;
                            csdBuffer.f17962b = 4;
                        }
                    } else {
                        i3 = i8;
                        if (i10 > 31) {
                            Log.g("H263Reader", "Unexpected start code value");
                            csdBuffer.f17961a = false;
                            csdBuffer.f17963c = 0;
                            csdBuffer.f17962b = 0;
                        } else {
                            csdBuffer.f17962b = 3;
                        }
                    }
                } else {
                    i2 = i7;
                    i3 = i8;
                    if (i10 == 176) {
                        csdBuffer.f17962b = 1;
                        csdBuffer.f17961a = true;
                    }
                }
                c2 = 3;
                csdBuffer.a(CsdBuffer.f, 0, 3);
                this.f.a(bArr, i6, iB);
                if (nalUnitTargetBuffer == null) {
                    z4 = true;
                } else {
                    if (i11 > 0) {
                        nalUnitTargetBuffer.a(bArr, i6, iB);
                        i5 = 0;
                    } else {
                        i5 = -i11;
                    }
                    if (nalUnitTargetBuffer.b(i5)) {
                        int iE2 = NalUnitUtil.e(nalUnitTargetBuffer.d, nalUnitTargetBuffer.f18035e);
                        int i18 = Util.f18979a;
                        byte[] bArr3 = nalUnitTargetBuffer.d;
                        ParsableByteArray parsableByteArray3 = this.f17956b;
                        parsableByteArray3.D(bArr3, iE2);
                        this.f17955a.a(this.k, parsableByteArray3);
                    }
                    if (i10 == 178) {
                        z4 = true;
                        if (parsableByteArray.f18956a[iB + 2] == 1) {
                            nalUnitTargetBuffer.d(i10);
                        }
                    } else {
                        z4 = true;
                    }
                }
                i4 = i2 - iB;
                j = this.g - ((long) i4);
                sampleReader = this.f;
                boolean z6 = this.j;
                if (sampleReader.f17968e == 182) {
                    j2 = sampleReader.f17969h;
                    if (j2 != -9223372036854775807L) {
                        sampleReader.f17965a.f(j2, sampleReader.d ? 1 : 0, (int) (j - sampleReader.g), i4, null);
                    }
                }
                if (sampleReader.f17968e != 179) {
                    sampleReader.g = j;
                }
                SampleReader sampleReader3 = this.f;
                long j4 = this.k;
                sampleReader3.f17968e = i10;
                sampleReader3.d = false;
                if (i10 != 182) {
                    z2 = z4;
                } else {
                    z2 = z4;
                }
                sampleReader3.f17966b = z2;
                if (i10 == 182) {
                    z3 = z4;
                } else {
                    z3 = false;
                }
                sampleReader3.f17967c = z3;
                sampleReader3.f = 0;
                sampleReader3.f17969h = j4;
                i7 = i2;
                i6 = i3;
            }
            c2 = 3;
            this.f.a(bArr, i6, iB);
            if (nalUnitTargetBuffer == null) {
                z4 = true;
            } else {
                if (i11 > 0) {
                    nalUnitTargetBuffer.a(bArr, i6, iB);
                    i5 = 0;
                } else {
                    i5 = -i11;
                }
                if (nalUnitTargetBuffer.b(i5)) {
                    int iE3 = NalUnitUtil.e(nalUnitTargetBuffer.d, nalUnitTargetBuffer.f18035e);
                    int i19 = Util.f18979a;
                    byte[] bArr4 = nalUnitTargetBuffer.d;
                    ParsableByteArray parsableByteArray4 = this.f17956b;
                    parsableByteArray4.D(bArr4, iE3);
                    this.f17955a.a(this.k, parsableByteArray4);
                }
                if (i10 == 178) {
                    z4 = true;
                    if (parsableByteArray.f18956a[iB + 2] == 1) {
                        nalUnitTargetBuffer.d(i10);
                    }
                } else {
                    z4 = true;
                }
            }
            i4 = i2 - iB;
            j = this.g - ((long) i4);
            sampleReader = this.f;
            boolean z7 = this.j;
            if (sampleReader.f17968e == 182) {
                j2 = sampleReader.f17969h;
                if (j2 != -9223372036854775807L) {
                    sampleReader.f17965a.f(j2, sampleReader.d ? 1 : 0, (int) (j - sampleReader.g), i4, null);
                }
            }
            if (sampleReader.f17968e != 179) {
                sampleReader.g = j;
            }
            SampleReader sampleReader4 = this.f;
            long j5 = this.k;
            sampleReader4.f17968e = i10;
            sampleReader4.d = false;
            if (i10 != 182) {
                z2 = z4;
            } else {
                z2 = z4;
            }
            sampleReader4.f17966b = z2;
            if (i10 == 182) {
                z3 = z4;
            } else {
                z3 = false;
            }
            sampleReader4.f17967c = z3;
            sampleReader4.f = 0;
            sampleReader4.f17969h = j5;
            i7 = i2;
            i6 = i3;
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
        this.f17959h = trackIdGenerator.f18100e;
        trackIdGenerator.b();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 2);
        this.f17960i = trackOutputTrack;
        this.f = new SampleReader(trackOutputTrack);
        this.f17955a.b(extractorOutput, trackIdGenerator);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        NalUnitUtil.a(this.f17957c);
        CsdBuffer csdBuffer = this.d;
        csdBuffer.f17961a = false;
        csdBuffer.f17963c = 0;
        csdBuffer.f17962b = 0;
        SampleReader sampleReader = this.f;
        if (sampleReader != null) {
            sampleReader.f17966b = false;
            sampleReader.f17967c = false;
            sampleReader.d = false;
            sampleReader.f17968e = -1;
        }
        NalUnitTargetBuffer nalUnitTargetBuffer = this.f17958e;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }
}
