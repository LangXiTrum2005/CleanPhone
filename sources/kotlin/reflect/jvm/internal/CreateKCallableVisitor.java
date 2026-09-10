package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/CreateKCallableVisitor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorVisitorEmptyBodies;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptor", "data", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class CreateKCallableVisitor extends DeclarationDescriptorVisitorEmptyBodies<KCallableImpl<?>, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KDeclarationContainerImpl f43370a;

    public CreateKCallableVisitor(KDeclarationContainerImpl container) {
        Intrinsics.f(container, "container");
        this.f43370a = container;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object g(PropertyDescriptorImpl descriptor, Object obj) {
        Intrinsics.f(descriptor, "descriptor");
        int i2 = (descriptor.u0 != null ? 1 : 0) + (descriptor.v0 != null ? 1 : 0);
        boolean z2 = descriptor.g0;
        KDeclarationContainerImpl kDeclarationContainerImpl = this.f43370a;
        if (z2) {
            if (i2 == 0) {
                return new KMutableProperty0Impl(kDeclarationContainerImpl, descriptor);
            }
            if (i2 == 1) {
                return new KMutableProperty1Impl(kDeclarationContainerImpl, descriptor);
            }
            if (i2 == 2) {
                return new KMutableProperty2Impl(kDeclarationContainerImpl, descriptor);
            }
        } else {
            if (i2 == 0) {
                return new KProperty0Impl(kDeclarationContainerImpl, descriptor);
            }
            if (i2 == 1) {
                return new KProperty1Impl(kDeclarationContainerImpl, descriptor);
            }
            if (i2 == 2) {
                return new KProperty2Impl(kDeclarationContainerImpl, descriptor);
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + descriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object l(FunctionDescriptor functionDescriptor, Object obj) {
        return new KFunctionImpl(this.f43370a, functionDescriptor);
    }
}
