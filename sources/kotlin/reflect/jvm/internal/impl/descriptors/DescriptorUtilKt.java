package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes7.dex */
public final class DescriptorUtilKt {
    public static final ClassifierDescriptor a(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.f(declarationDescriptor, "<this>");
        DeclarationDescriptor declarationDescriptorD = declarationDescriptor.d();
        if (declarationDescriptorD == null || (declarationDescriptor instanceof PackageFragmentDescriptor)) {
            return null;
        }
        if (!(declarationDescriptorD.d() instanceof PackageFragmentDescriptor)) {
            return a(declarationDescriptorD);
        }
        if (declarationDescriptorD instanceof ClassifierDescriptor) {
            return (ClassifierDescriptor) declarationDescriptorD;
        }
        return null;
    }

    public static final ClassDescriptor b(ModuleDescriptorImpl moduleDescriptorImpl, FqName fqName) {
        ClassifierDescriptor classifierDescriptorF;
        MemberScope memberScopeN;
        NoLookupLocation noLookupLocation = NoLookupLocation.X;
        Intrinsics.f(moduleDescriptorImpl, "<this>");
        Intrinsics.f(fqName, "fqName");
        if (!fqName.d()) {
            FqName fqNameE = fqName.e();
            Intrinsics.e(fqNameE, "fqName.parent()");
            MemberScope memberScopeN2 = moduleDescriptorImpl.e0(fqNameE).n();
            Name nameF = fqName.f();
            Intrinsics.e(nameF, "fqName.shortName()");
            ClassifierDescriptor classifierDescriptorF2 = ((AbstractScopeAdapter) memberScopeN2).f(nameF, noLookupLocation);
            ClassDescriptor classDescriptor = classifierDescriptorF2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF2 : null;
            if (classDescriptor != null) {
                return classDescriptor;
            }
            FqName fqNameE2 = fqName.e();
            Intrinsics.e(fqNameE2, "fqName.parent()");
            ClassDescriptor classDescriptorB = b(moduleDescriptorImpl, fqNameE2);
            if (classDescriptorB == null || (memberScopeN = classDescriptorB.N()) == null) {
                classifierDescriptorF = null;
            } else {
                Name nameF2 = fqName.f();
                Intrinsics.e(nameF2, "fqName.shortName()");
                classifierDescriptorF = memberScopeN.f(nameF2, noLookupLocation);
            }
            if (classifierDescriptorF instanceof ClassDescriptor) {
                return (ClassDescriptor) classifierDescriptorF;
            }
        }
        return null;
    }
}
