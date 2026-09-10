package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;

/* JADX INFO: loaded from: classes7.dex */
public final class CloneableClassScope extends GivenFunctionsMemberScope {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Name f43520e = Name.g("clone");

    public static final class Companion {
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    public final List h() {
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.X;
        SourceElement sourceElement = SourceElement.f43591a;
        AbstractClassDescriptor abstractClassDescriptor = this.f44342b;
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplQ0 = SimpleFunctionDescriptorImpl.Q0(abstractClassDescriptor, f43520e, kind, sourceElement);
        ReceiverParameterDescriptor receiverParameterDescriptorE0 = abstractClassDescriptor.E0();
        EmptyList emptyList = EmptyList.X;
        simpleFunctionDescriptorImplQ0.J0(null, receiverParameterDescriptorE0, emptyList, emptyList, emptyList, DescriptorUtilsKt.e(abstractClassDescriptor).e(), Modality.Z, DescriptorVisibilities.f43563c);
        return CollectionsKt.H(simpleFunctionDescriptorImplQ0);
    }
}
