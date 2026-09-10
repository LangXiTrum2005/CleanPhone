package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;

/* JADX INFO: loaded from: classes7.dex */
public final class ContextKt {
    public static LazyJavaResolverContext a(final LazyJavaResolverContext lazyJavaResolverContext, final ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaClass javaClass, int i2) {
        if ((i2 & 2) != 0) {
            javaClass = null;
        }
        Intrinsics.f(lazyJavaResolverContext, "<this>");
        return new LazyJavaResolverContext(lazyJavaResolverContext.f43840a, javaClass != null ? new LazyJavaTypeParameterResolver(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaClass, 0) : lazyJavaResolverContext.f43841b, LazyKt.a(LazyThreadSafetyMode.Z, new Function0<JavaTypeQualifiersByElementType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$childForClassOrPackage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Annotations additionalAnnotations = classOrPackageFragmentDescriptor.getAnnotations();
                LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaResolverContext;
                Intrinsics.f(lazyJavaResolverContext2, "<this>");
                Intrinsics.f(additionalAnnotations, "additionalAnnotations");
                JavaResolverComponents javaResolverComponents = lazyJavaResolverContext2.f43840a;
                return javaResolverComponents.q.b((JavaTypeQualifiersByElementType) lazyJavaResolverContext2.d.getX(), additionalAnnotations);
            }
        }));
    }

    public static final LazyJavaResolverContext b(final LazyJavaResolverContext lazyJavaResolverContext, final Annotations additionalAnnotations) {
        Intrinsics.f(lazyJavaResolverContext, "<this>");
        Intrinsics.f(additionalAnnotations, "additionalAnnotations");
        if (additionalAnnotations.isEmpty()) {
            return lazyJavaResolverContext;
        }
        return new LazyJavaResolverContext(lazyJavaResolverContext.f43840a, lazyJavaResolverContext.f43841b, LazyKt.a(LazyThreadSafetyMode.Z, new Function0<JavaTypeQualifiersByElementType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$copyWithNewDefaultTypeQualifiers$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaResolverContext;
                Intrinsics.f(lazyJavaResolverContext2, "<this>");
                Annotations additionalAnnotations2 = additionalAnnotations;
                Intrinsics.f(additionalAnnotations2, "additionalAnnotations");
                JavaResolverComponents javaResolverComponents = lazyJavaResolverContext2.f43840a;
                return javaResolverComponents.q.b((JavaTypeQualifiersByElementType) lazyJavaResolverContext2.d.getX(), additionalAnnotations2);
            }
        }));
    }
}
