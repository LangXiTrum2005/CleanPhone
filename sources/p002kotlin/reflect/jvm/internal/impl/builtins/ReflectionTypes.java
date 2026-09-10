package p002kotlin.reflect.jvm.internal.impl.builtins;

import byname.marial;
import java.util.List;
import kurbash.formularize;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: ReflectionTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ReflectionTypes {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final NotFoundClasses f29630attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final attabal f29631beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final attabal f29632competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final attabal f29633cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final attabal f29634dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final attabal f29635impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final attabal f29636marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final taiyuan f29637saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final attabal f29638taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final attabal f29639wireman;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f29629formularize = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(ReflectionTypes.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(ReflectionTypes.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(ReflectionTypes.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(ReflectionTypes.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(ReflectionTypes.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(ReflectionTypes.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(ReflectionTypes.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), polloi.cutely(new PropertyReference1Impl(polloi.saneness(ReflectionTypes.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final saneness f29628apical = new saneness(null);

    /* JADX INFO: compiled from: ReflectionTypes.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f29640attabal;

        public attabal(int i) {
            this.f29640attabal = i;
        }

        public final wireman attabal(ReflectionTypes types, formularize<?> property) {
            Intrinsics.checkNotNullParameter(types, "types");
            Intrinsics.checkNotNullParameter(property, "property");
            return types.saneness(saccharine.attabal.attabal(property.getName()), this.f29640attabal);
        }
    }

    /* JADX INFO: compiled from: ReflectionTypes.kt */
    public static final class saneness {
        public /* synthetic */ saneness(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final oilcan attabal(trm module) {
            Intrinsics.checkNotNullParameter(module, "module");
            wireman wiremanVarAttabal = FindClassInModuleKt.attabal(module, competently.attabal.f29749picketboat);
            if (wiremanVarAttabal == null) {
                return null;
            }
            overspeculate overspeculateVarTaiyuan = overspeculate.f31797arytenoidectomy.taiyuan();
            List<clubfoot> parameters = wiremanVarAttabal.impromptu().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            Object objHerdbook = CollectionsKt.herdbook(parameters);
            Intrinsics.checkNotNullExpressionValue(objHerdbook, "single(...)");
            return KotlinTypeFactory.competently(overspeculateVarTaiyuan, wiremanVarAttabal, graveside.marial(new StarProjectionImpl((clubfoot) objHerdbook)));
        }

        public saneness() {
        }
    }

    public ReflectionTypes(final trm module, NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        this.f29630attabal = notFoundClasses;
        this.f29637saneness = p002kotlin.saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes$kotlinReflectScope$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final MemberScope invoke() {
                return module.hydrovane(competently.f29670dovishness).formularize();
            }
        });
        this.f29634dern = new attabal(1);
        this.f29639wireman = new attabal(1);
        this.f29636marial = new attabal(1);
        this.f29631beachfront = new attabal(2);
        this.f29632competently = new attabal(3);
        this.f29635impromptu = new attabal(1);
        this.f29638taiyuan = new attabal(2);
        this.f29633cutely = new attabal(3);
    }

    public final wireman dern() {
        return this.f29634dern.attabal(this, f29629formularize[0]);
    }

    public final wireman saneness(String str, int i) {
        marial marialVarCutely = marial.cutely(str);
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
        beachfront beachfrontVarMarial = wireman().marial(marialVarCutely, NoLookupLocation.FROM_REFLECTION);
        wireman wiremanVar = beachfrontVarMarial instanceof wireman ? (wireman) beachfrontVarMarial : null;
        return wiremanVar == null ? this.f29630attabal.wireman(new byname.saneness(competently.f29670dovishness, marialVarCutely), graveside.marial(Integer.valueOf(i))) : wiremanVar;
    }

    public final MemberScope wireman() {
        return (MemberScope) this.f29637saneness.getValue();
    }
}
