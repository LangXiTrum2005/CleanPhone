package p002kotlin.reflect.jvm.internal.impl.types;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.checker.formularize;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import prescient.competently;
import prescient.marial;

/* JADX INFO: compiled from: TypeUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class nosophobia {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final merc f31792attabal = competently.wireman(ErrorTypeKind.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final merc f31794saneness = competently.wireman(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final merc f31793dern = new attabal("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final merc f31795wireman = new attabal("UNIT_EXPECTED_TYPE");

    /* JADX INFO: compiled from: TypeUtils.java */
    public static class attabal extends arytenoidectomy {
        private final String name;

        public attabal(String str) {
            this.name = str;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0030  */
        private static /* synthetic */ void prefect(int i) {
            String str = (i == 1 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else if (i == 2) {
                objArr[0] = "delegate";
            } else if (i == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i != 4) {
                objArr[0] = "newAttributes";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
            if (i == 1) {
                objArr[1] = "toString";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i != 1) {
                if (i == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i == 3) {
                    objArr[2] = "refine";
                } else if (i != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy
        public merc immediately() {
            throw new IllegalStateException(this.name);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
        /* JADX INFO: renamed from: molet */
        public merc lampshade(boolean z) {
            throw new IllegalStateException(this.name);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy, p002kotlin.reflect.jvm.internal.impl.types.empress
        /* JADX INFO: renamed from: osteal, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public attabal libyan(beachfront beachfrontVar) {
            if (beachfrontVar == null) {
                prefect(3);
            }
            return this;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.empress
        /* JADX INFO: renamed from: sakeen */
        public merc deadwork(overspeculate overspeculateVar) {
            if (overspeculateVar == null) {
                prefect(0);
            }
            throw new IllegalStateException(this.name);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.arytenoidectomy
        public arytenoidectomy tectonization(merc mercVar) {
            if (mercVar == null) {
                prefect(2);
            }
            throw new IllegalStateException(this.name);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.merc
        public String toString() {
            String str = this.name;
            if (str == null) {
                prefect(1);
            }
            return str;
        }
    }

    public static merc adultoid(p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVar, MemberScope memberScope, Function1<beachfront, merc> function1) {
        if (!competently.impassible(beachfrontVar)) {
            return dovishness(beachfrontVar.impromptu(), memberScope, function1);
        }
        marial marialVarWireman = competently.wireman(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, beachfrontVar.toString());
        if (marialVarWireman == null) {
            attabal(11);
        }
        return marialVarWireman;
    }

    public static boolean apical(oilcan oilcanVar) {
        return oilcanVar != null && oilcanVar.setterwort() == f31792attabal.setterwort();
    }

    public static oilcan arytenoidectomy(oilcan oilcanVar, boolean z) {
        if (oilcanVar == null) {
            attabal(3);
        }
        empress empressVarLampshade = oilcanVar.homozygous().lampshade(z);
        if (empressVarLampshade == null) {
            attabal(4);
        }
        return empressVarLampshade;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x011c  */
    public static /* synthetic */ void attabal(int i) {
        String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B;
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i == 11 || i == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i != 53) {
            if (i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static wireman beachfront(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(30);
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        if (beachfrontVarWireman instanceof wireman) {
            return (wireman) beachfrontVarWireman;
        }
        return null;
    }

    public static List<timberyard> competently(List<clubfoot> list) {
        if (list == null) {
            attabal(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<clubfoot> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new treadless(it.next().impassible()));
        }
        List<timberyard> listMolet = CollectionsKt.molet(arrayList);
        if (listMolet == null) {
            attabal(17);
        }
        return listMolet;
    }

    public static boolean cutely(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(29);
        }
        if (oilcanVar.setterwort().wireman() instanceof wireman) {
            return false;
        }
        Iterator<oilcan> it = impromptu(oilcanVar).iterator();
        while (it.hasNext()) {
            if (formularize(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean dern(oilcan oilcanVar, Function1<empress, Boolean> function1) {
        if (function1 == null) {
            attabal(43);
        }
        return wireman(oilcanVar, function1, null);
    }

    public static merc dovishness(permissivist permissivistVar, MemberScope memberScope, Function1<beachfront, merc> function1) {
        if (permissivistVar == null) {
            attabal(12);
        }
        if (memberScope == null) {
            attabal(13);
        }
        if (function1 == null) {
            attabal(14);
        }
        merc mercVarTriweekly = KotlinTypeFactory.triweekly(overspeculate.f31797arytenoidectomy.taiyuan(), permissivistVar, competently(permissivistVar.getParameters()), false, memberScope, function1);
        if (mercVarTriweekly == null) {
            attabal(15);
        }
        return mercVarTriweekly;
    }

    public static boolean formularize(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(27);
        }
        if (oilcanVar.mastfed()) {
            return true;
        }
        if (stratoscope.saneness(oilcanVar) && formularize(stratoscope.attabal(oilcanVar).immediately())) {
            return true;
        }
        if (saran.dern(oilcanVar)) {
            return false;
        }
        if (impassible(oilcanVar)) {
            return cutely(oilcanVar);
        }
        if (oilcanVar instanceof marial) {
            clubfoot clubfootVarSaneness = ((marial) oilcanVar).immediately().saneness();
            return clubfootVarSaneness == null || cutely(clubfootVarSaneness.impassible());
        }
        permissivist permissivistVar = oilcanVar.setterwort();
        if (permissivistVar instanceof IntersectionTypeConstructor) {
            Iterator<oilcan> it = permissivistVar.cutely().iterator();
            while (it.hasNext()) {
                if (formularize(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean gintrap(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(0);
        }
        return oilcanVar == f31793dern || oilcanVar == f31795wireman;
    }

    public static timberyard graveside(clubfoot clubfootVar, gintrap gintrapVar) {
        if (clubfootVar == null) {
            attabal(46);
        }
        return gintrapVar.saneness() == TypeUsage.SUPERTYPE ? new treadless(creditor.saneness(clubfootVar)) : new StarProjectionImpl(clubfootVar);
    }

    public static boolean impassible(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(60);
        }
        return taiyuan(oilcanVar) != null || (oilcanVar.setterwort() instanceof formularize);
    }

    public static List<oilcan> impromptu(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(18);
        }
        TypeSubstitutor typeSubstitutorBeachfront = TypeSubstitutor.beachfront(oilcanVar);
        Collection<oilcan> collectionCutely = oilcanVar.setterwort().cutely();
        ArrayList arrayList = new ArrayList(collectionCutely.size());
        Iterator<oilcan> it = collectionCutely.iterator();
        while (it.hasNext()) {
            oilcan oilcanVarMarial = marial(oilcanVar, it.next(), typeSubstitutorBeachfront);
            if (oilcanVarMarial != null) {
                arrayList.add(oilcanVarMarial);
            }
        }
        return arrayList;
    }

    public static oilcan kowloon(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(1);
        }
        return arytenoidectomy(oilcanVar, true);
    }

    public static oilcan marial(oilcan oilcanVar, oilcan oilcanVar2, TypeSubstitutor typeSubstitutor) {
        if (oilcanVar == null) {
            attabal(20);
        }
        if (oilcanVar2 == null) {
            attabal(21);
        }
        if (typeSubstitutor == null) {
            attabal(22);
        }
        oilcan oilcanVarArytenoidectomy = typeSubstitutor.arytenoidectomy(oilcanVar2, Variance.INVARIANT);
        if (oilcanVarArytenoidectomy != null) {
            return monoploid(oilcanVarArytenoidectomy, oilcanVar.mastfed());
        }
        return null;
    }

    public static timberyard molybdenite(clubfoot clubfootVar) {
        if (clubfootVar == null) {
            attabal(45);
        }
        return new StarProjectionImpl(clubfootVar);
    }

    public static oilcan monoploid(oilcan oilcanVar, boolean z) {
        if (oilcanVar == null) {
            attabal(8);
        }
        if (z) {
            return kowloon(oilcanVar);
        }
        if (oilcanVar == null) {
            attabal(9);
        }
        return oilcanVar;
    }

    public static merc polloi(merc mercVar, boolean z) {
        if (mercVar == null) {
            attabal(5);
        }
        if (!z) {
            if (mercVar == null) {
                attabal(7);
            }
            return mercVar;
        }
        merc mercVarLampshade = mercVar.lampshade(true);
        if (mercVarLampshade == null) {
            attabal(6);
        }
        return mercVarLampshade;
    }

    public static boolean saneness(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(28);
        }
        if (oilcanVar.mastfed()) {
            return true;
        }
        return stratoscope.saneness(oilcanVar) && saneness(stratoscope.attabal(oilcanVar).immediately());
    }

    public static clubfoot taiyuan(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(63);
        }
        if (oilcanVar.setterwort().wireman() instanceof clubfoot) {
            return (clubfoot) oilcanVar.setterwort().wireman();
        }
        return null;
    }

    public static oilcan triweekly(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(2);
        }
        return arytenoidectomy(oilcanVar, false);
    }

    public static boolean wireman(oilcan oilcanVar, Function1<empress, Boolean> function1, lyreflower.beachfront<oilcan> beachfrontVar) {
        if (function1 == null) {
            attabal(44);
        }
        if (oilcanVar == null) {
            return false;
        }
        empress empressVarHomozygous = oilcanVar.homozygous();
        if (gintrap(oilcanVar)) {
            return function1.invoke(empressVarHomozygous).booleanValue();
        }
        if (beachfrontVar != null && beachfrontVar.contains(oilcanVar)) {
            return false;
        }
        if (function1.invoke(empressVarHomozygous).booleanValue()) {
            return true;
        }
        if (beachfrontVar == null) {
            beachfrontVar = lyreflower.beachfront.saneness();
        }
        beachfrontVar.add(oilcanVar);
        preprohormone preprohormoneVar = empressVarHomozygous instanceof preprohormone ? (preprohormone) empressVarHomozygous : null;
        if (preprohormoneVar != null && (wireman(preprohormoneVar.sakeen(), function1, beachfrontVar) || wireman(preprohormoneVar.immediately(), function1, beachfrontVar))) {
            return true;
        }
        if ((empressVarHomozygous instanceof triweekly) && wireman(((triweekly) empressVarHomozygous).prefect(), function1, beachfrontVar)) {
            return true;
        }
        permissivist permissivistVar = oilcanVar.setterwort();
        if (permissivistVar instanceof IntersectionTypeConstructor) {
            Iterator<oilcan> it = ((IntersectionTypeConstructor) permissivistVar).cutely().iterator();
            while (it.hasNext()) {
                if (wireman(it.next(), function1, beachfrontVar)) {
                    return true;
                }
            }
            return false;
        }
        for (timberyard timberyardVar : oilcanVar.dhss()) {
            if (!timberyardVar.saneness() && wireman(timberyardVar.getType(), function1, beachfrontVar)) {
                return true;
            }
        }
        return false;
    }
}
