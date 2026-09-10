package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* JADX INFO: loaded from: classes7.dex */
public final class StaticScopeForKotlinEnum extends MemberScopeImpl {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f44352e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeserializedClassDescriptor f44353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotNullLazyValue f44354c;
    public final NotNullLazyValue d;

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f44352e = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(StaticScopeForKotlinEnum.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public StaticScopeForKotlinEnum(LockBasedStorageManager storageManager, DeserializedClassDescriptor deserializedClassDescriptor) {
        Intrinsics.f(storageManager, "storageManager");
        this.f44353b = deserializedClassDescriptor;
        this.f44354c = storageManager.a(new Function0<List<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum$functions$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                StaticScopeForKotlinEnum staticScopeForKotlinEnum = this.X;
                return CollectionsKt.I(DescriptorFactory.f(staticScopeForKotlinEnum.f44353b), DescriptorFactory.g(staticScopeForKotlinEnum.f44353b));
            }
        });
        this.d = storageManager.a(new Function0<List<? extends PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum$properties$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CollectionsKt.J(DescriptorFactory.e(this.X.f44353b));
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        List list = (List) StorageKt.a(this.d, f44352e[1]);
        SmartList smartList = new SmartList();
        for (Object obj : list) {
            if (Intrinsics.a(((PropertyDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection d(Name name, LookupLocation lookupLocation) {
        Intrinsics.f(name, "name");
        List list = (List) StorageKt.a(this.f44354c, f44352e[0]);
        SmartList smartList = new SmartList();
        for (Object obj : list) {
            if (Intrinsics.a(((SimpleFunctionDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.f(name, "name");
        Intrinsics.f(location, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        KProperty[] kPropertyArr = f44352e;
        return CollectionsKt.O((List) StorageKt.a(this.d, kPropertyArr[1]), (List) StorageKt.a(this.f44354c, kPropertyArr[0]));
    }
}
