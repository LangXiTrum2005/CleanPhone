package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public class MemberComparator implements Comparator<DeclarationDescriptor> {
    public static final DescriptorRendererImpl X;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.MemberComparator$1, reason: invalid class name */
    public static class AnonymousClass1 implements Function1<DescriptorRendererOptions, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            DescriptorRendererOptions descriptorRendererOptions = (DescriptorRendererOptions) obj;
            descriptorRendererOptions.n();
            descriptorRendererOptions.m();
            AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy = AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS;
            descriptorRendererOptions.e();
            descriptorRendererOptions.j(DescriptorRendererModifier.Z);
            return Unit.f43263a;
        }
    }

    public static class NameAndTypeMemberComparator implements Comparator<DeclarationDescriptor> {
        public static final NameAndTypeMemberComparator X = new NameAndTypeMemberComparator();

        public static Integer a(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            int iB = b(declarationDescriptor2) - b(declarationDescriptor);
            if (iB != 0) {
                return Integer.valueOf(iB);
            }
            if (DescriptorUtils.m(declarationDescriptor) && DescriptorUtils.m(declarationDescriptor2)) {
                return 0;
            }
            int iCompareTo = declarationDescriptor.getName().X.compareTo(declarationDescriptor2.getName().X);
            if (iCompareTo != 0) {
                return Integer.valueOf(iCompareTo);
            }
            return null;
        }

        public static int b(DeclarationDescriptor declarationDescriptor) {
            if (DescriptorUtils.m(declarationDescriptor)) {
                return 8;
            }
            if (declarationDescriptor instanceof ConstructorDescriptor) {
                return 7;
            }
            if (declarationDescriptor instanceof PropertyDescriptor) {
                return ((PropertyDescriptor) declarationDescriptor).J() == null ? 6 : 5;
            }
            if (declarationDescriptor instanceof FunctionDescriptor) {
                return ((FunctionDescriptor) declarationDescriptor).J() == null ? 4 : 3;
            }
            if (declarationDescriptor instanceof ClassDescriptor) {
                return 2;
            }
            return declarationDescriptor instanceof TypeAliasDescriptor ? 1 : 0;
        }

        @Override // java.util.Comparator
        public final int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            Integer numA = a(declarationDescriptor, declarationDescriptor2);
            if (numA != null) {
                return numA.intValue();
            }
            return 0;
        }
    }

    static {
        DescriptorRendererImpl descriptorRendererImpl = DescriptorRenderer.f44237a;
        X = DescriptorRenderer.Companion.a(new AnonymousClass1());
    }

    @Override // java.util.Comparator
    public final int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        int iCompareTo;
        DeclarationDescriptor declarationDescriptor3 = declarationDescriptor;
        DeclarationDescriptor declarationDescriptor4 = declarationDescriptor2;
        Integer numA = NameAndTypeMemberComparator.a(declarationDescriptor3, declarationDescriptor4);
        if (numA != null) {
            return numA.intValue();
        }
        boolean z2 = declarationDescriptor3 instanceof TypeAliasDescriptor;
        DescriptorRendererImpl descriptorRendererImpl = X;
        if (z2 && (declarationDescriptor4 instanceof TypeAliasDescriptor)) {
            int iCompareTo2 = descriptorRendererImpl.a0(((TypeAliasDescriptor) declarationDescriptor3).m0()).compareTo(descriptorRendererImpl.a0(((TypeAliasDescriptor) declarationDescriptor4).m0()));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        } else if ((declarationDescriptor3 instanceof CallableDescriptor) && (declarationDescriptor4 instanceof CallableDescriptor)) {
            CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptor3;
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) declarationDescriptor4;
            ReceiverParameterDescriptor receiverParameterDescriptorJ = callableDescriptor.J();
            ReceiverParameterDescriptor receiverParameterDescriptorJ2 = callableDescriptor2.J();
            if (receiverParameterDescriptorJ != null && (iCompareTo = descriptorRendererImpl.a0(receiverParameterDescriptorJ.getType()).compareTo(descriptorRendererImpl.a0(receiverParameterDescriptorJ2.getType()))) != 0) {
                return iCompareTo;
            }
            List listE = callableDescriptor.e();
            List listE2 = callableDescriptor2.e();
            for (int i2 = 0; i2 < Math.min(listE.size(), listE2.size()); i2++) {
                int iCompareTo3 = descriptorRendererImpl.a0(((ValueParameterDescriptor) listE.get(i2)).getType()).compareTo(descriptorRendererImpl.a0(((ValueParameterDescriptor) listE2.get(i2)).getType()));
                if (iCompareTo3 != 0) {
                    return iCompareTo3;
                }
            }
            int size = listE.size() - listE2.size();
            if (size != 0) {
                return size;
            }
            List typeParameters = callableDescriptor.getTypeParameters();
            List typeParameters2 = callableDescriptor2.getTypeParameters();
            for (int i3 = 0; i3 < Math.min(typeParameters.size(), typeParameters2.size()); i3++) {
                List upperBounds = ((TypeParameterDescriptor) typeParameters.get(i3)).getUpperBounds();
                List upperBounds2 = ((TypeParameterDescriptor) typeParameters2.get(i3)).getUpperBounds();
                int size2 = upperBounds.size() - upperBounds2.size();
                if (size2 != 0) {
                    return size2;
                }
                for (int i4 = 0; i4 < upperBounds.size(); i4++) {
                    int iCompareTo4 = descriptorRendererImpl.a0((KotlinType) upperBounds.get(i4)).compareTo(descriptorRendererImpl.a0((KotlinType) upperBounds2.get(i4)));
                    if (iCompareTo4 != 0) {
                        return iCompareTo4;
                    }
                }
            }
            int size3 = typeParameters.size() - typeParameters2.size();
            if (size3 != 0) {
                return size3;
            }
            if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof CallableMemberDescriptor)) {
                int iOrdinal = ((CallableMemberDescriptor) callableDescriptor).getKind().ordinal() - ((CallableMemberDescriptor) callableDescriptor2).getKind().ordinal();
                if (iOrdinal != 0) {
                    return iOrdinal;
                }
            }
        } else {
            if (!(declarationDescriptor3 instanceof ClassDescriptor) || !(declarationDescriptor4 instanceof ClassDescriptor)) {
                throw new AssertionError(String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", declarationDescriptor3, declarationDescriptor3.getClass(), declarationDescriptor4, declarationDescriptor4.getClass()));
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor3;
            ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor4;
            if (classDescriptor.getKind().ordinal() != classDescriptor2.getKind().ordinal()) {
                return classDescriptor.getKind().ordinal() - classDescriptor2.getKind().ordinal();
            }
            if (classDescriptor.T() != classDescriptor2.T()) {
                return classDescriptor.T() ? 1 : -1;
            }
        }
        int iCompareTo5 = descriptorRendererImpl.x(declarationDescriptor3).compareTo(descriptorRendererImpl.x(declarationDescriptor4));
        return iCompareTo5 != 0 ? iCompareTo5 : DescriptorUtils.d(declarationDescriptor3).getName().X.compareTo(DescriptorUtils.d(declarationDescriptor4).getName().X);
    }
}
