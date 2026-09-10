package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3591hA implements JI, MI, InterfaceC4985x40, InterfaceC4353pt, U20 {
    public static final Set Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public C4619sw F;
    public C4619sw G;
    public boolean H;
    public C4062md0 I;
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
    public DrmInitData W;
    public C2536Jz X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4449a;
    public final int b;
    public final Wm0 c;
    public final C2458Gz d;
    public final C2833Vl e;
    public final C4619sw f;
    public final InterfaceC3296dq g;
    public final C3031aq h;
    public final G7 i;
    public final DO k;
    public final int l;
    public final ArrayList n;
    public final List o;
    public final RunnableC3327eA p;
    public final RunnableC3327eA q;
    public final Handler r;
    public final ArrayList s;
    public final Map t;
    public AbstractC2567Le u;
    public C3503gA[] v;
    public final HashSet x;
    public final SparseIntArray y;
    public C3415fA z;
    public final OI j = new OI("Loader:HlsSampleStreamWrapper");
    public final C4288p70 m = new C4288p70(5);
    public int[] w = new int[0];

    public C3591hA(String str, int i, Wm0 wm0, C2458Gz c2458Gz, Map map, C2833Vl c2833Vl, long j, C4619sw c4619sw, InterfaceC3296dq interfaceC3296dq, C3031aq c3031aq, G7 g7, DO r13, int i2) {
        this.f4449a = str;
        this.b = i;
        this.c = wm0;
        this.d = c2458Gz;
        this.t = map;
        this.e = c2833Vl;
        this.f = c4619sw;
        this.g = interfaceC3296dq;
        this.h = c3031aq;
        this.i = g7;
        this.k = r13;
        this.l = i2;
        Set set = Y;
        this.x = new HashSet(set.size());
        this.y = new SparseIntArray(set.size());
        this.v = new C3503gA[0];
        this.O = new boolean[0];
        this.N = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        this.o = Collections.unmodifiableList(arrayList);
        this.s = new ArrayList();
        this.p = new RunnableC3327eA(this, 0);
        this.q = new RunnableC3327eA(this, 1);
        this.r = Ug0.m(null);
        this.P = j;
        this.Q = j;
    }

    public static C4262oq h(int i, int i2) {
        AbstractC4038mJ.f();
        return new C4262oq();
    }

    public static C4619sw j(C4619sw c4619sw, C4619sw c4619sw2, boolean z) {
        String strE;
        String strS;
        if (c4619sw == null) {
            return c4619sw2;
        }
        String str = c4619sw2.l;
        int i = AbstractC5011xP.i(str);
        String str2 = c4619sw.i;
        if (Ug0.r(i, str2) == 1) {
            strS = Ug0.s(str2, i);
            strE = AbstractC5011xP.e(strS);
        } else {
            String strC = AbstractC5011xP.c(str2, str);
            strE = str;
            strS = strC;
        }
        C4531rw c4531rwA = c4619sw2.a();
        c4531rwA.f4954a = c4619sw.f5005a;
        c4531rwA.b = c4619sw.b;
        c4531rwA.c = c4619sw.c;
        c4531rwA.d = c4619sw.d;
        c4531rwA.e = c4619sw.e;
        c4531rwA.f = z ? c4619sw.f : -1;
        c4531rwA.g = z ? c4619sw.g : -1;
        c4531rwA.h = strS;
        if (i == 2) {
            c4531rwA.p = c4619sw.q;
            c4531rwA.q = c4619sw.r;
            c4531rwA.r = c4619sw.s;
        }
        if (strE != null) {
            c4531rwA.k = strE;
        }
        int i2 = c4619sw.y;
        if (i2 != -1 && i == 1) {
            c4531rwA.x = i2;
        }
        Metadata metadataC = c4619sw.j;
        if (metadataC != null) {
            Metadata metadata = c4619sw2.j;
            if (metadata != null) {
                metadataC = metadata.c(metadataC);
            }
            c4531rwA.i = metadataC;
        }
        return new C4619sw(c4531rwA);
    }

    public static int n(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void c(LI li, long j, long j2) {
        AbstractC2567Le abstractC2567Le = (AbstractC2567Le) li;
        this.u = null;
        C2458Gz c2458Gz = this.d;
        c2458Gz.getClass();
        if (abstractC2567Le instanceof C2354Cz) {
            C2354Cz c2354Cz = (C2354Cz) abstractC2567Le;
            c2458Gz.m = c2354Cz.j;
            Uri uri = c2354Cz.b.f5150a;
            byte[] bArr = c2354Cz.l;
            bArr.getClass();
            LinkedHashMap linkedHashMap = (LinkedHashMap) c2458Gz.j.b;
            uri.getClass();
        }
        long j3 = abstractC2567Le.f3364a;
        Uri uri2 = abstractC2567Le.i.c;
        FI fi = new FI();
        this.i.getClass();
        this.k.g(fi, abstractC2567Le.c, this.b, abstractC2567Le.d, abstractC2567Le.e, abstractC2567Le.f, abstractC2567Le.g, abstractC2567Le.h);
        if (this.D) {
            this.c.o(this);
        } else {
            continueLoading(this.P);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025c A[PHI: r1
  0x025c: PHI (r1v35 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fz) = 
  (r1v34 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fz)
  (r1v53 gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fz)
 binds: [B:91:0x0227, B:99:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x026f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0279  */
    /* JADX WARN: Code duplicated, block: B:112:0x0284  */
    /* JADX WARN: Code duplicated, block: B:114:0x0288  */
    /* JADX WARN: Code duplicated, block: B:115:0x028a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0297  */
    /* JADX WARN: Code duplicated, block: B:121:0x029b  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:130:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x02e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:152:0x0302  */
    /* JADX WARN: Code duplicated, block: B:153:0x0307  */
    /* JADX WARN: Code duplicated, block: B:155:0x0313  */
    /* JADX WARN: Code duplicated, block: B:156:0x0315  */
    /* JADX WARN: Code duplicated, block: B:159:0x032d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0332  */
    /* JADX WARN: Code duplicated, block: B:163:0x035a  */
    /* JADX WARN: Code duplicated, block: B:164:0x035d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0361  */
    /* JADX WARN: Code duplicated, block: B:167:0x036b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0370  */
    /* JADX WARN: Code duplicated, block: B:171:0x037b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0381 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x0383  */
    /* JADX WARN: Code duplicated, block: B:176:0x0385  */
    /* JADX WARN: Code duplicated, block: B:178:0x0388  */
    /* JADX WARN: Code duplicated, block: B:179:0x0392  */
    /* JADX WARN: Code duplicated, block: B:182:0x03af  */
    /* JADX WARN: Code duplicated, block: B:183:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:185:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:188:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:190:0x03d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:201:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:204:0x0402  */
    /* JADX WARN: Code duplicated, block: B:206:0x0405 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x0412  */
    /* JADX WARN: Code duplicated, block: B:214:0x041e  */
    /* JADX WARN: Code duplicated, block: B:217:0x0447  */
    /* JADX WARN: Code duplicated, block: B:221:0x0495  */
    /* JADX WARN: Code duplicated, block: B:223:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:225:0x04a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:226:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:229:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:231:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:233:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:235:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:239:0x0518  */
    /* JADX WARN: Code duplicated, block: B:241:0x0525  */
    /* JADX WARN: Code duplicated, block: B:248:0x0504 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x0528 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00df  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0195  */
    /* JADX WARN: Code duplicated, block: B:68:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:86:0x0201  */
    /* JADX WARN: Code duplicated, block: B:87:0x0211  */
    /* JADX WARN: Code duplicated, block: B:89:0x0217  */
    /* JADX WARN: Code duplicated, block: B:90:0x0226  */
    /* JADX WARN: Code duplicated, block: B:92:0x0229  */
    /* JADX WARN: Code duplicated, block: B:94:0x022d  */
    /* JADX WARN: Code duplicated, block: B:95:0x023e  */
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
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean continueLoading(long j) {
        long jMax;
        List listEmptyList;
        C4288p70 c4288p70;
        long jMax2;
        C2536Jz c2536Jz;
        int selectedIndexInTrackGroup;
        boolean z;
        Uri uri;
        C3730in c3730in;
        C4288p70 c4288p71;
        C2743Rz c2743RzA;
        boolean z2;
        long j2;
        long j3;
        long j4;
        long jLongValue;
        int iIntValue;
        int iIntValue2;
        C2743Rz c2743Rz;
        long j5;
        long j6;
        int i;
        AC ac;
        int size;
        AC ac2;
        C2665Oz c2665Oz;
        int i2;
        C2432Fz c2432Fz;
        AbstractC2691Pz abstractC2691Pz;
        C2665Oz c2665Oz2;
        String str;
        Uri uriX;
        C2354Cz c2354CzD;
        String str2;
        Uri uriX2;
        C2354Cz c2354CzD2;
        long j7;
        long j8;
        boolean z3;
        long j9;
        boolean z4;
        boolean z5;
        boolean z6;
        NN nn;
        byte[] bArr;
        byte[] bArr2;
        int i3;
        boolean z7;
        byte[] bArrD;
        InterfaceC4429ql interfaceC4429ql;
        InterfaceC4429ql m3;
        C2665Oz c2665Oz3;
        C4868vl c4868vl;
        InterfaceC4429ql interfaceC4429ql2;
        boolean z8;
        int i4;
        Uri uri2;
        C3241dC c3241dC;
        InterfaceC2562Kz interfaceC2562Kz;
        JT jt;
        NN nn2;
        Mc0 mc0;
        C4288p70 c4288p72;
        C4868vl c4868vl2;
        boolean z9;
        boolean z10;
        InterfaceC2562Kz interfaceC2562Kz2;
        boolean z11;
        byte[] bArrD2;
        InterfaceC4429ql m4;
        String str3;
        boolean z12;
        AbstractC2567Le abstractC2567Le;
        Uri uri3;
        C2536Jz c2536Jz2;
        Object[] objArrCopyOf;
        C3503gA[] c3503gAArr;
        int length;
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.T) {
            OI oi = this.j;
            if (!oi.d() && !oi.c()) {
                if (o()) {
                    listEmptyList = Collections.emptyList();
                    jMax = this.Q;
                    for (C3503gA c3503gA : this.v) {
                        c3503gA.t = this.Q;
                    }
                } else {
                    C2536Jz c2536JzM = m();
                    jMax = c2536JzM.H ? c2536JzM.h : Math.max(this.P, c2536JzM.g);
                    listEmptyList = this.o;
                }
                List list = listEmptyList;
                long j10 = jMax;
                C4288p70 c4288p73 = this.m;
                c4288p73.a();
                boolean z13 = this.D || !list.isEmpty();
                C2458Gz c2458Gz = this.d;
                c2458Gz.getClass();
                C2536Jz c2536Jz3 = list.isEmpty() ? null : (C2536Jz) FW.H(list);
                long jMax3 = j10 - j;
                int iA = c2536Jz3 == null ? -1 : c2458Gz.h.a(c2536Jz3.d);
                long j11 = c2458Gz.r;
                long j12 = j11 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? j11 - j : -9223372036854775807L;
                if (c2536Jz3 != null && !c2458Gz.p) {
                    c4288p70 = c4288p73;
                    long j13 = c2536Jz3.h - c2536Jz3.g;
                    jMax3 = Math.max(0L, jMax3 - j13);
                    if (j12 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        jMax2 = Math.max(0L, j12 - j13);
                    }
                    c2536Jz = c2536Jz3;
                    c2458Gz.q.c(j, jMax3, jMax2, list, c2458Gz.a(c2536Jz3, j10));
                    selectedIndexInTrackGroup = c2458Gz.q.getSelectedIndexInTrackGroup();
                    if (iA != selectedIndexInTrackGroup) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Uri[] uriArr = c2458Gz.e;
                    uri = uriArr[selectedIndexInTrackGroup];
                    c3730in = (C3730in) c2458Gz.g;
                    if (c3730in.f(uri)) {
                        c4288p71 = c4288p70;
                        c2743RzA = c3730in.a(uri, true);
                        c2743RzA.getClass();
                        c2458Gz.p = c2743RzA.c;
                        z2 = c2743RzA.o;
                        j2 = c2743RzA.h;
                        if (z2) {
                            j3 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                        } else {
                            j3 = (c2743RzA.u + j2) - c3730in.n;
                        }
                        c2458Gz.r = j3;
                        j4 = j2 - c3730in.n;
                        Pair pairC = c2458Gz.c(c2536Jz, z, c2743RzA, j4, j10);
                        jLongValue = ((Long) pairC.first).longValue();
                        iIntValue = ((Integer) pairC.second).intValue();
                        if (jLongValue < c2743RzA.k || c2536Jz == null || !z) {
                            iIntValue2 = iIntValue;
                            c2743Rz = c2743RzA;
                        } else {
                            uri = uriArr[iA];
                            C2743Rz c2743RzA2 = c3730in.a(uri, true);
                            c2743RzA2.getClass();
                            long j14 = c2743RzA2.h - c3730in.n;
                            Pair pairC2 = c2458Gz.c(c2536Jz, false, c2743RzA2, j14, j10);
                            jLongValue = ((Long) pairC2.first).longValue();
                            iIntValue2 = ((Integer) pairC2.second).intValue();
                            selectedIndexInTrackGroup = iA;
                            c2743Rz = c2743RzA2;
                            j4 = j14;
                        }
                        j5 = c2743Rz.k;
                        if (jLongValue < j5) {
                            j6 = j4;
                            i = (int) (jLongValue - j5);
                            ac = c2743Rz.r;
                            size = ac.size();
                            ac2 = c2743Rz.s;
                            if (i == size) {
                                if (iIntValue2 == -1) {
                                    iIntValue2 = 0;
                                }
                                if (iIntValue2 < ac2.size()) {
                                    c2432Fz = new C2432Fz((AbstractC2691Pz) ac2.get(iIntValue2), jLongValue, iIntValue2);
                                } else {
                                    c2432Fz = null;
                                }
                            } else {
                                c2665Oz = (C2665Oz) ac.get(i);
                                if (iIntValue2 == -1) {
                                    c2432Fz = new C2432Fz(c2665Oz, jLongValue, -1);
                                } else if (iIntValue2 < c2665Oz.m.size()) {
                                    c2432Fz = new C2432Fz((AbstractC2691Pz) c2665Oz.m.get(iIntValue2), jLongValue, iIntValue2);
                                } else {
                                    i2 = i + 1;
                                    if (i2 < ac.size()) {
                                        c2432Fz = new C2432Fz((AbstractC2691Pz) ac.get(i2), jLongValue + 1, -1);
                                    } else if (ac2.isEmpty()) {
                                        c2432Fz = null;
                                    } else {
                                        c2432Fz = new C2432Fz((AbstractC2691Pz) ac2.get(0), jLongValue + 1, 0);
                                    }
                                }
                            }
                            if (c2432Fz != null) {
                                c2458Gz.s = false;
                                c2458Gz.o = null;
                                abstractC2691Pz = c2432Fz.f3097a;
                                c2665Oz2 = abstractC2691Pz.b;
                                str = c2743Rz.f3949a;
                                if (c2665Oz2 != null || (str3 = c2665Oz2.g) == null) {
                                    uriX = null;
                                } else {
                                    uriX = FW.X(str, str3);
                                }
                                c2354CzD = c2458Gz.d(uriX, selectedIndexInTrackGroup);
                                c4288p71.d = c2354CzD;
                                if (c2354CzD == null) {
                                    str2 = abstractC2691Pz.g;
                                    if (str2 == null) {
                                        uriX2 = null;
                                    } else {
                                        uriX2 = FW.X(str, str2);
                                    }
                                    c2354CzD2 = c2458Gz.d(uriX2, selectedIndexInTrackGroup);
                                    c4288p71.d = c2354CzD2;
                                    if (c2354CzD2 == null) {
                                        j7 = abstractC2691Pz.e;
                                        if (c2536Jz == null) {
                                            AtomicInteger atomicInteger = C2536Jz.L;
                                        } else {
                                            if (uri.equals(c2536Jz.m) || !c2536Jz.H) {
                                                j8 = j6;
                                                long j15 = j8 + j7;
                                                z3 = abstractC2691Pz instanceof C2613Mz;
                                                boolean z14 = c2743Rz.c;
                                                if (z3 ? !z14 : !(((C2613Mz) abstractC2691Pz).l || (c2432Fz.c == 0 && z14))) {
                                                    j9 = j7;
                                                } else {
                                                    j9 = j7;
                                                    if (j15 >= c2536Jz.h) {
                                                        z4 = false;
                                                    }
                                                    z5 = z4;
                                                }
                                                z4 = true;
                                                z5 = z4;
                                            }
                                            z6 = c2432Fz.d;
                                            if (z5 || !z6) {
                                                C4619sw c4619sw = c2458Gz.f[selectedIndexInTrackGroup];
                                                int selectionReason = c2458Gz.q.getSelectionReason();
                                                Object selectionData = c2458Gz.q.getSelectionData();
                                                boolean z15 = c2458Gz.l;
                                                nn = c2458Gz.j;
                                                if (uriX2 == null) {
                                                    nn.getClass();
                                                    bArr = null;
                                                } else {
                                                    bArr = (byte[]) ((LinkedHashMap) nn.b).get(uriX2);
                                                }
                                                if (uriX == null) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = (byte[]) ((LinkedHashMap) nn.b).get(uriX);
                                                }
                                                AtomicInteger atomicInteger2 = C2536Jz.L;
                                                Map mapEmptyMap = Collections.emptyMap();
                                                Uri uriX3 = FW.X(str, abstractC2691Pz.f3582a);
                                                if (z6) {
                                                    i3 = 8;
                                                } else {
                                                    i3 = 0;
                                                }
                                                FW.u(uriX3, "The uri must be set.");
                                                C2432Fz c2432Fz2 = c2432Fz;
                                                C4868vl c4868vl3 = new C4868vl(uriX3, 0L, 1, null, mapEmptyMap, abstractC2691Pz.i, abstractC2691Pz.j, null, i3, null);
                                                if (bArr != null) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                if (z7) {
                                                    String str4 = abstractC2691Pz.h;
                                                    str4.getClass();
                                                    bArrD = C2536Jz.d(str4);
                                                } else {
                                                    bArrD = null;
                                                }
                                                interfaceC4429ql = c2458Gz.b;
                                                if (bArr != null) {
                                                    bArrD.getClass();
                                                    m3 = new M3(interfaceC4429ql, bArr, bArrD);
                                                } else {
                                                    m3 = interfaceC4429ql;
                                                }
                                                c2665Oz3 = abstractC2691Pz.b;
                                                if (c2665Oz3 != null) {
                                                    if (bArr2 != null) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        String str5 = c2665Oz3.h;
                                                        str5.getClass();
                                                        bArrD2 = C2536Jz.d(str5);
                                                    } else {
                                                        bArrD2 = null;
                                                    }
                                                    boolean z16 = z11;
                                                    c4868vl = new C4868vl(FW.X(str, c2665Oz3.f3582a), c2665Oz3.i, c2665Oz3.j);
                                                    if (bArr2 != null) {
                                                        bArrD2.getClass();
                                                        m4 = new M3(interfaceC4429ql, bArr2, bArrD2);
                                                    } else {
                                                        m4 = interfaceC4429ql;
                                                    }
                                                    z8 = z16;
                                                    interfaceC4429ql2 = m4;
                                                } else {
                                                    c4868vl = null;
                                                    interfaceC4429ql2 = null;
                                                    z8 = false;
                                                }
                                                long j16 = j8 + j9;
                                                long j17 = j16 + abstractC2691Pz.c;
                                                i4 = c2743Rz.j + abstractC2691Pz.d;
                                                if (c2536Jz != null) {
                                                    c4868vl2 = c2536Jz.q;
                                                    if (c4868vl != c4868vl2 || (c4868vl != null && c4868vl2 != null && c4868vl.f5150a.equals(c4868vl2.f5150a) && c4868vl.f == c4868vl2.f)) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    uri2 = uri;
                                                    if (uri2.equals(c2536Jz.m) || !c2536Jz.H) {
                                                        z10 = false;
                                                    } else {
                                                        z10 = true;
                                                    }
                                                    if (z9 || !z10 || c2536Jz.J || c2536Jz.l != i4) {
                                                        interfaceC2562Kz2 = null;
                                                    } else {
                                                        interfaceC2562Kz2 = c2536Jz.C;
                                                    }
                                                    c3241dC = c2536Jz.y;
                                                    jt = c2536Jz.z;
                                                    interfaceC2562Kz = interfaceC2562Kz2;
                                                } else {
                                                    uri2 = uri;
                                                    c3241dC = new C3241dC(null);
                                                    interfaceC2562Kz = null;
                                                    jt = new JT(10);
                                                }
                                                boolean z17 = !z6;
                                                nn2 = c2458Gz.d;
                                                mc0 = (Mc0) ((SparseArray) nn2.b).get(i4);
                                                if (mc0 == null) {
                                                    mc0 = new Mc0(9223372036854775806L);
                                                    ((SparseArray) nn2.b).put(i4, mc0);
                                                }
                                                C2536Jz c2536Jz4 = new C2536Jz(c2458Gz.f3147a, m3, c4868vl3, c4619sw, z7, interfaceC4429ql2, c4868vl, z8, uri2, c2458Gz.i, selectionReason, selectionData, j16, j17, c2432Fz2.b, c2432Fz2.c, z17, i4, abstractC2691Pz.k, z15, mc0, abstractC2691Pz.f, interfaceC2562Kz, c3241dC, jt, z5, c2458Gz.k);
                                                c4288p72 = c4288p71;
                                                c4288p72.d = c2536Jz4;
                                            } else {
                                                c4288p72 = c4288p71;
                                            }
                                        }
                                        j8 = j6;
                                        j9 = j7;
                                        z5 = false;
                                        z6 = c2432Fz.d;
                                        if (z5) {
                                            C4619sw c4619sw2 = c2458Gz.f[selectedIndexInTrackGroup];
                                            int selectionReason2 = c2458Gz.q.getSelectionReason();
                                            Object selectionData2 = c2458Gz.q.getSelectionData();
                                            boolean z18 = c2458Gz.l;
                                            nn = c2458Gz.j;
                                            if (uriX2 == null) {
                                                nn.getClass();
                                                bArr = null;
                                            } else {
                                                bArr = (byte[]) ((LinkedHashMap) nn.b).get(uriX2);
                                            }
                                            if (uriX == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = (byte[]) ((LinkedHashMap) nn.b).get(uriX);
                                            }
                                            AtomicInteger atomicInteger3 = C2536Jz.L;
                                            Map mapEmptyMap2 = Collections.emptyMap();
                                            Uri uriX4 = FW.X(str, abstractC2691Pz.f3582a);
                                            if (z6) {
                                                i3 = 8;
                                            } else {
                                                i3 = 0;
                                            }
                                            FW.u(uriX4, "The uri must be set.");
                                            C2432Fz c2432Fz3 = c2432Fz;
                                            C4868vl c4868vl4 = new C4868vl(uriX4, 0L, 1, null, mapEmptyMap2, abstractC2691Pz.i, abstractC2691Pz.j, null, i3, null);
                                            if (bArr != null) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            if (z7) {
                                                String str6 = abstractC2691Pz.h;
                                                str6.getClass();
                                                bArrD = C2536Jz.d(str6);
                                            } else {
                                                bArrD = null;
                                            }
                                            interfaceC4429ql = c2458Gz.b;
                                            if (bArr != null) {
                                                bArrD.getClass();
                                                m3 = new M3(interfaceC4429ql, bArr, bArrD);
                                            } else {
                                                m3 = interfaceC4429ql;
                                            }
                                            c2665Oz3 = abstractC2691Pz.b;
                                            if (c2665Oz3 != null) {
                                                if (bArr2 != null) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    String str7 = c2665Oz3.h;
                                                    str7.getClass();
                                                    bArrD2 = C2536Jz.d(str7);
                                                } else {
                                                    bArrD2 = null;
                                                }
                                                boolean z19 = z11;
                                                c4868vl = new C4868vl(FW.X(str, c2665Oz3.f3582a), c2665Oz3.i, c2665Oz3.j);
                                                if (bArr2 != null) {
                                                    bArrD2.getClass();
                                                    m4 = new M3(interfaceC4429ql, bArr2, bArrD2);
                                                } else {
                                                    m4 = interfaceC4429ql;
                                                }
                                                z8 = z19;
                                                interfaceC4429ql2 = m4;
                                            } else {
                                                c4868vl = null;
                                                interfaceC4429ql2 = null;
                                                z8 = false;
                                            }
                                            long j18 = j8 + j9;
                                            long j19 = j18 + abstractC2691Pz.c;
                                            i4 = c2743Rz.j + abstractC2691Pz.d;
                                            if (c2536Jz != null) {
                                                c4868vl2 = c2536Jz.q;
                                                if (c4868vl != c4868vl2) {
                                                    z9 = true;
                                                } else {
                                                    z9 = true;
                                                }
                                                uri2 = uri;
                                                if (uri2.equals(c2536Jz.m)) {
                                                    z10 = false;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z9) {
                                                    interfaceC2562Kz2 = null;
                                                } else {
                                                    interfaceC2562Kz2 = null;
                                                }
                                                c3241dC = c2536Jz.y;
                                                jt = c2536Jz.z;
                                                interfaceC2562Kz = interfaceC2562Kz2;
                                            } else {
                                                uri2 = uri;
                                                c3241dC = new C3241dC(null);
                                                interfaceC2562Kz = null;
                                                jt = new JT(10);
                                            }
                                            boolean z110 = !z6;
                                            nn2 = c2458Gz.d;
                                            mc0 = (Mc0) ((SparseArray) nn2.b).get(i4);
                                            if (mc0 == null) {
                                                mc0 = new Mc0(9223372036854775806L);
                                                ((SparseArray) nn2.b).put(i4, mc0);
                                            }
                                            C2536Jz c2536Jz5 = new C2536Jz(c2458Gz.f3147a, m3, c4868vl4, c4619sw2, z7, interfaceC4429ql2, c4868vl, z8, uri2, c2458Gz.i, selectionReason2, selectionData2, j18, j19, c2432Fz3.b, c2432Fz3.c, z110, i4, abstractC2691Pz.k, z18, mc0, abstractC2691Pz.f, interfaceC2562Kz, c3241dC, jt, z5, c2458Gz.k);
                                            c4288p72 = c4288p71;
                                            c4288p72.d = c2536Jz5;
                                        } else {
                                            C4619sw c4619sw3 = c2458Gz.f[selectedIndexInTrackGroup];
                                            int selectionReason3 = c2458Gz.q.getSelectionReason();
                                            Object selectionData3 = c2458Gz.q.getSelectionData();
                                            boolean z111 = c2458Gz.l;
                                            nn = c2458Gz.j;
                                            if (uriX2 == null) {
                                                nn.getClass();
                                                bArr = null;
                                            } else {
                                                bArr = (byte[]) ((LinkedHashMap) nn.b).get(uriX2);
                                            }
                                            if (uriX == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = (byte[]) ((LinkedHashMap) nn.b).get(uriX);
                                            }
                                            AtomicInteger atomicInteger4 = C2536Jz.L;
                                            Map mapEmptyMap3 = Collections.emptyMap();
                                            Uri uriX5 = FW.X(str, abstractC2691Pz.f3582a);
                                            if (z6) {
                                                i3 = 8;
                                            } else {
                                                i3 = 0;
                                            }
                                            FW.u(uriX5, "The uri must be set.");
                                            C2432Fz c2432Fz4 = c2432Fz;
                                            C4868vl c4868vl5 = new C4868vl(uriX5, 0L, 1, null, mapEmptyMap3, abstractC2691Pz.i, abstractC2691Pz.j, null, i3, null);
                                            if (bArr != null) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            if (z7) {
                                                String str8 = abstractC2691Pz.h;
                                                str8.getClass();
                                                bArrD = C2536Jz.d(str8);
                                            } else {
                                                bArrD = null;
                                            }
                                            interfaceC4429ql = c2458Gz.b;
                                            if (bArr != null) {
                                                bArrD.getClass();
                                                m3 = new M3(interfaceC4429ql, bArr, bArrD);
                                            } else {
                                                m3 = interfaceC4429ql;
                                            }
                                            c2665Oz3 = abstractC2691Pz.b;
                                            if (c2665Oz3 != null) {
                                                if (bArr2 != null) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    String str9 = c2665Oz3.h;
                                                    str9.getClass();
                                                    bArrD2 = C2536Jz.d(str9);
                                                } else {
                                                    bArrD2 = null;
                                                }
                                                boolean z112 = z11;
                                                c4868vl = new C4868vl(FW.X(str, c2665Oz3.f3582a), c2665Oz3.i, c2665Oz3.j);
                                                if (bArr2 != null) {
                                                    bArrD2.getClass();
                                                    m4 = new M3(interfaceC4429ql, bArr2, bArrD2);
                                                } else {
                                                    m4 = interfaceC4429ql;
                                                }
                                                z8 = z112;
                                                interfaceC4429ql2 = m4;
                                            } else {
                                                c4868vl = null;
                                                interfaceC4429ql2 = null;
                                                z8 = false;
                                            }
                                            long j110 = j8 + j9;
                                            long j111 = j110 + abstractC2691Pz.c;
                                            i4 = c2743Rz.j + abstractC2691Pz.d;
                                            if (c2536Jz != null) {
                                                c4868vl2 = c2536Jz.q;
                                                if (c4868vl != c4868vl2) {
                                                    z9 = true;
                                                } else {
                                                    z9 = true;
                                                }
                                                uri2 = uri;
                                                if (uri2.equals(c2536Jz.m)) {
                                                    z10 = false;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z9) {
                                                    interfaceC2562Kz2 = null;
                                                } else {
                                                    interfaceC2562Kz2 = null;
                                                }
                                                c3241dC = c2536Jz.y;
                                                jt = c2536Jz.z;
                                                interfaceC2562Kz = interfaceC2562Kz2;
                                            } else {
                                                uri2 = uri;
                                                c3241dC = new C3241dC(null);
                                                interfaceC2562Kz = null;
                                                jt = new JT(10);
                                            }
                                            boolean z113 = !z6;
                                            nn2 = c2458Gz.d;
                                            mc0 = (Mc0) ((SparseArray) nn2.b).get(i4);
                                            if (mc0 == null) {
                                                mc0 = new Mc0(9223372036854775806L);
                                                ((SparseArray) nn2.b).put(i4, mc0);
                                            }
                                            C2536Jz c2536Jz6 = new C2536Jz(c2458Gz.f3147a, m3, c4868vl5, c4619sw3, z7, interfaceC4429ql2, c4868vl, z8, uri2, c2458Gz.i, selectionReason3, selectionData3, j110, j111, c2432Fz4.b, c2432Fz4.c, z113, i4, abstractC2691Pz.k, z111, mc0, abstractC2691Pz.f, interfaceC2562Kz, c3241dC, jt, z5, c2458Gz.k);
                                            c4288p72 = c4288p71;
                                            c4288p72.d = c2536Jz6;
                                        }
                                    }
                                }
                            } else if (!c2743Rz.o) {
                                c4288p71.b = uri;
                                c2458Gz.s &= uri.equals(c2458Gz.o);
                                c2458Gz.o = uri;
                            } else if (!z13 || ac.isEmpty()) {
                                c4288p71.c = true;
                            } else {
                                c2432Fz = new C2432Fz((AbstractC2691Pz) FW.H(ac), (j5 + ((long) ac.size())) - 1, -1);
                                c2458Gz.s = false;
                                c2458Gz.o = null;
                                abstractC2691Pz = c2432Fz.f3097a;
                                c2665Oz2 = abstractC2691Pz.b;
                                str = c2743Rz.f3949a;
                                if (c2665Oz2 != null) {
                                    uriX = null;
                                } else {
                                    uriX = null;
                                }
                                c2354CzD = c2458Gz.d(uriX, selectedIndexInTrackGroup);
                                c4288p71.d = c2354CzD;
                                if (c2354CzD == null) {
                                    str2 = abstractC2691Pz.g;
                                    if (str2 == null) {
                                        uriX2 = null;
                                    } else {
                                        uriX2 = FW.X(str, str2);
                                    }
                                    c2354CzD2 = c2458Gz.d(uriX2, selectedIndexInTrackGroup);
                                    c4288p71.d = c2354CzD2;
                                    if (c2354CzD2 == null) {
                                        j7 = abstractC2691Pz.e;
                                        if (c2536Jz == null) {
                                            AtomicInteger atomicInteger5 = C2536Jz.L;
                                        } else {
                                            if (uri.equals(c2536Jz.m)) {
                                            }
                                            j8 = j6;
                                            long j112 = j8 + j7;
                                            z3 = abstractC2691Pz instanceof C2613Mz;
                                            boolean z114 = c2743Rz.c;
                                            if (z3) {
                                                j9 = j7;
                                                z4 = true;
                                                z5 = z4;
                                                z6 = c2432Fz.d;
                                                if (z5) {
                                                    C4619sw c4619sw4 = c2458Gz.f[selectedIndexInTrackGroup];
                                                    int selectionReason4 = c2458Gz.q.getSelectionReason();
                                                    Object selectionData4 = c2458Gz.q.getSelectionData();
                                                    boolean z115 = c2458Gz.l;
                                                    nn = c2458Gz.j;
                                                    if (uriX2 == null) {
                                                        nn.getClass();
                                                        bArr = null;
                                                    } else {
                                                        bArr = (byte[]) ((LinkedHashMap) nn.b).get(uriX2);
                                                    }
                                                    if (uriX == null) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = (byte[]) ((LinkedHashMap) nn.b).get(uriX);
                                                    }
                                                    AtomicInteger atomicInteger6 = C2536Jz.L;
                                                    Map mapEmptyMap4 = Collections.emptyMap();
                                                    Uri uriX6 = FW.X(str, abstractC2691Pz.f3582a);
                                                    if (z6) {
                                                        i3 = 8;
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                    FW.u(uriX6, "The uri must be set.");
                                                    C2432Fz c2432Fz5 = c2432Fz;
                                                    C4868vl c4868vl6 = new C4868vl(uriX6, 0L, 1, null, mapEmptyMap4, abstractC2691Pz.i, abstractC2691Pz.j, null, i3, null);
                                                    if (bArr != null) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (z7) {
                                                        String str10 = abstractC2691Pz.h;
                                                        str10.getClass();
                                                        bArrD = C2536Jz.d(str10);
                                                    } else {
                                                        bArrD = null;
                                                    }
                                                    interfaceC4429ql = c2458Gz.b;
                                                    if (bArr != null) {
                                                        bArrD.getClass();
                                                        m3 = new M3(interfaceC4429ql, bArr, bArrD);
                                                    } else {
                                                        m3 = interfaceC4429ql;
                                                    }
                                                    c2665Oz3 = abstractC2691Pz.b;
                                                    if (c2665Oz3 != null) {
                                                        if (bArr2 != null) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if (z11) {
                                                            String str11 = c2665Oz3.h;
                                                            str11.getClass();
                                                            bArrD2 = C2536Jz.d(str11);
                                                        } else {
                                                            bArrD2 = null;
                                                        }
                                                        boolean z116 = z11;
                                                        c4868vl = new C4868vl(FW.X(str, c2665Oz3.f3582a), c2665Oz3.i, c2665Oz3.j);
                                                        if (bArr2 != null) {
                                                            bArrD2.getClass();
                                                            m4 = new M3(interfaceC4429ql, bArr2, bArrD2);
                                                        } else {
                                                            m4 = interfaceC4429ql;
                                                        }
                                                        z8 = z116;
                                                        interfaceC4429ql2 = m4;
                                                    } else {
                                                        c4868vl = null;
                                                        interfaceC4429ql2 = null;
                                                        z8 = false;
                                                    }
                                                    long j113 = j8 + j9;
                                                    long j114 = j113 + abstractC2691Pz.c;
                                                    i4 = c2743Rz.j + abstractC2691Pz.d;
                                                    if (c2536Jz != null) {
                                                        c4868vl2 = c2536Jz.q;
                                                        if (c4868vl != c4868vl2) {
                                                            z9 = true;
                                                        } else {
                                                            z9 = true;
                                                        }
                                                        uri2 = uri;
                                                        if (uri2.equals(c2536Jz.m)) {
                                                            z10 = false;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        if (z9) {
                                                            interfaceC2562Kz2 = null;
                                                        } else {
                                                            interfaceC2562Kz2 = null;
                                                        }
                                                        c3241dC = c2536Jz.y;
                                                        jt = c2536Jz.z;
                                                        interfaceC2562Kz = interfaceC2562Kz2;
                                                    } else {
                                                        uri2 = uri;
                                                        c3241dC = new C3241dC(null);
                                                        interfaceC2562Kz = null;
                                                        jt = new JT(10);
                                                    }
                                                    boolean z117 = !z6;
                                                    nn2 = c2458Gz.d;
                                                    mc0 = (Mc0) ((SparseArray) nn2.b).get(i4);
                                                    if (mc0 == null) {
                                                        mc0 = new Mc0(9223372036854775806L);
                                                        ((SparseArray) nn2.b).put(i4, mc0);
                                                    }
                                                    C2536Jz c2536Jz7 = new C2536Jz(c2458Gz.f3147a, m3, c4868vl6, c4619sw4, z7, interfaceC4429ql2, c4868vl, z8, uri2, c2458Gz.i, selectionReason4, selectionData4, j113, j114, c2432Fz5.b, c2432Fz5.c, z117, i4, abstractC2691Pz.k, z115, mc0, abstractC2691Pz.f, interfaceC2562Kz, c3241dC, jt, z5, c2458Gz.k);
                                                    c4288p72 = c4288p71;
                                                    c4288p72.d = c2536Jz7;
                                                } else {
                                                    C4619sw c4619sw5 = c2458Gz.f[selectedIndexInTrackGroup];
                                                    int selectionReason5 = c2458Gz.q.getSelectionReason();
                                                    Object selectionData5 = c2458Gz.q.getSelectionData();
                                                    boolean z118 = c2458Gz.l;
                                                    nn = c2458Gz.j;
                                                    if (uriX2 == null) {
                                                        nn.getClass();
                                                        bArr = null;
                                                    } else {
                                                        bArr = (byte[]) ((LinkedHashMap) nn.b).get(uriX2);
                                                    }
                                                    if (uriX == null) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = (byte[]) ((LinkedHashMap) nn.b).get(uriX);
                                                    }
                                                    AtomicInteger atomicInteger7 = C2536Jz.L;
                                                    Map mapEmptyMap5 = Collections.emptyMap();
                                                    Uri uriX7 = FW.X(str, abstractC2691Pz.f3582a);
                                                    if (z6) {
                                                        i3 = 8;
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                    FW.u(uriX7, "The uri must be set.");
                                                    C2432Fz c2432Fz6 = c2432Fz;
                                                    C4868vl c4868vl7 = new C4868vl(uriX7, 0L, 1, null, mapEmptyMap5, abstractC2691Pz.i, abstractC2691Pz.j, null, i3, null);
                                                    if (bArr != null) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (z7) {
                                                        String str12 = abstractC2691Pz.h;
                                                        str12.getClass();
                                                        bArrD = C2536Jz.d(str12);
                                                    } else {
                                                        bArrD = null;
                                                    }
                                                    interfaceC4429ql = c2458Gz.b;
                                                    if (bArr != null) {
                                                        bArrD.getClass();
                                                        m3 = new M3(interfaceC4429ql, bArr, bArrD);
                                                    } else {
                                                        m3 = interfaceC4429ql;
                                                    }
                                                    c2665Oz3 = abstractC2691Pz.b;
                                                    if (c2665Oz3 != null) {
                                                        if (bArr2 != null) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if (z11) {
                                                            String str13 = c2665Oz3.h;
                                                            str13.getClass();
                                                            bArrD2 = C2536Jz.d(str13);
                                                        } else {
                                                            bArrD2 = null;
                                                        }
                                                        boolean z119 = z11;
                                                        c4868vl = new C4868vl(FW.X(str, c2665Oz3.f3582a), c2665Oz3.i, c2665Oz3.j);
                                                        if (bArr2 != null) {
                                                            bArrD2.getClass();
                                                            m4 = new M3(interfaceC4429ql, bArr2, bArrD2);
                                                        } else {
                                                            m4 = interfaceC4429ql;
                                                        }
                                                        z8 = z119;
                                                        interfaceC4429ql2 = m4;
                                                    } else {
                                                        c4868vl = null;
                                                        interfaceC4429ql2 = null;
                                                        z8 = false;
                                                    }
                                                    long j115 = j8 + j9;
                                                    long j116 = j115 + abstractC2691Pz.c;
                                                    i4 = c2743Rz.j + abstractC2691Pz.d;
                                                    if (c2536Jz != null) {
                                                        c4868vl2 = c2536Jz.q;
                                                        if (c4868vl != c4868vl2) {
                                                            z9 = true;
                                                        } else {
                                                            z9 = true;
                                                        }
                                                        uri2 = uri;
                                                        if (uri2.equals(c2536Jz.m)) {
                                                            z10 = false;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        if (z9) {
                                                            interfaceC2562Kz2 = null;
                                                        } else {
                                                            interfaceC2562Kz2 = null;
                                                        }
                                                        c3241dC = c2536Jz.y;
                                                        jt = c2536Jz.z;
                                                        interfaceC2562Kz = interfaceC2562Kz2;
                                                    } else {
                                                        uri2 = uri;
                                                        c3241dC = new C3241dC(null);
                                                        interfaceC2562Kz = null;
                                                        jt = new JT(10);
                                                    }
                                                    boolean z1110 = !z6;
                                                    nn2 = c2458Gz.d;
                                                    mc0 = (Mc0) ((SparseArray) nn2.b).get(i4);
                                                    if (mc0 == null) {
                                                        mc0 = new Mc0(9223372036854775806L);
                                                        ((SparseArray) nn2.b).put(i4, mc0);
                                                    }
                                                    C2536Jz c2536Jz8 = new C2536Jz(c2458Gz.f3147a, m3, c4868vl7, c4619sw5, z7, interfaceC4429ql2, c4868vl, z8, uri2, c2458Gz.i, selectionReason5, selectionData5, j115, j116, c2432Fz6.b, c2432Fz6.c, z1110, i4, abstractC2691Pz.k, z118, mc0, abstractC2691Pz.f, interfaceC2562Kz, c3241dC, jt, z5, c2458Gz.k);
                                                    c4288p72 = c4288p71;
                                                    c4288p72.d = c2536Jz8;
                                                }
                                            } else {
                                                j9 = j7;
                                                z4 = true;
                                                z5 = z4;
                                                z6 = c2432Fz.d;
                                                if (z5) {
                                                    C4619sw c4619sw6 = c2458Gz.f[selectedIndexInTrackGroup];
                                                    int selectionReason6 = c2458Gz.q.getSelectionReason();
                                                    Object selectionData6 = c2458Gz.q.getSelectionData();
                                                    boolean z1111 = c2458Gz.l;
                                                    nn = c2458Gz.j;
                                                    if (uriX2 == null) {
                                                        nn.getClass();
                                                        bArr = null;
                                                    } else {
                                                        bArr = (byte[]) ((LinkedHashMap) nn.b).get(uriX2);
                                                    }
                                                    if (uriX == null) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = (byte[]) ((LinkedHashMap) nn.b).get(uriX);
                                                    }
                                                    AtomicInteger atomicInteger8 = C2536Jz.L;
                                                    Map mapEmptyMap6 = Collections.emptyMap();
                                                    Uri uriX8 = FW.X(str, abstractC2691Pz.f3582a);
                                                    if (z6) {
                                                        i3 = 8;
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                    FW.u(uriX8, "The uri must be set.");
                                                    C2432Fz c2432Fz7 = c2432Fz;
                                                    C4868vl c4868vl8 = new C4868vl(uriX8, 0L, 1, null, mapEmptyMap6, abstractC2691Pz.i, abstractC2691Pz.j, null, i3, null);
                                                    if (bArr != null) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (z7) {
                                                        String str14 = abstractC2691Pz.h;
                                                        str14.getClass();
                                                        bArrD = C2536Jz.d(str14);
                                                    } else {
                                                        bArrD = null;
                                                    }
                                                    interfaceC4429ql = c2458Gz.b;
                                                    if (bArr != null) {
                                                        bArrD.getClass();
                                                        m3 = new M3(interfaceC4429ql, bArr, bArrD);
                                                    } else {
                                                        m3 = interfaceC4429ql;
                                                    }
                                                    c2665Oz3 = abstractC2691Pz.b;
                                                    if (c2665Oz3 != null) {
                                                        if (bArr2 != null) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if (z11) {
                                                            String str15 = c2665Oz3.h;
                                                            str15.getClass();
                                                            bArrD2 = C2536Jz.d(str15);
                                                        } else {
                                                            bArrD2 = null;
                                                        }
                                                        boolean z1112 = z11;
                                                        c4868vl = new C4868vl(FW.X(str, c2665Oz3.f3582a), c2665Oz3.i, c2665Oz3.j);
                                                        if (bArr2 != null) {
                                                            bArrD2.getClass();
                                                            m4 = new M3(interfaceC4429ql, bArr2, bArrD2);
                                                        } else {
                                                            m4 = interfaceC4429ql;
                                                        }
                                                        z8 = z1112;
                                                        interfaceC4429ql2 = m4;
                                                    } else {
                                                        c4868vl = null;
                                                        interfaceC4429ql2 = null;
                                                        z8 = false;
                                                    }
                                                    long j117 = j8 + j9;
                                                    long j118 = j117 + abstractC2691Pz.c;
                                                    i4 = c2743Rz.j + abstractC2691Pz.d;
                                                    if (c2536Jz != null) {
                                                        c4868vl2 = c2536Jz.q;
                                                        if (c4868vl != c4868vl2) {
                                                            z9 = true;
                                                        } else {
                                                            z9 = true;
                                                        }
                                                        uri2 = uri;
                                                        if (uri2.equals(c2536Jz.m)) {
                                                            z10 = false;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        if (z9) {
                                                            interfaceC2562Kz2 = null;
                                                        } else {
                                                            interfaceC2562Kz2 = null;
                                                        }
                                                        c3241dC = c2536Jz.y;
                                                        jt = c2536Jz.z;
                                                        interfaceC2562Kz = interfaceC2562Kz2;
                                                    } else {
                                                        uri2 = uri;
                                                        c3241dC = new C3241dC(null);
                                                        interfaceC2562Kz = null;
                                                        jt = new JT(10);
                                                    }
                                                    boolean z1113 = !z6;
                                                    nn2 = c2458Gz.d;
                                                    mc0 = (Mc0) ((SparseArray) nn2.b).get(i4);
                                                    if (mc0 == null) {
                                                        mc0 = new Mc0(9223372036854775806L);
                                                        ((SparseArray) nn2.b).put(i4, mc0);
                                                    }
                                                    C2536Jz c2536Jz9 = new C2536Jz(c2458Gz.f3147a, m3, c4868vl8, c4619sw6, z7, interfaceC4429ql2, c4868vl, z8, uri2, c2458Gz.i, selectionReason6, selectionData6, j117, j118, c2432Fz7.b, c2432Fz7.c, z1113, i4, abstractC2691Pz.k, z1111, mc0, abstractC2691Pz.f, interfaceC2562Kz, c3241dC, jt, z5, c2458Gz.k);
                                                    c4288p72 = c4288p71;
                                                    c4288p72.d = c2536Jz9;
                                                } else {
                                                    C4619sw c4619sw7 = c2458Gz.f[selectedIndexInTrackGroup];
                                                    int selectionReason7 = c2458Gz.q.getSelectionReason();
                                                    Object selectionData7 = c2458Gz.q.getSelectionData();
                                                    boolean z1114 = c2458Gz.l;
                                                    nn = c2458Gz.j;
                                                    if (uriX2 == null) {
                                                        nn.getClass();
                                                        bArr = null;
                                                    } else {
                                                        bArr = (byte[]) ((LinkedHashMap) nn.b).get(uriX2);
                                                    }
                                                    if (uriX == null) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = (byte[]) ((LinkedHashMap) nn.b).get(uriX);
                                                    }
                                                    AtomicInteger atomicInteger9 = C2536Jz.L;
                                                    Map mapEmptyMap7 = Collections.emptyMap();
                                                    Uri uriX9 = FW.X(str, abstractC2691Pz.f3582a);
                                                    if (z6) {
                                                        i3 = 8;
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                    FW.u(uriX9, "The uri must be set.");
                                                    C2432Fz c2432Fz8 = c2432Fz;
                                                    C4868vl c4868vl9 = new C4868vl(uriX9, 0L, 1, null, mapEmptyMap7, abstractC2691Pz.i, abstractC2691Pz.j, null, i3, null);
                                                    if (bArr != null) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (z7) {
                                                        String str16 = abstractC2691Pz.h;
                                                        str16.getClass();
                                                        bArrD = C2536Jz.d(str16);
                                                    } else {
                                                        bArrD = null;
                                                    }
                                                    interfaceC4429ql = c2458Gz.b;
                                                    if (bArr != null) {
                                                        bArrD.getClass();
                                                        m3 = new M3(interfaceC4429ql, bArr, bArrD);
                                                    } else {
                                                        m3 = interfaceC4429ql;
                                                    }
                                                    c2665Oz3 = abstractC2691Pz.b;
                                                    if (c2665Oz3 != null) {
                                                        if (bArr2 != null) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if (z11) {
                                                            String str17 = c2665Oz3.h;
                                                            str17.getClass();
                                                            bArrD2 = C2536Jz.d(str17);
                                                        } else {
                                                            bArrD2 = null;
                                                        }
                                                        boolean z1115 = z11;
                                                        c4868vl = new C4868vl(FW.X(str, c2665Oz3.f3582a), c2665Oz3.i, c2665Oz3.j);
                                                        if (bArr2 != null) {
                                                            bArrD2.getClass();
                                                            m4 = new M3(interfaceC4429ql, bArr2, bArrD2);
                                                        } else {
                                                            m4 = interfaceC4429ql;
                                                        }
                                                        z8 = z1115;
                                                        interfaceC4429ql2 = m4;
                                                    } else {
                                                        c4868vl = null;
                                                        interfaceC4429ql2 = null;
                                                        z8 = false;
                                                    }
                                                    long j119 = j8 + j9;
                                                    long j1110 = j119 + abstractC2691Pz.c;
                                                    i4 = c2743Rz.j + abstractC2691Pz.d;
                                                    if (c2536Jz != null) {
                                                        c4868vl2 = c2536Jz.q;
                                                        if (c4868vl != c4868vl2) {
                                                            z9 = true;
                                                        } else {
                                                            z9 = true;
                                                        }
                                                        uri2 = uri;
                                                        if (uri2.equals(c2536Jz.m)) {
                                                            z10 = false;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        if (z9) {
                                                            interfaceC2562Kz2 = null;
                                                        } else {
                                                            interfaceC2562Kz2 = null;
                                                        }
                                                        c3241dC = c2536Jz.y;
                                                        jt = c2536Jz.z;
                                                        interfaceC2562Kz = interfaceC2562Kz2;
                                                    } else {
                                                        uri2 = uri;
                                                        c3241dC = new C3241dC(null);
                                                        interfaceC2562Kz = null;
                                                        jt = new JT(10);
                                                    }
                                                    boolean z1116 = !z6;
                                                    nn2 = c2458Gz.d;
                                                    mc0 = (Mc0) ((SparseArray) nn2.b).get(i4);
                                                    if (mc0 == null) {
                                                        mc0 = new Mc0(9223372036854775806L);
                                                        ((SparseArray) nn2.b).put(i4, mc0);
                                                    }
                                                    C2536Jz c2536Jz10 = new C2536Jz(c2458Gz.f3147a, m3, c4868vl9, c4619sw7, z7, interfaceC4429ql2, c4868vl, z8, uri2, c2458Gz.i, selectionReason7, selectionData7, j119, j1110, c2432Fz8.b, c2432Fz8.c, z1116, i4, abstractC2691Pz.k, z1114, mc0, abstractC2691Pz.f, interfaceC2562Kz, c3241dC, jt, z5, c2458Gz.k);
                                                    c4288p72 = c4288p71;
                                                    c4288p72.d = c2536Jz10;
                                                }
                                            }
                                        }
                                        j8 = j6;
                                        j9 = j7;
                                        z5 = false;
                                        z6 = c2432Fz.d;
                                        if (z5) {
                                            C4619sw c4619sw8 = c2458Gz.f[selectedIndexInTrackGroup];
                                            int selectionReason8 = c2458Gz.q.getSelectionReason();
                                            Object selectionData8 = c2458Gz.q.getSelectionData();
                                            boolean z1117 = c2458Gz.l;
                                            nn = c2458Gz.j;
                                            if (uriX2 == null) {
                                                nn.getClass();
                                                bArr = null;
                                            } else {
                                                bArr = (byte[]) ((LinkedHashMap) nn.b).get(uriX2);
                                            }
                                            if (uriX == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = (byte[]) ((LinkedHashMap) nn.b).get(uriX);
                                            }
                                            AtomicInteger atomicInteger10 = C2536Jz.L;
                                            Map mapEmptyMap8 = Collections.emptyMap();
                                            Uri uriX10 = FW.X(str, abstractC2691Pz.f3582a);
                                            if (z6) {
                                                i3 = 8;
                                            } else {
                                                i3 = 0;
                                            }
                                            FW.u(uriX10, "The uri must be set.");
                                            C2432Fz c2432Fz9 = c2432Fz;
                                            C4868vl c4868vl10 = new C4868vl(uriX10, 0L, 1, null, mapEmptyMap8, abstractC2691Pz.i, abstractC2691Pz.j, null, i3, null);
                                            if (bArr != null) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            if (z7) {
                                                String str18 = abstractC2691Pz.h;
                                                str18.getClass();
                                                bArrD = C2536Jz.d(str18);
                                            } else {
                                                bArrD = null;
                                            }
                                            interfaceC4429ql = c2458Gz.b;
                                            if (bArr != null) {
                                                bArrD.getClass();
                                                m3 = new M3(interfaceC4429ql, bArr, bArrD);
                                            } else {
                                                m3 = interfaceC4429ql;
                                            }
                                            c2665Oz3 = abstractC2691Pz.b;
                                            if (c2665Oz3 != null) {
                                                if (bArr2 != null) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    String str19 = c2665Oz3.h;
                                                    str19.getClass();
                                                    bArrD2 = C2536Jz.d(str19);
                                                } else {
                                                    bArrD2 = null;
                                                }
                                                boolean z1118 = z11;
                                                c4868vl = new C4868vl(FW.X(str, c2665Oz3.f3582a), c2665Oz3.i, c2665Oz3.j);
                                                if (bArr2 != null) {
                                                    bArrD2.getClass();
                                                    m4 = new M3(interfaceC4429ql, bArr2, bArrD2);
                                                } else {
                                                    m4 = interfaceC4429ql;
                                                }
                                                z8 = z1118;
                                                interfaceC4429ql2 = m4;
                                            } else {
                                                c4868vl = null;
                                                interfaceC4429ql2 = null;
                                                z8 = false;
                                            }
                                            long j1111 = j8 + j9;
                                            long j1112 = j1111 + abstractC2691Pz.c;
                                            i4 = c2743Rz.j + abstractC2691Pz.d;
                                            if (c2536Jz != null) {
                                                c4868vl2 = c2536Jz.q;
                                                if (c4868vl != c4868vl2) {
                                                    z9 = true;
                                                } else {
                                                    z9 = true;
                                                }
                                                uri2 = uri;
                                                if (uri2.equals(c2536Jz.m)) {
                                                    z10 = false;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z9) {
                                                    interfaceC2562Kz2 = null;
                                                } else {
                                                    interfaceC2562Kz2 = null;
                                                }
                                                c3241dC = c2536Jz.y;
                                                jt = c2536Jz.z;
                                                interfaceC2562Kz = interfaceC2562Kz2;
                                            } else {
                                                uri2 = uri;
                                                c3241dC = new C3241dC(null);
                                                interfaceC2562Kz = null;
                                                jt = new JT(10);
                                            }
                                            boolean z1119 = !z6;
                                            nn2 = c2458Gz.d;
                                            mc0 = (Mc0) ((SparseArray) nn2.b).get(i4);
                                            if (mc0 == null) {
                                                mc0 = new Mc0(9223372036854775806L);
                                                ((SparseArray) nn2.b).put(i4, mc0);
                                            }
                                            C2536Jz c2536Jz11 = new C2536Jz(c2458Gz.f3147a, m3, c4868vl10, c4619sw8, z7, interfaceC4429ql2, c4868vl, z8, uri2, c2458Gz.i, selectionReason8, selectionData8, j1111, j1112, c2432Fz9.b, c2432Fz9.c, z1119, i4, abstractC2691Pz.k, z1117, mc0, abstractC2691Pz.f, interfaceC2562Kz, c3241dC, jt, z5, c2458Gz.k);
                                            c4288p72 = c4288p71;
                                            c4288p72.d = c2536Jz11;
                                        } else {
                                            C4619sw c4619sw9 = c2458Gz.f[selectedIndexInTrackGroup];
                                            int selectionReason9 = c2458Gz.q.getSelectionReason();
                                            Object selectionData9 = c2458Gz.q.getSelectionData();
                                            boolean z11110 = c2458Gz.l;
                                            nn = c2458Gz.j;
                                            if (uriX2 == null) {
                                                nn.getClass();
                                                bArr = null;
                                            } else {
                                                bArr = (byte[]) ((LinkedHashMap) nn.b).get(uriX2);
                                            }
                                            if (uriX == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = (byte[]) ((LinkedHashMap) nn.b).get(uriX);
                                            }
                                            AtomicInteger atomicInteger11 = C2536Jz.L;
                                            Map mapEmptyMap9 = Collections.emptyMap();
                                            Uri uriX11 = FW.X(str, abstractC2691Pz.f3582a);
                                            if (z6) {
                                                i3 = 8;
                                            } else {
                                                i3 = 0;
                                            }
                                            FW.u(uriX11, "The uri must be set.");
                                            C2432Fz c2432Fz10 = c2432Fz;
                                            C4868vl c4868vl11 = new C4868vl(uriX11, 0L, 1, null, mapEmptyMap9, abstractC2691Pz.i, abstractC2691Pz.j, null, i3, null);
                                            if (bArr != null) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            if (z7) {
                                                String str110 = abstractC2691Pz.h;
                                                str110.getClass();
                                                bArrD = C2536Jz.d(str110);
                                            } else {
                                                bArrD = null;
                                            }
                                            interfaceC4429ql = c2458Gz.b;
                                            if (bArr != null) {
                                                bArrD.getClass();
                                                m3 = new M3(interfaceC4429ql, bArr, bArrD);
                                            } else {
                                                m3 = interfaceC4429ql;
                                            }
                                            c2665Oz3 = abstractC2691Pz.b;
                                            if (c2665Oz3 != null) {
                                                if (bArr2 != null) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    String str111 = c2665Oz3.h;
                                                    str111.getClass();
                                                    bArrD2 = C2536Jz.d(str111);
                                                } else {
                                                    bArrD2 = null;
                                                }
                                                boolean z11111 = z11;
                                                c4868vl = new C4868vl(FW.X(str, c2665Oz3.f3582a), c2665Oz3.i, c2665Oz3.j);
                                                if (bArr2 != null) {
                                                    bArrD2.getClass();
                                                    m4 = new M3(interfaceC4429ql, bArr2, bArrD2);
                                                } else {
                                                    m4 = interfaceC4429ql;
                                                }
                                                z8 = z11111;
                                                interfaceC4429ql2 = m4;
                                            } else {
                                                c4868vl = null;
                                                interfaceC4429ql2 = null;
                                                z8 = false;
                                            }
                                            long j1113 = j8 + j9;
                                            long j1114 = j1113 + abstractC2691Pz.c;
                                            i4 = c2743Rz.j + abstractC2691Pz.d;
                                            if (c2536Jz != null) {
                                                c4868vl2 = c2536Jz.q;
                                                if (c4868vl != c4868vl2) {
                                                    z9 = true;
                                                } else {
                                                    z9 = true;
                                                }
                                                uri2 = uri;
                                                if (uri2.equals(c2536Jz.m)) {
                                                    z10 = false;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z9) {
                                                    interfaceC2562Kz2 = null;
                                                } else {
                                                    interfaceC2562Kz2 = null;
                                                }
                                                c3241dC = c2536Jz.y;
                                                jt = c2536Jz.z;
                                                interfaceC2562Kz = interfaceC2562Kz2;
                                            } else {
                                                uri2 = uri;
                                                c3241dC = new C3241dC(null);
                                                interfaceC2562Kz = null;
                                                jt = new JT(10);
                                            }
                                            boolean z11112 = !z6;
                                            nn2 = c2458Gz.d;
                                            mc0 = (Mc0) ((SparseArray) nn2.b).get(i4);
                                            if (mc0 == null) {
                                                mc0 = new Mc0(9223372036854775806L);
                                                ((SparseArray) nn2.b).put(i4, mc0);
                                            }
                                            C2536Jz c2536Jz12 = new C2536Jz(c2458Gz.f3147a, m3, c4868vl11, c4619sw9, z7, interfaceC4429ql2, c4868vl, z8, uri2, c2458Gz.i, selectionReason9, selectionData9, j1113, j1114, c2432Fz10.b, c2432Fz10.c, z11112, i4, abstractC2691Pz.k, z11110, mc0, abstractC2691Pz.f, interfaceC2562Kz, c3241dC, jt, z5, c2458Gz.k);
                                            c4288p72 = c4288p71;
                                            c4288p72.d = c2536Jz12;
                                        }
                                    }
                                }
                            }
                            z12 = c4288p72.c;
                            abstractC2567Le = (AbstractC2567Le) c4288p72.d;
                            uri3 = (Uri) c4288p72.b;
                            if (z12) {
                                this.Q = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                this.T = true;
                                return true;
                            }
                            if (abstractC2567Le == null) {
                                if (uri3 != null) {
                                    return false;
                                }
                                C3643hn c3643hn = (C3643hn) ((C3730in) ((C2587Lz) this.c.b).b).d.get(uri3);
                                c3643hn.f(c3643hn.f4470a);
                                return false;
                            }
                            if (abstractC2567Le instanceof C2536Jz) {
                                c2536Jz2 = (C2536Jz) abstractC2567Le;
                                this.X = c2536Jz2;
                                this.F = c2536Jz2.d;
                                this.Q = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                this.n.add(c2536Jz2);
                                C5086yC c5086yC = AC.b;
                                FW.n(4, "initialCapacity");
                                objArrCopyOf = new Object[4];
                                c3503gAArr = this.v;
                                length = c3503gAArr.length;
                                i5 = 0;
                                i6 = 0;
                                while (i5 < length) {
                                    C3503gA c3503gA2 = c3503gAArr[i5];
                                    Integer numValueOf = Integer.valueOf(c3503gA2.q + c3503gA2.p);
                                    i8 = i6 + 1;
                                    if (objArrCopyOf.length < i8) {
                                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC2995aW.y(objArrCopyOf.length, i8));
                                    }
                                    objArrCopyOf[i6] = numValueOf;
                                    i5++;
                                    i6 = i8;
                                }
                                C3965lY c3965lYH = AC.h(i6, objArrCopyOf);
                                c2536Jz2.D = this;
                                c2536Jz2.I = c3965lYH;
                                for (C3503gA c3503gA3 : this.v) {
                                    c3503gA3.getClass();
                                    c3503gA3.C = c2536Jz2.k;
                                    if (c2536Jz2.n) {
                                        c3503gA3.G = true;
                                    }
                                }
                            }
                            this.u = abstractC2567Le;
                            oi.f(abstractC2567Le, this, this.i.A(abstractC2567Le.c));
                            this.k.l(new FI(abstractC2567Le.b), abstractC2567Le.c, this.b, abstractC2567Le.d, abstractC2567Le.e, abstractC2567Le.f, abstractC2567Le.g, abstractC2567Le.h);
                            return true;
                        }
                        c2458Gz.n = new C3529ga();
                    } else {
                        c4288p71 = c4288p70;
                        c4288p71.b = uri;
                        c2458Gz.s &= uri.equals(c2458Gz.o);
                        c2458Gz.o = uri;
                    }
                    c4288p72 = c4288p71;
                    z12 = c4288p72.c;
                    abstractC2567Le = (AbstractC2567Le) c4288p72.d;
                    uri3 = (Uri) c4288p72.b;
                    if (z12) {
                        this.Q = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                        this.T = true;
                        return true;
                    }
                    if (abstractC2567Le == null) {
                        if (uri3 != null) {
                            return false;
                        }
                        C3643hn c3643hn2 = (C3643hn) ((C3730in) ((C2587Lz) this.c.b).b).d.get(uri3);
                        c3643hn2.f(c3643hn2.f4470a);
                        return false;
                    }
                    if (abstractC2567Le instanceof C2536Jz) {
                        c2536Jz2 = (C2536Jz) abstractC2567Le;
                        this.X = c2536Jz2;
                        this.F = c2536Jz2.d;
                        this.Q = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                        this.n.add(c2536Jz2);
                        C5086yC c5086yC2 = AC.b;
                        FW.n(4, "initialCapacity");
                        objArrCopyOf = new Object[4];
                        c3503gAArr = this.v;
                        length = c3503gAArr.length;
                        i5 = 0;
                        i6 = 0;
                        while (i5 < length) {
                            C3503gA c3503gA4 = c3503gAArr[i5];
                            Integer numValueOf2 = Integer.valueOf(c3503gA4.q + c3503gA4.p);
                            i8 = i6 + 1;
                            if (objArrCopyOf.length < i8) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC2995aW.y(objArrCopyOf.length, i8));
                            }
                            objArrCopyOf[i6] = numValueOf2;
                            i5++;
                            i6 = i8;
                        }
                        C3965lY c3965lYH2 = AC.h(i6, objArrCopyOf);
                        c2536Jz2.D = this;
                        c2536Jz2.I = c3965lYH2;
                        while (i7 < r4) {
                            c3503gA3.getClass();
                            c3503gA3.C = c2536Jz2.k;
                            if (c2536Jz2.n) {
                                c3503gA3.G = true;
                            }
                        }
                    }
                    this.u = abstractC2567Le;
                    oi.f(abstractC2567Le, this, this.i.A(abstractC2567Le.c));
                    this.k.l(new FI(abstractC2567Le.b), abstractC2567Le.c, this.b, abstractC2567Le.d, abstractC2567Le.e, abstractC2567Le.f, abstractC2567Le.g, abstractC2567Le.h);
                    return true;
                }
                c4288p70 = c4288p73;
                jMax2 = j12;
                c2536Jz = c2536Jz3;
                c2458Gz.q.c(j, jMax3, jMax2, list, c2458Gz.a(c2536Jz3, j10));
                selectedIndexInTrackGroup = c2458Gz.q.getSelectedIndexInTrackGroup();
                if (iA != selectedIndexInTrackGroup) {
                    z = true;
                } else {
                    z = false;
                }
                Uri[] uriArr2 = c2458Gz.e;
                uri = uriArr2[selectedIndexInTrackGroup];
                c3730in = (C3730in) c2458Gz.g;
                if (c3730in.f(uri)) {
                    c4288p71 = c4288p70;
                    c4288p71.b = uri;
                    c2458Gz.s &= uri.equals(c2458Gz.o);
                    c2458Gz.o = uri;
                } else {
                    c4288p71 = c4288p70;
                    c2743RzA = c3730in.a(uri, true);
                    c2743RzA.getClass();
                    c2458Gz.p = c2743RzA.c;
                    z2 = c2743RzA.o;
                    j2 = c2743RzA.h;
                    if (z2) {
                        j3 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                    } else {
                        j3 = (c2743RzA.u + j2) - c3730in.n;
                    }
                    c2458Gz.r = j3;
                    j4 = j2 - c3730in.n;
                    Pair pairC3 = c2458Gz.c(c2536Jz, z, c2743RzA, j4, j10);
                    jLongValue = ((Long) pairC3.first).longValue();
                    iIntValue = ((Integer) pairC3.second).intValue();
                    if (jLongValue < c2743RzA.k) {
                        iIntValue2 = iIntValue;
                        c2743Rz = c2743RzA;
                    } else {
                        iIntValue2 = iIntValue;
                        c2743Rz = c2743RzA;
                    }
                    j5 = c2743Rz.k;
                    if (jLongValue < j5) {
                        j6 = j4;
                        i = (int) (jLongValue - j5);
                        ac = c2743Rz.r;
                        size = ac.size();
                        ac2 = c2743Rz.s;
                        if (i == size) {
                            if (iIntValue2 == -1) {
                                iIntValue2 = 0;
                            }
                            if (iIntValue2 < ac2.size()) {
                                c2432Fz = new C2432Fz((AbstractC2691Pz) ac2.get(iIntValue2), jLongValue, iIntValue2);
                            } else {
                                c2432Fz = null;
                            }
                        } else {
                            c2665Oz = (C2665Oz) ac.get(i);
                            if (iIntValue2 == -1) {
                                c2432Fz = new C2432Fz(c2665Oz, jLongValue, -1);
                            } else if (iIntValue2 < c2665Oz.m.size()) {
                                c2432Fz = new C2432Fz((AbstractC2691Pz) c2665Oz.m.get(iIntValue2), jLongValue, iIntValue2);
                            } else {
                                i2 = i + 1;
                                if (i2 < ac.size()) {
                                    c2432Fz = new C2432Fz((AbstractC2691Pz) ac.get(i2), jLongValue + 1, -1);
                                } else if (ac2.isEmpty()) {
                                    c2432Fz = new C2432Fz((AbstractC2691Pz) ac2.get(0), jLongValue + 1, 0);
                                } else {
                                    c2432Fz = null;
                                }
                            }
                        }
                        if (c2432Fz != null) {
                            c2458Gz.s = false;
                            c2458Gz.o = null;
                            abstractC2691Pz = c2432Fz.f3097a;
                            c2665Oz2 = abstractC2691Pz.b;
                            str = c2743Rz.f3949a;
                            if (c2665Oz2 != null) {
                                uriX = null;
                            } else {
                                uriX = null;
                            }
                            c2354CzD = c2458Gz.d(uriX, selectedIndexInTrackGroup);
                            c4288p71.d = c2354CzD;
                            if (c2354CzD == null) {
                                str2 = abstractC2691Pz.g;
                                if (str2 == null) {
                                    uriX2 = null;
                                } else {
                                    uriX2 = FW.X(str, str2);
                                }
                                c2354CzD2 = c2458Gz.d(uriX2, selectedIndexInTrackGroup);
                                c4288p71.d = c2354CzD2;
                                if (c2354CzD2 == null) {
                                    j7 = abstractC2691Pz.e;
                                    if (c2536Jz == null) {
                                        AtomicInteger atomicInteger12 = C2536Jz.L;
                                    } else {
                                        if (uri.equals(c2536Jz.m)) {
                                        }
                                        j8 = j6;
                                        long j1115 = j8 + j7;
                                        z3 = abstractC2691Pz instanceof C2613Mz;
                                        boolean z1120 = c2743Rz.c;
                                        if (z3) {
                                            j9 = j7;
                                            z4 = true;
                                            z5 = z4;
                                            z6 = c2432Fz.d;
                                            if (z5) {
                                                C4619sw c4619sw10 = c2458Gz.f[selectedIndexInTrackGroup];
                                                int selectionReason10 = c2458Gz.q.getSelectionReason();
                                                Object selectionData10 = c2458Gz.q.getSelectionData();
                                                boolean z11113 = c2458Gz.l;
                                                nn = c2458Gz.j;
                                                if (uriX2 == null) {
                                                    nn.getClass();
                                                    bArr = null;
                                                } else {
                                                    bArr = (byte[]) ((LinkedHashMap) nn.b).get(uriX2);
                                                }
                                                if (uriX == null) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = (byte[]) ((LinkedHashMap) nn.b).get(uriX);
                                                }
                                                AtomicInteger atomicInteger13 = C2536Jz.L;
                                                Map mapEmptyMap10 = Collections.emptyMap();
                                                Uri uriX12 = FW.X(str, abstractC2691Pz.f3582a);
                                                if (z6) {
                                                    i3 = 8;
                                                } else {
                                                    i3 = 0;
                                                }
                                                FW.u(uriX12, "The uri must be set.");
                                                C2432Fz c2432Fz11 = c2432Fz;
                                                C4868vl c4868vl12 = new C4868vl(uriX12, 0L, 1, null, mapEmptyMap10, abstractC2691Pz.i, abstractC2691Pz.j, null, i3, null);
                                                if (bArr != null) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                if (z7) {
                                                    String str112 = abstractC2691Pz.h;
                                                    str112.getClass();
                                                    bArrD = C2536Jz.d(str112);
                                                } else {
                                                    bArrD = null;
                                                }
                                                interfaceC4429ql = c2458Gz.b;
                                                if (bArr != null) {
                                                    bArrD.getClass();
                                                    m3 = new M3(interfaceC4429ql, bArr, bArrD);
                                                } else {
                                                    m3 = interfaceC4429ql;
                                                }
                                                c2665Oz3 = abstractC2691Pz.b;
                                                if (c2665Oz3 != null) {
                                                    if (bArr2 != null) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        String str113 = c2665Oz3.h;
                                                        str113.getClass();
                                                        bArrD2 = C2536Jz.d(str113);
                                                    } else {
                                                        bArrD2 = null;
                                                    }
                                                    boolean z11114 = z11;
                                                    c4868vl = new C4868vl(FW.X(str, c2665Oz3.f3582a), c2665Oz3.i, c2665Oz3.j);
                                                    if (bArr2 != null) {
                                                        bArrD2.getClass();
                                                        m4 = new M3(interfaceC4429ql, bArr2, bArrD2);
                                                    } else {
                                                        m4 = interfaceC4429ql;
                                                    }
                                                    z8 = z11114;
                                                    interfaceC4429ql2 = m4;
                                                } else {
                                                    c4868vl = null;
                                                    interfaceC4429ql2 = null;
                                                    z8 = false;
                                                }
                                                long j1116 = j8 + j9;
                                                long j1117 = j1116 + abstractC2691Pz.c;
                                                i4 = c2743Rz.j + abstractC2691Pz.d;
                                                if (c2536Jz != null) {
                                                    c4868vl2 = c2536Jz.q;
                                                    if (c4868vl != c4868vl2) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = true;
                                                    }
                                                    uri2 = uri;
                                                    if (uri2.equals(c2536Jz.m)) {
                                                        z10 = false;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (z9) {
                                                        interfaceC2562Kz2 = null;
                                                    } else {
                                                        interfaceC2562Kz2 = null;
                                                    }
                                                    c3241dC = c2536Jz.y;
                                                    jt = c2536Jz.z;
                                                    interfaceC2562Kz = interfaceC2562Kz2;
                                                } else {
                                                    uri2 = uri;
                                                    c3241dC = new C3241dC(null);
                                                    interfaceC2562Kz = null;
                                                    jt = new JT(10);
                                                }
                                                boolean z11115 = !z6;
                                                nn2 = c2458Gz.d;
                                                mc0 = (Mc0) ((SparseArray) nn2.b).get(i4);
                                                if (mc0 == null) {
                                                    mc0 = new Mc0(9223372036854775806L);
                                                    ((SparseArray) nn2.b).put(i4, mc0);
                                                }
                                                C2536Jz c2536Jz13 = new C2536Jz(c2458Gz.f3147a, m3, c4868vl12, c4619sw10, z7, interfaceC4429ql2, c4868vl, z8, uri2, c2458Gz.i, selectionReason10, selectionData10, j1116, j1117, c2432Fz11.b, c2432Fz11.c, z11115, i4, abstractC2691Pz.k, z11113, mc0, abstractC2691Pz.f, interfaceC2562Kz, c3241dC, jt, z5, c2458Gz.k);
                                                c4288p72 = c4288p71;
                                                c4288p72.d = c2536Jz13;
                                            } else {
                                                C4619sw c4619sw11 = c2458Gz.f[selectedIndexInTrackGroup];
                                                int selectionReason11 = c2458Gz.q.getSelectionReason();
                                                Object selectionData11 = c2458Gz.q.getSelectionData();
                                                boolean z11116 = c2458Gz.l;
                                                nn = c2458Gz.j;
                                                if (uriX2 == null) {
                                                    nn.getClass();
                                                    bArr = null;
                                                } else {
                                                    bArr = (byte[]) ((LinkedHashMap) nn.b).get(uriX2);
                                                }
                                                if (uriX == null) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = (byte[]) ((LinkedHashMap) nn.b).get(uriX);
                                                }
                                                AtomicInteger atomicInteger14 = C2536Jz.L;
                                                Map mapEmptyMap11 = Collections.emptyMap();
                                                Uri uriX13 = FW.X(str, abstractC2691Pz.f3582a);
                                                if (z6) {
                                                    i3 = 8;
                                                } else {
                                                    i3 = 0;
                                                }
                                                FW.u(uriX13, "The uri must be set.");
                                                C2432Fz c2432Fz12 = c2432Fz;
                                                C4868vl c4868vl13 = new C4868vl(uriX13, 0L, 1, null, mapEmptyMap11, abstractC2691Pz.i, abstractC2691Pz.j, null, i3, null);
                                                if (bArr != null) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                if (z7) {
                                                    String str114 = abstractC2691Pz.h;
                                                    str114.getClass();
                                                    bArrD = C2536Jz.d(str114);
                                                } else {
                                                    bArrD = null;
                                                }
                                                interfaceC4429ql = c2458Gz.b;
                                                if (bArr != null) {
                                                    bArrD.getClass();
                                                    m3 = new M3(interfaceC4429ql, bArr, bArrD);
                                                } else {
                                                    m3 = interfaceC4429ql;
                                                }
                                                c2665Oz3 = abstractC2691Pz.b;
                                                if (c2665Oz3 != null) {
                                                    if (bArr2 != null) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        String str115 = c2665Oz3.h;
                                                        str115.getClass();
                                                        bArrD2 = C2536Jz.d(str115);
                                                    } else {
                                                        bArrD2 = null;
                                                    }
                                                    boolean z11117 = z11;
                                                    c4868vl = new C4868vl(FW.X(str, c2665Oz3.f3582a), c2665Oz3.i, c2665Oz3.j);
                                                    if (bArr2 != null) {
                                                        bArrD2.getClass();
                                                        m4 = new M3(interfaceC4429ql, bArr2, bArrD2);
                                                    } else {
                                                        m4 = interfaceC4429ql;
                                                    }
                                                    z8 = z11117;
                                                    interfaceC4429ql2 = m4;
                                                } else {
                                                    c4868vl = null;
                                                    interfaceC4429ql2 = null;
                                                    z8 = false;
                                                }
                                                long j1118 = j8 + j9;
                                                long j1119 = j1118 + abstractC2691Pz.c;
                                                i4 = c2743Rz.j + abstractC2691Pz.d;
                                                if (c2536Jz != null) {
                                                    c4868vl2 = c2536Jz.q;
                                                    if (c4868vl != c4868vl2) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = true;
                                                    }
                                                    uri2 = uri;
                                                    if (uri2.equals(c2536Jz.m)) {
                                                        z10 = false;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (z9) {
                                                        interfaceC2562Kz2 = null;
                                                    } else {
                                                        interfaceC2562Kz2 = null;
                                                    }
                                                    c3241dC = c2536Jz.y;
                                                    jt = c2536Jz.z;
                                                    interfaceC2562Kz = interfaceC2562Kz2;
                                                } else {
                                                    uri2 = uri;
                                                    c3241dC = new C3241dC(null);
                                                    interfaceC2562Kz = null;
                                                    jt = new JT(10);
                                                }
                                                boolean z11118 = !z6;
                                                nn2 = c2458Gz.d;
                                                mc0 = (Mc0) ((SparseArray) nn2.b).get(i4);
                                                if (mc0 == null) {
                                                    mc0 = new Mc0(9223372036854775806L);
                                                    ((SparseArray) nn2.b).put(i4, mc0);
                                                }
                                                C2536Jz c2536Jz14 = new C2536Jz(c2458Gz.f3147a, m3, c4868vl13, c4619sw11, z7, interfaceC4429ql2, c4868vl, z8, uri2, c2458Gz.i, selectionReason11, selectionData11, j1118, j1119, c2432Fz12.b, c2432Fz12.c, z11118, i4, abstractC2691Pz.k, z11116, mc0, abstractC2691Pz.f, interfaceC2562Kz, c3241dC, jt, z5, c2458Gz.k);
                                                c4288p72 = c4288p71;
                                                c4288p72.d = c2536Jz14;
                                            }
                                        } else {
                                            j9 = j7;
                                            z4 = true;
                                            z5 = z4;
                                            z6 = c2432Fz.d;
                                            if (z5) {
                                                C4619sw c4619sw12 = c2458Gz.f[selectedIndexInTrackGroup];
                                                int selectionReason12 = c2458Gz.q.getSelectionReason();
                                                Object selectionData12 = c2458Gz.q.getSelectionData();
                                                boolean z11119 = c2458Gz.l;
                                                nn = c2458Gz.j;
                                                if (uriX2 == null) {
                                                    nn.getClass();
                                                    bArr = null;
                                                } else {
                                                    bArr = (byte[]) ((LinkedHashMap) nn.b).get(uriX2);
                                                }
                                                if (uriX == null) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = (byte[]) ((LinkedHashMap) nn.b).get(uriX);
                                                }
                                                AtomicInteger atomicInteger15 = C2536Jz.L;
                                                Map mapEmptyMap12 = Collections.emptyMap();
                                                Uri uriX14 = FW.X(str, abstractC2691Pz.f3582a);
                                                if (z6) {
                                                    i3 = 8;
                                                } else {
                                                    i3 = 0;
                                                }
                                                FW.u(uriX14, "The uri must be set.");
                                                C2432Fz c2432Fz13 = c2432Fz;
                                                C4868vl c4868vl14 = new C4868vl(uriX14, 0L, 1, null, mapEmptyMap12, abstractC2691Pz.i, abstractC2691Pz.j, null, i3, null);
                                                if (bArr != null) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                if (z7) {
                                                    String str116 = abstractC2691Pz.h;
                                                    str116.getClass();
                                                    bArrD = C2536Jz.d(str116);
                                                } else {
                                                    bArrD = null;
                                                }
                                                interfaceC4429ql = c2458Gz.b;
                                                if (bArr != null) {
                                                    bArrD.getClass();
                                                    m3 = new M3(interfaceC4429ql, bArr, bArrD);
                                                } else {
                                                    m3 = interfaceC4429ql;
                                                }
                                                c2665Oz3 = abstractC2691Pz.b;
                                                if (c2665Oz3 != null) {
                                                    if (bArr2 != null) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        String str117 = c2665Oz3.h;
                                                        str117.getClass();
                                                        bArrD2 = C2536Jz.d(str117);
                                                    } else {
                                                        bArrD2 = null;
                                                    }
                                                    boolean z111110 = z11;
                                                    c4868vl = new C4868vl(FW.X(str, c2665Oz3.f3582a), c2665Oz3.i, c2665Oz3.j);
                                                    if (bArr2 != null) {
                                                        bArrD2.getClass();
                                                        m4 = new M3(interfaceC4429ql, bArr2, bArrD2);
                                                    } else {
                                                        m4 = interfaceC4429ql;
                                                    }
                                                    z8 = z111110;
                                                    interfaceC4429ql2 = m4;
                                                } else {
                                                    c4868vl = null;
                                                    interfaceC4429ql2 = null;
                                                    z8 = false;
                                                }
                                                long j11110 = j8 + j9;
                                                long j11111 = j11110 + abstractC2691Pz.c;
                                                i4 = c2743Rz.j + abstractC2691Pz.d;
                                                if (c2536Jz != null) {
                                                    c4868vl2 = c2536Jz.q;
                                                    if (c4868vl != c4868vl2) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = true;
                                                    }
                                                    uri2 = uri;
                                                    if (uri2.equals(c2536Jz.m)) {
                                                        z10 = false;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (z9) {
                                                        interfaceC2562Kz2 = null;
                                                    } else {
                                                        interfaceC2562Kz2 = null;
                                                    }
                                                    c3241dC = c2536Jz.y;
                                                    jt = c2536Jz.z;
                                                    interfaceC2562Kz = interfaceC2562Kz2;
                                                } else {
                                                    uri2 = uri;
                                                    c3241dC = new C3241dC(null);
                                                    interfaceC2562Kz = null;
                                                    jt = new JT(10);
                                                }
                                                boolean z111111 = !z6;
                                                nn2 = c2458Gz.d;
                                                mc0 = (Mc0) ((SparseArray) nn2.b).get(i4);
                                                if (mc0 == null) {
                                                    mc0 = new Mc0(9223372036854775806L);
                                                    ((SparseArray) nn2.b).put(i4, mc0);
                                                }
                                                C2536Jz c2536Jz15 = new C2536Jz(c2458Gz.f3147a, m3, c4868vl14, c4619sw12, z7, interfaceC4429ql2, c4868vl, z8, uri2, c2458Gz.i, selectionReason12, selectionData12, j11110, j11111, c2432Fz13.b, c2432Fz13.c, z111111, i4, abstractC2691Pz.k, z11119, mc0, abstractC2691Pz.f, interfaceC2562Kz, c3241dC, jt, z5, c2458Gz.k);
                                                c4288p72 = c4288p71;
                                                c4288p72.d = c2536Jz15;
                                            } else {
                                                C4619sw c4619sw13 = c2458Gz.f[selectedIndexInTrackGroup];
                                                int selectionReason13 = c2458Gz.q.getSelectionReason();
                                                Object selectionData13 = c2458Gz.q.getSelectionData();
                                                boolean z111112 = c2458Gz.l;
                                                nn = c2458Gz.j;
                                                if (uriX2 == null) {
                                                    nn.getClass();
                                                    bArr = null;
                                                } else {
                                                    bArr = (byte[]) ((LinkedHashMap) nn.b).get(uriX2);
                                                }
                                                if (uriX == null) {
                                                    bArr2 = null;
                                                } else {
                                                    bArr2 = (byte[]) ((LinkedHashMap) nn.b).get(uriX);
                                                }
                                                AtomicInteger atomicInteger16 = C2536Jz.L;
                                                Map mapEmptyMap13 = Collections.emptyMap();
                                                Uri uriX15 = FW.X(str, abstractC2691Pz.f3582a);
                                                if (z6) {
                                                    i3 = 8;
                                                } else {
                                                    i3 = 0;
                                                }
                                                FW.u(uriX15, "The uri must be set.");
                                                C2432Fz c2432Fz14 = c2432Fz;
                                                C4868vl c4868vl15 = new C4868vl(uriX15, 0L, 1, null, mapEmptyMap13, abstractC2691Pz.i, abstractC2691Pz.j, null, i3, null);
                                                if (bArr != null) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                if (z7) {
                                                    String str118 = abstractC2691Pz.h;
                                                    str118.getClass();
                                                    bArrD = C2536Jz.d(str118);
                                                } else {
                                                    bArrD = null;
                                                }
                                                interfaceC4429ql = c2458Gz.b;
                                                if (bArr != null) {
                                                    bArrD.getClass();
                                                    m3 = new M3(interfaceC4429ql, bArr, bArrD);
                                                } else {
                                                    m3 = interfaceC4429ql;
                                                }
                                                c2665Oz3 = abstractC2691Pz.b;
                                                if (c2665Oz3 != null) {
                                                    if (bArr2 != null) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        String str119 = c2665Oz3.h;
                                                        str119.getClass();
                                                        bArrD2 = C2536Jz.d(str119);
                                                    } else {
                                                        bArrD2 = null;
                                                    }
                                                    boolean z111113 = z11;
                                                    c4868vl = new C4868vl(FW.X(str, c2665Oz3.f3582a), c2665Oz3.i, c2665Oz3.j);
                                                    if (bArr2 != null) {
                                                        bArrD2.getClass();
                                                        m4 = new M3(interfaceC4429ql, bArr2, bArrD2);
                                                    } else {
                                                        m4 = interfaceC4429ql;
                                                    }
                                                    z8 = z111113;
                                                    interfaceC4429ql2 = m4;
                                                } else {
                                                    c4868vl = null;
                                                    interfaceC4429ql2 = null;
                                                    z8 = false;
                                                }
                                                long j11112 = j8 + j9;
                                                long j11113 = j11112 + abstractC2691Pz.c;
                                                i4 = c2743Rz.j + abstractC2691Pz.d;
                                                if (c2536Jz != null) {
                                                    c4868vl2 = c2536Jz.q;
                                                    if (c4868vl != c4868vl2) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = true;
                                                    }
                                                    uri2 = uri;
                                                    if (uri2.equals(c2536Jz.m)) {
                                                        z10 = false;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (z9) {
                                                        interfaceC2562Kz2 = null;
                                                    } else {
                                                        interfaceC2562Kz2 = null;
                                                    }
                                                    c3241dC = c2536Jz.y;
                                                    jt = c2536Jz.z;
                                                    interfaceC2562Kz = interfaceC2562Kz2;
                                                } else {
                                                    uri2 = uri;
                                                    c3241dC = new C3241dC(null);
                                                    interfaceC2562Kz = null;
                                                    jt = new JT(10);
                                                }
                                                boolean z111114 = !z6;
                                                nn2 = c2458Gz.d;
                                                mc0 = (Mc0) ((SparseArray) nn2.b).get(i4);
                                                if (mc0 == null) {
                                                    mc0 = new Mc0(9223372036854775806L);
                                                    ((SparseArray) nn2.b).put(i4, mc0);
                                                }
                                                C2536Jz c2536Jz16 = new C2536Jz(c2458Gz.f3147a, m3, c4868vl15, c4619sw13, z7, interfaceC4429ql2, c4868vl, z8, uri2, c2458Gz.i, selectionReason13, selectionData13, j11112, j11113, c2432Fz14.b, c2432Fz14.c, z111114, i4, abstractC2691Pz.k, z111112, mc0, abstractC2691Pz.f, interfaceC2562Kz, c3241dC, jt, z5, c2458Gz.k);
                                                c4288p72 = c4288p71;
                                                c4288p72.d = c2536Jz16;
                                            }
                                        }
                                    }
                                    j8 = j6;
                                    j9 = j7;
                                    z5 = false;
                                    z6 = c2432Fz.d;
                                    if (z5) {
                                        C4619sw c4619sw14 = c2458Gz.f[selectedIndexInTrackGroup];
                                        int selectionReason14 = c2458Gz.q.getSelectionReason();
                                        Object selectionData14 = c2458Gz.q.getSelectionData();
                                        boolean z111115 = c2458Gz.l;
                                        nn = c2458Gz.j;
                                        if (uriX2 == null) {
                                            nn.getClass();
                                            bArr = null;
                                        } else {
                                            bArr = (byte[]) ((LinkedHashMap) nn.b).get(uriX2);
                                        }
                                        if (uriX == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((LinkedHashMap) nn.b).get(uriX);
                                        }
                                        AtomicInteger atomicInteger17 = C2536Jz.L;
                                        Map mapEmptyMap14 = Collections.emptyMap();
                                        Uri uriX16 = FW.X(str, abstractC2691Pz.f3582a);
                                        if (z6) {
                                            i3 = 8;
                                        } else {
                                            i3 = 0;
                                        }
                                        FW.u(uriX16, "The uri must be set.");
                                        C2432Fz c2432Fz15 = c2432Fz;
                                        C4868vl c4868vl16 = new C4868vl(uriX16, 0L, 1, null, mapEmptyMap14, abstractC2691Pz.i, abstractC2691Pz.j, null, i3, null);
                                        if (bArr != null) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (z7) {
                                            String str1110 = abstractC2691Pz.h;
                                            str1110.getClass();
                                            bArrD = C2536Jz.d(str1110);
                                        } else {
                                            bArrD = null;
                                        }
                                        interfaceC4429ql = c2458Gz.b;
                                        if (bArr != null) {
                                            bArrD.getClass();
                                            m3 = new M3(interfaceC4429ql, bArr, bArrD);
                                        } else {
                                            m3 = interfaceC4429ql;
                                        }
                                        c2665Oz3 = abstractC2691Pz.b;
                                        if (c2665Oz3 != null) {
                                            if (bArr2 != null) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                                String str1111 = c2665Oz3.h;
                                                str1111.getClass();
                                                bArrD2 = C2536Jz.d(str1111);
                                            } else {
                                                bArrD2 = null;
                                            }
                                            boolean z111116 = z11;
                                            c4868vl = new C4868vl(FW.X(str, c2665Oz3.f3582a), c2665Oz3.i, c2665Oz3.j);
                                            if (bArr2 != null) {
                                                bArrD2.getClass();
                                                m4 = new M3(interfaceC4429ql, bArr2, bArrD2);
                                            } else {
                                                m4 = interfaceC4429ql;
                                            }
                                            z8 = z111116;
                                            interfaceC4429ql2 = m4;
                                        } else {
                                            c4868vl = null;
                                            interfaceC4429ql2 = null;
                                            z8 = false;
                                        }
                                        long j11114 = j8 + j9;
                                        long j11115 = j11114 + abstractC2691Pz.c;
                                        i4 = c2743Rz.j + abstractC2691Pz.d;
                                        if (c2536Jz != null) {
                                            c4868vl2 = c2536Jz.q;
                                            if (c4868vl != c4868vl2) {
                                                z9 = true;
                                            } else {
                                                z9 = true;
                                            }
                                            uri2 = uri;
                                            if (uri2.equals(c2536Jz.m)) {
                                                z10 = false;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z9) {
                                                interfaceC2562Kz2 = null;
                                            } else {
                                                interfaceC2562Kz2 = null;
                                            }
                                            c3241dC = c2536Jz.y;
                                            jt = c2536Jz.z;
                                            interfaceC2562Kz = interfaceC2562Kz2;
                                        } else {
                                            uri2 = uri;
                                            c3241dC = new C3241dC(null);
                                            interfaceC2562Kz = null;
                                            jt = new JT(10);
                                        }
                                        boolean z111117 = !z6;
                                        nn2 = c2458Gz.d;
                                        mc0 = (Mc0) ((SparseArray) nn2.b).get(i4);
                                        if (mc0 == null) {
                                            mc0 = new Mc0(9223372036854775806L);
                                            ((SparseArray) nn2.b).put(i4, mc0);
                                        }
                                        C2536Jz c2536Jz17 = new C2536Jz(c2458Gz.f3147a, m3, c4868vl16, c4619sw14, z7, interfaceC4429ql2, c4868vl, z8, uri2, c2458Gz.i, selectionReason14, selectionData14, j11114, j11115, c2432Fz15.b, c2432Fz15.c, z111117, i4, abstractC2691Pz.k, z111115, mc0, abstractC2691Pz.f, interfaceC2562Kz, c3241dC, jt, z5, c2458Gz.k);
                                        c4288p72 = c4288p71;
                                        c4288p72.d = c2536Jz17;
                                    } else {
                                        C4619sw c4619sw15 = c2458Gz.f[selectedIndexInTrackGroup];
                                        int selectionReason15 = c2458Gz.q.getSelectionReason();
                                        Object selectionData15 = c2458Gz.q.getSelectionData();
                                        boolean z111118 = c2458Gz.l;
                                        nn = c2458Gz.j;
                                        if (uriX2 == null) {
                                            nn.getClass();
                                            bArr = null;
                                        } else {
                                            bArr = (byte[]) ((LinkedHashMap) nn.b).get(uriX2);
                                        }
                                        if (uriX == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((LinkedHashMap) nn.b).get(uriX);
                                        }
                                        AtomicInteger atomicInteger18 = C2536Jz.L;
                                        Map mapEmptyMap15 = Collections.emptyMap();
                                        Uri uriX17 = FW.X(str, abstractC2691Pz.f3582a);
                                        if (z6) {
                                            i3 = 8;
                                        } else {
                                            i3 = 0;
                                        }
                                        FW.u(uriX17, "The uri must be set.");
                                        C2432Fz c2432Fz16 = c2432Fz;
                                        C4868vl c4868vl17 = new C4868vl(uriX17, 0L, 1, null, mapEmptyMap15, abstractC2691Pz.i, abstractC2691Pz.j, null, i3, null);
                                        if (bArr != null) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (z7) {
                                            String str1112 = abstractC2691Pz.h;
                                            str1112.getClass();
                                            bArrD = C2536Jz.d(str1112);
                                        } else {
                                            bArrD = null;
                                        }
                                        interfaceC4429ql = c2458Gz.b;
                                        if (bArr != null) {
                                            bArrD.getClass();
                                            m3 = new M3(interfaceC4429ql, bArr, bArrD);
                                        } else {
                                            m3 = interfaceC4429ql;
                                        }
                                        c2665Oz3 = abstractC2691Pz.b;
                                        if (c2665Oz3 != null) {
                                            if (bArr2 != null) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                                String str1113 = c2665Oz3.h;
                                                str1113.getClass();
                                                bArrD2 = C2536Jz.d(str1113);
                                            } else {
                                                bArrD2 = null;
                                            }
                                            boolean z111119 = z11;
                                            c4868vl = new C4868vl(FW.X(str, c2665Oz3.f3582a), c2665Oz3.i, c2665Oz3.j);
                                            if (bArr2 != null) {
                                                bArrD2.getClass();
                                                m4 = new M3(interfaceC4429ql, bArr2, bArrD2);
                                            } else {
                                                m4 = interfaceC4429ql;
                                            }
                                            z8 = z111119;
                                            interfaceC4429ql2 = m4;
                                        } else {
                                            c4868vl = null;
                                            interfaceC4429ql2 = null;
                                            z8 = false;
                                        }
                                        long j11116 = j8 + j9;
                                        long j11117 = j11116 + abstractC2691Pz.c;
                                        i4 = c2743Rz.j + abstractC2691Pz.d;
                                        if (c2536Jz != null) {
                                            c4868vl2 = c2536Jz.q;
                                            if (c4868vl != c4868vl2) {
                                                z9 = true;
                                            } else {
                                                z9 = true;
                                            }
                                            uri2 = uri;
                                            if (uri2.equals(c2536Jz.m)) {
                                                z10 = false;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z9) {
                                                interfaceC2562Kz2 = null;
                                            } else {
                                                interfaceC2562Kz2 = null;
                                            }
                                            c3241dC = c2536Jz.y;
                                            jt = c2536Jz.z;
                                            interfaceC2562Kz = interfaceC2562Kz2;
                                        } else {
                                            uri2 = uri;
                                            c3241dC = new C3241dC(null);
                                            interfaceC2562Kz = null;
                                            jt = new JT(10);
                                        }
                                        boolean z1111110 = !z6;
                                        nn2 = c2458Gz.d;
                                        mc0 = (Mc0) ((SparseArray) nn2.b).get(i4);
                                        if (mc0 == null) {
                                            mc0 = new Mc0(9223372036854775806L);
                                            ((SparseArray) nn2.b).put(i4, mc0);
                                        }
                                        C2536Jz c2536Jz18 = new C2536Jz(c2458Gz.f3147a, m3, c4868vl17, c4619sw15, z7, interfaceC4429ql2, c4868vl, z8, uri2, c2458Gz.i, selectionReason15, selectionData15, j11116, j11117, c2432Fz16.b, c2432Fz16.c, z1111110, i4, abstractC2691Pz.k, z111118, mc0, abstractC2691Pz.f, interfaceC2562Kz, c3241dC, jt, z5, c2458Gz.k);
                                        c4288p72 = c4288p71;
                                        c4288p72.d = c2536Jz18;
                                    }
                                }
                            }
                        } else if (!c2743Rz.o) {
                            c4288p71.b = uri;
                            c2458Gz.s &= uri.equals(c2458Gz.o);
                            c2458Gz.o = uri;
                        } else {
                            if (z13) {
                            }
                            c4288p71.c = true;
                        }
                        z12 = c4288p72.c;
                        abstractC2567Le = (AbstractC2567Le) c4288p72.d;
                        uri3 = (Uri) c4288p72.b;
                        if (z12) {
                            this.Q = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                            this.T = true;
                            return true;
                        }
                        if (abstractC2567Le == null) {
                            if (uri3 != null) {
                                return false;
                            }
                            C3643hn c3643hn3 = (C3643hn) ((C3730in) ((C2587Lz) this.c.b).b).d.get(uri3);
                            c3643hn3.f(c3643hn3.f4470a);
                            return false;
                        }
                        if (abstractC2567Le instanceof C2536Jz) {
                            c2536Jz2 = (C2536Jz) abstractC2567Le;
                            this.X = c2536Jz2;
                            this.F = c2536Jz2.d;
                            this.Q = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                            this.n.add(c2536Jz2);
                            C5086yC c5086yC3 = AC.b;
                            FW.n(4, "initialCapacity");
                            objArrCopyOf = new Object[4];
                            c3503gAArr = this.v;
                            length = c3503gAArr.length;
                            i5 = 0;
                            i6 = 0;
                            while (i5 < length) {
                                C3503gA c3503gA5 = c3503gAArr[i5];
                                Integer numValueOf3 = Integer.valueOf(c3503gA5.q + c3503gA5.p);
                                i8 = i6 + 1;
                                if (objArrCopyOf.length < i8) {
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC2995aW.y(objArrCopyOf.length, i8));
                                }
                                objArrCopyOf[i6] = numValueOf3;
                                i5++;
                                i6 = i8;
                            }
                            C3965lY c3965lYH3 = AC.h(i6, objArrCopyOf);
                            c2536Jz2.D = this;
                            c2536Jz2.I = c3965lYH3;
                            while (i7 < r4) {
                                c3503gA3.getClass();
                                c3503gA3.C = c2536Jz2.k;
                                if (c2536Jz2.n) {
                                    c3503gA3.G = true;
                                }
                            }
                        }
                        this.u = abstractC2567Le;
                        oi.f(abstractC2567Le, this, this.i.A(abstractC2567Le.c));
                        this.k.l(new FI(abstractC2567Le.b), abstractC2567Le.c, this.b, abstractC2567Le.d, abstractC2567Le.e, abstractC2567Le.f, abstractC2567Le.g, abstractC2567Le.h);
                        return true;
                    }
                    c2458Gz.n = new C3529ga();
                }
                c4288p72 = c4288p71;
                z12 = c4288p72.c;
                abstractC2567Le = (AbstractC2567Le) c4288p72.d;
                uri3 = (Uri) c4288p72.b;
                if (z12) {
                    this.Q = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                    this.T = true;
                    return true;
                }
                if (abstractC2567Le == null) {
                    if (uri3 != null) {
                        return false;
                    }
                    C3643hn c3643hn4 = (C3643hn) ((C3730in) ((C2587Lz) this.c.b).b).d.get(uri3);
                    c3643hn4.f(c3643hn4.f4470a);
                    return false;
                }
                if (abstractC2567Le instanceof C2536Jz) {
                    c2536Jz2 = (C2536Jz) abstractC2567Le;
                    this.X = c2536Jz2;
                    this.F = c2536Jz2.d;
                    this.Q = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                    this.n.add(c2536Jz2);
                    C5086yC c5086yC4 = AC.b;
                    FW.n(4, "initialCapacity");
                    objArrCopyOf = new Object[4];
                    c3503gAArr = this.v;
                    length = c3503gAArr.length;
                    i5 = 0;
                    i6 = 0;
                    while (i5 < length) {
                        C3503gA c3503gA6 = c3503gAArr[i5];
                        Integer numValueOf4 = Integer.valueOf(c3503gA6.q + c3503gA6.p);
                        i8 = i6 + 1;
                        if (objArrCopyOf.length < i8) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC2995aW.y(objArrCopyOf.length, i8));
                        }
                        objArrCopyOf[i6] = numValueOf4;
                        i5++;
                        i6 = i8;
                    }
                    C3965lY c3965lYH4 = AC.h(i6, objArrCopyOf);
                    c2536Jz2.D = this;
                    c2536Jz2.I = c3965lYH4;
                    while (i7 < r4) {
                        c3503gA3.getClass();
                        c3503gA3.C = c2536Jz2.k;
                        if (c2536Jz2.n) {
                            c3503gA3.G = true;
                        }
                    }
                }
                this.u = abstractC2567Le;
                oi.f(abstractC2567Le, this, this.i.A(abstractC2567Le.c));
                this.k.l(new FI(abstractC2567Le.b), abstractC2567Le.c, this.b, abstractC2567Le.d, abstractC2567Le.e, abstractC2567Le.f, abstractC2567Le.g, abstractC2567Le.h);
                return true;
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final void d(LI li, long j, long j2, boolean z) {
        AbstractC2567Le abstractC2567Le = (AbstractC2567Le) li;
        this.u = null;
        long j3 = abstractC2567Le.f3364a;
        Uri uri = abstractC2567Le.i.c;
        FI fi = new FI();
        this.i.getClass();
        this.k.d(fi, abstractC2567Le.c, this.b, abstractC2567Le.d, abstractC2567Le.e, abstractC2567Le.f, abstractC2567Le.g, abstractC2567Le.h);
        if (z) {
            return;
        }
        if (o() || this.E == 0) {
            u();
        }
        if (this.E > 0) {
            this.c.o(this);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JI
    public final C2868Wu e(LI li, long j, long j2, IOException iOException, int i) {
        boolean zBlacklist;
        C2868Wu c2868WuB;
        int i2;
        AbstractC2567Le abstractC2567Le = (AbstractC2567Le) li;
        boolean z = abstractC2567Le instanceof C2536Jz;
        if (z && !((C2536Jz) abstractC2567Le).K && (iOException instanceof SA) && ((i2 = ((SA) iOException).d) == 410 || i2 == 404)) {
            return OI.d;
        }
        long j3 = abstractC2567Le.i.b;
        Uri uri = abstractC2567Le.i.c;
        FI fi = new FI();
        BR br = new BR(fi, new C3779jO(abstractC2567Le.c, this.b, abstractC2567Le.d, abstractC2567Le.e, abstractC2567Le.f, Ug0.W(abstractC2567Le.g), Ug0.W(abstractC2567Le.h)), iOException, i);
        C2458Gz c2458Gz = this.d;
        C3483g0 c3483g0W = FW.w(c2458Gz.q);
        this.i.getClass();
        C2868Wu c2868WuY = G7.y(c3483g0W, br);
        if (c2868WuY == null || c2868WuY.f3945a != 2) {
            zBlacklist = false;
        } else {
            InterfaceC3299dt interfaceC3299dt = c2458Gz.q;
            zBlacklist = interfaceC3299dt.blacklist(interfaceC3299dt.indexOf(c2458Gz.h.a(abstractC2567Le.d)), c2868WuY.b);
        }
        if (zBlacklist) {
            if (z && j3 == 0) {
                ArrayList arrayList = this.n;
                FW.s(((C2536Jz) arrayList.remove(arrayList.size() - 1)) == abstractC2567Le);
                if (arrayList.isEmpty()) {
                    this.Q = this.P;
                } else {
                    ((C2536Jz) FW.H(arrayList)).J = true;
                }
            }
            c2868WuB = OI.e;
        } else {
            long jB = G7.B(br);
            c2868WuB = jB != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? OI.b(jB, false) : OI.f;
        }
        C2868Wu c2868Wu = c2868WuB;
        boolean z2 = !c2868Wu.c();
        this.k.i(fi, abstractC2567Le.c, this.b, abstractC2567Le.d, abstractC2567Le.e, abstractC2567Le.f, abstractC2567Le.g, abstractC2567Le.h, iOException, z2);
        if (z2) {
            this.u = null;
        }
        if (zBlacklist) {
            if (this.D) {
                this.c.o(this);
            } else {
                continueLoading(this.P);
            }
        }
        return c2868Wu;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public final void endTracks() {
        this.U = true;
        this.r.post(this.q);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U20
    public final void f() {
        this.r.post(this.p);
    }

    public final void g() {
        FW.s(this.D);
        this.I.getClass();
        this.J.getClass();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getBufferedPositionUs() {
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (o()) {
            return this.Q;
        }
        long jMax = this.P;
        C2536Jz c2536JzM = m();
        if (!c2536JzM.H) {
            ArrayList arrayList = this.n;
            c2536JzM = arrayList.size() > 1 ? (C2536Jz) DM.e(arrayList, 2) : null;
        }
        if (c2536JzM != null) {
            jMax = Math.max(jMax, c2536JzM.h);
        }
        if (this.C) {
            for (C3503gA c3503gA : this.v) {
                jMax = Math.max(jMax, c3503gA.n());
            }
        }
        return jMax;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final long getNextLoadPositionUs() {
        if (o()) {
            return this.Q;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return m().h;
    }

    public final C4062md0 i(C3974ld0[] c3974ld0Arr) {
        for (int i = 0; i < c3974ld0Arr.length; i++) {
            C3974ld0 c3974ld0 = c3974ld0Arr[i];
            C4619sw[] c4619swArr = new C4619sw[c3974ld0.f4655a];
            for (int i2 = 0; i2 < c3974ld0.f4655a; i2++) {
                C4619sw c4619sw = c3974ld0.d[i2];
                int iG = this.g.g(c4619sw);
                C4531rw c4531rwA = c4619sw.a();
                c4531rwA.F = iG;
                c4619swArr[i2] = c4531rwA.a();
            }
            c3974ld0Arr[i] = new C3974ld0(c3974ld0.b, c4619swArr);
        }
        return new C4062md0(c3974ld0Arr);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final boolean isLoading() {
        return this.j.d();
    }

    public final void l(int i) {
        ArrayList arrayList;
        FW.s(!this.j.d());
        int i2 = i;
        loop0: while (true) {
            arrayList = this.n;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            }
            int i3 = i2;
            while (true) {
                if (i3 >= arrayList.size()) {
                    C2536Jz c2536Jz = (C2536Jz) arrayList.get(i2);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= this.v.length) {
                            break loop0;
                        }
                        if (this.v[i4].q() > c2536Jz.e(i4)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else if (((C2536Jz) arrayList.get(i3)).n) {
                    break;
                } else {
                    i3++;
                }
            }
            i2++;
        }
        if (i2 == -1) {
            return;
        }
        long j = m().h;
        C2536Jz c2536Jz2 = (C2536Jz) arrayList.get(i2);
        Ug0.Q(arrayList, i2, arrayList.size());
        for (int i5 = 0; i5 < this.v.length; i5++) {
            this.v[i5].k(c2536Jz2.e(i5));
        }
        if (arrayList.isEmpty()) {
            this.Q = this.P;
        } else {
            ((C2536Jz) FW.H(arrayList)).J = true;
        }
        this.T = false;
        int i6 = this.A;
        long j2 = c2536Jz2.g;
        DO r6 = this.k;
        r6.n(new C3779jO(1, i6, null, 3, null, r6.a(j2), r6.a(j)));
    }

    public final C2536Jz m() {
        return (C2536Jz) DM.e(this.n, 1);
    }

    public final boolean o() {
        return this.Q != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MI
    public final void onLoaderReleased() {
        for (C3503gA c3503gA : this.v) {
            c3503gA.B();
        }
    }

    public final void p() {
        if (!this.H && this.K == null && this.C) {
            for (C3503gA c3503gA : this.v) {
                if (c3503gA.t() == null) {
                    return;
                }
            }
            C4062md0 c4062md0 = this.I;
            if (c4062md0 != null) {
                int i = c4062md0.f4703a;
                int[] iArr = new int[i];
                this.K = iArr;
                Arrays.fill(iArr, -1);
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = 0;
                    while (true) {
                        C3503gA[] c3503gAArr = this.v;
                        if (i3 >= c3503gAArr.length) {
                            break;
                        }
                        C4619sw c4619swT = c3503gAArr[i3].t();
                        FW.t(c4619swT);
                        C4619sw c4619sw = this.I.a(i2).d[0];
                        String str = c4619sw.l;
                        String str2 = c4619swT.l;
                        int i4 = AbstractC5011xP.i(str2);
                        if (i4 != 3) {
                            if (i4 == AbstractC5011xP.i(str)) {
                                this.K[i2] = i3;
                                break;
                            }
                            i3++;
                        } else {
                            if (Ug0.a(str2, str) && (!(MimeTypes.APPLICATION_CEA608.equals(str2) || MimeTypes.APPLICATION_CEA708.equals(str2)) || c4619swT.D == c4619sw.D)) {
                                this.K[i2] = i3;
                                break;
                                break;
                            }
                            i3++;
                        }
                    }
                }
                Iterator it = this.s.iterator();
                while (it.hasNext()) {
                    ((C3239dA) it.next()).b();
                }
                return;
            }
            int length = this.v.length;
            int i5 = 0;
            int i6 = -2;
            int i7 = -1;
            while (true) {
                int i8 = 2;
                if (i5 >= length) {
                    break;
                }
                C4619sw c4619swT2 = this.v[i5].t();
                FW.t(c4619swT2);
                String str3 = c4619swT2.l;
                if (!AbstractC5011xP.m(str3)) {
                    i8 = AbstractC5011xP.k(str3) ? 1 : AbstractC5011xP.l(str3) ? 3 : -2;
                }
                if (n(i8) > n(i6)) {
                    i7 = i5;
                    i6 = i8;
                } else if (i8 == i6 && i7 != -1) {
                    i7 = -1;
                }
                i5++;
            }
            C3974ld0 c3974ld0 = this.d.h;
            int i9 = c3974ld0.f4655a;
            this.L = -1;
            this.K = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                this.K[i10] = i10;
            }
            C3974ld0[] c3974ld0Arr = new C3974ld0[length];
            int i11 = 0;
            while (i11 < length) {
                C4619sw c4619swT3 = this.v[i11].t();
                FW.t(c4619swT3);
                String str4 = this.f4449a;
                C4619sw c4619sw2 = this.f;
                if (i11 == i7) {
                    C4619sw[] c4619swArr = new C4619sw[i9];
                    for (int i12 = 0; i12 < i9; i12++) {
                        C4619sw c4619swE = c3974ld0.d[i12];
                        if (i6 == 1 && c4619sw2 != null) {
                            c4619swE = c4619swE.e(c4619sw2);
                        }
                        c4619swArr[i12] = i9 == 1 ? c4619swT3.e(c4619swE) : j(c4619swE, c4619swT3, true);
                    }
                    c3974ld0Arr[i11] = new C3974ld0(str4, c4619swArr);
                    this.L = i11;
                } else {
                    if (i6 != 2 || !AbstractC5011xP.k(c4619swT3.l)) {
                        c4619sw2 = null;
                    }
                    StringBuilder sbQ = DM.q(str4, ":muxed:");
                    sbQ.append(i11 < i7 ? i11 : i11 - 1);
                    c3974ld0Arr[i11] = new C3974ld0(sbQ.toString(), j(c4619sw2, c4619swT3, false));
                }
                i11++;
            }
            this.I = i(c3974ld0Arr);
            FW.s(this.J == null);
            this.J = Collections.emptySet();
            this.D = true;
            this.c.D();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4985x40
    public final void reevaluateBuffer(long j) {
        OI oi = this.j;
        if (oi.c() || o()) {
            return;
        }
        boolean zD = oi.d();
        C2458Gz c2458Gz = this.d;
        List list = this.o;
        if (zD) {
            this.u.getClass();
            AbstractC2567Le abstractC2567Le = this.u;
            if (c2458Gz.n == null && c2458Gz.q.b(j, abstractC2567Le, list)) {
                oi.a();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && c2458Gz.b((C2536Jz) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            l(size);
        }
        int size2 = (c2458Gz.n != null || c2458Gz.q.length() < 2) ? list.size() : c2458Gz.q.evaluateQueueSize(j, list);
        if (size2 < this.n.size()) {
            l(size2);
        }
    }

    public final void s() throws IOException {
        this.j.maybeThrowError();
        C2458Gz c2458Gz = this.d;
        C3529ga c3529ga = c2458Gz.n;
        if (c3529ga != null) {
            throw c3529ga;
        }
        Uri uri = c2458Gz.o;
        if (uri == null || !c2458Gz.s) {
            return;
        }
        C3643hn c3643hn = (C3643hn) ((C3730in) c2458Gz.g).d.get(uri);
        c3643hn.b.maybeThrowError();
        IOException iOException = c3643hn.j;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void t(C3974ld0[] c3974ld0Arr, int... iArr) {
        this.I = i(c3974ld0Arr);
        this.J = new HashSet();
        for (int i : iArr) {
            this.J.add(this.I.a(i));
        }
        this.L = 0;
        Handler handler = this.r;
        Wm0 wm0 = this.c;
        Objects.requireNonNull(wm0);
        handler.post(new RunnableC3327eA(wm0, 2));
        this.D = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gA[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pd0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V20, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gA] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public final InterfaceC4326pd0 track(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set set = Y;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.x;
        SparseIntArray sparseIntArray = this.y;
        ?? c3503gA = 0;
        c3503gA = 0;
        if (zContains) {
            FW.h(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.w[i3] = i;
                }
                c3503gA = this.w[i3] == i ? this.v[i3] : h(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.v;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.w[i4] == i) {
                    c3503gA = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (c3503gA == 0) {
            if (this.U) {
                return h(i, i2);
            }
            int length = this.v.length;
            boolean z = i2 == 1 || i2 == 2;
            c3503gA = new C3503gA(this.e, this.g, this.h, this.t);
            c3503gA.t = this.P;
            if (z) {
                c3503gA.I = this.W;
                c3503gA.z = true;
            }
            long j = this.V;
            if (c3503gA.F != j) {
                c3503gA.F = j;
                c3503gA.z = true;
            }
            C2536Jz c2536Jz = this.X;
            if (c2536Jz != null) {
                c3503gA.C = c2536Jz.k;
            }
            c3503gA.f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.w, i5);
            this.w = iArrCopyOf;
            iArrCopyOf[length] = i;
            C3503gA[] c3503gAArr = this.v;
            int i6 = Ug0.f3833a;
            ?? CopyOf = Arrays.copyOf(c3503gAArr, c3503gAArr.length + 1);
            CopyOf[c3503gAArr.length] = c3503gA;
            this.v = (C3503gA[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.O, i5);
            this.O = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.M |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (n(i2) > n(this.A)) {
                this.B = length;
                this.A = i2;
            }
            this.N = Arrays.copyOf(this.N, i5);
        }
        if (i2 != 5) {
            return c3503gA;
        }
        if (this.z == null) {
            this.z = new C3415fA(c3503gA, this.l);
        }
        return this.z;
    }

    public final void u() {
        for (C3503gA c3503gA : this.v) {
            c3503gA.C(this.R);
        }
        this.R = false;
    }

    public final boolean v(long j, boolean z) {
        this.P = j;
        if (o()) {
            this.Q = j;
            return true;
        }
        if (this.C && !z) {
            int length = this.v.length;
            for (int i = 0; i < length; i++) {
                if (this.v[i].F(j, false) || (!this.O[i] && this.M)) {
                }
            }
            return false;
        }
        this.Q = j;
        this.T = false;
        this.n.clear();
        OI oi = this.j;
        if (oi.d()) {
            if (this.C) {
                for (C3503gA c3503gA : this.v) {
                    c3503gA.i();
                }
            }
            oi.a();
        } else {
            oi.c = null;
            u();
        }
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public final void a(O30 o30) {
    }
}
