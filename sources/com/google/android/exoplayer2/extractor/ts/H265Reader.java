package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.CeaUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class H265Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SeiReader f17996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TrackOutput f17998c;
    public SampleReader d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17999e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18002l;
    public final boolean[] f = new boolean[3];
    public final NalUnitTargetBuffer g = new NalUnitTargetBuffer(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NalUnitTargetBuffer f18000h = new NalUnitTargetBuffer(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final NalUnitTargetBuffer f18001i = new NalUnitTargetBuffer(34);
    public final NalUnitTargetBuffer j = new NalUnitTargetBuffer(39);
    public final NalUnitTargetBuffer k = new NalUnitTargetBuffer(40);
    public long m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ParsableByteArray f18003n = new ParsableByteArray();

    public static final class SampleReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackOutput f18004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f18005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18006c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f18007e;
        public boolean f;
        public boolean g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f18008h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f18009i;
        public boolean j;
        public long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f18010l;
        public boolean m;

        public SampleReader(TrackOutput trackOutput) {
            this.f18004a = trackOutput;
        }
    }

    public H265Reader(SeiReader seiReader) {
        this.f17996a = seiReader;
    }

    public final void a(int i2, int i3, byte[] bArr) {
        SampleReader sampleReader = this.d;
        if (sampleReader.f) {
            int i4 = sampleReader.d;
            int i5 = (i2 + 2) - i4;
            if (i5 < i3) {
                sampleReader.g = (bArr[i5] & 128) != 0;
                sampleReader.f = false;
            } else {
                sampleReader.d = (i3 - i2) + i4;
            }
        }
        if (!this.f17999e) {
            this.g.a(bArr, i2, i3);
            this.f18000h.a(bArr, i2, i3);
            this.f18001i.a(bArr, i2, i3);
        }
        this.j.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:46:0x0165  */
    /* JADX WARN: Code duplicated, block: B:47:0x016e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0187  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x0212  */
    /* JADX WARN: Code duplicated, block: B:82:0x0218  */
    /* JADX WARN: Code duplicated, block: B:85:0x021d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0221  */
    /* JADX WARN: Code duplicated, block: B:90:0x0228  */
    /* JADX WARN: Code duplicated, block: B:98:0x0231 A[SYNTHETIC] */
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
        boolean z2;
        NalUnitTargetBuffer nalUnitTargetBuffer;
        NalUnitTargetBuffer nalUnitTargetBuffer2;
        NalUnitTargetBuffer nalUnitTargetBuffer3;
        int i4;
        NalUnitTargetBuffer nalUnitTargetBuffer4;
        boolean zB;
        TrackOutput[] trackOutputArr;
        ParsableByteArray parsableByteArray2;
        NalUnitTargetBuffer nalUnitTargetBuffer5;
        boolean z3;
        boolean z4;
        boolean z5;
        Assertions.e(this.f17998c);
        int i5 = Util.f18979a;
        while (parsableByteArray.a() > 0) {
            int i6 = parsableByteArray.f18957b;
            int i7 = parsableByteArray.f18958c;
            byte[] bArr = parsableByteArray.f18956a;
            this.f18002l += (long) parsableByteArray.a();
            this.f17998c.e(parsableByteArray.a(), parsableByteArray);
            while (i6 < i7) {
                int iB = NalUnitUtil.b(bArr, i6, i7, this.f);
                if (iB == i7) {
                    a(i6, i7, bArr);
                    return;
                }
                int i8 = iB + 3;
                int i9 = (bArr[i8] & 126) >> 1;
                int i10 = iB - i6;
                if (i10 > 0) {
                    a(i6, iB, bArr);
                }
                int i11 = i7 - iB;
                long j = this.f18002l - ((long) i11);
                int i12 = i10 < 0 ? -i10 : 0;
                long j2 = this.m;
                SampleReader sampleReader = this.d;
                boolean z6 = this.f17999e;
                if (sampleReader.j && sampleReader.g) {
                    sampleReader.m = sampleReader.f18006c;
                    sampleReader.j = false;
                } else {
                    if (sampleReader.f18008h || sampleReader.g) {
                        if (z6 && sampleReader.f18009i) {
                            long j3 = sampleReader.f18005b;
                            i3 = i12;
                            int i13 = i11 + ((int) (j - j3));
                            long j4 = sampleReader.f18010l;
                            if (j4 == -9223372036854775807L) {
                                i2 = i8;
                            } else {
                                i2 = i8;
                                sampleReader.f18004a.f(j4, sampleReader.m ? 1 : 0, (int) (j3 - sampleReader.k), i13, null);
                            }
                        } else {
                            i2 = i8;
                            i3 = i12;
                        }
                        sampleReader.k = sampleReader.f18005b;
                        sampleReader.f18010l = sampleReader.f18007e;
                        sampleReader.m = sampleReader.f18006c;
                        sampleReader.f18009i = true;
                    }
                    z2 = this.f17999e;
                    nalUnitTargetBuffer = this.f18001i;
                    nalUnitTargetBuffer2 = this.f18000h;
                    nalUnitTargetBuffer3 = this.g;
                    if (z2) {
                        i4 = i3;
                    } else {
                        i4 = i3;
                        nalUnitTargetBuffer3.b(i4);
                        nalUnitTargetBuffer2.b(i4);
                        nalUnitTargetBuffer.b(i4);
                        if (!nalUnitTargetBuffer3.f18034c && nalUnitTargetBuffer2.f18034c && nalUnitTargetBuffer.f18034c) {
                            TrackOutput trackOutput = this.f17998c;
                            String str = this.f17997b;
                            int i14 = nalUnitTargetBuffer3.f18035e;
                            byte[] bArr2 = new byte[nalUnitTargetBuffer2.f18035e + i14 + nalUnitTargetBuffer.f18035e];
                            System.arraycopy(nalUnitTargetBuffer3.d, 0, bArr2, 0, i14);
                            System.arraycopy(nalUnitTargetBuffer2.d, 0, bArr2, nalUnitTargetBuffer3.f18035e, nalUnitTargetBuffer2.f18035e);
                            System.arraycopy(nalUnitTargetBuffer.d, 0, bArr2, nalUnitTargetBuffer3.f18035e + nalUnitTargetBuffer2.f18035e, nalUnitTargetBuffer.f18035e);
                            NalUnitUtil.H265SpsData h265SpsDataC = NalUnitUtil.c(3, nalUnitTargetBuffer2.f18035e, nalUnitTargetBuffer2.d);
                            String strA = CodecSpecificDataUtil.a(h265SpsDataC.f18930a, h265SpsDataC.f18931b, h265SpsDataC.f18932c, h265SpsDataC.d, h265SpsDataC.f18933e, h265SpsDataC.f);
                            Format.Builder builder = new Format.Builder();
                            builder.f17081a = str;
                            builder.k = "video/hevc";
                            builder.f17085h = strA;
                            builder.f17089p = h265SpsDataC.g;
                            builder.q = h265SpsDataC.f18934h;
                            builder.t = h265SpsDataC.f18935i;
                            builder.m = Collections.singletonList(bArr2);
                            trackOutput.c(new Format(builder));
                            this.f17999e = true;
                        }
                    }
                    nalUnitTargetBuffer4 = this.j;
                    zB = nalUnitTargetBuffer4.b(i4);
                    trackOutputArr = this.f17996a.f18068b;
                    parsableByteArray2 = this.f18003n;
                    if (zB) {
                        parsableByteArray2.D(nalUnitTargetBuffer4.d, NalUnitUtil.e(nalUnitTargetBuffer4.d, nalUnitTargetBuffer4.f18035e));
                        parsableByteArray2.G(5);
                        CeaUtil.a(j2, parsableByteArray2, trackOutputArr);
                    }
                    nalUnitTargetBuffer5 = this.k;
                    if (nalUnitTargetBuffer5.b(i4)) {
                        parsableByteArray2.D(nalUnitTargetBuffer5.d, NalUnitUtil.e(nalUnitTargetBuffer5.d, nalUnitTargetBuffer5.f18035e));
                        parsableByteArray2.G(5);
                        CeaUtil.a(j2, parsableByteArray2, trackOutputArr);
                    }
                    long j5 = this.m;
                    SampleReader sampleReader2 = this.d;
                    boolean z7 = this.f17999e;
                    sampleReader2.g = false;
                    sampleReader2.f18008h = false;
                    sampleReader2.f18007e = j5;
                    sampleReader2.d = 0;
                    sampleReader2.f18005b = j;
                    if (i9 >= 32 || i9 == 40) {
                        z3 = false;
                    } else {
                        if (!sampleReader2.f18009i || sampleReader2.j) {
                            z3 = false;
                        } else {
                            if (z7) {
                                long j6 = sampleReader2.f18010l;
                                if (j6 != -9223372036854775807L) {
                                    sampleReader2.f18004a.f(j6, sampleReader2.m ? 1 : 0, (int) (j - sampleReader2.k), i11, null);
                                }
                            }
                            z3 = false;
                            sampleReader2.f18009i = false;
                        }
                        if ((32 <= i9 && i9 <= 35) || i9 == 39) {
                            z4 = true;
                            sampleReader2.f18008h = !sampleReader2.j;
                            sampleReader2.j = true;
                        }
                        if (i9 >= 16 || i9 > 21) {
                            z5 = z3;
                        } else {
                            z5 = z4;
                        }
                        sampleReader2.f18006c = z5;
                        if (z5 || i9 <= 9) {
                            z3 = z4;
                        }
                        sampleReader2.f = z3;
                        if (!this.f17999e) {
                            nalUnitTargetBuffer3.d(i9);
                            nalUnitTargetBuffer2.d(i9);
                            nalUnitTargetBuffer.d(i9);
                        }
                        nalUnitTargetBuffer4.d(i9);
                        nalUnitTargetBuffer5.d(i9);
                        i7 = i7;
                        bArr = bArr;
                        i6 = i2;
                    }
                    z4 = true;
                    if (i9 >= 16) {
                        z5 = z3;
                    } else {
                        z5 = z3;
                    }
                    sampleReader2.f18006c = z5;
                    if (z5) {
                        z3 = z4;
                    } else {
                        z3 = z4;
                    }
                    sampleReader2.f = z3;
                    if (!this.f17999e) {
                        nalUnitTargetBuffer3.d(i9);
                        nalUnitTargetBuffer2.d(i9);
                        nalUnitTargetBuffer.d(i9);
                    }
                    nalUnitTargetBuffer4.d(i9);
                    nalUnitTargetBuffer5.d(i9);
                    i7 = i7;
                    bArr = bArr;
                    i6 = i2;
                }
                i2 = i8;
                i3 = i12;
                z2 = this.f17999e;
                nalUnitTargetBuffer = this.f18001i;
                nalUnitTargetBuffer2 = this.f18000h;
                nalUnitTargetBuffer3 = this.g;
                if (z2) {
                    i4 = i3;
                    nalUnitTargetBuffer3.b(i4);
                    nalUnitTargetBuffer2.b(i4);
                    nalUnitTargetBuffer.b(i4);
                    if (!nalUnitTargetBuffer3.f18034c) {
                    }
                } else {
                    i4 = i3;
                }
                nalUnitTargetBuffer4 = this.j;
                zB = nalUnitTargetBuffer4.b(i4);
                trackOutputArr = this.f17996a.f18068b;
                parsableByteArray2 = this.f18003n;
                if (zB) {
                    parsableByteArray2.D(nalUnitTargetBuffer4.d, NalUnitUtil.e(nalUnitTargetBuffer4.d, nalUnitTargetBuffer4.f18035e));
                    parsableByteArray2.G(5);
                    CeaUtil.a(j2, parsableByteArray2, trackOutputArr);
                }
                nalUnitTargetBuffer5 = this.k;
                if (nalUnitTargetBuffer5.b(i4)) {
                    parsableByteArray2.D(nalUnitTargetBuffer5.d, NalUnitUtil.e(nalUnitTargetBuffer5.d, nalUnitTargetBuffer5.f18035e));
                    parsableByteArray2.G(5);
                    CeaUtil.a(j2, parsableByteArray2, trackOutputArr);
                }
                long j7 = this.m;
                SampleReader sampleReader3 = this.d;
                boolean z8 = this.f17999e;
                sampleReader3.g = false;
                sampleReader3.f18008h = false;
                sampleReader3.f18007e = j7;
                sampleReader3.d = 0;
                sampleReader3.f18005b = j;
                if (i9 >= 32) {
                    z3 = false;
                    z4 = true;
                } else {
                    z3 = false;
                    z4 = true;
                }
                if (i9 >= 16) {
                    z5 = z3;
                } else {
                    z5 = z3;
                }
                sampleReader3.f18006c = z5;
                if (z5) {
                    z3 = z4;
                } else {
                    z3 = z4;
                }
                sampleReader3.f = z3;
                if (!this.f17999e) {
                    nalUnitTargetBuffer3.d(i9);
                    nalUnitTargetBuffer2.d(i9);
                    nalUnitTargetBuffer.d(i9);
                }
                nalUnitTargetBuffer4.d(i9);
                nalUnitTargetBuffer5.d(i9);
                i7 = i7;
                bArr = bArr;
                i6 = i2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void d(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f17997b = trackIdGenerator.f18100e;
        trackIdGenerator.b();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 2);
        this.f17998c = trackOutputTrack;
        this.d = new SampleReader(trackOutputTrack);
        this.f17996a.a(extractorOutput, trackIdGenerator);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.f18002l = 0L;
        this.m = -9223372036854775807L;
        NalUnitUtil.a(this.f);
        this.g.c();
        this.f18000h.c();
        this.f18001i.c();
        this.j.c();
        this.k.c();
        SampleReader sampleReader = this.d;
        if (sampleReader != null) {
            sampleReader.f = false;
            sampleReader.g = false;
            sampleReader.f18008h = false;
            sampleReader.f18009i = false;
            sampleReader.j = false;
        }
    }
}
