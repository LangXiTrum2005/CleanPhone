package tk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends r implements kotlin.jvm.internal.i, qk.g, e {
    public static final /* synthetic */ qk.w[] l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0 f50963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f50964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f50965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o1 f50966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f50967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f50968k;

    static {
        kotlin.jvm.internal.e0 e0Var = kotlin.jvm.internal.d0.f44761a;
        l = new qk.w[]{e0Var.g(new kotlin.jvm.internal.v(e0Var.b(e0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    public e0(c0 c0Var, String str, String str2, zk.s sVar, Object obj) {
        this.f50963f = c0Var;
        this.f50964g = str2;
        this.f50965h = obj;
        this.f50966i = q1.g(sVar, new cl.t0(10, this, str));
        d0 d0Var = new d0(this, 0);
        wj.e eVar = wj.e.f53280a;
        this.f50967j = r9.b.t(eVar, d0Var);
        this.f50968k = r9.b.t(eVar, new d0(this, 1));
    }

    public static final uk.u k(e0 e0Var, Constructor constructor, zk.s sVar, boolean z10) {
        Object obj = e0Var.f50965h;
        Class cls = null;
        if (!z10) {
            cl.l lVar = sVar instanceof cl.l ? (cl.l) sVar : null;
            if (lVar != null) {
                cl.l lVar2 = lVar;
                if (!zk.n.e(lVar2.getVisibility())) {
                    zk.e eVarX = lVar.X();
                    kotlin.jvm.internal.n.e(eVarX, "constructorDescriptor.constructedClass");
                    if (!bm.g.b(eVarX) && !bm.e.q(lVar.X())) {
                        List listB = lVar2.B();
                        kotlin.jvm.internal.n.e(listB, "constructorDescriptor.valueParameters");
                        List list = listB;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                pm.y type = ((cl.x0) it.next()).getType();
                                kotlin.jvm.internal.n.e(type, "it.type");
                                if (com.bumptech.glide.c.C(type)) {
                                    if (e0Var.j()) {
                                        return new uk.g(constructor, d0.c.b(obj, e0Var.h()), 0);
                                    }
                                    Class declaringClass = constructor.getDeclaringClass();
                                    kotlin.jvm.internal.n.e(declaringClass, "constructor.declaringClass");
                                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                    kotlin.jvm.internal.n.e(genericParameterTypes, "constructor.genericParameterTypes");
                                    return new uk.h(constructor, declaringClass, cls, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : xj.k.j0(0, genericParameterTypes.length - 1, genericParameterTypes)), 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (e0Var.j()) {
            return new uk.g(constructor, d0.c.b(obj, e0Var.h()), 1);
        }
        Class declaringClass2 = constructor.getDeclaringClass();
        kotlin.jvm.internal.n.e(declaringClass2, "constructor.declaringClass");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        Class<?> cls2 = (declaringClass4 == null || Modifier.isStatic(declaringClass3.getModifiers())) ? null : declaringClass4;
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        kotlin.jvm.internal.n.e(genericParameterTypes2, "constructor.genericParameterTypes");
        return new uk.h(constructor, declaringClass2, cls2, genericParameterTypes2, 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // tk.r
    public final uk.f c() {
        return (uk.f) this.f50967j.getValue();
    }

    @Override // tk.r
    public final c0 e() {
        return this.f50963f;
    }

    public final boolean equals(Object obj) {
        e0 e0VarB = v1.b(obj);
        return e0VarB != null && kotlin.jvm.internal.n.a(this.f50963f, e0VarB.f50963f) && getName().equals(e0VarB.getName()) && kotlin.jvm.internal.n.a(this.f50964g, e0VarB.f50964g) && kotlin.jvm.internal.n.a(this.f50965h, e0VarB.f50965h);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, wj.d] */
    @Override // tk.r
    public final uk.f f() {
        return (uk.f) this.f50968k.getValue();
    }

    @Override // kotlin.jvm.internal.i
    public final int getArity() {
        return com.google.android.gms.internal.play_billing.q1.q(c());
    }

    @Override // qk.c
    public final String getName() {
        String strB = ((cl.p) h()).getName().b();
        kotlin.jvm.internal.n.e(strB, "descriptor.name.asString()");
        return strB;
    }

    public final int hashCode() {
        return this.f50964g.hashCode() + ((getName().hashCode() + (this.f50963f.hashCode() * 31)) * 31);
    }

    @Override // jk.a
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // qk.g
    public final boolean isExternal() {
        return h().isExternal();
    }

    @Override // qk.g
    public final boolean isInfix() {
        return h().isInfix();
    }

    @Override // qk.g
    public final boolean isInline() {
        return h().isInline();
    }

    @Override // qk.g
    public final boolean isOperator() {
        return h().isOperator();
    }

    @Override // qk.c
    public final boolean isSuspend() {
        return h().isSuspend();
    }

    @Override // tk.r
    public final boolean j() {
        return !kotlin.jvm.internal.n.a(this.f50965h, kotlin.jvm.internal.d.NO_RECEIVER);
    }

    @Override // tk.r
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final zk.s h() {
        qk.w wVar = l[0];
        Object objInvoke = this.f50966i.invoke();
        kotlin.jvm.internal.n.e(objInvoke, "<get-descriptor>(...)");
        return (zk.s) objInvoke;
    }

    public final String toString() {
        am.h hVar = s1.f51061a;
        return s1.b(h());
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // jk.d
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // jk.f
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(c0 c0Var, zk.s descriptor) {
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        String strB = ((cl.p) descriptor).getName().b();
        kotlin.jvm.internal.n.e(strB, "descriptor.name.asString()");
        this(c0Var, strB, t1.c(descriptor).c(), descriptor, kotlin.jvm.internal.d.NO_RECEIVER);
    }
}
