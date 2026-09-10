package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes7.dex */
public final class InlineClassesUtilsKt {
    static {
        ClassId.j(new FqName("kotlin.jvm.JvmInline"));
    }

    public static final boolean a(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.f(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof PropertyGetterDescriptor)) {
            return false;
        }
        PropertyDescriptor correspondingProperty = ((PropertyGetterDescriptor) callableMemberDescriptor).P();
        Intrinsics.e(correspondingProperty, "correspondingProperty");
        return d(correspondingProperty);
    }

    public static final boolean b(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.f(declarationDescriptor, "<this>");
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).O() instanceof InlineClassRepresentation);
    }

    public static final boolean c(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
        if (classifierDescriptorC != null) {
            return b(classifierDescriptorC);
        }
        return false;
    }

    public static final boolean d(VariableDescriptor variableDescriptor) {
        if (variableDescriptor.J() != null) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorD = variableDescriptor.d();
        Name name = null;
        ClassDescriptor classDescriptor = declarationDescriptorD instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorD : null;
        if (classDescriptor != null) {
            int i2 = DescriptorUtilsKt.f44314a;
            ValueClassRepresentation valueClassRepresentationO = classDescriptor.O();
            InlineClassRepresentation inlineClassRepresentation = valueClassRepresentationO instanceof InlineClassRepresentation ? (InlineClassRepresentation) valueClassRepresentationO : null;
            if (inlineClassRepresentation != null) {
                name = inlineClassRepresentation.f43571a;
            }
        }
        return Intrinsics.a(name, variableDescriptor.getName());
    }

    public static final boolean e(DeclarationDescriptor declarationDescriptor) {
        if (b(declarationDescriptor)) {
            return true;
        }
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).O() instanceof MultiFieldValueClassRepresentation);
    }

    public static final SimpleType f(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
        ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
        if (classDescriptor != null) {
            int i2 = DescriptorUtilsKt.f44314a;
            ValueClassRepresentation valueClassRepresentationO = classDescriptor.O();
            InlineClassRepresentation inlineClassRepresentation = valueClassRepresentationO instanceof InlineClassRepresentation ? (InlineClassRepresentation) valueClassRepresentationO : null;
            if (inlineClassRepresentation != null) {
                return (SimpleType) inlineClassRepresentation.f43572b;
            }
        }
        return null;
    }
}
