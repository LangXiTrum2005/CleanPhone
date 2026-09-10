package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public final class CliSealedClassInheritorsProvider extends SealedClassInheritorsProvider {
    public static final void a(ClassDescriptor classDescriptor, LinkedHashSet linkedHashSet, MemberScope memberScope, boolean z2) {
        for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.a(memberScope, DescriptorKindFilter.o, 2)) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                ClassDescriptor classDescriptorR = (ClassDescriptor) declarationDescriptor;
                if (classDescriptorR.d0()) {
                    Name name = classDescriptorR.getName();
                    Intrinsics.e(name, "descriptor.name");
                    ClassifierDescriptor classifierDescriptorF = memberScope.f(name, NoLookupLocation.e0);
                    classDescriptorR = classifierDescriptorF instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF : classifierDescriptorF instanceof TypeAliasDescriptor ? ((TypeAliasDescriptor) classifierDescriptorF).r() : null;
                }
                if (classDescriptorR == null) {
                    continue;
                } else {
                    if (classDescriptor == null) {
                        DescriptorUtils.a(27);
                        throw null;
                    }
                    int i2 = DescriptorUtils.f44280a;
                    Iterator it = classDescriptorR.h().d().iterator();
                    while (it.hasNext()) {
                        if (DescriptorUtils.p((KotlinType) it.next(), classDescriptor.y0())) {
                            linkedHashSet.add(classDescriptorR);
                            break;
                        }
                    }
                    if (z2) {
                        MemberScope memberScopeN = classDescriptorR.N();
                        Intrinsics.e(memberScopeN, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        a(classDescriptor, linkedHashSet, memberScopeN, z2);
                    }
                }
            }
        }
    }
}
