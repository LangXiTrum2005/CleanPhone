package tk;

import ea.f2;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f51027a = new ConcurrentHashMap();

    public static final el.f a(Class cls) {
        bl.b bVarJ;
        bl.d dVarJ;
        kotlin.jvm.internal.n.f(cls, "<this>");
        ClassLoader classLoaderD = fl.c.d(cls);
        w1 w1Var = new w1(classLoaderD);
        ConcurrentHashMap concurrentHashMap = f51027a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(w1Var);
        if (weakReference != null) {
            el.f fVar = (el.f) weakReference.get();
            if (fVar != null) {
                return fVar;
            }
            concurrentHashMap.remove(w1Var, weakReference);
        }
        el.c cVar = new el.c(classLoaderD);
        ClassLoader classLoader = wj.r.class.getClassLoader();
        kotlin.jvm.internal.n.e(classLoader, "Unit::class.java.classLoader");
        el.c cVar2 = new el.c(classLoader);
        n5.f fVar2 = new n5.f(classLoaderD, 10);
        String moduleName = "runtime module for " + classLoaderD;
        el.e eVar = el.e.f40116b;
        el.e eVar2 = el.e.f40117c;
        kotlin.jvm.internal.n.f(moduleName, "moduleName");
        om.l lVar = new om.l("DeserializationComponentsForJava.ModuleData");
        yk.i iVar = new yk.i(lVar);
        cl.f0 f0Var = new cl.f0(yl.f.g("<" + moduleName + '>'), lVar, iVar, 56);
        om.n nVar = lVar.f47583a;
        nVar.lock();
        try {
            if (iVar.f53311a != null) {
                throw new AssertionError("Built-ins module is already set: " + iVar.f53311a + " (attempting to reset to " + f0Var + ")");
            }
            iVar.f53311a = f0Var;
            nVar.unlock();
            iVar.f54473f = new cl.e0(f0Var, 2);
            rl.d dVar = new rl.d();
            am.e eVar3 = new am.e(17, false);
            zc.u uVar = new zc.u(lVar, f0Var);
            rl.e eVar4 = rl.e.f49627c;
            jl.h hVar = jl.h.f43981c;
            jl.h hVar2 = jl.h.f43979a;
            ea.b0 b0Var = new ea.b0(lVar);
            zk.k0 k0Var = zk.k0.f54972c;
            wk.k kVar = new wk.k(f0Var, uVar);
            il.u uVar2 = il.u.f43110c;
            il.c cVar3 = new il.c(uVar2);
            ll.b bVar = ll.b.f45508a;
            ql.c cVar4 = new ql.c();
            qm.k.f49190b.getClass();
            qm.l lVar2 = qm.j.f49189b;
            ll.d dVar2 = new ll.d(new ll.a(lVar, fVar2, cVar, dVar, hVar, eVar, hVar2, b0Var, eVar2, eVar3, eVar4, k0Var, hl.a.f42404a, f0Var, kVar, cVar3, cVar4, il.m.f43091a, bVar, lVar2, uVar2, new rl.e()));
            xl.f jvmMetadataVersion = xl.f.f53902g;
            kotlin.jvm.internal.n.f(jvmMetadataVersion, "jvmMetadataVersion");
            m5.k kVar2 = new m5.k(15, cVar, dVar);
            com.google.android.gms.internal.consent_sdk.x xVar = new com.google.android.gms.internal.consent_sdk.x();
            xVar.f23260a = cVar;
            xVar.f23261b = lVar.b(new al.f(xVar, 25));
            xVar.f23262c = f0Var;
            xVar.f23263d = uVar;
            xVar.f23264e = new f2(f0Var, uVar);
            xVar.f23265f = xl.f.f53902g;
            xVar.f23265f = jvmMetadataVersion;
            List listC = j1.f.C(pm.m.f48453a);
            wk.h hVar3 = f0Var.f6499d;
            yk.i iVar2 = hVar3 instanceof yk.i ? (yk.i) hVar3 : null;
            rl.e eVar5 = rl.e.f49626b;
            if (iVar2 == null || (bVarJ = iVar2.J()) == null) {
                bVarJ = bl.a.f5718b;
            }
            bl.b bVar2 = bVarJ;
            if (iVar2 == null || (dVarJ = iVar2.J()) == null) {
                dVarJ = bl.a.f5720d;
            }
            lm.i iVar3 = new lm.i(lVar, f0Var, kVar2, xVar, dVar2, eVar, eVar5, xj.v.f53866a, uVar, bVar2, dVarJ, xl.h.f53909a, lVar2, new ea.b0(lVar), listC, 262144);
            dVar.f49625a = iVar3;
            eVar3.f3698b = new am.e(dVar2, 7);
            yk.l additionalClassPartsProvider = iVar.J();
            yk.l platformDependentDeclarationFilter = iVar.J();
            ea.b0 b0Var2 = new ea.b0(lVar);
            kotlin.jvm.internal.n.f(additionalClassPartsProvider, "additionalClassPartsProvider");
            kotlin.jvm.internal.n.f(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
            yk.m mVar = new yk.m(lVar, cVar2, f0Var);
            od.c cVar5 = new od.c(mVar, 19);
            mm.a aVar = mm.a.f46254m;
            mVar.f54491c = new lm.i(lVar, f0Var, cVar5, new eb.d0(f0Var, uVar, aVar), mVar, lm.k.f45559a, lm.j.f45557c, xj.o.Q(new xk.a(lVar, f0Var), new yk.g(lVar, f0Var)), uVar, additionalClassPartsProvider, platformDependentDeclarationFilter, aVar.f44716a, lVar2, b0Var2, null, 786432);
            f0Var.f6502g = new n5.f(xj.k.C0(new cl.f0[]{f0Var}), 3);
            f0Var.f6503h = new cl.o("CompositeProvider@RuntimeModuleData for " + f0Var, xj.o.Q(dVar2, mVar));
            el.f fVar3 = new el.f(iVar3, new v9.e(dVar, cVar));
            while (true) {
                WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(w1Var, new WeakReference(fVar3));
                if (weakReference2 == null) {
                    return fVar3;
                }
                el.f fVar4 = (el.f) weakReference2.get();
                if (fVar4 != null) {
                    return fVar4;
                }
                concurrentHashMap.remove(w1Var, weakReference2);
            }
        } catch (Throwable th2) {
            try {
                lVar.f47584b.getClass();
                throw th2;
            } catch (Throwable th3) {
                nVar.unlock();
                throw th3;
            }
        }
    }
}
