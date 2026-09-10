package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;

/* JADX INFO: loaded from: classes7.dex */
public interface ClassDescriptor extends ClassOrPackageFragmentDescriptor, ClassifierDescriptorWithTypeParameters {
    boolean D0();

    ReceiverParameterDescriptor E0();

    MemberScope N();

    ValueClassRepresentation O();

    MemberScope Q();

    List S();

    boolean T();

    boolean W();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ClassDescriptor a();

    boolean b0();

    MemberScope f0();

    ClassDescriptor g0();

    ClassKind getKind();

    DescriptorVisibility getVisibility();

    Collection i();

    boolean isInline();

    MemberScope j0(TypeSubstitution typeSubstitution);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    SimpleType o();

    List p();

    Modality q();

    Collection u();

    ClassConstructorDescriptor z();
}
