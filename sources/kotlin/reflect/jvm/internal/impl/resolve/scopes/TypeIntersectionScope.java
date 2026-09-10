package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeIntersectionScope extends AbstractScopeAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MemberScope f44358b;

    public static final class Companion {
        public static MemberScope a(String message, Collection types) {
            Intrinsics.f(message, "message");
            Intrinsics.f(types, "types");
            Collection collection = types;
            ArrayList arrayList = new ArrayList(CollectionsKt.n(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((KotlinType) it.next()).n());
            }
            SmartList smartListB = ScopeUtilsKt.b(arrayList);
            MemberScope memberScopeB = ChainedMemberScope.Companion.b(message, smartListB);
            return smartListB.X <= 1 ? memberScopeB : new TypeIntersectionScope(memberScopeB);
        }
    }

    public TypeIntersectionScope(MemberScope memberScope) {
        this.f44358b = memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        return OverridingUtilsKt.a(super.b(name, noLookupLocation), TypeIntersectionScope$getContributedVariables$1.X);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection d(Name name, LookupLocation lookupLocation) {
        Intrinsics.f(name, "name");
        return OverridingUtilsKt.a(super.d(name, lookupLocation), TypeIntersectionScope$getContributedFunctions$1.X);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        Collection collectionG = super.g(kindFilter, function1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionG) {
            if (((DeclarationDescriptor) obj) instanceof CallableDescriptor) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.O(arrayList2, OverridingUtilsKt.a(arrayList, TypeIntersectionScope$getContributedDescriptors$2.X));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    public final MemberScope i() {
        return this.f44358b;
    }
}
