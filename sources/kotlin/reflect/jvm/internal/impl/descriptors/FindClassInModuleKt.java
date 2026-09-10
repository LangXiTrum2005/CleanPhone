package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProvider;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes7.dex */
public final class FindClassInModuleKt {
    public static final ClassDescriptor a(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.f(moduleDescriptor, "<this>");
        Intrinsics.f(classId, "classId");
        ClassifierDescriptor classifierDescriptorB = b(moduleDescriptor, classId);
        if (classifierDescriptorB instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorB;
        }
        return null;
    }

    public static final ClassifierDescriptor b(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.f(moduleDescriptor, "<this>");
        Intrinsics.f(classId, "classId");
        ResolutionAnchorProvider resolutionAnchorProvider = (ResolutionAnchorProvider) moduleDescriptor.B0(ResolutionAnchorProviderKt.f44295a);
        ModuleDescriptor moduleDescriptorA = resolutionAnchorProvider != null ? resolutionAnchorProvider.a() : null;
        NoLookupLocation noLookupLocation = NoLookupLocation.h0;
        if (moduleDescriptorA == null) {
            FqName fqNameG = classId.g();
            Intrinsics.e(fqNameG, "classId.packageFqName");
            PackageViewDescriptor packageViewDescriptorE0 = moduleDescriptor.e0(fqNameG);
            List listE = classId.h().f44165a.e();
            if (listE == null) {
                FqName.a(11);
                throw null;
            }
            MemberScope memberScopeN = packageViewDescriptorE0.n();
            Object objW = CollectionsKt.w(listE);
            Intrinsics.e(objW, "segments.first()");
            ClassifierDescriptor classifierDescriptorF = ((AbstractScopeAdapter) memberScopeN).f((Name) objW, noLookupLocation);
            if (classifierDescriptorF != null) {
                for (Name name : listE.subList(1, listE.size())) {
                    if (classifierDescriptorF instanceof ClassDescriptor) {
                        MemberScope memberScopeN2 = ((ClassDescriptor) classifierDescriptorF).N();
                        Intrinsics.e(name, "name");
                        ClassifierDescriptor classifierDescriptorF2 = memberScopeN2.f(name, noLookupLocation);
                        classifierDescriptorF = classifierDescriptorF2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF2 : null;
                        if (classifierDescriptorF != null) {
                        }
                    }
                }
                return classifierDescriptorF;
            }
        } else {
            FqName fqNameG2 = classId.g();
            Intrinsics.e(fqNameG2, "classId.packageFqName");
            PackageViewDescriptor packageViewDescriptorE1 = moduleDescriptorA.e0(fqNameG2);
            List listE2 = classId.h().f44165a.e();
            if (listE2 == null) {
                FqName.a(11);
                throw null;
            }
            MemberScope memberScopeN3 = packageViewDescriptorE1.n();
            Object objW2 = CollectionsKt.w(listE2);
            Intrinsics.e(objW2, "segments.first()");
            ClassifierDescriptor classifierDescriptorF3 = ((AbstractScopeAdapter) memberScopeN3).f((Name) objW2, noLookupLocation);
            if (classifierDescriptorF3 == null) {
                classifierDescriptorF3 = null;
                break;
            }
            for (Name name2 : listE2.subList(1, listE2.size())) {
                if (classifierDescriptorF3 instanceof ClassDescriptor) {
                    MemberScope memberScopeN4 = ((ClassDescriptor) classifierDescriptorF3).N();
                    Intrinsics.e(name2, "name");
                    ClassifierDescriptor classifierDescriptorF4 = memberScopeN4.f(name2, noLookupLocation);
                    classifierDescriptorF3 = classifierDescriptorF4 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF4 : null;
                    if (classifierDescriptorF3 != null) {
                    }
                }
                classifierDescriptorF3 = null;
            }
            if (classifierDescriptorF3 != null) {
                return classifierDescriptorF3;
            }
            FqName fqNameG3 = classId.g();
            Intrinsics.e(fqNameG3, "classId.packageFqName");
            PackageViewDescriptor packageViewDescriptorE2 = moduleDescriptor.e0(fqNameG3);
            List listE3 = classId.h().f44165a.e();
            if (listE3 == null) {
                FqName.a(11);
                throw null;
            }
            MemberScope memberScopeN5 = packageViewDescriptorE2.n();
            Object objW3 = CollectionsKt.w(listE3);
            Intrinsics.e(objW3, "segments.first()");
            ClassifierDescriptor classifierDescriptorF5 = ((AbstractScopeAdapter) memberScopeN5).f((Name) objW3, noLookupLocation);
            if (classifierDescriptorF5 != null) {
                for (Name name3 : listE3.subList(1, listE3.size())) {
                    if (classifierDescriptorF5 instanceof ClassDescriptor) {
                        MemberScope memberScopeN6 = ((ClassDescriptor) classifierDescriptorF5).N();
                        Intrinsics.e(name3, "name");
                        ClassifierDescriptor classifierDescriptorF6 = memberScopeN6.f(name3, noLookupLocation);
                        classifierDescriptorF5 = classifierDescriptorF6 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF6 : null;
                        if (classifierDescriptorF5 != null) {
                        }
                    }
                }
                return classifierDescriptorF5;
            }
        }
        return null;
    }

    public static final ClassDescriptor c(ModuleDescriptor moduleDescriptor, ClassId classId, NotFoundClasses notFoundClasses) {
        Intrinsics.f(moduleDescriptor, "<this>");
        Intrinsics.f(classId, "classId");
        Intrinsics.f(notFoundClasses, "notFoundClasses");
        ClassDescriptor classDescriptorA = a(moduleDescriptor, classId);
        return classDescriptorA != null ? classDescriptorA : notFoundClasses.a(classId, SequencesKt.v(SequencesKt.o(SequencesKt.l(FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1.X, classId), FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2.X)));
    }
}
