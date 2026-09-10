package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* JADX INFO: loaded from: classes7.dex */
public abstract class GivenFunctionsMemberScope extends MemberScopeImpl {
    public static final /* synthetic */ KProperty[] d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractClassDescriptor f44342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotNullLazyValue f44343c;

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        d = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public GivenFunctionsMemberScope(LockBasedStorageManager lockBasedStorageManager, AbstractClassDescriptor abstractClassDescriptor) {
        this.f44342b = abstractClassDescriptor;
        this.f44343c = lockBasedStorageManager.a(new Function0<List<? extends DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$allDescriptors$2
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r10v1 */
            /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ?? arrayList;
                final GivenFunctionsMemberScope givenFunctionsMemberScope = this.X;
                List listH = givenFunctionsMemberScope.h();
                List list = listH;
                final ArrayList arrayList2 = new ArrayList(3);
                AbstractClassDescriptor abstractClassDescriptor2 = givenFunctionsMemberScope.f44342b;
                Collection collectionD = abstractClassDescriptor2.h().d();
                Intrinsics.e(collectionD, "containingClass.typeConstructor.supertypes");
                ArrayList arrayList3 = new ArrayList();
                Iterator it = collectionD.iterator();
                while (it.hasNext()) {
                    CollectionsKt.g(ResolutionScope.DefaultImpls.a(((KotlinType) it.next()).n(), null, 3), arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList3) {
                    if (obj instanceof CallableMemberDescriptor) {
                        arrayList4.add(obj);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList4) {
                    Name name = ((CallableMemberDescriptor) obj2).getName();
                    Object arrayList5 = linkedHashMap.get(name);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(name, arrayList5);
                    }
                    ((List) arrayList5).add(obj2);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Name name2 = (Name) entry.getKey();
                    List list2 = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj3 : list2) {
                        Boolean boolValueOf = Boolean.valueOf(((CallableMemberDescriptor) obj3) instanceof FunctionDescriptor);
                        Object arrayList6 = linkedHashMap2.get(boolValueOf);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList6);
                        }
                        ((List) arrayList6).add(obj3);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list3 = (List) entry2.getValue();
                        OverridingUtil overridingUtil = OverridingUtil.f44284c;
                        List list4 = list3;
                        if (zBooleanValue) {
                            arrayList = new ArrayList();
                            for (Object obj4 : listH) {
                                if (Intrinsics.a(((FunctionDescriptor) obj4).getName(), name2)) {
                                    arrayList.add(obj4);
                                }
                            }
                        } else {
                            arrayList = EmptyList.X;
                        }
                        overridingUtil.h(name2, list4, (Collection) arrayList, abstractClassDescriptor2, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$createFakeOverrides$4
                            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                            public final void a(CallableMemberDescriptor fakeOverride) {
                                Intrinsics.f(fakeOverride, "fakeOverride");
                                OverridingUtil.r(fakeOverride, null);
                                arrayList2.add(fakeOverride);
                            }

                            @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                            public final void c(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor fromCurrent) {
                                Intrinsics.f(fromCurrent, "fromCurrent");
                                throw new IllegalStateException(("Conflict in scope of " + givenFunctionsMemberScope.f44342b + ": " + callableMemberDescriptor + " vs " + fromCurrent).toString());
                            }
                        });
                    }
                }
                return CollectionsKt.O(kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.b(arrayList2), list);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        List list = (List) StorageKt.a(this.f44343c, d[0]);
        SmartList smartList = new SmartList();
        for (Object obj : list) {
            if ((obj instanceof PropertyDescriptor) && Intrinsics.a(((PropertyDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection d(Name name, LookupLocation lookupLocation) {
        Intrinsics.f(name, "name");
        List list = (List) StorageKt.a(this.f44343c, d[0]);
        SmartList smartList = new SmartList();
        for (Object obj : list) {
            if ((obj instanceof SimpleFunctionDescriptor) && Intrinsics.a(((SimpleFunctionDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        if (!kindFilter.a(DescriptorKindFilter.f44336n.f44339b)) {
            return EmptyList.X;
        }
        return (List) StorageKt.a(this.f44343c, d[0]);
    }

    public abstract List h();
}
