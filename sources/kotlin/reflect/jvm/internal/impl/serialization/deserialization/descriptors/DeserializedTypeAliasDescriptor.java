package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes7.dex */
public final class DeserializedTypeAliasDescriptor extends AbstractTypeAliasDescriptor implements DeserializedMemberDescriptor {
    public final LockBasedStorageManager i0;
    public final ProtoBuf.TypeAlias j0;
    public final NameResolver k0;
    public final TypeTable l0;
    public final VersionRequirementTable m0;
    public final JvmPackagePartSource n0;
    public Object o0;
    public SimpleType p0;
    public SimpleType q0;
    public List r0;
    public SimpleType s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedTypeAliasDescriptor(LockBasedStorageManager storageManager, DeclarationDescriptor containingDeclaration, Annotations annotations, Name name, DelegatedDescriptorVisibility visibility, ProtoBuf.TypeAlias proto, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, JvmPackagePartSource jvmPackagePartSource) {
        super(containingDeclaration, annotations, name, visibility);
        Intrinsics.f(storageManager, "storageManager");
        Intrinsics.f(containingDeclaration, "containingDeclaration");
        Intrinsics.f(visibility, "visibility");
        Intrinsics.f(proto, "proto");
        Intrinsics.f(nameResolver, "nameResolver");
        Intrinsics.f(typeTable, "typeTable");
        Intrinsics.f(versionRequirementTable, "versionRequirementTable");
        this.i0 = storageManager;
        this.j0 = proto;
        this.k0 = nameResolver;
        this.l0 = typeTable;
        this.m0 = versionRequirementTable;
        this.n0 = jvmPackagePartSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final TypeTable A() {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public final SimpleType C() {
        SimpleType simpleType = this.q0;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.m("expandedType");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final NameResolver D() {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public final DeserializedContainerSource E() {
        return this.n0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor
    public final List G0() {
        List list = this.r0;
        if (list != null) {
            return list;
        }
        Intrinsics.m("typeConstructorParameters");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x016f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0172 A[SYNTHETIC] */
    public final void H0(List list, SimpleType underlyingType, SimpleType expandedType) {
        ClassConstructorDescriptor classConstructorDescriptorB;
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor;
        List list2;
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl;
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor2 = this;
        Intrinsics.f(underlyingType, "underlyingType");
        Intrinsics.f(expandedType, "expandedType");
        deserializedTypeAliasDescriptor2.g0 = list;
        deserializedTypeAliasDescriptor2.p0 = underlyingType;
        deserializedTypeAliasDescriptor2.q0 = expandedType;
        deserializedTypeAliasDescriptor2.r0 = TypeParameterUtilsKt.b(deserializedTypeAliasDescriptor2);
        deserializedTypeAliasDescriptor2.s0 = deserializedTypeAliasDescriptor2.F0();
        ClassDescriptor classDescriptorR = deserializedTypeAliasDescriptor2.r();
        List list3 = EmptyList.X;
        if (classDescriptorR != null) {
            Collection<ClassConstructorDescriptor> collectionI = classDescriptorR.i();
            Intrinsics.e(collectionI, "classDescriptor.constructors");
            ArrayList arrayList = new ArrayList();
            for (ClassConstructorDescriptor it : collectionI) {
                TypeAliasConstructorDescriptorImpl.Companion companion = TypeAliasConstructorDescriptorImpl.J0;
                LockBasedStorageManager storageManager = deserializedTypeAliasDescriptor2.i0;
                Intrinsics.e(it, "it");
                companion.getClass();
                Intrinsics.f(storageManager, "storageManager");
                TypeSubstitutor typeSubstitutorD = deserializedTypeAliasDescriptor2.r() == null ? null : TypeSubstitutor.d(deserializedTypeAliasDescriptor2.C());
                if (typeSubstitutorD == null || (classConstructorDescriptorB = it.b(typeSubstitutorD)) == null) {
                    deserializedTypeAliasDescriptor = deserializedTypeAliasDescriptor2;
                } else {
                    Annotations annotations = it.getAnnotations();
                    CallableMemberDescriptor.Kind kind = it.getKind();
                    Intrinsics.e(kind, "constructor.kind");
                    SourceElement sourceElementF = deserializedTypeAliasDescriptor2.f();
                    Intrinsics.e(sourceElementF, "typeAliasDescriptor.source");
                    TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(storageManager, deserializedTypeAliasDescriptor2, classConstructorDescriptorB, null, annotations, kind, sourceElementF);
                    deserializedTypeAliasDescriptor = deserializedTypeAliasDescriptor2;
                    List listE = it.e();
                    if (listE == null) {
                        FunctionDescriptorImpl.Z(28);
                        throw null;
                    }
                    TypeSubstitutor typeSubstitutor = typeSubstitutorD;
                    ArrayList arrayListI0 = FunctionDescriptorImpl.I0(typeAliasConstructorDescriptorImpl2, listE, typeSubstitutor, false, false, null);
                    if (arrayListI0 != null) {
                        SimpleType simpleTypeC = SpecialTypesKt.c(FlexibleTypesKt.b(classConstructorDescriptorB.getReturnType().K0()), deserializedTypeAliasDescriptor.o());
                        ReceiverParameterDescriptor receiverParameterDescriptorG = it.G();
                        Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1 = Annotations.Companion.f43614a;
                        Variance variance = Variance.INVARIANT;
                        ReceiverParameterDescriptorImpl receiverParameterDescriptorImplH = receiverParameterDescriptorG != null ? DescriptorFactory.h(typeAliasConstructorDescriptorImpl2, typeSubstitutor.g(receiverParameterDescriptorG.getType(), variance), annotations$Companion$EMPTY$1) : null;
                        ClassDescriptor classDescriptorR2 = deserializedTypeAliasDescriptor.r();
                        if (classDescriptorR2 != null) {
                            List listR0 = it.r0();
                            Intrinsics.e(listR0, "constructor.contextReceiverParameters");
                            List list4 = listR0;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list4, 10));
                            int i2 = 0;
                            for (Object obj : list4) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    CollectionsKt.f0();
                                    throw null;
                                }
                                ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) obj;
                                KotlinType kotlinTypeG = typeSubstitutor.g(receiverParameterDescriptor.getType(), variance);
                                ReceiverValue value = receiverParameterDescriptor.getValue();
                                Variance variance2 = variance;
                                Intrinsics.d(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                                TypeSubstitutor typeSubstitutor2 = typeSubstitutor;
                                ContextClassReceiver contextClassReceiver = new ContextClassReceiver(classDescriptorR2, kotlinTypeG, ((ImplicitContextReceiver) value).a());
                                Regex regex = NameUtils.f44172a;
                                arrayList2.add(new ReceiverParameterDescriptorImpl(classDescriptorR2, contextClassReceiver, annotations$Companion$EMPTY$1, Name.g("_context_receiver_" + i2)));
                                variance = variance2;
                                i2 = i3;
                                typeSubstitutor = typeSubstitutor2;
                            }
                            list2 = arrayList2;
                        } else {
                            list2 = list3;
                        }
                        typeAliasConstructorDescriptorImpl2.J0(receiverParameterDescriptorImplH, null, list2, deserializedTypeAliasDescriptor.p(), arrayListI0, simpleTypeC, Modality.X, deserializedTypeAliasDescriptor.f0);
                        typeAliasConstructorDescriptorImpl = typeAliasConstructorDescriptorImpl2;
                    }
                    if (typeAliasConstructorDescriptorImpl != null) {
                        arrayList.add(typeAliasConstructorDescriptorImpl);
                    }
                    deserializedTypeAliasDescriptor2 = deserializedTypeAliasDescriptor;
                }
                typeAliasConstructorDescriptorImpl = null;
                if (typeAliasConstructorDescriptorImpl != null) {
                    arrayList.add(typeAliasConstructorDescriptorImpl);
                }
                deserializedTypeAliasDescriptor2 = deserializedTypeAliasDescriptor;
            }
            list3 = arrayList;
        }
        deserializedTypeAliasDescriptor2.o0 = list3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final DeclarationDescriptorNonRoot b(TypeSubstitutor substitutor) {
        Intrinsics.f(substitutor, "substitutor");
        if (substitutor.f44551a.e()) {
            return this;
        }
        DeclarationDescriptor containingDeclaration = d();
        Intrinsics.e(containingDeclaration, "containingDeclaration");
        Annotations annotations = getAnnotations();
        Intrinsics.e(annotations, "annotations");
        Name name = getName();
        Intrinsics.e(name, "name");
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.i0, containingDeclaration, annotations, name, this.f0, this.j0, this.k0, this.l0, this.m0, this.n0);
        List listP = p();
        SimpleType simpleTypeM0 = m0();
        Variance variance = Variance.INVARIANT;
        deserializedTypeAliasDescriptor.H0(listP, TypeSubstitutionKt.a(substitutor.g(simpleTypeM0, variance)), TypeSubstitutionKt.a(substitutor.g(C(), variance)));
        return deserializedTypeAliasDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public final SimpleType m0() {
        SimpleType simpleType = this.p0;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.m("underlyingType");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final SimpleType o() {
        SimpleType simpleType = this.s0;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.m("defaultTypeImpl");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public final ClassDescriptor r() {
        if (KotlinTypeKt.a(C())) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorC = C().H0().c();
        if (classifierDescriptorC instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorC;
        }
        return null;
    }
}
