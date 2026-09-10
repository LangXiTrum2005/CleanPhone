package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaTypeParameter extends ReflectJavaElement implements ReflectJavaAnnotationOwner, JavaTypeParameter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeVariable f43715a;

    public ReflectJavaTypeParameter(TypeVariable typeVariable) {
        Intrinsics.f(typeVariable, "typeVariable");
        this.f43715a = typeVariable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final JavaAnnotation b(FqName fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.f(fqName, "fqName");
        TypeVariable typeVariable = this.f43715a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.a(declaredAnnotations, fqName);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReflectJavaTypeParameter) {
            return Intrinsics.a(this.f43715a, ((ReflectJavaTypeParameter) obj).f43715a);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f43715a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? EmptyList.X : ReflectJavaAnnotationOwnerKt.b(declaredAnnotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public final Name getName() {
        return Name.g(this.f43715a.getName());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter
    public final Collection getUpperBounds() {
        Type[] bounds = this.f43715a.getBounds();
        Intrinsics.e(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new ReflectJavaClassifierType(type));
        }
        ReflectJavaClassifierType reflectJavaClassifierType = (ReflectJavaClassifierType) CollectionsKt.Y(arrayList);
        Collection collection = arrayList;
        if (Intrinsics.a(reflectJavaClassifierType != null ? reflectJavaClassifierType.f43705a : null, Object.class)) {
            collection = EmptyList.X;
        }
        return collection;
    }

    public final int hashCode() {
        return this.f43715a.hashCode();
    }

    public final String toString() {
        return ReflectJavaTypeParameter.class.getName() + ": " + this.f43715a;
    }
}
