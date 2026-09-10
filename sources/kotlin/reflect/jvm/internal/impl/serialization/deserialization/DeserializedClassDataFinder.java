package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public final class DeserializedClassDataFinder implements ClassDataFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageFragmentProviderOptimized f44407a;

    public DeserializedClassDataFinder(PackageFragmentProviderOptimized packageFragmentProviderOptimized) {
        this.f44407a = packageFragmentProviderOptimized;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public final ClassData a(ClassId classId) {
        ClassData classDataA;
        Intrinsics.f(classId, "classId");
        FqName fqNameG = classId.g();
        Intrinsics.e(fqNameG, "classId.packageFqName");
        for (PackageFragmentDescriptor packageFragmentDescriptor : PackageFragmentProviderKt.c(this.f44407a, fqNameG)) {
            if ((packageFragmentDescriptor instanceof DeserializedPackageFragment) && (classDataA = ((DeserializedPackageFragment) packageFragmentDescriptor).F0().a(classId)) != null) {
                return classDataA;
            }
        }
        return null;
    }
}
