package uk;

import com.ironsource.X3;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.d0;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f52216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f52217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f52219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f52220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f52221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f52222g;

    public a(Class jClass, ArrayList arrayList, int i10, int i11, List methods) {
        kotlin.jvm.internal.n.f(jClass, "jClass");
        d5.u.n(i10, "callMode");
        d5.u.n(i11, "origin");
        kotlin.jvm.internal.n.f(methods, "methods");
        this.f52216a = jClass;
        this.f52217b = arrayList;
        this.f52218c = i10;
        this.f52219d = methods;
        List list = methods;
        ArrayList arrayList2 = new ArrayList(xj.p.W(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f52220e = arrayList2;
        List list2 = this.f52219d;
        ArrayList arrayList3 = new ArrayList(xj.p.W(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> it3 = ((Method) it2.next()).getReturnType();
            kotlin.jvm.internal.n.e(it3, "it");
            List list3 = fl.c.f40980a;
            Class<?> cls = (Class) fl.c.f40982c.get(it3);
            if (cls != null) {
                it3 = cls;
            }
            arrayList3.add(it3);
        }
        this.f52221f = arrayList3;
        List list4 = this.f52219d;
        ArrayList arrayList4 = new ArrayList(xj.p.W(list4, 10));
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((Method) it4.next()).getDefaultValue());
        }
        this.f52222g = arrayList4;
        if (this.f52218c == 2 && i11 == 1 && !xj.n.y0(this.f52217b, X3.i.X).isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // uk.f
    public final List a() {
        return this.f52220e;
    }

    @Override // uk.f
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    @Override // uk.f
    public final Object call(Object[] args) {
        String strD;
        kotlin.jvm.internal.n.f(args, "args");
        com.google.android.gms.internal.auth.o.c(this, args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.f52217b;
            if (i10 >= length) {
                return com.google.android.gms.internal.auth.i.g(this.f52216a, b0.W(xj.n.U0(arrayList2, arrayList)), this.f52219d);
            }
            Object array = args[i10];
            int i12 = i11 + 1;
            ArrayList arrayList3 = this.f52221f;
            if (array == null && this.f52218c == 1) {
                array = this.f52222g.get(i11);
            } else {
                Class cls = (Class) arrayList3.get(i11);
                if (array instanceof Class) {
                    array = null;
                } else {
                    if (array instanceof qk.d) {
                        array = d0.c.p((qk.d) array);
                    } else if (array instanceof Object[]) {
                        Object[] objArr = (Object[]) array;
                        if (objArr instanceof Class[]) {
                            array = null;
                        } else if (objArr instanceof qk.d[]) {
                            qk.d[] dVarArr = (qk.d[]) array;
                            ArrayList arrayList4 = new ArrayList(dVarArr.length);
                            for (qk.d dVar : dVarArr) {
                                arrayList4.add(d0.c.p(dVar));
                            }
                            array = arrayList4.toArray(new Class[0]);
                        } else {
                            array = objArr;
                        }
                    }
                    if (!cls.isInstance(array)) {
                        array = null;
                    }
                }
            }
            if (array == null) {
                String str = (String) arrayList2.get(i11);
                Class cls2 = (Class) arrayList3.get(i11);
                qk.d dVarB = kotlin.jvm.internal.n.a(cls2, Class.class) ? d0.f44761a.b(qk.d.class) : (cls2.isArray() && kotlin.jvm.internal.n.a(cls2.getComponentType(), Class.class)) ? d0.f44761a.b(qk.d[].class) : d0.c.s(cls2);
                if (kotlin.jvm.internal.n.a(dVarB.d(), d0.f44761a.b(Object[].class).d())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(dVarB.d());
                    sb2.append('<');
                    Class<?> componentType = d0.c.p(dVarB).getComponentType();
                    kotlin.jvm.internal.n.e(componentType, "kotlinClass.java.componentType");
                    sb2.append(d0.c.s(componentType).d());
                    sb2.append('>');
                    strD = sb2.toString();
                } else {
                    strD = dVarB.d();
                }
                throw new IllegalArgumentException("Argument #" + i11 + ' ' + str + " is not of the required type " + strD);
            }
            arrayList.add(array);
            i10++;
            i11 = i12;
        }
    }

    @Override // uk.f
    public final Type getReturnType() {
        return this.f52216a;
    }

    public /* synthetic */ a(Class cls, ArrayList arrayList, int i10) {
        ArrayList arrayList2 = new ArrayList(xj.p.W(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, i10, 2, arrayList2);
    }
}
