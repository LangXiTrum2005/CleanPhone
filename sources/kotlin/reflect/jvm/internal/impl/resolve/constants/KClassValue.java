package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class KClassValue extends ConstantValue<Value> {

    public static final class Companion {
    }

    public static abstract class Value {

        public static final class LocalClass extends Value {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KotlinType f44309a;

            public LocalClass(KotlinType kotlinType) {
                this.f44309a = kotlinType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalClass) && Intrinsics.a(this.f44309a, ((LocalClass) obj).f44309a);
            }

            public final int hashCode() {
                return this.f44309a.hashCode();
            }

            public final String toString() {
                return "LocalClass(type=" + this.f44309a + ')';
            }
        }

        public static final class NormalClass extends Value {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ClassLiteralValue f44310a;

            public NormalClass(ClassLiteralValue classLiteralValue) {
                this.f44310a = classLiteralValue;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NormalClass) && Intrinsics.a(this.f44310a, ((NormalClass) obj).f44310a);
            }

            public final int hashCode() {
                return this.f44310a.hashCode();
            }

            public final String toString() {
                return "NormalClass(value=" + this.f44310a + ')';
            }
        }
    }

    public KClassValue(ClassId classId, int i2) {
        super(new Value.NormalClass(new ClassLiteralValue(classId, i2)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final KotlinType a(ModuleDescriptor module) {
        KotlinType kotlinTypeC;
        Intrinsics.f(module, "module");
        TypeAttributes.f44529Y.getClass();
        TypeAttributes typeAttributes = TypeAttributes.Z;
        KotlinBuiltIns kotlinBuiltInsK = module.k();
        kotlinBuiltInsK.getClass();
        ClassDescriptor classDescriptorI = kotlinBuiltInsK.i(StandardNames.FqNames.f43488P.g());
        Object obj = this.f44302a;
        Value value = (Value) obj;
        if (value instanceof Value.LocalClass) {
            kotlinTypeC = ((Value.LocalClass) obj).f44309a;
        } else {
            if (!(value instanceof Value.NormalClass)) {
                throw new NoWhenBranchMatchedException();
            }
            ClassLiteralValue classLiteralValue = ((Value.NormalClass) obj).f44310a;
            ClassId classId = classLiteralValue.f44300a;
            ClassDescriptor classDescriptorA = FindClassInModuleKt.a(module, classId);
            int i2 = classLiteralValue.f44301b;
            if (classDescriptorA == null) {
                ErrorTypeKind errorTypeKind = ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE;
                String string = classId.toString();
                Intrinsics.e(string, "classId.toString()");
                kotlinTypeC = ErrorUtils.c(errorTypeKind, string, String.valueOf(i2));
            } else {
                SimpleType simpleTypeO = classDescriptorA.o();
                Intrinsics.e(simpleTypeO, "descriptor.defaultType");
                UnwrappedType unwrappedTypeL = TypeUtilsKt.l(simpleTypeO);
                for (int i3 = 0; i3 < i2; i3++) {
                    unwrappedTypeL = module.k().g(unwrappedTypeL);
                }
                kotlinTypeC = unwrappedTypeL;
            }
        }
        return KotlinTypeFactory.c(typeAttributes, classDescriptorI, CollectionsKt.H(new TypeProjectionImpl(kotlinTypeC)));
    }
}
