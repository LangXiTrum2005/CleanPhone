package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* JADX INFO: loaded from: classes7.dex */
public class LazyPackageViewDescriptorImpl extends DeclarationDescriptorImpl implements PackageViewDescriptor {
    public static final /* synthetic */ KProperty[] i0;
    public final ModuleDescriptorImpl Z;
    public final FqName e0;
    public final NotNullLazyValue f0;
    public final NotNullLazyValue g0;
    public final LazyScopeAdapter h0;

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        i0 = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(LazyPackageViewDescriptorImpl.class), "fragments", "getFragments()Ljava/util/List;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(LazyPackageViewDescriptorImpl.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(ModuleDescriptorImpl module, FqName fqName, LockBasedStorageManager storageManager) {
        super(Annotations.Companion.f43614a, fqName.g());
        Intrinsics.f(module, "module");
        Intrinsics.f(fqName, "fqName");
        Intrinsics.f(storageManager, "storageManager");
        this.Z = module;
        this.e0 = fqName;
        this.f0 = storageManager.a(new Function0<List<? extends PackageFragmentDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$fragments$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.X;
                ModuleDescriptorImpl moduleDescriptorImpl = lazyPackageViewDescriptorImpl.Z;
                moduleDescriptorImpl.y0();
                return PackageFragmentProviderKt.c((CompositePackageFragmentProvider) moduleDescriptorImpl.l0.getX(), lazyPackageViewDescriptorImpl.e0);
            }
        });
        this.g0 = storageManager.a(new Function0<Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$empty$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.X;
                ModuleDescriptorImpl moduleDescriptorImpl = lazyPackageViewDescriptorImpl.Z;
                moduleDescriptorImpl.y0();
                return Boolean.valueOf(PackageFragmentProviderKt.b((CompositePackageFragmentProvider) moduleDescriptorImpl.l0.getX(), lazyPackageViewDescriptorImpl.e0));
            }
        });
        this.h0 = new LazyScopeAdapter(storageManager, new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$memberScope$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.X;
                if (lazyPackageViewDescriptorImpl.isEmpty()) {
                    return MemberScope.Empty.f44351b;
                }
                List listA0 = lazyPackageViewDescriptorImpl.a0();
                ArrayList arrayList = new ArrayList(CollectionsKt.n(listA0, 10));
                Iterator it = listA0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PackageFragmentDescriptor) it.next()).n());
                }
                ModuleDescriptorImpl moduleDescriptorImpl = lazyPackageViewDescriptorImpl.Z;
                FqName fqName2 = lazyPackageViewDescriptorImpl.e0;
                return ChainedMemberScope.Companion.a(CollectionsKt.P(new SubpackagesScope(moduleDescriptorImpl, fqName2), arrayList), "package view scope for " + fqName2 + " in " + moduleDescriptorImpl.getName());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public final List a0() {
        return (List) StorageKt.a(this.f0, i0[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public final FqName c() {
        return this.e0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor d() {
        FqName fqName = this.e0;
        if (fqName.d()) {
            return null;
        }
        FqName fqNameE = fqName.e();
        Intrinsics.e(fqNameE, "fqName.parent()");
        return this.Z.e0(fqNameE);
    }

    public final boolean equals(Object obj) {
        PackageViewDescriptor packageViewDescriptor = obj instanceof PackageViewDescriptor ? (PackageViewDescriptor) obj : null;
        if (packageViewDescriptor == null) {
            return false;
        }
        if (Intrinsics.a(this.e0, packageViewDescriptor.c())) {
            return Intrinsics.a(this.Z, packageViewDescriptor.v0());
        }
        return false;
    }

    public final int hashCode() {
        return this.e0.hashCode() + (this.Z.hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public final boolean isEmpty() {
        return ((Boolean) StorageKt.a(this.g0, i0[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public final MemberScope n() {
        return this.h0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object v(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.a(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public final ModuleDescriptorImpl v0() {
        return this.Z;
    }
}
