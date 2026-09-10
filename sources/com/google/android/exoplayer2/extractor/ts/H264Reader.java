package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.CeaUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.ParsableNalUnitBitArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class H264Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SeiReader f17970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17972c;
    public long g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f17975i;
    public TrackOutput j;
    public SampleReader k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17976l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17977n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f17974h = new boolean[3];
    public final NalUnitTargetBuffer d = new NalUnitTargetBuffer(7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NalUnitTargetBuffer f17973e = new NalUnitTargetBuffer(8);
    public final NalUnitTargetBuffer f = new NalUnitTargetBuffer(6);
    public long m = -9223372036854775807L;
    public final ParsableByteArray o = new ParsableByteArray();

    public static final class SampleReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackOutput f17978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f17979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f17980c;
        public final ParsableNalUnitBitArray f;
        public byte[] g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f17982h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f17983i;
        public long j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f17984l;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f17986p;
        public long q;
        public boolean r;
        public final SparseArray d = new SparseArray();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray f17981e = new SparseArray();
        public SliceHeaderData m = new SliceHeaderData();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public SliceHeaderData f17985n = new SliceHeaderData();
        public boolean k = false;
        public boolean o = false;

        public static final class SliceHeaderData {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f17987a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f17988b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public NalUnitUtil.SpsData f17989c;
            public int d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f17990e;
            public int f;
            public int g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f17991h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f17992i;
            public boolean j;
            public boolean k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f17993l;
            public int m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f17994n;
            public int o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public int f17995p;
        }

        public SampleReader(TrackOutput trackOutput, boolean z2, boolean z3) {
            this.f17978a = trackOutput;
            this.f17979b = z2;
            this.f17980c = z3;
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new ParsableNalUnitBitArray(bArr, 0, 0);
            SliceHeaderData sliceHeaderData = this.f17985n;
            sliceHeaderData.f17988b = false;
            sliceHeaderData.f17987a = false;
        }
    }

    public H264Reader(SeiReader seiReader, boolean z2, boolean z3) {
        this.f17970a = seiReader;
        this.f17971b = z2;
        this.f17972c = z3;
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
    public final void a(byte[] bArr, int i2, int i3) {
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
        if (!this.f17976l || this.k.f17980c) {
            this.d.a(bArr, i2, i3);
            this.f17973e.a(bArr, i2, i3);
        }
        this.f.a(bArr, i2, i3);
        SampleReader sampleReader = this.k;
        if (sampleReader.k) {
            int i7 = i3 - i2;
            byte[] bArr2 = sampleReader.g;
            int length = bArr2.length;
            int i8 = sampleReader.f17982h + i7;
            if (length < i8) {
                sampleReader.g = Arrays.copyOf(bArr2, i8 * 2);
            }
            System.arraycopy(bArr, i2, sampleReader.g, sampleReader.f17982h, i7);
            int i9 = sampleReader.f17982h + i7;
            sampleReader.f17982h = i9;
            byte[] bArr3 = sampleReader.g;
            ParsableNalUnitBitArray parsableNalUnitBitArray = sampleReader.f;
            parsableNalUnitBitArray.f18959a = bArr3;
            parsableNalUnitBitArray.f18961c = 0;
            parsableNalUnitBitArray.f18960b = i9;
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
                        if (!sampleReader.f17980c) {
                            sampleReader.k = false;
                            SampleReader.SliceHeaderData sliceHeaderData = sampleReader.f17985n;
                            sliceHeaderData.f17990e = iF2;
                            sliceHeaderData.f17988b = true;
                            return;
                        }
                        if (parsableNalUnitBitArray.c()) {
                            int iF3 = parsableNalUnitBitArray.f();
                            SparseArray sparseArray = sampleReader.f17981e;
                            if (sparseArray.indexOfKey(iF3) < 0) {
                                sampleReader.k = false;
                                return;
                            }
                            NalUnitUtil.PpsData ppsData = (NalUnitUtil.PpsData) sparseArray.get(iF3);
                            NalUnitUtil.SpsData spsData = (NalUnitUtil.SpsData) sampleReader.d.get(ppsData.f18937a);
                            if (spsData.f18943h) {
                                if (!parsableNalUnitBitArray.b(2)) {
                                    return;
                                } else {
                                    parsableNalUnitBitArray.j(2);
                                }
                            }
                            int i10 = spsData.j;
                            if (parsableNalUnitBitArray.b(i10)) {
                                int iE3 = parsableNalUnitBitArray.e(i10);
                                if (!spsData.f18944i) {
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
                                        if (sampleReader.f17983i == 5) {
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
                                        z4 = ppsData.f18938b;
                                        i4 = spsData.k;
                                        if (i4 == 0) {
                                            i6 = spsData.f18945l;
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
                                        } else if (i4 == 1 || spsData.m) {
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
                                        SampleReader.SliceHeaderData sliceHeaderData2 = sampleReader.f17985n;
                                        sliceHeaderData2.f17989c = spsData;
                                        sliceHeaderData2.d = iE2;
                                        sliceHeaderData2.f17990e = iF2;
                                        sliceHeaderData2.f = iE3;
                                        sliceHeaderData2.g = iF3;
                                        sliceHeaderData2.f17991h = zD;
                                        sliceHeaderData2.f17992i = z2;
                                        sliceHeaderData2.j = zD2;
                                        sliceHeaderData2.k = z3;
                                        sliceHeaderData2.f17993l = iF;
                                        sliceHeaderData2.m = iE;
                                        sliceHeaderData2.f17994n = iG2;
                                        sliceHeaderData2.o = i5;
                                        sliceHeaderData2.f17995p = iG;
                                        sliceHeaderData2.f17987a = true;
                                        sliceHeaderData2.f17988b = true;
                                        sampleReader.k = false;
                                    }
                                    return;
                                }
                                zD = false;
                                zD2 = false;
                                z2 = zD2;
                                if (sampleReader.f17983i == 5) {
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
                                z4 = ppsData.f18938b;
                                i4 = spsData.k;
                                if (i4 == 0) {
                                    i6 = spsData.f18945l;
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
                                SampleReader.SliceHeaderData sliceHeaderData3 = sampleReader.f17985n;
                                sliceHeaderData3.f17989c = spsData;
                                sliceHeaderData3.d = iE2;
                                sliceHeaderData3.f17990e = iF2;
                                sliceHeaderData3.f = iE3;
                                sliceHeaderData3.g = iF3;
                                sliceHeaderData3.f17991h = zD;
                                sliceHeaderData3.f17992i = z2;
                                sliceHeaderData3.j = zD2;
                                sliceHeaderData3.k = z3;
                                sliceHeaderData3.f17993l = iF;
                                sliceHeaderData3.m = iE;
                                sliceHeaderData3.f17994n = iG2;
                                sliceHeaderData3.o = i5;
                                sliceHeaderData3.f17995p = iG;
                                sliceHeaderData3.f17987a = true;
                                sliceHeaderData3.f17988b = true;
                                sampleReader.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:81:0x021c  */
    /* JADX WARN: Code duplicated, block: B:82:0x021e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0235  */
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
        byte[] bArr;
        int i4;
        long j;
        char c2;
        long j2;
        int i5;
        long j3;
        int i6;
        int i7;
        int i8;
        boolean z2;
        char c3 = 3;
        Assertions.e(this.j);
        int i9 = Util.f18979a;
        int i10 = parsableByteArray.f18957b;
        int i11 = parsableByteArray.f18958c;
        byte[] bArr2 = parsableByteArray.f18956a;
        this.g += (long) parsableByteArray.a();
        this.j.e(parsableByteArray.a(), parsableByteArray);
        while (true) {
            int iB = NalUnitUtil.b(bArr2, i10, i11, this.f17974h);
            if (iB == i11) {
                a(bArr2, i10, i11);
                return;
            }
            int i12 = iB + 3;
            int i13 = bArr2[i12] & 31;
            int i14 = iB - i10;
            if (i14 > 0) {
                a(bArr2, i10, iB);
            }
            int i15 = i11 - iB;
            long j4 = this.g - ((long) i15);
            int i16 = i14 < 0 ? -i14 : 0;
            long j5 = this.m;
            boolean z3 = this.f17976l;
            NalUnitTargetBuffer nalUnitTargetBuffer = this.f17973e;
            NalUnitTargetBuffer nalUnitTargetBuffer2 = this.d;
            if (!z3 || this.k.f17980c) {
                nalUnitTargetBuffer2.b(i16);
                nalUnitTargetBuffer.b(i16);
                if (this.f17976l) {
                    i2 = i15;
                    i3 = i11;
                    bArr = bArr2;
                    i4 = i12;
                    j = j4;
                    if (nalUnitTargetBuffer2.f18034c) {
                        c2 = 3;
                        NalUnitUtil.SpsData spsDataD = NalUnitUtil.d(3, nalUnitTargetBuffer2.f18035e, nalUnitTargetBuffer2.d);
                        this.k.d.append(spsDataD.d, spsDataD);
                        nalUnitTargetBuffer2.c();
                    } else {
                        c2 = 3;
                        if (nalUnitTargetBuffer.f18034c) {
                            ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(nalUnitTargetBuffer.d, 4, nalUnitTargetBuffer.f18035e);
                            int iF = parsableNalUnitBitArray.f();
                            int iF2 = parsableNalUnitBitArray.f();
                            parsableNalUnitBitArray.i();
                            this.k.f17981e.append(iF, new NalUnitUtil.PpsData(iF, iF2, parsableNalUnitBitArray.d()));
                            nalUnitTargetBuffer.c();
                        }
                    }
                } else if (nalUnitTargetBuffer2.f18034c && nalUnitTargetBuffer.f18034c) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(nalUnitTargetBuffer2.d, nalUnitTargetBuffer2.f18035e));
                    arrayList.add(Arrays.copyOf(nalUnitTargetBuffer.d, nalUnitTargetBuffer.f18035e));
                    i2 = i15;
                    NalUnitUtil.SpsData spsDataD2 = NalUnitUtil.d(3, nalUnitTargetBuffer2.f18035e, nalUnitTargetBuffer2.d);
                    i3 = i11;
                    bArr = bArr2;
                    ParsableNalUnitBitArray parsableNalUnitBitArray2 = new ParsableNalUnitBitArray(nalUnitTargetBuffer.d, 4, nalUnitTargetBuffer.f18035e);
                    int iF3 = parsableNalUnitBitArray2.f();
                    int iF4 = parsableNalUnitBitArray2.f();
                    parsableNalUnitBitArray2.i();
                    NalUnitUtil.PpsData ppsData = new NalUnitUtil.PpsData(iF3, iF4, parsableNalUnitBitArray2.d());
                    i4 = i12;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(spsDataD2.f18939a), Integer.valueOf(spsDataD2.f18940b), Integer.valueOf(spsDataD2.f18941c));
                    TrackOutput trackOutput = this.j;
                    Format.Builder builder = new Format.Builder();
                    j = j4;
                    builder.f17081a = this.f17975i;
                    builder.k = "video/avc";
                    builder.f17085h = str;
                    builder.f17089p = spsDataD2.f18942e;
                    builder.q = spsDataD2.f;
                    builder.t = spsDataD2.g;
                    builder.m = arrayList;
                    trackOutput.c(new Format(builder));
                    this.f17976l = true;
                    this.k.d.append(spsDataD2.d, spsDataD2);
                    this.k.f17981e.append(iF3, ppsData);
                    nalUnitTargetBuffer2.c();
                    nalUnitTargetBuffer.c();
                    c2 = 3;
                } else {
                    i2 = i15;
                    i3 = i11;
                    bArr = bArr2;
                    i4 = i12;
                    j = j4;
                    c2 = c3;
                }
            } else {
                i2 = i15;
                i3 = i11;
                bArr = bArr2;
                i4 = i12;
                j = j4;
                c2 = c3;
            }
            NalUnitTargetBuffer nalUnitTargetBuffer3 = this.f;
            if (nalUnitTargetBuffer3.b(i16)) {
                int iE = NalUnitUtil.e(nalUnitTargetBuffer3.d, nalUnitTargetBuffer3.f18035e);
                byte[] bArr3 = nalUnitTargetBuffer3.d;
                ParsableByteArray parsableByteArray2 = this.o;
                parsableByteArray2.D(bArr3, iE);
                parsableByteArray2.F(4);
                CeaUtil.a(j5, parsableByteArray2, this.f17970a.f18068b);
            }
            SampleReader sampleReader = this.k;
            boolean z4 = this.f17976l;
            boolean z5 = this.f17977n;
            if (sampleReader.f17983i == 9) {
                if (z4 && sampleReader.o) {
                    j2 = sampleReader.j;
                    i5 = i2 + ((int) (j - j2));
                    j3 = sampleReader.q;
                    if (j3 != -9223372036854775807L) {
                        sampleReader.f17978a.f(j3, sampleReader.r ? 1 : 0, (int) (j2 - sampleReader.f17986p), i5, null);
                    }
                }
                sampleReader.f17986p = sampleReader.j;
                sampleReader.q = sampleReader.f17984l;
                sampleReader.r = false;
                sampleReader.o = true;
            } else if (sampleReader.f17980c) {
                SampleReader.SliceHeaderData sliceHeaderData = sampleReader.f17985n;
                SampleReader.SliceHeaderData sliceHeaderData2 = sampleReader.m;
                if (sliceHeaderData.f17987a) {
                    if (sliceHeaderData2.f17987a) {
                        NalUnitUtil.SpsData spsData = sliceHeaderData.f17989c;
                        Assertions.e(spsData);
                        NalUnitUtil.SpsData spsData2 = sliceHeaderData2.f17989c;
                        Assertions.e(spsData2);
                        if (sliceHeaderData.f == sliceHeaderData2.f && sliceHeaderData.g == sliceHeaderData2.g && sliceHeaderData.f17991h == sliceHeaderData2.f17991h && ((!sliceHeaderData.f17992i || !sliceHeaderData2.f17992i || sliceHeaderData.j == sliceHeaderData2.j) && ((i7 = sliceHeaderData.d) == (i8 = sliceHeaderData2.d) || (i7 != 0 && i8 != 0)))) {
                            int i17 = spsData2.k;
                            int i18 = spsData.k;
                            if ((i18 == 0 && i17 == 0 && (sliceHeaderData.m != sliceHeaderData2.m || sliceHeaderData.f17994n != sliceHeaderData2.f17994n)) || ((i18 == 1 && i17 == 1 && (sliceHeaderData.o != sliceHeaderData2.o || sliceHeaderData.f17995p != sliceHeaderData2.f17995p)) || (z2 = sliceHeaderData.k) != sliceHeaderData2.k || (z2 && sliceHeaderData.f17993l != sliceHeaderData2.f17993l))) {
                                if (z4) {
                                    j2 = sampleReader.j;
                                    i5 = i2 + ((int) (j - j2));
                                    j3 = sampleReader.q;
                                    if (j3 != -9223372036854775807L) {
                                        sampleReader.f17978a.f(j3, sampleReader.r ? 1 : 0, (int) (j2 - sampleReader.f17986p), i5, null);
                                    }
                                }
                                sampleReader.f17986p = sampleReader.j;
                                sampleReader.q = sampleReader.f17984l;
                                sampleReader.r = false;
                                sampleReader.o = true;
                            }
                        } else {
                            if (z4) {
                                j2 = sampleReader.j;
                                i5 = i2 + ((int) (j - j2));
                                j3 = sampleReader.q;
                                if (j3 != -9223372036854775807L) {
                                    sampleReader.f17978a.f(j3, sampleReader.r ? 1 : 0, (int) (j2 - sampleReader.f17986p), i5, null);
                                }
                            }
                            sampleReader.f17986p = sampleReader.j;
                            sampleReader.q = sampleReader.f17984l;
                            sampleReader.r = false;
                            sampleReader.o = true;
                        }
                    } else {
                        if (z4) {
                            j2 = sampleReader.j;
                            i5 = i2 + ((int) (j - j2));
                            j3 = sampleReader.q;
                            if (j3 != -9223372036854775807L) {
                                sampleReader.f17978a.f(j3, sampleReader.r ? 1 : 0, (int) (j2 - sampleReader.f17986p), i5, null);
                            }
                        }
                        sampleReader.f17986p = sampleReader.j;
                        sampleReader.q = sampleReader.f17984l;
                        sampleReader.r = false;
                        sampleReader.o = true;
                    }
                }
            }
            if (sampleReader.f17979b) {
                SampleReader.SliceHeaderData sliceHeaderData3 = sampleReader.f17985n;
                z5 = sliceHeaderData3.f17988b && ((i6 = sliceHeaderData3.f17990e) == 7 || i6 == 2);
            }
            boolean z6 = sampleReader.r;
            int i19 = sampleReader.f17983i;
            boolean z7 = z6 | (i19 == 5 || (z5 && i19 == 1));
            sampleReader.r = z7;
            if (z7) {
                this.f17977n = false;
            }
            long j6 = this.m;
            if (!this.f17976l || this.k.f17980c) {
                nalUnitTargetBuffer2.d(i13);
                nalUnitTargetBuffer.d(i13);
            }
            nalUnitTargetBuffer3.d(i13);
            SampleReader sampleReader2 = this.k;
            sampleReader2.f17983i = i13;
            sampleReader2.f17984l = j6;
            sampleReader2.j = j;
            if ((sampleReader2.f17979b && i13 == 1) || (sampleReader2.f17980c && (i13 == 5 || i13 == 1 || i13 == 2))) {
                SampleReader.SliceHeaderData sliceHeaderData4 = sampleReader2.m;
                sampleReader2.m = sampleReader2.f17985n;
                sampleReader2.f17985n = sliceHeaderData4;
                sliceHeaderData4.f17988b = false;
                sliceHeaderData4.f17987a = false;
                sampleReader2.f17982h = 0;
                sampleReader2.k = true;
            }
            c3 = c2;
            i11 = i3;
            bArr2 = bArr;
            i10 = i4;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void c(int i2, long j) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
        this.f17977n = ((i2 & 2) != 0) | this.f17977n;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void d(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.a();
        trackIdGenerator.b();
        this.f17975i = trackIdGenerator.f18100e;
        trackIdGenerator.b();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.d, 2);
        this.j = trackOutputTrack;
        this.k = new SampleReader(trackOutputTrack, this.f17971b, this.f17972c);
        this.f17970a.a(extractorOutput, trackIdGenerator);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }

    @Override // com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        this.g = 0L;
        this.f17977n = false;
        this.m = -9223372036854775807L;
        NalUnitUtil.a(this.f17974h);
        this.d.c();
        this.f17973e.c();
        this.f.c();
        SampleReader sampleReader = this.k;
        if (sampleReader != null) {
            sampleReader.k = false;
            sampleReader.o = false;
            SampleReader.SliceHeaderData sliceHeaderData = sampleReader.f17985n;
            sliceHeaderData.f17988b = false;
            sliceHeaderData.f17987a = false;
        }
    }
}
