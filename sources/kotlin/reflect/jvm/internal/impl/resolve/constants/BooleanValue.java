package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes7.dex */
public final class BooleanValue extends ConstantValue<Boolean> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final KotlinType a(ModuleDescriptor module) {
        Intrinsics.f(module, "module");
        KotlinBuiltIns kotlinBuiltInsK = module.k();
        kotlinBuiltInsK.getClass();
        SimpleType simpleTypeR = kotlinBuiltInsK.r(PrimitiveType.BOOLEAN);
        if (simpleTypeR != null) {
            return simpleTypeR;
        }
        KotlinBuiltIns.a(63);
        throw null;
    }
}
