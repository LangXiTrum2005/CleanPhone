package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaConstructor extends ReflectJavaMember implements JavaConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Constructor f43707a;

    public ReflectJavaConstructor(Constructor member) {
        Intrinsics.f(member, "member");
        this.f43707a = member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public final Member F() {
        return this.f43707a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor
    public final List e() {
        Constructor constructor = this.f43707a;
        Type[] types = constructor.getGenericParameterTypes();
        Intrinsics.e(types, "types");
        if (types.length == 0) {
            return EmptyList.X;
        }
        Class declaringClass = constructor.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            types = (Type[]) ArraysKt.r(types, 1, types.length);
        }
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        if (parameterAnnotations.length >= types.length) {
            if (parameterAnnotations.length > types.length) {
                parameterAnnotations = (Annotation[][]) ArraysKt.r(parameterAnnotations, parameterAnnotations.length - types.length, parameterAnnotations.length);
            }
            return G(types, parameterAnnotations, constructor.isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + constructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f43707a.getTypeParameters();
        Intrinsics.e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }
}
