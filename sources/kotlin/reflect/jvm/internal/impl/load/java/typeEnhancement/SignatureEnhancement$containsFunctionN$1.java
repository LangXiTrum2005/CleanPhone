package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: loaded from: classes7.dex */
final class SignatureEnhancement$containsFunctionN$1 extends Lambda implements Function1<UnwrappedType, Boolean> {
    public static final SignatureEnhancement$containsFunctionN$1 X = new SignatureEnhancement$containsFunctionN$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClassifierDescriptor classifierDescriptorC = ((UnwrappedType) obj).H0().c();
        if (classifierDescriptorC == null) {
            return Boolean.FALSE;
        }
        Name name = classifierDescriptorC.getName();
        FqName fqName = JavaToKotlinClassMap.f;
        return Boolean.valueOf(Intrinsics.a(name, fqName.f()) && Intrinsics.a(DescriptorUtilsKt.c(classifierDescriptorC), fqName));
    }
}
