package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaMethod extends ReflectJavaMember implements JavaMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f43711a;

    public ReflectJavaMethod(Method member) {
        Intrinsics.f(member, "member");
        this.f43711a = member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public final boolean E() {
        Object defaultValue = this.f43711a.getDefaultValue();
        return (defaultValue != null ? ReflectJavaAnnotationArgument.Factory.a(defaultValue, null) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public final Member F() {
        return this.f43711a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public final List e() {
        Method method = this.f43711a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Intrinsics.e(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        Intrinsics.e(parameterAnnotations, "member.parameterAnnotations");
        return G(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f43711a.getTypeParameters();
        Intrinsics.e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public final ReflectJavaType x() {
        Type genericReturnType = this.f43711a.getGenericReturnType();
        Intrinsics.e(genericReturnType, "member.genericReturnType");
        return ReflectJavaType.Factory.a(genericReturnType);
    }
}
