package androidx.media3.extractor.ts;

import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class H265Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SeiReader f7536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TrackOutput f7538c;
    public SampleReader d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7539e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7542l;
    public final boolean[] f = new boolean[3];
    public final NalUnitTargetBuffer g = new NalUnitTargetBuffer(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NalUnitTargetBuffer f7540h = new NalUnitTargetBuffer(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final NalUnitTargetBuffer f7541i = new NalUnitTargetBuffer(34);
    public final NalUnitTargetBuffer j = new NalUnitTargetBuffer(39);
    public final NalUnitTargetBuffer k = new NalUnitTargetBuffer(40);
    public long m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ParsableByteArray f7543n = new ParsableByteArray();

    public static final class SampleReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackOutput f7544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f7545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7546c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f7547e;
        public boolean f;
        public boolean g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f7548h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f7549i;
        public boolean j;
        public long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f7550l;
        public boolean m;

        public SampleReader(TrackOutput trackOutput) {
            this.f7544a = trackOutput;
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
        public final void a(int i2) {
            long j = this.f7550l;
            if (j == -9223372036854775807L) {
                return;
            }
            boolean z2 = this.m;
            this.f7544a.f(j, z2 ? 1 : 0, (int) (this.f7545b - this.k), i2, null);
        }
    }

    public H265Reader(SeiReader seiReader) {
        this.f7536a = seiReader;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0163  */
    /* JADX WARN: Code duplicated, block: B:46:0x017c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0197  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:80:0x0202  */
    /* JADX WARN: Code duplicated, block: B:83:0x0209  */
    /* JADX WARN: Code duplicated, block: B:91:0x0212 A[SYNTHETIC] */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) {
        boolean z2;
        NalUnitTargetBuffer nalUnitTargetBuffer;
        NalUnitTargetBuffer nalUnitTargetBuffer2;
        NalUnitTargetBuffer nalUnitTargetBuffer3;
        NalUnitTargetBuffer nalUnitTargetBuffer4;
        boolean zB;
        TrackOutput[] trackOutputArr;
        ParsableByteArray parsableByteArray2;
        NalUnitTargetBuffer nalUnitTargetBuffer5;
        boolean z3;
        boolean z4;
        boolean z5;
        Assertions.f(this.f7538c);
        int i2 = Util.f5683a;
        while (parsableByteArray.a() > 0) {
            int i3 = parsableByteArray.f5668b;
            int i4 = parsableByteArray.f5669c;
            byte[] bArr = parsableByteArray.f5667a;
            this.f7542l += (long) parsableByteArray.a();
            this.f7538c.e(parsableByteArray.a(), parsableByteArray);
            while (i3 < i4) {
                int iB = NalUnitUtil.b(bArr, i3, i4, this.f);
                if (iB == i4) {
                    b(i3, i4, bArr);
                    return;
                }
                int i5 = iB + 3;
                int i6 = (bArr[i5] & 126) >> 1;
                int i7 = iB - i3;
                if (i7 > 0) {
                    b(i3, iB, bArr);
                }
                int i8 = i4 - iB;
                long j = this.f7542l - ((long) i8);
                int i9 = i7 < 0 ? -i7 : 0;
                long j2 = this.m;
                SampleReader sampleReader = this.d;
                boolean z6 = this.f7539e;
                if (sampleReader.j && sampleReader.g) {
                    sampleReader.m = sampleReader.f7546c;
                    sampleReader.j = false;
                } else {
                    if (sampleReader.f7548h || sampleReader.g) {
                        if (z6 && sampleReader.f7549i) {
                            sampleReader.a(((int) (j - sampleReader.f7545b)) + i8);
                        }
                        sampleReader.k = sampleReader.f7545b;
                        sampleReader.f7550l = sampleReader.f7547e;
                        sampleReader.m = sampleReader.f7546c;
                        sampleReader.f7549i = true;
                    }
                    z2 = this.f7539e;
                    nalUnitTargetBuffer = this.f7541i;
                    nalUnitTargetBuffer2 = this.f7540h;
                    nalUnitTargetBuffer3 = this.g;
                    if (!z2) {
                        nalUnitTargetBuffer3.b(i9);
                        nalUnitTargetBuffer2.b(i9);
                        nalUnitTargetBuffer.b(i9);
                        if (!nalUnitTargetBuffer3.f7587c && nalUnitTargetBuffer2.f7587c && nalUnitTargetBuffer.f7587c) {
                            TrackOutput trackOutput = this.f7538c;
                            String str = this.f7537b;
                            int i10 = nalUnitTargetBuffer3.f7588e;
                            byte[] bArr2 = new byte[nalUnitTargetBuffer2.f7588e + i10 + nalUnitTargetBuffer.f7588e];
                            System.arraycopy(nalUnitTargetBuffer3.d, 0, bArr2, 0, i10);
                            System.arraycopy(nalUnitTargetBuffer2.d, 0, bArr2, nalUnitTargetBuffer3.f7588e, nalUnitTargetBuffer2.f7588e);
                            System.arraycopy(nalUnitTargetBuffer.d, 0, bArr2, nalUnitTargetBuffer3.f7588e + nalUnitTargetBuffer2.f7588e, nalUnitTargetBuffer.f7588e);
                            NalUnitUtil.H265SpsData h265SpsDataC = NalUnitUtil.c(3, nalUnitTargetBuffer2.f7588e, nalUnitTargetBuffer2.d);
                            String strA = CodecSpecificDataUtil.a(h265SpsDataC.f5698a, h265SpsDataC.f5699b, h265SpsDataC.f5700c, h265SpsDataC.d, h265SpsDataC.g, h265SpsDataC.f5702h);
                            Format.Builder builder = new Format.Builder();
                            builder.f5423a = str;
                            builder.f5429l = MimeTypes.l("video/hevc");
                            builder.f5428i = strA;
                            builder.r = h265SpsDataC.f5703i;
                            builder.s = h265SpsDataC.j;
                            ColorInfo.Builder builder2 = new ColorInfo.Builder();
                            builder2.f5387a = h265SpsDataC.m;
                            builder2.f5388b = h265SpsDataC.f5705n;
                            builder2.f5389c = h265SpsDataC.o;
                            builder2.f5390e = h265SpsDataC.f5701e + 8;
                            builder2.f = h265SpsDataC.f + 8;
                            builder.y = builder2.a();
                            builder.v = h265SpsDataC.k;
                            builder.f5430n = h265SpsDataC.f5704l;
                            builder.o = Collections.singletonList(bArr2);
                            trackOutput.b(new Format(builder));
                            this.f7539e = true;
                        }
                    }
                    nalUnitTargetBuffer4 = this.j;
                    zB = nalUnitTargetBuffer4.b(i9);
                    trackOutputArr = this.f7536a.f7621b;
                    parsableByteArray2 = this.f7543n;
                    if (zB) {
                        parsableByteArray2.E(nalUnitTargetBuffer4.d, NalUnitUtil.f(nalUnitTargetBuffer4.d, nalUnitTargetBuffer4.f7588e));
                        parsableByteArray2.H(5);
                        CeaUtil.a(j2, parsableByteArray2, trackOutputArr);
                    }
                    nalUnitTargetBuffer5 = this.k;
                    if (nalUnitTargetBuffer5.b(i9)) {
                        parsableByteArray2.E(nalUnitTargetBuffer5.d, NalUnitUtil.f(nalUnitTargetBuffer5.d, nalUnitTargetBuffer5.f7588e));
                        parsableByteArray2.H(5);
                        CeaUtil.a(j2, parsableByteArray2, trackOutputArr);
                    }
                    long j3 = this.m;
                    SampleReader sampleReader2 = this.d;
                    boolean z7 = this.f7539e;
                    sampleReader2.g = false;
                    sampleReader2.f7548h = false;
                    sampleReader2.f7547e = j3;
                    sampleReader2.d = 0;
                    sampleReader2.f7545b = j;
                    if (i6 >= 32 || i6 == 40) {
                        z3 = false;
                    } else {
                        if (!sampleReader2.f7549i || sampleReader2.j) {
                            z3 = false;
                        } else {
                            if (z7) {
                                sampleReader2.a(i8);
                            }
                            z3 = false;
                            sampleReader2.f7549i = false;
                        }
                        if ((32 <= i6 && i6 <= 35) || i6 == 39) {
                            z4 = true;
                            sampleReader2.f7548h = !sampleReader2.j;
                            sampleReader2.j = true;
                        }
                        if (i6 >= 16 || i6 > 21) {
                            z5 = z3;
                        } else {
                            z5 = z4;
                        }
                        sampleReader2.f7546c = z5;
                        if (z5 || i6 <= 9) {
                            z3 = z4;
                        }
                        sampleReader2.f = z3;
                        if (!this.f7539e) {
                            nalUnitTargetBuffer3.d(i6);
                            nalUnitTargetBuffer2.d(i6);
                            nalUnitTargetBuffer.d(i6);
                        }
                        nalUnitTargetBuffer4.d(i6);
                        nalUnitTargetBuffer5.d(i6);
                        i3 = i5;
                        i4 = i4;
                        bArr = bArr;
                    }
                    z4 = true;
                    if (i6 >= 16) {
                        z5 = z3;
                    } else {
                        z5 = z3;
                    }
                    sampleReader2.f7546c = z5;
                    if (z5) {
                        z3 = z4;
                    } else {
                        z3 = z4;
                    }
                    sampleReader2.f = z3;
                    if (!this.f7539e) {
                        nalUnitTargetBuffer3.d(i6);
                        nalUnitTargetBuffer2.d(i6);
                        nalUnitTargetBuffer.d(i6);
                    }
                    nalUnitTargetBuffer4.d(i6);
                    nalUnitTargetBuffer5.d(i6);
                    i3 = i5;
                    i4 = i4;
                    bArr = bArr;
                }
                i5 = i5;
                z2 = this.f7539e;
                nalUnitTargetBuffer = this.f7541i;
                nalUnitTargetBuffer2 = this.f7540h;
                nalUnitTargetBuffer3 = this.g;
                if (!z2) {
                    nalUnitTargetBuffer3.b(i9);
                    nalUnitTargetBuffer2.b(i9);
                    nalUnitTargetBuffer.b(i9);
                    if (!nalUnitTargetBuffer3.f7587c) {
                    }
                }
                nalUnitTargetBuffer4 = this.j;
                zB = nalUnitTargetBuffer4.b(i9);
                trackOutputArr = this.f7536a.f7621b;
                parsableByteArray2 = this.f7543n;
                if (zB) {
                    parsableByteArray2.E(nalUnitTargetBuffer4.d, NalUnitUtil.f(nalUnitTargetBuffer4.d, nalUnitTargetBuffer4.f7588e));
                    parsableByteArray2.H(5);
                    CeaUtil.a(j2, parsableByteArray2, trackOutputArr);
                }
                nalUnitTargetBuffer5 = this.k;
                if (nalUnitTargetBuffer5.b(i9)) {
                    parsableByteArray2.E(nalUnitTargetBuffer5.d, NalUnitUtil.f(nalUnitTargetBuffer5.d, nalUnitTargetBuffer5.f7588e));
                    parsableByteArray2.H(5);
                    CeaUtil.a(j2, parsableByteArray2, trackOutputArr);
                }
                long j4 = this.m;
                SampleReader sampleReader3 = this.d;
                boolean z8 = this.f7539e;
                sampleReader3.g = false;
                sampleReader3.f7548h = false;
                sampleReader3.f7547e = j4;
                sampleReader3.d = 0;
                sampleReader3.f7545b = j;
                if (i6 >= 32) {
                    z3 = false;
                    z4 = true;
                } else {
                    z3 = false;
                    z4 = true;
                }
                if (i6 >= 16) {
                    z5 = z3;
                } else {
                    z5 = z3;
                }
                sampleReader3.f7546c = z5;
                if (z5) {
                    z3 = z4;
                } else {
                    z3 = z4;
                }
                sampleReader3.f = z3;
                if (!this.f7539e) {
                    nalUnitTargetBuffer3.d(i6);
                    nalUnitTargetBuffer2.d(i6);
                    nalUnitTargetBuffer.d(i6);
                }
                nalUnitTargetBuffer4.d(i6);
                nalUnitTargetBuffer5.d(i6);
                i3 = i5;
                i4 = i4;
                bArr = bArr;
            }
        }
    }

    public final void b(int i2, int i3, byte[] bArr) {
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
        if (!this.f7539e) {
            this.g.a(bArr, i2, i3);
            this.f7540h.a(bArr, i2, i3);
            this.f7541i.a(bArr, i2, i3);
        }
        this.j.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        this.m = j;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(boolean z2) {
        Assertions.f(this.f7538c);
        int i2 = Util.f5683a;
        if (z2) {
            SampleReader sampleReader = this.d;
            long j = this.f7542l;
            sampleReader.m = sampleReader.f7546c;
            sampleReader.a((int) (j - sampleReader.f7545b));
            sampleReader.k = sampleReader.f7545b;
            sampleReader.f7545b = j;
            sampleReader.a(0);
            sampleReader.f7549i = false;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f7537b = trackIdGenerator.f7653e;
        trackIdGenerator.b();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 2);
        this.f7538c = trackOutputTrack;
        this.d = new SampleReader(trackOutputTrack);
        this.f7536a.a(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.f7542l = 0L;
        this.m = -9223372036854775807L;
        NalUnitUtil.a(this.f);
        this.g.c();
        this.f7540h.c();
        this.f7541i.c();
        this.j.c();
        this.k.c();
        SampleReader sampleReader = this.d;
        if (sampleReader != null) {
            sampleReader.f = false;
            sampleReader.g = false;
            sampleReader.f7548h = false;
            sampleReader.f7549i = false;
            sampleReader.j = false;
        }
    }
}
