package p002kotlin.reflect.jvm.internal.impl.resolve;

import byname.competently;
import byname.dern;
import com.ironsource.C3414a2;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.builtins.taiyuan;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.creditor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.kowloon;
import p002kotlin.reflect.jvm.internal.impl.descriptors.merc;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.peridotite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.premeiotic;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.triweekly;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.yemenite;

/* JADX INFO: compiled from: DescriptorUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f31356attabal = new dern("kotlin.jvm.JvmName");

    public static boolean adultoid(apical apicalVar) {
        if (apicalVar == null) {
            attabal(34);
        }
        return dovishness(apicalVar) && apicalVar.getName().equals(competently.f15244saneness);
    }

    public static molybdenite apical(wireman wiremanVar, boolean z) {
        if (wiremanVar == null) {
            attabal(48);
        }
        ClassKind kind = wiremanVar.getKind();
        if (kind == ClassKind.ENUM_CLASS || kind.isSingleton()) {
            molybdenite molybdeniteVar = polloi.f30203attabal;
            if (molybdeniteVar == null) {
                attabal(49);
            }
            return molybdeniteVar;
        }
        if (kattegat(wiremanVar)) {
            if (z) {
                molybdenite molybdeniteVar2 = polloi.f30207dern;
                if (molybdeniteVar2 == null) {
                    attabal(50);
                }
                return molybdeniteVar2;
            }
            molybdenite molybdeniteVar3 = polloi.f30203attabal;
            if (molybdeniteVar3 == null) {
                attabal(51);
            }
            return molybdeniteVar3;
        }
        if (adultoid(wiremanVar)) {
            molybdenite molybdeniteVar4 = polloi.f30208formularize;
            if (molybdeniteVar4 == null) {
                attabal(52);
            }
            return molybdeniteVar4;
        }
        molybdenite molybdeniteVar5 = polloi.f30212marial;
        if (molybdeniteVar5 == null) {
            attabal(53);
        }
        return molybdeniteVar5;
    }

    public static byname.wireman arytenoidectomy(apical apicalVar) {
        if (apicalVar == null) {
            attabal(6);
        }
        byname.wireman wiremanVarDern = impassible(apicalVar.saneness()).dern(apicalVar.getName());
        if (wiremanVarDern == null) {
            attabal(7);
        }
        return wiremanVarDern;
    }

    public static /* synthetic */ void attabal(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = C3414a2.d;
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static wireman beachfront(permissivist permissivistVar) {
        if (permissivistVar == null) {
            attabal(46);
        }
        wireman wiremanVar = (wireman) permissivistVar.wireman();
        if (wiremanVar == null) {
            attabal(47);
        }
        return wiremanVar;
    }

    public static trm competently(apical apicalVar) {
        if (apicalVar == null) {
            attabal(21);
        }
        trm trmVarImpromptu = impromptu(apicalVar);
        if (trmVarImpromptu == null) {
            attabal(22);
        }
        return trmVarImpromptu;
    }

    public static boolean cord(wireman wiremanVar, wireman wiremanVar2) {
        if (wiremanVar == null) {
            attabal(26);
        }
        if (wiremanVar2 == null) {
            attabal(27);
        }
        Iterator<oilcan> it = wiremanVar.impromptu().cutely().iterator();
        while (it.hasNext()) {
            if (sealless(it.next(), wiremanVar2.attabal())) {
                return true;
            }
        }
        return false;
    }

    public static boolean cuirassed(apical apicalVar) {
        return oilcan(apicalVar, ClassKind.ENUM_CLASS);
    }

    public static peridotite cutely(apical apicalVar) {
        if (apicalVar == null) {
            attabal(82);
        }
        if (apicalVar instanceof creditor) {
            apicalVar = ((creditor) apicalVar).starveling();
        }
        if (apicalVar instanceof triweekly) {
            peridotite peridotiteVarSaneness = ((triweekly) apicalVar).competently().saneness();
            if (peridotiteVarSaneness == null) {
                attabal(83);
            }
            return peridotiteVarSaneness;
        }
        peridotite peridotiteVar = peridotite.f30200attabal;
        if (peridotiteVar == null) {
            attabal(84);
        }
        return peridotiteVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <D extends attabal> void dern(D d, Set<D> set) {
        if (d == null) {
            attabal(73);
        }
        if (set == 0) {
            attabal(74);
        }
        if (set.contains(d)) {
            return;
        }
        Iterator<? extends attabal> it = d.attabal().wireman().iterator();
        while (it.hasNext()) {
            attabal attabalVarAttabal = it.next().attabal();
            dern(attabalVarAttabal, set);
            set.add(attabalVarAttabal);
        }
    }

    public static boolean dovishness(apical apicalVar) {
        return oilcan(apicalVar, ClassKind.CLASS);
    }

    public static starveling formularize(apical apicalVar) {
        if (apicalVar == null) {
            attabal(0);
        }
        if (apicalVar instanceof wireman) {
            return ((wireman) apicalVar).technofreak();
        }
        return null;
    }

    public static boolean gintrap(apical apicalVar) {
        return dovishness(apicalVar) || cuirassed(apicalVar);
    }

    public static boolean graveside(apical apicalVar) {
        return oilcan(apicalVar, ClassKind.ANNOTATION_CLASS);
    }

    public static <D extends kowloon> D grimness(D d) {
        if (d == null) {
            attabal(64);
        }
        if (d instanceof CallableMemberDescriptor) {
            return seminary((CallableMemberDescriptor) d);
        }
        if (d == null) {
            attabal(65);
        }
        return d;
    }

    public static byname.wireman impassible(apical apicalVar) {
        if (apicalVar == null) {
            attabal(2);
        }
        dern dernVarKowloon = kowloon(apicalVar);
        return dernVarKowloon != null ? dernVarKowloon.cutely() : arytenoidectomy(apicalVar);
    }

    public static trm impromptu(apical apicalVar) {
        if (apicalVar == null) {
            attabal(23);
        }
        while (apicalVar != null) {
            if (apicalVar instanceof trm) {
                return (trm) apicalVar;
            }
            if (apicalVar instanceof merc) {
                return ((merc) apicalVar).monroe();
            }
            apicalVar = apicalVar.saneness();
        }
        return null;
    }

    public static boolean kattegat(apical apicalVar) {
        return (oilcan(apicalVar, ClassKind.CLASS) || oilcan(apicalVar, ClassKind.INTERFACE)) && ((wireman) apicalVar).kowloon() == Modality.SEALED;
    }

    public static dern kowloon(apical apicalVar) {
        if (apicalVar == null) {
            attabal(5);
        }
        if ((apicalVar instanceof trm) || prescient.competently.impassible(apicalVar)) {
            return dern.f15248dern;
        }
        if (apicalVar instanceof merc) {
            return ((merc) apicalVar).marial();
        }
        if (apicalVar instanceof sealless) {
            return ((sealless) apicalVar).marial();
        }
        return null;
    }

    public static wireman marial(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(45);
        }
        return beachfront(oilcanVar.setterwort());
    }

    public static boolean merc(apical apicalVar) {
        return apicalVar != null && (apicalVar.saneness() instanceof sealless);
    }

    public static wireman molybdenite(wireman wiremanVar) {
        if (wiremanVar == null) {
            attabal(44);
        }
        Iterator<oilcan> it = wiremanVar.impromptu().cutely().iterator();
        while (it.hasNext()) {
            wireman wiremanVarMarial = marial(it.next());
            if (wiremanVarMarial.getKind() != ClassKind.INTERFACE) {
                return wiremanVarMarial;
            }
        }
        return null;
    }

    public static <D extends apical> D monoploid(apical apicalVar, Class<D> cls) {
        if (cls == null) {
            attabal(18);
        }
        return (D) polloi(apicalVar, cls, true);
    }

    public static boolean oilcan(apical apicalVar, ClassKind classKind) {
        if (classKind == null) {
            attabal(37);
        }
        return (apicalVar instanceof wireman) && ((wireman) apicalVar).getKind() == classKind;
    }

    public static boolean polder(premeiotic premeioticVar, oilcan oilcanVar) {
        if (premeioticVar == null) {
            attabal(66);
        }
        if (oilcanVar == null) {
            attabal(67);
        }
        if (premeioticVar.restrictive() || yemenite.attabal(oilcanVar)) {
            return false;
        }
        if (nosophobia.saneness(oilcanVar)) {
            return true;
        }
        beachfront beachfrontVarCutely = DescriptorUtilsKt.cutely(premeioticVar);
        if (!beachfront.igbo(oilcanVar)) {
            p002kotlin.reflect.jvm.internal.impl.types.checker.marial marialVar = p002kotlin.reflect.jvm.internal.impl.types.checker.marial.f31734attabal;
            if (!marialVar.saneness(beachfrontVarCutely.overspeculate(), oilcanVar) && !marialVar.saneness(beachfrontVarCutely.polder().impassible(), oilcanVar) && !marialVar.saneness(beachfrontVarCutely.taiyuan(), oilcanVar) && !taiyuan.wireman(oilcanVar)) {
                return false;
            }
        }
        return true;
    }

    public static <D extends apical> D polloi(apical apicalVar, Class<D> cls, boolean z) {
        if (cls == null) {
            attabal(19);
        }
        if (apicalVar == null) {
            return null;
        }
        if (z) {
            apicalVar = (D) apicalVar.saneness();
        }
        while (apicalVar != null) {
            if (cls.isInstance(apicalVar)) {
                return (D) apicalVar;
            }
            apicalVar = (D) apicalVar.saneness();
        }
        return null;
    }

    public static boolean preprohormone(apical apicalVar) {
        return (apicalVar instanceof kowloon) && ((kowloon) apicalVar).getVisibility() == polloi.f30204beachfront;
    }

    public static boolean restrictive(oilcan oilcanVar, apical apicalVar) {
        if (oilcanVar == null) {
            attabal(32);
        }
        if (apicalVar == null) {
            attabal(33);
        }
        if (sealless(oilcanVar, apicalVar)) {
            return true;
        }
        Iterator<oilcan> it = oilcanVar.setterwort().cutely().iterator();
        while (it.hasNext()) {
            if (restrictive(it.next(), apicalVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean rotuma(apical apicalVar) {
        return oilcan(apicalVar, ClassKind.OBJECT) && ((wireman) apicalVar).overspeculate();
    }

    public static boolean saneness(apical apicalVar, apical apicalVar2) {
        if (apicalVar == null) {
            attabal(16);
        }
        if (apicalVar2 == null) {
            attabal(17);
        }
        return competently(apicalVar).equals(competently(apicalVar2));
    }

    public static boolean sealless(oilcan oilcanVar, apical apicalVar) {
        if (oilcanVar == null) {
            attabal(30);
        }
        if (apicalVar == null) {
            attabal(31);
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        if (beachfrontVarWireman == null) {
            return false;
        }
        apical apicalVarAttabal = beachfrontVarWireman.attabal();
        return (apicalVarAttabal instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront) && (apicalVar instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront) && ((p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront) apicalVar).impromptu().equals(((p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront) apicalVarAttabal).impromptu());
    }

    public static <D extends CallableMemberDescriptor> D seminary(D d) {
        if (d == null) {
            attabal(59);
        }
        while (d.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            Collection<? extends CallableMemberDescriptor> collectionWireman = d.wireman();
            if (collectionWireman.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
            }
            d = (D) collectionWireman.iterator().next();
        }
        return d;
    }

    public static boolean stratoscope(apical apicalVar) {
        if (apicalVar == null) {
            attabal(36);
        }
        return oilcan(apicalVar, ClassKind.ENUM_ENTRY);
    }

    public static boolean supplicat(wireman wiremanVar, wireman wiremanVar2) {
        if (wiremanVar == null) {
            attabal(28);
        }
        if (wiremanVar2 == null) {
            attabal(29);
        }
        return restrictive(wiremanVar.impassible(), wiremanVar2.attabal());
    }

    public static trm taiyuan(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(20);
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        if (beachfrontVarWireman == null) {
            return null;
        }
        return impromptu(beachfrontVarWireman);
    }

    public static dern triweekly(apical apicalVar) {
        if (apicalVar == null) {
            attabal(3);
        }
        dern dernVarKowloon = kowloon(apicalVar);
        if (dernVarKowloon == null) {
            dernVarKowloon = arytenoidectomy(apicalVar).formularize();
        }
        if (dernVarKowloon == null) {
            attabal(4);
        }
        return dernVarKowloon;
    }

    public static boolean trm(apical apicalVar) {
        return oilcan(apicalVar, ClassKind.INTERFACE);
    }

    public static <D extends attabal> Set<D> wireman(D d) {
        if (d == null) {
            attabal(71);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        dern(d.attabal(), linkedHashSet);
        return linkedHashSet;
    }

    public static boolean yemenite(apical apicalVar) {
        if (apicalVar == null) {
            attabal(1);
        }
        while (apicalVar != null) {
            if (adultoid(apicalVar) || preprohormone(apicalVar)) {
                return true;
            }
            apicalVar = apicalVar.saneness();
        }
        return false;
    }
}
