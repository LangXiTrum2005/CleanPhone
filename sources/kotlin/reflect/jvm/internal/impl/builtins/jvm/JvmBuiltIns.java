package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* JADX INFO: loaded from: classes7.dex */
public final class JvmBuiltIns extends KotlinBuiltIns {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f43538i;
    public Function0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NotNullLazyValue f43539h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {
        public static final /* synthetic */ Kind[] X = {new Kind("FROM_DEPENDENCIES", 0), new Kind("FROM_CLASS_LOADER", 1), new Kind("FALLBACK", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Kind EF5;

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) X.clone();
        }
    }

    public static final class Settings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ModuleDescriptorImpl f43540a;

        public Settings(ModuleDescriptorImpl moduleDescriptorImpl) {
            this.f43540a = moduleDescriptorImpl;
        }
    }

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f43538i = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(JvmBuiltIns.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    public JvmBuiltIns(final LockBasedStorageManager lockBasedStorageManager) {
        super(lockBasedStorageManager);
        this.f43539h = lockBasedStorageManager.a(new Function0<JvmBuiltInsCustomizer>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$customizer$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                final JvmBuiltIns jvmBuiltIns = this.X;
                ModuleDescriptorImpl builtInsModule = jvmBuiltIns.k();
                Intrinsics.e(builtInsModule, "builtInsModule");
                return new JvmBuiltInsCustomizer(builtInsModule, lockBasedStorageManager, new Function0<JvmBuiltIns.Settings>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$customizer$2.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        JvmBuiltIns jvmBuiltIns2 = jvmBuiltIns;
                        Function0 function0 = jvmBuiltIns2.g;
                        if (function0 == null) {
                            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                        }
                        JvmBuiltIns.Settings settings = (JvmBuiltIns.Settings) function0.invoke();
                        jvmBuiltIns2.g = null;
                        return settings;
                    }
                });
            }
        });
    }

    public final JvmBuiltInsCustomizer K() {
        return (JvmBuiltInsCustomizer) StorageKt.a(this.f43539h, f43538i[0]);
    }

    public final void L(final ModuleDescriptorImpl moduleDescriptorImpl) {
        this.g = new Function0<Settings>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$initialize$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new JvmBuiltIns.Settings(moduleDescriptorImpl);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final AdditionalClassPartsProvider d() {
        return K();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final Iterable l() {
        Iterable iterableL = super.l();
        LockBasedStorageManager lockBasedStorageManager = this.f43463e;
        ModuleDescriptorImpl builtInsModule = k();
        Intrinsics.e(builtInsModule, "builtInsModule");
        return CollectionsKt.N(iterableL, new JvmBuiltInClassDescriptorFactory(lockBasedStorageManager, builtInsModule));
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public final PlatformDependentDeclarationFilter o() {
        return K();
    }
}
