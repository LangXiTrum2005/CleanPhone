package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: loaded from: classes7.dex */
public final class DeserializedPropertyDescriptor extends PropertyDescriptorImpl implements DeserializedCallableMemberDescriptor {
    public final ProtoBuf.Property B0;
    public final NameResolver C0;
    public final TypeTable D0;
    public final VersionRequirementTable E0;
    public final JvmPackagePartSource F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPropertyDescriptor(DeclarationDescriptor containingDeclaration, PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility visibility, boolean z2, Name name, CallableMemberDescriptor.Kind kind, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ProtoBuf.Property proto, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, JvmPackagePartSource jvmPackagePartSource) {
        super(containingDeclaration, propertyDescriptor, annotations, modality, visibility, z2, name, kind, SourceElement.f43591a, z3, z4, z7, z5, z6);
        Intrinsics.f(containingDeclaration, "containingDeclaration");
        Intrinsics.f(annotations, "annotations");
        Intrinsics.f(modality, "modality");
        Intrinsics.f(visibility, "visibility");
        Intrinsics.f(name, "name");
        Intrinsics.f(kind, "kind");
        Intrinsics.f(proto, "proto");
        Intrinsics.f(nameResolver, "nameResolver");
        Intrinsics.f(typeTable, "typeTable");
        Intrinsics.f(versionRequirementTable, "versionRequirementTable");
        this.B0 = proto;
        this.C0 = nameResolver;
        this.D0 = typeTable;
        this.E0 = versionRequirementTable;
        this.F0 = jvmPackagePartSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final TypeTable A() {
        return this.D0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final NameResolver D() {
        return this.C0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final DeserializedContainerSource E() {
        return this.F0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    public final PropertyDescriptorImpl J0(DeclarationDescriptor newOwner, Modality newModality, DescriptorVisibility newVisibility, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, Name newName) {
        Intrinsics.f(newOwner, "newOwner");
        Intrinsics.f(newModality, "newModality");
        Intrinsics.f(newVisibility, "newVisibility");
        Intrinsics.f(kind, "kind");
        Intrinsics.f(newName, "newName");
        return new DeserializedPropertyDescriptor(newOwner, propertyDescriptor, getAnnotations(), newModality, newVisibility, this.g0, newName, kind, this.o0, this.p0, isExternal(), this.s0, this.q0, this.B0, this.C0, this.D0, this.E0, this.F0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final MessageLite X() {
        return this.B0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return Flags.D.e(this.B0.e0).booleanValue();
    }
}
