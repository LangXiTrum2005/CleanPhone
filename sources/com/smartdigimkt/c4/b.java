package com.smartdigimkt.c4;

import android.util.Log;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.p4.o;
import com.smartdigimkt.p4.s;
import com.smartdigimkt.w3.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34172a = "AtomParsers";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f34173b = f0.d("vide");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f34174c = f0.d("soun");
    private static final int d = f0.d("text");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f34175e = f0.d("sbtl");
    private static final int f = f0.d("subt");
    private static final int g = f0.d("clcp");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f34176h = f0.d("meta");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f34177i = 3;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f34178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34180c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f34181e;
        private final s f;
        private final s g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f34182h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f34183i;

        public a(s sVar, s sVar2, boolean z2) {
            this.g = sVar;
            this.f = sVar2;
            this.f34181e = z2;
            sVar2.e(12);
            this.f34178a = sVar2.B();
            sVar.e(12);
            this.f34183i = sVar.B();
            com.smartdigimkt.p4.a.b(sVar.i() == 1, "first_chunk must be 1");
            this.f34179b = -1;
        }

        public boolean a() {
            int i2 = this.f34179b + 1;
            this.f34179b = i2;
            if (i2 == this.f34178a) {
                return false;
            }
            this.d = this.f34181e ? this.f.C() : this.f.z();
            if (this.f34179b == this.f34182h) {
                this.f34180c = this.g.B();
                this.g.f(4);
                int i3 = this.f34183i - 1;
                this.f34183i = i3;
                this.f34182h = i3 > 0 ? this.g.B() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.c4.b$b, reason: collision with other inner class name */
    public interface InterfaceC0452b {
        boolean a();

        int b();

        int c();
    }

    public static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f34184e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k[] f34185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public com.smartdigimkt.w3.m f34186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34187c;
        public int d = 0;

        public c(int i2) {
            this.f34185a = new k[i2];
        }
    }

    public static final class d implements InterfaceC0452b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f34188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f34189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final s f34190c;

        public d(com.smartdigimkt.c4.a.b bVar) {
            s sVar = bVar.V0;
            this.f34190c = sVar;
            sVar.e(12);
            this.f34188a = sVar.B();
            this.f34189b = sVar.B();
        }

        @Override // com.smartdigimkt.c4.b.InterfaceC0452b
        public boolean a() {
            return this.f34188a != 0;
        }

        @Override // com.smartdigimkt.c4.b.InterfaceC0452b
        public int b() {
            return this.f34189b;
        }

        @Override // com.smartdigimkt.c4.b.InterfaceC0452b
        public int c() {
            int i2 = this.f34188a;
            return i2 == 0 ? this.f34190c.B() : i2;
        }
    }

    public static final class e implements InterfaceC0452b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f34191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f34192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f34193c;
        private int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f34194e;

        public e(com.smartdigimkt.c4.a.b bVar) {
            s sVar = bVar.V0;
            this.f34191a = sVar;
            sVar.e(12);
            this.f34193c = sVar.B() & 255;
            this.f34192b = sVar.B();
        }

        @Override // com.smartdigimkt.c4.b.InterfaceC0452b
        public boolean a() {
            return false;
        }

        @Override // com.smartdigimkt.c4.b.InterfaceC0452b
        public int b() {
            return this.f34192b;
        }

        @Override // com.smartdigimkt.c4.b.InterfaceC0452b
        public int c() {
            int i2 = this.f34193c;
            if (i2 == 8) {
                return this.f34191a.x();
            }
            if (i2 == 16) {
                return this.f34191a.D();
            }
            int i3 = this.d;
            this.d = i3 + 1;
            if (i3 % 2 != 0) {
                return this.f34194e & 15;
            }
            int iX = this.f34191a.x();
            this.f34194e = iX;
            return (iX & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f34195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f34196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f34197c;

        public f(int i2, long j, int i3) {
            this.f34195a = i2;
            this.f34196b = j;
            this.f34197c = i3;
        }
    }

    public static final class g extends t {
    }

    private b() {
    }

    public static j a(com.smartdigimkt.c4.a.C0451a c0451a, com.smartdigimkt.c4.a.b bVar, long j, com.smartdigimkt.a4.e eVar, boolean z2, boolean z3) throws t {
        long[] jArr;
        long[] jArr2;
        com.smartdigimkt.c4.a.C0451a c0451aE = c0451a.e(com.smartdigimkt.c4.a.K);
        int iB = b(c0451aE.f(com.smartdigimkt.c4.a.f34156Y).V0);
        if (iB == -1) {
            return null;
        }
        f fVarE = e(c0451a.f(com.smartdigimkt.c4.a.f34154U).V0);
        long j2 = j == -9223372036854775807L ? fVarE.f34196b : j;
        long jD = d(bVar.V0);
        long jC = j2 != -9223372036854775807L ? f0.c(j2, 1000000L, jD) : -9223372036854775807L;
        com.smartdigimkt.c4.a.C0451a c0451aE2 = c0451aE.e(com.smartdigimkt.c4.a.L).e(com.smartdigimkt.c4.a.M);
        Pair<Long, String> pairC = c(c0451aE.f(com.smartdigimkt.c4.a.X).V0);
        c cVarA = a(c0451aE2.f(com.smartdigimkt.c4.a.Z).V0, fVarE.f34195a, fVarE.f34197c, (String) pairC.second, eVar, z3);
        if (z2) {
            jArr = null;
            jArr2 = null;
        } else {
            Pair<long[], long[]> pairA = a(c0451a.e(com.smartdigimkt.c4.a.f34155V));
            long[] jArr3 = (long[]) pairA.first;
            jArr2 = (long[]) pairA.second;
            jArr = jArr3;
        }
        if (cVarA.f34186b == null) {
            return null;
        }
        return new j(fVarE.f34195a, iB, ((Long) pairC.first).longValue(), jD, jC, cVarA.f34186b, cVarA.d, cVarA.f34185a, cVarA.f34187c, jArr, jArr2);
    }

    private static com.smartdigimkt.e4.a b(s sVar, int i2) {
        sVar.f(8);
        ArrayList arrayList = new ArrayList();
        while (sVar.c() < i2) {
            com.smartdigimkt.e4.a.b bVarB = com.smartdigimkt.c4.f.b(sVar);
            if (bVarB != null) {
                arrayList.add(bVarB);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.smartdigimkt.e4.a(arrayList);
    }

    private static com.smartdigimkt.e4.a c(s sVar, int i2) {
        sVar.f(12);
        while (sVar.c() < i2) {
            int iC = sVar.c();
            int i3 = sVar.i();
            if (sVar.i() == com.smartdigimkt.c4.a.I0) {
                sVar.e(iC);
                return b(sVar, iC + i3);
            }
            sVar.f(i3 - 8);
        }
        return null;
    }

    private static long d(s sVar) {
        sVar.e(8);
        sVar.f(com.smartdigimkt.c4.a.c(sVar.i()) != 0 ? 16 : 8);
        return sVar.z();
    }

    private static f e(s sVar) {
        long j;
        sVar.e(8);
        int iC = com.smartdigimkt.c4.a.c(sVar.i());
        sVar.f(iC == 0 ? 8 : 16);
        int i2 = sVar.i();
        sVar.f(4);
        int iC2 = sVar.c();
        int i3 = iC == 0 ? 4 : 8;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i5 >= i3) {
                sVar.f(i3);
                break;
            }
            if (sVar.f37616a[iC2 + i5] != -1) {
                long jZ = iC == 0 ? sVar.z() : sVar.C();
                if (jZ == 0) {
                    break;
                }
                j = jZ;
                break;
            }
            i5++;
        }
        sVar.f(16);
        int i6 = sVar.i();
        int i7 = sVar.i();
        sVar.f(4);
        int i8 = sVar.i();
        int i9 = sVar.i();
        if (i6 == 0 && i7 == 65536 && i8 == -65536 && i9 == 0) {
            i4 = 90;
        } else if (i6 == 0 && i7 == -65536 && i8 == 65536 && i9 == 0) {
            i4 = 270;
        } else if (i6 == -65536 && i7 == 0 && i8 == 0 && i9 == -65536) {
            i4 = 180;
        }
        return new f(i2, j, i4);
    }

    private static float d(s sVar, int i2) {
        sVar.e(i2 + 8);
        return sVar.B() / sVar.B();
    }

    private static int b(s sVar) {
        sVar.e(16);
        int i2 = sVar.i();
        if (i2 == f34174c) {
            return 1;
        }
        if (i2 == f34173b) {
            return 2;
        }
        if (i2 == d || i2 == f34175e || i2 == f || i2 == g) {
            return 3;
        }
        return i2 == f34176h ? 4 : -1;
    }

    private static Pair<Integer, k> d(s sVar, int i2, int i3) {
        Pair<Integer, k> pairB;
        int iC = sVar.c();
        while (iC - i2 < i3) {
            sVar.e(iC);
            int i4 = sVar.i();
            com.smartdigimkt.p4.a.a(i4 > 0, "childAtomSize should be positive");
            if (sVar.i() == com.smartdigimkt.c4.a.f34158b0 && (pairB = b(sVar, iC, i4)) != null) {
                return pairB;
            }
            iC += i4;
        }
        return null;
    }

    private static Pair<Long, String> c(s sVar) {
        sVar.e(8);
        int iC = com.smartdigimkt.c4.a.c(sVar.i());
        sVar.f(iC == 0 ? 8 : 16);
        long jZ = sVar.z();
        sVar.f(iC == 0 ? 4 : 8);
        int iD = sVar.D();
        return Pair.create(Long.valueOf(jZ), "" + ((char) (((iD >> 10) & 31) + 96)) + ((char) (((iD >> 5) & 31) + 96)) + ((char) ((iD & 31) + 96)));
    }

    public static Pair<Integer, k> b(s sVar, int i2, int i3) {
        int i4 = i2 + 8;
        int i5 = -1;
        int i6 = 0;
        String strB = null;
        Integer numValueOf = null;
        while (i4 - i2 < i3) {
            sVar.e(i4);
            int i7 = sVar.i();
            int i8 = sVar.i();
            if (i8 == com.smartdigimkt.c4.a.h0) {
                numValueOf = Integer.valueOf(sVar.i());
            } else if (i8 == com.smartdigimkt.c4.a.f34160c0) {
                sVar.f(4);
                strB = sVar.b(4);
            } else if (i8 == com.smartdigimkt.c4.a.f34161d0) {
                i5 = i4;
                i6 = i7;
            }
            i4 += i7;
        }
        if (!"cenc".equals(strB) && !"cbc1".equals(strB) && !"cens".equals(strB) && !"cbcs".equals(strB)) {
            return null;
        }
        com.smartdigimkt.p4.a.a(numValueOf != null, "frma atom is mandatory");
        com.smartdigimkt.p4.a.a(i5 != -1, "schi atom is mandatory");
        k kVarA = a(sVar, i5, i6, strB);
        com.smartdigimkt.p4.a.a(kVarA != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, kVarA);
    }

    /* JADX WARN: Code duplicated, block: B:199:0x0166 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101 A[ADDED_TO_REGION, LOOP:1: B:49:0x0101->B:50:0x0103, LOOP_START, PHI: r2 r7 r29
  0x0101: PHI (r2v33 int) = (r2v29 int), (r2v36 int) binds: [B:48:0x00ff, B:50:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r7v22 int) = (r7v21 int), (r7v25 int) binds: [B:48:0x00ff, B:50:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r29v4 long) = (r29v3 long), (r29v6 long) binds: [B:48:0x00ff, B:50:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0103 A[LOOP:1: B:49:0x0101->B:50:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0119 A[ADDED_TO_REGION, LOOP:2: B:53:0x0119->B:55:0x011d, LOOP_START, PHI: r4 r15 r23
  0x0119: PHI (r4v17 int) = (r4v15 int), (r4v18 int) binds: [B:52:0x0117, B:55:0x011d] A[DONT_GENERATE, DONT_INLINE]
  0x0119: PHI (r15v8 int) = (r15v4 int), (r15v9 int) binds: [B:52:0x0117, B:55:0x011d] A[DONT_GENERATE, DONT_INLINE]
  0x0119: PHI (r23v11 int) = (r23v9 int), (r23v13 int) binds: [B:52:0x0117, B:55:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0145  */
    /* JADX WARN: Code duplicated, block: B:68:0x014b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x0179  */
    /* JADX WARN: Code duplicated, block: B:77:0x017c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0183  */
    /* JADX WARN: Code duplicated, block: B:82:0x0189  */
    /* JADX WARN: Code duplicated, block: B:83:0x018c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x019f  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:95:0x01dc A[LOOP:8: B:93:0x01d6->B:95:0x01dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0218  */
    /* JADX WARN: Multi-variable type inference failed */
    public static m a(j jVar, com.smartdigimkt.c4.a.C0451a c0451a, com.smartdigimkt.b4.i iVar) throws t {
        InterfaceC0452b eVar;
        boolean z2;
        int iB;
        int iB2;
        int i2;
        int i3;
        int i4;
        int i5;
        long[] jArr;
        int[] iArr;
        int i6;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long j;
        int i7;
        long jC;
        j jVar2;
        long[] jArr4;
        long[] jArr5;
        long[] jArr6;
        int[] iArr4;
        s sVar;
        long[] jArr7;
        int[] iArr5;
        int iB3;
        InterfaceC0452b interfaceC0452b;
        int i8;
        int i9;
        int i10;
        int iB4;
        long j2;
        long j3;
        boolean z3;
        boolean z4;
        int iC;
        int i11;
        com.smartdigimkt.c4.a.b bVarF = c0451a.f(com.smartdigimkt.c4.a.w0);
        if (bVarF != null) {
            eVar = new d(bVarF);
        } else {
            com.smartdigimkt.c4.a.b bVarF2 = c0451a.f(com.smartdigimkt.c4.a.x0);
            if (bVarF2 != null) {
                eVar = new e(bVarF2);
            } else {
                throw new t("Track has no sample table size information");
            }
        }
        int iB5 = eVar.b();
        if (iB5 == 0) {
            return new m(jVar, new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
        }
        com.smartdigimkt.c4.a.b bVarF3 = c0451a.f(com.smartdigimkt.c4.a.y0);
        if (bVarF3 == null) {
            bVarF3 = c0451a.f(com.smartdigimkt.c4.a.z0);
            z2 = true;
        } else {
            z2 = false;
        }
        s sVar2 = bVarF3.V0;
        s sVar3 = c0451a.f(com.smartdigimkt.c4.a.v0).V0;
        s sVar4 = c0451a.f(com.smartdigimkt.c4.a.s0).V0;
        com.smartdigimkt.c4.a.b bVarF4 = c0451a.f(com.smartdigimkt.c4.a.t0);
        s sVar5 = null;
        s sVar6 = bVarF4 != null ? bVarF4.V0 : null;
        com.smartdigimkt.c4.a.b bVarF5 = c0451a.f(com.smartdigimkt.c4.a.u0);
        s sVar7 = bVarF5 != null ? bVarF5.V0 : null;
        a aVar = new a(sVar3, sVar2, z2);
        sVar4.e(12);
        int iB6 = sVar4.B() - 1;
        int iB7 = sVar4.B();
        int iB8 = sVar4.B();
        if (sVar7 != null) {
            sVar7.e(12);
            iB = sVar7.B();
        } else {
            iB = 0;
        }
        int iB9 = -1;
        if (sVar6 != null) {
            sVar6.e(12);
            iB2 = sVar6.B();
            iB9 = iB2 > 0 ? sVar6.B() - 1 : -1;
            if (eVar.a()) {
                i2 = 0;
                if (!"audio/raw".equals(jVar.f.f) && iB6 == 0 && iB == 0 && iB2 == 0) {
                    i3 = 1;
                }
                String str = f34172a;
                if (i3 == 0) {
                    jArr6 = new long[iB5];
                    i5 = 1;
                    iArr4 = new int[iB5];
                    sVar = sVar7;
                    jArr7 = new long[iB5];
                    iArr5 = new int[iB5];
                    iB3 = iB9;
                    interfaceC0452b = eVar;
                    i8 = i2;
                    i9 = i8;
                    i10 = i9;
                    i6 = i10;
                    iB4 = i6;
                    j2 = 0;
                    j3 = 0;
                    while (i8 < iB5) {
                        while (i10 == 0) {
                            com.smartdigimkt.p4.a.b(aVar.a());
                            long j4 = aVar.d;
                            i10 = aVar.f34180c;
                            j3 = j4;
                            iB5 = iB5;
                        }
                        int i12 = iB5;
                        if (sVar != null) {
                            while (iB4 == 0 && iB > 0) {
                                iB4 = sVar.B();
                                i9 = sVar.i();
                                iB--;
                            }
                            iB4--;
                        }
                        jArr6[i8] = j3;
                        iC = interfaceC0452b.c();
                        iArr4[i8] = iC;
                        if (iC > i6) {
                            i6 = iC;
                        }
                        jArr7[i8] = j2 + ((long) i9);
                        if (sVar5 == null) {
                            i11 = 1;
                        } else {
                            i11 = i2;
                        }
                        iArr5[i8] = i11;
                        if (i8 == iB3) {
                            iArr5[i8] = 1;
                            iB2--;
                            if (iB2 > 0) {
                                iB3 = sVar5.B() - 1;
                            }
                        }
                        j2 += (long) iB8;
                        iB7--;
                        if (iB7 != 0 && iB6 > 0) {
                            iB6--;
                            iB7 = sVar4.B();
                            iB8 = sVar4.i();
                        }
                        j3 += (long) iArr4[i8];
                        i10--;
                        i8++;
                        iB5 = i12;
                    }
                    i4 = iB5;
                    long j5 = j2 + ((long) i9);
                    if (iB4 == 0) {
                        z3 = 1;
                    } else {
                        z3 = i2;
                    }
                    com.smartdigimkt.p4.a.a(z3);
                    while (iB > 0) {
                        if (sVar.B() == 0) {
                            z4 = 1;
                        } else {
                            z4 = i2;
                        }
                        com.smartdigimkt.p4.a.a(z4);
                        sVar.i();
                        iB--;
                    }
                    if (iB2 == 0 || iB7 != 0 || i10 != 0 || iB6 != 0) {
                        StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                        androidx.datastore.preferences.protobuf.a.y(sb, jVar.f34273a, ": remainingSynchronizationSamples ", iB2, ", remainingSamplesAtTimestampDelta ");
                        androidx.datastore.preferences.protobuf.a.y(sb, iB7, ", remainingSamplesInChunk ", i10, ", remainingTimestampDeltaChanges ");
                        sb.append(iB6);
                        Log.w(f34172a, sb.toString());
                    }
                    iArr2 = iArr5;
                    jArr2 = jArr7;
                    jArr3 = jArr6;
                    iArr3 = iArr4;
                    j = j5;
                } else {
                    i4 = iB5;
                    i5 = 1;
                    int i13 = aVar.f34178a;
                    jArr = new long[i13];
                    iArr = new int[i13];
                    while (aVar.a()) {
                        int i14 = aVar.f34179b;
                        jArr[i14] = aVar.d;
                        iArr[i14] = aVar.f34180c;
                    }
                    com.smartdigimkt.w3.m mVar = jVar.f;
                    com.smartdigimkt.c4.d.b bVarA = com.smartdigimkt.c4.d.a(f0.b(mVar.f39340u, mVar.s), jArr, iArr, iB8);
                    long[] jArr8 = bVarA.f34202a;
                    int[] iArr6 = bVarA.f34203b;
                    i6 = bVarA.f34204c;
                    long[] jArr9 = bVarA.d;
                    int[] iArr7 = bVarA.f34205e;
                    long j6 = bVarA.f;
                    jArr2 = jArr9;
                    iArr2 = iArr7;
                    jArr3 = jArr8;
                    iArr3 = iArr6;
                    j = j6;
                }
                i7 = i6;
                jC = f0.c(j, 1000000L, jVar.f34275c);
                if (jVar.f34277h == null && !iVar.a()) {
                    long[] jArr10 = jVar.f34277h;
                    int i15 = i5;
                    if (jArr10.length == i15 && jVar.f34274b == i15 && jArr2.length >= 2) {
                        long j7 = jVar.f34278i[i2];
                        long jC2 = j7 + f0.c(jArr10[i2], jVar.f34275c, jVar.d);
                        long j8 = j;
                        long[] jArr11 = jArr2;
                        boolean zA = a(jArr11, j8, j7, jC2);
                        j = j8;
                        if (zA) {
                            long jC3 = f0.c(j7 - jArr11[i2], jVar.f.t, jVar.f34275c);
                            long jC4 = f0.c(j - jC2, jVar.f.t, jVar.f34275c);
                            if ((jC3 != 0 || jC4 != 0) && jC3 <= 2147483647L && jC4 <= 2147483647L) {
                                iVar.f33919a = (int) jC3;
                                iVar.f33920b = (int) jC4;
                                f0.a(jArr11, 1000000L, jVar.f34275c);
                                return new m(jVar, jArr3, iArr3, i7, jArr11, iArr2, jC);
                            }
                        }
                        jArr4 = jArr11;
                        jVar2 = jVar;
                    } else {
                        jVar2 = jVar;
                        jArr4 = jArr2;
                    }
                    long[] jArr12 = jVar2.f34277h;
                    if (jArr12.length == 1 && jArr12[i2] == 0) {
                        long j9 = jVar2.f34278i[i2];
                        for (int i16 = i2; i16 < jArr4.length; i16++) {
                            jArr4[i16] = f0.c(jArr4[i16] - j9, 1000000L, jVar2.f34275c);
                        }
                        return new m(jVar2, jArr3, iArr3, i7, jArr4, iArr2, f0.c(j - j9, 1000000L, jVar2.f34275c));
                    }
                    boolean z5 = jVar2.f34274b == 1 ? 1 : i2;
                    int i17 = i2;
                    int i18 = i17;
                    int i19 = i18;
                    int i20 = i19;
                    while (true) {
                        long[] jArr13 = jVar2.f34277h;
                        if (i17 >= jArr13.length) {
                            break;
                        }
                        long j10 = jVar2.f34278i[i17];
                        if (j10 != -1) {
                            int i21 = i20;
                            long jC5 = f0.c(jArr13[i17], jVar2.f34275c, jVar2.d);
                            int iA = f0.a(jArr4, j10, true, true);
                            int iA2 = f0.a(jArr4, j10 + jC5, z5, (boolean) i2);
                            i18 += iA2 - iA;
                            int i22 = i19 != iA ? 1 : 0;
                            i19 = iA2;
                            i20 = i22 | i21;
                        }
                        i17++;
                        i7 = i7;
                        i2 = 0;
                    }
                    int i23 = i7;
                    int i24 = (i18 != i4 ? 1 : 0) | i20;
                    long[] jArr14 = i24 != 0 ? new long[i18] : jArr3;
                    int[] iArr8 = i24 != 0 ? new int[i18] : iArr3;
                    if (i24 != 0) {
                        i23 = 0;
                    }
                    int[] iArr9 = i24 != 0 ? new int[i18] : iArr2;
                    long[] jArr15 = new long[i18];
                    int i25 = i23;
                    int i26 = 0;
                    int i27 = 0;
                    long j11 = 0;
                    while (true) {
                        long[] jArr16 = jVar2.f34277h;
                        int i28 = i24;
                        if (i26 < jArr16.length) {
                            int i29 = i25;
                            long j12 = jVar2.f34278i[i26];
                            long j13 = jArr16[i26];
                            if (j12 != -1) {
                                String str2 = str;
                                long jC6 = f0.c(j13, jVar2.f34275c, jVar2.d) + j12;
                                jArr5 = jArr15;
                                int iA3 = f0.a(jArr4, j12, true, true);
                                int iA4 = f0.a(jArr4, jC6, z5, false);
                                if (i28 != 0) {
                                    int i30 = iA4 - iA3;
                                    System.arraycopy(jArr3, iA3, jArr14, i27, i30);
                                    System.arraycopy(iArr3, iA3, iArr8, i27, i30);
                                    System.arraycopy(iArr2, iA3, iArr9, i27, i30);
                                }
                                if (iA3 < iA4 && (iArr9[i27] & 1) == 0) {
                                    Log.w(str2, "Ignoring edit list: edit does not start with a sync sample.");
                                    throw new g();
                                }
                                str = str2;
                                int i31 = i29;
                                while (iA3 < iA4) {
                                    long[] jArr17 = jArr3;
                                    int[] iArr10 = iArr3;
                                    jArr5[i27] = f0.c(j11, 1000000L, jVar2.d) + f0.c(jArr4[iA3] - j12, 1000000L, jVar2.f34275c);
                                    if (i28 != 0 && iArr8[i27] > i31) {
                                        i31 = iArr10[iA3];
                                    }
                                    i27++;
                                    iA3++;
                                    jArr3 = jArr17;
                                    iArr3 = iArr10;
                                }
                                i25 = i31;
                            } else {
                                jArr5 = jArr15;
                                i25 = i29;
                            }
                            j11 += j13;
                            i26++;
                            i24 = i28;
                            jArr15 = jArr5;
                            jArr3 = jArr3;
                            iArr3 = iArr3;
                        } else {
                            return new m(jVar2, jArr14, iArr8, i25, jArr15, iArr9, f0.c(j11, 1000000L, jVar2.f34275c));
                        }
                    }
                } else {
                    long[] jArr18 = jArr3;
                    int[] iArr11 = iArr3;
                    long[] jArr19 = jArr2;
                    f0.a(jArr19, 1000000L, jVar.f34275c);
                    return new m(jVar, jArr18, iArr11, i7, jArr19, iArr2, jC);
                }
            } else {
                i2 = 0;
            }
            i3 = i2;
            String str3 = f34172a;
            if (i3 == 0) {
                jArr6 = new long[iB5];
                i5 = 1;
                iArr4 = new int[iB5];
                sVar = sVar7;
                jArr7 = new long[iB5];
                iArr5 = new int[iB5];
                iB3 = iB9;
                interfaceC0452b = eVar;
                i8 = i2;
                i9 = i8;
                i10 = i9;
                i6 = i10;
                iB4 = i6;
                j2 = 0;
                j3 = 0;
                while (i8 < iB5) {
                    while (i10 == 0) {
                        com.smartdigimkt.p4.a.b(aVar.a());
                        long j14 = aVar.d;
                        i10 = aVar.f34180c;
                        j3 = j14;
                        iB5 = iB5;
                    }
                    int i110 = iB5;
                    if (sVar != null) {
                        while (iB4 == 0) {
                            iB4 = sVar.B();
                            i9 = sVar.i();
                            iB--;
                        }
                        iB4--;
                    }
                    jArr6[i8] = j3;
                    iC = interfaceC0452b.c();
                    iArr4[i8] = iC;
                    if (iC > i6) {
                        i6 = iC;
                    }
                    jArr7[i8] = j2 + ((long) i9);
                    if (sVar5 == null) {
                        i11 = 1;
                    } else {
                        i11 = i2;
                    }
                    iArr5[i8] = i11;
                    if (i8 == iB3) {
                        iArr5[i8] = 1;
                        iB2--;
                        if (iB2 > 0) {
                            iB3 = sVar5.B() - 1;
                        }
                    }
                    j2 += (long) iB8;
                    iB7--;
                    if (iB7 != 0) {
                    }
                    j3 += (long) iArr4[i8];
                    i10--;
                    i8++;
                    iB5 = i110;
                }
                i4 = iB5;
                long j15 = j2 + ((long) i9);
                if (iB4 == 0) {
                    z3 = 1;
                } else {
                    z3 = i2;
                }
                com.smartdigimkt.p4.a.a(z3);
                while (iB > 0) {
                    if (sVar.B() == 0) {
                        z4 = 1;
                    } else {
                        z4 = i2;
                    }
                    com.smartdigimkt.p4.a.a(z4);
                    sVar.i();
                    iB--;
                }
                if (iB2 == 0) {
                    StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                    androidx.datastore.preferences.protobuf.a.y(sb2, jVar.f34273a, ": remainingSynchronizationSamples ", iB2, ", remainingSamplesAtTimestampDelta ");
                    androidx.datastore.preferences.protobuf.a.y(sb2, iB7, ", remainingSamplesInChunk ", i10, ", remainingTimestampDeltaChanges ");
                    sb2.append(iB6);
                    Log.w(f34172a, sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                    androidx.datastore.preferences.protobuf.a.y(sb3, jVar.f34273a, ": remainingSynchronizationSamples ", iB2, ", remainingSamplesAtTimestampDelta ");
                    androidx.datastore.preferences.protobuf.a.y(sb3, iB7, ", remainingSamplesInChunk ", i10, ", remainingTimestampDeltaChanges ");
                    sb3.append(iB6);
                    Log.w(f34172a, sb3.toString());
                }
                iArr2 = iArr5;
                jArr2 = jArr7;
                jArr3 = jArr6;
                iArr3 = iArr4;
                j = j15;
            } else {
                i4 = iB5;
                i5 = 1;
                int i111 = aVar.f34178a;
                jArr = new long[i111];
                iArr = new int[i111];
                while (aVar.a()) {
                    int i112 = aVar.f34179b;
                    jArr[i112] = aVar.d;
                    iArr[i112] = aVar.f34180c;
                }
                com.smartdigimkt.w3.m mVar2 = jVar.f;
                com.smartdigimkt.c4.d.b bVarA2 = com.smartdigimkt.c4.d.a(f0.b(mVar2.f39340u, mVar2.s), jArr, iArr, iB8);
                long[] jArr20 = bVarA2.f34202a;
                int[] iArr12 = bVarA2.f34203b;
                i6 = bVarA2.f34204c;
                long[] jArr21 = bVarA2.d;
                int[] iArr13 = bVarA2.f34205e;
                long j16 = bVarA2.f;
                jArr2 = jArr21;
                iArr2 = iArr13;
                jArr3 = jArr20;
                iArr3 = iArr12;
                j = j16;
            }
            i7 = i6;
            jC = f0.c(j, 1000000L, jVar.f34275c);
            if (jVar.f34277h == null) {
            }
            long[] jArr110 = jArr3;
            int[] iArr14 = iArr3;
            long[] jArr111 = jArr2;
            f0.a(jArr111, 1000000L, jVar.f34275c);
            return new m(jVar, jArr110, iArr14, i7, jArr111, iArr2, jC);
        }
        iB2 = 0;
        sVar5 = sVar6;
        if (eVar.a()) {
            i2 = 0;
            if (!"audio/raw".equals(jVar.f.f)) {
            }
            String str4 = f34172a;
            if (i3 == 0) {
                jArr6 = new long[iB5];
                i5 = 1;
                iArr4 = new int[iB5];
                sVar = sVar7;
                jArr7 = new long[iB5];
                iArr5 = new int[iB5];
                iB3 = iB9;
                interfaceC0452b = eVar;
                i8 = i2;
                i9 = i8;
                i10 = i9;
                i6 = i10;
                iB4 = i6;
                j2 = 0;
                j3 = 0;
                while (i8 < iB5) {
                    while (i10 == 0) {
                        com.smartdigimkt.p4.a.b(aVar.a());
                        long j17 = aVar.d;
                        i10 = aVar.f34180c;
                        j3 = j17;
                        iB5 = iB5;
                    }
                    int i113 = iB5;
                    if (sVar != null) {
                        while (iB4 == 0) {
                            iB4 = sVar.B();
                            i9 = sVar.i();
                            iB--;
                        }
                        iB4--;
                    }
                    jArr6[i8] = j3;
                    iC = interfaceC0452b.c();
                    iArr4[i8] = iC;
                    if (iC > i6) {
                        i6 = iC;
                    }
                    jArr7[i8] = j2 + ((long) i9);
                    if (sVar5 == null) {
                        i11 = 1;
                    } else {
                        i11 = i2;
                    }
                    iArr5[i8] = i11;
                    if (i8 == iB3) {
                        iArr5[i8] = 1;
                        iB2--;
                        if (iB2 > 0) {
                            iB3 = sVar5.B() - 1;
                        }
                    }
                    j2 += (long) iB8;
                    iB7--;
                    if (iB7 != 0) {
                    }
                    j3 += (long) iArr4[i8];
                    i10--;
                    i8++;
                    iB5 = i113;
                }
                i4 = iB5;
                long j18 = j2 + ((long) i9);
                if (iB4 == 0) {
                    z3 = 1;
                } else {
                    z3 = i2;
                }
                com.smartdigimkt.p4.a.a(z3);
                while (iB > 0) {
                    if (sVar.B() == 0) {
                        z4 = 1;
                    } else {
                        z4 = i2;
                    }
                    com.smartdigimkt.p4.a.a(z4);
                    sVar.i();
                    iB--;
                }
                if (iB2 == 0) {
                    StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                    androidx.datastore.preferences.protobuf.a.y(sb4, jVar.f34273a, ": remainingSynchronizationSamples ", iB2, ", remainingSamplesAtTimestampDelta ");
                    androidx.datastore.preferences.protobuf.a.y(sb4, iB7, ", remainingSamplesInChunk ", i10, ", remainingTimestampDeltaChanges ");
                    sb4.append(iB6);
                    Log.w(f34172a, sb4.toString());
                } else {
                    StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                    androidx.datastore.preferences.protobuf.a.y(sb5, jVar.f34273a, ": remainingSynchronizationSamples ", iB2, ", remainingSamplesAtTimestampDelta ");
                    androidx.datastore.preferences.protobuf.a.y(sb5, iB7, ", remainingSamplesInChunk ", i10, ", remainingTimestampDeltaChanges ");
                    sb5.append(iB6);
                    Log.w(f34172a, sb5.toString());
                }
                iArr2 = iArr5;
                jArr2 = jArr7;
                jArr3 = jArr6;
                iArr3 = iArr4;
                j = j18;
            } else {
                i4 = iB5;
                i5 = 1;
                int i114 = aVar.f34178a;
                jArr = new long[i114];
                iArr = new int[i114];
                while (aVar.a()) {
                    int i115 = aVar.f34179b;
                    jArr[i115] = aVar.d;
                    iArr[i115] = aVar.f34180c;
                }
                com.smartdigimkt.w3.m mVar3 = jVar.f;
                com.smartdigimkt.c4.d.b bVarA3 = com.smartdigimkt.c4.d.a(f0.b(mVar3.f39340u, mVar3.s), jArr, iArr, iB8);
                long[] jArr22 = bVarA3.f34202a;
                int[] iArr15 = bVarA3.f34203b;
                i6 = bVarA3.f34204c;
                long[] jArr23 = bVarA3.d;
                int[] iArr16 = bVarA3.f34205e;
                long j19 = bVarA3.f;
                jArr2 = jArr23;
                iArr2 = iArr16;
                jArr3 = jArr22;
                iArr3 = iArr15;
                j = j19;
            }
            i7 = i6;
            jC = f0.c(j, 1000000L, jVar.f34275c);
            if (jVar.f34277h == null) {
            }
            long[] jArr112 = jArr3;
            int[] iArr17 = iArr3;
            long[] jArr113 = jArr2;
            f0.a(jArr113, 1000000L, jVar.f34275c);
            return new m(jVar, jArr112, iArr17, i7, jArr113, iArr2, jC);
        }
        i2 = 0;
        i3 = i2;
        String str5 = f34172a;
        if (i3 == 0) {
            jArr6 = new long[iB5];
            i5 = 1;
            iArr4 = new int[iB5];
            sVar = sVar7;
            jArr7 = new long[iB5];
            iArr5 = new int[iB5];
            iB3 = iB9;
            interfaceC0452b = eVar;
            i8 = i2;
            i9 = i8;
            i10 = i9;
            i6 = i10;
            iB4 = i6;
            j2 = 0;
            j3 = 0;
            while (i8 < iB5) {
                while (i10 == 0) {
                    com.smartdigimkt.p4.a.b(aVar.a());
                    long j110 = aVar.d;
                    i10 = aVar.f34180c;
                    j3 = j110;
                    iB5 = iB5;
                }
                int i116 = iB5;
                if (sVar != null) {
                    while (iB4 == 0) {
                        iB4 = sVar.B();
                        i9 = sVar.i();
                        iB--;
                    }
                    iB4--;
                }
                jArr6[i8] = j3;
                iC = interfaceC0452b.c();
                iArr4[i8] = iC;
                if (iC > i6) {
                    i6 = iC;
                }
                jArr7[i8] = j2 + ((long) i9);
                if (sVar5 == null) {
                    i11 = 1;
                } else {
                    i11 = i2;
                }
                iArr5[i8] = i11;
                if (i8 == iB3) {
                    iArr5[i8] = 1;
                    iB2--;
                    if (iB2 > 0) {
                        iB3 = sVar5.B() - 1;
                    }
                }
                j2 += (long) iB8;
                iB7--;
                if (iB7 != 0) {
                }
                j3 += (long) iArr4[i8];
                i10--;
                i8++;
                iB5 = i116;
            }
            i4 = iB5;
            long j111 = j2 + ((long) i9);
            if (iB4 == 0) {
                z3 = 1;
            } else {
                z3 = i2;
            }
            com.smartdigimkt.p4.a.a(z3);
            while (iB > 0) {
                if (sVar.B() == 0) {
                    z4 = 1;
                } else {
                    z4 = i2;
                }
                com.smartdigimkt.p4.a.a(z4);
                sVar.i();
                iB--;
            }
            if (iB2 == 0) {
                StringBuilder sb6 = new StringBuilder("Inconsistent stbl box for track ");
                androidx.datastore.preferences.protobuf.a.y(sb6, jVar.f34273a, ": remainingSynchronizationSamples ", iB2, ", remainingSamplesAtTimestampDelta ");
                androidx.datastore.preferences.protobuf.a.y(sb6, iB7, ", remainingSamplesInChunk ", i10, ", remainingTimestampDeltaChanges ");
                sb6.append(iB6);
                Log.w(f34172a, sb6.toString());
            } else {
                StringBuilder sb7 = new StringBuilder("Inconsistent stbl box for track ");
                androidx.datastore.preferences.protobuf.a.y(sb7, jVar.f34273a, ": remainingSynchronizationSamples ", iB2, ", remainingSamplesAtTimestampDelta ");
                androidx.datastore.preferences.protobuf.a.y(sb7, iB7, ", remainingSamplesInChunk ", i10, ", remainingTimestampDeltaChanges ");
                sb7.append(iB6);
                Log.w(f34172a, sb7.toString());
            }
            iArr2 = iArr5;
            jArr2 = jArr7;
            jArr3 = jArr6;
            iArr3 = iArr4;
            j = j111;
        } else {
            i4 = iB5;
            i5 = 1;
            int i117 = aVar.f34178a;
            jArr = new long[i117];
            iArr = new int[i117];
            while (aVar.a()) {
                int i118 = aVar.f34179b;
                jArr[i118] = aVar.d;
                iArr[i118] = aVar.f34180c;
            }
            com.smartdigimkt.w3.m mVar4 = jVar.f;
            com.smartdigimkt.c4.d.b bVarA4 = com.smartdigimkt.c4.d.a(f0.b(mVar4.f39340u, mVar4.s), jArr, iArr, iB8);
            long[] jArr24 = bVarA4.f34202a;
            int[] iArr18 = bVarA4.f34203b;
            i6 = bVarA4.f34204c;
            long[] jArr25 = bVarA4.d;
            int[] iArr19 = bVarA4.f34205e;
            long j112 = bVarA4.f;
            jArr2 = jArr25;
            iArr2 = iArr19;
            jArr3 = jArr24;
            iArr3 = iArr18;
            j = j112;
        }
        i7 = i6;
        jC = f0.c(j, 1000000L, jVar.f34275c);
        if (jVar.f34277h == null) {
        }
        long[] jArr114 = jArr3;
        int[] iArr110 = iArr3;
        long[] jArr115 = jArr2;
        f0.a(jArr115, 1000000L, jVar.f34275c);
        return new m(jVar, jArr114, iArr110, i7, jArr115, iArr2, jC);
    }

    private static byte[] c(s sVar, int i2, int i3) {
        int i4 = i2 + 8;
        while (i4 - i2 < i3) {
            sVar.e(i4);
            int i5 = sVar.i();
            if (sVar.i() == com.smartdigimkt.c4.a.P0) {
                return Arrays.copyOfRange(sVar.f37616a, i4, i5 + i4);
            }
            i4 += i5;
        }
        return null;
    }

    public static com.smartdigimkt.e4.a a(com.smartdigimkt.c4.a.b bVar, boolean z2) {
        if (z2) {
            return null;
        }
        s sVar = bVar.V0;
        sVar.e(8);
        while (sVar.a() >= 8) {
            int iC = sVar.c();
            int i2 = sVar.i();
            if (sVar.i() == com.smartdigimkt.c4.a.H0) {
                sVar.e(iC);
                return c(sVar, iC + i2);
            }
            sVar.f(i2 - 8);
        }
        return null;
    }

    private static c a(s sVar, int i2, int i3, String str, com.smartdigimkt.a4.e eVar, boolean z2) throws t {
        sVar.e(12);
        int i4 = sVar.i();
        c cVar = new c(i4);
        int i5 = 0;
        while (i5 < i4) {
            int iC = sVar.c();
            int i6 = sVar.i();
            com.smartdigimkt.p4.a.a(i6 > 0, "childAtomSize should be positive");
            int i7 = sVar.i();
            if (i7 != com.smartdigimkt.c4.a.f34163h && i7 != com.smartdigimkt.c4.a.f34164i && i7 != com.smartdigimkt.c4.a.f0 && i7 != com.smartdigimkt.c4.a.r0 && i7 != com.smartdigimkt.c4.a.j && i7 != com.smartdigimkt.c4.a.k && i7 != com.smartdigimkt.c4.a.f34165l && i7 != com.smartdigimkt.c4.a.Q0 && i7 != com.smartdigimkt.c4.a.R0) {
                if (i7 != com.smartdigimkt.c4.a.o && i7 != com.smartdigimkt.c4.a.g0 && i7 != com.smartdigimkt.c4.a.t && i7 != com.smartdigimkt.c4.a.v && i7 != com.smartdigimkt.c4.a.x && i7 != com.smartdigimkt.c4.a.f34144A && i7 != com.smartdigimkt.c4.a.y && i7 != com.smartdigimkt.c4.a.f34170z && i7 != com.smartdigimkt.c4.a.E0 && i7 != com.smartdigimkt.c4.a.F0 && i7 != com.smartdigimkt.c4.a.r && i7 != com.smartdigimkt.c4.a.s && i7 != com.smartdigimkt.c4.a.f34167p && i7 != com.smartdigimkt.c4.a.U0) {
                    if (i7 != com.smartdigimkt.c4.a.p0 && i7 != com.smartdigimkt.c4.a.A0 && i7 != com.smartdigimkt.c4.a.B0 && i7 != com.smartdigimkt.c4.a.C0 && i7 != com.smartdigimkt.c4.a.D0) {
                        if (i7 == com.smartdigimkt.c4.a.T0) {
                            cVar.f34186b = com.smartdigimkt.w3.m.a(Integer.toString(i2), "application/x-camera-motion", (String) null, -1, (com.smartdigimkt.a4.e) null);
                        }
                    } else {
                        a(sVar, i7, iC, i6, i2, str, cVar);
                    }
                } else {
                    c cVar2 = cVar;
                    a(sVar, i7, iC, i6, i2, str, z2, eVar, cVar2, i5);
                    cVar = cVar2;
                }
            } else {
                c cVar3 = cVar;
                int i8 = i5;
                a(sVar, i7, iC, i6, i2, i3, eVar, cVar3, i8);
                cVar = cVar3;
                i5 = i8;
            }
            sVar.e(iC + i6);
            i5++;
        }
        return cVar;
    }

    private static void a(s sVar, int i2, int i3, int i4, int i5, String str, c cVar) throws t {
        sVar.e(i3 + 16);
        String str2 = "application/ttml+xml";
        List listSingletonList = null;
        long j = Long.MAX_VALUE;
        if (i2 != com.smartdigimkt.c4.a.p0) {
            if (i2 == com.smartdigimkt.c4.a.A0) {
                int i6 = i4 - 16;
                byte[] bArr = new byte[i6];
                sVar.a(bArr, 0, i6);
                listSingletonList = Collections.singletonList(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i2 == com.smartdigimkt.c4.a.B0) {
                str2 = "application/x-mp4-vtt";
            } else if (i2 == com.smartdigimkt.c4.a.C0) {
                j = 0;
            } else if (i2 == com.smartdigimkt.c4.a.D0) {
                cVar.d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f34186b = com.smartdigimkt.w3.m.a(Integer.toString(i5), str2, (String) null, -1, 0, str, -1, (com.smartdigimkt.a4.e) null, j, (List<byte[]>) listSingletonList);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0142 A[PHI: r13
  0x0142: PHI (r13v2 int) = (r13v1 int), (r13v3 int) binds: [B:74:0x0137, B:76:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    private static void a(s sVar, int i2, int i3, int i4, int i5, int i6, com.smartdigimkt.a4.e eVar, c cVar, int i7) throws t {
        String str;
        List<byte[]> list;
        com.smartdigimkt.a4.e eVarA = eVar;
        sVar.e(i3 + 16);
        sVar.f(16);
        int iD = sVar.D();
        int iD2 = sVar.D();
        sVar.f(50);
        int iC = sVar.c();
        String str2 = null;
        int iIntValue = i2;
        if (iIntValue == com.smartdigimkt.c4.a.f0) {
            Pair<Integer, k> pairD = d(sVar, i3, i4);
            if (pairD != null) {
                iIntValue = ((Integer) pairD.first).intValue();
                eVarA = eVarA == null ? null : eVarA.a(((k) pairD.second).f34280b);
                cVar.f34185a[i7] = (k) pairD.second;
            }
            sVar.e(iC);
        }
        com.smartdigimkt.a4.e eVar2 = eVarA;
        float fD = 1.0f;
        List<byte[]> listSingletonList = null;
        byte[] bArrC = null;
        int i8 = -1;
        boolean z2 = false;
        while (iC - i3 < i4) {
            sVar.e(iC);
            int iC2 = sVar.c();
            int i9 = sVar.i();
            if (i9 == 0 && sVar.c() - i3 == i4) {
                break;
            }
            int i10 = 1;
            com.smartdigimkt.p4.a.a(i9 > 0, "childAtomSize should be positive");
            int i11 = sVar.i();
            if (i11 == com.smartdigimkt.c4.a.f34150N) {
                com.smartdigimkt.p4.a.b(str2 == null);
                sVar.e(iC2 + 8);
                com.smartdigimkt.q4.a aVarB = com.smartdigimkt.q4.a.b(sVar);
                list = aVarB.f37884a;
                cVar.f34187c = aVarB.f37885b;
                if (!z2) {
                    fD = aVarB.f37887e;
                }
                str = "video/avc";
            } else {
                if (i11 == com.smartdigimkt.c4.a.O) {
                    com.smartdigimkt.p4.a.b(str2 == null);
                    sVar.e(iC2 + 8);
                    com.smartdigimkt.q4.d dVarA = com.smartdigimkt.q4.d.a(sVar);
                    list = dVarA.f37898a;
                    cVar.f34187c = dVarA.f37899b;
                    str = "video/hevc";
                } else {
                    if (i11 == com.smartdigimkt.c4.a.S0) {
                        com.smartdigimkt.p4.a.b(str2 == null);
                        str = iIntValue == com.smartdigimkt.c4.a.Q0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    } else if (i11 == com.smartdigimkt.c4.a.m) {
                        com.smartdigimkt.p4.a.b(str2 == null);
                        str = "video/3gpp";
                    } else if (i11 == com.smartdigimkt.c4.a.f34151P) {
                        com.smartdigimkt.p4.a.b(str2 == null);
                        Pair<String, byte[]> pairA = a(sVar, iC2);
                        str2 = (String) pairA.first;
                        listSingletonList = Collections.singletonList((byte[]) pairA.second);
                    } else if (i11 == com.smartdigimkt.c4.a.o0) {
                        fD = d(sVar, iC2);
                        z2 = true;
                    } else if (i11 == com.smartdigimkt.c4.a.O0) {
                        bArrC = c(sVar, iC2, i9);
                    } else if (i11 == com.smartdigimkt.c4.a.N0) {
                        int iX = sVar.x();
                        sVar.f(3);
                        if (iX == 0) {
                            int iX2 = sVar.x();
                            if (iX2 == 0) {
                                i8 = 0;
                            } else if (iX2 != 1) {
                                i10 = 2;
                                if (iX2 == 2) {
                                    i8 = i10;
                                } else if (iX2 == 3) {
                                    i8 = 3;
                                }
                            } else {
                                i8 = i10;
                            }
                        }
                    }
                    str2 = str;
                }
                iC += i9;
            }
            listSingletonList = list;
            str2 = str;
            iC += i9;
        }
        if (str2 == null) {
            return;
        }
        cVar.f34186b = com.smartdigimkt.w3.m.a(Integer.toString(i5), str2, (String) null, -1, -1, iD, iD2, -1.0f, listSingletonList, i6, fD, bArrC, i8, (com.smartdigimkt.q4.b) null, eVar2);
    }

    private static Pair<long[], long[]> a(com.smartdigimkt.c4.a.C0451a c0451a) {
        com.smartdigimkt.c4.a.b bVarF;
        if (c0451a != null && (bVarF = c0451a.f(com.smartdigimkt.c4.a.W)) != null) {
            s sVar = bVarF.V0;
            sVar.e(8);
            int iC = com.smartdigimkt.c4.a.c(sVar.i());
            int iB = sVar.B();
            long[] jArr = new long[iB];
            long[] jArr2 = new long[iB];
            for (int i2 = 0; i2 < iB; i2++) {
                jArr[i2] = iC == 1 ? sVar.C() : sVar.z();
                jArr2[i2] = iC == 1 ? sVar.t() : sVar.i();
                if (sVar.v() == 1) {
                    sVar.f(2);
                } else {
                    throw new IllegalArgumentException("Unsupported media rate.");
                }
            }
            return Pair.create(jArr, jArr2);
        }
        return Pair.create(null, null);
    }

    private static void a(s sVar, int i2, int i3, int i4, int i5, String str, boolean z2, com.smartdigimkt.a4.e eVar, c cVar, int i6) throws t {
        int iD;
        int iY;
        int iB;
        String str2;
        int i7;
        com.smartdigimkt.a4.e eVar2;
        int i8;
        String str3;
        int i9;
        boolean z3;
        int i10;
        int i11 = i3;
        int i12 = i4;
        com.smartdigimkt.a4.e eVarA = eVar;
        sVar.e(i11 + 16);
        if (z2) {
            iD = sVar.D();
            sVar.f(6);
        } else {
            sVar.f(8);
            iD = 0;
        }
        int i13 = 2;
        boolean z4 = true;
        if (iD == 0 || iD == 1) {
            int iD2 = sVar.D();
            sVar.f(6);
            iY = sVar.y();
            if (iD == 1) {
                sVar.f(16);
            }
            iB = iD2;
        } else {
            if (iD != 2) {
                return;
            }
            sVar.f(16);
            iY = (int) Math.round(sVar.g());
            iB = sVar.B();
            sVar.f(20);
        }
        int iC = sVar.c();
        int iIntValue = i2;
        if (iIntValue == com.smartdigimkt.c4.a.g0) {
            Pair<Integer, k> pairD = d(sVar, i11, i12);
            if (pairD != null) {
                iIntValue = ((Integer) pairD.first).intValue();
                eVarA = eVarA == null ? null : eVarA.a(((k) pairD.second).f34280b);
                cVar.f34185a[i6] = (k) pairD.second;
            }
            sVar.e(iC);
        }
        com.smartdigimkt.a4.e eVar3 = eVarA;
        String str4 = "audio/raw";
        if (iIntValue == com.smartdigimkt.c4.a.t) {
            str2 = "audio/ac3";
        } else if (iIntValue == com.smartdigimkt.c4.a.v) {
            str2 = "audio/eac3";
        } else if (iIntValue == com.smartdigimkt.c4.a.x) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue != com.smartdigimkt.c4.a.y && iIntValue != com.smartdigimkt.c4.a.f34170z) {
            if (iIntValue == com.smartdigimkt.c4.a.f34144A) {
                str2 = "audio/vnd.dts.hd;profile=lbr";
            } else if (iIntValue == com.smartdigimkt.c4.a.E0) {
                str2 = "audio/3gpp";
            } else if (iIntValue == com.smartdigimkt.c4.a.F0) {
                str2 = "audio/amr-wb";
            } else if (iIntValue == com.smartdigimkt.c4.a.r || iIntValue == com.smartdigimkt.c4.a.s) {
                str2 = "audio/raw";
            } else if (iIntValue == com.smartdigimkt.c4.a.f34167p) {
                str2 = "audio/mpeg";
            } else {
                str2 = iIntValue == com.smartdigimkt.c4.a.U0 ? "audio/alac" : null;
            }
        } else {
            str2 = "audio/vnd.dts.hd";
        }
        int i14 = iY;
        String str5 = str2;
        int i15 = i14;
        int iIntValue2 = iB;
        int i16 = iC;
        byte[] bArr = null;
        while (i16 - i11 < i12) {
            sVar.e(i16);
            int i17 = sVar.i();
            com.smartdigimkt.p4.a.a(i17 > 0 ? z4 : false, "childAtomSize should be positive");
            int i18 = sVar.i();
            int i19 = com.smartdigimkt.c4.a.f34151P;
            if (i18 != i19 && (!z2 || i18 != com.smartdigimkt.c4.a.q)) {
                if (i18 == com.smartdigimkt.c4.a.f34168u) {
                    sVar.e(i16 + 8);
                    cVar.f34186b = com.smartdigimkt.y3.a.a(sVar, Integer.toString(i5), str, eVar3);
                } else if (i18 == com.smartdigimkt.c4.a.f34169w) {
                    sVar.e(i16 + 8);
                    cVar.f34186b = com.smartdigimkt.y3.a.b(sVar, Integer.toString(i5), str, eVar3);
                } else if (i18 == com.smartdigimkt.c4.a.f34145B) {
                    eVar2 = eVar3;
                    i10 = i15;
                    i7 = i16;
                    i8 = i17;
                    str3 = str4;
                    i9 = 2;
                    z3 = true;
                    cVar.f34186b = com.smartdigimkt.w3.m.a(Integer.toString(i5), str5, null, -1, -1, iIntValue2, i10, null, eVar2, 0, str);
                } else {
                    i7 = i16;
                    eVar2 = eVar3;
                    i8 = i17;
                    str3 = str4;
                    i9 = 2;
                    z3 = true;
                    i10 = i15;
                    if (i18 == com.smartdigimkt.c4.a.U0) {
                        byte[] bArr2 = new byte[i8];
                        sVar.e(i7);
                        sVar.a(bArr2, 0, i8);
                        bArr = bArr2;
                    }
                }
                i7 = i16;
                eVar2 = eVar3;
                i8 = i17;
                str3 = str4;
                i9 = 2;
                z3 = true;
                i10 = i15;
            } else {
                i7 = i16;
                eVar2 = eVar3;
                i8 = i17;
                str3 = str4;
                i9 = 2;
                z3 = true;
                i10 = i15;
                int iA = i18 == i19 ? i7 : a(sVar, i7, i8);
                if (iA != -1) {
                    Pair<String, byte[]> pairA = a(sVar, iA);
                    str5 = (String) pairA.first;
                    bArr = (byte[]) pairA.second;
                    if ("audio/mp4a-latm".equals(str5)) {
                        Pair<Integer, Integer> pairA2 = com.smartdigimkt.p4.d.a(bArr);
                        int iIntValue3 = ((Integer) pairA2.first).intValue();
                        iIntValue2 = ((Integer) pairA2.second).intValue();
                        i15 = iIntValue3;
                    }
                }
                str4 = str3;
                i16 = i8 + i7;
                eVar3 = eVar2;
                i13 = i9;
                z4 = z3;
                i11 = i3;
                i12 = i4;
            }
            i15 = i10;
            str4 = str3;
            i16 = i8 + i7;
            eVar3 = eVar2;
            i13 = i9;
            z4 = z3;
            i11 = i3;
            i12 = i4;
        }
        int i20 = i13;
        com.smartdigimkt.a4.e eVar4 = eVar3;
        String str6 = str4;
        int i21 = i15;
        if (cVar.f34186b != null || str5 == null) {
            return;
        }
        cVar.f34186b = com.smartdigimkt.w3.m.a(Integer.toString(i5), str5, (String) null, -1, -1, iIntValue2, i21, str6.equals(str5) ? i20 : -1, (List<byte[]>) (bArr != null ? Collections.singletonList(bArr) : null), eVar4, 0, str);
    }

    private static int a(s sVar, int i2, int i3) {
        int iC = sVar.c();
        while (iC - i2 < i3) {
            sVar.e(iC);
            int i4 = sVar.i();
            com.smartdigimkt.p4.a.a(i4 > 0, "childAtomSize should be positive");
            if (sVar.i() == com.smartdigimkt.c4.a.f34151P) {
                return iC;
            }
            iC += i4;
        }
        return -1;
    }

    private static Pair<String, byte[]> a(s sVar, int i2) {
        sVar.e(i2 + 12);
        sVar.f(1);
        a(sVar);
        sVar.f(2);
        int iX = sVar.x();
        if ((iX & 128) != 0) {
            sVar.f(2);
        }
        if ((iX & 64) != 0) {
            sVar.f(sVar.D());
        }
        if ((iX & 32) != 0) {
            sVar.f(2);
        }
        sVar.f(1);
        a(sVar);
        String strA = o.a(sVar.x());
        if (!"audio/mpeg".equals(strA) && !"audio/vnd.dts".equals(strA) && !"audio/vnd.dts.hd".equals(strA)) {
            sVar.f(12);
            sVar.f(1);
            int iA = a(sVar);
            byte[] bArr = new byte[iA];
            sVar.a(bArr, 0, iA);
            return Pair.create(strA, bArr);
        }
        return Pair.create(strA, null);
    }

    private static k a(s sVar, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6 = i2 + 8;
        while (true) {
            byte[] bArr = null;
            if (i6 - i2 >= i3) {
                return null;
            }
            sVar.e(i6);
            int i7 = sVar.i();
            if (sVar.i() == com.smartdigimkt.c4.a.e0) {
                int iC = com.smartdigimkt.c4.a.c(sVar.i());
                sVar.f(1);
                if (iC == 0) {
                    sVar.f(1);
                    i5 = 0;
                    i4 = 0;
                } else {
                    int iX = sVar.x();
                    i4 = iX & 15;
                    i5 = (iX & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                boolean z2 = sVar.x() == 1;
                int iX2 = sVar.x();
                byte[] bArr2 = new byte[16];
                sVar.a(bArr2, 0, 16);
                if (z2 && iX2 == 0) {
                    int iX3 = sVar.x();
                    bArr = new byte[iX3];
                    sVar.a(bArr, 0, iX3);
                }
                return new k(z2, str, iX2, bArr2, i5, i4, bArr);
            }
            i6 += i7;
        }
    }

    private static int a(s sVar) {
        int iX = sVar.x();
        int i2 = iX & 127;
        while ((iX & 128) == 128) {
            iX = sVar.x();
            i2 = (i2 << 7) | (iX & 127);
        }
        return i2;
    }

    private static boolean a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[f0.a(3, 0, length)] && jArr[f0.a(jArr.length - 3, 0, length)] < j3 && j3 <= j;
    }
}
