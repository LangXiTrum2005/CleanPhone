package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaToKotlinClassMapper {
    public static ClassDescriptor a(ClassDescriptor classDescriptor) {
        FqNameUnsafe fqNameUnsafeG = DescriptorUtils.g(classDescriptor);
        String str = JavaToKotlinClassMap.f43521a;
        FqName fqName = (FqName) JavaToKotlinClassMap.k.get(fqNameUnsafeG);
        if (fqName != null) {
            return DescriptorUtilsKt.e(classDescriptor).i(fqName);
        }
        throw new IllegalArgumentException("Given class " + classDescriptor + " is not a read-only collection");
    }

    public static ClassDescriptor b(FqName fqName, KotlinBuiltIns builtIns) {
        Intrinsics.f(builtIns, "builtIns");
        String str = JavaToKotlinClassMap.f43521a;
        ClassId classId = (ClassId) JavaToKotlinClassMap.f43525h.get(fqName.i());
        if (classId != null) {
            return builtIns.i(classId.b());
        }
        return null;
    }
}
