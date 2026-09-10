package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectionTypes {
    public static final Companion d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f43468e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotFoundClasses f43469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ClassLookup f43471c = new ClassLookup();

    public static final class ClassLookup {
    }

    public static final class Companion {
    }

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f43468e = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(ReflectionTypes.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(ReflectionTypes.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(ReflectionTypes.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(ReflectionTypes.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(ReflectionTypes.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(ReflectionTypes.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(ReflectionTypes.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(ReflectionTypes.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
        d = new Companion();
    }

    public ReflectionTypes(final ModuleDescriptorImpl moduleDescriptorImpl, NotFoundClasses notFoundClasses) {
        this.f43469a = notFoundClasses;
        this.f43470b = LazyKt.a(LazyThreadSafetyMode.f43248Y, new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes$kotlinReflectScope$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return moduleDescriptorImpl.e0(StandardNames.f43476h).n();
            }
        });
    }
}
