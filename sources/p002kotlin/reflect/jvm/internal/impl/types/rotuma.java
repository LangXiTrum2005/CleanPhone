package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.HashSet;
import p002kotlin.jvm.internal.Intrinsics;
import presbytery.apical;
import presbytery.competently;
import presbytery.formularize;
import presbytery.impromptu;

/* JADX INFO: compiled from: expandedTypeUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class rotuma {
    public static final competently attabal(lerp lerpVar, competently inlineClassType) {
        Intrinsics.checkNotNullParameter(lerpVar, "<this>");
        Intrinsics.checkNotNullParameter(inlineClassType, "inlineClassType");
        return saneness(lerpVar, inlineClassType, new HashSet());
    }

    public static final competently saneness(lerp lerpVar, competently competentlyVar, HashSet<apical> hashSet) {
        competently competentlyVarSaneness;
        apical apicalVarNosophobia = lerpVar.nosophobia(competentlyVar);
        if (!hashSet.add(apicalVarNosophobia)) {
            return null;
        }
        formularize formularizeVarPalmyra = lerpVar.palmyra(apicalVarNosophobia);
        if (formularizeVarPalmyra != null) {
            competently competentlyVarImpassible = lerpVar.impassible(formularizeVarPalmyra);
            competently competentlyVarSaneness2 = saneness(lerpVar, competentlyVarImpassible, hashSet);
            if (competentlyVarSaneness2 == null) {
                return null;
            }
            boolean z = lerpVar.molybdenite(lerpVar.nosophobia(competentlyVarImpassible)) || ((competentlyVarImpassible instanceof impromptu) && lerpVar.achondroplasia((impromptu) competentlyVarImpassible));
            if ((competentlyVarSaneness2 instanceof impromptu) && lerpVar.achondroplasia((impromptu) competentlyVarSaneness2) && lerpVar.picketboat(competentlyVar) && z) {
                return lerpVar.arytenoidectomy(competentlyVarImpassible);
            }
            return (lerpVar.picketboat(competentlyVarSaneness2) || !lerpVar.walach(competentlyVar)) ? competentlyVarSaneness2 : lerpVar.arytenoidectomy(competentlyVarSaneness2);
        }
        if (lerpVar.molybdenite(apicalVarNosophobia)) {
            competently competentlyVarMilliradian = lerpVar.milliradian(competentlyVar);
            if (competentlyVarMilliradian == null || (competentlyVarSaneness = saneness(lerpVar, competentlyVarMilliradian, hashSet)) == null) {
                return null;
            }
            if (!lerpVar.picketboat(competentlyVar)) {
                return competentlyVarSaneness;
            }
            if (!lerpVar.picketboat(competentlyVarSaneness) && (!(competentlyVarSaneness instanceof impromptu) || !lerpVar.achondroplasia((impromptu) competentlyVarSaneness))) {
                return lerpVar.arytenoidectomy(competentlyVarSaneness);
            }
        }
        return competentlyVar;
    }
}
