package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class OperatorChecks$checks$3 extends Lambda implements Function1<FunctionDescriptor, String> {
    public static final OperatorChecks$checks$3 X = new OperatorChecks$checks$3(1);

    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zI;
        boolean zI2;
        ClassId classIdF;
        KotlinType returnType;
        FunctionDescriptor $receiver = (FunctionDescriptor) obj;
        Intrinsics.f($receiver, "$this$$receiver");
        ReceiverParameterDescriptor receiverParameterDescriptorG = $receiver.G();
        if (receiverParameterDescriptorG == null) {
            receiverParameterDescriptorG = $receiver.J();
        }
        List list = OperatorChecks.f44620a;
        boolean z2 = false;
        if (receiverParameterDescriptorG != null) {
            KotlinType returnType2 = $receiver.getReturnType();
            if (returnType2 != null) {
                KotlinType type = receiverParameterDescriptorG.getType();
                Intrinsics.e(type, "receiver.type");
                zI = TypeUtilsKt.i(returnType2, type);
            } else {
                zI = false;
            }
            if (zI) {
                z2 = true;
            } else {
                ReceiverValue value = receiverParameterDescriptorG.getValue();
                Intrinsics.e(value, "receiver.value");
                if (value instanceof ImplicitClassReceiver) {
                    ClassDescriptor classDescriptor = ((ImplicitClassReceiver) value).f44364a;
                    if (classDescriptor.d0() && (classIdF = DescriptorUtilsKt.f(classDescriptor)) != null) {
                        ClassifierDescriptor classifierDescriptorB = FindClassInModuleKt.b(DescriptorUtilsKt.j(classDescriptor), classIdF);
                        TypeAliasDescriptor typeAliasDescriptor = classifierDescriptorB instanceof TypeAliasDescriptor ? (TypeAliasDescriptor) classifierDescriptorB : null;
                        if (typeAliasDescriptor == null || (returnType = $receiver.getReturnType()) == null) {
                            zI2 = false;
                        } else {
                            zI2 = TypeUtilsKt.i(returnType, typeAliasDescriptor.C());
                        }
                    } else {
                        zI2 = false;
                    }
                } else {
                    zI2 = false;
                }
                if (zI2) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }
}
