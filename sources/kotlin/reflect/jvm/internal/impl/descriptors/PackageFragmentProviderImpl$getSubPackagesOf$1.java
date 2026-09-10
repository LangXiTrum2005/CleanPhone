package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
final class PackageFragmentProviderImpl$getSubPackagesOf$1 extends Lambda implements Function1<PackageFragmentDescriptor, FqName> {
    public static final PackageFragmentProviderImpl$getSubPackagesOf$1 X = new PackageFragmentProviderImpl$getSubPackagesOf$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PackageFragmentDescriptor it = (PackageFragmentDescriptor) obj;
        Intrinsics.f(it, "it");
        return it.c();
    }
}
