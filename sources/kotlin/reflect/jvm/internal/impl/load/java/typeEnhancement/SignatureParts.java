package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;

/* JADX INFO: loaded from: classes7.dex */
final class SignatureParts extends AbstractSignatureParts<AnnotationDescriptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeclarationDescriptorNonRoot f43951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LazyJavaResolverContext f43953c;
    public final AnnotationQualifierApplicabilityType d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f43954e;

    public SignatureParts(DeclarationDescriptorNonRoot declarationDescriptorNonRoot, boolean z2, LazyJavaResolverContext containerContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z3) {
        Intrinsics.f(containerContext, "containerContext");
        this.f43951a = declarationDescriptorNonRoot;
        this.f43952b = z2;
        this.f43953c = containerContext;
        this.d = annotationQualifierApplicabilityType;
        this.f43954e = z3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final Annotations c(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.f(kotlinTypeMarker, "<this>");
        return ((KotlinType) kotlinTypeMarker).getAnnotations();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final JavaTypeQualifiersByElementType e() {
        return (JavaTypeQualifiersByElementType) this.f43953c.d.getX();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final KotlinType f(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.f(kotlinTypeMarker, "<this>");
        return TypeWithEnhancementKt.a((KotlinType) kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean h() {
        return this.f43954e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean i(TypeParameterMarker typeParameterMarker) {
        Intrinsics.f(typeParameterMarker, "<this>");
        return typeParameterMarker instanceof LazyJavaTypeParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final AnnotationTypeQualifierResolver b() {
        return this.f43953c.f43840a.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FqNameUnsafe l(SimpleTypeMarker simpleTypeMarker) {
        Intrinsics.f(simpleTypeMarker, "<this>");
        ErrorType errorType = TypeUtils.f44555a;
        ClassifierDescriptor classifierDescriptorC = ((KotlinType) simpleTypeMarker).H0().c();
        ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
        if (classDescriptor != null) {
            return DescriptorUtils.g(classDescriptor);
        }
        return null;
    }
}
