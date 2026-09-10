package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import snook.competently;

/* JADX INFO: compiled from: ReceiverParameterDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class trm extends dern {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final apical f30168arytenoidectomy;
    private competently value;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public trm(apical apicalVar, competently competentlyVar, marial marialVar) {
        this(apicalVar, competentlyVar, marialVar, byname.competently.f15240impromptu);
        if (apicalVar == null) {
            timberyard(0);
        }
        if (competentlyVar == null) {
            timberyard(1);
        }
        if (marialVar == null) {
            timberyard(2);
        }
    }

    private static /* synthetic */ void timberyard(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.starveling
    public competently getValue() {
        competently competentlyVar = this.value;
        if (competentlyVar == null) {
            timberyard(7);
        }
        return competentlyVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public apical saneness() {
        apical apicalVar = this.f30168arytenoidectomy;
        if (apicalVar == null) {
            timberyard(8);
        }
        return apicalVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trm(apical apicalVar, competently competentlyVar, marial marialVar, byname.marial marialVar2) {
        super(marialVar, marialVar2);
        if (apicalVar == null) {
            timberyard(3);
        }
        if (competentlyVar == null) {
            timberyard(4);
        }
        if (marialVar == null) {
            timberyard(5);
        }
        if (marialVar2 == null) {
            timberyard(6);
        }
        this.f30168arytenoidectomy = apicalVar;
        this.value = competentlyVar;
    }
}
