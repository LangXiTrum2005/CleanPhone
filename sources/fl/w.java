package fl;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends v implements pl.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f41009a;

    public w(Method member) {
        kotlin.jvm.internal.n.f(member, "member");
        this.f41009a = member;
    }

    @Override // fl.v
    public final Member b() {
        return this.f41009a;
    }

    public final a0 f() {
        Type genericReturnType = this.f41009a.getGenericReturnType();
        kotlin.jvm.internal.n.e(genericReturnType, "member.genericReturnType");
        boolean z10 = genericReturnType instanceof Class;
        if (z10) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new y(cls);
            }
        }
        if ((genericReturnType instanceof GenericArrayType) || (z10 && ((Class) genericReturnType).isArray())) {
            return new h(genericReturnType);
        }
        return genericReturnType instanceof WildcardType ? new d0((WildcardType) genericReturnType) : new p(genericReturnType);
    }

    public final List g() {
        Method method = this.f41009a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        kotlin.jvm.internal.n.e(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        kotlin.jvm.internal.n.e(parameterAnnotations, "member.parameterAnnotations");
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // pl.e
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f41009a.getTypeParameters();
        kotlin.jvm.internal.n.e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new b0(typeVariable));
        }
        return arrayList;
    }
}
