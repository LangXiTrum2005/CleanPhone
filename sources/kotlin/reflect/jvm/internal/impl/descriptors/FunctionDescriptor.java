package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public interface FunctionDescriptor extends CallableMemberDescriptor {

    public interface CopyBuilder<D extends FunctionDescriptor> {
        CopyBuilder a(List list);

        CopyBuilder b(ReceiverParameterDescriptor receiverParameterDescriptor);

        FunctionDescriptor build();

        CopyBuilder c();

        CopyBuilder d();

        CopyBuilder e(TypeSubstitution typeSubstitution);

        CopyBuilder f(DescriptorVisibility descriptorVisibility);

        CopyBuilder g();

        CopyBuilder h();

        CopyBuilder i(ClassDescriptor classDescriptor);

        CopyBuilder j(Name name);

        CopyBuilder k(ClassConstructorDescriptor classConstructorDescriptor);

        CopyBuilder l(Modality modality);

        CopyBuilder m();

        CopyBuilder n(KotlinType kotlinType);

        CopyBuilder o();

        CopyBuilder p(CallableMemberDescriptor.Kind kind);

        CopyBuilder q(Annotations annotations);

        CopyBuilder r();
    }

    CopyBuilder A0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    FunctionDescriptor a();

    FunctionDescriptor b(TypeSubstitutor typeSubstitutor);

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    FunctionDescriptor l0();

    boolean w0();

    boolean y();

    boolean z0();
}
