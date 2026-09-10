package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public interface ConstructorDescriptor extends FunctionDescriptor {
    boolean U();

    ClassDescriptor V();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    ConstructorDescriptor b(TypeSubstitutor typeSubstitutor);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ClassifierDescriptorWithTypeParameters d();
}
