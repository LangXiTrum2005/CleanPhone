package p002kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p002kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import p002kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.checker.marial;
import p002kotlin.reflect.jvm.internal.impl.types.checker.saneness;
import p002kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import p002kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p002kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import presbytery.apical;
import presbytery.competently;
import presbytery.dern;
import presbytery.formularize;
import presbytery.impromptu;
import presbytery.monoploid;
import presbytery.taiyuan;
import presbytery.wireman;

/* JADX INFO: compiled from: OverridingUtilTypeSystemContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class cutely implements saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<permissivist, permissivist> f31335attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final beachfront f31336dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Function2<oilcan, oilcan, Boolean> f31337marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final marial.attabal f31338saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final KotlinTypePreparator f31339wireman;

    /* JADX INFO: compiled from: OverridingUtilTypeSystemContext.kt */
    public static final class attabal extends TypeCheckerState {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public final /* synthetic */ cutely f31340apical;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(boolean z, boolean z2, cutely cutelyVar, KotlinTypePreparator kotlinTypePreparator, beachfront beachfrontVar) {
            super(z, z2, true, cutelyVar, kotlinTypePreparator, beachfrontVar);
            this.f31340apical = cutelyVar;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.TypeCheckerState
        public boolean beachfront(competently subType, competently superType) {
            Intrinsics.checkNotNullParameter(subType, "subType");
            Intrinsics.checkNotNullParameter(superType, "superType");
            if (!(subType instanceof oilcan)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (superType instanceof oilcan) {
                return ((Boolean) this.f31340apical.f31337marial.invoke(subType, superType)).booleanValue();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cutely(Map<permissivist, ? extends permissivist> map, marial.attabal equalityAxioms, beachfront kotlinTypeRefiner, KotlinTypePreparator kotlinTypePreparator, Function2<? super oilcan, ? super oilcan, Boolean> function2) {
        Intrinsics.checkNotNullParameter(equalityAxioms, "equalityAxioms");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        this.f31335attabal = map;
        this.f31338saneness = equalityAxioms;
        this.f31336dern = kotlinTypeRefiner;
        this.f31339wireman = kotlinTypePreparator;
        this.f31337marial = function2;
    }

    @Override // presbytery.impassible
    public boolean achondroplasia(impromptu impromptuVar) {
        return saneness.attabal.walach(this, impromptuVar);
    }

    @Override // presbytery.impassible
    public boolean adultoid(impromptu impromptuVar) {
        return saneness.attabal.saran(this, impromptuVar);
    }

    @Override // presbytery.impassible
    public wireman apical(presbytery.marial marialVar) {
        return saneness.attabal.beachfront(this, marialVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.lerp
    public competently arytenoidectomy(competently competentlyVar) {
        impromptu impromptuVarMarial;
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        impromptu impromptuVarBeachfront = beachfront(competentlyVar);
        return (impromptuVarBeachfront == null || (impromptuVarMarial = marial(impromptuVarBeachfront, true)) == null) ? competentlyVar : impromptuVarMarial;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.saneness, presbytery.impassible
    public apical attabal(impromptu impromptuVar) {
        return saneness.attabal.czestochowa(this, impromptuVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.saneness, presbytery.impassible
    public impromptu beachfront(competently competentlyVar) {
        return saneness.attabal.impromptu(this, competentlyVar);
    }

    @Override // presbytery.impassible
    public boolean claque(competently competentlyVar) {
        return saneness.attabal.cultivated(this, competentlyVar);
    }

    @Override // presbytery.impassible
    public TypeCheckerState.saneness clubfoot(impromptu impromptuVar) {
        return saneness.attabal.sayid(this, impromptuVar);
    }

    @Override // presbytery.impassible
    public boolean coffeecake(presbytery.saneness sanenessVar) {
        return saneness.attabal.hydrovane(this, sanenessVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.lerp
    public byname.wireman coi(apical apicalVar) {
        return saneness.attabal.kowloon(this, apicalVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.saneness, presbytery.impassible
    public impromptu competently(presbytery.marial marialVar) {
        return saneness.attabal.sensatory(this, marialVar);
    }

    @Override // presbytery.impassible
    public boolean cord(apical apicalVar) {
        return saneness.attabal.seminary(this, apicalVar);
    }

    @Override // presbytery.impassible
    public impromptu creditor(competently competentlyVar) {
        impromptu impromptuVarWireman;
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        presbytery.marial marialVarStratoscope = stratoscope(competentlyVar);
        if (marialVarStratoscope != null && (impromptuVarWireman = wireman(marialVarStratoscope)) != null) {
            return impromptuVarWireman;
        }
        impromptu impromptuVarBeachfront = beachfront(competentlyVar);
        Intrinsics.beachfront(impromptuVarBeachfront);
        return impromptuVarBeachfront;
    }

    @Override // presbytery.impassible
    public taiyuan cuirassed(impromptu impromptuVar) {
        return saneness.attabal.dern(this, impromptuVar);
    }

    @Override // presbytery.impassible
    public CaptureStatus cultivated(presbytery.saneness sanenessVar) {
        return saneness.attabal.apical(this, sanenessVar);
    }

    @Override // presbytery.impassible
    public dern cutely(impromptu impromptuVar) {
        return saneness.attabal.marial(this, impromptuVar);
    }

    @Override // presbytery.impassible
    public boolean czestochowa(formularize formularizeVar, apical apicalVar) {
        return saneness.attabal.trm(this, formularizeVar, apicalVar);
    }

    @Override // presbytery.impassible
    public boolean dent(competently competentlyVar) {
        return saneness.attabal.merc(this, competentlyVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.saneness, presbytery.impassible
    public presbytery.saneness dern(impromptu impromptuVar) {
        return saneness.attabal.wireman(this, impromptuVar);
    }

    @Override // presbytery.impassible
    public TypeVariance dovishness(presbytery.cutely cutelyVar) {
        return saneness.attabal.cord(this, cutelyVar);
    }

    @Override // presbytery.impassible
    public impromptu empress(impromptu impromptuVar) {
        impromptu impromptuVarSeminary;
        Intrinsics.checkNotNullParameter(impromptuVar, "<this>");
        dern dernVarCutely = cutely(impromptuVar);
        return (dernVarCutely == null || (impromptuVarSeminary = seminary(dernVarCutely)) == null) ? impromptuVar : impromptuVarSeminary;
    }

    @Override // presbytery.impassible
    public boolean formularize(competently competentlyVar) {
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        impromptu impromptuVarBeachfront = beachfront(competentlyVar);
        return (impromptuVarBeachfront != null ? dern(impromptuVarBeachfront) : null) != null;
    }

    @Override // presbytery.impassible
    public boolean gintrap(competently competentlyVar) {
        return saneness.attabal.mathsort(this, competentlyVar);
    }

    @Override // presbytery.impassible
    public int graveside(taiyuan taiyuanVar) {
        Intrinsics.checkNotNullParameter(taiyuanVar, "<this>");
        if (taiyuanVar instanceof impromptu) {
            return rotuma((competently) taiyuanVar);
        }
        if (taiyuanVar instanceof ArgumentList) {
            return ((ArgumentList) taiyuanVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + taiyuanVar + ", " + polloi.saneness(taiyuanVar.getClass())).toString());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.lerp
    public PrimitiveType grimness(apical apicalVar) {
        return saneness.attabal.polloi(this, apicalVar);
    }

    @Override // presbytery.impassible
    public competently gusty(competently competentlyVar, boolean z) {
        return saneness.attabal.underbelly(this, competentlyVar, z);
    }

    @Override // presbytery.impassible
    public boolean hardpan(impromptu impromptuVar) {
        return saneness.attabal.permissivist(this, impromptuVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.lerp
    public boolean herdbook(apical apicalVar) {
        return saneness.attabal.premeiotic(this, apicalVar);
    }

    @Override // presbytery.impassible
    public boolean hydrovane(apical apicalVar) {
        return saneness.attabal.restrictive(this, apicalVar);
    }

    @Override // presbytery.impassible
    public boolean igbo(impromptu impromptuVar) {
        Intrinsics.checkNotNullParameter(impromptuVar, "<this>");
        return cord(attabal(impromptuVar));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.lerp
    public competently impassible(formularize formularizeVar) {
        return saneness.attabal.graveside(this, formularizeVar);
    }

    @Override // presbytery.impassible
    public boolean impromptu(competently competentlyVar) {
        return saneness.attabal.privatdozent(this, competentlyVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.lerp
    public PrimitiveType itchy(apical apicalVar) {
        return saneness.attabal.molybdenite(this, apicalVar);
    }

    @Override // presbytery.impassible
    public impromptu julian(competently competentlyVar) {
        impromptu impromptuVarCompetently;
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        presbytery.marial marialVarStratoscope = stratoscope(competentlyVar);
        if (marialVarStratoscope != null && (impromptuVarCompetently = competently(marialVarStratoscope)) != null) {
            return impromptuVarCompetently;
        }
        impromptu impromptuVarBeachfront = beachfront(competentlyVar);
        Intrinsics.beachfront(impromptuVarBeachfront);
        return impromptuVarBeachfront;
    }

    @Override // presbytery.impassible
    public boolean kattegat(apical apicalVar) {
        return saneness.attabal.creditor(this, apicalVar);
    }

    @Override // presbytery.impassible
    public competently kowloon(competently competentlyVar) {
        return saneness.attabal.treadless(this, competentlyVar);
    }

    @Override // presbytery.impassible
    public competently lerp(List<? extends competently> list) {
        return saneness.attabal.yemenite(this, list);
    }

    @Override // presbytery.impassible
    public impromptu lightstruck(impromptu impromptuVar, CaptureStatus captureStatus) {
        return saneness.attabal.cutely(this, impromptuVar, captureStatus);
    }

    @Override // presbytery.impassible
    public boolean lotta(presbytery.saneness sanenessVar) {
        return saneness.attabal.peridotite(this, sanenessVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.saneness, presbytery.impassible
    public impromptu marial(impromptu impromptuVar, boolean z) {
        return saneness.attabal.preterite(this, impromptuVar, z);
    }

    @Override // presbytery.impassible
    public List<formularize> mathsort(apical apicalVar) {
        return saneness.attabal.monoploid(this, apicalVar);
    }

    @Override // presbytery.impassible
    public formularize merc(monoploid monoploidVar) {
        return saneness.attabal.dovishness(this, monoploidVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.lerp
    public competently milliradian(competently competentlyVar) {
        return saneness.attabal.rotuma(this, competentlyVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.lerp
    public boolean molybdenite(apical apicalVar) {
        return saneness.attabal.polder(this, apicalVar);
    }

    @Override // presbytery.impassible
    public List<impromptu> monoploid(impromptu impromptuVar, apical constructor) {
        Intrinsics.checkNotNullParameter(impromptuVar, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        return null;
    }

    @Override // presbytery.impassible
    public boolean monroe(competently competentlyVar) {
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        presbytery.marial marialVarStratoscope = stratoscope(competentlyVar);
        return (marialVarStratoscope != null ? apical(marialVarStratoscope) : null) != null;
    }

    @Override // presbytery.impassible
    public apical nosophobia(competently competentlyVar) {
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        impromptu impromptuVarBeachfront = beachfront(competentlyVar);
        if (impromptuVarBeachfront == null) {
            impromptuVarBeachfront = creditor(competentlyVar);
        }
        return attabal(impromptuVarBeachfront);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.saneness
    public competently oilcan(impromptu impromptuVar, impromptu impromptuVar2) {
        return saneness.attabal.formularize(this, impromptuVar, impromptuVar2);
    }

    @Override // presbytery.impassible
    public presbytery.cutely outmarry(competently competentlyVar) {
        return saneness.attabal.taiyuan(this, competentlyVar);
    }

    @Override // presbytery.impassible
    public presbytery.cutely overspeculate(impromptu impromptuVar, int i) {
        Intrinsics.checkNotNullParameter(impromptuVar, "<this>");
        if (i < 0 || i >= rotuma(impromptuVar)) {
            return null;
        }
        return peridotite(impromptuVar, i);
    }

    @Override // presbytery.impassible
    public formularize palmyra(apical apicalVar) {
        return saneness.attabal.gintrap(this, apicalVar);
    }

    @Override // presbytery.impassible
    public presbytery.cutely peridotite(competently competentlyVar, int i) {
        return saneness.attabal.impassible(this, competentlyVar, i);
    }

    @Override // presbytery.impassible
    public List<presbytery.cutely> permissivist(competently competentlyVar) {
        return saneness.attabal.triweekly(this, competentlyVar);
    }

    @Override // presbytery.impassible
    public boolean picketboat(competently competentlyVar) {
        return saneness.attabal.starveling(this, competentlyVar);
    }

    @Override // presbytery.impassible
    public Collection<competently> polder(apical apicalVar) {
        return saneness.attabal.empress(this, apicalVar);
    }

    @Override // presbytery.impassible
    public boolean polloi(apical apicalVar) {
        return saneness.attabal.grimness(this, apicalVar);
    }

    @Override // presbytery.impassible
    public presbytery.cutely premeiotic(presbytery.attabal attabalVar) {
        return saneness.attabal.lotta(this, attabalVar);
    }

    @Override // presbytery.impassible
    public boolean preprohormone(presbytery.cutely cutelyVar) {
        return saneness.attabal.clubfoot(this, cutelyVar);
    }

    @Override // presbytery.arytenoidectomy
    public boolean preterite(impromptu impromptuVar, impromptu impromptuVar2) {
        return saneness.attabal.oilcan(this, impromptuVar, impromptuVar2);
    }

    @Override // presbytery.impassible
    public presbytery.cutely privatdozent(taiyuan taiyuanVar, int i) {
        Intrinsics.checkNotNullParameter(taiyuanVar, "<this>");
        if (taiyuanVar instanceof impromptu) {
            return peridotite((competently) taiyuanVar, i);
        }
        if (taiyuanVar instanceof ArgumentList) {
            presbytery.cutely cutelyVar = ((ArgumentList) taiyuanVar).get(i);
            Intrinsics.checkNotNullExpressionValue(cutelyVar, "get(...)");
            return cutelyVar;
        }
        throw new IllegalStateException(("unknown type argument list type: " + taiyuanVar + ", " + polloi.saneness(taiyuanVar.getClass())).toString());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.lerp
    public boolean restrictive(competently competentlyVar, byname.dern dernVar) {
        return saneness.attabal.stratoscope(this, competentlyVar, dernVar);
    }

    @Override // presbytery.impassible
    public int rotuma(competently competentlyVar) {
        return saneness.attabal.saneness(this, competentlyVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.saneness, presbytery.impassible
    public boolean saneness(impromptu impromptuVar) {
        return saneness.attabal.splinterproof(this, impromptuVar);
    }

    @Override // presbytery.impassible
    public formularize saran(apical apicalVar, int i) {
        return saneness.attabal.arytenoidectomy(this, apicalVar, i);
    }

    @Override // presbytery.impassible
    public boolean sayid(impromptu impromptuVar) {
        Intrinsics.checkNotNullParameter(impromptuVar, "<this>");
        return triweekly(attabal(impromptuVar));
    }

    @Override // presbytery.impassible
    public boolean sealless(competently competentlyVar) {
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        return adultoid(creditor(competentlyVar)) != adultoid(julian(competentlyVar));
    }

    @Override // presbytery.impassible
    public impromptu seminary(dern dernVar) {
        return saneness.attabal.coffeecake(this, dernVar);
    }

    @Override // presbytery.impassible
    public TypeVariance sensatory(formularize formularizeVar) {
        return saneness.attabal.cuirassed(this, formularizeVar);
    }

    public TypeCheckerState setterwort(boolean z, boolean z2) {
        if (this.f31337marial != null) {
            return new attabal(z, z2, this, this.f31339wireman, this.f31336dern);
        }
        return p002kotlin.reflect.jvm.internal.impl.types.checker.attabal.attabal(z, z2, this, this.f31339wireman, this.f31336dern);
    }

    @Override // presbytery.impassible
    public competently splinterproof(presbytery.saneness sanenessVar) {
        return saneness.attabal.milliradian(this, sanenessVar);
    }

    @Override // presbytery.impassible
    public List<competently> starveling(formularize formularizeVar) {
        return saneness.attabal.preprohormone(this, formularizeVar);
    }

    @Override // presbytery.impassible
    public presbytery.marial stratoscope(competently competentlyVar) {
        return saneness.attabal.competently(this, competentlyVar);
    }

    @Override // presbytery.impassible
    public int supplicat(apical apicalVar) {
        return saneness.attabal.lerp(this, apicalVar);
    }

    @Override // presbytery.impassible
    public boolean taiyuan(competently competentlyVar) {
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        return kattegat(nosophobia(competentlyVar)) && !picketboat(competentlyVar);
    }

    @Override // presbytery.impassible
    public boolean technofreak(impromptu impromptuVar) {
        return saneness.attabal.dent(this, impromptuVar);
    }

    @Override // presbytery.impassible
    public boolean timberyard(apical apicalVar) {
        return saneness.attabal.sealless(this, apicalVar);
    }

    @Override // presbytery.impassible
    public boolean treadless(apical apicalVar) {
        return saneness.attabal.supplicat(this, apicalVar);
    }

    @Override // presbytery.impassible
    public boolean triweekly(apical apicalVar) {
        return saneness.attabal.kattegat(this, apicalVar);
    }

    @Override // presbytery.impassible
    public presbytery.attabal trm(presbytery.saneness sanenessVar) {
        return saneness.attabal.coi(this, sanenessVar);
    }

    @Override // presbytery.impassible
    public boolean unconsolidated(apical c1, apical c2) {
        Intrinsics.checkNotNullParameter(c1, "c1");
        Intrinsics.checkNotNullParameter(c2, "c2");
        if (!(c1 instanceof permissivist)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c2 instanceof permissivist) {
            return saneness.attabal.attabal(this, c1, c2) || vesuvio((permissivist) c1, (permissivist) c2);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // presbytery.impassible
    public boolean underbelly(competently competentlyVar) {
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        impromptu impromptuVarBeachfront = beachfront(competentlyVar);
        return (impromptuVarBeachfront != null ? cutely(impromptuVarBeachfront) : null) != null;
    }

    public final boolean vesuvio(permissivist permissivistVar, permissivist permissivistVar2) {
        if (this.f31338saneness.attabal(permissivistVar, permissivistVar2)) {
            return true;
        }
        Map<permissivist, permissivist> map = this.f31335attabal;
        if (map == null) {
            return false;
        }
        permissivist permissivistVar3 = map.get(permissivistVar);
        permissivist permissivistVar4 = this.f31335attabal.get(permissivistVar2);
        return (permissivistVar3 != null && Intrinsics.wireman(permissivistVar3, permissivistVar2)) || (permissivistVar4 != null && Intrinsics.wireman(permissivistVar4, permissivistVar));
    }

    @Override // presbytery.impassible
    public boolean walach(competently competentlyVar) {
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        return (competentlyVar instanceof impromptu) && adultoid((impromptu) competentlyVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.checker.saneness, presbytery.impassible
    public impromptu wireman(presbytery.marial marialVar) {
        return saneness.attabal.timberyard(this, marialVar);
    }

    @Override // presbytery.impassible
    public competently wostteth(presbytery.cutely cutelyVar) {
        return saneness.attabal.adultoid(this, cutelyVar);
    }

    @Override // presbytery.impassible
    public Collection<competently> yemenite(impromptu impromptuVar) {
        return saneness.attabal.nosophobia(this, impromptuVar);
    }
}
