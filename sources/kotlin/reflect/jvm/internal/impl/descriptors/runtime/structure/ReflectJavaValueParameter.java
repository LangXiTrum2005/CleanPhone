package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaValueParameter extends ReflectJavaElement implements JavaValueParameter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReflectJavaType f43716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Annotation[] f43717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43718c;
    public final boolean d;

    public ReflectJavaValueParameter(ReflectJavaType reflectJavaType, Annotation[] reflectAnnotations, String str, boolean z2) {
        Intrinsics.f(reflectAnnotations, "reflectAnnotations");
        this.f43716a = reflectJavaType;
        this.f43717b = reflectAnnotations;
        this.f43718c = str;
        this.d = z2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final JavaAnnotation b(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        return ReflectJavaAnnotationOwnerKt.a(this.f43717b, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        return ReflectJavaAnnotationOwnerKt.b(this.f43717b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public final Name getName() {
        String str = this.f43718c;
        if (str != null) {
            return Name.f(str);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public final JavaType getType() {
        return this.f43716a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public final boolean h() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReflectJavaValueParameter.class.getName());
        sb.append(": ");
        sb.append(this.d ? "vararg " : "");
        sb.append(getName());
        sb.append(": ");
        sb.append(this.f43716a);
        return sb.toString();
    }
}
