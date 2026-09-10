package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: loaded from: classes7.dex */
public final class DeserializedClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements DeserializedCallableMemberDescriptor {
    public final ProtoBuf.Constructor G0;
    public final NameResolver H0;
    public final TypeTable I0;
    public final VersionRequirementTable J0;
    public final JvmPackagePartSource K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassConstructorDescriptor(ClassDescriptor containingDeclaration, ConstructorDescriptor constructorDescriptor, Annotations annotations, boolean z2, CallableMemberDescriptor.Kind kind, ProtoBuf.Constructor proto, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, JvmPackagePartSource jvmPackagePartSource, SourceElement sourceElement) {
        super(containingDeclaration, constructorDescriptor, annotations, z2, kind, sourceElement == null ? SourceElement.f43591a : sourceElement);
        Intrinsics.f(containingDeclaration, "containingDeclaration");
        Intrinsics.f(annotations, "annotations");
        Intrinsics.f(kind, "kind");
        Intrinsics.f(proto, "proto");
        Intrinsics.f(nameResolver, "nameResolver");
        Intrinsics.f(typeTable, "typeTable");
        Intrinsics.f(versionRequirementTable, "versionRequirementTable");
        this.G0 = proto;
        this.H0 = nameResolver;
        this.I0 = typeTable;
        this.J0 = versionRequirementTable;
        this.K0 = jvmPackagePartSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final TypeTable A() {
        return this.I0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final NameResolver D() {
        return this.H0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final DeserializedContainerSource E() {
        return this.K0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final /* bridge */ /* synthetic */ FunctionDescriptorImpl G0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        return T0(declarationDescriptor, functionDescriptor, kind, annotations, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl
    /* JADX INFO: renamed from: P0 */
    public final /* bridge */ /* synthetic */ ClassConstructorDescriptorImpl G0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        return T0(declarationDescriptor, functionDescriptor, kind, annotations, sourceElement);
    }

    public final DeserializedClassConstructorDescriptor T0(DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Annotations annotations, SourceElement sourceElement) {
        Intrinsics.f(newOwner, "newOwner");
        Intrinsics.f(kind, "kind");
        Intrinsics.f(annotations, "annotations");
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor((ClassDescriptor) newOwner, (ConstructorDescriptor) functionDescriptor, annotations, this.F0, kind, this.G0, this.H0, this.I0, this.J0, this.K0, sourceElement);
        deserializedClassConstructorDescriptor.x0 = this.x0;
        return deserializedClassConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final MessageLite X() {
        return this.G0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean y() {
        return false;
    }
}
