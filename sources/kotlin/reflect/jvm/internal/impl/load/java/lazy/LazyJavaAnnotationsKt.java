package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyJavaAnnotationsKt {
    public static final LazyJavaAnnotations a(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner annotationsOwner) {
        Intrinsics.f(lazyJavaResolverContext, "<this>");
        Intrinsics.f(annotationsOwner, "annotationsOwner");
        return new LazyJavaAnnotations(lazyJavaResolverContext, annotationsOwner, false);
    }
}
