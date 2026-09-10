package p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.preprohormone;
import p002kotlin.reflect.jvm.internal.impl.types.restrictive;
import p002kotlin.reflect.jvm.internal.impl.types.saran;
import p002kotlin.reflect.jvm.internal.impl.types.sayid;
import p002kotlin.reflect.jvm.internal.impl.types.stratoscope;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.yemenite;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final p002kotlin.reflect.jvm.internal.impl.load.java.lazy.saneness f30634attabal;

    /* JADX INFO: compiled from: typeEnhancement.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final oilcan f30635attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f30636saneness;

        public attabal(oilcan oilcanVar, int i) {
            this.f30635attabal = oilcanVar;
            this.f30636saneness = i;
        }

        public final int attabal() {
            return this.f30636saneness;
        }

        public final oilcan saneness() {
            return this.f30635attabal;
        }
    }

    /* JADX INFO: compiled from: typeEnhancement.kt */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final merc f30637attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final boolean f30638dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f30639saneness;

        public saneness(merc mercVar, int i, boolean z) {
            this.f30637attabal = mercVar;
            this.f30639saneness = i;
            this.f30638dern = z;
        }

        public final boolean attabal() {
            return this.f30638dern;
        }

        public final merc dern() {
            return this.f30637attabal;
        }

        public final int saneness() {
            return this.f30639saneness;
        }
    }

    public dern(p002kotlin.reflect.jvm.internal.impl.load.java.lazy.saneness javaResolverSettings) {
        Intrinsics.checkNotNullParameter(javaResolverSettings, "javaResolverSettings");
        this.f30634attabal = javaResolverSettings;
    }

    public static /* synthetic */ saneness dern(dern dernVar, merc mercVar, Function1 function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        return dernVar.saneness(mercVar, function1, i, typeComponentPosition, z, z2);
    }

    public final oilcan attabal(oilcan oilcanVar, Function1<? super Integer, wireman> qualifiers, boolean z) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        return wireman(oilcanVar.homozygous(), qualifiers, 0, z).saneness();
    }

    public final merc marial(merc mercVar) {
        return this.f30634attabal.attabal() ? saran.impromptu(mercVar, true) : new marial(mercVar);
    }

    public final saneness saneness(merc mercVar, Function1<? super Integer, wireman> function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2) {
        permissivist permissivistVarImpromptu;
        Boolean bool;
        attabal attabalVar;
        timberyard timberyardVarMolybdenite;
        Function1<? super Integer, wireman> function2 = function1;
        boolean zAttabal = cutely.attabal(typeComponentPosition);
        boolean z3 = (z2 && z) ? false : true;
        oilcan oilcanVar = null;
        if (!zAttabal && mercVar.dhss().isEmpty()) {
            return new saneness(null, 1, false);
        }
        beachfront beachfrontVarWireman = mercVar.setterwort().wireman();
        if (beachfrontVarWireman == null) {
            return new saneness(null, 1, false);
        }
        wireman wiremanVarInvoke = function2.invoke(Integer.valueOf(i));
        beachfront beachfrontVarBeachfront = formularize.beachfront(beachfrontVarWireman, wiremanVarInvoke, typeComponentPosition);
        Boolean boolImpromptu = formularize.impromptu(wiremanVarInvoke, typeComponentPosition);
        if (beachfrontVarBeachfront == null || (permissivistVarImpromptu = beachfrontVarBeachfront.impromptu()) == null) {
            permissivistVarImpromptu = mercVar.setterwort();
        }
        permissivist permissivistVar = permissivistVarImpromptu;
        Intrinsics.beachfront(permissivistVar);
        int iAttabal = i + 1;
        List<timberyard> listDhss = mercVar.dhss();
        List<clubfoot> parameters = permissivistVar.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        List<clubfoot> list = parameters;
        Iterator<T> it = listDhss.iterator();
        Iterator<T> it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(dovishness.gintrap(listDhss, 10), dovishness.gintrap(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            clubfoot clubfootVar = (clubfoot) it2.next();
            timberyard timberyardVar = (timberyard) next;
            if (z3) {
                bool = boolImpromptu;
                if (!timberyardVar.saneness()) {
                    attabalVar = wireman(timberyardVar.getType().homozygous(), function2, iAttabal, z2);
                } else if (function2.invoke(Integer.valueOf(iAttabal)).wireman() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                    empress empressVarHomozygous = timberyardVar.getType().homozygous();
                    attabalVar = new attabal(KotlinTypeFactory.wireman(stratoscope.dern(empressVarHomozygous).lampshade(false), stratoscope.wireman(empressVarHomozygous).lampshade(true)), 1);
                } else {
                    attabalVar = new attabal(null, 1);
                }
            } else {
                bool = boolImpromptu;
                attabalVar = new attabal(oilcanVar, 0);
            }
            iAttabal += attabalVar.attabal();
            if (attabalVar.saneness() != null) {
                oilcan oilcanVarSaneness = attabalVar.saneness();
                Variance varianceDern = timberyardVar.dern();
                Intrinsics.checkNotNullExpressionValue(varianceDern, "getProjectionKind(...)");
                timberyardVarMolybdenite = TypeUtilsKt.beachfront(oilcanVarSaneness, varianceDern, clubfootVar);
            } else if (beachfrontVarBeachfront == null || timberyardVar.saneness()) {
                timberyardVarMolybdenite = beachfrontVarBeachfront != null ? nosophobia.molybdenite(clubfootVar) : null;
            } else {
                oilcan type = timberyardVar.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                Variance varianceDern2 = timberyardVar.dern();
                Intrinsics.checkNotNullExpressionValue(varianceDern2, "getProjectionKind(...)");
                timberyardVarMolybdenite = TypeUtilsKt.beachfront(type, varianceDern2, clubfootVar);
            }
            arrayList.add(timberyardVarMolybdenite);
            function2 = function1;
            boolImpromptu = bool;
            oilcanVar = null;
        }
        Boolean bool2 = boolImpromptu;
        int i2 = iAttabal - i;
        if (beachfrontVarBeachfront == null && bool2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((timberyard) it3.next()) == null);
            }
            return new saneness(null, i2, false);
        }
        marial annotations = mercVar.getAnnotations();
        p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.saneness sanenessVar = formularize.f30641saneness;
        if (beachfrontVarBeachfront == null) {
            sanenessVar = null;
        }
        overspeculate overspeculateVarSaneness = p002kotlin.reflect.jvm.internal.impl.types.clubfoot.saneness(formularize.marial(adultoid.monoploid(annotations, sanenessVar, bool2 != null ? formularize.competently() : null)));
        List<timberyard> listDhss2 = mercVar.dhss();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = listDhss2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(dovishness.gintrap(arrayList, 10), dovishness.gintrap(listDhss2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            timberyard timberyardVar2 = (timberyard) it5.next();
            timberyard timberyardVar3 = (timberyard) next2;
            if (timberyardVar3 != null) {
                timberyardVar2 = timberyardVar3;
            }
            arrayList2.add(timberyardVar2);
        }
        merc mercVarFormularize = KotlinTypeFactory.formularize(overspeculateVarSaneness, permissivistVar, arrayList2, bool2 != null ? bool2.booleanValue() : mercVar.mastfed(), null, 16, null);
        if (wiremanVarInvoke.saneness()) {
            mercVarFormularize = marial(mercVarFormularize);
        }
        return new saneness(mercVarFormularize, i2, bool2 != null && wiremanVarInvoke.marial());
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    public final attabal wireman(empress empressVar, Function1<? super Integer, wireman> function1, int i, boolean z) {
        oilcan oilcanVarDern;
        oilcan oilcanVarWireman = null;
        if (yemenite.attabal(empressVar)) {
            return new attabal(null, 1);
        }
        if (!(empressVar instanceof preprohormone)) {
            if (!(empressVar instanceof merc)) {
                throw new NoWhenBranchMatchedException();
            }
            saneness sanenessVarDern = dern(this, (merc) empressVar, function1, i, TypeComponentPosition.INFLEXIBLE, false, z, 8, null);
            return new attabal(sanenessVarDern.attabal() ? sayid.wireman(empressVar, sanenessVarDern.dern()) : sanenessVarDern.dern(), sanenessVarDern.saneness());
        }
        boolean z2 = empressVar instanceof restrictive;
        preprohormone preprohormoneVar = (preprohormone) empressVar;
        saneness sanenessVarSaneness = saneness(preprohormoneVar.sakeen(), function1, i, TypeComponentPosition.FLEXIBLE_LOWER, z2, z);
        saneness sanenessVarSaneness2 = saneness(preprohormoneVar.immediately(), function1, i, TypeComponentPosition.FLEXIBLE_UPPER, z2, z);
        sanenessVarSaneness.saneness();
        sanenessVarSaneness2.saneness();
        if (sanenessVarSaneness.dern() != null || sanenessVarSaneness2.dern() != null) {
            if (sanenessVarSaneness.attabal() || sanenessVarSaneness2.attabal()) {
                merc mercVarDern = sanenessVarSaneness2.dern();
                if (mercVarDern == null) {
                    oilcanVarDern = sanenessVarSaneness.dern();
                    Intrinsics.beachfront(oilcanVarDern);
                } else {
                    merc mercVarDern2 = sanenessVarSaneness.dern();
                    if (mercVarDern2 == null) {
                        mercVarDern2 = mercVarDern;
                    }
                    oilcanVarDern = KotlinTypeFactory.wireman(mercVarDern2, mercVarDern);
                    if (oilcanVarDern == null) {
                        oilcanVarDern = sanenessVarSaneness.dern();
                        Intrinsics.beachfront(oilcanVarDern);
                    }
                }
                oilcanVarWireman = sayid.wireman(empressVar, oilcanVarDern);
            } else if (z2) {
                merc mercVarDern3 = sanenessVarSaneness.dern();
                if (mercVarDern3 == null) {
                    mercVarDern3 = preprohormoneVar.sakeen();
                }
                merc mercVarDern4 = sanenessVarSaneness2.dern();
                if (mercVarDern4 == null) {
                    mercVarDern4 = preprohormoneVar.immediately();
                }
                oilcanVarWireman = new RawTypeImpl(mercVarDern3, mercVarDern4);
            } else {
                merc mercVarDern5 = sanenessVarSaneness.dern();
                if (mercVarDern5 == null) {
                    mercVarDern5 = preprohormoneVar.sakeen();
                }
                merc mercVarDern6 = sanenessVarSaneness2.dern();
                if (mercVarDern6 == null) {
                    mercVarDern6 = preprohormoneVar.immediately();
                }
                oilcanVarWireman = KotlinTypeFactory.wireman(mercVarDern5, mercVarDern6);
            }
        }
        return new attabal(oilcanVarWireman, sanenessVarSaneness.saneness());
    }
}
