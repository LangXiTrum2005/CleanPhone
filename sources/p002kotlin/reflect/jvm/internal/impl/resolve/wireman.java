package p002kotlin.reflect.jvm.internal.impl.resolve;

import byname.beachfront;
import java.util.Collections;
import java.util.List;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cord;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cuirassed;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.oilcan;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.stratoscope;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.treadless;
import snook.dern;
import snook.saneness;

/* JADX INFO: compiled from: DescriptorFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public class wireman {

    /* JADX INFO: compiled from: DescriptorFactory.java */
    public static class attabal extends marial {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar, walach walachVar, boolean z) {
            super(wiremanVar, null, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness(), true, CallableMemberDescriptor.Kind.DECLARATION, walachVar);
            if (wiremanVar == null) {
                timberyard(0);
            }
            if (walachVar == null) {
                timberyard(1);
            }
            twybill(Collections.EMPTY_LIST, marial.apical(wiremanVar, z));
        }

        private static /* synthetic */ void timberyard(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public static cuirassed apical(saran saranVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, boolean z, boolean z2, boolean z3, walach walachVar) {
        if (saranVar == null) {
            attabal(17);
        }
        if (marialVar == null) {
            attabal(18);
        }
        if (walachVar == null) {
            attabal(19);
        }
        return new cuirassed(saranVar, marialVar, saranVar.kowloon(), saranVar.getVisibility(), z, z2, z3, CallableMemberDescriptor.Kind.DECLARATION, null, walachVar);
    }

    public static boolean arytenoidectomy(dovishness dovishnessVar) {
        if (dovishnessVar == null) {
            attabal(28);
        }
        return dovishnessVar.getName().equals(competently.f29664beachfront) && kowloon(dovishnessVar);
    }

    public static /* synthetic */ void attabal(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static saran beachfront(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        if (wiremanVar == null) {
            attabal(26);
        }
        trm trmVarCompetently = marial.competently(wiremanVar);
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarAttabal = kowloon.attabal(trmVarCompetently).attabal(trmVarCompetently);
        if (wiremanVarAttabal == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.attabal attabalVar = p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu;
        p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVarSaneness = attabalVar.saneness();
        Modality modality = Modality.FINAL;
        molybdenite molybdeniteVar = polloi.f30212marial;
        byname.marial marialVar = competently.f29677marial;
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.SYNTHESIZED;
        cord cordVarHomozygous = cord.homozygous(wiremanVar, marialVarSaneness, modality, molybdeniteVar, false, marialVar, kind, wiremanVar.competently(), false, false, false, false, false, false);
        cuirassed cuirassedVar = new cuirassed(cordVarHomozygous, attabalVar.saneness(), modality, molybdeniteVar, false, false, false, kind, null, wiremanVar.competently());
        cordVarHomozygous.immediately(cuirassedVar, null);
        merc mercVarTaiyuan = KotlinTypeFactory.taiyuan(overspeculate.f31797arytenoidectomy.taiyuan(), wiremanVarAttabal.impromptu(), Collections.singletonList(new treadless(wiremanVar.impassible())), false);
        List<? extends clubfoot> list = Collections.EMPTY_LIST;
        cordVarHomozygous.fastrack(mercVarTaiyuan, list, null, null, list);
        cuirassedVar.lampshade(cordVarHomozygous.getReturnType());
        return cordVarHomozygous;
    }

    public static hydrovane competently(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        if (wiremanVar == null) {
            attabal(24);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.attabal attabalVar = p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu;
        oilcan oilcanVarLibya = oilcan.libya(wiremanVar, attabalVar.saneness(), competently.f29664beachfront, CallableMemberDescriptor.Kind.SYNTHESIZED, wiremanVar.competently());
        ValueParameterDescriptorImpl valueParameterDescriptorImpl = new ValueParameterDescriptorImpl(oilcanVarLibya, null, 0, attabalVar.saneness(), byname.marial.cutely("value"), DescriptorUtilsKt.cutely(wiremanVar).overspeculate(), false, false, false, null, wiremanVar.competently());
        List<starveling> list = Collections.EMPTY_LIST;
        oilcan oilcanVarTailoring = oilcanVarLibya.libyan(null, null, list, list, Collections.singletonList(valueParameterDescriptorImpl), wiremanVar.impassible(), Modality.FINAL, polloi.f30212marial);
        if (oilcanVarTailoring == null) {
            attabal(25);
        }
        return oilcanVarTailoring;
    }

    public static cuirassed cutely(saran saranVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, boolean z, boolean z2, boolean z3) {
        if (saranVar == null) {
            attabal(15);
        }
        if (marialVar == null) {
            attabal(16);
        }
        return apical(saranVar, marialVar, z, z2, z3, saranVar.competently());
    }

    public static starveling dern(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar, p002kotlin.reflect.jvm.internal.impl.types.oilcan oilcanVar, byname.marial marialVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar2, int i) {
        if (wiremanVar == null) {
            attabal(34);
        }
        if (marialVar2 == null) {
            attabal(35);
        }
        if (oilcanVar == null) {
            return null;
        }
        return new p002kotlin.reflect.jvm.internal.impl.descriptors.impl.trm(wiremanVar, new saneness(wiremanVar, oilcanVar, marialVar, null), marialVar2, beachfront.attabal(i));
    }

    public static marial formularize(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar, walach walachVar) {
        if (wiremanVar == null) {
            attabal(20);
        }
        if (walachVar == null) {
            attabal(21);
        }
        return new attabal(wiremanVar, walachVar, false);
    }

    public static stratoscope impassible(saran saranVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar2, boolean z, boolean z2, boolean z3, molybdenite molybdeniteVar, walach walachVar) {
        if (saranVar == null) {
            attabal(7);
        }
        if (marialVar == null) {
            attabal(8);
        }
        if (marialVar2 == null) {
            attabal(9);
        }
        if (molybdeniteVar == null) {
            attabal(10);
        }
        if (walachVar == null) {
            attabal(11);
        }
        stratoscope stratoscopeVar = new stratoscope(saranVar, marialVar, saranVar.kowloon(), molybdeniteVar, z, z2, z3, CallableMemberDescriptor.Kind.DECLARATION, null, walachVar);
        stratoscopeVar.libyan(stratoscope.homozygous(stratoscopeVar, saranVar.getType(), marialVar2));
        return stratoscopeVar;
    }

    public static hydrovane impromptu(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        if (wiremanVar == null) {
            attabal(22);
        }
        oilcan oilcanVarLibya = oilcan.libya(wiremanVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness(), competently.f29690wireman, CallableMemberDescriptor.Kind.SYNTHESIZED, wiremanVar.competently());
        List<starveling> list = Collections.EMPTY_LIST;
        oilcan oilcanVarTailoring = oilcanVarLibya.libyan(null, null, list, list, list, DescriptorUtilsKt.cutely(wiremanVar).formularize(Variance.INVARIANT, wiremanVar.impassible()), Modality.FINAL, polloi.f30212marial);
        if (oilcanVarTailoring == null) {
            attabal(23);
        }
        return oilcanVarTailoring;
    }

    public static boolean kowloon(dovishness dovishnessVar) {
        if (dovishnessVar == null) {
            attabal(29);
        }
        return dovishnessVar.getKind() == CallableMemberDescriptor.Kind.SYNTHESIZED && marial.cuirassed(dovishnessVar.saneness());
    }

    public static stratoscope marial(saran saranVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar2) {
        if (saranVar == null) {
            attabal(0);
        }
        if (marialVar == null) {
            attabal(1);
        }
        if (marialVar2 == null) {
            attabal(2);
        }
        return triweekly(saranVar, marialVar, marialVar2, true, false, false, saranVar.competently());
    }

    public static boolean monoploid(dovishness dovishnessVar) {
        if (dovishnessVar == null) {
            attabal(27);
        }
        return dovishnessVar.getName().equals(competently.f29690wireman) && kowloon(dovishnessVar);
    }

    public static starveling saneness(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, p002kotlin.reflect.jvm.internal.impl.types.oilcan oilcanVar, byname.marial marialVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar2, int i) {
        if (attabalVar == null) {
            attabal(32);
        }
        if (marialVar2 == null) {
            attabal(33);
        }
        if (oilcanVar == null) {
            return null;
        }
        return new p002kotlin.reflect.jvm.internal.impl.descriptors.impl.trm(attabalVar, new dern(attabalVar, oilcanVar, marialVar, null), marialVar2, beachfront.attabal(i));
    }

    public static starveling taiyuan(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, p002kotlin.reflect.jvm.internal.impl.types.oilcan oilcanVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar) {
        if (attabalVar == null) {
            attabal(30);
        }
        if (marialVar == null) {
            attabal(31);
        }
        if (oilcanVar == null) {
            return null;
        }
        return new p002kotlin.reflect.jvm.internal.impl.descriptors.impl.trm(attabalVar, new snook.wireman(attabalVar, oilcanVar, null), marialVar);
    }

    public static stratoscope triweekly(saran saranVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar2, boolean z, boolean z2, boolean z3, walach walachVar) {
        if (saranVar == null) {
            attabal(3);
        }
        if (marialVar == null) {
            attabal(4);
        }
        if (marialVar2 == null) {
            attabal(5);
        }
        if (walachVar == null) {
            attabal(6);
        }
        return impassible(saranVar, marialVar, marialVar2, z, z2, z3, saranVar.getVisibility(), walachVar);
    }

    public static cuirassed wireman(saran saranVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar) {
        if (saranVar == null) {
            attabal(13);
        }
        if (marialVar == null) {
            attabal(14);
        }
        return cutely(saranVar, marialVar, true, false, false);
    }
}
