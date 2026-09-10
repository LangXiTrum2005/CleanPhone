package v1;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import b2.w;
import com.google.android.gms.internal.ads.a0;
import com.google.android.gms.internal.ads.az1;
import com.google.android.gms.internal.ads.bq0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ea.b0;
import f2.a1;
import f2.e1;
import f2.i0;
import f2.k1;
import i1.c0;
import i1.d0;
import i1.q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import l1.y;
import oa.e0;
import oa.j0;
import oa.n1;
import p1.k0;
import qj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements j2.h, j2.k, e1, n2.m, a1 {
    public static final Set Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public i1.p F;
    public i1.p G;
    public boolean H;
    public k1 I;
    public Set J;
    public int[] K;
    public int L;
    public boolean M;
    public boolean[] N;
    public boolean[] O;
    public long P;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public long V;
    public i1.m W;
    public k X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rb.c f52395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f52396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9.e f52397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i1.p f52398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u1.h f52399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f52400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b0 f52401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j2.m f52402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i0 f52403k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t6.l f52404m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f52405n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f52406o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f52407p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f52408q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f52409r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f52410s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map f52411t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g2.f f52412u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q[] f52413v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int[] f52414w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashSet f52415x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SparseIntArray f52416y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p f52417z;

    /* JADX WARN: Type inference failed for: r2v13, types: [v1.o] */
    /* JADX WARN: Type inference failed for: r2v14, types: [v1.o] */
    public r(String str, int i10, rb.c cVar, i iVar, Map map, v9.e eVar, long j10, i1.p pVar, u1.h hVar, i0 i0Var, b0 b0Var, i0 i0Var2, int i11, k2.a aVar) {
        this.f52393a = str;
        this.f52394b = i10;
        this.f52395c = cVar;
        this.f52396d = iVar;
        this.f52411t = map;
        this.f52397e = eVar;
        this.f52398f = pVar;
        this.f52399g = hVar;
        this.f52400h = i0Var;
        this.f52401i = b0Var;
        this.f52403k = i0Var2;
        this.l = i11;
        this.f52402j = aVar != null ? new j2.m(aVar) : new j2.m("Loader:HlsSampleStreamWrapper");
        t6.l lVar = new t6.l(13);
        lVar.f50550c = null;
        final int i12 = 0;
        lVar.f50549b = false;
        lVar.f50551d = null;
        this.f52404m = lVar;
        this.f52414w = new int[0];
        Set set = Y;
        this.f52415x = new HashSet(set.size());
        this.f52416y = new SparseIntArray(set.size());
        this.f52413v = new q[0];
        this.O = new boolean[0];
        this.N = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f52405n = arrayList;
        this.f52406o = Collections.unmodifiableList(arrayList);
        this.f52410s = new ArrayList();
        this.f52407p = new Runnable(this) { // from class: v1.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f52385b;

            {
                this.f52385b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f52385b.t();
                        break;
                    default:
                        r rVar = this.f52385b;
                        rVar.C = true;
                        rVar.t();
                        break;
                }
            }
        };
        final int i13 = 1;
        this.f52408q = new Runnable(this) { // from class: v1.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f52385b;

            {
                this.f52385b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.f52385b.t();
                        break;
                    default:
                        r rVar = this.f52385b;
                        rVar.C = true;
                        rVar.t();
                        break;
                }
            }
        };
        this.f52409r = y.q(null);
        this.P = j10;
        this.Q = j10;
    }

    public static n2.j l(int i10, int i11) {
        l1.a.s("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new n2.j();
    }

    public static i1.p o(i1.p pVar, i1.p pVar2, boolean z10) {
        String strB;
        if (pVar == null) {
            return pVar2;
        }
        String str = pVar.f42641k;
        String strD = pVar2.f42643n;
        int iH = d0.h(strD);
        if (y.v(iH, str) == 1) {
            strB = y.w(str, iH);
            strD = d0.d(strB);
        } else {
            strB = d0.b(str, strD);
        }
        i1.o oVarA = pVar2.a();
        oVarA.f42589a = pVar.f42631a;
        oVarA.f42590b = pVar.f42632b;
        oVarA.f42591c = j0.x(pVar.f42633c);
        oVarA.f42592d = pVar.f42634d;
        oVarA.f42593e = pVar.f42635e;
        oVarA.f42594f = pVar.f42636f;
        oVarA.f42596h = z10 ? pVar.f42638h : -1;
        oVarA.f42597i = z10 ? pVar.f42639i : -1;
        oVarA.f42598j = strB;
        if (iH == 2) {
            oVarA.f42607t = pVar.f42650u;
            oVarA.f42608u = pVar.f42651v;
            oVarA.f42611x = pVar.f42654y;
        }
        if (strD != null) {
            oVarA.f42600m = d0.n(strD);
        }
        int i10 = pVar.F;
        if (i10 != -1 && iH == 1) {
            oVarA.E = i10;
        }
        c0 c0VarB = pVar.l;
        if (c0VarB != null) {
            c0 c0Var = pVar2.l;
            if (c0Var != null) {
                c0VarB = c0Var.b(c0VarB);
            }
            oVarA.f42599k = c0VarB;
        }
        return new i1.p(oVarA);
    }

    public static int r(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // j2.h
    public final void b(j2.j jVar, long j10, long j11, boolean z10) {
        g2.f fVar = (g2.f) jVar;
        this.f52412u = null;
        long j12 = fVar.f41366a;
        n1.k kVar = fVar.f41367b;
        n1.y yVar = fVar.f41374i;
        f2.u uVar = new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        this.f52401i.getClass();
        this.f52403k.c(uVar, fVar.f41368c, this.f52394b, fVar.f41369d, fVar.f41370e, fVar.f41371f, fVar.f41372g, fVar.f41373h);
        if (z10) {
            return;
        }
        if (s() || this.E == 0) {
            x();
        }
        if (this.E > 0) {
            this.f52395c.h(this);
        }
    }

    @Override // j2.h
    public final a0 d(j2.j jVar, long j10, long j11, IOException iOException, int i10) {
        boolean zC;
        a0 a0Var;
        int i11;
        g2.f fVar = (g2.f) jVar;
        boolean z10 = fVar instanceof k;
        if (z10 && !((k) fVar).f() && (iOException instanceof n1.u) && ((i11 = ((n1.u) iOException).f46407c) == 410 || i11 == 404)) {
            return j2.m.f43671d;
        }
        long j12 = fVar.f41374i.f46417b;
        n1.k kVar = fVar.f41367b;
        n1.y yVar = fVar.f41374i;
        f2.u uVar = new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, j12);
        y.Z(fVar.f41372g);
        y.Z(fVar.f41373h);
        w wVar = new w(i10, 14, iOException);
        i iVar = this.f52396d;
        bq0 bq0VarG = com.bumptech.glide.c.g(iVar.f52328r);
        this.f52401i.getClass();
        a0 a0VarC = b0.c(bq0VarG, wVar);
        if (a0VarC == null || a0VarC.f11791a != 2) {
            zC = false;
        } else {
            long j13 = a0VarC.f11792b;
            i2.r rVar = iVar.f52328r;
            zC = rVar.c(rVar.indexOf(iVar.f52319h.a(fVar.f41369d)), j13);
        }
        if (zC) {
            if (z10 && j12 == 0) {
                ArrayList arrayList = this.f52405n;
                go.k.t(((k) arrayList.remove(arrayList.size() - 1)) == fVar);
                if (arrayList.isEmpty()) {
                    this.Q = this.P;
                } else {
                    ((k) oa.q.k(arrayList)).J = true;
                }
            }
            a0Var = j2.m.f43672e;
        } else {
            long jK = b0.k(wVar);
            a0Var = jK != C.TIME_UNSET ? new a0(jK, 0, false) : j2.m.f43673f;
        }
        a0 a0Var2 = a0Var;
        boolean zA = a0Var2.a();
        this.f52403k.f(uVar, fVar.f41368c, this.f52394b, fVar.f41369d, fVar.f41370e, fVar.f41371f, fVar.f41372g, fVar.f41373h, iOException, !zA);
        if (!zA) {
            this.f52412u = null;
        }
        if (zC) {
            if (!this.D) {
                az1 az1Var = new az1();
                az1Var.f12554a = this.P;
                f(new k0(az1Var));
                return a0Var2;
            }
            this.f52395c.h(this);
        }
        return a0Var2;
    }

    @Override // n2.m
    public final void endTracks() {
        this.U = true;
        this.f52409r.post(this.f52408q);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0212  */
    /* JADX WARN: Code duplicated, block: B:108:0x0236 A[PHI: r2
  0x0236: PHI (r2v14 v1.h) = (r2v13 v1.h), (r2v18 v1.h) binds: [B:98:0x0207, B:106:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x0246  */
    /* JADX WARN: Code duplicated, block: B:115:0x0253  */
    /* JADX WARN: Code duplicated, block: B:119:0x025e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0262  */
    /* JADX WARN: Code duplicated, block: B:123:0x0267  */
    /* JADX WARN: Code duplicated, block: B:127:0x0275  */
    /* JADX WARN: Code duplicated, block: B:129:0x0279  */
    /* JADX WARN: Code duplicated, block: B:131:0x0280  */
    /* JADX WARN: Code duplicated, block: B:136:0x028a  */
    /* JADX WARN: Code duplicated, block: B:137:0x028d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0291  */
    /* JADX WARN: Code duplicated, block: B:141:0x0296  */
    /* JADX WARN: Code duplicated, block: B:143:0x029e  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:152:0x02af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:160:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:163:0x030f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0316  */
    /* JADX WARN: Code duplicated, block: B:168:0x032f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0332  */
    /* JADX WARN: Code duplicated, block: B:171:0x0336  */
    /* JADX WARN: Code duplicated, block: B:172:0x0340  */
    /* JADX WARN: Code duplicated, block: B:174:0x0343  */
    /* JADX WARN: Code duplicated, block: B:175:0x034e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0354 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x0356  */
    /* JADX WARN: Code duplicated, block: B:180:0x0358  */
    /* JADX WARN: Code duplicated, block: B:182:0x035b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0367  */
    /* JADX WARN: Code duplicated, block: B:187:0x038e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0397  */
    /* JADX WARN: Code duplicated, block: B:190:0x039f  */
    /* JADX WARN: Code duplicated, block: B:193:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:195:0x03b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:206:0x03da  */
    /* JADX WARN: Code duplicated, block: B:209:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:212:0x03e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:218:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:221:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:224:0x0424  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:97:0x0203  */
    /* JADX WARN: Code duplicated, block: B:99:0x0209  */
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
    @Override // f2.e1
    public final boolean f(k0 k0Var) {
        long jMax;
        long j10;
        List list;
        t6.l lVar;
        long j11;
        t6.l lVar2;
        long j12;
        k kVar;
        w1.m mVar;
        Uri uri;
        i iVar;
        h hVarD;
        String str;
        boolean z10;
        long j13;
        h hVarD2;
        boolean z11;
        w1.k kVar2;
        w1.j jVar;
        long j14;
        Uri uriQ;
        e eVarE;
        String str2;
        Uri uriQ2;
        e eVarE2;
        boolean z12;
        boolean z13;
        n1.h hVar;
        x xVar;
        byte[] bArr;
        byte[] bArr2;
        Map map;
        int i10;
        boolean z14;
        byte[] bArrD;
        n1.h aVar;
        w1.j jVar2;
        n1.k kVar3;
        n1.h hVar2;
        boolean z15;
        int i11;
        b3.i iVar2;
        l1.q qVar;
        b bVar;
        SparseArray sparseArray;
        l1.x xVar2;
        n1.k kVar4;
        boolean z16;
        boolean z17;
        b bVar2;
        boolean z18;
        byte[] bArrD2;
        n1.h aVar2;
        String str3;
        w1.c cVar;
        if (!this.T) {
            j2.m mVar2 = this.f52402j;
            if (!mVar2.c() && !mVar2.b()) {
                if (s()) {
                    List list2 = Collections.EMPTY_LIST;
                    jMax = this.Q;
                    for (q qVar2 : this.f52413v) {
                        qVar2.f40297t = this.Q;
                    }
                    list = list2;
                    j10 = jMax;
                } else {
                    k kVarQ = q();
                    boolean z19 = kVarQ.H;
                    long j15 = kVarQ.f41372g;
                    if (z19 && kVarQ.f()) {
                        long j16 = kVarQ.K;
                        jMax = j16 != C.TIME_UNSET ? j15 + j16 : -9223372036854775807L;
                    } else {
                        jMax = Math.max(this.P, j15);
                    }
                    long jMax2 = this.P;
                    boolean z20 = this.C;
                    List list3 = this.f52406o;
                    if (z20) {
                        for (q qVar3 : this.f52413v) {
                            jMax2 = Math.max(jMax2, qVar3.r());
                        }
                    }
                    j10 = jMax2;
                    list = list3;
                }
                t6.l lVar3 = this.f52404m;
                lVar3.f50550c = null;
                lVar3.f50549b = false;
                lVar3.f50551d = null;
                boolean z21 = this.D || !list.isEmpty();
                i iVar3 = this.f52396d;
                x xVar3 = iVar3.f52321j;
                Uri[] uriArr = iVar3.f52316e;
                w1.d dVar = iVar3.f52318g;
                k kVar5 = list.isEmpty() ? null : (k) oa.q.k(list);
                int iA = kVar5 == null ? -1 : iVar3.f52319h.a(kVar5.f41369d);
                long j17 = k0Var.f48103a;
                long jMax3 = jMax - j17;
                long j18 = iVar3.f52329s;
                long jMax4 = j18 != C.TIME_UNSET ? j18 - j17 : -9223372036854775807L;
                if (kVar5 == null || iVar3.f52327q) {
                    lVar = lVar3;
                    j11 = j17;
                } else {
                    lVar = lVar3;
                    long j19 = kVar5.f41373h - kVar5.f41372g;
                    j11 = j17;
                    jMax3 = Math.max(0L, jMax3 - j19);
                    if (jMax4 != C.TIME_UNSET) {
                        jMax4 = Math.max(0L, jMax4 - j19);
                    }
                }
                long j20 = jMax;
                k kVar6 = kVar5;
                iVar3.f52328r.b(j11, jMax3, jMax4, list, iVar3.a(kVar5, jMax));
                int selectedIndexInTrackGroup = iVar3.f52328r.getSelectedIndexInTrackGroup();
                int i12 = iA;
                boolean z22 = iA != selectedIndexInTrackGroup;
                Uri uri2 = uriArr[selectedIndexInTrackGroup];
                if (dVar.e(uri2)) {
                    t6.l lVar4 = lVar;
                    w1.m mVarA = dVar.a(true, uri2);
                    mVarA.getClass();
                    long j21 = mVarA.f52837h;
                    iVar3.f52327q = mVarA.f52873c;
                    iVar3.f52329s = mVarA.f52843o ? -9223372036854775807L : (mVarA.f52849u + j21) - dVar.f52769n;
                    long j22 = j21 - dVar.f52769n;
                    lVar2 = lVar4;
                    Pair pairC = iVar3.c(kVar6, z22, mVarA, j22, j20);
                    long jLongValue = ((Long) pairC.first).longValue();
                    int iIntValue = ((Integer) pairC.second).intValue();
                    if (z22 && kVar6 != null) {
                        j12 = j22;
                        if (jLongValue < mVarA.f52840k || ((hVarD = i.d(mVarA, jLongValue, iIntValue)) != null && j12 + hVarD.f52308a.f52821e < j10)) {
                            Uri uri3 = uriArr[i12];
                            w1.m mVarA2 = dVar.a(true, uri3);
                            mVarA2.getClass();
                            long j23 = mVarA2.f52837h - dVar.f52769n;
                            Pair pairC2 = iVar3.c(kVar6, false, mVarA2, j23, j20);
                            kVar = kVar6;
                            long jLongValue2 = ((Long) pairC2.first).longValue();
                            j12 = j23;
                            selectedIndexInTrackGroup = i12;
                            mVar = mVarA2;
                            uri = uri3;
                            iIntValue = ((Integer) pairC2.second).intValue();
                            iVar = iVar3;
                            jLongValue = jLongValue2;
                        }
                        str = mVar.f52871a;
                        z10 = mVar.f52873c;
                        j13 = mVar.f52840k;
                        j0 j0Var = mVar.f52846r;
                        if (selectedIndexInTrackGroup != i12 && i12 != -1) {
                            cVar = (w1.c) dVar.f52760d.get(uriArr[i12]);
                            if (cVar != null) {
                                cVar.f52755k = false;
                            }
                        }
                        if (jLongValue < j13) {
                            iVar.f52324n = new f2.b();
                        } else {
                            hVarD2 = i.d(mVar, jLongValue, iIntValue);
                            if (hVarD2 != null) {
                                z11 = hVarD2.f52311d;
                                kVar2 = hVarD2.f52308a;
                                iVar.f52326p = null;
                                SystemClock.elapsedRealtime();
                                jVar = kVar2.f52818b;
                                j14 = kVar2.f52821e;
                                if (jVar != null || (str3 = jVar.f52823g) == null) {
                                    uriQ = null;
                                } else {
                                    uriQ = l1.a.q(str, str3);
                                }
                                eVarE = iVar.e(uriQ, selectedIndexInTrackGroup, true);
                                lVar2.f50550c = eVarE;
                                if (eVarE == null) {
                                    str2 = kVar2.f52823g;
                                    if (str2 == null) {
                                        uriQ2 = null;
                                    } else {
                                        uriQ2 = l1.a.q(str, str2);
                                    }
                                    eVarE2 = iVar.e(uriQ2, selectedIndexInTrackGroup, false);
                                    lVar2.f50550c = eVarE2;
                                    if (eVarE2 == null) {
                                        if (!(kVar2 instanceof w1.h)) {
                                            z12 = z10;
                                        } else if (!((w1.h) kVar2).l || (hVarD2.f52310c == 0 && z10)) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (kVar == null) {
                                            AtomicInteger atomicInteger = k.M;
                                        } else {
                                            if (uri.equals(kVar.f52334m) || !kVar.H) {
                                                z13 = z12 || j12 + j14 < j20;
                                            }
                                            if (z13 || !z11) {
                                                c cVar2 = iVar.f52312a;
                                                hVar = iVar.f52313b;
                                                i1.p pVar = iVar.f52317f[selectedIndexInTrackGroup];
                                                List list4 = iVar.f52320i;
                                                int selectionReason = iVar.f52328r.getSelectionReason();
                                                Object selectionData = iVar.f52328r.getSelectionData();
                                                boolean z23 = iVar.l;
                                                oa.k0 k0Var2 = iVar.f52315d;
                                                if (uriQ2 == null) {
                                                    xVar3.getClass();
                                                    xVar = xVar3;
                                                    bArr = null;
                                                } else {
                                                    xVar = xVar3;
                                                    bArr = (byte[]) ((d) xVar.f49096b).get(uriQ2);
                                                }
                                                if (uriQ == null) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = (byte[]) ((d) xVar.f49096b).get(uriQ);
                                                }
                                                q1.j jVar3 = iVar.f52322k;
                                                AtomicInteger atomicInteger2 = k.M;
                                                map = Collections.EMPTY_MAP;
                                                Uri uriQ3 = l1.a.q(str, kVar2.f52817a);
                                                long j24 = kVar2.f52825i;
                                                long j25 = kVar2.f52826j;
                                                if (z11) {
                                                    i10 = 8;
                                                } else {
                                                    i10 = 0;
                                                }
                                                go.k.o(uriQ3, "The uri must be set.");
                                                n1.k kVar7 = new n1.k(uriQ3, 1, null, map, j24, j25, null, i10);
                                                if (bArr != null) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                if (z14) {
                                                    String str4 = kVar2.f52824h;
                                                    str4.getClass();
                                                    bArrD = k.d(str4);
                                                } else {
                                                    bArrD = null;
                                                }
                                                if (bArr != null) {
                                                    bArrD.getClass();
                                                    aVar = new a(hVar, bArr, bArrD);
                                                } else {
                                                    aVar = hVar;
                                                }
                                                jVar2 = kVar2.f52818b;
                                                if (jVar2 != null) {
                                                    if (bArr2 != null) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    if (z18) {
                                                        String str5 = jVar2.f52824h;
                                                        str5.getClass();
                                                        bArrD2 = k.d(str5);
                                                    } else {
                                                        bArrD2 = null;
                                                    }
                                                    boolean z24 = z18;
                                                    Uri uriQ4 = l1.a.q(str, jVar2.f52817a);
                                                    long j26 = jVar2.f52825i;
                                                    long j27 = jVar2.f52826j;
                                                    go.k.o(uriQ4, "The uri must be set.");
                                                    n1.k kVar8 = new n1.k(uriQ4, 1, null, map, j26, j27, null, 0);
                                                    if (bArr2 != null) {
                                                        bArrD2.getClass();
                                                        aVar2 = new a(hVar, bArr2, bArrD2);
                                                    } else {
                                                        aVar2 = hVar;
                                                    }
                                                    z15 = z24;
                                                    hVar2 = aVar2;
                                                    kVar3 = kVar8;
                                                } else {
                                                    kVar3 = null;
                                                    hVar2 = null;
                                                    z15 = false;
                                                }
                                                long j28 = j12 + j14;
                                                long j29 = j28 + kVar2.f52819c;
                                                i11 = mVar.f52839j + kVar2.f52820d;
                                                if (kVar != null) {
                                                    kVar4 = kVar.f52338q;
                                                    if (kVar3 != kVar4 || (kVar3 != null && kVar4 != null && kVar3.f46369a.equals(kVar4.f46369a) && kVar3.f46373e == kVar4.f46373e)) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    if (uri.equals(kVar.f52334m) || !kVar.H) {
                                                        z17 = false;
                                                    } else {
                                                        z17 = true;
                                                    }
                                                    iVar2 = kVar.f52346y;
                                                    qVar = kVar.f52347z;
                                                    if (z16 || !z17 || kVar.J || kVar.l != i11) {
                                                        bVar2 = null;
                                                    } else {
                                                        bVar2 = kVar.C;
                                                    }
                                                    bVar = bVar2;
                                                } else {
                                                    iVar2 = new b3.i(null);
                                                    qVar = new l1.q(10);
                                                    bVar = null;
                                                }
                                                b3.i iVar4 = iVar2;
                                                l1.q qVar4 = qVar;
                                                long j30 = hVarD2.f52309b;
                                                int i13 = hVarD2.f52310c;
                                                boolean z25 = !z11;
                                                boolean z26 = kVar2.f52827k;
                                                sparseArray = (SparseArray) k0Var2.f47269b;
                                                xVar2 = (l1.x) sparseArray.get(i11);
                                                if (xVar2 == null) {
                                                    xVar2 = new l1.x(9223372036854775806L);
                                                    sparseArray.put(i11, xVar2);
                                                }
                                                lVar2 = lVar2;
                                                lVar2.f50550c = new k(cVar2, aVar, kVar7, pVar, z14, hVar2, kVar3, z15, uri, list4, selectionReason, selectionData, j28, j29, j30, i13, z25, i11, z26, z23, xVar2, kVar2.f52822f, bVar, iVar4, qVar4, z13, z12, jVar3);
                                            }
                                        }
                                        if (z13) {
                                        }
                                        c cVar3 = iVar.f52312a;
                                        hVar = iVar.f52313b;
                                        i1.p pVar2 = iVar.f52317f[selectedIndexInTrackGroup];
                                        List list5 = iVar.f52320i;
                                        int selectionReason2 = iVar.f52328r.getSelectionReason();
                                        Object selectionData2 = iVar.f52328r.getSelectionData();
                                        boolean z27 = iVar.l;
                                        oa.k0 k0Var3 = iVar.f52315d;
                                        if (uriQ2 == null) {
                                            xVar3.getClass();
                                            xVar = xVar3;
                                            bArr = null;
                                        } else {
                                            xVar = xVar3;
                                            bArr = (byte[]) ((d) xVar.f49096b).get(uriQ2);
                                        }
                                        if (uriQ == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((d) xVar.f49096b).get(uriQ);
                                        }
                                        q1.j jVar4 = iVar.f52322k;
                                        AtomicInteger atomicInteger3 = k.M;
                                        map = Collections.EMPTY_MAP;
                                        Uri uriQ5 = l1.a.q(str, kVar2.f52817a);
                                        long j210 = kVar2.f52825i;
                                        long j211 = kVar2.f52826j;
                                        if (z11) {
                                            i10 = 8;
                                        } else {
                                            i10 = 0;
                                        }
                                        go.k.o(uriQ5, "The uri must be set.");
                                        n1.k kVar9 = new n1.k(uriQ5, 1, null, map, j210, j211, null, i10);
                                        if (bArr != null) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (z14) {
                                            String str6 = kVar2.f52824h;
                                            str6.getClass();
                                            bArrD = k.d(str6);
                                        } else {
                                            bArrD = null;
                                        }
                                        if (bArr != null) {
                                            bArrD.getClass();
                                            aVar = new a(hVar, bArr, bArrD);
                                        } else {
                                            aVar = hVar;
                                        }
                                        jVar2 = kVar2.f52818b;
                                        if (jVar2 != null) {
                                            if (bArr2 != null) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            if (z18) {
                                                String str7 = jVar2.f52824h;
                                                str7.getClass();
                                                bArrD2 = k.d(str7);
                                            } else {
                                                bArrD2 = null;
                                            }
                                            boolean z28 = z18;
                                            Uri uriQ6 = l1.a.q(str, jVar2.f52817a);
                                            long j212 = jVar2.f52825i;
                                            long j213 = jVar2.f52826j;
                                            go.k.o(uriQ6, "The uri must be set.");
                                            n1.k kVar10 = new n1.k(uriQ6, 1, null, map, j212, j213, null, 0);
                                            if (bArr2 != null) {
                                                bArrD2.getClass();
                                                aVar2 = new a(hVar, bArr2, bArrD2);
                                            } else {
                                                aVar2 = hVar;
                                            }
                                            z15 = z28;
                                            hVar2 = aVar2;
                                            kVar3 = kVar10;
                                        } else {
                                            kVar3 = null;
                                            hVar2 = null;
                                            z15 = false;
                                        }
                                        long j214 = j12 + j14;
                                        long j215 = j214 + kVar2.f52819c;
                                        i11 = mVar.f52839j + kVar2.f52820d;
                                        if (kVar != null) {
                                            kVar4 = kVar.f52338q;
                                            if (kVar3 != kVar4) {
                                                z16 = true;
                                            } else {
                                                z16 = true;
                                            }
                                            if (uri.equals(kVar.f52334m)) {
                                                z17 = false;
                                            } else {
                                                z17 = false;
                                            }
                                            iVar2 = kVar.f52346y;
                                            qVar = kVar.f52347z;
                                            if (z16) {
                                                bVar2 = null;
                                            } else {
                                                bVar2 = null;
                                            }
                                            bVar = bVar2;
                                        } else {
                                            iVar2 = new b3.i(null);
                                            qVar = new l1.q(10);
                                            bVar = null;
                                        }
                                        b3.i iVar5 = iVar2;
                                        l1.q qVar5 = qVar;
                                        long j31 = hVarD2.f52309b;
                                        int i14 = hVarD2.f52310c;
                                        boolean z29 = !z11;
                                        boolean z210 = kVar2.f52827k;
                                        sparseArray = (SparseArray) k0Var3.f47269b;
                                        xVar2 = (l1.x) sparseArray.get(i11);
                                        if (xVar2 == null) {
                                            xVar2 = new l1.x(9223372036854775806L);
                                            sparseArray.put(i11, xVar2);
                                        }
                                        lVar2 = lVar2;
                                        lVar2.f50550c = new k(cVar3, aVar, kVar9, pVar2, z14, hVar2, kVar3, z15, uri, list5, selectionReason2, selectionData2, j214, j215, j31, i14, z29, i11, z210, z27, xVar2, kVar2.f52822f, bVar, iVar5, qVar5, z13, z12, jVar4);
                                    }
                                }
                            } else if (!mVar.f52843o) {
                                lVar2.f50551d = uri;
                                iVar.f52326p = uri;
                            } else if (!z21 || j0Var.isEmpty()) {
                                lVar2.f50549b = true;
                            } else {
                                hVarD2 = new h((w1.k) oa.q.k(j0Var), (j13 + ((long) j0Var.size())) - 1, -1);
                                z11 = hVarD2.f52311d;
                                kVar2 = hVarD2.f52308a;
                                iVar.f52326p = null;
                                SystemClock.elapsedRealtime();
                                jVar = kVar2.f52818b;
                                j14 = kVar2.f52821e;
                                if (jVar != null) {
                                    uriQ = null;
                                } else {
                                    uriQ = null;
                                }
                                eVarE = iVar.e(uriQ, selectedIndexInTrackGroup, true);
                                lVar2.f50550c = eVarE;
                                if (eVarE == null) {
                                    str2 = kVar2.f52823g;
                                    if (str2 == null) {
                                        uriQ2 = null;
                                    } else {
                                        uriQ2 = l1.a.q(str, str2);
                                    }
                                    eVarE2 = iVar.e(uriQ2, selectedIndexInTrackGroup, false);
                                    lVar2.f50550c = eVarE2;
                                    if (eVarE2 == null) {
                                        if (!(kVar2 instanceof w1.h)) {
                                            z12 = z10;
                                        } else if (((w1.h) kVar2).l) {
                                            z12 = true;
                                        } else {
                                            z12 = true;
                                        }
                                        if (kVar == null) {
                                            AtomicInteger atomicInteger4 = k.M;
                                        } else {
                                            if (uri.equals(kVar.f52334m)) {
                                                if (z12) {
                                                }
                                            } else if (z12) {
                                            }
                                            if (z13) {
                                            }
                                            c cVar4 = iVar.f52312a;
                                            hVar = iVar.f52313b;
                                            i1.p pVar3 = iVar.f52317f[selectedIndexInTrackGroup];
                                            List list6 = iVar.f52320i;
                                            int selectionReason3 = iVar.f52328r.getSelectionReason();
                                            Object selectionData3 = iVar.f52328r.getSelectionData();
                                            boolean z211 = iVar.l;
                                            oa.k0 k0Var4 = iVar.f52315d;
                                            if (uriQ2 == null) {
                                                xVar3.getClass();
                                                xVar = xVar3;
                                                bArr = null;
                                            } else {
                                                xVar = xVar3;
                                                bArr = (byte[]) ((d) xVar.f49096b).get(uriQ2);
                                            }
                                            if (uriQ == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = (byte[]) ((d) xVar.f49096b).get(uriQ);
                                            }
                                            q1.j jVar5 = iVar.f52322k;
                                            AtomicInteger atomicInteger5 = k.M;
                                            map = Collections.EMPTY_MAP;
                                            Uri uriQ7 = l1.a.q(str, kVar2.f52817a);
                                            long j216 = kVar2.f52825i;
                                            long j217 = kVar2.f52826j;
                                            if (z11) {
                                                i10 = 8;
                                            } else {
                                                i10 = 0;
                                            }
                                            go.k.o(uriQ7, "The uri must be set.");
                                            n1.k kVar11 = new n1.k(uriQ7, 1, null, map, j216, j217, null, i10);
                                            if (bArr != null) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (z14) {
                                                String str8 = kVar2.f52824h;
                                                str8.getClass();
                                                bArrD = k.d(str8);
                                            } else {
                                                bArrD = null;
                                            }
                                            if (bArr != null) {
                                                bArrD.getClass();
                                                aVar = new a(hVar, bArr, bArrD);
                                            } else {
                                                aVar = hVar;
                                            }
                                            jVar2 = kVar2.f52818b;
                                            if (jVar2 != null) {
                                                if (bArr2 != null) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                if (z18) {
                                                    String str9 = jVar2.f52824h;
                                                    str9.getClass();
                                                    bArrD2 = k.d(str9);
                                                } else {
                                                    bArrD2 = null;
                                                }
                                                boolean z212 = z18;
                                                Uri uriQ8 = l1.a.q(str, jVar2.f52817a);
                                                long j218 = jVar2.f52825i;
                                                long j219 = jVar2.f52826j;
                                                go.k.o(uriQ8, "The uri must be set.");
                                                n1.k kVar12 = new n1.k(uriQ8, 1, null, map, j218, j219, null, 0);
                                                if (bArr2 != null) {
                                                    bArrD2.getClass();
                                                    aVar2 = new a(hVar, bArr2, bArrD2);
                                                } else {
                                                    aVar2 = hVar;
                                                }
                                                z15 = z212;
                                                hVar2 = aVar2;
                                                kVar3 = kVar12;
                                            } else {
                                                kVar3 = null;
                                                hVar2 = null;
                                                z15 = false;
                                            }
                                            long j2110 = j12 + j14;
                                            long j2111 = j2110 + kVar2.f52819c;
                                            i11 = mVar.f52839j + kVar2.f52820d;
                                            if (kVar != null) {
                                                kVar4 = kVar.f52338q;
                                                if (kVar3 != kVar4) {
                                                    z16 = true;
                                                } else {
                                                    z16 = true;
                                                }
                                                if (uri.equals(kVar.f52334m)) {
                                                    z17 = false;
                                                } else {
                                                    z17 = false;
                                                }
                                                iVar2 = kVar.f52346y;
                                                qVar = kVar.f52347z;
                                                if (z16) {
                                                    bVar2 = null;
                                                } else {
                                                    bVar2 = null;
                                                }
                                                bVar = bVar2;
                                            } else {
                                                iVar2 = new b3.i(null);
                                                qVar = new l1.q(10);
                                                bVar = null;
                                            }
                                            b3.i iVar6 = iVar2;
                                            l1.q qVar6 = qVar;
                                            long j32 = hVarD2.f52309b;
                                            int i15 = hVarD2.f52310c;
                                            boolean z213 = !z11;
                                            boolean z214 = kVar2.f52827k;
                                            sparseArray = (SparseArray) k0Var4.f47269b;
                                            xVar2 = (l1.x) sparseArray.get(i11);
                                            if (xVar2 == null) {
                                                xVar2 = new l1.x(9223372036854775806L);
                                                sparseArray.put(i11, xVar2);
                                            }
                                            lVar2 = lVar2;
                                            lVar2.f50550c = new k(cVar4, aVar, kVar11, pVar3, z14, hVar2, kVar3, z15, uri, list6, selectionReason3, selectionData3, j2110, j2111, j32, i15, z213, i11, z214, z211, xVar2, kVar2.f52822f, bVar, iVar6, qVar6, z13, z12, jVar5);
                                        }
                                        if (z13) {
                                        }
                                        c cVar5 = iVar.f52312a;
                                        hVar = iVar.f52313b;
                                        i1.p pVar4 = iVar.f52317f[selectedIndexInTrackGroup];
                                        List list7 = iVar.f52320i;
                                        int selectionReason4 = iVar.f52328r.getSelectionReason();
                                        Object selectionData4 = iVar.f52328r.getSelectionData();
                                        boolean z215 = iVar.l;
                                        oa.k0 k0Var5 = iVar.f52315d;
                                        if (uriQ2 == null) {
                                            xVar3.getClass();
                                            xVar = xVar3;
                                            bArr = null;
                                        } else {
                                            xVar = xVar3;
                                            bArr = (byte[]) ((d) xVar.f49096b).get(uriQ2);
                                        }
                                        if (uriQ == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((d) xVar.f49096b).get(uriQ);
                                        }
                                        q1.j jVar6 = iVar.f52322k;
                                        AtomicInteger atomicInteger6 = k.M;
                                        map = Collections.EMPTY_MAP;
                                        Uri uriQ9 = l1.a.q(str, kVar2.f52817a);
                                        long j2112 = kVar2.f52825i;
                                        long j2113 = kVar2.f52826j;
                                        if (z11) {
                                            i10 = 8;
                                        } else {
                                            i10 = 0;
                                        }
                                        go.k.o(uriQ9, "The uri must be set.");
                                        n1.k kVar13 = new n1.k(uriQ9, 1, null, map, j2112, j2113, null, i10);
                                        if (bArr != null) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (z14) {
                                            String str10 = kVar2.f52824h;
                                            str10.getClass();
                                            bArrD = k.d(str10);
                                        } else {
                                            bArrD = null;
                                        }
                                        if (bArr != null) {
                                            bArrD.getClass();
                                            aVar = new a(hVar, bArr, bArrD);
                                        } else {
                                            aVar = hVar;
                                        }
                                        jVar2 = kVar2.f52818b;
                                        if (jVar2 != null) {
                                            if (bArr2 != null) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            if (z18) {
                                                String str11 = jVar2.f52824h;
                                                str11.getClass();
                                                bArrD2 = k.d(str11);
                                            } else {
                                                bArrD2 = null;
                                            }
                                            boolean z216 = z18;
                                            Uri uriQ10 = l1.a.q(str, jVar2.f52817a);
                                            long j2114 = jVar2.f52825i;
                                            long j2115 = jVar2.f52826j;
                                            go.k.o(uriQ10, "The uri must be set.");
                                            n1.k kVar14 = new n1.k(uriQ10, 1, null, map, j2114, j2115, null, 0);
                                            if (bArr2 != null) {
                                                bArrD2.getClass();
                                                aVar2 = new a(hVar, bArr2, bArrD2);
                                            } else {
                                                aVar2 = hVar;
                                            }
                                            z15 = z216;
                                            hVar2 = aVar2;
                                            kVar3 = kVar14;
                                        } else {
                                            kVar3 = null;
                                            hVar2 = null;
                                            z15 = false;
                                        }
                                        long j2116 = j12 + j14;
                                        long j2117 = j2116 + kVar2.f52819c;
                                        i11 = mVar.f52839j + kVar2.f52820d;
                                        if (kVar != null) {
                                            kVar4 = kVar.f52338q;
                                            if (kVar3 != kVar4) {
                                                z16 = true;
                                            } else {
                                                z16 = true;
                                            }
                                            if (uri.equals(kVar.f52334m)) {
                                                z17 = false;
                                            } else {
                                                z17 = false;
                                            }
                                            iVar2 = kVar.f52346y;
                                            qVar = kVar.f52347z;
                                            if (z16) {
                                                bVar2 = null;
                                            } else {
                                                bVar2 = null;
                                            }
                                            bVar = bVar2;
                                        } else {
                                            iVar2 = new b3.i(null);
                                            qVar = new l1.q(10);
                                            bVar = null;
                                        }
                                        b3.i iVar7 = iVar2;
                                        l1.q qVar7 = qVar;
                                        long j33 = hVarD2.f52309b;
                                        int i16 = hVarD2.f52310c;
                                        boolean z217 = !z11;
                                        boolean z218 = kVar2.f52827k;
                                        sparseArray = (SparseArray) k0Var5.f47269b;
                                        xVar2 = (l1.x) sparseArray.get(i11);
                                        if (xVar2 == null) {
                                            xVar2 = new l1.x(9223372036854775806L);
                                            sparseArray.put(i11, xVar2);
                                        }
                                        lVar2 = lVar2;
                                        lVar2.f50550c = new k(cVar5, aVar, kVar13, pVar4, z14, hVar2, kVar3, z15, uri, list7, selectionReason4, selectionData4, j2116, j2117, j33, i16, z217, i11, z218, z215, xVar2, kVar2.f52822f, bVar, iVar7, qVar7, z13, z12, jVar6);
                                    }
                                }
                            }
                        }
                    } else {
                        j12 = j22;
                    }
                    kVar = kVar6;
                    iVar = iVar3;
                    mVar = mVarA;
                    uri = uri2;
                    str = mVar.f52871a;
                    z10 = mVar.f52873c;
                    j13 = mVar.f52840k;
                    j0 j0Var2 = mVar.f52846r;
                    if (selectedIndexInTrackGroup != i12) {
                        cVar = (w1.c) dVar.f52760d.get(uriArr[i12]);
                        if (cVar != null) {
                            cVar.f52755k = false;
                        }
                    }
                    if (jLongValue < j13) {
                        iVar.f52324n = new f2.b();
                    } else {
                        hVarD2 = i.d(mVar, jLongValue, iIntValue);
                        if (hVarD2 != null) {
                            z11 = hVarD2.f52311d;
                            kVar2 = hVarD2.f52308a;
                            iVar.f52326p = null;
                            SystemClock.elapsedRealtime();
                            jVar = kVar2.f52818b;
                            j14 = kVar2.f52821e;
                            if (jVar != null) {
                                uriQ = null;
                            } else {
                                uriQ = null;
                            }
                            eVarE = iVar.e(uriQ, selectedIndexInTrackGroup, true);
                            lVar2.f50550c = eVarE;
                            if (eVarE == null) {
                                str2 = kVar2.f52823g;
                                if (str2 == null) {
                                    uriQ2 = null;
                                } else {
                                    uriQ2 = l1.a.q(str, str2);
                                }
                                eVarE2 = iVar.e(uriQ2, selectedIndexInTrackGroup, false);
                                lVar2.f50550c = eVarE2;
                                if (eVarE2 == null) {
                                    if (!(kVar2 instanceof w1.h)) {
                                        z12 = z10;
                                    } else if (((w1.h) kVar2).l) {
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                    }
                                    if (kVar == null) {
                                        AtomicInteger atomicInteger7 = k.M;
                                    } else {
                                        if (uri.equals(kVar.f52334m)) {
                                            if (z12) {
                                            }
                                        } else if (z12) {
                                        }
                                        if (z13) {
                                        }
                                        c cVar6 = iVar.f52312a;
                                        hVar = iVar.f52313b;
                                        i1.p pVar5 = iVar.f52317f[selectedIndexInTrackGroup];
                                        List list8 = iVar.f52320i;
                                        int selectionReason5 = iVar.f52328r.getSelectionReason();
                                        Object selectionData5 = iVar.f52328r.getSelectionData();
                                        boolean z219 = iVar.l;
                                        oa.k0 k0Var6 = iVar.f52315d;
                                        if (uriQ2 == null) {
                                            xVar3.getClass();
                                            xVar = xVar3;
                                            bArr = null;
                                        } else {
                                            xVar = xVar3;
                                            bArr = (byte[]) ((d) xVar.f49096b).get(uriQ2);
                                        }
                                        if (uriQ == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((d) xVar.f49096b).get(uriQ);
                                        }
                                        q1.j jVar7 = iVar.f52322k;
                                        AtomicInteger atomicInteger8 = k.M;
                                        map = Collections.EMPTY_MAP;
                                        Uri uriQ11 = l1.a.q(str, kVar2.f52817a);
                                        long j2118 = kVar2.f52825i;
                                        long j2119 = kVar2.f52826j;
                                        if (z11) {
                                            i10 = 8;
                                        } else {
                                            i10 = 0;
                                        }
                                        go.k.o(uriQ11, "The uri must be set.");
                                        n1.k kVar15 = new n1.k(uriQ11, 1, null, map, j2118, j2119, null, i10);
                                        if (bArr != null) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (z14) {
                                            String str12 = kVar2.f52824h;
                                            str12.getClass();
                                            bArrD = k.d(str12);
                                        } else {
                                            bArrD = null;
                                        }
                                        if (bArr != null) {
                                            bArrD.getClass();
                                            aVar = new a(hVar, bArr, bArrD);
                                        } else {
                                            aVar = hVar;
                                        }
                                        jVar2 = kVar2.f52818b;
                                        if (jVar2 != null) {
                                            if (bArr2 != null) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            if (z18) {
                                                String str13 = jVar2.f52824h;
                                                str13.getClass();
                                                bArrD2 = k.d(str13);
                                            } else {
                                                bArrD2 = null;
                                            }
                                            boolean z2110 = z18;
                                            Uri uriQ12 = l1.a.q(str, jVar2.f52817a);
                                            long j21110 = jVar2.f52825i;
                                            long j21111 = jVar2.f52826j;
                                            go.k.o(uriQ12, "The uri must be set.");
                                            n1.k kVar16 = new n1.k(uriQ12, 1, null, map, j21110, j21111, null, 0);
                                            if (bArr2 != null) {
                                                bArrD2.getClass();
                                                aVar2 = new a(hVar, bArr2, bArrD2);
                                            } else {
                                                aVar2 = hVar;
                                            }
                                            z15 = z2110;
                                            hVar2 = aVar2;
                                            kVar3 = kVar16;
                                        } else {
                                            kVar3 = null;
                                            hVar2 = null;
                                            z15 = false;
                                        }
                                        long j21112 = j12 + j14;
                                        long j21113 = j21112 + kVar2.f52819c;
                                        i11 = mVar.f52839j + kVar2.f52820d;
                                        if (kVar != null) {
                                            kVar4 = kVar.f52338q;
                                            if (kVar3 != kVar4) {
                                                z16 = true;
                                            } else {
                                                z16 = true;
                                            }
                                            if (uri.equals(kVar.f52334m)) {
                                                z17 = false;
                                            } else {
                                                z17 = false;
                                            }
                                            iVar2 = kVar.f52346y;
                                            qVar = kVar.f52347z;
                                            if (z16) {
                                                bVar2 = null;
                                            } else {
                                                bVar2 = null;
                                            }
                                            bVar = bVar2;
                                        } else {
                                            iVar2 = new b3.i(null);
                                            qVar = new l1.q(10);
                                            bVar = null;
                                        }
                                        b3.i iVar8 = iVar2;
                                        l1.q qVar8 = qVar;
                                        long j34 = hVarD2.f52309b;
                                        int i17 = hVarD2.f52310c;
                                        boolean z2111 = !z11;
                                        boolean z2112 = kVar2.f52827k;
                                        sparseArray = (SparseArray) k0Var6.f47269b;
                                        xVar2 = (l1.x) sparseArray.get(i11);
                                        if (xVar2 == null) {
                                            xVar2 = new l1.x(9223372036854775806L);
                                            sparseArray.put(i11, xVar2);
                                        }
                                        lVar2 = lVar2;
                                        lVar2.f50550c = new k(cVar6, aVar, kVar15, pVar5, z14, hVar2, kVar3, z15, uri, list8, selectionReason5, selectionData5, j21112, j21113, j34, i17, z2111, i11, z2112, z219, xVar2, kVar2.f52822f, bVar, iVar8, qVar8, z13, z12, jVar7);
                                    }
                                    if (z13) {
                                    }
                                    c cVar7 = iVar.f52312a;
                                    hVar = iVar.f52313b;
                                    i1.p pVar6 = iVar.f52317f[selectedIndexInTrackGroup];
                                    List list9 = iVar.f52320i;
                                    int selectionReason6 = iVar.f52328r.getSelectionReason();
                                    Object selectionData6 = iVar.f52328r.getSelectionData();
                                    boolean z2113 = iVar.l;
                                    oa.k0 k0Var7 = iVar.f52315d;
                                    if (uriQ2 == null) {
                                        xVar3.getClass();
                                        xVar = xVar3;
                                        bArr = null;
                                    } else {
                                        xVar = xVar3;
                                        bArr = (byte[]) ((d) xVar.f49096b).get(uriQ2);
                                    }
                                    if (uriQ == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((d) xVar.f49096b).get(uriQ);
                                    }
                                    q1.j jVar8 = iVar.f52322k;
                                    AtomicInteger atomicInteger9 = k.M;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriQ13 = l1.a.q(str, kVar2.f52817a);
                                    long j21114 = kVar2.f52825i;
                                    long j21115 = kVar2.f52826j;
                                    if (z11) {
                                        i10 = 8;
                                    } else {
                                        i10 = 0;
                                    }
                                    go.k.o(uriQ13, "The uri must be set.");
                                    n1.k kVar17 = new n1.k(uriQ13, 1, null, map, j21114, j21115, null, i10);
                                    if (bArr != null) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        String str14 = kVar2.f52824h;
                                        str14.getClass();
                                        bArrD = k.d(str14);
                                    } else {
                                        bArrD = null;
                                    }
                                    if (bArr != null) {
                                        bArrD.getClass();
                                        aVar = new a(hVar, bArr, bArrD);
                                    } else {
                                        aVar = hVar;
                                    }
                                    jVar2 = kVar2.f52818b;
                                    if (jVar2 != null) {
                                        if (bArr2 != null) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        if (z18) {
                                            String str15 = jVar2.f52824h;
                                            str15.getClass();
                                            bArrD2 = k.d(str15);
                                        } else {
                                            bArrD2 = null;
                                        }
                                        boolean z2114 = z18;
                                        Uri uriQ14 = l1.a.q(str, jVar2.f52817a);
                                        long j21116 = jVar2.f52825i;
                                        long j21117 = jVar2.f52826j;
                                        go.k.o(uriQ14, "The uri must be set.");
                                        n1.k kVar18 = new n1.k(uriQ14, 1, null, map, j21116, j21117, null, 0);
                                        if (bArr2 != null) {
                                            bArrD2.getClass();
                                            aVar2 = new a(hVar, bArr2, bArrD2);
                                        } else {
                                            aVar2 = hVar;
                                        }
                                        z15 = z2114;
                                        hVar2 = aVar2;
                                        kVar3 = kVar18;
                                    } else {
                                        kVar3 = null;
                                        hVar2 = null;
                                        z15 = false;
                                    }
                                    long j21118 = j12 + j14;
                                    long j21119 = j21118 + kVar2.f52819c;
                                    i11 = mVar.f52839j + kVar2.f52820d;
                                    if (kVar != null) {
                                        kVar4 = kVar.f52338q;
                                        if (kVar3 != kVar4) {
                                            z16 = true;
                                        } else {
                                            z16 = true;
                                        }
                                        if (uri.equals(kVar.f52334m)) {
                                            z17 = false;
                                        } else {
                                            z17 = false;
                                        }
                                        iVar2 = kVar.f52346y;
                                        qVar = kVar.f52347z;
                                        if (z16) {
                                            bVar2 = null;
                                        } else {
                                            bVar2 = null;
                                        }
                                        bVar = bVar2;
                                    } else {
                                        iVar2 = new b3.i(null);
                                        qVar = new l1.q(10);
                                        bVar = null;
                                    }
                                    b3.i iVar9 = iVar2;
                                    l1.q qVar9 = qVar;
                                    long j35 = hVarD2.f52309b;
                                    int i18 = hVarD2.f52310c;
                                    boolean z2115 = !z11;
                                    boolean z2116 = kVar2.f52827k;
                                    sparseArray = (SparseArray) k0Var7.f47269b;
                                    xVar2 = (l1.x) sparseArray.get(i11);
                                    if (xVar2 == null) {
                                        xVar2 = new l1.x(9223372036854775806L);
                                        sparseArray.put(i11, xVar2);
                                    }
                                    lVar2 = lVar2;
                                    lVar2.f50550c = new k(cVar7, aVar, kVar17, pVar6, z14, hVar2, kVar3, z15, uri, list9, selectionReason6, selectionData6, j21118, j21119, j35, i18, z2115, i11, z2116, z2113, xVar2, kVar2.f52822f, bVar, iVar9, qVar9, z13, z12, jVar8);
                                }
                            }
                        } else if (!mVar.f52843o) {
                            lVar2.f50551d = uri;
                            iVar.f52326p = uri;
                        } else {
                            if (z21) {
                            }
                            lVar2.f50549b = true;
                        }
                    }
                } else {
                    t6.l lVar5 = lVar;
                    lVar5.f50551d = uri2;
                    iVar3.f52326p = uri2;
                    lVar2 = lVar5;
                }
                boolean z30 = lVar2.f50549b;
                g2.f fVar = (g2.f) lVar2.f50550c;
                Uri uri4 = (Uri) lVar2.f50551d;
                if (z30) {
                    this.Q = C.TIME_UNSET;
                    this.T = true;
                    return true;
                }
                if (fVar == null) {
                    if (uri4 == null) {
                        return false;
                    }
                    ((w1.c) ((l) this.f52395c.f49529b).f52349b.f52760d.get(uri4)).e(true);
                    return false;
                }
                if (fVar instanceof k) {
                    k kVar19 = (k) fVar;
                    ArrayList arrayList = this.f52405n;
                    if (!arrayList.isEmpty()) {
                        if (!q().f()) {
                            p(arrayList.size() - 1);
                        }
                        if (kVar19.f52335n && kVar19.L) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                long j36 = ((k) arrayList.get(size)).f41372g;
                                long j37 = kVar19.f41372g;
                                if (j36 < j37) {
                                    break;
                                }
                                if (j36 == j37 && k(size)) {
                                    p(size);
                                    kVar19.L = false;
                                    break;
                                }
                            }
                        }
                    }
                    this.X = kVar19;
                    this.F = kVar19.f41369d;
                    this.Q = C.TIME_UNSET;
                    arrayList.add(kVar19);
                    e0 e0VarU = j0.u();
                    for (q qVar10 : this.f52413v) {
                        e0VarU.b(Integer.valueOf(qVar10.f40294q + qVar10.f40293p));
                    }
                    n1 n1VarG = e0VarU.g();
                    kVar19.D = this;
                    kVar19.I = n1VarG;
                    for (q qVar11 : this.f52413v) {
                        qVar11.getClass();
                        qVar11.C = kVar19.f52333k;
                        if (kVar19.L) {
                            qVar11.G = true;
                        }
                    }
                }
                this.f52412u = fVar;
                mVar2.e(fVar, this, this.f52401i.j(fVar.f41368c));
                return true;
            }
        }
        return false;
    }

    @Override // f2.e1
    public final long getBufferedPositionUs() {
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (s()) {
            return this.Q;
        }
        long jMax = this.P;
        k kVarQ = q();
        if (!kVarQ.H) {
            ArrayList arrayList = this.f52405n;
            kVarQ = arrayList.size() > 1 ? (k) l1.d.d(arrayList, 2) : null;
        }
        if (kVarQ != null) {
            jMax = Math.max(jMax, kVarQ.f41373h);
        }
        if (this.C) {
            for (q qVar : this.f52413v) {
                jMax = Math.max(jMax, qVar.q());
            }
        }
        return jMax;
    }

    @Override // f2.e1
    public final long getNextLoadPositionUs() {
        if (s()) {
            return this.Q;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return q().f41373h;
    }

    @Override // f2.a1
    public final void h() {
        this.f52409r.post(this.f52407p);
    }

    public final void i() {
        go.k.t(this.D);
        this.I.getClass();
        this.J.getClass();
    }

    @Override // f2.e1
    public final boolean isLoading() {
        return this.f52402j.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j2.h
    public final void j(j2.j jVar, long j10, long j11) {
        g2.f fVar = (g2.f) jVar;
        this.f52412u = null;
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            byte[] bArr = eVar.f52303j;
            i iVar = this.f52396d;
            iVar.f52323m = bArr;
            x xVar = iVar.f52321j;
            Uri uri = eVar.f41367b.f46369a;
            byte[] bArr2 = eVar.l;
            bArr2.getClass();
            d dVar = (d) xVar.f49096b;
            uri.getClass();
        }
        long j12 = fVar.f41366a;
        n1.k kVar = fVar.f41367b;
        n1.y yVar = fVar.f41374i;
        f2.u uVar = new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        this.f52401i.getClass();
        this.f52403k.e(uVar, fVar.f41368c, this.f52394b, fVar.f41369d, fVar.f41370e, fVar.f41371f, fVar.f41372g, fVar.f41373h);
        if (this.D) {
            this.f52395c.h(this);
            return;
        }
        az1 az1Var = new az1();
        az1Var.f12554a = this.P;
        f(new k0(az1Var));
    }

    public final boolean k(int i10) {
        int i11 = i10;
        while (true) {
            ArrayList arrayList = this.f52405n;
            if (i11 >= arrayList.size()) {
                k kVar = (k) arrayList.get(i10);
                for (int i12 = 0; i12 < this.f52413v.length; i12++) {
                    if (this.f52413v[i12].t() > kVar.e(i12)) {
                        return false;
                    }
                }
                return true;
            }
            if (((k) arrayList.get(i11)).L) {
                return false;
            }
            i11++;
        }
    }

    public final k1 m(q0[] q0VarArr) {
        for (int i10 = 0; i10 < q0VarArr.length; i10++) {
            q0 q0Var = q0VarArr[i10];
            i1.p[] pVarArr = new i1.p[q0Var.f42659a];
            for (int i11 = 0; i11 < q0Var.f42659a; i11++) {
                i1.p pVar = q0Var.f42662d[i11];
                int iD = this.f52399g.d(pVar);
                i1.o oVarA = pVar.a();
                oVarA.N = iD;
                pVarArr[i11] = new i1.p(oVarA);
            }
            q0VarArr[i10] = new q0(q0Var.f42660b, pVarArr);
        }
        return new k1(q0VarArr);
    }

    @Override // j2.h
    public final void n(j2.j jVar, long j10, long j11, int i10) {
        f2.u uVar;
        g2.f fVar = (g2.f) jVar;
        if (i10 == 0) {
            long j12 = fVar.f41366a;
            uVar = new f2.u(fVar.f41367b, j10);
        } else {
            long j13 = fVar.f41366a;
            n1.k kVar = fVar.f41367b;
            n1.y yVar = fVar.f41374i;
            uVar = new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        }
        this.f52403k.h(uVar, fVar.f41368c, this.f52394b, fVar.f41369d, fVar.f41370e, fVar.f41371f, fVar.f41372g, fVar.f41373h, i10);
    }

    @Override // j2.k
    public final void onLoaderReleased() {
        for (q qVar : this.f52413v) {
            qVar.D();
        }
    }

    public final void p(int i10) {
        ArrayList arrayList;
        go.k.t(!this.f52402j.c());
        while (true) {
            arrayList = this.f52405n;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (k(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = q().f41373h;
        k kVar = (k) arrayList.get(i10);
        y.R(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.f52413v.length; i11++) {
            this.f52413v[i11].n(kVar.e(i11));
        }
        if (arrayList.isEmpty()) {
            this.Q = this.P;
        } else {
            ((k) oa.q.k(arrayList)).J = true;
        }
        this.T = false;
        this.f52403k.i(this.A, kVar.f41372g, j10);
    }

    public final k q() {
        return (k) l1.d.d(this.f52405n, 1);
    }

    @Override // f2.e1
    public final void reevaluateBuffer(long j10) {
        j2.m mVar = this.f52402j;
        if (mVar.b() || s()) {
            return;
        }
        boolean zC = mVar.c();
        i iVar = this.f52396d;
        List list = this.f52406o;
        if (zC) {
            this.f52412u.getClass();
            if (iVar.f52324n != null ? false : iVar.f52328r.d(j10, this.f52412u, list)) {
                mVar.a();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && iVar.b((k) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            p(size);
        }
        int size2 = (iVar.f52324n != null || iVar.f52328r.length() < 2) ? list.size() : iVar.f52328r.evaluateQueueSize(j10, list);
        if (size2 < this.f52405n.size()) {
            p(size2);
        }
    }

    public final boolean s() {
        return this.Q != C.TIME_UNSET;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        int i10;
        if (!this.H && this.K == null && this.C) {
            int i11 = 0;
            for (q qVar : this.f52413v) {
                if (qVar.w() == null) {
                    return;
                }
            }
            k1 k1Var = this.I;
            if (k1Var != null) {
                int i12 = k1Var.f40386a;
                int[] iArr = new int[i12];
                this.K = iArr;
                Arrays.fill(iArr, -1);
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = 0;
                    while (true) {
                        q[] qVarArr = this.f52413v;
                        if (i14 >= qVarArr.length) {
                            break;
                        }
                        i1.p pVarW = qVarArr[i14].w();
                        pVarW.getClass();
                        i1.p pVar = this.I.a(i13).f42662d[0];
                        String str = pVarW.f42643n;
                        String str2 = pVar.f42643n;
                        int iH = d0.h(str);
                        if (iH != 3) {
                            if (iH == d0.h(str2)) {
                                this.K[i13] = i14;
                                break;
                            }
                            i14++;
                        } else {
                            if (Objects.equals(str, str2) && (!(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str)) || pVarW.K == pVar.K)) {
                                this.K[i13] = i14;
                                break;
                                break;
                            }
                            i14++;
                        }
                    }
                }
                Iterator it = this.f52410s.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).a();
                }
                return;
            }
            int length = this.f52413v.length;
            int i15 = 0;
            int i16 = -1;
            int i17 = -2;
            while (true) {
                int i18 = 1;
                if (i15 >= length) {
                    break;
                }
                i1.p pVarW2 = this.f52413v[i15].w();
                pVarW2.getClass();
                String str3 = pVarW2.f42643n;
                if (d0.m(str3)) {
                    i18 = 2;
                } else if (!d0.i(str3)) {
                    i18 = d0.l(str3) ? 3 : -2;
                }
                if (r(i18) > r(i17)) {
                    i16 = i15;
                    i17 = i18;
                } else if (i18 == i17 && i16 != -1) {
                    i16 = -1;
                }
                i15++;
            }
            q0 q0Var = this.f52396d.f52319h;
            int i19 = q0Var.f42659a;
            this.L = -1;
            this.K = new int[length];
            for (int i20 = 0; i20 < length; i20++) {
                this.K[i20] = i20;
            }
            q0[] q0VarArr = new q0[length];
            int i21 = 0;
            while (i21 < length) {
                i1.p pVarW3 = this.f52413v[i21].w();
                pVarW3.getClass();
                String str4 = this.f52393a;
                i1.p pVar2 = this.f52398f;
                if (i21 == i16) {
                    i1.p[] pVarArr = new i1.p[i19];
                    for (int i22 = i11; i22 < i19; i22++) {
                        i1.p pVarD = q0Var.f42662d[i22];
                        if (i17 == 1 && pVar2 != null) {
                            pVarD = pVarD.d(pVar2);
                        }
                        pVarArr[i22] = i19 == 1 ? pVarW3.d(pVarD) : o(pVarD, pVarW3, true);
                    }
                    q0VarArr[i21] = new q0(str4, pVarArr);
                    this.L = i21;
                    i10 = 0;
                } else {
                    if (i17 != 2 || !d0.i(pVarW3.f42643n)) {
                        pVar2 = null;
                    }
                    StringBuilder sbJ = d5.u.j(str4, ":muxed:");
                    sbJ.append(i21 < i16 ? i21 : i21 - 1);
                    i10 = 0;
                    q0VarArr[i21] = new q0(sbJ.toString(), o(pVar2, pVarW3, false));
                }
                i21++;
                i11 = i10;
            }
            int i23 = i11;
            this.I = m(q0VarArr);
            go.k.t(this.J == null ? 1 : i23);
            this.J = Collections.EMPTY_SET;
            this.D = true;
            this.f52395c.r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [v1.q[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [v1.q[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [n2.a0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [f2.b1, v1.q] */
    /* JADX WARN: Type inference failed for: r5v6, types: [n2.j] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // n2.m
    public final n2.a0 track(int i10, int i11) {
        Integer numValueOf = Integer.valueOf(i11);
        Set set = Y;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.f52415x;
        SparseIntArray sparseIntArray = this.f52416y;
        ?? qVar = 0;
        qVar = 0;
        if (zContains) {
            go.k.i(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.f52414w[i12] = i10;
                }
                qVar = this.f52414w[i12] == i10 ? this.f52413v[i12] : l(i10, i11);
            }
        } else {
            int i13 = 0;
            while (true) {
                ?? r2 = this.f52413v;
                if (i13 >= r2.length) {
                    break;
                }
                if (this.f52414w[i13] == i10) {
                    qVar = r2[i13];
                    break;
                }
                i13++;
            }
        }
        if (qVar == 0) {
            if (this.U) {
                return l(i10, i11);
            }
            int length = this.f52413v.length;
            boolean z10 = i11 == 1 || i11 == 2;
            qVar = new q(this.f52397e, this.f52399g, this.f52400h, this.f52411t);
            qVar.f40297t = this.P;
            if (z10) {
                qVar.I = this.W;
                qVar.f40303z = true;
            }
            long j10 = this.V;
            if (qVar.F != j10) {
                qVar.F = j10;
                qVar.f40303z = true;
            }
            k kVar = this.X;
            if (kVar != null) {
                qVar.C = kVar.f52333k;
            }
            qVar.f40284f = this;
            int i14 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.f52414w, i14);
            this.f52414w = iArrCopyOf;
            iArrCopyOf[length] = i10;
            q[] qVarArr = this.f52413v;
            String str = y.f44830a;
            ?? CopyOf = Arrays.copyOf(qVarArr, qVarArr.length + 1);
            CopyOf[qVarArr.length] = qVar;
            this.f52413v = (q[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.O, i14);
            this.O = zArrCopyOf;
            zArrCopyOf[length] = z10;
            this.M |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (r(i11) > r(this.A)) {
                this.B = length;
                this.A = i11;
            }
            this.N = Arrays.copyOf(this.N, i14);
        }
        if (i11 != 5) {
            return qVar;
        }
        if (this.f52417z == null) {
            this.f52417z = new p(qVar, this.l);
        }
        return this.f52417z;
    }

    public final void v() throws IOException {
        this.f52402j.maybeThrowError();
        i iVar = this.f52396d;
        f2.b bVar = iVar.f52324n;
        if (bVar != null) {
            throw bVar;
        }
        Uri uri = iVar.f52325o;
        if (uri == null || !uri.equals(iVar.f52326p)) {
            return;
        }
        w1.d dVar = iVar.f52318g;
        w1.c cVar = (w1.c) dVar.f52760d.get(iVar.f52325o);
        cVar.f52746b.maybeThrowError();
        IOException iOException = cVar.f52754j;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void w(q0[] q0VarArr, int... iArr) {
        this.I = m(q0VarArr);
        this.J = new HashSet();
        for (int i10 : iArr) {
            this.J.add(this.I.a(i10));
        }
        this.L = 0;
        this.f52409r.post(new q1.c(this.f52395c, 8));
        this.D = true;
    }

    public final void x() {
        for (q qVar : this.f52413v) {
            qVar.E(this.R);
        }
        this.R = false;
    }

    public final boolean y(long j10, boolean z10) throws Throwable {
        k kVar;
        boolean z11;
        boolean zG;
        this.P = j10;
        if (s()) {
            this.Q = j10;
            return true;
        }
        boolean z12 = this.f52396d.f52327q;
        ArrayList arrayList = this.f52405n;
        if (!z12) {
            kVar = null;
            break;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                kVar = null;
                break;
            }
            kVar = (k) arrayList.get(i10);
            if (kVar.f41372g == j10) {
                break;
            }
            i10++;
        }
        if (this.C && !z10 && !arrayList.isEmpty()) {
            int length = this.f52413v.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = true;
                    break;
                }
                q qVar = this.f52413v[i11];
                if (kVar != null) {
                    zG = qVar.F(kVar.e(i11));
                } else {
                    long nextLoadPositionUs = getNextLoadPositionUs();
                    zG = qVar.G(j10, nextLoadPositionUs == Long.MIN_VALUE || j10 < nextLoadPositionUs);
                }
                if (!zG && (this.O[i11] || !this.M)) {
                    z11 = false;
                    break;
                }
                i11++;
            }
            if (z11) {
                return false;
            }
        }
        this.Q = j10;
        this.T = false;
        arrayList.clear();
        j2.m mVar = this.f52402j;
        if (!mVar.c()) {
            mVar.f43676c = null;
            x();
            return true;
        }
        if (this.C) {
            for (q qVar2 : this.f52413v) {
                qVar2.k();
            }
        }
        mVar.a();
        return true;
    }

    @Override // n2.m
    public final void u(n2.t tVar) {
    }
}
