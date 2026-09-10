package p002kotlin.reflect.jvm.internal.impl.resolve.constants;

import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.treadless;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.yemenite;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class kowloon extends competently<saneness> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f31328attabal = new attabal(null);

    /* JADX INFO: compiled from: constantValues.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final competently<?> attabal(oilcan argumentType) {
            Intrinsics.checkNotNullParameter(argumentType, "argumentType");
            if (yemenite.attabal(argumentType)) {
                return null;
            }
            oilcan type = argumentType;
            int i = 0;
            while (beachfront.timberyard(type)) {
                type = ((timberyard) CollectionsKt.herdbook(type.dhss())).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                i++;
            }
            p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = type.setterwort().wireman();
            if (beachfrontVarWireman instanceof wireman) {
                byname.saneness sanenessVarApical = DescriptorUtilsKt.apical(beachfrontVarWireman);
                return sanenessVarApical == null ? new kowloon(new saneness.attabal(argumentType)) : new kowloon(sanenessVarApical, i);
            }
            if (!(beachfrontVarWireman instanceof clubfoot)) {
                return null;
            }
            byname.saneness sanenessVarImpassible = byname.saneness.impassible(competently.attabal.f29758saneness.formularize());
            Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible, "topLevel(...)");
            return new kowloon(sanenessVarImpassible, 0);
        }

        public attabal() {
        }
    }

    /* JADX INFO: compiled from: constantValues.kt */
    public static abstract class saneness {

        /* JADX INFO: compiled from: constantValues.kt */
        public static final class attabal extends saneness {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final oilcan f31329attabal;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public attabal(oilcan type) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.f31329attabal = type;
            }

            public final oilcan attabal() {
                return this.f31329attabal;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof attabal) && Intrinsics.wireman(this.f31329attabal, ((attabal) obj).f31329attabal);
            }

            public int hashCode() {
                return this.f31329attabal.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f31329attabal + ')';
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.kowloon$saneness$saneness, reason: collision with other inner class name */
        /* JADX INFO: compiled from: constantValues.kt */
        public static final class C0700saneness extends saneness {
            private final beachfront value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0700saneness(beachfront value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            public final int attabal() {
                return this.value.dern();
            }

            public final beachfront dern() {
                return this.value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0700saneness) && Intrinsics.wireman(this.value, ((C0700saneness) obj).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public final byname.saneness saneness() {
                return this.value.wireman();
            }

            public String toString() {
                return "NormalClass(value=" + this.value + ')';
            }
        }

        public /* synthetic */ saneness(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public saneness() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kowloon(saneness value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
    public oilcan attabal(trm module) {
        Intrinsics.checkNotNullParameter(module, "module");
        overspeculate overspeculateVarTaiyuan = overspeculate.f31797arytenoidectomy.taiyuan();
        wireman wiremanVarYemenite = module.apical().yemenite();
        Intrinsics.checkNotNullExpressionValue(wiremanVarYemenite, "getKClass(...)");
        return KotlinTypeFactory.competently(overspeculateVarTaiyuan, wiremanVarYemenite, graveside.marial(new treadless(dern(module))));
    }

    public final oilcan dern(trm module) {
        Intrinsics.checkNotNullParameter(module, "module");
        saneness sanenessVarSaneness = saneness();
        if (sanenessVarSaneness instanceof saneness.attabal) {
            return ((saneness.attabal) saneness()).attabal();
        }
        if (!(sanenessVarSaneness instanceof saneness.C0700saneness)) {
            throw new NoWhenBranchMatchedException();
        }
        beachfront beachfrontVarDern = ((saneness.C0700saneness) saneness()).dern();
        byname.saneness sanenessVarAttabal = beachfrontVarDern.attabal();
        int iSaneness = beachfrontVarDern.saneness();
        wireman wiremanVarAttabal = FindClassInModuleKt.attabal(module, sanenessVarAttabal);
        if (wiremanVarAttabal == null) {
            ErrorTypeKind errorTypeKind = ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE;
            String string = sanenessVarAttabal.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return prescient.competently.wireman(errorTypeKind, string, String.valueOf(iSaneness));
        }
        merc mercVarImpassible = wiremanVarAttabal.impassible();
        Intrinsics.checkNotNullExpressionValue(mercVarImpassible, "getDefaultType(...)");
        oilcan oilcanVarPreprohormone = TypeUtilsKt.preprohormone(mercVarImpassible);
        for (int i = 0; i < iSaneness; i++) {
            oilcanVarPreprohormone = module.apical().formularize(Variance.INVARIANT, oilcanVarPreprohormone);
            Intrinsics.checkNotNullExpressionValue(oilcanVarPreprohormone, "getArrayType(...)");
        }
        return oilcanVarPreprohormone;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kowloon(beachfront value) {
        this(new saneness.C0700saneness(value));
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kowloon(byname.saneness classId, int i) {
        this(new beachfront(classId, i));
        Intrinsics.checkNotNullParameter(classId, "classId");
    }
}
