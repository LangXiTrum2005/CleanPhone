package p002kotlin.reflect.jvm.internal.impl.builtins;

import byname.dern;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lyreflower.attabal;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polder;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.formularize;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.graveside;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: functionTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class marial {
    public static final p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial adultoid(p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, beachfront builtIns) {
        Intrinsics.checkNotNullParameter(marialVar, "<this>");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        dern dernVar = competently.attabal.f29774trm;
        return marialVar.restrictive(dernVar) ? marialVar : p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.attabal(CollectionsKt.achondroplasia(marialVar, new BuiltInAnnotationDescriptor(builtIns, dernVar, seminary.taiyuan(), false, 8, null)));
    }

    public static final oilcan apical(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        arytenoidectomy(oilcanVar);
        if (!molybdenite(oilcanVar)) {
            return null;
        }
        return oilcanVar.dhss().get(attabal(oilcanVar)).getType();
    }

    public static final boolean arytenoidectomy(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        return beachfrontVarWireman != null && kowloon(beachfrontVarWireman);
    }

    public static final int attabal(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern dernVarAttabal = oilcanVar.getAnnotations().attabal(competently.attabal.f29743oilcan);
        if (dernVarAttabal == null) {
            return 0;
        }
        competently competentlyVar = (competently) seminary.cutely(dernVarAttabal.attabal(), competently.f29676kowloon);
        Intrinsics.competently(competentlyVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((formularize) competentlyVar).saneness().intValue();
    }

    public static final wireman beachfront(beachfront builtIns, int i, boolean z) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        wireman wiremanVarClubfoot = z ? builtIns.clubfoot(i) : builtIns.trm(i);
        Intrinsics.beachfront(wiremanVarClubfoot);
        return wiremanVarClubfoot;
    }

    public static final List<timberyard> competently(oilcan oilcanVar, List<? extends oilcan> contextReceiverTypes, List<? extends oilcan> parameterTypes, List<byname.marial> list, oilcan returnType, beachfront builtIns) {
        byname.marial marialVar;
        beachfront beachfrontVar;
        Intrinsics.checkNotNullParameter(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        int i = 0;
        ArrayList arrayList = new ArrayList(parameterTypes.size() + contextReceiverTypes.size() + (oilcanVar != null ? 1 : 0) + 1);
        List<? extends oilcan> list2 = contextReceiverTypes;
        ArrayList arrayList2 = new ArrayList(dovishness.gintrap(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(TypeUtilsKt.attabal((oilcan) it.next()));
        }
        arrayList.addAll(arrayList2);
        attabal.attabal(arrayList, oilcanVar != null ? TypeUtilsKt.attabal(oilcanVar) : null);
        for (Object obj : parameterTypes) {
            int i2 = i + 1;
            if (i < 0) {
                adultoid.dovishness();
            }
            oilcan oilcanVarRotuma = (oilcan) obj;
            if (list == null || (marialVar = list.get(i)) == null || marialVar.apical()) {
                marialVar = null;
            }
            if (marialVar != null) {
                dern dernVar = competently.attabal.f29781yemenite;
                byname.marial marialVar2 = competently.f29661apical;
                String strDern = marialVar.dern();
                Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
                Map mapBeachfront = polder.beachfront(patroclinal.formularize.attabal(marialVar2, new graveside(strDern)));
                beachfrontVar = builtIns;
                oilcanVarRotuma = TypeUtilsKt.rotuma(oilcanVarRotuma, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.attabal(CollectionsKt.achondroplasia(oilcanVarRotuma.getAnnotations(), new BuiltInAnnotationDescriptor(beachfrontVar, dernVar, mapBeachfront, false, 8, null))));
            } else {
                beachfrontVar = builtIns;
            }
            arrayList.add(TypeUtilsKt.attabal(oilcanVarRotuma));
            i = i2;
            builtIns = beachfrontVar;
        }
        arrayList.add(TypeUtilsKt.attabal(returnType));
        return arrayList;
    }

    public static final p002kotlin.reflect.jvm.internal.impl.builtins.functions.marial cutely(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        if (beachfrontVarWireman != null) {
            return taiyuan(beachfrontVarWireman);
        }
        return null;
    }

    public static final oilcan formularize(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        arytenoidectomy(oilcanVar);
        oilcan type = ((timberyard) CollectionsKt.igbo(oilcanVar.dhss())).getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    public static final p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial graveside(p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, beachfront builtIns, int i) {
        Intrinsics.checkNotNullParameter(marialVar, "<this>");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        dern dernVar = competently.attabal.f29743oilcan;
        return marialVar.restrictive(dernVar) ? marialVar : p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.attabal(CollectionsKt.achondroplasia(marialVar, new BuiltInAnnotationDescriptor(builtIns, dernVar, polder.beachfront(patroclinal.formularize.attabal(competently.f29676kowloon, new formularize(i))), false, 8, null)));
    }

    public static final List<timberyard> impassible(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        arytenoidectomy(oilcanVar);
        List<timberyard> listDhss = oilcanVar.dhss();
        return listDhss.subList(attabal(oilcanVar) + (triweekly(oilcanVar) ? 1 : 0), listDhss.size() - 1);
    }

    public static final p002kotlin.reflect.jvm.internal.impl.builtins.functions.marial impromptu(byname.wireman wiremanVar) {
        if (!wiremanVar.beachfront() || wiremanVar.marial()) {
            return null;
        }
        p002kotlin.reflect.jvm.internal.impl.builtins.functions.beachfront beachfrontVarAttabal = p002kotlin.reflect.jvm.internal.impl.builtins.functions.beachfront.f29786dern.attabal();
        dern dernVarMarial = wiremanVar.formularize().marial();
        Intrinsics.checkNotNullExpressionValue(dernVarMarial, "parent(...)");
        String strDern = wiremanVar.taiyuan().dern();
        Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
        return beachfrontVarAttabal.saneness(dernVarMarial, strDern);
    }

    public static final boolean kowloon(apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<this>");
        p002kotlin.reflect.jvm.internal.impl.builtins.functions.marial marialVarTaiyuan = taiyuan(apicalVar);
        return Intrinsics.wireman(marialVarTaiyuan, kotlin.reflect.jvm.internal.impl.builtins.functions.marial.attabal.f29796marial) || Intrinsics.wireman(marialVarTaiyuan, kotlin.reflect.jvm.internal.impl.builtins.functions.marial.wireman.f29799marial);
    }

    public static final List<oilcan> marial(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        arytenoidectomy(oilcanVar);
        int iAttabal = attabal(oilcanVar);
        if (iAttabal == 0) {
            return adultoid.formularize();
        }
        List<timberyard> listSubList = oilcanVar.dhss().subList(0, iAttabal);
        ArrayList arrayList = new ArrayList(dovishness.gintrap(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            oilcan type = ((timberyard) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            arrayList.add(type);
        }
        return arrayList;
    }

    public static final boolean molybdenite(oilcan oilcanVar) {
        return oilcanVar.getAnnotations().attabal(competently.attabal.f29774trm) != null;
    }

    public static final boolean monoploid(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        return Intrinsics.wireman(cutely(oilcanVar), kotlin.reflect.jvm.internal.impl.builtins.functions.marial.attabal.f29796marial);
    }

    public static final boolean polloi(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        return Intrinsics.wireman(cutely(oilcanVar), kotlin.reflect.jvm.internal.impl.builtins.functions.marial.wireman.f29799marial);
    }

    public static final merc saneness(beachfront builtIns, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial annotations, oilcan oilcanVar, List<? extends oilcan> contextReceiverTypes, List<? extends oilcan> parameterTypes, List<byname.marial> list, oilcan returnType, boolean z) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        List<timberyard> listCompetently = competently(oilcanVar, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        wireman wiremanVarBeachfront = beachfront(builtIns, parameterTypes.size() + contextReceiverTypes.size() + (oilcanVar == null ? 0 : 1), z);
        if (oilcanVar != null) {
            annotations = adultoid(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = graveside(annotations, builtIns, contextReceiverTypes.size());
        }
        return KotlinTypeFactory.competently(clubfoot.saneness(annotations), wiremanVarBeachfront, listCompetently);
    }

    public static final p002kotlin.reflect.jvm.internal.impl.builtins.functions.marial taiyuan(apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<this>");
        if ((apicalVar instanceof wireman) && beachfront.claque(apicalVar)) {
            return impromptu(DescriptorUtilsKt.impassible(apicalVar));
        }
        return null;
    }

    public static final boolean triweekly(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        return arytenoidectomy(oilcanVar) && molybdenite(oilcanVar);
    }

    public static final byname.marial wireman(oilcan oilcanVar) {
        String strSaneness;
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern dernVarAttabal = oilcanVar.getAnnotations().attabal(competently.attabal.f29781yemenite);
        if (dernVarAttabal == null) {
            return null;
        }
        Object objTechnofreak = CollectionsKt.technofreak(dernVarAttabal.attabal().values());
        graveside gravesideVar = objTechnofreak instanceof graveside ? (graveside) objTechnofreak : null;
        if (gravesideVar != null && (strSaneness = gravesideVar.saneness()) != null) {
            if (!byname.marial.formularize(strSaneness)) {
                strSaneness = null;
            }
            if (strSaneness != null) {
                return byname.marial.cutely(strSaneness);
            }
        }
        return null;
    }
}
