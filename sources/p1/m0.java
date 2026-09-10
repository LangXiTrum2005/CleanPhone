package p1;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.applovin.impl.n9;
import com.google.android.gms.internal.ads.j91;
import com.google.android.gms.internal.ads.lo0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import f2.k1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import oa.i1;
import oa.j1;
import oa.l1;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f48110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f2.c1[] f48112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f48113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f48114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f48115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n0 f48116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f48117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f48118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a[] f48119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i2.u f48120k;
    public final lo0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m0 f48121m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k1 f48122n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i2.v f48123o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f48124p;

    public m0(a[] aVarArr, long j10, i2.u uVar, v9.e eVar, lo0 lo0Var, n0 n0Var, i2.v vVar) {
        this.f48119j = aVarArr;
        this.f48124p = j10;
        this.f48120k = uVar;
        this.l = lo0Var;
        f2.c0 c0Var = n0Var.f48126a;
        this.f48111b = c0Var.f40307a;
        this.f48116g = n0Var;
        this.f48122n = k1.f40385d;
        this.f48123o = vVar;
        this.f48112c = new f2.c1[aVarArr.length];
        this.f48118i = new boolean[aVarArr.length];
        long j11 = n0Var.f48127b;
        long j12 = n0Var.f48129d;
        boolean z10 = n0Var.f48131f;
        lo0Var.getClass();
        Object obj = c0Var.f40307a;
        int i10 = b1.f47961k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        f2.c0 c0VarA = c0Var.a(pair.second);
        v0 v0Var = (v0) ((HashMap) lo0Var.f17084e).get(obj2);
        v0Var.getClass();
        ((HashSet) lo0Var.f17087h).add(v0Var);
        u0 u0Var = (u0) ((HashMap) lo0Var.f17086g).get(v0Var);
        if (u0Var != null) {
            u0Var.f48167a.g(u0Var.f48168b);
        }
        v0Var.f48173c.add(c0VarA);
        f2.a0 a0VarC = v0Var.f48171a.c(c0VarA, eVar, j11);
        ((IdentityHashMap) lo0Var.f17083d).put(a0VarC, v0Var);
        lo0Var.d();
        this.f48110a = j12 != C.TIME_UNSET ? new f2.d(a0VarC, !z10, 0L, j12) : a0VarC;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [f2.a0, java.lang.Object] */
    public final long a(i2.v vVar, long j10, boolean z10, boolean[] zArr) {
        a[] aVarArr;
        f2.c1[] c1VarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= vVar.f42837a) {
                break;
            }
            if (z10 || !vVar.a(this.f48123o, i10)) {
                z11 = false;
            }
            this.f48118i[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            aVarArr = this.f48119j;
            int length = aVarArr.length;
            c1VarArr = this.f48112c;
            if (i11 >= length) {
                break;
            }
            if (aVarArr[i11].f47906b == -2) {
                c1VarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f48123o = vVar;
        c();
        long jC = this.f48110a.c(vVar.f42839c, this.f48118i, this.f48112c, zArr, j10);
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            if (aVarArr[i12].f47906b == -2 && this.f48123o.b(i12)) {
                c1VarArr[i12] = new f2.r();
            }
        }
        this.f48115f = false;
        for (int i13 = 0; i13 < c1VarArr.length; i13++) {
            if (c1VarArr[i13] != null) {
                go.k.t(vVar.b(i13));
                if (aVarArr[i13].f47906b != -2) {
                    this.f48115f = true;
                }
            } else {
                go.k.t(vVar.f42839c[i13] == null);
            }
        }
        return jC;
    }

    public final void b() {
        if (this.f48121m != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            i2.v vVar = this.f48123o;
            if (i10 >= vVar.f42837a) {
                return;
            }
            boolean zB = vVar.b(i10);
            i2.r rVar = this.f48123o.f42839c[i10];
            if (zB && rVar != null) {
                rVar.disable();
            }
            i10++;
        }
    }

    public final void c() {
        if (this.f48121m != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            i2.v vVar = this.f48123o;
            if (i10 >= vVar.f42837a) {
                return;
            }
            boolean zB = vVar.b(i10);
            i2.r rVar = this.f48123o.f42839c[i10];
            if (zB && rVar != null) {
                rVar.enable();
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [f2.e1, java.lang.Object] */
    public final long d() {
        if (!this.f48114e) {
            return this.f48116g.f48127b;
        }
        long bufferedPositionUs = this.f48115f ? this.f48110a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f48116g.f48130e : bufferedPositionUs;
    }

    public final long e() {
        return this.f48116g.f48127b + this.f48124p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [f2.a0, java.lang.Object] */
    public final void f(float f10, i1.p0 p0Var, boolean z10) {
        this.f48114e = true;
        this.f48122n = this.f48110a.getTrackGroups();
        i2.v vVarJ = j(f10, p0Var, z10);
        n0 n0Var = this.f48116g;
        long jMax = n0Var.f48127b;
        long j10 = n0Var.f48130e;
        if (j10 != C.TIME_UNSET && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(vVarJ, jMax, false, new boolean[this.f48119j.length]);
        long j11 = this.f48124p;
        n0 n0Var2 = this.f48116g;
        this.f48124p = (n0Var2.f48127b - jA) + j11;
        this.f48116g = n0Var2.b(jA);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [f2.e1, java.lang.Object] */
    public final boolean g() {
        if (this.f48114e) {
            return !this.f48115f || this.f48110a.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.f48114e) {
            return g() || d() - this.f48116g.f48127b >= C.TIME_UNSET;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f2.a0, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i() {
        b();
        ?? r0 = this.f48110a;
        try {
            boolean z10 = r0 instanceof f2.d;
            lo0 lo0Var = this.l;
            if (z10) {
                lo0Var.g(((f2.d) r0).f40312a);
            } else {
                lo0Var.g(r0);
            }
        } catch (RuntimeException e10) {
            l1.a.f("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v31, types: [i2.q] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57, types: [i2.g] */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r5v3, types: [i2.q[]] */
    /* JADX WARN: Type inference failed for: r6v42, types: [i2.q] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v84 */
    /* JADX WARN: Type inference failed for: r7v50, types: [i2.q] */
    public final i2.v j(float f10, i1.p0 p0Var, boolean z10) {
        i2.i iVar;
        ?? r10;
        String str;
        i1.q0 q0Var;
        Pair pairG;
        Object languageTag;
        long j10;
        boolean z11;
        n1 n1VarB;
        i2.r bVar;
        int i10;
        int[] iArr;
        i1.q0 q0Var2;
        int i11;
        int[] iArr2;
        i1.q0 q0Var3;
        int[] iArr3;
        CaptioningManager captioningManager;
        Locale locale;
        Context context;
        int[] iArr4;
        i2.u uVar = this.f48120k;
        a[] aVarArr = this.f48119j;
        k1 k1Var = this.f48122n;
        uVar.getClass();
        int i12 = 1;
        int[] iArr5 = new int[aVarArr.length + 1];
        int length = aVarArr.length + 1;
        i1.q0[][] q0VarArr = new i1.q0[length][];
        int[][][] iArr6 = new int[aVarArr.length + 1][][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = k1Var.f40386a;
            q0VarArr[i13] = new i1.q0[i14];
            iArr6[i13] = new int[i14][];
        }
        int length2 = aVarArr.length;
        int[] iArr7 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            iArr7[i15] = aVarArr[i15].B();
        }
        int i16 = 0;
        while (i16 < k1Var.f40386a) {
            i1.q0 q0VarA = k1Var.a(i16);
            int i17 = q0VarA.f42661c == 5 ? i12 : 0;
            int length3 = aVarArr.length;
            int i18 = i12;
            int i19 = 0;
            int i20 = 0;
            while (i20 < aVarArr.length) {
                a aVar = aVarArr[i20];
                i2.u uVar2 = uVar;
                k1 k1Var2 = k1Var;
                int i21 = i12;
                int iMax = 0;
                for (int i22 = 0; i22 < q0VarA.f42659a; i22++) {
                    iMax = Math.max(iMax, aVar.A(q0VarA.f42662d[i22]) & 7);
                }
                int i23 = iArr5[i20] == 0 ? i21 : 0;
                if (iMax > i19 || (iMax == i19 && i17 != 0 && i18 == 0 && i23 != 0)) {
                    i19 = iMax;
                    i18 = i23;
                    length3 = i20;
                }
                i20++;
                i12 = i21;
                uVar = uVar2;
                k1Var = k1Var2;
            }
            i2.u uVar3 = uVar;
            k1 k1Var3 = k1Var;
            int i24 = i12;
            if (length3 == aVarArr.length) {
                iArr4 = new int[q0VarA.f42659a];
            } else {
                a aVar2 = aVarArr[length3];
                int[] iArr8 = new int[q0VarA.f42659a];
                for (int i25 = 0; i25 < q0VarA.f42659a; i25++) {
                    iArr8[i25] = aVar2.A(q0VarA.f42662d[i25]);
                }
                iArr4 = iArr8;
            }
            int i26 = iArr5[length3];
            q0VarArr[length3][i26] = q0VarA;
            iArr6[length3][i26] = iArr4;
            iArr5[length3] = i26 + 1;
            i16++;
            i12 = i24;
            uVar = uVar3;
            k1Var = k1Var3;
        }
        i2.u uVar4 = uVar;
        int i27 = i12;
        int i28 = 0;
        k1[] k1VarArr = new k1[aVarArr.length];
        String[] strArr = new String[aVarArr.length];
        int[] iArr9 = new int[aVarArr.length];
        for (int i29 = 0; i29 < aVarArr.length; i29++) {
            int i30 = iArr5[i29];
            k1VarArr[i29] = new k1((i1.q0[]) l1.y.O(q0VarArr[i29], i30));
            iArr6[i29] = (int[][]) l1.y.O(iArr6[i29], i30);
            strArr[i29] = aVarArr[i29].h();
            iArr9[i29] = aVarArr[i29].f47906b;
        }
        i2.t tVar = new i2.t(iArr9, k1VarArr, iArr7, iArr6, new k1((i1.q0[]) l1.y.O(q0VarArr[aVarArr.length], iArr5[aVarArr.length])));
        i2.p pVar = (i2.p) uVar4;
        synchronized (pVar.f42819c) {
            pVar.f42823g = Thread.currentThread();
            iVar = pVar.f42822f;
        }
        if (pVar.f42826j == null && (context = pVar.f42820d) != null) {
            pVar.f42826j = Boolean.valueOf(l1.y.K(context));
        }
        if (iVar.A && Build.VERSION.SDK_INT >= 32 && pVar.f42824h == null) {
            pVar.f42824h = new i2.k(pVar.f42820d, pVar, pVar.f42826j);
        }
        int i31 = tVar.f42829a;
        Context context2 = pVar.f42820d;
        ?? r11 = new i2.q[i31];
        int i32 = 0;
        while (true) {
            if (i32 >= tVar.f42829a) {
                r10 = 0;
                break;
            }
            if (2 == iArr9[i32] && k1VarArr[i32].f40386a > 0) {
                r10 = i27;
                break;
            }
            i32++;
        }
        Pair pairG2 = i2.p.g(i27, tVar, iArr6, new gc.b(pVar, iVar, r10, iArr7), new b2.j(8));
        if (pairG2 != null) {
            r11[((Integer) pairG2.second).intValue()] = (i2.q) pairG2.first;
        }
        if (pairG2 == null) {
            str = null;
        } else {
            i2.q qVar = (i2.q) pairG2.first;
            str = qVar.f42827a.f42662d[qVar.f42828b[0]].f42634d;
        }
        iVar.f42688q.getClass();
        Pair pairG3 = i2.p.g(2, tVar, iArr6, new n9(iVar, str, iArr7, (!iVar.f42679g || context2 == null) ? null : l1.y.x(context2)), new b2.j(7));
        int i33 = 4;
        if (pairG3 == null) {
            q0Var = null;
            pairG = i2.p.g(4, tVar, iArr6, new a4.a(iVar, 28), new b2.j(6));
        } else {
            q0Var = null;
            pairG = null;
        }
        if (pairG != null) {
            r11[((Integer) pairG.second).intValue()] = (i2.q) pairG.first;
        } else if (pairG3 != null) {
            r11[((Integer) pairG3.second).intValue()] = (i2.q) pairG3.first;
        }
        if (!iVar.f42691t || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = q0Var;
        } else {
            String str2 = l1.y.f44830a;
            languageTag = locale.toLanguageTag();
        }
        int i34 = 3;
        Pair pairG4 = i2.p.g(3, tVar, iArr6, new ac.a(iVar, str, languageTag, 9), new b2.j(9));
        if (pairG4 != null) {
            r11[((Integer) pairG4.second).intValue()] = (i2.q) pairG4.first;
        }
        int i35 = 0;
        while (i35 < i31) {
            int i36 = iArr9[i35];
            if (i36 == 2 || i36 == 1 || i36 == i34 || i36 == i33) {
                i11 = i35;
                iArr2 = iArr9;
            } else {
                k1 k1Var4 = k1VarArr[i35];
                int[][] iArr10 = iArr6[i35];
                int i37 = i28;
                int i38 = i37;
                i1.q0 q0Var4 = q0Var;
                ?? r21 = q0Var4;
                while (i37 < k1Var4.f40386a) {
                    i1.q0 q0VarA2 = k1Var4.a(i37);
                    int[] iArr11 = iArr10[i37];
                    int i39 = i35;
                    k1 k1Var5 = k1Var4;
                    ?? r12 = r21;
                    int i40 = i38;
                    i1.q0 q0Var5 = q0Var4;
                    int i41 = i28;
                    while (i41 < q0VarA2.f42659a) {
                        int[][] iArr12 = iArr10;
                        if (a.k(iArr11[i41], iVar.B)) {
                            q0Var3 = q0VarA2;
                            i2.g gVar = new i2.g(q0VarA2.f42662d[i41], iArr11[i41]);
                            if (r12 != 0) {
                                iArr3 = iArr9;
                                if (oa.y.f47346a.c(gVar.f42773b, r12.f42773b).c(gVar.f42772a, r12.f42772a).e() > 0) {
                                }
                            } else {
                                iArr3 = iArr9;
                            }
                            r12 = gVar;
                            i40 = i41;
                            q0Var5 = q0Var3;
                        } else {
                            q0Var3 = q0VarA2;
                            iArr3 = iArr9;
                        }
                        i41++;
                        iArr10 = iArr12;
                        q0VarA2 = q0Var3;
                        iArr9 = iArr3;
                        r12 = r12;
                    }
                    i37++;
                    q0Var4 = q0Var5;
                    i38 = i40;
                    k1Var4 = k1Var5;
                    r21 = r12;
                    i35 = i39;
                }
                i11 = i35;
                iArr2 = iArr9;
                r11[i11] = q0Var4 == null ? q0Var : new i2.q(i28, q0Var4, new int[]{i38});
            }
            i35 = i11 + 1;
            iArr9 = iArr2;
            i28 = 0;
            i34 = 3;
            i33 = 4;
        }
        int i42 = tVar.f42829a;
        k1[] k1VarArr2 = tVar.f42831c;
        HashMap map = new HashMap();
        for (int i43 = 0; i43 < i42; i43++) {
            i2.p.c(k1VarArr2[i43], iVar, map);
        }
        i2.p.c(tVar.f42834f, iVar, map);
        for (int i44 = 0; i44 < i42; i44++) {
            i1.r0 r0Var = (i1.r0) map.get(Integer.valueOf(tVar.f42830b[i44]));
            if (r0Var != null) {
                i1.q0 q0Var6 = r0Var.f42665a;
                oa.j0 j0Var = r0Var.f42666b;
                r11[i44] = (j0Var.isEmpty() || k1VarArr2[i44].b(q0Var6) == -1) ? q0Var : new i2.q(0, q0Var6, com.bumptech.glide.c.H(j0Var));
            }
        }
        int i45 = tVar.f42829a;
        for (int i46 = 0; i46 < i45; i46++) {
            k1 k1Var6 = tVar.f42831c[i46];
            Map map2 = (Map) iVar.D.get(i46);
            if (map2 != null && map2.containsKey(k1Var6)) {
                Map map3 = (Map) iVar.D.get(i46);
                if (map3 != null && map3.get(k1Var6) != null) {
                    throw new ClassCastException();
                }
                r11[i46] = q0Var;
            }
        }
        for (int i47 = 0; i47 < i31; i47++) {
            int i48 = tVar.f42830b[i47];
            if (iVar.E.get(i47) || iVar.f42693v.contains(Integer.valueOf(i48))) {
                r11[i47] = q0Var;
            }
        }
        ea.a0 a0Var = pVar.f42821e;
        j2.d dVar = pVar.f42836b;
        dVar.getClass();
        a0Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i49 = 0;
        while (i49 < r11.length) {
            ?? r13 = r11[i49];
            if (r13 == 0 || r13.f42828b.length <= 1) {
                q0Var2 = q0Var;
                arrayList.add(q0Var2);
            } else {
                oa.e0 e0VarU = oa.j0.u();
                e0VarU.b(new i2.a(0L, 0L));
                arrayList.add(e0VarU);
                q0Var2 = q0Var;
            }
            i49++;
            q0Var = q0Var2;
        }
        int length4 = r11.length;
        long[][] jArr = new long[length4][];
        int i50 = 0;
        while (true) {
            j10 = -1;
            if (i50 >= r11.length) {
                break;
            }
            ?? r14 = r11[i50];
            if (r14 == 0) {
                jArr[i50] = new long[0];
            } else {
                int[] iArr13 = r14.f42828b;
                jArr[i50] = new long[iArr13.length];
                int i51 = 0;
                while (i51 < iArr13.length) {
                    int i52 = i51;
                    long j11 = r14.f42827a.f42662d[iArr13[i51]].f42640j;
                    long[] jArr2 = jArr[i50];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr2[i52] = j11;
                    i51 = i52 + 1;
                }
                Arrays.sort(jArr[i50]);
            }
            i50++;
        }
        int[] iArr14 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i53 = 0; i53 < length4; i53++) {
            long[] jArr4 = jArr[i53];
            jArr3[i53] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        i2.b.i(arrayList, jArr3);
        oa.q.d(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(l1.f47272a);
        i1 i1Var = new i1();
        j1 j1Var = new j1(treeMap);
        j1Var.f47266f = i1Var;
        int i54 = 0;
        while (i54 < length4) {
            long[] jArr5 = jArr[i54];
            long j12 = j10;
            if (jArr5.length <= 1) {
                i10 = length4;
                iArr = iArr14;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                int i55 = 0;
                while (true) {
                    long[] jArr6 = jArr[i54];
                    i10 = length4;
                    double dLog = 0.0d;
                    if (i55 >= jArr6.length) {
                        break;
                    }
                    int[] iArr15 = iArr14;
                    long j13 = jArr6[i55];
                    if (j13 != j12) {
                        dLog = Math.log(j13);
                    }
                    dArr[i55] = dLog;
                    i55++;
                    length4 = i10;
                    iArr14 = iArr15;
                }
                iArr = iArr14;
                int i56 = length5 - 1;
                double d10 = dArr[i56] - dArr[0];
                int i57 = 0;
                while (i57 < i56) {
                    double d11 = dArr[i57];
                    int i58 = i57 + 1;
                    Double dValueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i58]) * 0.5d) - dArr[0]) / d10);
                    Integer numValueOf = Integer.valueOf(i54);
                    double d12 = d10;
                    Collection collection = (Collection) j1Var.f47270d.get(dValueOf);
                    if (collection == null) {
                        Collection collectionK = j1Var.k();
                        if (!collectionK.add(numValueOf)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        j1Var.f47271e++;
                        j1Var.f47270d.put(dValueOf, collectionK);
                    } else if (collection.add(numValueOf)) {
                        j1Var.f47271e++;
                    }
                    i57 = i58;
                    d10 = d12;
                }
            }
            i54++;
            length4 = i10;
            iArr14 = iArr;
            j10 = j12;
            dVar = dVar;
        }
        j2.d dVar2 = dVar;
        int[] iArr16 = iArr14;
        Collection j91Var = j1Var.f47277b;
        if (j91Var == null) {
            j91Var = new j91(3, j1Var);
            j1Var.f47277b = j91Var;
        }
        oa.j0 j0VarX = oa.j0.x(j91Var);
        for (int i59 = 0; i59 < j0VarX.size(); i59++) {
            int iIntValue = ((Integer) j0VarX.get(i59)).intValue();
            int i60 = iArr16[iIntValue] + 1;
            iArr16[iIntValue] = i60;
            jArr3[iIntValue] = jArr[iIntValue][i60];
            i2.b.i(arrayList, jArr3);
        }
        for (int i61 = 0; i61 < r11.length; i61++) {
            if (arrayList.get(i61) != null) {
                jArr3[i61] = jArr3[i61] * 2;
            }
        }
        i2.b.i(arrayList, jArr3);
        oa.e0 e0VarU2 = oa.j0.u();
        for (int i62 = 0; i62 < arrayList.size(); i62++) {
            oa.e0 e0Var = (oa.e0) arrayList.get(i62);
            e0VarU2.b(e0Var == null ? n1.f47281e : e0Var.g());
        }
        n1 n1VarG = e0VarU2.g();
        i2.r[] rVarArr = new i2.r[r11.length];
        for (int i63 = 0; i63 < r11.length; i63++) {
            ?? r15 = r11[i63];
            if (r15 != 0) {
                int[] iArr17 = r15.f42828b;
                if (iArr17.length != 0) {
                    if (iArr17.length == 1) {
                        bVar = new i2.s(r15.f42827a, new int[]{iArr17[0]});
                    } else {
                        long j14 = 25000;
                        bVar = new i2.b(r15.f42827a, iArr17, dVar2, 10000, j14, j14, (oa.j0) n1VarG.get(i63));
                    }
                    rVarArr[i63] = bVar;
                }
            }
        }
        c1[] c1VarArr = new c1[i31];
        for (int i64 = 0; i64 < i31; i64++) {
            c1VarArr[i64] = (iVar.E.get(i64) || iVar.f42693v.contains(Integer.valueOf(tVar.f42830b[i64])) || (tVar.f42830b[i64] != -2 && rVarArr[i64] == null)) ? null : c1.f47978c;
        }
        iVar.f42688q.getClass();
        Pair pairCreate = Pair.create(c1VarArr, rVarArr);
        i2.r[] rVarArr2 = (i2.r[]) pairCreate.second;
        List[] listArr = new List[rVarArr2.length];
        for (int i65 = 0; i65 < rVarArr2.length; i65++) {
            i2.r rVar = rVarArr2[i65];
            if (rVar != null) {
                n1VarB = oa.j0.B(rVar);
            } else {
                oa.f0 f0Var = oa.j0.f47265b;
                n1VarB = n1.f47281e;
            }
            listArr[i65] = n1VarB;
        }
        oa.e0 e0Var2 = new oa.e0(4);
        int i66 = 0;
        while (true) {
            int i67 = tVar.f42829a;
            k1[] k1VarArr3 = tVar.f42831c;
            if (i66 >= i67) {
                break;
            }
            k1 k1Var7 = k1VarArr3[i66];
            List list = listArr[i66];
            int i68 = 0;
            while (i68 < k1Var7.f40386a) {
                i1.q0 q0VarA3 = k1Var7.a(i68);
                int i69 = k1VarArr3[i66].a(i68).f42659a;
                int[] iArr18 = new int[i69];
                int i70 = 0;
                int i71 = 0;
                while (i70 < i69) {
                    List[] listArr2 = listArr;
                    if ((tVar.f42833e[i66][i68][i70] & 7) == 4) {
                        iArr18[i71] = i70;
                        i71++;
                    }
                    i70++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr18, i71);
                k1 k1Var8 = k1Var7;
                int iMin = 16;
                String str3 = null;
                int i72 = 0;
                boolean z12 = false;
                int i73 = 0;
                while (i72 < iArrCopyOf.length) {
                    String str4 = k1VarArr3[i66].a(i68).f42662d[iArrCopyOf[i72]].f42643n;
                    int i74 = i73 + 1;
                    if (i73 == 0) {
                        str3 = str4;
                    } else {
                        z12 = (!Objects.equals(str3, str4)) | z12;
                    }
                    iMin = Math.min(iMin, tVar.f42833e[i66][i68][i72] & 24);
                    i72++;
                    i73 = i74;
                }
                if (z12) {
                    iMin = Math.min(iMin, tVar.f42832d[i66]);
                }
                boolean z13 = iMin != 0;
                int i75 = q0VarA3.f42659a;
                int[] iArr19 = new int[i75];
                boolean[] zArr = new boolean[i75];
                for (int i76 = 0; i76 < q0VarA3.f42659a; i76++) {
                    iArr19[i76] = tVar.f42833e[i66][i68][i76] & 7;
                    int i77 = 0;
                    while (true) {
                        if (i77 >= list.size()) {
                            z11 = false;
                            break;
                        }
                        i2.r rVar2 = (i2.r) list.get(i77);
                        if (rVar2.getTrackGroup().equals(q0VarA3) && rVar2.indexOf(i76) != -1) {
                            z11 = true;
                            break;
                        }
                        i77++;
                    }
                    zArr[i76] = z11;
                }
                e0Var2.b(new i1.u0(q0VarA3, z13, iArr19, zArr));
                i68++;
                listArr = listArr3;
                k1Var7 = k1Var8;
            }
            i66++;
        }
        k1 k1Var9 = tVar.f42834f;
        for (int i78 = 0; i78 < k1Var9.f40386a; i78++) {
            i1.q0 q0VarA4 = k1Var9.a(i78);
            int[] iArr20 = new int[q0VarA4.f42659a];
            Arrays.fill(iArr20, 0);
            e0Var2.b(new i1.u0(q0VarA4, false, iArr20, new boolean[q0VarA4.f42659a]));
        }
        i2.v vVar = new i2.v((c1[]) pairCreate.first, (i2.r[]) pairCreate.second, new i1.v0(e0Var2.g()), tVar);
        for (int i79 = 0; i79 < vVar.f42837a; i79++) {
            if (vVar.b(i79)) {
                go.k.t(vVar.f42839c[i79] != null || this.f48119j[i79].f47906b == -2);
            } else {
                go.k.t(vVar.f42839c[i79] == null);
            }
        }
        for (i2.r rVar3 : vVar.f42839c) {
            if (rVar3 != null) {
                rVar3.onPlaybackSpeed(f10);
                rVar3.g(z10);
            }
        }
        return vVar;
    }

    public final void k() {
        Object obj = this.f48110a;
        if (obj instanceof f2.d) {
            long j10 = this.f48116g.f48129d;
            if (j10 == C.TIME_UNSET) {
                j10 = Long.MIN_VALUE;
            }
            f2.d dVar = (f2.d) obj;
            dVar.f40317f = 0L;
            dVar.f40318g = j10;
        }
    }
}
