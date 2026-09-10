package xl;

import com.google.android.gms.internal.auth.o;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import l3.i;
import tl.c0;
import tl.g0;
import tl.j;
import tl.l;
import tl.q0;
import tl.y;
import tl.y0;
import wl.k;
import xj.p;
import zl.m;
import zl.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zl.g f53909a;

    static {
        zl.g gVar = new zl.g();
        gVar.a(k.f53466a);
        gVar.a(k.f53467b);
        gVar.a(k.f53468c);
        gVar.a(k.f53469d);
        gVar.a(k.f53470e);
        gVar.a(k.f53471f);
        gVar.a(k.f53472g);
        gVar.a(k.f53473h);
        gVar.a(k.f53474i);
        gVar.a(k.f53475j);
        gVar.a(k.f53476k);
        gVar.a(k.l);
        gVar.a(k.f53477m);
        gVar.a(k.f53478n);
        f53909a = gVar;
    }

    public static e a(l proto, vl.f nameResolver, i typeTable) {
        String strU0;
        n.f(proto, "proto");
        n.f(nameResolver, "nameResolver");
        n.f(typeTable, "typeTable");
        m constructorSignature = k.f53466a;
        n.e(constructorSignature, "constructorSignature");
        wl.c cVar = (wl.c) com.google.android.gms.internal.auth.i.u(proto, constructorSignature);
        String string = (cVar == null || (cVar.f53408b & 1) != 1) ? "<init>" : nameResolver.getString(cVar.f53409c);
        if (cVar == null || (cVar.f53408b & 2) != 2) {
            List list = proto.f51342e;
            n.e(list, "proto.valueParameterList");
            List<y0> list2 = list;
            ArrayList arrayList = new ArrayList(p.W(list2, 10));
            for (y0 it : list2) {
                n.e(it, "it");
                String strE = e(o.A(it, typeTable), nameResolver);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strU0 = xj.n.u0(arrayList, "", "(", ")V", null, 56);
        } else {
            strU0 = nameResolver.getString(cVar.f53410d);
        }
        return new e(string, strU0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x0052: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0054 A[HIDDEN] (LINE:83)
          (r4v2 java.lang.String) from 0x0055: PHI (r4 I:??) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x0052, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static xl.d b(tl.g0 r4, vl.f r5, l3.i r6, boolean r7) {
        /*
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.n.f(r4, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.n.f(r5, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.n.f(r6, r0)
            zl.m r0 = wl.k.f53469d
            java.lang.String r1 = "propertySignature"
            kotlin.jvm.internal.n.e(r0, r1)
            java.lang.Object r0 = com.google.android.gms.internal.auth.i.u(r4, r0)
            wl.e r0 = (wl.e) r0
            r1 = 0
            if (r0 != 0) goto L20
            goto L54
        L20:
            int r2 = r0.f53422b
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L29
            wl.b r0 = r0.f53423c
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L2f
            if (r7 == 0) goto L2f
            goto L54
        L2f:
            if (r0 == 0) goto L39
            int r7 = r0.f53400b
            r7 = r7 & r3
            if (r7 != r3) goto L39
            int r7 = r0.f53401c
            goto L3b
        L39:
            int r7 = r4.f51242f
        L3b:
            if (r0 == 0) goto L4a
            int r2 = r0.f53400b
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L4a
            int r4 = r0.f53402d
            java.lang.String r4 = r5.getString(r4)
            goto L55
        L4a:
            tl.q0 r4 = com.google.android.gms.internal.auth.o.w(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L55
        L54:
            return r1
        L55:
            xl.d r6 = new xl.d
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xl.h.b(tl.g0, vl.f, l3.i, boolean):xl.d");
    }

    public static e c(y proto, vl.f nameResolver, i typeTable) {
        String strQ;
        n.f(proto, "proto");
        n.f(nameResolver, "nameResolver");
        n.f(typeTable, "typeTable");
        m methodSignature = k.f53467b;
        n.e(methodSignature, "methodSignature");
        wl.c cVar = (wl.c) com.google.android.gms.internal.auth.i.u(proto, methodSignature);
        int i10 = (cVar == null || (cVar.f53408b & 1) != 1) ? proto.f51554f : cVar.f53409c;
        if (cVar == null || (cVar.f53408b & 2) != 2) {
            List listR = xj.o.R(o.u(proto, typeTable));
            List list = proto.f51562o;
            n.e(list, "proto.valueParameterList");
            List<y0> list2 = list;
            ArrayList arrayList = new ArrayList(p.W(list2, 10));
            for (y0 it : list2) {
                n.e(it, "it");
                arrayList.add(o.A(it, typeTable));
            }
            ArrayList arrayListB0 = xj.n.B0(arrayList, listR);
            ArrayList arrayList2 = new ArrayList(p.W(arrayListB0, 10));
            Iterator it2 = arrayListB0.iterator();
            while (it2.hasNext()) {
                String strE = e((q0) it2.next(), nameResolver);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(o.v(proto, typeTable), nameResolver);
            if (strE2 == null) {
                return null;
            }
            strQ = defpackage.e.q(xj.n.u0(arrayList2, "", "(", ")", null, 56), strE2, new StringBuilder());
        } else {
            strQ = nameResolver.getString(cVar.f53410d);
        }
        return new e(nameResolver.getString(i10), strQ);
    }

    public static final boolean d(g0 proto) {
        n.f(proto, "proto");
        vl.b bVar = c.f53897a;
        Object objN = proto.n(k.f53470e);
        n.e(objN, "proto.getExtension(JvmProtoBuf.flags)");
        return bVar.c(((Number) objN).intValue()).booleanValue();
    }

    public static String e(q0 q0Var, vl.f fVar) {
        if (q0Var.s()) {
            return b.b(fVar.h(q0Var.f51418i));
        }
        return null;
    }

    public static final wj.f f(String[] strArr, String[] strings) throws q {
        n.f(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        g gVarG = g(byteArrayInputStream, strings);
        tl.a aVar = j.K;
        aVar.getClass();
        zl.e eVar = new zl.e(byteArrayInputStream);
        zl.a aVar2 = (zl.a) aVar.a(eVar, f53909a);
        try {
            eVar.a(0);
            if (aVar2.isInitialized()) {
                return new wj.f(gVarG, (j) aVar2);
            }
            q qVar = new q(new aa.b().getMessage());
            qVar.f55076a = aVar2;
            throw qVar;
        } catch (q e10) {
            e10.f55076a = aVar2;
            throw e10;
        }
    }

    public static g g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        wl.j jVar = (wl.j) wl.j.f53459h.b(byteArrayInputStream, f53909a);
        n.e(jVar, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new g(jVar, strArr);
    }

    public static final wj.f h(String[] data, String[] strings) throws q {
        n.f(data, "data");
        n.f(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(data));
        g gVarG = g(byteArrayInputStream, strings);
        tl.a aVar = c0.l;
        aVar.getClass();
        zl.e eVar = new zl.e(byteArrayInputStream);
        zl.a aVar2 = (zl.a) aVar.a(eVar, f53909a);
        try {
            eVar.a(0);
            if (aVar2.isInitialized()) {
                return new wj.f(gVarG, (c0) aVar2);
            }
            q qVar = new q(new aa.b().getMessage());
            qVar.f55076a = aVar2;
            throw qVar;
        } catch (q e10) {
            e10.f55076a = aVar2;
            throw e10;
        }
    }
}
