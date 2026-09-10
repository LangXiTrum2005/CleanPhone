package tk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class r1 extends kotlin.jvm.internal.e0 {
    public static c0 k(kotlin.jvm.internal.d dVar) {
        qk.f owner = dVar.getOwner();
        return owner instanceof c0 ? (c0) owner : d.f50958b;
    }

    @Override // kotlin.jvm.internal.e0
    public final qk.g a(kotlin.jvm.internal.j jVar) {
        c0 c0VarK = k(jVar);
        String name = jVar.getName();
        String signature = jVar.getSignature();
        Object boundReceiver = jVar.getBoundReceiver();
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(signature, "signature");
        return new e0(c0VarK, name, signature, null, boundReceiver);
    }

    @Override // kotlin.jvm.internal.e0
    public final qk.d b(Class cls) {
        return c.a(cls);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [jk.b, kotlin.jvm.internal.o] */
    @Override // kotlin.jvm.internal.e0
    public final qk.f c(Class jClass, String str) {
        Object objPutIfAbsent;
        m5.k kVar = c.f50955a;
        kotlin.jvm.internal.n.f(jClass, "jClass");
        m5.k kVar2 = c.f50956b;
        kVar2.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) kVar2.f45903c;
        Object objInvoke = concurrentHashMap.get(jClass);
        if (objInvoke == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(jClass, (objInvoke = ((kotlin.jvm.internal.o) kVar2.f45902b).invoke(jClass)))) != null) {
            objInvoke = objPutIfAbsent;
        }
        return (qk.f) objInvoke;
    }

    @Override // kotlin.jvm.internal.e0
    public final qk.j d(kotlin.jvm.internal.p pVar) {
        return new g0(k(pVar), pVar.getName(), pVar.getSignature(), pVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.e0
    public final qk.l e(kotlin.jvm.internal.r rVar) {
        return new i0(k(rVar), rVar.getName(), rVar.getSignature(), rVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.e0
    public final qk.r f(hn.j jVar) {
        return new v0(k(jVar), jVar.getName(), jVar.getSignature(), jVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.e0
    public final qk.t g(kotlin.jvm.internal.u uVar) {
        return new y0(k(uVar), uVar.getName(), uVar.getSignature(), uVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.e0
    public final qk.v h(kotlin.jvm.internal.w wVar) {
        return new b1(k(wVar), wVar.getName(), wVar.getSignature());
    }

    @Override // kotlin.jvm.internal.e0
    public final String i(kotlin.jvm.internal.i iVar) throws IOException {
        e0 e0VarB;
        Metadata metadata = (Metadata) iVar.getClass().getAnnotation(Metadata.class);
        e0 e0Var = null;
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                String[] strings = metadata.d2();
                zl.g gVar = xl.h.f53909a;
                kotlin.jvm.internal.n.f(strings, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xl.a.a(strArrD1));
                zl.g gVar2 = xl.h.f53909a;
                xl.g gVarG = xl.h.g(byteArrayInputStream, strings);
                zl.g gVar3 = xl.h.f53909a;
                tl.a aVar = tl.y.f51549v;
                aVar.getClass();
                zl.e eVar = new zl.e(byteArrayInputStream);
                zl.a aVar2 = (zl.a) aVar.a(eVar, gVar3);
                try {
                    eVar.a(0);
                    if (!aVar2.isInitialized()) {
                        zl.q qVar = new zl.q(new aa.b().getMessage());
                        qVar.f55076a = aVar2;
                        throw qVar;
                    }
                    tl.y yVar = (tl.y) aVar2;
                    xl.f fVar = new xl.f(metadata.mv(), (metadata.xi() & 8) != 0);
                    Class<?> cls = iVar.getClass();
                    tl.w0 w0Var = yVar.f51563p;
                    kotlin.jvm.internal.n.e(w0Var, "proto.typeTable");
                    e0Var = new e0(d.f50958b, (cl.q0) v1.f(cls, yVar, gVarG, new l3.i(w0Var), fVar, sk.a.f50256b));
                } catch (zl.q e10) {
                    e10.f55076a = aVar2;
                    throw e10;
                }
            }
        }
        if (e0Var == null || (e0VarB = v1.b(e0Var)) == null) {
            return super.i(iVar);
        }
        am.h hVar = s1.f51061a;
        zk.s sVarL = e0VarB.h();
        StringBuilder sb2 = new StringBuilder();
        s1.a(sb2, sVarL);
        List listB = sVarL.B();
        kotlin.jvm.internal.n.e(listB, "invoke.valueParameters");
        xj.n.t0(listB, sb2, ", ", "(", ")", b.f50951m, 48);
        sb2.append(" -> ");
        pm.y returnType = sVarL.getReturnType();
        kotlin.jvm.internal.n.c(returnType);
        sb2.append(s1.d(returnType));
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // kotlin.jvm.internal.e0
    public final String j(kotlin.jvm.internal.o oVar) {
        return i(oVar);
    }
}
