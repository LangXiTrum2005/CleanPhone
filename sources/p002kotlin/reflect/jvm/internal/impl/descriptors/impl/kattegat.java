package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.splinterproof;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.yemenite;
import yeast.formularize;

/* JADX INFO: compiled from: TypeParameterDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class kattegat extends wireman {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public boolean f30084cord;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final List<oilcan> f30085preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final Function1<oilcan, Void> f30086rotuma;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kattegat(apical apicalVar, marial marialVar, boolean z, Variance variance, byname.marial marialVar2, int i, walach walachVar, Function1<oilcan, Void> function1, splinterproof splinterproofVar, formularize formularizeVar) {
        super(formularizeVar, apicalVar, marialVar, marialVar2, variance, z, i, walachVar, splinterproofVar);
        if (apicalVar == null) {
            timberyard(19);
        }
        if (marialVar == null) {
            timberyard(20);
        }
        if (variance == null) {
            timberyard(21);
        }
        if (marialVar2 == null) {
            timberyard(22);
        }
        if (walachVar == null) {
            timberyard(23);
        }
        if (splinterproofVar == null) {
            timberyard(24);
        }
        if (formularizeVar == null) {
            timberyard(25);
        }
        this.f30085preprohormone = new ArrayList(1);
        this.f30084cord = false;
        this.f30086rotuma = function1;
    }

    public static kattegat homozygous(apical apicalVar, marial marialVar, boolean z, Variance variance, byname.marial marialVar2, int i, walach walachVar, Function1<oilcan, Void> function1, splinterproof splinterproofVar, formularize formularizeVar) {
        if (apicalVar == null) {
            timberyard(12);
        }
        if (marialVar == null) {
            timberyard(13);
        }
        if (variance == null) {
            timberyard(14);
        }
        if (marialVar2 == null) {
            timberyard(15);
        }
        if (walachVar == null) {
            timberyard(16);
        }
        if (splinterproofVar == null) {
            timberyard(17);
        }
        if (formularizeVar == null) {
            timberyard(18);
        }
        return new kattegat(apicalVar, marialVar, z, variance, marialVar2, i, walachVar, function1, splinterproofVar, formularizeVar);
    }

    public static kattegat lampshade(apical apicalVar, marial marialVar, boolean z, Variance variance, byname.marial marialVar2, int i, walach walachVar, formularize formularizeVar) {
        if (apicalVar == null) {
            timberyard(6);
        }
        if (marialVar == null) {
            timberyard(7);
        }
        if (variance == null) {
            timberyard(8);
        }
        if (marialVar2 == null) {
            timberyard(9);
        }
        if (walachVar == null) {
            timberyard(10);
        }
        if (formularizeVar == null) {
            timberyard(11);
        }
        return homozygous(apicalVar, marialVar, z, variance, marialVar2, i, walachVar, null, splinterproof.attabal.f30272attabal, formularizeVar);
    }

    public static clubfoot libyan(apical apicalVar, marial marialVar, boolean z, Variance variance, byname.marial marialVar2, int i, formularize formularizeVar) {
        if (apicalVar == null) {
            timberyard(0);
        }
        if (marialVar == null) {
            timberyard(1);
        }
        if (variance == null) {
            timberyard(2);
        }
        if (marialVar2 == null) {
            timberyard(3);
        }
        if (formularizeVar == null) {
            timberyard(4);
        }
        kattegat kattegatVarLampshade = lampshade(apicalVar, marialVar, z, variance, marialVar2, i, walach.f30274attabal, formularizeVar);
        kattegatVarLampshade.setterwort(DescriptorUtilsKt.cutely(apicalVar).preprohormone());
        kattegatVarLampshade.immediately();
        return kattegatVarLampshade;
    }

    private static /* synthetic */ void timberyard(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final void attendance() {
        if (this.f30084cord) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + sakeen());
        }
    }

    public final void deadwork(oilcan oilcanVar) {
        if (yemenite.attabal(oilcanVar)) {
            return;
        }
        this.f30085preprohormone.add(oilcanVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.wireman
    public void dhss(oilcan oilcanVar) {
        if (oilcanVar == null) {
            timberyard(27);
        }
        Function1<oilcan, Void> function1 = this.f30086rotuma;
        if (function1 == null) {
            return;
        }
        function1.invoke(oilcanVar);
    }

    public void immediately() {
        attendance();
        this.f30084cord = true;
    }

    public final void mastfed() {
        if (this.f30084cord) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + sakeen());
    }

    public boolean molet() {
        return this.f30084cord;
    }

    public final String sakeen() {
        return getName() + " declared in " + p002kotlin.reflect.jvm.internal.impl.resolve.marial.impassible(saneness());
    }

    public void setterwort(oilcan oilcanVar) {
        if (oilcanVar == null) {
            timberyard(26);
        }
        attendance();
        deadwork(oilcanVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.wireman
    public List<oilcan> vesuvio() {
        mastfed();
        List<oilcan> list = this.f30085preprohormone;
        if (list == null) {
            timberyard(28);
        }
        return list;
    }
}
