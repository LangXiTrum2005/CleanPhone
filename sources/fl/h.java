package fl;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends a0 implements pl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f40993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f40994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xj.v f40995c;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Type type) {
        a0 yVar;
        a0 yVar2;
        this.f40993a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    kotlin.jvm.internal.n.e(componentType, "getComponentType()");
                    yVar = componentType.isPrimitive() ? new y(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new h(componentType) : componentType instanceof WildcardType ? new d0((WildcardType) componentType) : new p(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        kotlin.jvm.internal.n.e(genericComponentType, "genericComponentType");
        boolean z10 = genericComponentType instanceof Class;
        if (z10) {
            Class cls2 = (Class) genericComponentType;
            yVar2 = cls2.isPrimitive() ? new y(cls2) : yVar2;
            this.f40994b = yVar2;
            this.f40995c = xj.v.f53866a;
        }
        yVar = ((genericComponentType instanceof GenericArrayType) || (z10 && ((Class) genericComponentType).isArray())) ? new h(genericComponentType) : genericComponentType instanceof WildcardType ? new d0((WildcardType) genericComponentType) : new p(genericComponentType);
        yVar2 = yVar;
        this.f40994b = yVar2;
        this.f40995c = xj.v.f53866a;
    }

    @Override // fl.a0
    public final Type b() {
        return this.f40993a;
    }

    @Override // pl.b
    public final Collection getAnnotations() {
        return this.f40995c;
    }
}
