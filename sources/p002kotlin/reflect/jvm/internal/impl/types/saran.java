package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.checker.impromptu;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class saran {
    public static final impromptu apical(impromptu impromptuVar) {
        Intrinsics.checkNotNullParameter(impromptuVar, "<this>");
        return new impromptu(impromptuVar.immediately(), impromptuVar.setterwort(), impromptuVar.tectonization(), impromptuVar.vesuvio(), impromptuVar.mastfed(), true);
    }

    public static final attabal attabal(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        empress empressVarHomozygous = oilcanVar.homozygous();
        if (empressVarHomozygous instanceof attabal) {
            return (attabal) empressVarHomozygous;
        }
        return null;
    }

    public static /* synthetic */ empress beachfront(empress empressVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return marial(empressVar, z);
    }

    public static final merc competently(oilcan oilcanVar) {
        IntersectionTypeConstructor intersectionTypeConstructorWireman;
        permissivist permissivistVar = oilcanVar.setterwort();
        IntersectionTypeConstructor intersectionTypeConstructor = permissivistVar instanceof IntersectionTypeConstructor ? (IntersectionTypeConstructor) permissivistVar : null;
        if (intersectionTypeConstructor == null || (intersectionTypeConstructorWireman = wireman(intersectionTypeConstructor)) == null) {
            return null;
        }
        return intersectionTypeConstructorWireman.competently();
    }

    public static final merc cutely(merc mercVar, merc abbreviatedType) {
        Intrinsics.checkNotNullParameter(mercVar, "<this>");
        Intrinsics.checkNotNullParameter(abbreviatedType, "abbreviatedType");
        return yemenite.attabal(mercVar) ? mercVar : new attabal(mercVar, abbreviatedType);
    }

    public static final boolean dern(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        return oilcanVar.homozygous() instanceof triweekly;
    }

    public static final merc impromptu(merc mercVar, boolean z) {
        Intrinsics.checkNotNullParameter(mercVar, "<this>");
        triweekly triweeklyVarDern = triweekly.attabal.dern(triweekly.f31815polloi, mercVar, z, false, 4, null);
        if (triweeklyVarDern != null) {
            return triweeklyVarDern;
        }
        merc mercVarCompetently = competently(mercVar);
        return mercVarCompetently == null ? mercVar.lampshade(false) : mercVarCompetently;
    }

    public static final empress marial(empress empressVar, boolean z) {
        Intrinsics.checkNotNullParameter(empressVar, "<this>");
        triweekly triweeklyVarDern = triweekly.attabal.dern(triweekly.f31815polloi, empressVar, z, false, 4, null);
        if (triweeklyVarDern != null) {
            return triweeklyVarDern;
        }
        merc mercVarCompetently = competently(empressVar);
        return mercVarCompetently != null ? mercVarCompetently : empressVar.lampshade(false);
    }

    public static final merc saneness(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        attabal attabalVarAttabal = attabal(oilcanVar);
        if (attabalVarAttabal != null) {
            return attabalVarAttabal.prefect();
        }
        return null;
    }

    public static /* synthetic */ merc taiyuan(merc mercVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return impromptu(mercVar, z);
    }

    public static final IntersectionTypeConstructor wireman(IntersectionTypeConstructor intersectionTypeConstructor) {
        oilcan oilcanVar;
        Collection<oilcan> collectionCutely = intersectionTypeConstructor.cutely();
        ArrayList arrayList = new ArrayList(dovishness.gintrap(collectionCutely, 10));
        Iterator<T> it = collectionCutely.iterator();
        boolean z = false;
        while (true) {
            oilcanVar = null;
            if (!it.hasNext()) {
                break;
            }
            oilcan oilcanVarBeachfront = (oilcan) it.next();
            if (nosophobia.formularize(oilcanVarBeachfront)) {
                oilcanVarBeachfront = beachfront(oilcanVarBeachfront.homozygous(), false, 1, null);
                z = true;
            }
            arrayList.add(oilcanVarBeachfront);
        }
        if (!z) {
            return null;
        }
        oilcan oilcanVarImpromptu = intersectionTypeConstructor.impromptu();
        if (oilcanVarImpromptu != null) {
            if (nosophobia.formularize(oilcanVarImpromptu)) {
                oilcanVarImpromptu = beachfront(oilcanVarImpromptu.homozygous(), false, 1, null);
            }
            oilcanVar = oilcanVarImpromptu;
        }
        return new IntersectionTypeConstructor(arrayList).triweekly(oilcanVar);
    }
}
