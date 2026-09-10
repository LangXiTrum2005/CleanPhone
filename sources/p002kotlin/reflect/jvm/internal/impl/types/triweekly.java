package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kattegat;
import p002kotlin.reflect.jvm.internal.impl.types.checker.formularize;
import p002kotlin.reflect.jvm.internal.impl.types.checker.impassible;
import p002kotlin.reflect.jvm.internal.impl.types.checker.impromptu;
import presbytery.dern;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class triweekly extends arytenoidectomy implements formularize, dern {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final attabal f31815polloi = new attabal(null);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final merc f31816arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final boolean f31817monoploid;

    /* JADX INFO: compiled from: SpecialTypes.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ triweekly dern(attabal attabalVar, empress empressVar, boolean z, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return attabalVar.saneness(empressVar, z, z2);
        }

        public final boolean attabal(empress empressVar) {
            return (empressVar.setterwort() instanceof formularize) || (empressVar.setterwort().wireman() instanceof clubfoot) || (empressVar instanceof impromptu) || (empressVar instanceof starveling);
        }

        public final triweekly saneness(empress type, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof triweekly) {
                return (triweekly) type;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!z2 && !wireman(type, z)) {
                return null;
            }
            if (type instanceof preprohormone) {
                preprohormone preprohormoneVar = (preprohormone) type;
                Intrinsics.wireman(preprohormoneVar.sakeen().setterwort(), preprohormoneVar.immediately().setterwort());
            }
            return new triweekly(stratoscope.dern(type).lampshade(false), z, defaultConstructorMarker);
        }

        public final boolean wireman(empress empressVar, boolean z) {
            if (!attabal(empressVar)) {
                return false;
            }
            if (empressVar instanceof starveling) {
                return nosophobia.formularize(empressVar);
            }
            beachfront beachfrontVarWireman = empressVar.setterwort().wireman();
            kattegat kattegatVar = beachfrontVarWireman instanceof kattegat ? (kattegat) beachfrontVarWireman : null;
            if (kattegatVar == null || kattegatVar.molet()) {
                return (z && (empressVar.setterwort().wireman() instanceof clubfoot)) ? nosophobia.formularize(empressVar) : !impassible.f31726attabal.attabal(empressVar);
            }
            return true;
        }

        public attabal() {
        }
    }

    public /* synthetic */ triweekly(merc mercVar, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(mercVar, z);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy
    public merc immediately() {
        return this.f31816arytenoidectomy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.formularize
    public oilcan itchy(oilcan replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return saran.marial(replacement.homozygous(), this.f31817monoploid);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy, p002kotlin.reflect.jvm.internal.impl.types.oilcan
    public boolean mastfed() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: molet */
    public merc lampshade(boolean z) {
        return z ? immediately().lampshade(z) : this;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy
    /* JADX INFO: renamed from: osteal, reason: merged with bridge method [inline-methods] */
    public triweekly tectonization(merc delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new triweekly(delegate, this.f31817monoploid);
    }

    public final merc prefect() {
        return this.f31816arytenoidectomy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
    /* JADX INFO: renamed from: sakeen */
    public merc deadwork(overspeculate newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new triweekly(immediately().deadwork(newAttributes), this.f31817monoploid);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.merc
    public String toString() {
        return immediately() + " & Any";
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.formularize
    public boolean unconsolidated() {
        return (immediately().setterwort() instanceof formularize) || (immediately().setterwort().wireman() instanceof clubfoot);
    }

    public triweekly(merc mercVar, boolean z) {
        this.f31816arytenoidectomy = mercVar;
        this.f31817monoploid = z;
    }
}
