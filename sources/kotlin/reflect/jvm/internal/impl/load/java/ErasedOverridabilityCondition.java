package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.sequences.FlatteningSequence;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.TransformingSequence;

/* JADX INFO: loaded from: classes7.dex */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43736a;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f43736a = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.f44281Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public final ExternalOverridabilityCondition.Result b(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor, ClassDescriptor classDescriptor) {
        Intrinsics.f(superDescriptor, "superDescriptor");
        Intrinsics.f(subDescriptor, "subDescriptor");
        boolean z2 = subDescriptor instanceof JavaMethodDescriptor;
        ExternalOverridabilityCondition.Result result = ExternalOverridabilityCondition.Result.Z;
        if (z2) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
            if (javaMethodDescriptor.getTypeParameters().isEmpty()) {
                OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoI = OverridingUtil.i(superDescriptor, subDescriptor);
                if ((overrideCompatibilityInfoI != null ? overrideCompatibilityInfoI.c() : null) == null) {
                    List listE = javaMethodDescriptor.e();
                    Intrinsics.e(listE, "subDescriptor.valueParameters");
                    TransformingSequence transformingSequenceO = SequencesKt.o(CollectionsKt.k(listE), ErasedOverridabilityCondition$isOverridable$signatureTypes$1.X);
                    KotlinType kotlinType = javaMethodDescriptor.h0;
                    Intrinsics.c(kotlinType);
                    FlatteningSequence flatteningSequenceS = SequencesKt.s(transformingSequenceO, kotlinType);
                    ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl = javaMethodDescriptor.j0;
                    FlatteningSequence.AnonymousClass1 anonymousClass1 = new FlatteningSequence.AnonymousClass1();
                    while (anonymousClass1.hasNext()) {
                        KotlinType kotlinType2 = (KotlinType) anonymousClass1.next();
                        if (kotlinType2.F0().isEmpty() || (kotlinType2.K0() instanceof RawTypeImpl)) {
                        }
                    }
                    CallableDescriptor callableDescriptorBuild = (CallableDescriptor) superDescriptor.b(new TypeSubstitutor(new RawSubstitution()));
                    if (callableDescriptorBuild != null) {
                        if (callableDescriptorBuild instanceof SimpleFunctionDescriptor) {
                            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) callableDescriptorBuild;
                            List typeParameters = simpleFunctionDescriptor.getTypeParameters();
                            Intrinsics.e(typeParameters, "erasedSuper.typeParameters");
                            if (!typeParameters.isEmpty()) {
                                callableDescriptorBuild = simpleFunctionDescriptor.A0().g().build();
                                Intrinsics.c(callableDescriptorBuild);
                            }
                        }
                        OverridingUtil.OverrideCompatibilityInfo.Result resultC = OverridingUtil.f44284c.n(callableDescriptorBuild, subDescriptor, false).c();
                        Intrinsics.e(resultC, "DEFAULT.isOverridableByW…Descriptor, false).result");
                        if (WhenMappings.f43736a[resultC.ordinal()] == 1) {
                            return ExternalOverridabilityCondition.Result.X;
                        }
                    }
                }
            }
        }
        return result;
    }
}
