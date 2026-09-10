package p002kotlin.reflect.jvm.internal.impl.descriptors;

import byname.dern;
import byname.marial;
import byname.saneness;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.creditor;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.kattegat;
import p002kotlin.collections.privatdozent;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;
import p002kotlin.ranges.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.cutely;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import yeast.beachfront;
import yeast.formularize;

/* JADX INFO: compiled from: NotFoundClasses.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class NotFoundClasses {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final formularize f29897attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final beachfront<dern, sealless> f29898dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final trm f29899saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final beachfront<attabal, wireman> f29900wireman;

    /* JADX INFO: compiled from: NotFoundClasses.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final byname.saneness f29901attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final List<Integer> f29902saneness;

        public attabal(byname.saneness classId, List<Integer> typeParametersCount) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
            this.f29901attabal = classId;
            this.f29902saneness = typeParametersCount;
        }

        public final byname.saneness attabal() {
            return this.f29901attabal;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof attabal)) {
                return false;
            }
            attabal attabalVar = (attabal) obj;
            return Intrinsics.wireman(this.f29901attabal, attabalVar.f29901attabal) && Intrinsics.wireman(this.f29902saneness, attabalVar.f29902saneness);
        }

        public int hashCode() {
            return (this.f29901attabal.hashCode() * 31) + this.f29902saneness.hashCode();
        }

        public final List<Integer> saneness() {
            return this.f29902saneness;
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f29901attabal + ", typeParametersCount=" + this.f29902saneness + ')';
        }
    }

    /* JADX INFO: compiled from: NotFoundClasses.kt */
    public static final class saneness extends p002kotlin.reflect.jvm.internal.impl.descriptors.impl.beachfront {

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public final boolean f29903dovishness;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public final List<clubfoot> f29904gintrap;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public final cutely f29905rotuma;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public saneness(formularize storageManager, apical container, marial name, boolean z, int i) {
            super(storageManager, container, name, walach.f30274attabal, false);
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(name, "name");
            this.f29903dovishness = z;
            IntRange intRangeMonoploid = wireman.monoploid(0, i);
            ArrayList arrayList = new ArrayList(dovishness.gintrap(intRangeMonoploid, 10));
            Iterator<Integer> it = intRangeMonoploid.iterator();
            while (it.hasNext()) {
                int iNextInt = ((kattegat) it).nextInt();
                p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVarSaneness = p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness();
                Variance variance = Variance.INVARIANT;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(iNextInt);
                arrayList.add(p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kattegat.libyan(this, marialVarSaneness, false, variance, marial.cutely(sb.toString()), iNextInt, storageManager));
            }
            this.f29904gintrap = arrayList;
            this.f29905rotuma = new cutely(this, TypeParameterUtilsKt.wireman(this), privatdozent.wireman(DescriptorUtilsKt.arytenoidectomy(this).apical().taiyuan()), storageManager);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
        public Collection<wireman> adultoid() {
            return adultoid.formularize();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
        public boolean coffeecake() {
            return false;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
        public dern cord() {
            return null;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
        public dent<merc> creditor() {
            return null;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
        /* JADX INFO: renamed from: dhss, reason: merged with bridge method [inline-methods] */
        public MemberScope.attabal lerp() {
            return MemberScope.attabal.f31367saneness;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal
        public p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial getAnnotations() {
            return p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
        public ClassKind getKind() {
            return ClassKind.CLASS;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
        public molybdenite getVisibility() {
            molybdenite PUBLIC = polloi.f30212marial;
            Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.competently
        public boolean gintrap() {
            return this.f29903dovishness;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
        public boolean herdbook() {
            return false;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.beachfront, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
        public boolean isExternal() {
            return false;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
        public boolean isInline() {
            return false;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
        public Modality kowloon() {
            return Modality.FINAL;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
        public wireman nosophobia() {
            return null;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
        public boolean overspeculate() {
            return false;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
        public boolean peridotite() {
            return false;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
        public boolean permissivist() {
            return false;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.polloi
        /* JADX INFO: renamed from: setterwort, reason: merged with bridge method [inline-methods] */
        public MemberScope.attabal itchy(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            return MemberScope.attabal.f31367saneness;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
        public Collection<dern> taiyuan() {
            return creditor.marial();
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman
        public boolean treadless() {
            return false;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.wireman, p002kotlin.reflect.jvm.internal.impl.descriptors.competently
        public List<clubfoot> triweekly() {
            return this.f29904gintrap;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront
        /* JADX INFO: renamed from: vesuvio, reason: merged with bridge method [inline-methods] */
        public cutely impromptu() {
            return this.f29905rotuma;
        }
    }

    public NotFoundClasses(formularize storageManager, trm module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f29897attabal = storageManager;
        this.f29899saneness = module;
        this.f29898dern = storageManager.taiyuan(new Function1<dern, sealless>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$packageFragments$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final sealless invoke(dern fqName) {
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                return new p002kotlin.reflect.jvm.internal.impl.descriptors.impl.formularize(this.this$0.f29899saneness, fqName);
            }
        });
        this.f29900wireman = storageManager.taiyuan(new Function1<attabal, wireman>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$classes$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final wireman invoke(NotFoundClasses.attabal attabalVar) {
                apical apicalVarWireman;
                Intrinsics.checkNotNullParameter(attabalVar, "<name for destructuring parameter 0>");
                saneness sanenessVarAttabal = attabalVar.attabal();
                List<Integer> listSaneness = attabalVar.saneness();
                if (sanenessVarAttabal.apical()) {
                    throw new UnsupportedOperationException("Unresolved local class: " + sanenessVarAttabal);
                }
                saneness sanenessVarCompetently = sanenessVarAttabal.competently();
                if (sanenessVarCompetently == null || (apicalVarWireman = this.this$0.wireman(sanenessVarCompetently, CollectionsKt.premeiotic(listSaneness, 1))) == null) {
                    beachfront beachfrontVar = this.this$0.f29898dern;
                    dern dernVarImpromptu = sanenessVarAttabal.impromptu();
                    Intrinsics.checkNotNullExpressionValue(dernVarImpromptu, "getPackageFqName(...)");
                    apicalVarWireman = (marial) beachfrontVar.invoke(dernVarImpromptu);
                }
                apical apicalVar = apicalVarWireman;
                boolean zFormularize = sanenessVarAttabal.formularize();
                formularize formularizeVar = this.this$0.f29897attabal;
                marial marialVarCutely = sanenessVarAttabal.cutely();
                Intrinsics.checkNotNullExpressionValue(marialVarCutely, "getShortClassName(...)");
                Integer num = (Integer) CollectionsKt.firstOrNull(listSaneness);
                return new NotFoundClasses.saneness(formularizeVar, apicalVar, marialVarCutely, zFormularize, num != null ? num.intValue() : 0);
            }
        });
    }

    public final wireman wireman(byname.saneness classId, List<Integer> typeParametersCount) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
        return this.f29900wireman.invoke(new attabal(classId, typeParametersCount));
    }
}
