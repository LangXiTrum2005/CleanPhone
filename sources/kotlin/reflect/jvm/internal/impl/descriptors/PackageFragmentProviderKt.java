package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public final class PackageFragmentProviderKt {
    public static final void a(PackageFragmentProvider packageFragmentProvider, FqName fqName, ArrayList arrayList) {
        Intrinsics.f(packageFragmentProvider, "<this>");
        Intrinsics.f(fqName, "fqName");
        if (packageFragmentProvider instanceof PackageFragmentProviderOptimized) {
            ((PackageFragmentProviderOptimized) packageFragmentProvider).b(fqName, arrayList);
        } else {
            arrayList.addAll(packageFragmentProvider.a(fqName));
        }
    }

    public static final boolean b(PackageFragmentProvider packageFragmentProvider, FqName fqName) {
        Intrinsics.f(packageFragmentProvider, "<this>");
        Intrinsics.f(fqName, "fqName");
        return packageFragmentProvider instanceof PackageFragmentProviderOptimized ? ((PackageFragmentProviderOptimized) packageFragmentProvider).c(fqName) : c(packageFragmentProvider, fqName).isEmpty();
    }

    public static final ArrayList c(PackageFragmentProvider packageFragmentProvider, FqName fqName) {
        Intrinsics.f(packageFragmentProvider, "<this>");
        Intrinsics.f(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        a(packageFragmentProvider, fqName, arrayList);
        return arrayList;
    }
}
