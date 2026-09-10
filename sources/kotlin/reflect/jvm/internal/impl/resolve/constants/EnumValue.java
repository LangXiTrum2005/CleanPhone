package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class EnumValue extends ConstantValue<Pair<? extends ClassId, ? extends Name>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassId f44304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Name f44305c;

    public EnumValue(ClassId classId, Name name) {
        super(new Pair(classId, name));
        this.f44304b = classId;
        this.f44305c = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final KotlinType a(ModuleDescriptor module) {
        Intrinsics.f(module, "module");
        ClassId classId = this.f44304b;
        ClassDescriptor classDescriptorA = FindClassInModuleKt.a(module, classId);
        SimpleType simpleTypeO = null;
        if (classDescriptorA != null) {
            if (!DescriptorUtils.n(classDescriptorA, ClassKind.Z)) {
                classDescriptorA = null;
            }
            if (classDescriptorA != null) {
                simpleTypeO = classDescriptorA.o();
            }
        }
        if (simpleTypeO != null) {
            return simpleTypeO;
        }
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_ENUM_TYPE;
        String string = classId.toString();
        Intrinsics.e(string, "enumClassId.toString()");
        String str = this.f44305c.X;
        Intrinsics.e(str, "enumEntryName.toString()");
        return ErrorUtils.c(errorTypeKind, string, str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f44304b.i());
        sb.append('.');
        sb.append(this.f44305c);
        return sb.toString();
    }
}
