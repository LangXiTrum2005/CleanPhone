package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes7.dex */
public final class ByteValue extends IntegerValueConstant<Byte> {
    public ByteValue(byte b2) {
        super(Byte.valueOf(b2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final KotlinType a(ModuleDescriptor module) {
        Intrinsics.f(module, "module");
        KotlinBuiltIns kotlinBuiltInsK = module.k();
        kotlinBuiltInsK.getClass();
        SimpleType simpleTypeR = kotlinBuiltInsK.r(PrimitiveType.BYTE);
        if (simpleTypeR != null) {
            return simpleTypeR;
        }
        KotlinBuiltIns.a(56);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final String toString() {
        return ((Number) this.f44302a).intValue() + ".toByte()";
    }
}
