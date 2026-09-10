package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleExceptionKt;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleNotifier;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {
    public final LockBasedStorageManager Z;
    public final KotlinBuiltIns e0;
    public final Map f0;
    public final PackageViewDescriptorFactory g0;
    public ModuleDependenciesImpl h0;
    public PackageFragmentProvider i0;
    public final boolean j0;
    public final MemoizedFunctionToNotNull k0;
    public final Lazy l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(Name moduleName, LockBasedStorageManager lockBasedStorageManager, KotlinBuiltIns kotlinBuiltIns, int i2) {
        super(Annotations.Companion.f43614a, moduleName);
        Map map = EmptyMap.X;
        Intrinsics.f(moduleName, "moduleName");
        this.Z = lockBasedStorageManager;
        this.e0 = kotlinBuiltIns;
        if (!moduleName.f44171Y) {
            throw new IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.f0 = map;
        PackageViewDescriptorFactory.f43652a.getClass();
        PackageViewDescriptorFactory packageViewDescriptorFactory = (PackageViewDescriptorFactory) B0(PackageViewDescriptorFactory.Companion.f43654b);
        this.g0 = packageViewDescriptorFactory == null ? PackageViewDescriptorFactory.Default.f43655b : packageViewDescriptorFactory;
        this.j0 = true;
        this.k0 = lockBasedStorageManager.g(new Function1<FqName, PackageViewDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packages$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FqName fqName = (FqName) obj;
                Intrinsics.f(fqName, "fqName");
                ModuleDescriptorImpl moduleDescriptorImpl = this.X;
                return moduleDescriptorImpl.g0.a(moduleDescriptorImpl, fqName, moduleDescriptorImpl.Z);
            }
        });
        this.l0 = LazyKt.b(new Function0<CompositePackageFragmentProvider>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModuleDescriptorImpl moduleDescriptorImpl = this.X;
                ModuleDependenciesImpl moduleDependenciesImpl = moduleDescriptorImpl.h0;
                if (moduleDependenciesImpl == null) {
                    StringBuilder sb = new StringBuilder("Dependencies of module ");
                    String str = moduleDescriptorImpl.getName().X;
                    Intrinsics.e(str, "name.toString()");
                    sb.append(str);
                    sb.append(" were not set before querying module content");
                    throw new AssertionError(sb.toString());
                }
                List list = moduleDependenciesImpl.f43651a;
                moduleDescriptorImpl.y0();
                list.contains(moduleDescriptorImpl);
                List list2 = list;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((ModuleDescriptorImpl) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.n(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    PackageFragmentProvider packageFragmentProvider = ((ModuleDescriptorImpl) it2.next()).i0;
                    Intrinsics.c(packageFragmentProvider);
                    arrayList.add(packageFragmentProvider);
                }
                return new CompositePackageFragmentProvider(arrayList, "CompositeProvider@ModuleDescriptor for " + moduleDescriptorImpl.getName());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final Object B0(ModuleCapability capability) {
        Intrinsics.f(capability, "capability");
        Object obj = this.f0.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final boolean F(ModuleDescriptor targetModule) {
        Intrinsics.f(targetModule, "targetModule");
        if (equals(targetModule)) {
            return true;
        }
        Intrinsics.c(this.h0);
        if (CollectionsKt.o(EmptySet.X, targetModule)) {
            return true;
        }
        t0();
        EmptyList.X.contains(targetModule);
        return targetModule.t0().contains(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final PackageViewDescriptor e0(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        y0();
        return (PackageViewDescriptor) this.k0.invoke(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final KotlinBuiltIns k() {
        return this.e0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final Collection m(FqName fqName, Function1 function1) {
        Intrinsics.f(fqName, "fqName");
        y0();
        y0();
        return ((CompositePackageFragmentProvider) this.l0.getX()).m(fqName, function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public final List t0() {
        if (this.h0 != null) {
            return EmptyList.X;
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().X;
        Intrinsics.e(str, "name.toString()");
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public final String toString() {
        String strC0 = DeclarationDescriptorImpl.c0(this);
        return this.j0 ? strC0 : strC0.concat(" !isValid");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object v(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.d(obj, this);
    }

    public final void y0() {
        Unit unit;
        if (this.j0) {
            return;
        }
        InvalidModuleNotifier invalidModuleNotifier = (InvalidModuleNotifier) B0(InvalidModuleExceptionKt.f43573a);
        if (invalidModuleNotifier != null) {
            invalidModuleNotifier.a();
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit != null) {
            return;
        }
        String message = "Accessing invalid module descriptor " + this;
        Intrinsics.f(message, "message");
        throw new InvalidModuleException(message);
    }
}
