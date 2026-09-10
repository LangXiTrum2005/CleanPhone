package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LockBasedStorageManager f43514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModuleDescriptorImpl f43515b;

    public BuiltInFictitiousFunctionClassFactory(LockBasedStorageManager lockBasedStorageManager, ModuleDescriptorImpl module) {
        Intrinsics.f(module, "module");
        this.f43514a = lockBasedStorageManager;
        this.f43515b = module;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final Collection a(FqName packageFqName) {
        Intrinsics.f(packageFqName, "packageFqName");
        return EmptySet.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final boolean b(FqName packageFqName, Name name) {
        Intrinsics.f(packageFqName, "packageFqName");
        Intrinsics.f(name, "name");
        String strB = name.b();
        Intrinsics.e(strB, "name.asString()");
        if (StringsKt.M(strB, "Function", false) || StringsKt.M(strB, "KFunction", false) || StringsKt.M(strB, "SuspendFunction", false) || StringsKt.M(strB, "KSuspendFunction", false)) {
            FunctionClassKind.Z.getClass();
            if (FunctionClassKind.Companion.a(strB, packageFqName) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final ClassDescriptor c(ClassId classId) {
        Intrinsics.f(classId, "classId");
        if (classId.f44163c || !classId.f44162b.e().d()) {
            return null;
        }
        String strB = classId.h().b();
        if (!StringsKt.l(strB, "Function", false)) {
            return null;
        }
        FqName fqNameG = classId.g();
        Intrinsics.e(fqNameG, "classId.packageFqName");
        FunctionClassKind.Z.getClass();
        FunctionClassKind.Companion.KindWithArity kindWithArityA = FunctionClassKind.Companion.a(strB, fqNameG);
        if (kindWithArityA == null) {
            return null;
        }
        List listA0 = this.f43515b.e0(fqNameG).a0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA0) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof FunctionInterfacePackageFragment) {
                arrayList2.add(obj2);
            }
        }
        BuiltInsPackageFragment builtInsPackageFragment = (FunctionInterfacePackageFragment) CollectionsKt.y(arrayList2);
        if (builtInsPackageFragment == null) {
            builtInsPackageFragment = (BuiltInsPackageFragment) CollectionsKt.w(arrayList);
        }
        return new FunctionClassDescriptor(this.f43514a, builtInsPackageFragment, kindWithArityA.f43518a, kindWithArityA.f43519b);
    }
}
