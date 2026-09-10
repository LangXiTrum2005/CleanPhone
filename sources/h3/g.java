package h3;

import android.util.Pair;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import bc.s;
import com.google.android.gms.internal.ads.kj1;
import com.google.android.gms.internal.ads.q2;
import com.google.android.gms.internal.ads.y6;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import d5.u;
import i1.c0;
import i1.d0;
import i1.e0;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;
import l1.x;
import l1.y;
import n2.a0;
import n2.t;
import oa.f0;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements n2.k {
    public static final byte[] P = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final i1.p Q;
    public long A;
    public long B;
    public long C;
    public f D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public n2.m J;
    public a0[] K;
    public a0[] L;
    public boolean M;
    public boolean N;
    public long O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3.k f42110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f42112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f42113d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f42118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l1.q f42119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x f42120k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kj1 f42124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a0 f42125q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n5.f f42126r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n1 f42127s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f42128t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f42129u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f42130v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f42131w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l1.q f42132x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f42133y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f42134z;
    public final v6.c l = new v6.c(13);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l1.q f42121m = new l1.q(16);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l1.q f42115f = new l1.q(m1.n.f45820a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l1.q f42116g = new l1.q(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l1.q f42117h = new l1.q();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque f42122n = new ArrayDeque();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayDeque f42123o = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f42114e = new SparseArray();

    static {
        i1.o oVar = new i1.o();
        oVar.f42600m = d0.n(MimeTypes.APPLICATION_EMSG);
        Q = new i1.p(oVar);
    }

    public g(k3.k kVar, int i10, x xVar, p pVar, List list, s1.l lVar) {
        this.f42110a = kVar;
        this.f42111b = i10;
        this.f42120k = xVar;
        this.f42112c = pVar;
        this.f42113d = Collections.unmodifiableList(list);
        this.f42125q = lVar;
        byte[] bArr = new byte[16];
        this.f42118i = bArr;
        this.f42119j = new l1.q(bArr);
        f0 f0Var = j0.f47265b;
        this.f42127s = n1.f47281e;
        this.B = C.TIME_UNSET;
        this.A = C.TIME_UNSET;
        this.C = C.TIME_UNSET;
        this.J = n2.m.f46479t9;
        this.K = new a0[0];
        this.L = new a0[0];
        this.f42124p = new kj1(new a4.a(this, 27));
        this.f42126r = new n5.f(28);
        this.O = -1L;
    }

    public static i1.m f(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            m1.d dVar = (m1.d) list.get(i10);
            if (dVar.f22444b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = dVar.f45776c.f44813a;
                od.c cVarI = o.i(bArr);
                UUID uuid = cVarI == null ? null : (UUID) cVarI.f47386b;
                if (uuid == null) {
                    l1.a.s("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new i1.l(uuid, null, MimeTypes.VIDEO_MP4, bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new i1.m(null, false, (i1.l[]) arrayList.toArray(new i1.l[0]));
    }

    public static void g(l1.q qVar, int i10, y6 y6Var) throws e0 {
        qVar.M(i10 + 8);
        int iM = qVar.m();
        byte[] bArr = b.f42089a;
        if ((iM & 1) != 0) {
            throw e0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iM & 2) != 0;
        int iD = qVar.D();
        if (iD == 0) {
            Arrays.fill(y6Var.f22170k, 0, y6Var.f22163d, false);
            return;
        }
        int i11 = y6Var.f22163d;
        l1.q qVar2 = (l1.q) y6Var.f22175q;
        if (iD != i11) {
            StringBuilder sbU = defpackage.e.u(iD, "Senc sample count ", " is different from fragment sample count");
            sbU.append(y6Var.f22163d);
            throw e0.a(null, sbU.toString());
        }
        Arrays.fill(y6Var.f22170k, 0, iD, z10);
        qVar2.J(qVar.a());
        y6Var.f22169j = true;
        y6Var.l = true;
        qVar.k(qVar2.f44813a, 0, qVar2.f44815c);
        qVar2.M(0);
        y6Var.l = false;
    }

    public static Pair h(long j10, l1.q qVar) throws e0 {
        long jF;
        long jF2;
        l1.q qVar2 = qVar;
        qVar2.M(8);
        int iE = b.e(qVar2.m());
        qVar2.N(4);
        long jB = qVar2.B();
        if (iE == 0) {
            jF = qVar2.B();
            jF2 = qVar2.B();
        } else {
            jF = qVar2.F();
            jF2 = qVar2.F();
        }
        long j11 = jF2 + j10;
        String str = y.f44830a;
        long jU = y.U(jF, 1000000L, jB, RoundingMode.DOWN);
        qVar2.N(2);
        int iG = qVar2.G();
        int[] iArr = new int[iG];
        long[] jArr = new long[iG];
        long[] jArr2 = new long[iG];
        long[] jArr3 = new long[iG];
        long j12 = j11;
        long j13 = jU;
        int i10 = 0;
        while (i10 < iG) {
            int iM = qVar2.m();
            if ((Integer.MIN_VALUE & iM) != 0) {
                throw e0.a(null, "Unhandled indirect reference");
            }
            long jB2 = qVar2.B();
            iArr[i10] = iM & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            jF += jB2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jU2 = y.U(jF, 1000000L, jB, RoundingMode.DOWN);
            jArr4[i10] = jU2 - jArr5[i10];
            qVar2.N(4);
            j12 += (long) iArr[i10];
            i10++;
            iG = iG;
            qVar2 = qVar;
            j13 = jU2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jU), new n2.g(iArr, jArr, jArr2, jArr3));
    }

    @Override // n2.k
    public final boolean a(n2.l lVar) {
        n1 n1VarB;
        n2.x xVarL = o.l(lVar, true, false);
        if (xVarL != null) {
            n1VarB = j0.B(xVarL);
        } else {
            f0 f0Var = j0.f47265b;
            n1VarB = n1.f47281e;
        }
        this.f42127s = n1VarB;
        return xVarL == null;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x020b  */
    /* JADX WARN: Code duplicated, block: B:130:0x027a  */
    /* JADX WARN: Code duplicated, block: B:521:0x0287 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // n2.k
    public final int b(n2.l lVar, q2 q2Var) throws e0 {
        kj1 kj1Var;
        l1.q qVar;
        ArrayDeque arrayDeque;
        int i10;
        x xVar;
        f fVar;
        boolean z10;
        int i11;
        f fVar2;
        String str;
        int i12;
        int iC;
        int i13;
        boolean z11;
        int i14;
        int i15;
        String strU;
        String strU2;
        long j10;
        long jA;
        long jU;
        long jB;
        while (true) {
            int i16 = this.f42128t;
            ArrayDeque arrayDeque2 = this.f42122n;
            kj1Var = this.f42124p;
            qVar = this.f42119j;
            n5.f fVar3 = this.f42126r;
            SparseArray sparseArray = this.f42114e;
            boolean z12 = true;
            if (i16 != 0) {
                arrayDeque = this.f42123o;
                i10 = this.f42111b;
                xVar = this.f42120k;
                if (i16 != 1) {
                    long j11 = Long.MAX_VALUE;
                    if (i16 != 2) {
                        fVar = this.D;
                        if (fVar != null) {
                            z10 = true;
                            i11 = 8;
                            break;
                        }
                        int size = sparseArray.size();
                        int i17 = 0;
                        f fVar4 = null;
                        while (i17 < size) {
                            f fVar5 = (f) sparseArray.valueAt(i17);
                            boolean z13 = z12;
                            boolean z14 = fVar5.f42109m;
                            y6 y6Var = fVar5.f42099b;
                            if (z14) {
                                i15 = size;
                            } else {
                                i15 = size;
                                if (fVar5.f42103f != fVar5.f42101d.f42198b) {
                                }
                                i17++;
                                z12 = z13;
                                size = i15;
                            }
                            if (!z14 || fVar5.f42105h != y6Var.f22162c) {
                                long j12 = !z14 ? fVar5.f42101d.f42199c[fVar5.f42103f] : y6Var.f22164e[fVar5.f42105h];
                                if (j12 < j11) {
                                    fVar4 = fVar5;
                                    j11 = j12;
                                }
                            }
                            i17++;
                            z12 = z13;
                            size = i15;
                        }
                        z10 = z12;
                        i11 = 8;
                        if (fVar4 != null) {
                            int position = (int) ((!fVar4.f42109m ? fVar4.f42101d.f42199c[fVar4.f42103f] : fVar4.f42099b.f22164e[fVar4.f42105h]) - lVar.getPosition());
                            if (position < 0) {
                                l1.a.s("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position = 0;
                            }
                            lVar.skipFully(position);
                            this.D = fVar4;
                            fVar = fVar4;
                            break;
                        }
                        int position2 = (int) (this.f42133y - lVar.getPosition());
                        if (position2 < 0) {
                            throw e0.a(null, "Offset to end of mdat was negative.");
                        }
                        lVar.skipFully(position2);
                        e();
                    } else {
                        int size2 = sparseArray.size();
                        f fVar6 = null;
                        for (int i18 = 0; i18 < size2; i18++) {
                            y6 y6Var2 = ((f) sparseArray.valueAt(i18)).f42099b;
                            if (y6Var2.l) {
                                long j13 = y6Var2.f22161b;
                                if (j13 < j11) {
                                    fVar6 = (f) sparseArray.valueAt(i18);
                                    j11 = j13;
                                }
                            }
                        }
                        if (fVar6 == null) {
                            this.f42128t = 3;
                        } else {
                            int position3 = (int) (j11 - lVar.getPosition());
                            if (position3 < 0) {
                                throw e0.a(null, "Offset to encryption data was negative.");
                            }
                            lVar.skipFully(position3);
                            y6 y6Var3 = fVar6.f42099b;
                            l1.q qVar2 = (l1.q) y6Var3.f22175q;
                            lVar.readFully(qVar2.f44813a, 0, qVar2.f44815c);
                            qVar2.M(0);
                            y6Var3.l = false;
                        }
                    }
                } else {
                    int i19 = (int) (this.f42130v - ((long) this.f42131w));
                    l1.q qVar3 = this.f42132x;
                    if (qVar3 != null) {
                        lVar.readFully(qVar3.f44813a, 8, i19);
                        int i20 = this.f42129u;
                        m1.d dVar = new m1.d(i20, qVar3);
                        if (!arrayDeque2.isEmpty()) {
                            ((m1.c) arrayDeque2.peek()).f45774d.add(dVar);
                        } else if (i20 == 1936286840) {
                            Pair pairH = h(lVar.getPosition(), qVar3);
                            fVar3.m((n2.g) pairH.second);
                            if (!this.M) {
                                this.C = ((Long) pairH.first).longValue();
                                this.J.u((t) pairH.second);
                                this.M = true;
                            } else if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 && !this.N && ((LinkedHashMap) fVar3.f46523b).size() > 1) {
                                this.O = lVar.getPosition();
                            }
                        } else if (i20 == 1701671783 && this.K.length != 0) {
                            qVar3.M(8);
                            int iE = b.e(qVar3.m());
                            long j14 = C.TIME_UNSET;
                            if (iE == 0) {
                                strU = qVar3.u();
                                strU.getClass();
                                strU2 = qVar3.u();
                                strU2.getClass();
                                long jB2 = qVar3.B();
                                long jB3 = qVar3.B();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long jU2 = y.U(jB3, 1000000L, jB2, roundingMode);
                                long j15 = this.C;
                                long j16 = j15 != C.TIME_UNSET ? j15 + jU2 : -9223372036854775807L;
                                j10 = jU2;
                                jA = j16;
                                jU = y.U(qVar3.B(), 1000L, jB2, roundingMode);
                                jB = qVar3.B();
                            } else if (iE != 1) {
                                u.v(iE, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long jB4 = qVar3.B();
                                long jF = qVar3.F();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                jA = y.U(jF, 1000000L, jB4, roundingMode2);
                                long jU3 = y.U(qVar3.B(), 1000L, jB4, roundingMode2);
                                long jB5 = qVar3.B();
                                strU = qVar3.u();
                                strU.getClass();
                                strU2 = qVar3.u();
                                strU2.getClass();
                                jU = jU3;
                                jB = jB5;
                                j10 = -9223372036854775807L;
                            }
                            String str2 = strU;
                            String str3 = strU2;
                            byte[] bArr = new byte[qVar3.a()];
                            qVar3.k(bArr, 0, qVar3.a());
                            l1.q qVar4 = new l1.q(this.l.o(new y2.a(str2, str3, jU, jB, bArr)));
                            int iA = qVar4.a();
                            a0[] a0VarArr = this.K;
                            int length = a0VarArr.length;
                            int i21 = 0;
                            while (i21 < length) {
                                a0 a0Var = a0VarArr[i21];
                                qVar4.M(0);
                                a0Var.g(iA, qVar4);
                                i21++;
                                j14 = j14;
                            }
                            if (jA == j14) {
                                arrayDeque.addLast(new e(j10, iA, true));
                                this.f42134z += iA;
                            } else if (!arrayDeque.isEmpty()) {
                                arrayDeque.addLast(new e(jA, iA, false));
                                this.f42134z += iA;
                            } else if (xVar == null || xVar.e()) {
                                if (xVar != null) {
                                    jA = xVar.a(jA);
                                }
                                long j17 = jA;
                                for (a0 a0Var2 : this.K) {
                                    a0Var2.a(j17, 1, iA, 0, null);
                                }
                            } else {
                                arrayDeque.addLast(new e(jA, iA, false));
                                this.f42134z += iA;
                            }
                        }
                    } else {
                        lVar.skipFully(i19);
                    }
                    i(lVar.getPosition());
                }
            } else {
                int i22 = this.f42131w;
                long length2 = 0;
                l1.q qVar5 = this.f42121m;
                if (i22 == 0) {
                    if (!lVar.readFully(qVar5.f44813a, 0, 8, true)) {
                        long j18 = this.O;
                        if (j18 == -1) {
                            kj1Var.o(0);
                            return -1;
                        }
                        q2Var.f18888a = j18;
                        this.O = -1L;
                        n2.m mVar = this.J;
                        fVar3.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (n2.g gVar : ((LinkedHashMap) fVar3.f46523b).values()) {
                            arrayList.add(gVar.f46458b);
                            arrayList2.add(gVar.f46459c);
                            arrayList3.add(gVar.f46460d);
                            arrayList4.add(gVar.f46461e);
                        }
                        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
                        for (int[] iArr2 : iArr) {
                            length2 += (long) iArr2.length;
                        }
                        int i23 = (int) length2;
                        go.k.f(length2, length2 == ((long) i23), "the total number of elements (%s) in the arrays must fit in an int");
                        int[] iArr3 = new int[i23];
                        int length3 = 0;
                        for (int[] iArr4 : iArr) {
                            System.arraycopy(iArr4, 0, iArr3, length3, iArr4.length);
                            length3 += iArr4.length;
                        }
                        mVar.u(new n2.g(iArr3, com.bumptech.glide.d.p((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), com.bumptech.glide.d.p((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), com.bumptech.glide.d.p((long[][]) arrayList4.toArray(new long[arrayList4.size()][]))));
                        this.N = true;
                        return 1;
                    }
                    this.f42131w = 8;
                    qVar5.M(0);
                    this.f42130v = qVar5.B();
                    this.f42129u = qVar5.m();
                }
                long j19 = this.f42130v;
                if (j19 == 1) {
                    lVar.readFully(qVar5.f44813a, 8, 8);
                    this.f42131w += 8;
                    this.f42130v = qVar5.F();
                } else if (j19 == 0) {
                    long length4 = lVar.getLength();
                    if (length4 == -1 && !arrayDeque2.isEmpty()) {
                        length4 = ((m1.c) arrayDeque2.peek()).f45773c;
                    }
                    if (length4 != -1) {
                        this.f42130v = (length4 - lVar.getPosition()) + ((long) this.f42131w);
                    }
                }
                long j20 = this.f42130v;
                int i24 = this.f42131w;
                long j21 = i24;
                if (j20 < j21) {
                    if (this.f42129u != 1718773093 || i24 != 8) {
                        throw e0.c("Atom size less than header length (unsupported).");
                    }
                    this.f42130v = j21;
                }
                if (this.O != -1) {
                    if (this.f42129u == 1936286840) {
                        qVar.J((int) this.f42130v);
                        System.arraycopy(qVar5.f44813a, 0, qVar.f44813a, 0, 8);
                        lVar.readFully(qVar.f44813a, 8, (int) (this.f42130v - ((long) this.f42131w)));
                        fVar3.m((n2.g) h(lVar.getPeekPosition(), qVar).second);
                    } else {
                        lVar.skipFully((int) (this.f42130v - j21), true);
                    }
                    e();
                } else {
                    long position4 = lVar.getPosition() - ((long) this.f42131w);
                    int i25 = this.f42129u;
                    if ((i25 == 1836019558 || i25 == 1835295092) && !this.M) {
                        this.J.u(new n2.o(this.B, position4));
                        this.M = true;
                    }
                    if (this.f42129u == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i26 = 0; i26 < size3; i26++) {
                            y6 y6Var4 = ((f) sparseArray.valueAt(i26)).f42099b;
                            y6Var4.getClass();
                            y6Var4.f22161b = position4;
                            y6Var4.f22160a = position4;
                        }
                    }
                    int i27 = this.f42129u;
                    if (i27 == 1835295092) {
                        this.D = null;
                        this.f42133y = position4 + this.f42130v;
                        this.f42128t = 2;
                    } else if (i27 == 1836019574 || i27 == 1953653099 || i27 == 1835297121 || i27 == 1835626086 || i27 == 1937007212 || i27 == 1836019558 || i27 == 1953653094 || i27 == 1836475768 || i27 == 1701082227 || i27 == 1835365473) {
                        long position5 = lVar.getPosition();
                        long j22 = this.f42130v;
                        long j23 = (position5 + j22) - 8;
                        if (j22 != this.f42131w && this.f42129u == 1835365473) {
                            qVar.J(8);
                            lVar.peekFully(qVar.f44813a, 0, 8);
                            b.a(qVar);
                            lVar.skipFully(qVar.f44814b);
                            lVar.resetPeekPosition();
                        }
                        arrayDeque2.push(new m1.c(this.f42129u, j23));
                        if (this.f42130v == this.f42131w) {
                            i(j23);
                        } else {
                            e();
                        }
                    } else if (i27 == 1751411826 || i27 == 1835296868 || i27 == 1836476516 || i27 == 1936286840 || i27 == 1937011556 || i27 == 1937011827 || i27 == 1668576371 || i27 == 1937011555 || i27 == 1937011578 || i27 == 1937013298 || i27 == 1937007471 || i27 == 1668232756 || i27 == 1937011571 || i27 == 1952867444 || i27 == 1952868452 || i27 == 1953196132 || i27 == 1953654136 || i27 == 1953658222 || i27 == 1886614376 || i27 == 1935763834 || i27 == 1935763823 || i27 == 1936027235 || i27 == 1970628964 || i27 == 1935828848 || i27 == 1936158820 || i27 == 1701606260 || i27 == 1835362404 || i27 == 1701671783 || i27 == 1969517665 || i27 == 1801812339 || i27 == 1768715124) {
                        if (this.f42131w != 8) {
                            throw e0.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.f42130v > 2147483647L) {
                            throw e0.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        l1.q qVar6 = new l1.q((int) this.f42130v);
                        System.arraycopy(qVar5.f44813a, 0, qVar6.f44813a, 0, 8);
                        this.f42132x = qVar6;
                        this.f42128t = 1;
                    } else {
                        if (this.f42130v > 2147483647L) {
                            throw e0.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f42132x = null;
                        this.f42128t = 1;
                    }
                }
            }
        }
        y6 y6Var5 = fVar.f42099b;
        String str4 = "video/avc";
        if (this.f42128t == 3) {
            this.E = !fVar.f42109m ? fVar.f42101d.f42200d[fVar.f42103f] : y6Var5.f22166g[fVar.f42103f];
            i1.p pVar = fVar.f42101d.f42197a.f42187g;
            this.H = !((!Objects.equals(pVar.f42643n, "video/avc") ? !(!Objects.equals(pVar.f42643n, "video/hevc") || (i10 & 128) == 0) : (i10 & 64) != 0) ? false : z10);
            if (fVar.f42103f < fVar.f42106i) {
                lVar.skipFully(this.E);
                q qVarB = fVar.b();
                if (qVarB != null) {
                    l1.q qVar7 = (l1.q) y6Var5.f22175q;
                    int i28 = qVarB.f42195d;
                    if (i28 != 0) {
                        qVar7.N(i28);
                    }
                    int i29 = fVar.f42103f;
                    if (y6Var5.f22169j && y6Var5.f22170k[i29]) {
                        qVar7.N(qVar7.G() * 6);
                    }
                }
                if (!fVar.c()) {
                    this.D = null;
                }
                this.f42128t = 3;
                return 0;
            }
            if (fVar.f42101d.f42197a.f42188h == z10) {
                this.E -= 8;
                lVar.skipFully(i11);
            }
            if ("audio/ac4".equals(fVar.f42101d.f42197a.f42187g.f42643n)) {
                this.F = fVar.d(this.E, 7);
                n2.b.i(this.E, qVar);
                fVar.f42098a.g(7, qVar);
                this.F += 7;
                i14 = 0;
            } else {
                i14 = 0;
                this.F = fVar.d(this.E, 0);
            }
            this.E += this.F;
            this.f42128t = 4;
            this.G = i14;
        }
        r rVar = fVar.f42101d;
        p pVar2 = rVar.f42197a;
        a0 a0Var3 = fVar.f42098a;
        long jA2 = fVar.f42109m ? y6Var5.f22167h[fVar.f42103f] : rVar.f42202f[fVar.f42103f];
        if (xVar != null) {
            jA2 = xVar.a(jA2);
        }
        int i30 = pVar2.f42191k;
        i1.p pVar3 = pVar2.f42187g;
        if (i30 == 0) {
            fVar2 = fVar;
            while (true) {
                int i31 = this.F;
                int i32 = this.E;
                if (i31 >= i32) {
                    break;
                }
                this.F += a0Var3.c(lVar, i32 - i31, false);
            }
        } else {
            l1.q qVar8 = this.f42116g;
            byte[] bArr2 = qVar8.f44813a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i33 = 4 - i30;
            fVar2 = fVar;
            while (true) {
                int i34 = i30;
                if (this.F >= this.E) {
                    break;
                }
                int i35 = this.G;
                if (i35 == 0) {
                    if (this.L.length > 0 || !this.H) {
                        int iE2 = m1.n.e(pVar3);
                        if (i34 + iE2 <= this.E - this.F) {
                            i13 = iE2;
                        } else {
                            i13 = 0;
                        }
                    } else {
                        i13 = 0;
                    }
                    lVar.readFully(bArr2, i33, i34 + i13);
                    qVar8.M(0);
                    int iM = qVar8.m();
                    if (iM < 0) {
                        throw e0.a(null, "Invalid NAL length");
                    }
                    this.G = iM - i13;
                    l1.q qVar9 = this.f42115f;
                    i12 = i33;
                    qVar9.M(0);
                    a0Var3.g(4, qVar9);
                    this.F += 4;
                    this.E += i12;
                    if (this.L.length <= 0 || i13 <= 0) {
                        str = str4;
                    } else {
                        byte b10 = bArr2[4];
                        String strC = m1.n.c(pVar3);
                        if (Objects.equals(strC, str4)) {
                            str = str4;
                            if ((b10 & 31) != 6) {
                            }
                            z11 = true;
                            this.I = z11;
                            a0Var3.g(i13, qVar8);
                            this.F += i13;
                            if (i13 <= 0 && !this.H && m1.n.d(bArr2, i13, pVar3)) {
                                this.H = true;
                            }
                        } else {
                            str = str4;
                        }
                        if (Objects.equals(strC, "video/hevc") && ((b10 & 126) >> 1) == 39) {
                            z11 = true;
                        }
                        this.I = z11;
                        a0Var3.g(i13, qVar8);
                        this.F += i13;
                        if (i13 <= 0) {
                        }
                    }
                    z11 = false;
                    this.I = z11;
                    a0Var3.g(i13, qVar8);
                    this.F += i13;
                    if (i13 <= 0) {
                    }
                } else {
                    str = str4;
                    i12 = i33;
                    if (this.I) {
                        l1.q qVar10 = this.f42117h;
                        qVar10.J(i35);
                        lVar.readFully(qVar10.f44813a, 0, this.G);
                        a0Var3.g(this.G, qVar10);
                        int i36 = this.G;
                        int iN = m1.n.n(qVar10.f44813a, qVar10.f44815c);
                        qVar10.M(0);
                        qVar10.L(iN);
                        int i37 = pVar3.f42645p;
                        if (i37 == -1) {
                            if (kj1Var.f16462a != 0) {
                                kj1Var.r(0);
                            }
                        } else if (kj1Var.f16462a != i37) {
                            kj1Var.r(i37);
                        }
                        kj1Var.a(jA2, qVar10);
                        if ((fVar2.a() & 4) != 0) {
                            kj1Var.o(0);
                        }
                        iC = i36;
                    } else {
                        iC = a0Var3.c(lVar, i35, false);
                    }
                    this.F += iC;
                    this.G -= iC;
                }
                i30 = i34;
                i33 = i12;
                str4 = str;
            }
        }
        int iA2 = fVar2.a();
        if (!this.H) {
            iA2 |= 67108864;
        }
        int i38 = iA2;
        q qVarB2 = fVar2.b();
        long j24 = jA2;
        a0Var3.a(j24, i38, this.E, 0, qVarB2 != null ? qVarB2.f42194c : null);
        while (!arrayDeque.isEmpty()) {
            e eVar = (e) arrayDeque.removeFirst();
            this.f42134z -= eVar.f42097c;
            long jA3 = eVar.f42095a;
            if (eVar.f42096b) {
                jA3 += j24;
            }
            if (xVar != null) {
                jA3 = xVar.a(jA3);
            }
            long j25 = jA3;
            for (a0 a0Var4 : this.K) {
                a0Var4.a(j25, 1, eVar.f42097c, this.f42134z, null);
            }
        }
        if (!fVar2.c()) {
            this.D = null;
        }
        this.f42128t = 3;
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    @Override // n2.k
    public final void c(n2.m mVar) {
        int i10;
        String str;
        int i11 = this.f42111b;
        this.J = (i11 & 32) == 0 ? new s(mVar, this.f42110a) : mVar;
        e();
        a0[] a0VarArr = new a0[2];
        this.K = a0VarArr;
        a0 a0Var = this.f42125q;
        if (a0Var != null) {
            a0VarArr[0] = a0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((i11 & 4) != 0) {
            a0VarArr[i10] = this.J.track(100, 5);
            i12 = InterfaceC0435l1.d.b.f29105b;
            i10++;
        }
        a0[] a0VarArr2 = (a0[]) y.O(this.K, i10);
        this.K = a0VarArr2;
        for (a0 a0Var2 : a0VarArr2) {
            a0Var2.b(Q);
        }
        List list = this.f42113d;
        this.L = new a0[list.size()];
        int i13 = 0;
        while (i13 < this.L.length) {
            a0 a0VarTrack = this.J.track(i12, 3);
            a0VarTrack.b((i1.p) list.get(i13));
            this.L[i13] = a0VarTrack;
            i13++;
            i12++;
        }
        p pVar = this.f42112c;
        if (pVar != null) {
            i1.p pVar2 = pVar.f42187g;
            i1.o oVarA = pVar2.a();
            String str2 = pVar2.f42643n;
            if (d0.m(str2)) {
                str = MimeTypes.VIDEO_MP4;
            } else if (d0.i(str2)) {
                str = MimeTypes.AUDIO_MP4;
            } else if (!d0.k(str2)) {
                str = MimeTypes.APPLICATION_MP4;
            } else if (Objects.equals(str2, "image/heic")) {
                str = "image/heif";
            } else if (Objects.equals(str2, "image/avif")) {
                str = "image/avif";
            } else {
                str = MimeTypes.APPLICATION_MP4;
            }
            oVarA.l = d0.n(str);
            this.f42114e.put(0, new f(this.J.track(0, pVar.f42182b), new r(this.f42112c, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0), new c(0, 0, 0, 0), new i1.p(oVarA)));
            this.J.endTracks();
        }
    }

    @Override // n2.k
    public final List d() {
        return this.f42127s;
    }

    public final void e() {
        this.f42128t = 0;
        this.f42131w = 0;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0447  */
    /* JADX WARN: Code duplicated, block: B:286:0x0679  */
    public final void i(long j10) throws e0 {
        c0 c0Var;
        int i10;
        long j11;
        c cVar;
        int i11;
        c cVar2;
        ArrayList arrayList;
        int i12;
        int i13;
        byte[] bArr;
        int i14;
        boolean z10;
        while (true) {
            ArrayDeque arrayDeque = this.f42122n;
            if (arrayDeque.isEmpty() || ((m1.c) arrayDeque.peek()).f45773c != j10) {
                break;
            }
            m1.c cVar3 = (m1.c) arrayDeque.pop();
            int i15 = cVar3.f22444b;
            ArrayList arrayList2 = cVar3.f45775e;
            ArrayList arrayList3 = cVar3.f45774d;
            int i16 = this.f42111b;
            int i17 = 12;
            p pVar = this.f42112c;
            SparseArray sparseArray = this.f42114e;
            if (i15 == 1836019574) {
                go.k.s("Unexpected moov box.", pVar == null);
                i1.m mVarF = f(arrayList3);
                m1.c cVarG = cVar3.g(1836475768);
                cVarG.getClass();
                ArrayList arrayList4 = cVarG.f45774d;
                SparseArray sparseArray2 = new SparseArray();
                int size = arrayList4.size();
                long jB = -9223372036854775807L;
                int i18 = 0;
                while (i18 < size) {
                    m1.d dVar = (m1.d) arrayList4.get(i18);
                    int i19 = dVar.f22444b;
                    l1.q qVar = dVar.f45776c;
                    if (i19 == 1953654136) {
                        qVar.M(i17);
                        arrayList = arrayList4;
                        Pair pairCreate = Pair.create(Integer.valueOf(qVar.m()), new c(qVar.m() - 1, qVar.m(), qVar.m(), qVar.m()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (c) pairCreate.second);
                    } else {
                        arrayList = arrayList4;
                        if (i19 == 1835362404) {
                            qVar.M(8);
                            jB = b.e(qVar.m()) == 0 ? qVar.B() : qVar.F();
                        }
                    }
                    i18++;
                    arrayList4 = arrayList;
                    i17 = 12;
                }
                int i20 = 0;
                m1.c cVarG2 = cVar3.g(1835365473);
                c0 c0VarF = cVarG2 != null ? b.f(cVarG2) : null;
                n2.q qVar2 = new n2.q();
                m1.d dVarH = cVar3.h(1969517665);
                if (dVarH != null) {
                    c0 c0VarK = b.k(dVarH);
                    qVar2.b(c0VarK);
                    c0Var = c0VarK;
                } else {
                    c0Var = null;
                }
                m1.d dVarH2 = cVar3.h(1836476516);
                dVarH2.getClass();
                c0 c0Var2 = new c0(b.g(dVarH2.f45776c));
                ArrayList arrayListJ = b.j(cVar3, qVar2, jB, mVarF, (i16 & 16) != 0, false, new na.e() { // from class: h3.d
                    @Override // na.e
                    public final Object apply(Object obj) {
                        p pVar2 = (p) obj;
                        this.f42094a.getClass();
                        return pVar2;
                    }
                }, false);
                int size2 = arrayListJ.size();
                if (sparseArray.size() == 0) {
                    String strB = o.b(arrayListJ);
                    int i21 = 0;
                    while (i21 < size2) {
                        r rVar = (r) arrayListJ.get(i21);
                        p pVar2 = rVar.f42197a;
                        n2.m mVar = this.J;
                        int i22 = pVar2.f42182b;
                        int i23 = pVar2.f42181a;
                        String str = strB;
                        i1.p pVar3 = pVar2.f42187g;
                        long j12 = pVar2.f42185e;
                        a0 a0VarTrack = mVar.track(i21, i22);
                        a0VarTrack.e(j12);
                        int i24 = i21;
                        i1.o oVarA = pVar3.a();
                        ArrayList arrayList5 = arrayListJ;
                        oVarA.l = d0.n(str);
                        if (i22 == 1) {
                            int i25 = qVar2.f46485a;
                            i10 = size2;
                            j11 = j12;
                            if (i25 != -1 && (i11 = qVar2.f46486b) != -1) {
                                oVarA.H = i25;
                                oVarA.I = i11;
                            }
                        } else {
                            i10 = size2;
                            j11 = j12;
                        }
                        o.k(i22, c0VarF, oVarA, pVar3.l, c0Var, c0Var2);
                        if (sparseArray2.size() == 1) {
                            cVar = (c) sparseArray2.valueAt(i20);
                        } else {
                            cVar = (c) sparseArray2.get(i23);
                            cVar.getClass();
                        }
                        sparseArray.put(i23, new f(a0VarTrack, rVar, cVar, new i1.p(oVarA)));
                        this.B = Math.max(this.B, j11);
                        i21 = i24 + 1;
                        strB = str;
                        arrayListJ = arrayList5;
                        size2 = i10;
                        i20 = 0;
                    }
                    this.J.endTracks();
                } else {
                    ArrayList arrayList6 = arrayListJ;
                    go.k.t(sparseArray.size() == size2);
                    int i26 = 0;
                    while (i26 < size2) {
                        ArrayList arrayList7 = arrayList6;
                        r rVar2 = (r) arrayList7.get(i26);
                        p pVar4 = rVar2.f42197a;
                        f fVar = (f) sparseArray.get(pVar4.f42181a);
                        int i27 = pVar4.f42181a;
                        if (sparseArray2.size() == 1) {
                            cVar2 = (c) sparseArray2.valueAt(0);
                        } else {
                            cVar2 = (c) sparseArray2.get(i27);
                            cVar2.getClass();
                        }
                        fVar.f42101d = rVar2;
                        fVar.f42102e = cVar2;
                        fVar.f42098a.b(fVar.f42107j);
                        fVar.e();
                        i26++;
                        arrayList6 = arrayList7;
                    }
                }
            } else if (i15 == 1836019558) {
                boolean z11 = pVar != null;
                int size3 = arrayList2.size();
                int i28 = 0;
                while (i28 < size3) {
                    m1.c cVar4 = (m1.c) arrayList2.get(i28);
                    if (cVar4.f22444b == 1953653094) {
                        m1.d dVarH3 = cVar4.h(1952868452);
                        ArrayList arrayList8 = cVar4.f45774d;
                        dVarH3.getClass();
                        l1.q qVar3 = dVarH3.f45776c;
                        qVar3.M(8);
                        int iM = qVar3.m();
                        byte[] bArr2 = b.f42089a;
                        f fVar2 = (f) (z11 ? sparseArray.valueAt(0) : sparseArray.get(qVar3.m()));
                        if (fVar2 == null) {
                            size3 = size3;
                            i28 = i28;
                            arrayList2 = arrayList2;
                            arrayList3 = arrayList3;
                            fVar2 = null;
                        } else {
                            y6 y6Var = fVar2.f42099b;
                            if ((iM & 1) != 0) {
                                long jF = qVar3.F();
                                y6Var.f22160a = jF;
                                y6Var.f22161b = jF;
                            }
                            c cVar5 = fVar2.f42102e;
                            y6Var.f22173o = new c((iM & 2) != 0 ? qVar3.m() - 1 : cVar5.f42090a, (iM & 8) != 0 ? qVar3.m() : cVar5.f42091b, (iM & 16) != 0 ? qVar3.m() : cVar5.f42092c, (iM & 32) != 0 ? qVar3.m() : cVar5.f42093d);
                        }
                        if (fVar2 != null) {
                            y6 y6Var2 = fVar2.f42099b;
                            long j13 = y6Var2.f22171m;
                            boolean z12 = y6Var2.f22172n;
                            fVar2.e();
                            fVar2.f42109m = true;
                            m1.d dVarH4 = cVar4.h(1952867444);
                            if (dVarH4 == null || (i16 & 2) != 0) {
                                y6Var2.f22171m = j13;
                                y6Var2.f22172n = z12;
                            } else {
                                l1.q qVar4 = dVarH4.f45776c;
                                qVar4.M(8);
                                y6Var2.f22171m = b.e(qVar4.m()) == 1 ? qVar4.F() : qVar4.B();
                                y6Var2.f22172n = true;
                            }
                            int size4 = arrayList8.size();
                            int i29 = 0;
                            int i30 = 0;
                            int i31 = 0;
                            while (true) {
                                i13 = 1953658222;
                                if (i29 >= size4) {
                                    break;
                                }
                                m1.d dVar2 = (m1.d) arrayList8.get(i29);
                                int i32 = i29;
                                if (dVar2.f22444b == 1953658222) {
                                    l1.q qVar5 = dVar2.f45776c;
                                    qVar5.M(12);
                                    int iD = qVar5.D();
                                    if (iD > 0) {
                                        i31 += iD;
                                        i30++;
                                    }
                                }
                                i29 = i32 + 1;
                            }
                            fVar2.f42105h = 0;
                            fVar2.f42104g = 0;
                            fVar2.f42103f = 0;
                            y6Var2.f22162c = i30;
                            y6Var2.f22163d = i31;
                            if (y6Var2.f22165f.length < i30) {
                                y6Var2.f22164e = new long[i30];
                                y6Var2.f22165f = new int[i30];
                            }
                            if (y6Var2.f22166g.length < i31) {
                                int i33 = (i31 * 125) / 100;
                                y6Var2.f22166g = new int[i33];
                                y6Var2.f22167h = new long[i33];
                                y6Var2.f22168i = new boolean[i33];
                                y6Var2.f22170k = new boolean[i33];
                            }
                            int i34 = 0;
                            int i35 = 0;
                            int i36 = 0;
                            while (true) {
                                long j14 = 0;
                                if (i34 >= size4) {
                                    i12 = i16;
                                    p pVar5 = fVar2.f42101d.f42197a;
                                    c cVar6 = (c) y6Var2.f22173o;
                                    cVar6.getClass();
                                    int i37 = cVar6.f42090a;
                                    q[] qVarArr = pVar5.l;
                                    q qVar6 = qVarArr == null ? null : qVarArr[i37];
                                    m1.d dVarH5 = cVar4.h(1935763834);
                                    if (dVarH5 != null) {
                                        qVar6.getClass();
                                        l1.q qVar7 = dVarH5.f45776c;
                                        int i38 = qVar6.f42195d;
                                        qVar7.M(8);
                                        int iM2 = qVar7.m();
                                        byte[] bArr3 = b.f42089a;
                                        if ((iM2 & 1) == 1) {
                                            qVar7.N(8);
                                        }
                                        int iZ = qVar7.z();
                                        int iD2 = qVar7.D();
                                        if (iD2 > y6Var2.f22163d) {
                                            StringBuilder sbU = defpackage.e.u(iD2, "Saiz sample count ", " is greater than fragment sample count");
                                            sbU.append(y6Var2.f22163d);
                                            throw e0.a(null, sbU.toString());
                                        }
                                        if (iZ == 0) {
                                            boolean[] zArr = y6Var2.f22170k;
                                            i14 = 0;
                                            for (int i39 = 0; i39 < iD2; i39++) {
                                                int iZ2 = qVar7.z();
                                                i14 += iZ2;
                                                zArr[i39] = iZ2 > i38;
                                            }
                                            z10 = false;
                                        } else {
                                            i14 = iZ * iD2;
                                            z10 = false;
                                            Arrays.fill(y6Var2.f22170k, 0, iD2, iZ > i38);
                                        }
                                        Arrays.fill(y6Var2.f22170k, iD2, y6Var2.f22163d, z10);
                                        if (i14 > 0) {
                                            ((l1.q) y6Var2.f22175q).J(i14);
                                            y6Var2.f22169j = true;
                                            y6Var2.l = true;
                                        }
                                    }
                                    m1.d dVarH6 = cVar4.h(1935763823);
                                    if (dVarH6 != null) {
                                        l1.q qVar8 = dVarH6.f45776c;
                                        qVar8.M(8);
                                        int iM3 = qVar8.m();
                                        byte[] bArr4 = b.f42089a;
                                        if ((iM3 & 1) == 1) {
                                            qVar8.N(8);
                                        }
                                        int iD3 = qVar8.D();
                                        if (iD3 != 1) {
                                            throw e0.a(null, "Unexpected saio entry count: " + iD3);
                                        }
                                        y6Var2.f22161b += b.e(iM3) == 0 ? qVar8.B() : qVar8.F();
                                    }
                                    m1.d dVarH7 = cVar4.h(1936027235);
                                    if (dVarH7 != null) {
                                        g(dVarH7.f45776c, 0, y6Var2);
                                    }
                                    String str2 = qVar6 != null ? qVar6.f42193b : null;
                                    l1.q qVar9 = null;
                                    l1.q qVar10 = null;
                                    for (int i40 = 0; i40 < arrayList8.size(); i40++) {
                                        m1.d dVar3 = (m1.d) arrayList8.get(i40);
                                        l1.q qVar11 = dVar3.f45776c;
                                        int i41 = dVar3.f22444b;
                                        if (i41 == 1935828848) {
                                            qVar11.M(12);
                                            if (qVar11.m() == 1936025959) {
                                                qVar9 = qVar11;
                                            }
                                        } else if (i41 == 1936158820) {
                                            qVar11.M(12);
                                            if (qVar11.m() == 1936025959) {
                                                qVar10 = qVar11;
                                            }
                                        }
                                    }
                                    if (qVar9 != null && qVar10 != null) {
                                        qVar9.M(8);
                                        int iE = b.e(qVar9.m());
                                        qVar9.N(4);
                                        if (iE == 1) {
                                            qVar9.N(4);
                                        }
                                        if (qVar9.m() != 1) {
                                            throw e0.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        qVar10.M(8);
                                        int iE2 = b.e(qVar10.m());
                                        qVar10.N(4);
                                        if (iE2 == 1) {
                                            if (qVar10.B() == 0) {
                                                throw e0.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iE2 >= 2) {
                                            qVar10.N(4);
                                        }
                                        if (qVar10.B() != 1) {
                                            throw e0.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        qVar10.N(1);
                                        int iZ3 = qVar10.z();
                                        int i42 = (iZ3 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                        int i43 = iZ3 & 15;
                                        boolean z13 = qVar10.z() == 1;
                                        if (z13) {
                                            int iZ4 = qVar10.z();
                                            byte[] bArr5 = new byte[16];
                                            qVar10.k(bArr5, 0, 16);
                                            if (iZ4 == 0) {
                                                int iZ5 = qVar10.z();
                                                byte[] bArr6 = new byte[iZ5];
                                                qVar10.k(bArr6, 0, iZ5);
                                                bArr = bArr6;
                                            } else {
                                                bArr = null;
                                            }
                                            y6Var2.f22169j = true;
                                            y6Var2.f22174p = new q(z13, str2, iZ4, bArr5, i42, i43, bArr);
                                        }
                                    }
                                    int size5 = arrayList8.size();
                                    for (int i44 = 0; i44 < size5; i44++) {
                                        m1.d dVar4 = (m1.d) arrayList8.get(i44);
                                        if (dVar4.f22444b == 1970628964) {
                                            l1.q qVar12 = dVar4.f45776c;
                                            qVar12.M(8);
                                            byte[] bArr7 = this.f42118i;
                                            qVar12.k(bArr7, 0, 16);
                                            if (Arrays.equals(bArr7, P)) {
                                                g(qVar12, 16, y6Var2);
                                            }
                                        }
                                    }
                                    break;
                                }
                                m1.d dVar5 = (m1.d) arrayList8.get(i34);
                                int i45 = size4;
                                if (dVar5.f22444b == i13) {
                                    int i46 = i35 + 1;
                                    l1.q qVar13 = dVar5.f45776c;
                                    qVar13.M(8);
                                    int iM4 = qVar13.m();
                                    byte[] bArr8 = b.f42089a;
                                    p pVar6 = fVar2.f42101d.f42197a;
                                    c cVar7 = (c) y6Var2.f22173o;
                                    String str3 = y.f44830a;
                                    int i47 = i35;
                                    y6Var2.f22165f[i47] = qVar13.D();
                                    long[] jArr = y6Var2.f22164e;
                                    int i48 = i36;
                                    long j15 = y6Var2.f22160a;
                                    jArr[i47] = j15;
                                    if ((iM4 & 1) != 0) {
                                        jArr[i47] = j15 + ((long) qVar13.m());
                                    }
                                    boolean z14 = (iM4 & 4) != 0;
                                    int iM5 = cVar7.f42093d;
                                    if (z14) {
                                        iM5 = qVar13.m();
                                    }
                                    boolean z15 = z14;
                                    boolean z16 = (iM4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
                                    boolean z17 = (iM4 & 512) != 0;
                                    boolean z18 = (iM4 & 1024) != 0;
                                    boolean z19 = (iM4 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0;
                                    boolean z20 = z18;
                                    long[] jArr2 = pVar6.f42189i;
                                    int i49 = iM5;
                                    long[] jArr3 = pVar6.f42190j;
                                    if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                        long j16 = jArr2[0];
                                        if (j16 == 0) {
                                            j14 = jArr3[0];
                                        } else {
                                            long j17 = pVar6.f42184d;
                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                            if (y.U(j16, 1000000L, j17, roundingMode) + y.U(jArr3[0], 1000000L, pVar6.f42183c, roundingMode) >= pVar6.f42185e) {
                                                j14 = jArr3[0];
                                            }
                                        }
                                    }
                                    int[] iArr = y6Var2.f22166g;
                                    long[] jArr4 = y6Var2.f22167h;
                                    boolean[] zArr2 = y6Var2.f22168i;
                                    boolean z21 = pVar6.f42182b == 2 && (i16 & 1) != 0;
                                    i36 = i48 + y6Var2.f22165f[i47];
                                    boolean z22 = z19;
                                    long j18 = pVar6.f42183c;
                                    long j19 = y6Var2.f22171m;
                                    int i50 = i48;
                                    while (i50 < i36) {
                                        int iM6 = z16 ? qVar13.m() : cVar7.f42091b;
                                        boolean z23 = z21;
                                        if (iM6 < 0) {
                                            throw e0.a(null, "Unexpected negative value: " + iM6);
                                        }
                                        int iM7 = z17 ? qVar13.m() : cVar7.f42092c;
                                        if (iM7 < 0) {
                                            throw e0.a(null, "Unexpected negative value: " + iM7);
                                        }
                                        int iM8 = z20 ? qVar13.m() : (i50 == 0 && z15) ? i49 : cVar7.f42093d;
                                        long jU = y.U((((long) (z22 ? qVar13.m() : 0)) + j19) - j14, 1000000L, j18, RoundingMode.DOWN);
                                        jArr4[i50] = jU;
                                        if (!y6Var2.f22172n) {
                                            jArr4[i50] = jU + fVar2.f42101d.f42205i;
                                        }
                                        iArr[i50] = iM7;
                                        zArr2[i50] = ((iM8 >> 16) & 1) == 0 && (!z23 || i50 == 0);
                                        j19 += (long) iM6;
                                        i50++;
                                        z21 = z23;
                                        i36 = i36;
                                        cVar7 = cVar7;
                                    }
                                    y6Var2.f22171m = j19;
                                    i35 = i46;
                                }
                                i34++;
                                size4 = i45;
                                i16 = i16;
                                i13 = 1953658222;
                            }
                        } else {
                            i12 = i16;
                        }
                    } else {
                        size3 = size3;
                        i28 = i28;
                        arrayList2 = arrayList2;
                        arrayList3 = arrayList3;
                        i12 = i16;
                    }
                    i28++;
                    size3 = size3;
                    arrayList2 = arrayList2;
                    arrayList3 = arrayList3;
                    i16 = i12;
                }
                i1.m mVarF2 = f(arrayList3);
                if (mVarF2 != null) {
                    int size6 = sparseArray.size();
                    for (int i51 = 0; i51 < size6; i51++) {
                        f fVar3 = (f) sparseArray.valueAt(i51);
                        p pVar7 = fVar3.f42101d.f42197a;
                        c cVar8 = (c) fVar3.f42099b.f22173o;
                        String str4 = y.f44830a;
                        int i52 = cVar8.f42090a;
                        q[] qVarArr2 = pVar7.l;
                        q qVar14 = qVarArr2 == null ? null : qVarArr2[i52];
                        i1.m mVarA = mVarF2.a(qVar14 != null ? qVar14.f42193b : null);
                        i1.o oVarA2 = fVar3.f42107j.a();
                        oVarA2.f42604q = mVarA;
                        fVar3.f42098a.b(new i1.p(oVarA2));
                    }
                }
                if (this.A != C.TIME_UNSET) {
                    int size7 = sparseArray.size();
                    for (int i53 = 0; i53 < size7; i53++) {
                        f fVar4 = (f) sparseArray.valueAt(i53);
                        long j20 = this.A;
                        int i54 = fVar4.f42103f;
                        while (true) {
                            y6 y6Var3 = fVar4.f42099b;
                            if (i54 >= y6Var3.f22163d || y6Var3.f22167h[i54] > j20) {
                                break;
                            }
                            if (y6Var3.f22168i[i54]) {
                                fVar4.f42106i = i54;
                            }
                            i54++;
                        }
                    }
                    this.A = C.TIME_UNSET;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((m1.c) arrayDeque.peek()).f45775e.add(cVar3);
            }
        }
        e();
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        SparseArray sparseArray = this.f42114e;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) sparseArray.valueAt(i10)).e();
        }
        this.f42123o.clear();
        this.f42134z = 0;
        ((PriorityQueue) this.f42124p.f16466e).clear();
        this.A = j11;
        this.f42122n.clear();
        e();
    }

    @Override // n2.k
    public final void release() {
    }
}
