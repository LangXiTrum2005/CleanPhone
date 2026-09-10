package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;

/* JADX INFO: loaded from: classes7.dex */
public final class MethodSignatureBuildingUtilsKt {
    public static final String a(ClassDescriptor classDescriptor, String str) {
        String strA;
        Intrinsics.f(classDescriptor, "classDescriptor");
        String str2 = JavaToKotlinClassMap.f43521a;
        FqNameUnsafe fqNameUnsafeI = DescriptorUtilsKt.g(classDescriptor).i();
        Intrinsics.e(fqNameUnsafeI, "fqNameSafe.toUnsafe()");
        ClassId classIdF = JavaToKotlinClassMap.f(fqNameUnsafeI);
        if (classIdF != null) {
            strA = JvmClassName.b(classIdF).e();
            Intrinsics.e(strA, "byClassId(it).internalName");
        } else {
            strA = DescriptorBasedTypeSignatureMappingKt.a(classDescriptor, TypeMappingConfigurationImpl.f44014a);
        }
        return SignatureBuildingComponents.f(strA, str);
    }
}
