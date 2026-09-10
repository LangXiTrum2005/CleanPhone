package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.HashMap;
import java.util.List;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kattegat;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: DescriptorSubstitutor.java */
/* JADX INFO: loaded from: classes5.dex */
public class polloi {
    public static /* synthetic */ void attabal(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static TypeSubstitutor dern(List<clubfoot> list, itchy itchyVar, apical apicalVar, List<clubfoot> list2, boolean[] zArr) {
        if (list == null) {
            attabal(5);
        }
        if (itchyVar == null) {
            attabal(6);
        }
        if (apicalVar == null) {
            attabal(7);
        }
        if (list2 == null) {
            attabal(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int i = 0;
        for (clubfoot clubfootVar : list) {
            kattegat kattegatVarLampshade = kattegat.lampshade(apicalVar, clubfootVar.getAnnotations(), clubfootVar.graveside(), clubfootVar.cutely(), clubfootVar.getName(), i, walach.f30274attabal, clubfootVar.supplicat());
            map.put(clubfootVar.impromptu(), new treadless(kattegatVarLampshade.impassible()));
            map2.put(clubfootVar, kattegatVarLampshade);
            list2.add(kattegatVarLampshade);
            i++;
        }
        cultivated cultivatedVarCutely = cultivated.cutely(map);
        TypeSubstitutor typeSubstitutorImpromptu = TypeSubstitutor.impromptu(itchyVar, cultivatedVarCutely);
        TypeSubstitutor typeSubstitutorImpromptu2 = TypeSubstitutor.impromptu(itchyVar.impromptu(), cultivatedVarCutely);
        for (clubfoot clubfootVar2 : list) {
            kattegat kattegatVar = (kattegat) map2.get(clubfootVar2);
            for (oilcan oilcanVar : clubfootVar2.getUpperBounds()) {
                beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
                oilcan oilcanVarArytenoidectomy = (((beachfrontVarWireman instanceof clubfoot) && TypeUtilsKt.apical((clubfoot) beachfrontVarWireman)) ? typeSubstitutorImpromptu : typeSubstitutorImpromptu2).arytenoidectomy(oilcanVar, Variance.OUT_VARIANCE);
                if (oilcanVarArytenoidectomy == null) {
                    return null;
                }
                if (oilcanVarArytenoidectomy != oilcanVar && zArr != null) {
                    zArr[0] = true;
                }
                kattegatVar.setterwort(oilcanVarArytenoidectomy);
            }
            kattegatVar.immediately();
        }
        return typeSubstitutorImpromptu;
    }

    public static TypeSubstitutor saneness(List<clubfoot> list, itchy itchyVar, apical apicalVar, List<clubfoot> list2) {
        if (list == null) {
            attabal(0);
        }
        if (itchyVar == null) {
            attabal(1);
        }
        if (apicalVar == null) {
            attabal(2);
        }
        if (list2 == null) {
            attabal(3);
        }
        TypeSubstitutor typeSubstitutorDern = dern(list, itchyVar, apicalVar, list2, null);
        if (typeSubstitutorDern != null) {
            return typeSubstitutorDern;
        }
        throw new AssertionError("Substitution failed");
    }
}
