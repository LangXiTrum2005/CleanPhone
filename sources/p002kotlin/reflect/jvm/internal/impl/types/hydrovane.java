package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import prescient.competently;

/* JADX INFO: compiled from: TypeAliasExpander.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class hydrovane {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final attabal f31770dern = new attabal(null);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final hydrovane f31771wireman = new hydrovane(peridotite.attabal.f31799attabal, false);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final peridotite f31772attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final boolean f31773saneness;

    /* JADX INFO: compiled from: TypeAliasExpander.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void saneness(int i, overspeculate overspeculateVar) {
            if (i <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + overspeculateVar.getName());
        }

        public attabal() {
        }
    }

    public hydrovane(peridotite reportStrategy, boolean z) {
        Intrinsics.checkNotNullParameter(reportStrategy, "reportStrategy");
        this.f31772attabal = reportStrategy;
        this.f31773saneness = z;
    }

    public final merc apical(walach walachVar, overspeculate overspeculateVar, boolean z, int i, boolean z2) {
        timberyard timberyardVarFormularize = formularize(new treadless(Variance.INVARIANT, walachVar.saneness().underbelly()), walachVar, null, i);
        oilcan type = timberyardVarFormularize.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        merc mercVarAttabal = coffeecake.attabal(type);
        if (yemenite.attabal(mercVarAttabal)) {
            return mercVarAttabal;
        }
        timberyardVarFormularize.dern();
        attabal(mercVarAttabal.getAnnotations(), taiyuan.attabal(overspeculateVar));
        merc mercVarPolloi = nosophobia.polloi(wireman(mercVarAttabal, overspeculateVar), z);
        Intrinsics.checkNotNullExpressionValue(mercVarPolloi, "let(...)");
        return z2 ? saran.cutely(mercVarPolloi, competently(walachVar, overspeculateVar, z)) : mercVarPolloi;
    }

    public final void attabal(marial marialVar, marial marialVar2) {
        HashSet hashSet = new HashSet();
        Iterator<dern> it = marialVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().marial());
        }
        for (dern dernVar : marialVar2) {
            if (hashSet.contains(dernVar.marial())) {
                this.f31772attabal.dern(dernVar);
            }
        }
    }

    public final merc beachfront(merc mercVar, oilcan oilcanVar) {
        return wireman(marial(mercVar, oilcanVar), oilcanVar.vesuvio());
    }

    public final merc competently(walach walachVar, overspeculate overspeculateVar, boolean z) {
        permissivist permissivistVarImpromptu = walachVar.saneness().impromptu();
        Intrinsics.checkNotNullExpressionValue(permissivistVarImpromptu, "getTypeConstructor(...)");
        return KotlinTypeFactory.impassible(overspeculateVar, permissivistVarImpromptu, walachVar.attabal(), z, MemberScope.attabal.f31367saneness);
    }

    public final timberyard cutely(timberyard timberyardVar, walach walachVar, int i) {
        empress empressVarHomozygous = timberyardVar.getType().homozygous();
        if (!adultoid.attabal(empressVarHomozygous)) {
            merc mercVarAttabal = coffeecake.attabal(empressVarHomozygous);
            if (!yemenite.attabal(mercVarAttabal) && TypeUtilsKt.cord(mercVarAttabal)) {
                permissivist permissivistVar = mercVarAttabal.setterwort();
                beachfront beachfrontVarWireman = permissivistVar.wireman();
                permissivistVar.getParameters().size();
                mercVarAttabal.dhss().size();
                if (!(beachfrontVarWireman instanceof clubfoot)) {
                    if (!(beachfrontVarWireman instanceof overspeculate)) {
                        merc mercVarImpassible = impassible(mercVarAttabal, walachVar, i);
                        saneness(mercVarAttabal, mercVarImpassible);
                        return new treadless(timberyardVar.dern(), mercVarImpassible);
                    }
                    overspeculate overspeculateVar = (overspeculate) beachfrontVarWireman;
                    if (walachVar.wireman(overspeculateVar)) {
                        this.f31772attabal.saneness(overspeculateVar);
                        Variance variance = Variance.INVARIANT;
                        ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                        String string = overspeculateVar.getName().toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        return new treadless(variance, competently.wireman(errorTypeKind, string));
                    }
                    List<timberyard> listDhss = mercVarAttabal.dhss();
                    ArrayList arrayList = new ArrayList(dovishness.gintrap(listDhss, 10));
                    int i2 = 0;
                    for (Object obj : listDhss) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            adultoid.dovishness();
                        }
                        arrayList.add(formularize((timberyard) obj, walachVar, permissivistVar.getParameters().get(i2), i + 1));
                        i2 = i3;
                    }
                    merc mercVarApical = apical(walach.f31822marial.attabal(walachVar, overspeculateVar, arrayList), mercVarAttabal.vesuvio(), mercVarAttabal.mastfed(), i + 1, false);
                    merc mercVarImpassible2 = impassible(mercVarAttabal, walachVar, i);
                    if (!adultoid.attabal(mercVarApical)) {
                        mercVarApical = saran.cutely(mercVarApical, mercVarImpassible2);
                    }
                    return new treadless(timberyardVar.dern(), mercVarApical);
                }
            }
        }
        return timberyardVar;
    }

    public final graveside dern(graveside gravesideVar, overspeculate overspeculateVar) {
        return gravesideVar.deadwork(impromptu(gravesideVar, overspeculateVar));
    }

    public final timberyard formularize(timberyard timberyardVar, walach walachVar, clubfoot clubfootVar, int i) {
        Variance varianceCutely;
        Variance variance;
        Variance variance2;
        f31770dern.saneness(i, walachVar.saneness());
        if (timberyardVar.saneness()) {
            Intrinsics.beachfront(clubfootVar);
            timberyard timberyardVarMolybdenite = nosophobia.molybdenite(clubfootVar);
            Intrinsics.checkNotNullExpressionValue(timberyardVarMolybdenite, "makeStarProjection(...)");
            return timberyardVarMolybdenite;
        }
        oilcan type = timberyardVar.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        timberyard timberyardVarDern = walachVar.dern(type.setterwort());
        if (timberyardVarDern == null) {
            return cutely(timberyardVar, walachVar, i);
        }
        if (timberyardVarDern.saneness()) {
            Intrinsics.beachfront(clubfootVar);
            timberyard timberyardVarMolybdenite2 = nosophobia.molybdenite(clubfootVar);
            Intrinsics.checkNotNullExpressionValue(timberyardVarMolybdenite2, "makeStarProjection(...)");
            return timberyardVarMolybdenite2;
        }
        empress empressVarHomozygous = timberyardVarDern.getType().homozygous();
        Variance varianceDern = timberyardVarDern.dern();
        Intrinsics.checkNotNullExpressionValue(varianceDern, "getProjectionKind(...)");
        Variance varianceDern2 = timberyardVar.dern();
        Intrinsics.checkNotNullExpressionValue(varianceDern2, "getProjectionKind(...)");
        if (varianceDern2 != varianceDern && varianceDern2 != (variance2 = Variance.INVARIANT)) {
            if (varianceDern == variance2) {
                varianceDern = varianceDern2;
            } else {
                this.f31772attabal.wireman(walachVar.saneness(), clubfootVar, empressVarHomozygous);
            }
        }
        if (clubfootVar == null || (varianceCutely = clubfootVar.cutely()) == null) {
            varianceCutely = Variance.INVARIANT;
        }
        Intrinsics.beachfront(varianceCutely);
        if (varianceCutely != varianceDern && varianceCutely != (variance = Variance.INVARIANT)) {
            if (varianceDern == variance) {
                varianceDern = variance;
            } else {
                this.f31772attabal.wireman(walachVar.saneness(), clubfootVar, empressVarHomozygous);
            }
        }
        attabal(type.getAnnotations(), empressVarHomozygous.getAnnotations());
        return new treadless(varianceDern, empressVarHomozygous instanceof graveside ? dern((graveside) empressVarHomozygous, type.vesuvio()) : beachfront(coffeecake.attabal(empressVarHomozygous), type));
    }

    public final merc impassible(merc mercVar, walach walachVar, int i) {
        permissivist permissivistVar = mercVar.setterwort();
        List<timberyard> listDhss = mercVar.dhss();
        ArrayList arrayList = new ArrayList(dovishness.gintrap(listDhss, 10));
        int i2 = 0;
        for (Object obj : listDhss) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                adultoid.dovishness();
            }
            timberyard timberyardVar = (timberyard) obj;
            timberyard timberyardVarFormularize = formularize(timberyardVar, walachVar, permissivistVar.getParameters().get(i2), i + 1);
            if (!timberyardVarFormularize.saneness()) {
                timberyardVarFormularize = new treadless(timberyardVarFormularize.dern(), nosophobia.monoploid(timberyardVarFormularize.getType(), timberyardVar.getType().mastfed()));
            }
            arrayList.add(timberyardVarFormularize);
            i2 = i3;
        }
        return coffeecake.beachfront(mercVar, arrayList, null, 2, null);
    }

    public final overspeculate impromptu(oilcan oilcanVar, overspeculate overspeculateVar) {
        return yemenite.attabal(oilcanVar) ? oilcanVar.vesuvio() : overspeculateVar.impromptu(oilcanVar.vesuvio());
    }

    public final merc marial(merc mercVar, oilcan oilcanVar) {
        merc mercVarPolloi = nosophobia.polloi(mercVar, oilcanVar.mastfed());
        Intrinsics.checkNotNullExpressionValue(mercVarPolloi, "makeNullableIfNeeded(...)");
        return mercVarPolloi;
    }

    public final void saneness(oilcan oilcanVar, oilcan oilcanVar2) {
        TypeSubstitutor typeSubstitutorBeachfront = TypeSubstitutor.beachfront(oilcanVar2);
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorBeachfront, "create(...)");
        int i = 0;
        for (Object obj : oilcanVar2.dhss()) {
            int i2 = i + 1;
            if (i < 0) {
                adultoid.dovishness();
            }
            timberyard timberyardVar = (timberyard) obj;
            if (!timberyardVar.saneness()) {
                oilcan type = timberyardVar.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                if (!TypeUtilsKt.wireman(type)) {
                    timberyard timberyardVar2 = oilcanVar.dhss().get(i);
                    clubfoot clubfootVar = oilcanVar.setterwort().getParameters().get(i);
                    if (this.f31773saneness) {
                        peridotite peridotiteVar = this.f31772attabal;
                        oilcan type2 = timberyardVar2.getType();
                        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                        oilcan type3 = timberyardVar.getType();
                        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                        Intrinsics.beachfront(clubfootVar);
                        peridotiteVar.attabal(typeSubstitutorBeachfront, type2, type3, clubfootVar);
                    }
                }
            }
            i = i2;
        }
    }

    public final merc taiyuan(walach typeAliasExpansion, overspeculate attributes) {
        Intrinsics.checkNotNullParameter(typeAliasExpansion, "typeAliasExpansion");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return apical(typeAliasExpansion, attributes, false, 0, true);
    }

    public final merc wireman(merc mercVar, overspeculate overspeculateVar) {
        return yemenite.attabal(mercVar) ? mercVar : coffeecake.beachfront(mercVar, null, impromptu(mercVar, overspeculateVar), 1, null);
    }
}
