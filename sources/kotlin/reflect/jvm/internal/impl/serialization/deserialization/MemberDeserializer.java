package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public final class MemberDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeserializationContext f44415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnnotationDeserializer f44416b;

    public MemberDeserializer(DeserializationContext c2) {
        Intrinsics.f(c2, "c");
        this.f44415a = c2;
        DeserializationComponents deserializationComponents = c2.f44401a;
        this.f44416b = new AnnotationDeserializer(deserializationComponents.f44392b, deserializationComponents.f44397l);
    }

    public final ProtoContainer a(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            FqName fqNameC = ((PackageFragmentDescriptor) declarationDescriptor).c();
            DeserializationContext deserializationContext = this.f44415a;
            return new ProtoContainer.Package(fqNameC, deserializationContext.f44402b, deserializationContext.d, deserializationContext.g);
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).x0;
        }
        return null;
    }

    public final Annotations b(final GeneratedMessageLite.ExtendableMessage extendableMessage, int i2, final AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.f44110c.e(i2).booleanValue() ? Annotations.Companion.f43614a : new NonEmptyDeserializedAnnotations(this.f44415a.f44401a.f44391a, new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List listI0;
                MemberDeserializer memberDeserializer = this.X;
                ProtoContainer protoContainerA = memberDeserializer.a(memberDeserializer.f44415a.f44403c);
                if (protoContainerA != null) {
                    listI0 = CollectionsKt.i0(memberDeserializer.f44415a.f44401a.f44394e.e(protoContainerA, extendableMessage, annotatedCallableKind));
                } else {
                    listI0 = null;
                }
                return listI0 == null ? EmptyList.X : listI0;
            }
        });
    }

    public final Annotations c(final ProtoBuf.Property property, final boolean z2) {
        return !Flags.f44110c.e(property.e0).booleanValue() ? Annotations.Companion.f43614a : new NonEmptyDeserializedAnnotations(this.f44415a.f44401a.f44391a, new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getPropertyFieldAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List listI0;
                MemberDeserializer memberDeserializer = this.X;
                ProtoContainer protoContainerA = memberDeserializer.a(memberDeserializer.f44415a.f44403c);
                if (protoContainerA != null) {
                    DeserializationContext deserializationContext = memberDeserializer.f44415a;
                    boolean z3 = z2;
                    ProtoBuf.Property property2 = property;
                    listI0 = z3 ? CollectionsKt.i0(deserializationContext.f44401a.f44394e.k(protoContainerA, property2)) : CollectionsKt.i0(deserializationContext.f44401a.f44394e.j(protoContainerA, property2));
                } else {
                    listI0 = null;
                }
                return listI0 == null ? EmptyList.X : listI0;
            }
        });
    }

    public final DeserializedClassConstructorDescriptor d(ProtoBuf.Constructor constructor, boolean z2) {
        DeserializationContext deserializationContext = this.f44415a;
        DeclarationDescriptor declarationDescriptor = deserializationContext.f44403c;
        Intrinsics.d(declarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        int i2 = constructor.e0;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.X;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, b(constructor, i2, annotatedCallableKind), z2, CallableMemberDescriptor.Kind.X, constructor, deserializationContext.f44402b, deserializationContext.d, deserializationContext.f44404e, deserializationContext.g, null);
        DeserializationContext deserializationContextA = deserializationContext.a(deserializedClassConstructorDescriptor, EmptyList.X, deserializationContext.f44402b, deserializationContext.d, deserializationContext.f44404e, deserializationContext.f);
        List list = constructor.f0;
        Intrinsics.e(list, "proto.valueParameterList");
        deserializedClassConstructorDescriptor.R0(deserializationContextA.f44406i.g(list, constructor, annotatedCallableKind), ProtoEnumFlagsUtilsKt.a((ProtoBuf.Visibility) Flags.d.c(constructor.e0)));
        deserializedClassConstructorDescriptor.O0(classDescriptor.o());
        deserializedClassConstructorDescriptor.s0 = classDescriptor.d0();
        deserializedClassConstructorDescriptor.x0 = !Flags.f44115n.e(constructor.e0).booleanValue();
        return deserializedClassConstructorDescriptor;
    }

    public final DeserializedSimpleFunctionDescriptor e(ProtoBuf.Function proto) {
        int i2;
        KotlinType kotlinTypeG;
        Intrinsics.f(proto, "proto");
        if ((proto.Z & 1) == 1) {
            i2 = proto.e0;
        } else {
            int i3 = proto.f0;
            i2 = ((i3 >> 8) << 6) + (i3 & 63);
        }
        int i4 = i2;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.X;
        Annotations annotationsB = b(proto, i4, annotatedCallableKind);
        int i5 = proto.Z;
        int i6 = i5 & 32;
        Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1 = Annotations.Companion.f43614a;
        DeserializationContext deserializationContext = this.f44415a;
        Annotations deserializedAnnotations = (i6 == 32 || (i5 & 64) == 64) ? new DeserializedAnnotations(deserializationContext.f44401a.f44391a, new MemberDeserializer$getReceiverParameterAnnotations$1(this, proto, annotatedCallableKind)) : annotations$Companion$EMPTY$1;
        FqName fqNameG = DescriptorUtilsKt.g(deserializationContext.f44403c);
        int i7 = proto.g0;
        NameResolver nameResolver = deserializationContext.f44402b;
        VersionRequirementTable versionRequirementTable = fqNameG.c(NameResolverUtilKt.b(nameResolver, i7)).equals(SuspendFunctionTypeUtilKt.f44437a) ? VersionRequirementTable.f44126b : deserializationContext.f44404e;
        Name nameB = NameResolverUtilKt.b(nameResolver, proto.g0);
        CallableMemberDescriptor.Kind kindB = ProtoEnumFlagsUtilsKt.b((ProtoBuf.MemberKind) Flags.o.c(i4));
        TypeTable typeTable = deserializationContext.d;
        Annotations annotations = deserializedAnnotations;
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(deserializationContext.f44403c, null, annotationsB, nameB, kindB, proto, deserializationContext.f44402b, typeTable, versionRequirementTable, deserializationContext.g, null);
        List list = proto.j0;
        Intrinsics.e(list, "proto.typeParameterList");
        DeserializationContext deserializationContextA = deserializationContext.a(deserializedSimpleFunctionDescriptor, list, deserializationContext.f44402b, deserializationContext.d, deserializationContext.f44404e, deserializationContext.f);
        ProtoBuf.Type typeB = ProtoTypeTableUtilKt.b(proto, typeTable);
        TypeDeserializer typeDeserializer = deserializationContextA.f44405h;
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImplH = (typeB == null || (kotlinTypeG = typeDeserializer.g(typeB)) == null) ? null : DescriptorFactory.h(deserializedSimpleFunctionDescriptor, kotlinTypeG, annotations);
        DeclarationDescriptor declarationDescriptor = deserializationContext.f44403c;
        ClassDescriptor classDescriptor = declarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptor : null;
        ReceiverParameterDescriptor receiverParameterDescriptorE0 = classDescriptor != null ? classDescriptor.E0() : null;
        List list2 = proto.m0;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List contextReceiverTypeIdList = proto.n0;
            Intrinsics.e(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            List<Integer> list3 = contextReceiverTypeIdList;
            ArrayList arrayList = new ArrayList(CollectionsKt.n(list3, 10));
            for (Integer it : list3) {
                Intrinsics.e(it, "it");
                arrayList.add(typeTable.a(it.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i8 = 0;
        for (Object obj : list2) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt.f0();
                throw null;
            }
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImplB = DescriptorFactory.b(deserializedSimpleFunctionDescriptor, typeDeserializer.g((ProtoBuf.Type) obj), null, annotations$Companion$EMPTY$1, i8);
            if (receiverParameterDescriptorImplB != null) {
                arrayList2.add(receiverParameterDescriptorImplB);
            }
            i8 = i9;
        }
        List listB = typeDeserializer.b();
        List list4 = proto.p0;
        Intrinsics.e(list4, "proto.valueParameterList");
        deserializedSimpleFunctionDescriptor.T0(receiverParameterDescriptorImplH, receiverParameterDescriptorE0, arrayList2, listB, deserializationContextA.f44406i.g(list4, proto, annotatedCallableKind), typeDeserializer.g(ProtoTypeTableUtilKt.c(proto, typeTable)), ProtoEnumFlags.a((ProtoBuf.Modality) Flags.f44111e.c(i4)), ProtoEnumFlagsUtilsKt.a((ProtoBuf.Visibility) Flags.d.c(i4)), EmptyMap.X);
        deserializedSimpleFunctionDescriptor.n0 = Flags.f44116p.e(i4).booleanValue();
        deserializedSimpleFunctionDescriptor.o0 = Flags.q.e(i4).booleanValue();
        deserializedSimpleFunctionDescriptor.p0 = Flags.t.e(i4).booleanValue();
        deserializedSimpleFunctionDescriptor.q0 = Flags.r.e(i4).booleanValue();
        deserializedSimpleFunctionDescriptor.r0 = Flags.s.e(i4).booleanValue();
        deserializedSimpleFunctionDescriptor.w0 = Flags.f44117u.e(i4).booleanValue();
        deserializedSimpleFunctionDescriptor.s0 = Flags.v.e(i4).booleanValue();
        deserializedSimpleFunctionDescriptor.x0 = !Flags.f44118w.e(i4).booleanValue();
        deserializationContext.f44401a.m.getClass();
        return deserializedSimpleFunctionDescriptor;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0104  */
    public final DeserializedPropertyDescriptor f(final ProtoBuf.Property proto) {
        int i2;
        MemberDeserializer memberDeserializer;
        Annotations deserializedAnnotations;
        boolean z2;
        int i3;
        Flags.BooleanFlagField booleanFlagField;
        Flags.BooleanFlagField booleanFlagField2;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplC;
        final MemberDeserializer memberDeserializer2;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        NullableLazyValue nullableLazyValue;
        PropertySetterDescriptorImpl propertySetterDescriptorImplD;
        KotlinType kotlinTypeG;
        Intrinsics.f(proto, "proto");
        if ((proto.Z & 1) == 1) {
            i2 = proto.e0;
        } else {
            int i4 = proto.f0;
            i2 = ((i4 >> 8) << 6) + (i4 & 63);
        }
        DeserializationContext deserializationContext = this.f44415a;
        DeclarationDescriptor declarationDescriptor = deserializationContext.f44403c;
        Annotations annotationsB = b(proto, i2, AnnotatedCallableKind.f44376Y);
        Modality modalityA = ProtoEnumFlags.a((ProtoBuf.Modality) Flags.f44111e.c(i2));
        DelegatedDescriptorVisibility delegatedDescriptorVisibilityA = ProtoEnumFlagsUtilsKt.a((ProtoBuf.Visibility) Flags.d.c(i2));
        boolean zBooleanValue = Flags.x.e(i2).booleanValue();
        Name nameB = NameResolverUtilKt.b(deserializationContext.f44402b, proto.g0);
        CallableMemberDescriptor.Kind kindB = ProtoEnumFlagsUtilsKt.b((ProtoBuf.MemberKind) Flags.o.c(i2));
        boolean zBooleanValue2 = Flags.f44103B.e(i2).booleanValue();
        boolean zBooleanValue3 = Flags.f44102A.e(i2).booleanValue();
        boolean zBooleanValue4 = Flags.D.e(i2).booleanValue();
        boolean zBooleanValue5 = Flags.f44104E.e(i2).booleanValue();
        boolean zBooleanValue6 = Flags.f44105F.e(i2).booleanValue();
        int i5 = i2;
        TypeTable typeTable = deserializationContext.d;
        final DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(declarationDescriptor, null, annotationsB, modalityA, delegatedDescriptorVisibilityA, zBooleanValue, nameB, kindB, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, proto, deserializationContext.f44402b, typeTable, deserializationContext.f44404e, deserializationContext.g);
        List list = proto.j0;
        Intrinsics.e(list, "proto.typeParameterList");
        DeserializationContext deserializationContextA = deserializationContext.a(deserializedPropertyDescriptor, list, deserializationContext.f44402b, deserializationContext.d, deserializationContext.f44404e, deserializationContext.f);
        boolean zBooleanValue7 = Flags.y.e(i5).booleanValue();
        Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1 = Annotations.Companion.f43614a;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.Z;
        if (zBooleanValue7) {
            int i6 = proto.Z;
            if ((i6 & 32) == 32 || (i6 & 64) == 64) {
                memberDeserializer = this;
                deserializedAnnotations = new DeserializedAnnotations(deserializationContext.f44401a.f44391a, new MemberDeserializer$getReceiverParameterAnnotations$1(memberDeserializer, proto, annotatedCallableKind));
            } else {
                memberDeserializer = this;
                deserializedAnnotations = annotations$Companion$EMPTY$1;
            }
        } else {
            memberDeserializer = this;
            deserializedAnnotations = annotations$Companion$EMPTY$1;
        }
        ProtoBuf.Type typeD = ProtoTypeTableUtilKt.d(proto, typeTable);
        TypeDeserializer typeDeserializer = deserializationContextA.f44405h;
        KotlinType kotlinTypeG2 = typeDeserializer.g(typeD);
        List listB = typeDeserializer.b();
        DeclarationDescriptor declarationDescriptor2 = deserializationContext.f44403c;
        ClassDescriptor classDescriptor = declarationDescriptor2 instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptor2 : null;
        ReceiverParameterDescriptor receiverParameterDescriptorE0 = classDescriptor != null ? classDescriptor.E0() : null;
        int i7 = proto.Z;
        ProtoBuf.Type typeA = (i7 & 32) == 32 ? proto.k0 : (i7 & 64) == 64 ? typeTable.a(proto.l0) : null;
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImplH = (typeA == null || (kotlinTypeG = typeDeserializer.g(typeA)) == null) ? null : DescriptorFactory.h(deserializedPropertyDescriptor, kotlinTypeG, deserializedAnnotations);
        List list2 = proto.m0;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List contextReceiverTypeIdList = proto.n0;
            Intrinsics.e(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            List<Integer> list3 = contextReceiverTypeIdList;
            ArrayList arrayList = new ArrayList(CollectionsKt.n(list3, 10));
            for (Integer it : list3) {
                Intrinsics.e(it, "it");
                arrayList.add(typeTable.a(it.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list2, 10));
        int i8 = 0;
        for (Iterator it2 = r0.iterator(); it2.hasNext(); it2 = it2) {
            Object next = it2.next();
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt.f0();
                throw null;
            }
            arrayList2.add(DescriptorFactory.b(deserializedPropertyDescriptor, typeDeserializer.g((ProtoBuf.Type) next), null, annotations$Companion$EMPTY$1, i8));
            i8 = i9;
        }
        deserializedPropertyDescriptor.M0(kotlinTypeG2, listB, receiverParameterDescriptorE0, receiverParameterDescriptorImplH, arrayList2);
        Flags.BooleanFlagField booleanFlagField3 = Flags.f44110c;
        boolean zBooleanValue8 = booleanFlagField3.e(i5).booleanValue();
        Flags.FlagField flagField = Flags.d;
        ProtoBuf.Visibility visibility = (ProtoBuf.Visibility) flagField.c(i5);
        Flags.FlagField flagField2 = Flags.f44111e;
        ProtoBuf.Modality modality = (ProtoBuf.Modality) flagField2.c(i5);
        if (visibility == null) {
            Flags.a(10);
            throw null;
        }
        if (modality == null) {
            Flags.a(11);
            throw null;
        }
        if (zBooleanValue8) {
            z2 = true;
            i3 = 1 << booleanFlagField3.f44121a;
        } else {
            z2 = true;
            i3 = 0;
        }
        int iD = i3 | flagField2.d(modality) | flagField.d(visibility);
        Flags.BooleanFlagField booleanFlagField4 = Flags.f44107J;
        booleanFlagField4.getClass();
        Flags.BooleanFlagField booleanFlagField5 = Flags.K;
        booleanFlagField5.getClass();
        Flags.BooleanFlagField booleanFlagField6 = Flags.L;
        booleanFlagField6.getClass();
        SourceElement sourceElement = SourceElement.f43591a;
        if (zBooleanValue7) {
            int i10 = (proto.Z & 256) == 256 ? proto.q0 : iD;
            boolean zBooleanValue9 = booleanFlagField4.e(i10).booleanValue();
            boolean zBooleanValue10 = booleanFlagField5.e(i10).booleanValue();
            boolean zBooleanValue11 = booleanFlagField6.e(i10).booleanValue();
            Annotations annotationsB2 = memberDeserializer.b(proto, i10, annotatedCallableKind);
            if (zBooleanValue9) {
                booleanFlagField = booleanFlagField4;
                booleanFlagField2 = booleanFlagField6;
                propertyGetterDescriptorImplC = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotationsB2, ProtoEnumFlags.a((ProtoBuf.Modality) flagField2.c(i10)), ProtoEnumFlagsUtilsKt.a((ProtoBuf.Visibility) flagField.c(i10)), zBooleanValue9 ^ z2, zBooleanValue10, zBooleanValue11, deserializedPropertyDescriptor.getKind(), null, sourceElement);
            } else {
                booleanFlagField = booleanFlagField4;
                booleanFlagField2 = booleanFlagField6;
                propertyGetterDescriptorImplC = DescriptorFactory.c(deserializedPropertyDescriptor, annotationsB2);
            }
            propertyGetterDescriptorImplC.I0(deserializedPropertyDescriptor.getReturnType());
        } else {
            iD = iD;
            z2 = z2;
            flagField = flagField;
            booleanFlagField = booleanFlagField4;
            flagField2 = flagField2;
            booleanFlagField5 = booleanFlagField5;
            booleanFlagField2 = booleanFlagField6;
            propertyGetterDescriptorImplC = null;
        }
        if (Flags.f44119z.e(i5).booleanValue()) {
            int i11 = (proto.Z & 512) == 512 ? proto.r0 : iD;
            boolean zBooleanValue12 = booleanFlagField.e(i11).booleanValue();
            boolean zBooleanValue13 = booleanFlagField5.e(i11).booleanValue();
            boolean zBooleanValue14 = booleanFlagField2.e(i11).booleanValue();
            AnnotatedCallableKind annotatedCallableKind2 = AnnotatedCallableKind.e0;
            memberDeserializer2 = this;
            Annotations annotationsB3 = memberDeserializer2.b(proto, i11, annotatedCallableKind2);
            if (zBooleanValue12) {
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplC;
                propertySetterDescriptorImplD = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotationsB3, ProtoEnumFlags.a((ProtoBuf.Modality) flagField2.c(i11)), ProtoEnumFlagsUtilsKt.a((ProtoBuf.Visibility) flagField.c(i11)), !zBooleanValue12, zBooleanValue13, zBooleanValue14, deserializedPropertyDescriptor.getKind(), null, sourceElement);
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.W(deserializationContextA.a(propertySetterDescriptorImplD, EmptyList.X, deserializationContextA.f44402b, deserializationContextA.d, deserializationContextA.f44404e, deserializationContextA.f).f44406i.g(CollectionsKt.H(proto.p0), proto, annotatedCallableKind2));
                if (valueParameterDescriptor == null) {
                    PropertySetterDescriptorImpl.Z(6);
                    throw null;
                }
                propertySetterDescriptorImplD.n0 = valueParameterDescriptor;
                nullableLazyValue = null;
            } else {
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplC;
                nullableLazyValue = null;
                propertySetterDescriptorImplD = DescriptorFactory.d(deserializedPropertyDescriptor, annotationsB3);
            }
        } else {
            memberDeserializer2 = this;
            propertyGetterDescriptorImpl = propertyGetterDescriptorImplC;
            nullableLazyValue = null;
            propertySetterDescriptorImplD = null;
        }
        if (Flags.C.e(i5).booleanValue()) {
            deserializedPropertyDescriptor.G0(nullableLazyValue, new Function0<NullableLazyValue<? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    final MemberDeserializer memberDeserializer3 = this.X;
                    LockBasedStorageManager lockBasedStorageManager = memberDeserializer3.f44415a.f44401a.f44391a;
                    final DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
                    final ProtoBuf.Property property = proto;
                    return lockBasedStorageManager.b(new Function0<ConstantValue<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MemberDeserializer memberDeserializer4 = memberDeserializer3;
                            ProtoContainer protoContainerA = memberDeserializer4.a(memberDeserializer4.f44415a.f44403c);
                            Intrinsics.c(protoContainerA);
                            AnnotationAndConstantLoader annotationAndConstantLoader = memberDeserializer4.f44415a.f44401a.f44394e;
                            KotlinType returnType = deserializedPropertyDescriptor2.getReturnType();
                            Intrinsics.e(returnType, "property.returnType");
                            return (ConstantValue) annotationAndConstantLoader.h(protoContainerA, property, returnType);
                        }
                    });
                }
            });
        }
        DeclarationDescriptor declarationDescriptor3 = deserializationContext.f44403c;
        ClassDescriptor classDescriptor2 = declarationDescriptor3 instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptor3 : null;
        if ((classDescriptor2 != null ? classDescriptor2.getKind() : null) == ClassKind.f0) {
            deserializedPropertyDescriptor.G0(null, new Function0<NullableLazyValue<? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    final MemberDeserializer memberDeserializer3 = this.X;
                    LockBasedStorageManager lockBasedStorageManager = memberDeserializer3.f44415a.f44401a.f44391a;
                    final DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
                    final ProtoBuf.Property property = proto;
                    return lockBasedStorageManager.b(new Function0<ConstantValue<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$5.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MemberDeserializer memberDeserializer4 = memberDeserializer3;
                            ProtoContainer protoContainerA = memberDeserializer4.a(memberDeserializer4.f44415a.f44403c);
                            Intrinsics.c(protoContainerA);
                            AnnotationAndConstantLoader annotationAndConstantLoader = memberDeserializer4.f44415a.f44401a.f44394e;
                            KotlinType returnType = deserializedPropertyDescriptor2.getReturnType();
                            Intrinsics.e(returnType, "property.returnType");
                            return (ConstantValue) annotationAndConstantLoader.f(protoContainerA, property, returnType);
                        }
                    });
                }
            });
        }
        deserializedPropertyDescriptor.K0(propertyGetterDescriptorImpl, propertySetterDescriptorImplD, new FieldDescriptorImpl(memberDeserializer2.c(proto, false), deserializedPropertyDescriptor), new FieldDescriptorImpl(memberDeserializer2.c(proto, z2), deserializedPropertyDescriptor));
        return deserializedPropertyDescriptor;
    }

    public final List g(List list, final GeneratedMessageLite.ExtendableMessage extendableMessage, final AnnotatedCallableKind annotatedCallableKind) {
        final MemberDeserializer memberDeserializer = this;
        DeserializationContext deserializationContext = memberDeserializer.f44415a;
        DeclarationDescriptor declarationDescriptor = deserializationContext.f44403c;
        Intrinsics.d(declarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptor;
        DeclarationDescriptor declarationDescriptorD = callableDescriptor.d();
        Intrinsics.e(declarationDescriptorD, "callableDescriptor.containingDeclaration");
        final ProtoContainer protoContainerA = memberDeserializer.a(declarationDescriptorD);
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(list2, 10));
        final int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            KotlinType kotlinTypeG = null;
            if (i2 < 0) {
                CollectionsKt.f0();
                throw null;
            }
            final ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int i4 = (valueParameter.Z & 1) == 1 ? valueParameter.e0 : 0;
            Annotations nonEmptyDeserializedAnnotations = (protoContainerA == null || !Flags.f44110c.e(i4).booleanValue()) ? Annotations.Companion.f43614a : new NonEmptyDeserializedAnnotations(deserializationContext.f44401a.f44391a, new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$valueParameters$1$annotations$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    AnnotationAndConstantLoader annotationAndConstantLoader = this.X.f44415a.f44401a.f44394e;
                    AnnotatedCallableKind annotatedCallableKind2 = annotatedCallableKind;
                    return CollectionsKt.i0(annotationAndConstantLoader.d(protoContainerA, extendableMessage, annotatedCallableKind2, i2, valueParameter));
                }
            });
            Name nameB = NameResolverUtilKt.b(deserializationContext.f44402b, valueParameter.f0);
            TypeTable typeTable = deserializationContext.d;
            ProtoBuf.Type typeE = ProtoTypeTableUtilKt.e(valueParameter, typeTable);
            TypeDeserializer typeDeserializer = deserializationContext.f44405h;
            KotlinType kotlinTypeG2 = typeDeserializer.g(typeE);
            boolean zBooleanValue = Flags.G.e(i4).booleanValue();
            boolean zBooleanValue2 = Flags.H.e(i4).booleanValue();
            boolean zBooleanValue3 = Flags.f44106I.e(i4).booleanValue();
            int i5 = valueParameter.Z;
            ProtoBuf.Type typeA = (i5 & 16) == 16 ? valueParameter.i0 : (i5 & 32) == 32 ? typeTable.a(valueParameter.j0) : null;
            if (typeA != null) {
                kotlinTypeG = typeDeserializer.g(typeA);
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ValueParameterDescriptorImpl(callableDescriptor, null, i2, nonEmptyDeserializedAnnotations, nameB, kotlinTypeG2, zBooleanValue, zBooleanValue2, zBooleanValue3, kotlinTypeG, SourceElement.f43591a));
            memberDeserializer = this;
            arrayList = arrayList2;
            i2 = i3;
        }
        return CollectionsKt.i0(arrayList);
    }
}
