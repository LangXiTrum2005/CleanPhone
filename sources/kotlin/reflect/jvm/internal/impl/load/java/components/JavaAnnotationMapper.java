package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaAnnotationMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Name f43807a = Name.g(PglCryptUtils.KEY_MESSAGE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Name f43808b = Name.g("allowedTargets");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Name f43809c = Name.g("value");
    public static final Object d = MapsKt.j(new Pair(StandardNames.FqNames.t, JvmAnnotationNames.f43767c), new Pair(StandardNames.FqNames.f43506w, JvmAnnotationNames.d), new Pair(StandardNames.FqNames.x, JvmAnnotationNames.f));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public static PossiblyExternalAnnotationDescriptor a(FqName kotlinName, JavaAnnotationOwner annotationOwner, LazyJavaResolverContext c2) {
        JavaAnnotation javaAnnotationB;
        Intrinsics.f(kotlinName, "kotlinName");
        Intrinsics.f(annotationOwner, "annotationOwner");
        Intrinsics.f(c2, "c");
        if (kotlinName.equals(StandardNames.FqNames.m)) {
            FqName DEPRECATED_ANNOTATION = JvmAnnotationNames.f43768e;
            Intrinsics.e(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            JavaAnnotation javaAnnotationB2 = annotationOwner.b(DEPRECATED_ANNOTATION);
            if (javaAnnotationB2 != null) {
                return new JavaDeprecatedAnnotationDescriptor(javaAnnotationB2, c2);
            }
        }
        FqName fqName = (FqName) d.get(kotlinName);
        if (fqName == null || (javaAnnotationB = annotationOwner.b(fqName)) == null) {
            return null;
        }
        return b(c2, javaAnnotationB, false);
    }

    public static PossiblyExternalAnnotationDescriptor b(LazyJavaResolverContext c2, JavaAnnotation annotation, boolean z2) {
        Intrinsics.f(annotation, "annotation");
        Intrinsics.f(c2, "c");
        ClassId classIdA = annotation.a();
        if (classIdA.equals(ClassId.j(JvmAnnotationNames.f43767c))) {
            return new JavaTargetAnnotationDescriptor(annotation, c2);
        }
        if (classIdA.equals(ClassId.j(JvmAnnotationNames.d))) {
            return new JavaRetentionAnnotationDescriptor(annotation, c2);
        }
        if (classIdA.equals(ClassId.j(JvmAnnotationNames.f))) {
            return new JavaAnnotationDescriptor(c2, annotation, StandardNames.FqNames.x);
        }
        if (classIdA.equals(ClassId.j(JvmAnnotationNames.f43768e))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(c2, annotation, z2);
    }
}
