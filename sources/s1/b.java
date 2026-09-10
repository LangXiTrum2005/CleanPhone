package s1;

import android.util.Pair;
import android.util.SparseArray;
import b2.p;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ea.b0;
import f2.a0;
import f2.b1;
import f2.c1;
import f2.d1;
import f2.i0;
import f2.k1;
import f2.n;
import i1.d0;
import i1.q0;
import i2.r;
import j2.o;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l1.y;
import n1.z;
import oa.f0;
import oa.j0;
import oa.k0;
import oa.n1;
import oa.q;
import p1.e1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a0, d1, g2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f49977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f49978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u1.h f49979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f49980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k5.g f49981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f49982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f49983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v9.e f49984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1 f49985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a[] f49986k;
    public final b0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f49987m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i0 f49989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i0 f49990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f2.z f49991q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n f49994t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public t1.c f49995u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f49996v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f49997w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f49999y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f49975z = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f49998x = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g2.i[] f49992r = new g2.i[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j[] f49993s = new j[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final IdentityHashMap f49988n = new IdentityHashMap();

    public b(int i10, t1.c cVar, k5.g gVar, int i11, p pVar, z zVar, u1.h hVar, i0 i0Var, b0 b0Var, i0 i0Var2, long j10, o oVar, v9.e eVar, b0 b0Var2, k0 k0Var, q1.j jVar) {
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        i1.p[][] pVarArr;
        i1.p[] pVarArrL;
        t1.f fVarD;
        Integer num;
        this.f49976a = i10;
        this.f49995u = cVar;
        this.f49981f = gVar;
        this.f49996v = i11;
        this.f49977b = pVar;
        this.f49978c = zVar;
        this.f49979d = hVar;
        this.f49990p = i0Var;
        this.f49980e = b0Var;
        this.f49989o = i0Var2;
        this.f49982g = j10;
        this.f49983h = oVar;
        this.f49984i = eVar;
        this.l = b0Var2;
        boolean z10 = true;
        this.f49987m = new m(cVar, k0Var, eVar);
        int i14 = 0;
        b0Var2.getClass();
        f0 f0Var = j0.f47265b;
        n1 n1Var = n1.f47281e;
        this.f49994t = new n(n1Var, n1Var);
        t1.h hVarA = cVar.a(i11);
        List list = hVarA.f50375d;
        this.f49997w = list;
        List list2 = hVarA.f50374c;
        int size = list2.size();
        HashMap map = new HashMap(q.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            map.put(Long.valueOf(((t1.a) list2.get(i15)).f50329a), Integer.valueOf(i15));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        int i16 = 0;
        while (i16 < size) {
            t1.a aVar = (t1.a) list2.get(i16);
            List list3 = aVar.f50333e;
            List list4 = aVar.f50334f;
            boolean z11 = z10;
            t1.f fVarD2 = d("http://dashif.org/guidelines/trickmode", list3);
            fVarD2 = fVarD2 == null ? d("http://dashif.org/guidelines/trickmode", list4) : fVarD2;
            int iIntValue = (fVarD2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(fVarD2.f50366b)))) == null || !b(aVar, (t1.a) list2.get(num.intValue()))) ? i16 : num.intValue();
            if (iIntValue == i16 && (fVarD = d("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = fVarD.f50366b;
                String str2 = y.f44830a;
                String[] strArrSplit = str.split(",", -1);
                int length = strArrSplit.length;
                for (int i17 = i14; i17 < length; i17++) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(strArrSplit[i17])));
                    if (num2 != null && b(aVar, (t1.a) list2.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i16) {
                List list5 = (List) sparseArray.get(i16);
                List list6 = (List) sparseArray.get(iIntValue);
                list6.addAll(list5);
                sparseArray.put(i16, list6);
                arrayList.remove(list5);
            }
            i16++;
            z10 = z11;
            i14 = 0;
        }
        boolean z12 = z10;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i18 = 0; i18 < size2; i18++) {
            int[] iArrH = com.bumptech.glide.c.H((Collection) arrayList.get(i18));
            iArr2[i18] = iArrH;
            Arrays.sort(iArrH);
        }
        boolean[] zArr2 = new boolean[size2];
        i1.p[][] pVarArr2 = new i1.p[size2][];
        int i19 = 0;
        int i20 = 0;
        while (i19 < size2) {
            int[] iArr3 = iArr2[i19];
            int length2 = iArr3.length;
            int i21 = 0;
            while (true) {
                if (i21 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((t1.a) list2.get(iArr3[i21])).f50331c;
                iArr = iArr2;
                for (int i22 = 0; i22 < list7.size(); i22++) {
                    if (!((t1.m) list7.get(i22)).f50391d.isEmpty()) {
                        zArr2[i19] = z12;
                        i20++;
                        break;
                    }
                }
                i21++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i19];
            int length3 = iArr4.length;
            int i23 = 0;
            while (true) {
                if (i23 >= length3) {
                    zArr = zArr2;
                    pVarArr = pVarArr2;
                    pVarArrL = new i1.p[0];
                    break;
                }
                int i24 = iArr4[i23];
                t1.a aVar2 = (t1.a) list2.get(i24);
                List list8 = ((t1.a) list2.get(i24)).f50332d;
                int[] iArr5 = iArr4;
                int i25 = 0;
                while (i25 < list8.size()) {
                    t1.f fVar = (t1.f) list8.get(i25);
                    zArr = zArr2;
                    pVarArr = pVarArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f50365a)) {
                        i1.o oVar2 = new i1.o();
                        oVar2.f42600m = d0.n(MimeTypes.APPLICATION_CEA608);
                        oVar2.f42589a = defpackage.e.r(new StringBuilder(), aVar2.f50329a, ":cea608");
                        pVarArrL = l(fVar, f49975z, new i1.p(oVar2));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f50365a)) {
                        i1.o oVar3 = new i1.o();
                        oVar3.f42600m = d0.n(MimeTypes.APPLICATION_CEA708);
                        oVar3.f42589a = defpackage.e.r(new StringBuilder(), aVar2.f50329a, ":cea708");
                        pVarArrL = l(fVar, A, new i1.p(oVar3));
                        break;
                    }
                    i25++;
                    pVarArr2 = pVarArr;
                    zArr2 = zArr;
                }
                i23++;
                iArr4 = iArr5;
            }
            pVarArr[i19] = pVarArrL;
            if (pVarArrL.length != 0) {
                i20++;
            }
            i19++;
            pVarArr2 = pVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        i1.p[][] pVarArr3 = pVarArr2;
        int size3 = list.size() + i20 + size2;
        q0[] q0VarArr = new q0[size3];
        a[] aVarArr = new a[size3];
        int i26 = 0;
        int i27 = 0;
        while (i26 < size2) {
            int[] iArr7 = iArr6[i26];
            ArrayList arrayList3 = new ArrayList();
            for (int i28 : iArr7) {
                arrayList3.addAll(((t1.a) list2.get(i28)).f50331c);
            }
            int size4 = arrayList3.size();
            i1.p[] pVarArr4 = new i1.p[size4];
            int i29 = 0;
            while (i29 < size4) {
                int i30 = size2;
                i1.p pVar2 = ((t1.m) arrayList3.get(i29)).f50388a;
                int i31 = i27;
                i1.o oVarA = pVar2.a();
                oVarA.N = hVar.d(pVar2);
                pVarArr4[i29] = new i1.p(oVarA);
                i29++;
                size2 = i30;
                i27 = i31;
            }
            int i32 = size2;
            int i33 = i27;
            t1.a aVar3 = (t1.a) list2.get(iArr7[0]);
            long j11 = aVar3.f50329a;
            String string = j11 != -1 ? Long.toString(j11) : l1.d.e(i26, "unset:");
            int i34 = i33 + 1;
            if (zArr3[i26]) {
                i12 = i33 + 2;
            } else {
                i12 = i34;
                i34 = -1;
            }
            if (pVarArr3[i26].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            k(pVar, pVarArr4);
            List list9 = list2;
            q0VarArr[i33] = new q0(string, pVarArr4);
            int i35 = aVar3.f50330b;
            f0 f0Var2 = j0.f47265b;
            n1 n1Var2 = n1.f47281e;
            a aVar4 = new a(i35, 0, iArr7, i33, i34, i12, -1, n1Var2);
            int i36 = i33;
            aVarArr[i36] = aVar4;
            int i37 = -1;
            if (i34 != -1) {
                String strH = wi.d.h(string, ":emsg");
                i1.o oVar4 = new i1.o();
                oVar4.f42589a = strH;
                oVar4.f42600m = d0.n(MimeTypes.APPLICATION_EMSG);
                q0VarArr[i34] = new q0(strH, new i1.p(oVar4));
                aVarArr[i34] = new a(5, 1, iArr7, i36, -1, -1, -1, n1Var2);
                i37 = -1;
            }
            if (i12 != i37) {
                i36 = i36;
                String strH2 = wi.d.h(string, ":cc");
                aVarArr[i12] = new a(3, 1, iArr7, i36, -1, -1, -1, j0.y(pVarArr3[i26]));
                k(pVar, pVarArr3[i26]);
                q0VarArr[i12] = new q0(strH2, pVarArr3[i26]);
            } else {
                i36 = i36;
            }
            i26++;
            size2 = i32;
            i27 = i13;
            list2 = list9;
        }
        int i38 = 0;
        while (i38 < list.size()) {
            t1.g gVar2 = (t1.g) list.get(i38);
            i1.o oVar5 = new i1.o();
            oVar5.f42589a = gVar2.a();
            oVar5.f42600m = d0.n(MimeTypes.APPLICATION_EMSG);
            q0VarArr[i27] = new q0(gVar2.a() + ":" + i38, new i1.p(oVar5));
            f0 f0Var3 = j0.f47265b;
            aVarArr[i27] = new a(5, 2, new int[0], -1, -1, -1, i38, n1.f47281e);
            i38++;
            i27++;
        }
        Pair pairCreate = Pair.create(new k1(q0VarArr), aVarArr);
        this.f49985j = (k1) pairCreate.first;
        this.f49986k = (a[]) pairCreate.second;
    }

    public static boolean b(t1.a aVar, t1.a aVar2) {
        int i10 = aVar.f50330b;
        List list = aVar.f50331c;
        int i11 = aVar2.f50330b;
        List list2 = aVar2.f50331c;
        if (i10 == i11) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            i1.p pVar = ((t1.m) list.get(0)).f50388a;
            i1.p pVar2 = ((t1.m) list2.get(0)).f50388a;
            int i12 = pVar.f42636f & (-16385);
            int i13 = pVar2.f42636f & (-16385);
            if (Objects.equals(pVar.f42634d, pVar2.f42634d) && i12 == i13) {
                return true;
            }
        }
        return false;
    }

    public static t1.f d(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            t1.f fVar = (t1.f) list.get(i10);
            if (str.equals(fVar.f50365a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void k(p pVar, i1.p[] pVarArr) {
        for (int i10 = 0; i10 < pVarArr.length; i10++) {
            i1.p pVar2 = pVarArr[i10];
            bc.i iVar = (bc.i) pVar.f5365d;
            if (iVar.f5552b && ((j2.n) iVar.f5553c).a(pVar2)) {
                i1.o oVarA = pVar2.a();
                String str = pVar2.f42641k;
                oVarA.f42600m = d0.n("application/x-media3-cues");
                oVarA.K = ((j2.n) iVar.f5553c).h(pVar2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(pVar2.f42643n);
                sb2.append(str != null ? " ".concat(str) : "");
                oVarA.f42598j = sb2.toString();
                oVarA.f42605r = Long.MAX_VALUE;
                pVar2 = new i1.p(oVarA);
            }
            pVarArr[i10] = pVar2;
        }
    }

    public static i1.p[] l(t1.f fVar, Pattern pattern, i1.p pVar) {
        String str = fVar.f50366b;
        if (str == null) {
            return new i1.p[]{pVar};
        }
        String str2 = y.f44830a;
        String[] strArrSplit = str.split(";", -1);
        i1.p[] pVarArr = new i1.p[strArrSplit.length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            Matcher matcher = pattern.matcher(strArrSplit[i10]);
            if (!matcher.matches()) {
                return new i1.p[]{pVar};
            }
            int i11 = Integer.parseInt(matcher.group(1));
            i1.o oVarA = pVar.a();
            oVarA.f42589a = pVar.f42631a + ":" + i11;
            oVarA.J = i11;
            oVarA.f42592d = matcher.group(2);
            pVarArr[i10] = new i1.p(oVarA);
        }
        return pVarArr;
    }

    @Override // f2.a0
    public final long a(long j10, e1 e1Var) {
        for (g2.i iVar : this.f49992r) {
            if (iVar.f41380a == 2) {
                return iVar.f41384e.a(j10, e1Var);
            }
        }
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.a0
    public final long c(r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) throws Throwable {
        int i10;
        q0 q0Var;
        boolean z10;
        int[] iArr;
        int[] iArr2;
        int i11;
        int i12;
        int i13;
        q0 q0VarA;
        j0 j0Var;
        int i14;
        l lVar;
        boolean z11;
        r[] rVarArr2 = rVarArr;
        int[] iArr3 = new int[rVarArr2.length];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i10 = -1;
            if (i16 >= rVarArr2.length) {
                break;
            }
            r rVar = rVarArr2[i16];
            if (rVar != null) {
                iArr3[i16] = this.f49985j.b(rVar.getTrackGroup());
            } else {
                iArr3[i16] = -1;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            q0Var = null;
            if (i17 >= rVarArr2.length) {
                break;
            }
            if (rVarArr2[i17] == null || !zArr[i17]) {
                c1 c1Var = c1VarArr[i17];
                if (c1Var instanceof g2.i) {
                    ((g2.i) c1Var).q(this);
                } else if (c1Var instanceof g2.g) {
                    g2.g gVar = (g2.g) c1Var;
                    g2.i iVar = gVar.f41379e;
                    boolean[] zArr3 = iVar.f41383d;
                    int i18 = gVar.f41377c;
                    go.k.t(zArr3[i18]);
                    iVar.f41383d[i18] = false;
                }
                c1VarArr[i17] = null;
            }
            i17++;
        }
        int i19 = 0;
        while (true) {
            z10 = true;
            if (i19 >= rVarArr2.length) {
                break;
            }
            c1 c1Var2 = c1VarArr[i19];
            if ((c1Var2 instanceof f2.r) || (c1Var2 instanceof g2.g)) {
                int i20 = i(i19, iArr3);
                if (i20 == -1) {
                    z11 = c1VarArr[i19] instanceof f2.r;
                } else {
                    c1 c1Var3 = c1VarArr[i19];
                    z11 = (c1Var3 instanceof g2.g) && ((g2.g) c1Var3).f41375a == c1VarArr[i20];
                }
                if (!z11) {
                    c1 c1Var4 = c1VarArr[i19];
                    if (c1Var4 instanceof g2.g) {
                        g2.g gVar2 = (g2.g) c1Var4;
                        g2.i iVar2 = gVar2.f41379e;
                        boolean[] zArr4 = iVar2.f41383d;
                        int i21 = gVar2.f41377c;
                        go.k.t(zArr4[i21]);
                        iVar2.f41383d[i21] = false;
                    }
                    c1VarArr[i19] = null;
                }
            }
            i19++;
        }
        int i22 = 0;
        while (i22 < rVarArr2.length) {
            r rVar2 = rVarArr2[i22];
            if (rVar2 == null) {
                iArr2 = iArr3;
                i11 = i15;
                i12 = i22;
            } else {
                c1 c1Var5 = c1VarArr[i22];
                if (c1Var5 == null) {
                    zArr2[i22] = z10;
                    a aVar = this.f49986k[iArr3[i22]];
                    int i23 = aVar.f49969c;
                    if (i23 == 0) {
                        int i24 = aVar.f49972f;
                        boolean z12 = i24 != i10 ? z10 ? 1 : 0 : i15;
                        if (z12 != 0) {
                            q0VarA = this.f49985j.a(i24);
                            i13 = z10 ? 1 : 0;
                        } else {
                            i13 = i15;
                            q0VarA = q0Var;
                        }
                        int i25 = aVar.f49973g;
                        if (i25 != i10) {
                            j0Var = this.f49986k[i25].f49974h;
                        } else {
                            f0 f0Var = j0.f47265b;
                            j0Var = n1.f47281e;
                        }
                        int size = j0Var.size() + i13;
                        i1.p[] pVarArr = new i1.p[size];
                        int[] iArr4 = new int[size];
                        if (z12 != 0) {
                            pVarArr[i15] = q0VarA.f42662d[i15];
                            iArr4[i15] = 5;
                            i14 = z10 ? 1 : 0;
                        } else {
                            i14 = i15;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i26 = i15; i26 < j0Var.size(); i26++) {
                            i1.p pVar = (i1.p) j0Var.get(i26);
                            pVarArr[i14] = pVar;
                            iArr4[i14] = 3;
                            arrayList.add(pVar);
                            i14 += z10 ? 1 : 0;
                        }
                        if (!this.f49995u.f50342d || z12 == 0) {
                            lVar = q0Var;
                        } else {
                            m mVar = this.f49987m;
                            lVar = new l(mVar, mVar.f50065a);
                        }
                        p pVar2 = this.f49977b;
                        o oVar = this.f49983h;
                        t1.c cVar = this.f49995u;
                        k5.g gVar3 = this.f49981f;
                        int i27 = this.f49996v;
                        int[] iArr5 = aVar.f49967a;
                        int i28 = aVar.f49968b;
                        long j11 = this.f49982g;
                        int[] iArr6 = iArr3;
                        z zVar = this.f49978c;
                        n1.h hVarCreateDataSource = ((n1.g) pVar2.f5364c).createDataSource();
                        if (zVar != null) {
                            hVarCreateDataSource.c(zVar);
                        }
                        i iVar3 = new i((bc.i) pVar2.f5365d, oVar, cVar, gVar3, i27, iArr5, rVar2, i28, hVarCreateDataSource, j11, pVar2.f5363b, z12, arrayList, lVar);
                        Object obj = lVar;
                        iArr2 = iArr6;
                        q0Var = null;
                        i12 = i22;
                        g2.i iVar4 = new g2.i(aVar.f49968b, iArr4, pVarArr, iVar3, this, this.f49984i, j10, this.f49979d, this.f49990p, this.f49980e, this.f49989o, this.f49998x, null);
                        synchronized (this) {
                            this.f49988n.put(iVar4, obj);
                        }
                        c1VarArr[i12] = iVar4;
                    } else {
                        iArr2 = iArr3;
                        i12 = i22;
                        if (i23 == 2) {
                            i11 = 0;
                            c1VarArr[i12] = new j((t1.g) this.f49997w.get(aVar.f49970d), rVar2.getTrackGroup().f42662d[0], this.f49995u.f50342d);
                        }
                    }
                    i11 = 0;
                } else {
                    iArr2 = iArr3;
                    i11 = i15;
                    i12 = i22;
                    if (c1Var5 instanceof g2.i) {
                        ((i) ((g2.i) c1Var5).f41384e).f50046j = rVar2;
                    }
                }
            }
            i22 = i12 + 1;
            rVarArr2 = rVarArr;
            i15 = i11;
            iArr3 = iArr2;
            i10 = -1;
            z10 = true;
        }
        int[] iArr7 = iArr3;
        boolean z13 = i15;
        int i29 = z13 ? 1 : 0;
        while (i29 < rVarArr.length) {
            if (c1VarArr[i29] != null || rVarArr[i29] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                a aVar2 = this.f49986k[iArr[i29]];
                if (aVar2.f49969c == 1) {
                    int i30 = i(i29, iArr);
                    if (i30 == -1) {
                        c1VarArr[i29] = new f2.r();
                    } else {
                        g2.i iVar5 = (g2.i) c1VarArr[i30];
                        int i31 = aVar2.f49968b;
                        boolean[] zArr5 = iVar5.f41383d;
                        b1[] b1VarArr = iVar5.f41392n;
                        int i32 = z13 ? 1 : 0;
                        while (true) {
                            if (i32 >= b1VarArr.length) {
                                throw new IllegalStateException();
                            }
                            if (iVar5.f41381b[i32] == i31) {
                                go.k.t(!zArr5[i32]);
                                zArr5[i32] = true;
                                b1VarArr[i32].G(j10, true);
                                c1VarArr[i29] = new g2.g(iVar5, iVar5, b1VarArr[i32], i32);
                                break;
                            }
                            i32++;
                        }
                    }
                }
                i29++;
                iArr7 = iArr;
            }
            i29++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = c1VarArr.length;
        for (int i33 = z13 ? 1 : 0; i33 < length; i33++) {
            c1 c1Var6 = c1VarArr[i33];
            if (c1Var6 instanceof g2.i) {
                arrayList2.add((g2.i) c1Var6);
            } else if (c1Var6 instanceof j) {
                arrayList3.add((j) c1Var6);
            }
        }
        g2.i[] iVarArr = new g2.i[arrayList2.size()];
        this.f49992r = iVarArr;
        arrayList2.toArray(iVarArr);
        j[] jVarArr = new j[arrayList3.size()];
        this.f49993s = jVarArr;
        arrayList3.toArray(jVarArr);
        b0 b0Var = this.l;
        AbstractList abstractListZ = q.z(arrayList2, new d2.c(13));
        b0Var.getClass();
        this.f49994t = new n(arrayList2, abstractListZ);
        if (this.f49998x) {
            this.f49998x = z13;
            this.f49999y = j10;
        }
        return j10;
    }

    @Override // f2.a0
    public final void e(f2.z zVar, long j10) {
        this.f49991q = zVar;
        zVar.j(this);
    }

    @Override // f2.e1
    public final boolean f(p1.k0 k0Var) {
        return this.f49994t.f(k0Var);
    }

    @Override // f2.a0
    public final void g(long j10) throws Throwable {
        for (g2.i iVar : this.f49992r) {
            iVar.g(j10);
        }
    }

    @Override // f2.e1
    public final long getBufferedPositionUs() {
        return this.f49994t.getBufferedPositionUs();
    }

    @Override // f2.e1
    public final long getNextLoadPositionUs() {
        return this.f49994t.getNextLoadPositionUs();
    }

    @Override // f2.a0
    public final k1 getTrackGroups() {
        return this.f49985j;
    }

    @Override // f2.d1
    public final void h(f2.e1 e1Var) {
        this.f49991q.h(this);
    }

    public final int i(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.f49986k;
            int i12 = aVarArr[i11].f49971e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f49969c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override // f2.e1
    public final boolean isLoading() {
        return this.f49994t.isLoading();
    }

    @Override // f2.a0
    public final void maybeThrowPrepareError() {
        this.f49983h.maybeThrowError();
    }

    @Override // f2.a0
    public final long readDiscontinuity() {
        for (g2.i iVar : this.f49992r) {
            iVar.getClass();
            try {
                boolean z10 = iVar.f41402x;
                iVar.f41402x = false;
                if (z10) {
                    return this.f49999y;
                }
            } catch (Throwable th2) {
                iVar.f41402x = false;
                throw th2;
            }
        }
        return C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    @Override // f2.e1
    public final void reevaluateBuffer(long j10) {
        int i10;
        g2.i[] iVarArr = this.f49992r;
        int length = iVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            g2.i iVar = iVarArr[i11];
            if (iVar.f41388i.c()) {
                i10 = i11;
            } else {
                long jC = this.f49995u.c(this.f49996v);
                b1 b1Var = iVar.f41391m;
                go.k.t(!iVar.f41388i.c());
                if (iVar.m() || jC == C.TIME_UNSET || iVar.f41390k.isEmpty()) {
                    i10 = i11;
                } else {
                    g2.a aVarK = iVar.k();
                    long j11 = aVarK.l;
                    if (j11 == C.TIME_UNSET) {
                        j11 = aVarK.f41373h;
                    }
                    if (j11 <= jC) {
                        i10 = i11;
                    } else {
                        long jQ = b1Var.q();
                        if (jQ <= jC) {
                            i10 = i11;
                        } else {
                            b1Var.l(Math.max(jC, b1Var.r() + 1));
                            b1[] b1VarArr = iVar.f41392n;
                            int length2 = b1VarArr.length;
                            int i12 = 0;
                            while (i12 < length2) {
                                b1 b1Var2 = b1VarArr[i12];
                                b1Var2.l(Math.max(jC, b1Var2.r() + 1));
                                i12++;
                                i11 = i11;
                            }
                            i10 = i11;
                            iVar.f41386g.i(iVar.f41380a, jC, jQ);
                        }
                    }
                }
            }
            i11 = i10 + 1;
        }
        this.f49994t.reevaluateBuffer(j10);
    }

    @Override // f2.a0
    public final long seekToUs(long j10) throws Throwable {
        for (g2.i iVar : this.f49992r) {
            iVar.r(j10);
        }
        for (j jVar : this.f49993s) {
            int iB = y.b(jVar.f50052c, j10, true);
            jVar.f50056g = iB;
            jVar.f50057h = (jVar.f50053d && iB == jVar.f50052c.length) ? j10 : C.TIME_UNSET;
        }
        return j10;
    }
}
