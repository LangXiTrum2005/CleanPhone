package f2;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import m0.s1;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.t f40426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s1 f40427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j2.n f40428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f40430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f40431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f40432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f40433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f40434i;

    public q(Context context) {
        this(new s1(context, 6), new n2.i());
    }

    public static b0 e(Class cls, n1.g gVar) {
        try {
            return (b0) cls.getConstructor(n1.g.class).newInstance(gVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // f2.b0
    public final a a(i1.y yVar) {
        i1.y yVar2;
        List list;
        Uri uri;
        String str;
        long j10;
        yVar.f42714b.getClass();
        String scheme = yVar.f42714b.f42704a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(yVar.f42714b.f42705b, "application/x-image-uri")) {
            long j11 = yVar.f42714b.f42708e;
            String str2 = l1.y.f44830a;
            throw null;
        }
        i1.v vVar = yVar.f42714b;
        int iF = l1.y.F(vVar.f42704a, vVar.f42705b);
        if (yVar.f42714b.f42708e != C.TIME_UNSET) {
            n2.i iVar = (n2.i) this.f40426a.f11766b;
            synchronized (iVar) {
                iVar.f46476d = 1;
            }
            n2.i iVar2 = (n2.i) this.f40426a.f11766b;
            synchronized (iVar2) {
                iVar2.f46477e = 1;
            }
        }
        try {
            com.google.android.gms.common.api.internal.t tVar = this.f40426a;
            HashMap map = (HashMap) tVar.f11768d;
            b0 b0Var = (b0) map.get(Integer.valueOf(iF));
            if (b0Var == null) {
                b0Var = (b0) tVar.f(iF).get();
                b0Var.b((j2.n) tVar.f11770f);
                b0Var.d(tVar.f11765a);
                b0Var.c();
                map.put(Integer.valueOf(iF), b0Var);
            }
            i1.t tVarA = yVar.f42715c.a();
            i1.u uVar = yVar.f42715c;
            if (uVar.f42694a == C.TIME_UNSET) {
                tVarA.f42668a = this.f40429d;
            }
            if (uVar.f42697d == -3.4028235E38f) {
                tVarA.f42671d = this.f40432g;
            }
            if (uVar.f42698e == -3.4028235E38f) {
                tVarA.f42672e = this.f40433h;
            }
            if (uVar.f42695b == C.TIME_UNSET) {
                tVarA.f42669b = this.f40430e;
            }
            if (uVar.f42696c == C.TIME_UNSET) {
                tVarA.f42670c = this.f40431f;
            }
            i1.u uVar2 = new i1.u(tVarA);
            if (uVar2.equals(yVar.f42715c)) {
                yVar2 = yVar;
            } else {
                new i1.w0();
                List list2 = Collections.EMPTY_LIST;
                oa.j0 j0Var = n1.f47281e;
                i1.w wVar = i1.w.f42711a;
                i1.s sVar = yVar.f42717e;
                q2 q2Var = new q2();
                q2Var.f18888a = sVar.f42664a;
                String str3 = yVar.f42713a;
                i1.a0 a0Var = yVar.f42716d;
                yVar.f42715c.a();
                i1.w wVar2 = yVar.f42718f;
                i1.v vVar2 = yVar.f42714b;
                if (vVar2 != null) {
                    String str4 = vVar2.f42705b;
                    Uri uri2 = vVar2.f42704a;
                    List list3 = vVar2.f42706c;
                    j0Var = vVar2.f42707d;
                    new i1.w0();
                    str = str4;
                    uri = uri2;
                    list = list3;
                    j10 = vVar2.f42708e;
                } else {
                    list = list2;
                    uri = null;
                    str = null;
                    j10 = -9223372036854775807L;
                }
                oa.j0 j0Var2 = j0Var;
                i1.t tVarA2 = uVar2.a();
                i1.v vVar3 = uri != null ? new i1.v(uri, str, null, list, j0Var2, j10) : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = str3;
                i1.s sVar2 = new i1.s(q2Var);
                i1.u uVar3 = new i1.u(tVarA2);
                if (a0Var == null) {
                    a0Var = i1.a0.B;
                }
                yVar2 = new i1.y(str5, sVar2, vVar3, uVar3, a0Var, wVar2);
            }
            a aVarA = b0Var.a(yVar2);
            oa.j0 j0Var3 = yVar2.f42714b.f42707d;
            if (!j0Var3.isEmpty()) {
                a[] aVarArr = new a[j0Var3.size() + 1];
                aVarArr[0] = aVarA;
                if (j0Var3.size() > 0) {
                    if (!this.f40434i) {
                        this.f40427b.getClass();
                        i1.x xVar = (i1.x) j0Var3.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        oa.f0 f0Var = oa.j0.f47265b;
                        n1 n1Var = n1.f47281e;
                        List list4 = Collections.EMPTY_LIST;
                        n1 n1Var2 = n1.f47281e;
                        i1.w wVar3 = i1.w.f42711a;
                        Uri uri3 = Uri.EMPTY;
                        xVar.getClass();
                        throw null;
                    }
                    i1.o oVar = new i1.o();
                    ((i1.x) j0Var3.get(0)).getClass();
                    ArrayList arrayList = i1.d0.f42529a;
                    oVar.f42600m = null;
                    ((i1.x) j0Var3.get(0)).getClass();
                    oVar.f42592d = null;
                    ((i1.x) j0Var3.get(0)).getClass();
                    oVar.f42593e = 0;
                    ((i1.x) j0Var3.get(0)).getClass();
                    oVar.f42594f = 0;
                    ((i1.x) j0Var3.get(0)).getClass();
                    oVar.f42590b = null;
                    ((i1.x) j0Var3.get(0)).getClass();
                    oVar.f42589a = null;
                    i1.p pVar = new i1.p(oVar);
                    if (this.f40428c.a(pVar)) {
                        i1.o oVarA = pVar.a();
                        oVarA.f42600m = i1.d0.n("application/x-media3-cues");
                        oVarA.f42598j = pVar.f42643n;
                        oVarA.K = this.f40428c.h(pVar);
                        new i1.p(oVarA);
                    }
                    ((i1.x) j0Var3.get(0)).getClass();
                    throw null;
                }
                aVarA = new n0(aVarArr);
            }
            i1.s sVar3 = yVar2.f42717e;
            if (sVar3.f42664a != Long.MIN_VALUE) {
                e eVar = new e();
                aVarA.getClass();
                eVar.f40323d = aVarA;
                eVar.f40320a = true;
                eVar.f40321b = Long.MIN_VALUE;
                go.k.t(!eVar.f40322c);
                long j12 = sVar3.f42664a;
                go.k.t(!eVar.f40322c);
                eVar.f40321b = j12;
                go.k.t(!eVar.f40322c);
                eVar.f40320a = true;
                go.k.t(!eVar.f40322c);
                go.k.t(!eVar.f40322c);
                go.k.t(!eVar.f40322c);
                eVar.f40322c = true;
                aVarA = new h(eVar);
            }
            yVar2.f42714b.getClass();
            yVar2.f42714b.getClass();
            return aVarA;
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // f2.b0
    public final void b(j2.n nVar) {
        this.f40428c = nVar;
        com.google.android.gms.common.api.internal.t tVar = this.f40426a;
        tVar.f11770f = nVar;
        n2.i iVar = (n2.i) tVar.f11766b;
        synchronized (iVar) {
            iVar.f46475c = nVar;
        }
        Iterator it = ((HashMap) tVar.f11768d).values().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).b(nVar);
        }
    }

    @Override // f2.b0
    public final void c() {
        com.google.android.gms.common.api.internal.t tVar = this.f40426a;
        tVar.getClass();
        synchronized (((n2.i) tVar.f11766b)) {
        }
    }

    @Override // f2.b0
    public final void d(boolean z10) {
        this.f40434i = z10;
        com.google.android.gms.common.api.internal.t tVar = this.f40426a;
        tVar.f11765a = z10;
        n2.i iVar = (n2.i) tVar.f11766b;
        synchronized (iVar) {
            iVar.f46474b = z10;
        }
        Iterator it = ((HashMap) tVar.f11768d).values().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).d(z10);
        }
    }

    public q(s1 s1Var, n2.i iVar) {
        this.f40427b = s1Var;
        j2.n nVar = new j2.n(3);
        this.f40428c = nVar;
        com.google.android.gms.common.api.internal.t tVar = new com.google.android.gms.common.api.internal.t(iVar, nVar);
        this.f40426a = tVar;
        if (s1Var != ((s1) tVar.f11769e)) {
            tVar.f11769e = s1Var;
            ((HashMap) tVar.f11767c).clear();
            ((HashMap) tVar.f11768d).clear();
        }
        this.f40429d = C.TIME_UNSET;
        this.f40430e = C.TIME_UNSET;
        this.f40431f = C.TIME_UNSET;
        this.f40432g = -3.4028235E38f;
        this.f40433h = -3.4028235E38f;
        this.f40434i = true;
    }
}
