package tk;

import com.google.android.gms.internal.ads.zs;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i1 extends r implements qk.w {
    public static final Object l = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0 f50988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f50989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f50990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f50991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f50992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o1 f50993k;

    public i1(c0 c0Var, String str, String str2, zk.h0 h0Var, Object obj) {
        this.f50988f = c0Var;
        this.f50989g = str;
        this.f50990h = str2;
        this.f50991i = obj;
        this.f50992j = r9.b.t(wj.e.f53280a, new h1(this, 1));
        this.f50993k = q1.g(h0Var, new h1(this, 0));
    }

    @Override // tk.r
    public final uk.f c() {
        return n().c();
    }

    @Override // tk.r
    public final c0 e() {
        return this.f50988f;
    }

    public final boolean equals(Object obj) {
        i1 i1VarC = v1.c(obj);
        return i1VarC != null && kotlin.jvm.internal.n.a(this.f50988f, i1VarC.f50988f) && kotlin.jvm.internal.n.a(this.f50989g, i1VarC.f50989g) && kotlin.jvm.internal.n.a(this.f50990h, i1VarC.f50990h) && kotlin.jvm.internal.n.a(this.f50991i, i1VarC.f50991i);
    }

    @Override // tk.r
    public final uk.f f() {
        n().getClass();
        return null;
    }

    @Override // qk.c
    public final String getName() {
        return this.f50989g;
    }

    public final int hashCode() {
        return this.f50990h.hashCode() + d5.u.e(this.f50988f.hashCode() * 31, 31, this.f50989g);
    }

    @Override // qk.w
    public final boolean isConst() {
        return h().isConst();
    }

    @Override // qk.w
    public final boolean isLateinit() {
        return h().q0();
    }

    @Override // qk.c
    public final boolean isSuspend() {
        return false;
    }

    @Override // tk.r
    public final boolean j() {
        return !kotlin.jvm.internal.n.a(this.f50991i, kotlin.jvm.internal.d.NO_RECEIVER);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, wj.d] */
    public final Member k() {
        if (!h().w()) {
            return null;
        }
        yl.b bVar = t1.f51065a;
        q1 q1VarB = t1.b(h());
        if (q1VarB instanceof m) {
            m mVar = (m) q1VarB;
            vl.f fVar = mVar.f51017e;
            wl.e eVar = mVar.f51016d;
            if ((eVar.f53422b & 16) == 16) {
                wl.c cVar = eVar.f53427g;
                int i10 = cVar.f53408b;
                if ((i10 & 1) != 1 || (i10 & 2) != 2) {
                    return null;
                }
                return this.f50988f.e(fVar.getString(cVar.f53409c), fVar.getString(cVar.f53410d));
            }
        }
        return (Field) this.f50992j.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object l(Member member, Object obj) throws zs {
        try {
            Object obj2 = l;
            if (obj == obj2 && h().J() == null) {
                throw new RuntimeException("'" + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objB = j() ? d0.c.b(this.f50991i, h()) : obj;
            if (objB == obj2) {
                objB = null;
            }
            if (!j()) {
                obj = null;
            }
            if (obj == obj2) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(d0.c.z(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objB);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objB == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    kotlin.jvm.internal.n.e(cls, "fieldOrMethod.parameterTypes[0]");
                    objB = v1.e(cls);
                }
                return method.invoke(null, objB);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                kotlin.jvm.internal.n.e(cls2, "fieldOrMethod.parameterTypes[1]");
                obj = v1.e(cls2);
            }
            return method2.invoke(null, objB, obj);
        } catch (IllegalAccessException e10) {
            throw new zs(10, "Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e10);
        }
    }

    @Override // tk.r
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final zk.h0 h() {
        Object objInvoke = this.f50993k.invoke();
        kotlin.jvm.internal.n.e(objInvoke, "_descriptor()");
        return (zk.h0) objInvoke;
    }

    public abstract e1 n();

    public final String toString() {
        am.h hVar = s1.f51061a;
        return s1.c(h());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i1(c0 c0Var, String name, String signature, Object obj) {
        this(c0Var, name, signature, null, obj);
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i1(c0 c0Var, zk.h0 descriptor) {
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        kotlin.jvm.internal.n.e(strB, "descriptor.name.asString()");
        this(c0Var, strB, t1.b(descriptor).c(), descriptor, kotlin.jvm.internal.d.NO_RECEIVER);
    }
}
