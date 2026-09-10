package tk;

import com.google.android.gms.internal.ads.zs;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r implements qk.c, m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f51047a = q1.g(null, new o(this, 1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f51048b = q1.g(null, new o(this, 2));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1 f51049c = q1.g(null, new o(this, 4));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o1 f51050d = q1.g(null, new o(this, 5));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o1 f51051e = q1.g(null, new o(this, 0));

    public static Object a(k1 k1Var) {
        Class clsP = d0.c.p(go.c.t(k1Var));
        if (clsP.isArray()) {
            Object objNewInstance = Array.newInstance(clsP.getComponentType(), 0);
            kotlin.jvm.internal.n.e(objNewInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return objNewInstance;
        }
        throw new cn.c0("Cannot instantiate the default empty array of type " + clsP.getSimpleName() + ", because it is not an array type", 3);
    }

    public abstract uk.f c();

    @Override // qk.c
    public final Object call(Object... args) throws zs {
        kotlin.jvm.internal.n.f(args, "args");
        try {
            return c().call(args);
        } catch (IllegalAccessException e10) {
            throw new zs(e10);
        }
    }

    @Override // qk.c
    public final Object callBy(Map args) throws zs {
        Object objA;
        kotlin.jvm.internal.n.f(args, "args");
        boolean z10 = false;
        if (i()) {
            List<qk.o> parameters = getParameters();
            ArrayList arrayList = new ArrayList(xj.p.W(parameters, 10));
            for (qk.o oVar : parameters) {
                if (args.containsKey(oVar)) {
                    objA = args.get(oVar);
                    if (objA == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + oVar + ')');
                    }
                } else {
                    s0 s0Var = (s0) oVar;
                    if (s0Var.e()) {
                        objA = null;
                    } else {
                        if (!s0Var.f()) {
                            throw new IllegalArgumentException("No argument provided for a required parameter: " + s0Var);
                        }
                        objA = a(s0Var.c());
                    }
                }
                arrayList.add(objA);
            }
            uk.f fVarF = f();
            if (fVarF != null) {
                try {
                    return fVarF.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e10) {
                    throw new zs(e10);
                }
            }
            throw new cn.c0("This callable does not support a default call: " + h(), 3);
        }
        List<qk.o> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return c().call(isSuspend() ? new ak.f[]{null} : new ak.f[0]);
            } catch (IllegalAccessException e11) {
                throw new zs(e11);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.f51051e.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        int i10 = 0;
        for (qk.o oVar2 : parameters2) {
            if (args.containsKey(oVar2)) {
                objArr[((s0) oVar2).f51058b] = args.get(oVar2);
            } else {
                s0 s0Var2 = (s0) oVar2;
                if (s0Var2.e()) {
                    int i11 = (i10 / 32) + size;
                    Object obj = objArr[i11];
                    kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.Int");
                    objArr[i11] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i10 % 32)));
                    z10 = true;
                } else if (!s0Var2.f()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + s0Var2);
                }
            }
            if (((s0) oVar2).f51059c == qk.n.f49127c) {
                i10++;
            }
        }
        if (!z10) {
            try {
                uk.f fVarC = c();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
                kotlin.jvm.internal.n.e(objArrCopyOf, "copyOf(this, newSize)");
                return fVarC.call(objArrCopyOf);
            } catch (IllegalAccessException e12) {
                throw new zs(e12);
            }
        }
        uk.f fVarF2 = f();
        if (fVarF2 != null) {
            try {
                return fVarF2.call(objArr);
            } catch (IllegalAccessException e13) {
                throw new zs(e13);
            }
        }
        throw new cn.c0("This callable does not support a default call: " + h(), 3);
    }

    public abstract c0 e();

    public abstract uk.f f();

    @Override // qk.b
    public final List getAnnotations() {
        Object objInvoke = this.f51047a.invoke();
        kotlin.jvm.internal.n.e(objInvoke, "_annotations()");
        return (List) objInvoke;
    }

    @Override // qk.c
    public final List getParameters() {
        Object objInvoke = this.f51048b.invoke();
        kotlin.jvm.internal.n.e(objInvoke, "_parameters()");
        return (List) objInvoke;
    }

    @Override // qk.c
    public final qk.x getReturnType() {
        Object objInvoke = this.f51049c.invoke();
        kotlin.jvm.internal.n.e(objInvoke, "_returnType()");
        return (qk.x) objInvoke;
    }

    @Override // qk.c
    public final List getTypeParameters() {
        Object objInvoke = this.f51050d.invoke();
        kotlin.jvm.internal.n.e(objInvoke, "_typeParameters()");
        return (List) objInvoke;
    }

    @Override // qk.c
    public final qk.c0 getVisibility() {
        il.o visibility = h().getVisibility();
        kotlin.jvm.internal.n.e(visibility, "descriptor.visibility");
        yl.c cVar = v1.f51075a;
        if (visibility.equals(zk.n.f54978e)) {
            return qk.c0.f49109a;
        }
        if (visibility.equals(zk.n.f54976c)) {
            return qk.c0.f49110b;
        }
        if (visibility.equals(zk.n.f54977d)) {
            return qk.c0.f49111c;
        }
        if (visibility.equals(zk.n.f54974a) ? true : visibility.equals(zk.n.f54975b)) {
            return qk.c0.f49112d;
        }
        return null;
    }

    public abstract zk.c h();

    public final boolean i() {
        return kotlin.jvm.internal.n.a(getName(), "<init>") && e().a().isAnnotation();
    }

    @Override // qk.c
    public final boolean isAbstract() {
        return h().j() == 4;
    }

    @Override // qk.c
    public final boolean isFinal() {
        return h().j() == 1;
    }

    @Override // qk.c
    public final boolean isOpen() {
        return h().j() == 3;
    }

    public abstract boolean j();
}
