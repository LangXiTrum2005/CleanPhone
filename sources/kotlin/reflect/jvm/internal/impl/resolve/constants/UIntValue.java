package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class UIntValue extends UnsignedValueConstant<Integer> {
    public UIntValue(int i2) {
        super(Integer.valueOf(i2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final KotlinType a(ModuleDescriptor module) {
        Intrinsics.f(module, "module");
        ClassDescriptor classDescriptorA = FindClassInModuleKt.a(module, StandardNames.FqNames.T);
        SimpleType simpleTypeO = classDescriptorA != null ? classDescriptorA.o() : null;
        return simpleTypeO == null ? ErrorUtils.c(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UInt") : simpleTypeO;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final String toString() {
        return ((Number) this.f44302a).intValue() + ".toUInt()";
    }
}
