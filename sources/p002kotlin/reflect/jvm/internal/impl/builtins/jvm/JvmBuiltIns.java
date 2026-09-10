package p002kotlin.reflect.jvm.internal.impl.builtins.jvm;

import discontentedness.dern;
import java.util.List;
import kurbash.formularize;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import yeast.apical;
import yeast.impromptu;

/* JADX INFO: compiled from: JvmBuiltIns.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JvmBuiltIns extends beachfront {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f29822apical = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(JvmBuiltIns.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final impromptu f29823cutely;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final Kind f29824impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public Function0<attabal> f29825taiyuan;

    /* JADX INFO: compiled from: JvmBuiltIns.kt */
    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK;


        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final /* synthetic */ pussyfooter.attabal f29826arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());
    }

    /* JADX INFO: compiled from: JvmBuiltIns.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final trm f29828attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f29829saneness;

        public attabal(trm ownerModuleDescriptor, boolean z) {
            Intrinsics.checkNotNullParameter(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f29828attabal = ownerModuleDescriptor;
            this.f29829saneness = z;
        }

        public final trm attabal() {
            return this.f29828attabal;
        }

        public final boolean saneness() {
            return this.f29829saneness;
        }
    }

    /* JADX INFO: compiled from: JvmBuiltIns.kt */
    public /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f29830attabal;

        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Kind.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29830attabal = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(final yeast.formularize storageManager, Kind kind) {
        super(storageManager);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f29824impromptu = kind;
        this.f29823cutely = storageManager.dern(new Function0<JvmBuiltInsCustomizer>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$customizer$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final JvmBuiltInsCustomizer invoke() {
                ModuleDescriptorImpl moduleDescriptorImplPolloi = this.this$0.polloi();
                Intrinsics.checkNotNullExpressionValue(moduleDescriptorImplPolloi, "getBuiltInsModule(...)");
                yeast.formularize formularizeVar = storageManager;
                final JvmBuiltIns jvmBuiltIns = this.this$0;
                return new JvmBuiltInsCustomizer(moduleDescriptorImplPolloi, formularizeVar, new Function0<JvmBuiltIns.attabal>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$customizer$2.1
                    {
                        super(0);
                    }

                    @Override // p002kotlin.jvm.functions.Function0
                    public final JvmBuiltIns.attabal invoke() {
                        Function0 function0 = jvmBuiltIns.f29825taiyuan;
                        if (function0 == null) {
                            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                        }
                        JvmBuiltIns.attabal attabalVar = (JvmBuiltIns.attabal) function0.invoke();
                        jvmBuiltIns.f29825taiyuan = null;
                        return attabalVar;
                    }
                });
            }
        });
        int i = saneness.f29830attabal[kind.ordinal()];
        if (i == 2) {
            beachfront(false);
        } else {
            if (i != 3) {
                return;
            }
            beachfront(true);
        }
    }

    public final void attendance(Function0<attabal> computation) {
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.f29825taiyuan = computation;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.builtins.beachfront
    public discontentedness.attabal competently() {
        return setterwort();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.builtins.beachfront
    public dern grimness() {
        return setterwort();
    }

    public final void mastfed(final trm moduleDescriptor, final boolean z) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        attendance(new Function0<attabal>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$initialize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final JvmBuiltIns.attabal invoke() {
                return new JvmBuiltIns.attabal(moduleDescriptor, z);
            }
        });
    }

    public final JvmBuiltInsCustomizer setterwort() {
        return (JvmBuiltInsCustomizer) apical.attabal(this.f29823cutely, this, f29822apical[0]);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.builtins.beachfront
    /* JADX INFO: renamed from: vesuvio, reason: merged with bridge method [inline-methods] */
    public List<discontentedness.saneness> dovishness() {
        Iterable<discontentedness.saneness> iterableDovishness = super.dovishness();
        Intrinsics.checkNotNullExpressionValue(iterableDovishness, "getClassDescriptorFactories(...)");
        yeast.formularize formularizeVarMathsort = mathsort();
        Intrinsics.checkNotNullExpressionValue(formularizeVarMathsort, "getStorageManager(...)");
        ModuleDescriptorImpl moduleDescriptorImplPolloi = polloi();
        Intrinsics.checkNotNullExpressionValue(moduleDescriptorImplPolloi, "getBuiltInsModule(...)");
        return CollectionsKt.achondroplasia(iterableDovishness, new JvmBuiltInClassDescriptorFactory(formularizeVarMathsort, moduleDescriptorImplPolloi, null, 4, null));
    }
}
