package uk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends u implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f52231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f52232f;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(Constructor constructor, Object obj, int i10) {
        this.f52231e = i10;
        switch (i10) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                kotlin.jvm.internal.n.e(declaringClass, "constructor.declaringClass");
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                kotlin.jvm.internal.n.e(genericParameterTypes, "constructor.genericParameterTypes");
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f52232f = obj;
                break;
            default:
                Class declaringClass2 = constructor.getDeclaringClass();
                kotlin.jvm.internal.n.e(declaringClass2, "constructor.declaringClass");
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                kotlin.jvm.internal.n.e(genericParameterTypes2, "constructor.genericParameterTypes");
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : xj.k.j0(1, genericParameterTypes2.length - 1, genericParameterTypes2)));
                this.f52232f = obj;
                break;
        }
    }

    @Override // uk.f
    public final Object call(Object[] args) {
        switch (this.f52231e) {
            case 0:
                kotlin.jvm.internal.n.f(args, "args");
                com.google.android.gms.internal.auth.o.c(this, args);
                Constructor constructor = (Constructor) this.f52243a;
                h2.d dVar = new h2.d(3);
                dVar.f(this.f52232f);
                dVar.h(args);
                dVar.f(null);
                ArrayList arrayList = dVar.f42079a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                kotlin.jvm.internal.n.f(args, "args");
                com.google.android.gms.internal.auth.o.c(this, args);
                Constructor constructor2 = (Constructor) this.f52243a;
                h2.d dVar2 = new h2.d(2);
                dVar2.f(this.f52232f);
                dVar2.h(args);
                ArrayList arrayList2 = dVar2.f42079a;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
