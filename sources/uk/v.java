package uk;

import cl.x0;
import cn.c0;
import com.google.android.gms.internal.play_billing.q1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import tk.v1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f52247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f52248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd.i f52249c;

    /* JADX WARN: Code duplicated, block: B:20:0x0079  */
    public v(f fVar, zk.c descriptor, boolean z10) {
        Method declaredMethod;
        qd.i iVar;
        Class clsQ;
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        this.f52247a = fVar;
        this.f52248b = z10;
        pm.y returnType = descriptor.getReturnType();
        kotlin.jvm.internal.n.c(returnType);
        Class clsQ2 = d0.c.Q(returnType);
        if (clsQ2 != null) {
            try {
                declaredMethod = clsQ2.getDeclaredMethod("box-impl", d0.c.x(clsQ2, descriptor).getReturnType());
                kotlin.jvm.internal.n.e(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            } catch (NoSuchMethodException unused) {
                throw new c0("No box method found in inline class: " + clsQ2 + " (calling " + descriptor + ')', 3);
            }
        } else {
            declaredMethod = null;
        }
        int i10 = 0;
        if (bm.g.a(descriptor)) {
            iVar = new qd.i(pk.c.f48400d, new Method[0], declaredMethod);
        } else {
            int i11 = -1;
            if (!(fVar instanceof s)) {
                if (descriptor instanceof zk.i) {
                    if (!(fVar instanceof e)) {
                        i11 = 0;
                    }
                } else if (descriptor.G() == null || (fVar instanceof e)) {
                    i11 = 0;
                } else {
                    zk.j jVarE = descriptor.e();
                    kotlin.jvm.internal.n.e(jVarE, "descriptor.containingDeclaration");
                    if (bm.g.b(jVarE)) {
                        i11 = 0;
                    } else {
                        i11 = 1;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            cl.z zVarJ = descriptor.J();
            pm.y type = zVarJ != null ? zVarJ.getType() : null;
            if (type != null) {
                arrayList.add(type);
            } else if (descriptor instanceof zk.i) {
                zk.e eVarX = ((zk.i) descriptor).X();
                kotlin.jvm.internal.n.e(eVarX, "descriptor.constructedClass");
                if (eVarX.u()) {
                    zk.j jVarE2 = eVarX.e();
                    kotlin.jvm.internal.n.d(jVarE2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList.add(((zk.e) jVarE2).g());
                }
            } else {
                zk.j jVarE3 = descriptor.e();
                kotlin.jvm.internal.n.e(jVarE3, "descriptor.containingDeclaration");
                if ((jVarE3 instanceof zk.e) && bm.g.b(jVarE3)) {
                    arrayList.add(((zk.e) jVarE3).g());
                }
            }
            List listB = descriptor.B();
            kotlin.jvm.internal.n.e(listB, "descriptor.valueParameters");
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((x0) it.next()).getType());
            }
            int size = arrayList.size() + i11 + (this.f52248b ? ((arrayList.size() + 31) / 32) + 1 : 0) + (((descriptor instanceof zk.s) && ((zk.s) descriptor).isSuspend()) ? 1 : 0);
            if (q1.q(this) != size) {
                throw new c0("Inconsistent number of parameters in the descriptor and Java reflection object: " + q1.q(this) + " != " + size + "\nCalling: " + descriptor + "\nParameter types: " + this.f52247a.a() + ")\nDefault: " + this.f52248b, 3);
            }
            pk.c cVarO = com.bumptech.glide.d.O(Math.max(i11, 0), arrayList.size() + i11);
            Method[] methodArr = new Method[size];
            while (i10 < size) {
                methodArr[i10] = (i10 > cVarO.f48394b || cVarO.f48393a > i10 || (clsQ = d0.c.Q((pm.y) arrayList.get(i10 - i11))) == null) ? null : d0.c.x(clsQ, descriptor);
                i10++;
            }
            iVar = new qd.i(cVarO, methodArr, declaredMethod);
        }
        this.f52249c = iVar;
    }

    @Override // uk.f
    public final List a() {
        return this.f52247a.a();
    }

    @Override // uk.f
    public final Member b() {
        return this.f52247a.b();
    }

    @Override // uk.f
    public final Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        kotlin.jvm.internal.n.f(args, "args");
        qd.i iVar = this.f52249c;
        pk.c cVar = (pk.c) iVar.f48980b;
        Method[] methodArr = (Method[]) iVar.f48981c;
        Method method = (Method) iVar.f48982d;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        kotlin.jvm.internal.n.e(objArrCopyOf, "copyOf(this, size)");
        int i10 = cVar.f48393a;
        int i11 = cVar.f48394b;
        if (i10 <= i11) {
            while (true) {
                Method method2 = methodArr[i10];
                Object objE = args[i10];
                if (method2 != null) {
                    if (objE != null) {
                        objE = method2.invoke(objE, null);
                    } else {
                        Class<?> returnType = method2.getReturnType();
                        kotlin.jvm.internal.n.e(returnType, "method.returnType");
                        objE = v1.e(returnType);
                    }
                }
                objArrCopyOf[i10] = objE;
                if (i10 == i11) {
                    break;
                }
                i10++;
            }
        }
        Object objCall = this.f52247a.call(objArrCopyOf);
        return (method == null || (objInvoke = method.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // uk.f
    public final Type getReturnType() {
        return this.f52247a.getReturnType();
    }
}
