package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import byname.competently;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: ClassConstructorDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class marial extends kowloon implements dern {

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public final boolean f30139hydrovane;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public marial(wireman wiremanVar, cutely cutelyVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, boolean z, CallableMemberDescriptor.Kind kind, walach walachVar) {
        super(wiremanVar, cutelyVar, marialVar, competently.f15245taiyuan, kind, walachVar);
        if (wiremanVar == null) {
            timberyard(0);
        }
        if (marialVar == null) {
            timberyard(1);
        }
        if (kind == null) {
            timberyard(2);
        }
        if (walachVar == null) {
            timberyard(3);
        }
        this.f30139hydrovane = z;
    }

    public static marial tailoring(wireman wiremanVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, boolean z, walach walachVar) {
        if (wiremanVar == null) {
            timberyard(4);
        }
        if (marialVar == null) {
            timberyard(5);
        }
        if (walachVar == null) {
            timberyard(6);
        }
        return new marial(wiremanVar, null, marialVar, z, CallableMemberDescriptor.Kind.DECLARATION, walachVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    private static /* synthetic */ void timberyard(int i) {
        String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
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
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void achondroplasia(Collection<? extends CallableMemberDescriptor> collection2) {
        if (collection2 == null) {
            timberyard(22);
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cutely
    public boolean clubfoot() {
        return this.f30139hydrovane;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: decarock, reason: merged with bridge method [inline-methods] */
    public dern merc(apical apicalVar, Modality modality, molybdenite molybdeniteVar, CallableMemberDescriptor.Kind kind, boolean z) {
        dern dernVar = (dern) super.merc(apicalVar, modality, molybdeniteVar, kind, z);
        if (dernVar == null) {
            timberyard(27);
        }
        return dernVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cutely
    public wireman dent() {
        wireman wiremanVarSaneness = saneness();
        if (wiremanVarSaneness == null) {
            timberyard(18);
        }
        return wiremanVarSaneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public <R, D> R dovishness(impassible<R, D> impassibleVar, D d) {
        return impassibleVar.cutely(this, d);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon
    /* JADX INFO: renamed from: liable, reason: merged with bridge method [inline-methods] */
    public marial vesuvio(apical apicalVar, dovishness dovishnessVar, CallableMemberDescriptor.Kind kind, byname.marial marialVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar2, walach walachVar) {
        if (apicalVar == null) {
            timberyard(23);
        }
        if (kind == null) {
            timberyard(24);
        }
        if (marialVar2 == null) {
            timberyard(25);
        }
        if (walachVar == null) {
            timberyard(26);
        }
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind == kind2 || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            return new marial((wireman) apicalVar, this, marialVar2, this.f30139hydrovane, kind2, walachVar);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + apicalVar + "\nkind: " + kind);
    }

    public starveling libya() {
        wireman wiremanVarSaneness = saneness();
        if (!wiremanVarSaneness.gintrap()) {
            return null;
        }
        apical apicalVarSaneness = wiremanVarSaneness.saneness();
        if (apicalVarSaneness instanceof wireman) {
            return ((wireman) apicalVarSaneness).technofreak();
        }
        return null;
    }

    public marial miliaria(List<cultivated> list, molybdenite molybdeniteVar, List<clubfoot> list2) {
        if (list == null) {
            timberyard(10);
        }
        if (molybdeniteVar == null) {
            timberyard(11);
        }
        if (list2 == null) {
            timberyard(12);
        }
        super.libyan(null, libya(), stupefactive(), list2, list, null, Modality.FINAL, molybdeniteVar);
        return this;
    }

    public final List<starveling> stupefactive() {
        wireman wiremanVarSaneness = saneness();
        if (wiremanVarSaneness.mathsort().isEmpty()) {
            List<starveling> list = Collections.EMPTY_LIST;
            if (list == null) {
                timberyard(16);
            }
            return list;
        }
        List<starveling> listMathsort = wiremanVarSaneness.mathsort();
        if (listMathsort == null) {
            timberyard(15);
        }
        return listMathsort;
    }

    public marial twybill(List<cultivated> list, molybdenite molybdeniteVar) {
        if (list == null) {
            timberyard(13);
        }
        if (molybdeniteVar == null) {
            timberyard(14);
        }
        miliaria(list, molybdeniteVar, saneness().triweekly());
        return this;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    /* JADX INFO: renamed from: vir, reason: merged with bridge method [inline-methods] */
    public wireman saneness() {
        wireman wiremanVar = (wireman) super.saneness();
        if (wiremanVar == null) {
            timberyard(17);
        }
        return wiremanVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness, p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public Collection<? extends dovishness> wireman() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            timberyard(21);
        }
        return set;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.mathsort
    public dern dern(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            timberyard(20);
        }
        return (dern) super.dern(typeSubstitutor);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely
    public dern attabal() {
        dern dernVar = (dern) super.attabal();
        if (dernVar == null) {
            timberyard(19);
        }
        return dernVar;
    }
}
