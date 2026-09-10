package p002kotlin.reflect.jvm.internal.impl.resolve;

import byname.dern;
import byname.marial;
import byname.saneness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.gintrap;
import p002kotlin.reflect.jvm.internal.impl.descriptors.premeiotic;
import p002kotlin.reflect.jvm.internal.impl.descriptors.privatdozent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.checker.kowloon;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: inlineClassesUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f31304attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final saneness f31305saneness;

    static {
        dern dernVar = new dern("kotlin.jvm.JvmInline");
        f31304attabal = dernVar;
        saneness sanenessVarImpassible = saneness.impassible(dernVar);
        Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible, "topLevel(...)");
        f31305saneness = sanenessVarImpassible;
    }

    public static final oilcan apical(oilcan oilcanVar) {
        gintrap<merc> gintrapVarTriweekly;
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        wireman wiremanVar = beachfrontVarWireman instanceof wireman ? (wireman) beachfrontVarWireman : null;
        if (wiremanVar == null || (gintrapVarTriweekly = DescriptorUtilsKt.triweekly(wiremanVar)) == null) {
            return null;
        }
        return (merc) gintrapVarTriweekly.marial();
    }

    public static final boolean attabal(attabal attabalVar) {
        Intrinsics.checkNotNullParameter(attabalVar, "<this>");
        if (!(attabalVar instanceof privatdozent)) {
            return false;
        }
        saran saranVarStarveling = ((privatdozent) attabalVar).starveling();
        Intrinsics.checkNotNullExpressionValue(saranVarStarveling, "getCorrespondingProperty(...)");
        return beachfront(saranVarStarveling);
    }

    public static final boolean beachfront(premeiotic premeioticVar) {
        dent<merc> dentVarCreditor;
        Intrinsics.checkNotNullParameter(premeioticVar, "<this>");
        if (premeioticVar.polder() != null) {
            return false;
        }
        apical apicalVarSaneness = premeioticVar.saneness();
        wireman wiremanVar = apicalVarSaneness instanceof wireman ? (wireman) apicalVarSaneness : null;
        if (wiremanVar == null || (dentVarCreditor = wiremanVar.creditor()) == null) {
            return false;
        }
        marial name = premeioticVar.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return dentVarCreditor.attabal(name);
    }

    public static final boolean competently(apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<this>");
        return saneness(apicalVar) || wireman(apicalVar);
    }

    public static final oilcan cutely(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        oilcan oilcanVarApical = apical(oilcanVar);
        if (oilcanVarApical != null) {
            return TypeSubstitutor.beachfront(oilcanVar).arytenoidectomy(oilcanVarApical, Variance.INVARIANT);
        }
        return null;
    }

    public static final boolean dern(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        if (beachfrontVarWireman != null) {
            return saneness(beachfrontVarWireman);
        }
        return false;
    }

    public static final boolean impromptu(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        if (beachfrontVarWireman != null) {
            return competently(beachfrontVarWireman);
        }
        return false;
    }

    public static final boolean marial(premeiotic premeioticVar) {
        gintrap<merc> gintrapVarTriweekly;
        Intrinsics.checkNotNullParameter(premeioticVar, "<this>");
        if (premeioticVar.polder() != null) {
            return false;
        }
        apical apicalVarSaneness = premeioticVar.saneness();
        marial marialVarWireman = null;
        wireman wiremanVar = apicalVarSaneness instanceof wireman ? (wireman) apicalVarSaneness : null;
        if (wiremanVar != null && (gintrapVarTriweekly = DescriptorUtilsKt.triweekly(wiremanVar)) != null) {
            marialVarWireman = gintrapVarTriweekly.wireman();
        }
        return Intrinsics.wireman(marialVarWireman, premeioticVar.getName());
    }

    public static final boolean saneness(apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<this>");
        return (apicalVar instanceof wireman) && (((wireman) apicalVar).creditor() instanceof gintrap);
    }

    public static final boolean taiyuan(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        return (beachfrontVarWireman == null || !wireman(beachfrontVarWireman) || kowloon.f31733attabal.picketboat(oilcanVar)) ? false : true;
    }

    public static final boolean wireman(apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<this>");
        return (apicalVar instanceof wireman) && (((wireman) apicalVar).creditor() instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.oilcan);
    }
}
