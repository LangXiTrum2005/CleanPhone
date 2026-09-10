package fl;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends a0 implements pl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f41003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f41004b;

    public p(Type reflectType) {
        r nVar;
        kotlin.jvm.internal.n.f(reflectType, "reflectType");
        this.f41003a = reflectType;
        if (reflectType instanceof Class) {
            nVar = new n((Class) reflectType);
        } else if (reflectType instanceof TypeVariable) {
            nVar = new b0((TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + reflectType.getClass() + "): " + reflectType);
            }
            Type rawType = ((ParameterizedType) reflectType).getRawType();
            kotlin.jvm.internal.n.d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            nVar = new n((Class) rawType);
        }
        this.f41004b = nVar;
    }

    @Override // fl.a0, pl.b
    public final d a(yl.c fqName) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        return null;
    }

    @Override // fl.a0
    public final Type b() {
        return this.f41003a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    public final ArrayList c() {
        pl.b hVar;
        pl.b yVar;
        List<Type> listC = c.c(this.f41003a);
        ArrayList arrayList = new ArrayList(xj.p.W(listC, 10));
        for (Type type : listC) {
            kotlin.jvm.internal.n.f(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    yVar = new y(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) {
                        hVar = new h(type);
                    } else {
                        hVar = type instanceof WildcardType ? new d0((WildcardType) type) : new p(type);
                    }
                    yVar = hVar;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    hVar = new h(type);
                } else {
                    hVar = new h(type);
                }
                yVar = hVar;
            }
            arrayList.add(yVar);
        }
        return arrayList;
    }

    public final boolean d() {
        Type type = this.f41003a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            kotlin.jvm.internal.n.e(typeParameters, "getTypeParameters()");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // pl.b
    public final Collection getAnnotations() {
        return xj.v.f53866a;
    }
}
