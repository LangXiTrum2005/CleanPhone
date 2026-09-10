package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeAliasConstructorDescriptorImpl extends FunctionDescriptorImpl implements TypeAliasConstructorDescriptor {
    public static final Companion J0;
    public static final /* synthetic */ KProperty[] K0;
    public final StorageManager F0;
    public final DeserializedTypeAliasDescriptor G0;
    public final NullableLazyValue H0;
    public ClassConstructorDescriptor I0;

    public static final class Companion {
    }

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        K0 = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(TypeAliasConstructorDescriptorImpl.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
        J0 = new Companion();
    }

    public TypeAliasConstructorDescriptorImpl(StorageManager storageManager, DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor, final ClassConstructorDescriptor classConstructorDescriptor, TypeAliasConstructorDescriptor typeAliasConstructorDescriptor, Annotations annotations, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(kind, deserializedTypeAliasDescriptor, typeAliasConstructorDescriptor, sourceElement, annotations, SpecialNames.f44176e);
        this.F0 = storageManager;
        this.G0 = deserializedTypeAliasDescriptor;
        this.t0 = false;
        this.H0 = storageManager.b(new Function0<TypeAliasConstructorDescriptorImpl>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = this.X;
                StorageManager storageManager2 = typeAliasConstructorDescriptorImpl.F0;
                ClassConstructorDescriptor classConstructorDescriptor2 = classConstructorDescriptor;
                Annotations annotations2 = classConstructorDescriptor2.getAnnotations();
                CallableMemberDescriptor.Kind kind2 = classConstructorDescriptor2.getKind();
                Intrinsics.e(kind2, "underlyingConstructorDescriptor.kind");
                DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor2 = typeAliasConstructorDescriptorImpl.G0;
                SourceElement sourceElementF = deserializedTypeAliasDescriptor2.f();
                Intrinsics.e(sourceElementF, "typeAliasDescriptor.source");
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(storageManager2, typeAliasConstructorDescriptorImpl.G0, classConstructorDescriptor2, typeAliasConstructorDescriptorImpl, annotations2, kind2, sourceElementF);
                TypeAliasConstructorDescriptorImpl.J0.getClass();
                TypeSubstitutor typeSubstitutorD = deserializedTypeAliasDescriptor2.r() == null ? null : TypeSubstitutor.d(deserializedTypeAliasDescriptor2.C());
                if (typeSubstitutorD == null) {
                    return null;
                }
                ReceiverParameterDescriptor receiverParameterDescriptorG = classConstructorDescriptor2.G();
                AbstractReceiverParameterDescriptor abstractReceiverParameterDescriptorB = receiverParameterDescriptorG != null ? receiverParameterDescriptorG.b(typeSubstitutorD) : null;
                List listR0 = classConstructorDescriptor2.r0();
                Intrinsics.e(listR0, "underlyingConstructorDes…contextReceiverParameters");
                List list = listR0;
                ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ReceiverParameterDescriptor) it.next()).b(typeSubstitutorD));
                }
                List listP = deserializedTypeAliasDescriptor2.p();
                List listE = typeAliasConstructorDescriptorImpl.e();
                KotlinType kotlinType = typeAliasConstructorDescriptorImpl.h0;
                Intrinsics.c(kotlinType);
                typeAliasConstructorDescriptorImpl2.J0(null, abstractReceiverParameterDescriptorB, arrayList, listP, listE, kotlinType, Modality.X, deserializedTypeAliasDescriptor2.f0);
                return typeAliasConstructorDescriptorImpl2;
            }
        });
        this.I0 = classConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl G0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        Intrinsics.f(newOwner, "newOwner");
        Intrinsics.f(kind, "kind");
        Intrinsics.f(annotations, "annotations");
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.X;
        if (kind != kind2) {
            CallableMemberDescriptor.Kind kind3 = CallableMemberDescriptor.Kind.e0;
        }
        return new TypeAliasConstructorDescriptorImpl(this.F0, this.G0, this.I0, this, annotations, kind2, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor
    public final ClassConstructorDescriptor M() {
        return this.I0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final TypeAliasConstructorDescriptor C0(ClassDescriptor newOwner, Modality modality, DelegatedDescriptorVisibility visibility) {
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.f43557Y;
        Intrinsics.f(newOwner, "newOwner");
        Intrinsics.f(visibility, "visibility");
        FunctionDescriptorImpl.CopyConfiguration copyConfigurationK0 = K0(TypeSubstitutor.f44550b);
        copyConfigurationK0.f43640b = newOwner;
        copyConfigurationK0.f43641c = modality;
        copyConfigurationK0.d = visibility;
        copyConfigurationK0.f = kind;
        copyConfigurationK0.m = false;
        CallableDescriptor callableDescriptorH0 = copyConfigurationK0.x.H0(copyConfigurationK0);
        Intrinsics.d(callableDescriptorH0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (TypeAliasConstructorDescriptor) callableDescriptorH0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final TypeAliasConstructorDescriptor y0() {
        FunctionDescriptor functionDescriptorY0 = super.y0();
        Intrinsics.d(functionDescriptorY0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (TypeAliasConstructorDescriptor) functionDescriptorY0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final TypeAliasConstructorDescriptorImpl b(TypeSubstitutor substitutor) {
        Intrinsics.f(substitutor, "substitutor");
        FunctionDescriptor functionDescriptorB = super.b(substitutor);
        Intrinsics.d(functionDescriptorB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) functionDescriptorB;
        KotlinType kotlinType = typeAliasConstructorDescriptorImpl.h0;
        Intrinsics.c(kotlinType);
        ClassConstructorDescriptor classConstructorDescriptorB = this.I0.y0().b(TypeSubstitutor.d(kotlinType));
        if (classConstructorDescriptorB == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.I0 = classConstructorDescriptorB;
        return typeAliasConstructorDescriptorImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public final boolean U() {
        return this.I0.U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public final ClassDescriptor V() {
        ClassDescriptor classDescriptorV = this.I0.V();
        Intrinsics.e(classDescriptorV, "underlyingConstructorDescriptor.constructedClass");
        return classDescriptorV;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final /* bridge */ /* synthetic */ ConstructorDescriptor b(TypeSubstitutor typeSubstitutor) {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final ClassifierDescriptorWithTypeParameters d() {
        return this.G0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final KotlinType getReturnType() {
        KotlinType kotlinType = this.h0;
        Intrinsics.c(kotlinType);
        return kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor d() {
        return this.G0;
    }
}
