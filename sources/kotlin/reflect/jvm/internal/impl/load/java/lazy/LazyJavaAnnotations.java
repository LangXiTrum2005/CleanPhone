package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.TransformingSequence;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyJavaAnnotations implements Annotations {
    public final LazyJavaResolverContext X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final JavaAnnotationOwner f43836Y;
    public final boolean Z;
    public final MemoizedFunctionToNullable e0;

    public LazyJavaAnnotations(LazyJavaResolverContext c2, JavaAnnotationOwner annotationOwner, boolean z2) {
        Intrinsics.f(c2, "c");
        Intrinsics.f(annotationOwner, "annotationOwner");
        this.X = c2;
        this.f43836Y = annotationOwner;
        this.Z = z2;
        this.e0 = c2.f43840a.f43824a.h(new Function1<JavaAnnotation, AnnotationDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations$annotationDescriptors$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                JavaAnnotation annotation = (JavaAnnotation) obj;
                Intrinsics.f(annotation, "annotation");
                Name name = JavaAnnotationMapper.f43807a;
                LazyJavaAnnotations lazyJavaAnnotations = this.X;
                return JavaAnnotationMapper.b(lazyJavaAnnotations.X, annotation, lazyJavaAnnotations.Z);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean E0(FqName fqName) {
        return Annotations.DefaultImpls.b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final AnnotationDescriptor b(FqName fqName) {
        AnnotationDescriptor annotationDescriptor;
        Intrinsics.f(fqName, "fqName");
        JavaAnnotationOwner javaAnnotationOwner = this.f43836Y;
        JavaAnnotation javaAnnotationB = javaAnnotationOwner.b(fqName);
        if (javaAnnotationB != null && (annotationDescriptor = (AnnotationDescriptor) this.e0.invoke(javaAnnotationB)) != null) {
            return annotationDescriptor;
        }
        Name name = JavaAnnotationMapper.f43807a;
        return JavaAnnotationMapper.a(fqName, javaAnnotationOwner, this.X);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        return this.f43836Y.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        JavaAnnotationOwner javaAnnotationOwner = this.f43836Y;
        TransformingSequence transformingSequenceO = SequencesKt.o(CollectionsKt.k(javaAnnotationOwner.getAnnotations()), this.e0);
        Name name = JavaAnnotationMapper.f43807a;
        return new FilteringSequence.AnonymousClass1();
    }
}
