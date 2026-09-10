package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* JADX INFO: loaded from: classes7.dex */
public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {
    public static final Companion d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f43532e;
    public static final FqName f;
    public static final Name g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ClassId f43533h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModuleDescriptorImpl f43534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f43535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotNullLazyValue f43536c;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<ModuleDescriptor, BuiltInsPackageFragment> {
        public static final AnonymousClass1 X = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ModuleDescriptor module = (ModuleDescriptor) obj;
            Intrinsics.f(module, "module");
            List listA0 = module.e0(JvmBuiltInClassDescriptorFactory.f).a0();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listA0) {
                if (obj2 instanceof BuiltInsPackageFragment) {
                    arrayList.add(obj2);
                }
            }
            return (BuiltInsPackageFragment) CollectionsKt.w(arrayList);
        }
    }

    public static final class Companion {
    }

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f43532e = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(JvmBuiltInClassDescriptorFactory.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        d = new Companion();
        f = StandardNames.k;
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.f43497c;
        Name nameF = fqNameUnsafe.f();
        Intrinsics.e(nameF, "cloneable.shortName()");
        g = nameF;
        f43533h = ClassId.j(fqNameUnsafe.g());
    }

    public JvmBuiltInClassDescriptorFactory(final LockBasedStorageManager lockBasedStorageManager, ModuleDescriptorImpl moduleDescriptorImpl) {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.X;
        this.f43534a = moduleDescriptorImpl;
        this.f43535b = anonymousClass1;
        this.f43536c = lockBasedStorageManager.a(new Function0<ClassDescriptorImpl>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$cloneable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory = this.X;
                Function1 function1 = jvmBuiltInClassDescriptorFactory.f43535b;
                ModuleDescriptorImpl moduleDescriptorImpl2 = jvmBuiltInClassDescriptorFactory.f43534a;
                DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) function1.invoke(moduleDescriptorImpl2);
                Name name = JvmBuiltInClassDescriptorFactory.g;
                Modality modality = Modality.e0;
                ClassKind classKind = ClassKind.f43559Y;
                List listH = CollectionsKt.H(moduleDescriptorImpl2.e0.e());
                LockBasedStorageManager lockBasedStorageManager2 = lockBasedStorageManager;
                ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(declarationDescriptor, name, modality, classKind, listH, lockBasedStorageManager2);
                classDescriptorImpl.G0(new CloneableClassScope(lockBasedStorageManager2, classDescriptorImpl), EmptySet.X, null);
                return classDescriptorImpl;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final Collection a(FqName packageFqName) {
        Intrinsics.f(packageFqName, "packageFqName");
        if (!packageFqName.equals(f)) {
            return EmptySet.X;
        }
        return SetsKt.h((ClassDescriptorImpl) StorageKt.a(this.f43536c, f43532e[0]));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final boolean b(FqName packageFqName, Name name) {
        Intrinsics.f(packageFqName, "packageFqName");
        Intrinsics.f(name, "name");
        return name.equals(g) && packageFqName.equals(f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final ClassDescriptor c(ClassId classId) {
        Intrinsics.f(classId, "classId");
        if (!classId.equals(f43533h)) {
            return null;
        }
        return (ClassDescriptorImpl) StorageKt.a(this.f43536c, f43532e[0]);
    }
}
