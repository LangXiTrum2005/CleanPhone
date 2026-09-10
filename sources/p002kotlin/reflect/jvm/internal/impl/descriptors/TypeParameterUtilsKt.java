package p002kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.marial;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.sequences.Sequence;
import p002kotlin.sequences.SequencesKt___SequencesKt;
import prescient.competently;

/* JADX INFO: compiled from: typeParameterUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypeParameterUtilsKt {
    public static final seminary attabal(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        return saneness(oilcanVar, beachfrontVarWireman instanceof competently ? (competently) beachfrontVarWireman : null, 0);
    }

    public static final saneness dern(clubfoot clubfootVar, apical apicalVar, int i) {
        return new saneness(clubfootVar, apicalVar, i);
    }

    public static final seminary saneness(oilcan oilcanVar, competently competentlyVar, int i) {
        if (competentlyVar == null || competently.impassible(competentlyVar)) {
            return null;
        }
        int size = competentlyVar.triweekly().size() + i;
        if (competentlyVar.gintrap()) {
            List<timberyard> listSubList = oilcanVar.dhss().subList(i, size);
            apical apicalVarSaneness = competentlyVar.saneness();
            return new seminary(competentlyVar, listSubList, saneness(oilcanVar, apicalVarSaneness instanceof competently ? (competently) apicalVarSaneness : null, size));
        }
        if (size != oilcanVar.dhss().size()) {
            marial.yemenite(competentlyVar);
        }
        return new seminary(competentlyVar, oilcanVar.dhss().subList(i, oilcanVar.dhss().size()), null);
    }

    public static final List<clubfoot> wireman(competently competentlyVar) {
        List<clubfoot> listFormularize;
        apical next;
        permissivist permissivistVarImpromptu;
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        List<clubfoot> listTriweekly = competentlyVar.triweekly();
        Intrinsics.checkNotNullExpressionValue(listTriweekly, "getDeclaredTypeParameters(...)");
        if (!competentlyVar.gintrap() && !(competentlyVar.saneness() instanceof attabal)) {
            return listTriweekly;
        }
        List listHydrovane = SequencesKt___SequencesKt.hydrovane(SequencesKt___SequencesKt.oilcan(SequencesKt___SequencesKt.preprohormone(SequencesKt___SequencesKt.creditor(DescriptorUtilsKt.polloi(competentlyVar), new Function1<apical, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(apical it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it instanceof attabal);
            }
        }), new Function1<apical, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(apical it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!(it instanceof cutely));
            }
        }), new Function1<apical, Sequence<? extends clubfoot>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3
            @Override // p002kotlin.jvm.functions.Function1
            public final Sequence<clubfoot> invoke(apical it) {
                Intrinsics.checkNotNullParameter(it, "it");
                List<clubfoot> typeParameters = ((attabal) it).getTypeParameters();
                Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
                return CollectionsKt.clubfoot(typeParameters);
            }
        }));
        Iterator<apical> it = DescriptorUtilsKt.polloi(competentlyVar).iterator();
        do {
            listFormularize = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof wireman));
        wireman wiremanVar = (wireman) next;
        if (wiremanVar != null && (permissivistVarImpromptu = wiremanVar.impromptu()) != null) {
            listFormularize = permissivistVarImpromptu.getParameters();
        }
        if (listFormularize == null) {
            listFormularize = adultoid.formularize();
        }
        if (listHydrovane.isEmpty() && listFormularize.isEmpty()) {
            List<clubfoot> listTriweekly2 = competentlyVar.triweekly();
            Intrinsics.checkNotNullExpressionValue(listTriweekly2, "getDeclaredTypeParameters(...)");
            return listTriweekly2;
        }
        List<clubfoot> listUnconsolidated = CollectionsKt.unconsolidated(listHydrovane, listFormularize);
        ArrayList arrayList = new ArrayList(dovishness.gintrap(listUnconsolidated, 10));
        for (clubfoot clubfootVar : listUnconsolidated) {
            Intrinsics.beachfront(clubfootVar);
            arrayList.add(dern(clubfootVar, competentlyVar, listTriweekly.size()));
        }
        return CollectionsKt.unconsolidated(listTriweekly, arrayList);
    }
}
