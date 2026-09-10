package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: loaded from: classes7.dex */
final class ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1 extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {
    public static final ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1 X = new ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        Intrinsics.f(it, "it");
        return Boolean.valueOf(ClassicBuiltinSpecialProperties.b(it));
    }
}
