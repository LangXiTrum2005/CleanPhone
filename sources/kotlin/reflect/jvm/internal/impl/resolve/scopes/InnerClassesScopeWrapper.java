package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class InnerClassesScopeWrapper extends MemberScopeImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MemberScope f44346b;

    public InnerClassesScopeWrapper(MemberScope workerScope) {
        Intrinsics.f(workerScope, "workerScope");
        this.f44346b = workerScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set a() {
        return this.f44346b.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set c() {
        return this.f44346b.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set e() {
        return this.f44346b.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.f(name, "name");
        Intrinsics.f(location, "location");
        ClassifierDescriptor classifierDescriptorF = this.f44346b.f(name, location);
        if (classifierDescriptorF != null) {
            ClassDescriptor classDescriptor = classifierDescriptorF instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF : null;
            if (classDescriptor != null) {
                return classDescriptor;
            }
            if (classifierDescriptorF instanceof TypeAliasDescriptor) {
                return (TypeAliasDescriptor) classifierDescriptorF;
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Collection collection;
        Intrinsics.f(kindFilter, "kindFilter");
        int i2 = DescriptorKindFilter.f44335l & kindFilter.f44339b;
        DescriptorKindFilter descriptorKindFilter = i2 == 0 ? null : new DescriptorKindFilter(i2, kindFilter.f44338a);
        if (descriptorKindFilter == null) {
            collection = EmptyList.X;
        } else {
            Collection collectionG = this.f44346b.g(descriptorKindFilter, function1);
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionG) {
                if (obj instanceof ClassifierDescriptorWithTypeParameters) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    public final String toString() {
        return "Classes from " + this.f44346b;
    }
}
