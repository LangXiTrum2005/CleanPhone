package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;

/* JADX INFO: compiled from: SimpleFunctionDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class oilcan extends kowloon implements hydrovane {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oilcan(apical apicalVar, hydrovane hydrovaneVar, marial marialVar, byname.marial marialVar2, CallableMemberDescriptor.Kind kind, walach walachVar) {
        super(apicalVar, hydrovaneVar, marialVar, marialVar2, kind, walachVar);
        if (apicalVar == null) {
            timberyard(0);
        }
        if (marialVar == null) {
            timberyard(1);
        }
        if (marialVar2 == null) {
            timberyard(2);
        }
        if (kind == null) {
            timberyard(3);
        }
        if (walachVar == null) {
            timberyard(4);
        }
    }

    public static oilcan libya(apical apicalVar, marial marialVar, byname.marial marialVar2, CallableMemberDescriptor.Kind kind, walach walachVar) {
        if (apicalVar == null) {
            timberyard(5);
        }
        if (marialVar == null) {
            timberyard(6);
        }
        if (marialVar2 == null) {
            timberyard(7);
        }
        if (kind == null) {
            timberyard(8);
        }
        if (walachVar == null) {
            timberyard(9);
        }
        return new oilcan(apicalVar, null, marialVar, marialVar2, kind, walachVar);
    }

    private static /* synthetic */ void timberyard(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = MobileAdsBridgeBase.initializeMethodName;
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely
    /* JADX INFO: renamed from: decarock, reason: merged with bridge method [inline-methods] */
    public hydrovane attabal() {
        hydrovane hydrovaneVar = (hydrovane) super.attabal();
        if (hydrovaneVar == null) {
            timberyard(24);
        }
        return hydrovaneVar;
    }

    public oilcan liable(starveling starvelingVar, starveling starvelingVar2, List<starveling> list, List<? extends clubfoot> list2, List<cultivated> list3, p002kotlin.reflect.jvm.internal.impl.types.oilcan oilcanVar, Modality modality, molybdenite molybdeniteVar, Map<? extends attabal.InterfaceC0672attabal<?>, ?> map) {
        if (list == null) {
            timberyard(19);
        }
        if (list2 == null) {
            timberyard(20);
        }
        if (list3 == null) {
            timberyard(21);
        }
        if (molybdeniteVar == null) {
            timberyard(22);
        }
        super.libyan(starvelingVar, starvelingVar2, list, list2, list3, oilcanVar, modality, molybdeniteVar);
        if (map != null && !map.isEmpty()) {
            this.f30108starveling = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness
    public dovishness.attabal<? extends hydrovane> monoploid() {
        dovishness.attabal attabalVarMonoploid = super.monoploid();
        if (attabalVarMonoploid == null) {
            timberyard(30);
        }
        return attabalVarMonoploid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: stupefactive, reason: merged with bridge method [inline-methods] */
    public hydrovane merc(apical apicalVar, Modality modality, molybdenite molybdeniteVar, CallableMemberDescriptor.Kind kind, boolean z) {
        hydrovane hydrovaneVar = (hydrovane) super.merc(apicalVar, modality, molybdeniteVar, kind, z);
        if (hydrovaneVar == null) {
            timberyard(29);
        }
        return hydrovaneVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon
    /* JADX INFO: renamed from: tailoring, reason: merged with bridge method [inline-methods] */
    public oilcan libyan(starveling starvelingVar, starveling starvelingVar2, List<starveling> list, List<? extends clubfoot> list2, List<cultivated> list3, p002kotlin.reflect.jvm.internal.impl.types.oilcan oilcanVar, Modality modality, molybdenite molybdeniteVar) {
        if (list == null) {
            timberyard(14);
        }
        if (list2 == null) {
            timberyard(15);
        }
        if (list3 == null) {
            timberyard(16);
        }
        if (molybdeniteVar == null) {
            timberyard(17);
        }
        oilcan oilcanVarLiable = liable(starvelingVar, starvelingVar2, list, list2, list3, oilcanVar, modality, molybdeniteVar, null);
        if (oilcanVarLiable == null) {
            timberyard(18);
        }
        return oilcanVarLiable;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon
    public kowloon vesuvio(apical apicalVar, dovishness dovishnessVar, CallableMemberDescriptor.Kind kind, byname.marial marialVar, marial marialVar2, walach walachVar) {
        if (apicalVar == null) {
            timberyard(25);
        }
        if (kind == null) {
            timberyard(26);
        }
        if (marialVar2 == null) {
            timberyard(27);
        }
        if (walachVar == null) {
            timberyard(28);
        }
        hydrovane hydrovaneVar = (hydrovane) dovishnessVar;
        if (marialVar == null) {
            marialVar = getName();
        }
        return new oilcan(apicalVar, hydrovaneVar, marialVar2, marialVar, kind, walachVar);
    }
}
