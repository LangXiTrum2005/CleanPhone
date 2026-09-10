package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.ParsableNalUnitBitArray;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class H264Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SeiReader f7510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7512c;
    public long g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f7515i;
    public TrackOutput j;
    public SampleReader k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7516l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7517n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f7514h = new boolean[3];
    public final NalUnitTargetBuffer d = new NalUnitTargetBuffer(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NalUnitTargetBuffer f7513e = new NalUnitTargetBuffer(8);
    public final NalUnitTargetBuffer f = new NalUnitTargetBuffer(6);
    public long m = -9223372036854775807L;
    public final ParsableByteArray o = new ParsableByteArray();

    public static final class SampleReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackOutput f7518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f7520c;
        public final ParsableNalUnitBitArray f;
        public byte[] g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7522h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7523i;
        public long j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f7524l;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f7526p;
        public long q;
        public boolean r;
        public boolean s;
        public final SparseArray d = new SparseArray();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray f7521e = new SparseArray();
        public SliceHeaderData m = new SliceHeaderData();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public SliceHeaderData f7525n = new SliceHeaderData();
        public boolean k = false;
        public boolean o = false;

        public static final class SliceHeaderData {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f7527a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f7528b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public NalUnitUtil.SpsData f7529c;
            public int d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f7530e;
            public int f;
            public int g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f7531h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f7532i;
            public boolean j;
            public boolean k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f7533l;
            public int m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f7534n;
            public int o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public int f7535p;
        }

        public SampleReader(TrackOutput trackOutput, boolean z2, boolean z3) {
            this.f7518a = trackOutput;
            this.f7519b = z2;
            this.f7520c = z3;
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new ParsableNalUnitBitArray(bArr, 0, 0);
            SliceHeaderData sliceHeaderData = this.f7525n;
            sliceHeaderData.f7528b = false;
            sliceHeaderData.f7527a = false;
        }

        public final void a() {
            boolean z2;
            int i2;
            boolean z3 = false;
            if (this.f7519b) {
                SliceHeaderData sliceHeaderData = this.f7525n;
                z2 = sliceHeaderData.f7528b && ((i2 = sliceHeaderData.f7530e) == 7 || i2 == 2);
            } else {
                z2 = this.s;
            }
            boolean z4 = this.r;
            int i3 = this.f7523i;
            if (i3 == 5 || (z2 && i3 == 1)) {
                z3 = true;
            }
            this.r = z4 | z3;
        }
    }

    public H264Reader(SeiReader seiReader, boolean z2, boolean z3) {
        this.f7510a = seiReader;
        this.f7511b = z2;
        this.f7512c = z3;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0262  */
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
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void a(ParsableByteArray parsableByteArray) {
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        long j;
        char c2;
        boolean z2;
        long j2;
        int i5;
        long j3;
        int i6;
        int i7;
        boolean z3;
        char c3 = 3;
        Assertions.f(this.j);
        int i8 = Util.f5683a;
        int i9 = parsableByteArray.f5668b;
        int i10 = parsableByteArray.f5669c;
        byte[] bArr2 = parsableByteArray.f5667a;
        this.g += (long) parsableByteArray.a();
        this.j.e(parsableByteArray.a(), parsableByteArray);
        while (true) {
            int iB = NalUnitUtil.b(bArr2, i9, i10, this.f7514h);
            if (iB == i10) {
                b(bArr2, i9, i10);
                return;
            }
            int i11 = iB + 3;
            int i12 = bArr2[i11] & 31;
            int i13 = iB - i9;
            if (i13 > 0) {
                b(bArr2, i9, iB);
            }
            int i14 = i10 - iB;
            long j4 = this.g - ((long) i14);
            int i15 = i13 < 0 ? -i13 : 0;
            long j5 = this.m;
            boolean z4 = this.f7516l;
            NalUnitTargetBuffer nalUnitTargetBuffer = this.f7513e;
            NalUnitTargetBuffer nalUnitTargetBuffer2 = this.d;
            if (!z4 || this.k.f7520c) {
                nalUnitTargetBuffer2.b(i15);
                nalUnitTargetBuffer.b(i15);
                if (this.f7516l) {
                    i2 = i14;
                    i3 = i10;
                    bArr = bArr2;
                    i4 = i11;
                    j = j4;
                    if (nalUnitTargetBuffer2.f7587c) {
                        c2 = 3;
                        NalUnitUtil.SpsData spsDataD = NalUnitUtil.d(3, nalUnitTargetBuffer2.f7588e, nalUnitTargetBuffer2.d);
                        this.k.d.append(spsDataD.d, spsDataD);
                        nalUnitTargetBuffer2.c();
                    } else {
                        c2 = 3;
                        if (nalUnitTargetBuffer.f7587c) {
                            ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(nalUnitTargetBuffer.d, 4, nalUnitTargetBuffer.f7588e);
                            int iF = parsableNalUnitBitArray.f();
                            int iF2 = parsableNalUnitBitArray.f();
                            parsableNalUnitBitArray.i();
                            this.k.f7521e.append(iF, new NalUnitUtil.PpsData(iF, iF2, parsableNalUnitBitArray.d()));
                            nalUnitTargetBuffer.c();
                        }
                    }
                } else if (nalUnitTargetBuffer2.f7587c && nalUnitTargetBuffer.f7587c) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(nalUnitTargetBuffer2.d, nalUnitTargetBuffer2.f7588e));
                    arrayList.add(Arrays.copyOf(nalUnitTargetBuffer.d, nalUnitTargetBuffer.f7588e));
                    i2 = i14;
                    NalUnitUtil.SpsData spsDataD2 = NalUnitUtil.d(3, nalUnitTargetBuffer2.f7588e, nalUnitTargetBuffer2.d);
                    i3 = i10;
                    bArr = bArr2;
                    ParsableNalUnitBitArray parsableNalUnitBitArray2 = new ParsableNalUnitBitArray(nalUnitTargetBuffer.d, 4, nalUnitTargetBuffer.f7588e);
                    int iF3 = parsableNalUnitBitArray2.f();
                    int iF4 = parsableNalUnitBitArray2.f();
                    parsableNalUnitBitArray2.i();
                    NalUnitUtil.PpsData ppsData = new NalUnitUtil.PpsData(iF3, iF4, parsableNalUnitBitArray2.d());
                    i4 = i11;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(spsDataD2.f5708a), Integer.valueOf(spsDataD2.f5709b), Integer.valueOf(spsDataD2.f5710c));
                    TrackOutput trackOutput = this.j;
                    Format.Builder builder = new Format.Builder();
                    j = j4;
                    builder.f5423a = this.f7515i;
                    builder.f5429l = MimeTypes.l("video/avc");
                    builder.f5428i = str;
                    builder.r = spsDataD2.f5711e;
                    builder.s = spsDataD2.f;
                    ColorInfo.Builder builder2 = new ColorInfo.Builder();
                    builder2.f5387a = spsDataD2.f5716p;
                    builder2.f5388b = spsDataD2.q;
                    builder2.f5389c = spsDataD2.r;
                    builder2.f5390e = spsDataD2.f5712h + 8;
                    builder2.f = spsDataD2.f5713i + 8;
                    builder.y = builder2.a();
                    builder.v = spsDataD2.g;
                    builder.o = arrayList;
                    builder.f5430n = spsDataD2.s;
                    trackOutput.b(new Format(builder));
                    this.f7516l = true;
                    this.k.d.append(spsDataD2.d, spsDataD2);
                    this.k.f7521e.append(iF3, ppsData);
                    nalUnitTargetBuffer2.c();
                    nalUnitTargetBuffer.c();
                    c2 = 3;
                } else {
                    i2 = i14;
                    i3 = i10;
                    bArr = bArr2;
                    i4 = i11;
                    j = j4;
                    c2 = c3;
                }
            } else {
                i2 = i14;
                i3 = i10;
                bArr = bArr2;
                i4 = i11;
                j = j4;
                c2 = c3;
            }
            NalUnitTargetBuffer nalUnitTargetBuffer3 = this.f;
            if (nalUnitTargetBuffer3.b(i15)) {
                int iF5 = NalUnitUtil.f(nalUnitTargetBuffer3.d, nalUnitTargetBuffer3.f7588e);
                byte[] bArr3 = nalUnitTargetBuffer3.d;
                ParsableByteArray parsableByteArray2 = this.o;
                parsableByteArray2.E(bArr3, iF5);
                parsableByteArray2.G(4);
                CeaUtil.a(j5, parsableByteArray2, this.f7510a.f7621b);
            }
            SampleReader sampleReader = this.k;
            boolean z5 = this.f7516l;
            if (sampleReader.f7523i == 9) {
                if (z5 && sampleReader.o) {
                    j2 = sampleReader.j;
                    i5 = i2 + ((int) (j - j2));
                    j3 = sampleReader.q;
                    if (j3 != -9223372036854775807L) {
                        sampleReader.f7518a.f(j3, sampleReader.r ? 1 : 0, (int) (j2 - sampleReader.f7526p), i5, null);
                    }
                }
                sampleReader.f7526p = sampleReader.j;
                sampleReader.q = sampleReader.f7524l;
                z2 = false;
                sampleReader.r = false;
                sampleReader.o = true;
            } else {
                if (sampleReader.f7520c) {
                    SampleReader.SliceHeaderData sliceHeaderData = sampleReader.f7525n;
                    SampleReader.SliceHeaderData sliceHeaderData2 = sampleReader.m;
                    if (sliceHeaderData.f7527a) {
                        if (sliceHeaderData2.f7527a) {
                            NalUnitUtil.SpsData spsData = sliceHeaderData.f7529c;
                            Assertions.f(spsData);
                            NalUnitUtil.SpsData spsData2 = sliceHeaderData2.f7529c;
                            Assertions.f(spsData2);
                            if (sliceHeaderData.f == sliceHeaderData2.f && sliceHeaderData.g == sliceHeaderData2.g && sliceHeaderData.f7531h == sliceHeaderData2.f7531h && ((!sliceHeaderData.f7532i || !sliceHeaderData2.f7532i || sliceHeaderData.j == sliceHeaderData2.j) && ((i6 = sliceHeaderData.d) == (i7 = sliceHeaderData2.d) || (i6 != 0 && i7 != 0)))) {
                                int i16 = spsData2.m;
                                int i17 = spsData.m;
                                if ((i17 != 0 || i16 != 0 || (sliceHeaderData.m == sliceHeaderData2.m && sliceHeaderData.f7534n == sliceHeaderData2.f7534n)) && ((i17 != 1 || i16 != 1 || (sliceHeaderData.o == sliceHeaderData2.o && sliceHeaderData.f7535p == sliceHeaderData2.f7535p)) && (z3 = sliceHeaderData.k) == sliceHeaderData2.k && (!z3 || sliceHeaderData.f7533l == sliceHeaderData2.f7533l))) {
                                }
                            }
                        }
                        if (z5) {
                            j2 = sampleReader.j;
                            i5 = i2 + ((int) (j - j2));
                            j3 = sampleReader.q;
                            if (j3 != -9223372036854775807L) {
                                sampleReader.f7518a.f(j3, sampleReader.r ? 1 : 0, (int) (j2 - sampleReader.f7526p), i5, null);
                            }
                        }
                        sampleReader.f7526p = sampleReader.j;
                        sampleReader.q = sampleReader.f7524l;
                        z2 = false;
                        sampleReader.r = false;
                        sampleReader.o = true;
                    }
                }
                z2 = false;
            }
            sampleReader.a();
            if (sampleReader.r) {
                this.f7517n = z2;
            }
            long j6 = this.m;
            if (!this.f7516l || this.k.f7520c) {
                nalUnitTargetBuffer2.d(i12);
                nalUnitTargetBuffer.d(i12);
            }
            nalUnitTargetBuffer3.d(i12);
            SampleReader sampleReader2 = this.k;
            boolean z6 = this.f7517n;
            sampleReader2.f7523i = i12;
            sampleReader2.f7524l = j6;
            sampleReader2.j = j;
            sampleReader2.s = z6;
            if ((sampleReader2.f7519b && i12 == 1) || (sampleReader2.f7520c && (i12 == 5 || i12 == 1 || i12 == 2))) {
                SampleReader.SliceHeaderData sliceHeaderData3 = sampleReader2.m;
                sampleReader2.m = sampleReader2.f7525n;
                sampleReader2.f7525n = sliceHeaderData3;
                sliceHeaderData3.f7528b = false;
                sliceHeaderData3.f7527a = false;
                sampleReader2.f7522h = 0;
                sampleReader2.k = true;
            }
            c3 = c2;
            i10 = i3;
            bArr2 = bArr;
            i9 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX WARN: Code duplicated, block: B:61:0x0103  */
    /* JADX WARN: Code duplicated, block: B:64:0x010a  */
    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:80:0x013a  */
    public final void b(byte[] bArr, int i2, int i3) {
        boolean zD;
        boolean zD2;
        boolean z2;
        boolean z3;
        int iF;
        boolean z4;
        int i4;
        int iE;
        int i5;
        int iG;
        int iG2;
        int i6;
        if (!this.f7516l || this.k.f7520c) {
            this.d.a(bArr, i2, i3);
            this.f7513e.a(bArr, i2, i3);
        }
        this.f.a(bArr, i2, i3);
        SampleReader sampleReader = this.k;
        if (sampleReader.k) {
            int i7 = i3 - i2;
            byte[] bArr2 = sampleReader.g;
            int length = bArr2.length;
            int i8 = sampleReader.f7522h + i7;
            if (length < i8) {
                sampleReader.g = Arrays.copyOf(bArr2, i8 * 2);
            }
            System.arraycopy(bArr, i2, sampleReader.g, sampleReader.f7522h, i7);
            int i9 = sampleReader.f7522h + i7;
            sampleReader.f7522h = i9;
            byte[] bArr3 = sampleReader.g;
            ParsableNalUnitBitArray parsableNalUnitBitArray = sampleReader.f;
            parsableNalUnitBitArray.f5717a = bArr3;
            parsableNalUnitBitArray.f5719c = 0;
            parsableNalUnitBitArray.f5718b = i9;
            parsableNalUnitBitArray.d = 0;
            parsableNalUnitBitArray.a();
            if (parsableNalUnitBitArray.b(8)) {
                parsableNalUnitBitArray.i();
                int iE2 = parsableNalUnitBitArray.e(2);
                parsableNalUnitBitArray.j(5);
                if (parsableNalUnitBitArray.c()) {
                    parsableNalUnitBitArray.f();
                    if (parsableNalUnitBitArray.c()) {
                        int iF2 = parsableNalUnitBitArray.f();
                        if (!sampleReader.f7520c) {
                            sampleReader.k = false;
                            SampleReader.SliceHeaderData sliceHeaderData = sampleReader.f7525n;
                            sliceHeaderData.f7530e = iF2;
                            sliceHeaderData.f7528b = true;
                            return;
                        }
                        if (parsableNalUnitBitArray.c()) {
                            int iF3 = parsableNalUnitBitArray.f();
                            SparseArray sparseArray = sampleReader.f7521e;
                            if (sparseArray.indexOfKey(iF3) < 0) {
                                sampleReader.k = false;
                                return;
                            }
                            NalUnitUtil.PpsData ppsData = (NalUnitUtil.PpsData) sparseArray.get(iF3);
                            NalUnitUtil.SpsData spsData = (NalUnitUtil.SpsData) sampleReader.d.get(ppsData.f5706a);
                            if (spsData.j) {
                                if (!parsableNalUnitBitArray.b(2)) {
                                    return;
                                } else {
                                    parsableNalUnitBitArray.j(2);
                                }
                            }
                            int i10 = spsData.f5714l;
                            if (parsableNalUnitBitArray.b(i10)) {
                                int iE3 = parsableNalUnitBitArray.e(i10);
                                if (!spsData.k) {
                                    if (parsableNalUnitBitArray.b(1)) {
                                        zD = parsableNalUnitBitArray.d();
                                        if (!zD) {
                                            zD2 = false;
                                        } else {
                                            if (!parsableNalUnitBitArray.b(1)) {
                                                return;
                                            }
                                            zD2 = parsableNalUnitBitArray.d();
                                            z2 = true;
                                        }
                                        if (sampleReader.f7523i == 5) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            iF = 0;
                                        } else if (!parsableNalUnitBitArray.c()) {
                                            return;
                                        } else {
                                            iF = parsableNalUnitBitArray.f();
                                        }
                                        z4 = ppsData.f5707b;
                                        i4 = spsData.m;
                                        if (i4 == 0) {
                                            i6 = spsData.f5715n;
                                            if (!parsableNalUnitBitArray.b(i6)) {
                                                return;
                                            }
                                            iE = parsableNalUnitBitArray.e(i6);
                                            if (z4 || zD) {
                                                i5 = 0;
                                                iG = 0;
                                                iG2 = 0;
                                            } else {
                                                if (!parsableNalUnitBitArray.c()) {
                                                    return;
                                                }
                                                iG2 = parsableNalUnitBitArray.g();
                                                i5 = 0;
                                                iG = 0;
                                            }
                                        } else if (i4 == 1 || spsData.o) {
                                            iE = 0;
                                            i5 = 0;
                                            iG = 0;
                                            iG2 = 0;
                                        } else {
                                            if (!parsableNalUnitBitArray.c()) {
                                                return;
                                            }
                                            int iG3 = parsableNalUnitBitArray.g();
                                            if (!z4 || zD) {
                                                i5 = iG3;
                                                iE = 0;
                                                iG = 0;
                                                iG2 = 0;
                                            } else {
                                                if (!parsableNalUnitBitArray.c()) {
                                                    return;
                                                }
                                                iG = parsableNalUnitBitArray.g();
                                                iG2 = 0;
                                                i5 = iG3;
                                                iE = 0;
                                            }
                                        }
                                        SampleReader.SliceHeaderData sliceHeaderData2 = sampleReader.f7525n;
                                        sliceHeaderData2.f7529c = spsData;
                                        sliceHeaderData2.d = iE2;
                                        sliceHeaderData2.f7530e = iF2;
                                        sliceHeaderData2.f = iE3;
                                        sliceHeaderData2.g = iF3;
                                        sliceHeaderData2.f7531h = zD;
                                        sliceHeaderData2.f7532i = z2;
                                        sliceHeaderData2.j = zD2;
                                        sliceHeaderData2.k = z3;
                                        sliceHeaderData2.f7533l = iF;
                                        sliceHeaderData2.m = iE;
                                        sliceHeaderData2.f7534n = iG2;
                                        sliceHeaderData2.o = i5;
                                        sliceHeaderData2.f7535p = iG;
                                        sliceHeaderData2.f7527a = true;
                                        sliceHeaderData2.f7528b = true;
                                        sampleReader.k = false;
                                    }
                                    return;
                                }
                                zD = false;
                                zD2 = false;
                                z2 = zD2;
                                if (sampleReader.f7523i == 5) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    iF = 0;
                                } else if (!parsableNalUnitBitArray.c()) {
                                    return;
                                } else {
                                    iF = parsableNalUnitBitArray.f();
                                }
                                z4 = ppsData.f5707b;
                                i4 = spsData.m;
                                if (i4 == 0) {
                                    i6 = spsData.f5715n;
                                    if (!parsableNalUnitBitArray.b(i6)) {
                                        return;
                                    }
                                    iE = parsableNalUnitBitArray.e(i6);
                                    if (z4) {
                                    }
                                    i5 = 0;
                                    iG = 0;
                                    iG2 = 0;
                                } else {
                                    if (i4 == 1) {
                                    }
                                    iE = 0;
                                    i5 = 0;
                                    iG = 0;
                                    iG2 = 0;
                                }
                                SampleReader.SliceHeaderData sliceHeaderData3 = sampleReader.f7525n;
                                sliceHeaderData3.f7529c = spsData;
                                sliceHeaderData3.d = iE2;
                                sliceHeaderData3.f7530e = iF2;
                                sliceHeaderData3.f = iE3;
                                sliceHeaderData3.g = iF3;
                                sliceHeaderData3.f7531h = zD;
                                sliceHeaderData3.f7532i = z2;
                                sliceHeaderData3.j = zD2;
                                sliceHeaderData3.k = z3;
                                sliceHeaderData3.f7533l = iF;
                                sliceHeaderData3.m = iE;
                                sliceHeaderData3.f7534n = iG2;
                                sliceHeaderData3.o = i5;
                                sliceHeaderData3.f7535p = iG;
                                sliceHeaderData3.f7527a = true;
                                sliceHeaderData3.f7528b = true;
                                sampleReader.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        this.m = j;
        this.f7517n = ((i2 & 2) != 0) | this.f7517n;
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
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void d(boolean z2) {
        Assertions.f(this.j);
        int i2 = Util.f5683a;
        if (z2) {
            SampleReader sampleReader = this.k;
            long j = this.g;
            sampleReader.a();
            sampleReader.j = j;
            long j2 = sampleReader.q;
            if (j2 != -9223372036854775807L) {
                boolean z3 = sampleReader.r;
                sampleReader.f7518a.f(j2, z3 ? 1 : 0, (int) (j - sampleReader.f7526p), 0, null);
            }
            sampleReader.o = false;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f7515i = trackIdGenerator.f7653e;
        trackIdGenerator.b();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 2);
        this.j = trackOutputTrack;
        this.k = new SampleReader(trackOutputTrack, this.f7511b, this.f7512c);
        this.f7510a.a(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.g = 0L;
        this.f7517n = false;
        this.m = -9223372036854775807L;
        NalUnitUtil.a(this.f7514h);
        this.d.c();
        this.f7513e.c();
        this.f.c();
        SampleReader sampleReader = this.k;
        if (sampleReader != null) {
            sampleReader.k = false;
            sampleReader.o = false;
            SampleReader.SliceHeaderData sliceHeaderData = sampleReader.f7525n;
            sliceHeaderData.f7528b = false;
            sliceHeaderData.f7527a = false;
        }
    }
}
