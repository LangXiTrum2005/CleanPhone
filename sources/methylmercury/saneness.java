package methylmercury;

import java.util.List;
import p002kotlin.Pair;
import p002kotlin.collections.adultoid;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: JavaClassConstructorDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public class saneness extends p002kotlin.reflect.jvm.internal.impl.descriptors.impl.marial implements attabal {

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public Boolean f33314peridotite;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public Boolean f33315walach;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public saneness(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar, saneness sanenessVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, boolean z, CallableMemberDescriptor.Kind kind, walach walachVar) {
        super(wiremanVar, sanenessVar, marialVar, z, kind, walachVar);
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
        this.f33315walach = null;
        this.f33314peridotite = null;
    }

    public static saneness hyalinization(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar, boolean z, walach walachVar) {
        if (wiremanVar == null) {
            timberyard(4);
        }
        if (marialVar == null) {
            timberyard(5);
        }
        if (walachVar == null) {
            timberyard(6);
        }
        return new saneness(wiremanVar, null, marialVar, z, CallableMemberDescriptor.Kind.DECLARATION, walachVar);
    }

    private static /* synthetic */ void timberyard(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // methylmercury.attabal
    /* JADX INFO: renamed from: ctenidium, reason: merged with bridge method [inline-methods] */
    public saneness splinterproof(oilcan oilcanVar, List<oilcan> list, oilcan oilcanVar2, Pair<p002kotlin.reflect.jvm.internal.impl.descriptors.attabal.InterfaceC0672attabal<?>, ?> pair) {
        if (list == null) {
            timberyard(16);
        }
        if (oilcanVar2 == null) {
            timberyard(17);
        }
        saneness sanenessVarVesuvio = vesuvio(saneness(), null, getKind(), null, getAnnotations(), competently());
        sanenessVarVesuvio.libyan(oilcanVar == null ? null : p002kotlin.reflect.jvm.internal.impl.resolve.wireman.taiyuan(sanenessVarVesuvio, oilcanVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness()), kattegat(), adultoid.formularize(), getTypeParameters(), competently.attabal(list, beachfront(), sanenessVarVesuvio), oilcanVar2, kowloon(), getVisibility());
        if (pair != null) {
            sanenessVarVesuvio.sakeen(pair.getFirst(), pair.getSecond());
        }
        return sanenessVarVesuvio;
    }

    public saneness incorrectly(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar, saneness sanenessVar, CallableMemberDescriptor.Kind kind, walach walachVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar) {
        if (wiremanVar == null) {
            timberyard(12);
        }
        if (kind == null) {
            timberyard(13);
        }
        if (walachVar == null) {
            timberyard(14);
        }
        if (marialVar == null) {
            timberyard(15);
        }
        return new saneness(wiremanVar, sanenessVar, marialVar, this.f30139hydrovane, kind, walachVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon
    public boolean lampshade() {
        return this.f33315walach.booleanValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon
    public void osteal(boolean z) {
        this.f33314peridotite = Boolean.valueOf(z);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon
    public void prefect(boolean z) {
        this.f33315walach = Boolean.valueOf(z);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public boolean premeiotic() {
        return this.f33314peridotite.booleanValue();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.marial, p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon
    /* JADX INFO: renamed from: puffin, reason: merged with bridge method [inline-methods] */
    public saneness vesuvio(apical apicalVar, dovishness dovishnessVar, CallableMemberDescriptor.Kind kind, byname.marial marialVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar2, walach walachVar) {
        if (apicalVar == null) {
            timberyard(7);
        }
        if (kind == null) {
            timberyard(8);
        }
        if (marialVar2 == null) {
            timberyard(9);
        }
        if (walachVar == null) {
            timberyard(10);
        }
        if (kind == CallableMemberDescriptor.Kind.DECLARATION || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            saneness sanenessVarIncorrectly = incorrectly((p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) apicalVar, (saneness) dovishnessVar, kind, walachVar, marialVar2);
            sanenessVarIncorrectly.prefect(lampshade());
            sanenessVarIncorrectly.osteal(premeiotic());
            return sanenessVarIncorrectly;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + apicalVar + "\nkind: " + kind);
    }
}
