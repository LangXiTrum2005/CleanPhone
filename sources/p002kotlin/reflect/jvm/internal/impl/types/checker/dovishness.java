package p002kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.cultivated;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dovishness {
    public static final oilcan attabal(oilcan oilcanVar) {
        return CapturedTypeApproximationKt.attabal(oilcanVar).wireman();
    }

    public static final StringBuilder dern(String str, StringBuilder sb) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        sb.append(str);
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return sb;
    }

    public static final String saneness(permissivist permissivistVar) {
        StringBuilder sb = new StringBuilder();
        dern("type: " + permissivistVar, sb);
        dern("hashCode: " + permissivistVar.hashCode(), sb);
        dern("javaClass: " + permissivistVar.getClass().getCanonicalName(), sb);
        for (apical apicalVarWireman = permissivistVar.wireman(); apicalVarWireman != null; apicalVarWireman = apicalVarWireman.saneness()) {
            dern("fqName: " + DescriptorRenderer.f31198competently.kowloon(apicalVarWireman), sb);
            dern("javaClass: " + apicalVarWireman.getClass().getCanonicalName(), sb);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final oilcan wireman(oilcan subtype, oilcan supertype, graveside typeCheckingProcedureCallbacks) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        Intrinsics.checkNotNullParameter(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new monoploid(subtype, null));
        permissivist permissivistVar = supertype.setterwort();
        while (!arrayDeque.isEmpty()) {
            monoploid monoploidVar = (monoploid) arrayDeque.poll();
            oilcan oilcanVarSaneness = monoploidVar.saneness();
            permissivist permissivistVar2 = oilcanVarSaneness.setterwort();
            if (typeCheckingProcedureCallbacks.attabal(permissivistVar2, permissivistVar)) {
                boolean zMastfed = oilcanVarSaneness.mastfed();
                for (monoploid monoploidVarAttabal = monoploidVar.attabal(); monoploidVarAttabal != null; monoploidVarAttabal = monoploidVarAttabal.attabal()) {
                    oilcan oilcanVarSaneness2 = monoploidVarAttabal.saneness();
                    List<timberyard> listDhss = oilcanVarSaneness2.dhss();
                    if (!(listDhss instanceof Collection) || !listDhss.isEmpty()) {
                        Iterator<T> it = listDhss.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                oilcanVarSaneness = cultivated.f31745dern.attabal(oilcanVarSaneness2).dern().triweekly(oilcanVarSaneness, Variance.INVARIANT);
                                Intrinsics.beachfront(oilcanVarSaneness);
                                break;
                            }
                            Variance varianceDern = ((timberyard) it.next()).dern();
                            Variance variance = Variance.INVARIANT;
                            if (varianceDern != variance) {
                                oilcan oilcanVarTriweekly = CapturedTypeConstructorKt.beachfront(cultivated.f31745dern.attabal(oilcanVarSaneness2), false, 1, null).dern().triweekly(oilcanVarSaneness, variance);
                                Intrinsics.checkNotNullExpressionValue(oilcanVarTriweekly, "safeSubstitute(...)");
                                oilcanVarSaneness = attabal(oilcanVarTriweekly);
                                break;
                            }
                        }
                    } else {
                        oilcanVarSaneness = cultivated.f31745dern.attabal(oilcanVarSaneness2).dern().triweekly(oilcanVarSaneness, Variance.INVARIANT);
                        Intrinsics.beachfront(oilcanVarSaneness);
                        break;
                    }
                    zMastfed = zMastfed || oilcanVarSaneness2.mastfed();
                }
                permissivist permissivistVar3 = oilcanVarSaneness.setterwort();
                if (typeCheckingProcedureCallbacks.attabal(permissivistVar3, permissivistVar)) {
                    return nosophobia.arytenoidectomy(oilcanVarSaneness, zMastfed);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + saneness(permissivistVar3) + ", \n\nsupertype: " + saneness(permissivistVar) + " \n" + typeCheckingProcedureCallbacks.attabal(permissivistVar3, permissivistVar));
            }
            for (oilcan oilcanVar : permissivistVar2.cutely()) {
                Intrinsics.beachfront(oilcanVar);
                arrayDeque.add(new monoploid(oilcanVar, monoploidVar));
            }
        }
        return null;
    }
}
