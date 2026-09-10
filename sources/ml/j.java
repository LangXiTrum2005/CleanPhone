package ml;

import cc.a2;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.internal.play_billing.q1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import zk.i0;
import zk.k0;
import zk.n0;
import zk.u0;
import zk.x0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends cl.m implements kl.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nf f46192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fl.n f46193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zk.e f46194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nf f46195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wj.j f46196k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f46197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n.a f46198n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f46199o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f46200p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f46201q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i0 f46202r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final im.i f46203s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e0 f46204t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ll.c f46205u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final om.i f46206v;

    static {
        xj.k.E0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", InAppPurchaseConstants.METHOD_TO_STRING});
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Illegal instructions before constructor call */
    public j(nf outerContext, zk.j containingDeclaration, fl.n jClass, zk.e eVar) throws IllegalAccessException, InvocationTargetException {
        int i10;
        n.a aVar;
        kotlin.jvm.internal.n.f(outerContext, "outerContext");
        kotlin.jvm.internal.n.f(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.n.f(jClass, "jClass");
        ll.a aVar2 = (ll.a) outerContext.f23782b;
        om.o oVar = aVar2.f45485a;
        Class cls = jClass.f41001a;
        super(oVar, containingDeclaration, yl.f.e(cls.getSimpleName()), aVar2.f45494j.c(jClass));
        this.f46192g = outerContext;
        this.f46193h = jClass;
        this.f46194i = eVar;
        int i11 = 4;
        nf nfVarD = android.support.v4.media.session.a.d(outerContext, this, jClass, 4);
        this.f46195j = nfVarD;
        ll.a aVar3 = (ll.a) nfVarD.f23782b;
        om.o storageManager = aVar3.f45485a;
        aVar3.f45491g.getClass();
        this.f46196k = r9.b.u(new g(this, 2));
        if (cls.isAnnotation()) {
            i10 = 5;
        } else if (cls.isInterface()) {
            i10 = 2;
        } else {
            i10 = cls.isEnum() ? 3 : 1;
        }
        this.l = i10;
        if (cls.isAnnotation() || cls.isEnum()) {
            i11 = 1;
        } else {
            boolean zG = jClass.g();
            boolean z10 = jClass.g() || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            if (zG) {
                i11 = 2;
            } else if (!z10) {
                if (zIsFinal) {
                    i11 = 1;
                } else {
                    i11 = 3;
                }
            }
        }
        this.f46197m = i11;
        int modifiers = cls.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            aVar = x0.f55006d;
        } else if (Modifier.isPrivate(modifiers)) {
            aVar = u0.f55002d;
        } else if (Modifier.isProtected(modifiers)) {
            aVar = Modifier.isStatic(modifiers) ? dl.c.f38948d : dl.b.f38947d;
        } else {
            aVar = dl.a.f38946d;
        }
        this.f46198n = aVar;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.f46199o = ((declaringClass != null ? new fl.n(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.f46200p = new h(this);
        p pVar = new p(nfVarD, this, jClass, eVar != null, null);
        this.f46201q = pVar;
        k0 k0Var = i0.f54966d;
        ((qm.l) aVar3.f45504u).getClass();
        al.f fVar = new al.f(this, 17);
        k0Var.getClass();
        kotlin.jvm.internal.n.f(storageManager, "storageManager");
        this.f46202r = new i0(this, storageManager, fVar);
        this.f46203s = new im.i(pVar);
        this.f46204t = new e0(nfVarD, jClass, this);
        this.f46205u = a2.I(nfVarD, jClass);
        g gVar = new g(this, 1);
        om.l lVar = (om.l) storageManager;
        lVar.getClass();
        this.f46206v = new om.i(lVar, gVar);
    }

    public final p M() {
        return (p) super.R();
    }

    @Override // cl.c, zk.e
    public final im.n N() {
        return this.f46203s;
    }

    @Override // zk.e
    public final n0 O() {
        return null;
    }

    @Override // cl.c, zk.e
    public final im.n R() {
        return (p) super.R();
    }

    @Override // zk.v
    public final boolean S() {
        return false;
    }

    @Override // zk.e
    public final boolean W() {
        return false;
    }

    @Override // zk.e
    public final boolean Y() {
        return false;
    }

    @Override // zk.e
    public final boolean e0() {
        return false;
    }

    @Override // zk.v
    public final boolean f0() {
        return false;
    }

    @Override // zk.e
    public final im.n g0() {
        return this.f46204t;
    }

    @Override // al.a
    public final al.j getAnnotations() {
        return this.f46205u;
    }

    @Override // zk.e, zk.m, zk.v
    public final il.o getVisibility() {
        il.o oVar = zk.n.f54974a;
        n.a aVar = this.f46198n;
        if (kotlin.jvm.internal.n.a(aVar, oVar)) {
            Class<?> declaringClass = this.f46193h.f41001a.getDeclaringClass();
            if ((declaringClass != null ? new fl.n(declaringClass) : null) == null) {
                il.o oVar2 = il.p.f43097a;
                kotlin.jvm.internal.n.e(oVar2, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
                return oVar2;
            }
        }
        return r9.b.A(aVar);
    }

    @Override // zk.e, zk.h
    public final List i() {
        return (List) this.f46206v.invoke();
    }

    @Override // zk.e
    public final boolean isInline() {
        return false;
    }

    @Override // zk.e, zk.v
    public final int j() {
        return this.f46197m;
    }

    @Override // zk.e
    public final int l0() {
        return this.l;
    }

    @Override // zk.g
    public final pm.n0 n() {
        return this.f46200p;
    }

    @Override // cl.d0
    public final im.n o(qm.f fVar) {
        i0 i0Var = this.f46202r;
        fm.e.j(i0Var.f54968a);
        return (p) ((im.n) j1.f.w(i0Var.f54970c, i0.f54967e[0]));
    }

    @Override // zk.e
    public final Collection p() {
        return (List) this.f46201q.f46224q.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Collection, xj.v] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // zk.e
    public final Collection r() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        ?? arrayList = xj.v.f53866a;
        if (this.f46197m != 2) {
            return arrayList;
        }
        Object obj = null;
        nl.a aVarI = android.support.v4.media.session.a.I(2, false, null, 7);
        Class clazz = this.f46193h.f41001a;
        kotlin.jvm.internal.n.f(clazz, "clazz");
        zc.u uVar = q1.f24451a;
        if (uVar == null) {
            try {
                uVar = new zc.u(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 6);
            } catch (NoSuchMethodException unused) {
                uVar = new zc.u(obj, obj, obj, obj, 6);
            }
            q1.f24451a = uVar;
        }
        Method method = (Method) uVar.f54880c;
        if (method == null) {
            clsArr = null;
        } else {
            Object objInvoke = method.invoke(clazz, null);
            kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr != null) {
            arrayList = new ArrayList(clsArr.length);
            for (Class cls : clsArr) {
                arrayList.add(new fl.p(cls));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Iterable) arrayList).iterator();
        while (it.hasNext()) {
            zk.g gVarE = ((v9.e) this.f46195j.f23786f).L((fl.p) it.next(), aVarI).P().e();
            zk.e eVar = gVarE instanceof zk.e ? (zk.e) gVarE : null;
            if (eVar != null) {
                arrayList2.add(eVar);
            }
        }
        return xj.n.I0(arrayList2, new i());
    }

    public final String toString() {
        return "Lazy Java class " + fm.e.h(this);
    }

    @Override // zk.h
    public final boolean u() {
        return this.f46199o;
    }

    @Override // zk.e
    public final boolean x0() {
        return false;
    }

    @Override // zk.e
    public final cl.l y() {
        return null;
    }
}
