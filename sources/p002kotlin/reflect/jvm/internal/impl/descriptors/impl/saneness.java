package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.splinterproof;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import yeast.formularize;

/* JADX INFO: compiled from: AbstractLazyTypeParameterDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class saneness extends wireman {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public saneness(formularize formularizeVar, apical apicalVar, marial marialVar, byname.marial marialVar2, Variance variance, boolean z, int i, walach walachVar, splinterproof splinterproofVar) {
        super(formularizeVar, apicalVar, marialVar, marialVar2, variance, z, i, walachVar, splinterproofVar);
        if (formularizeVar == null) {
            timberyard(0);
        }
        if (apicalVar == null) {
            timberyard(1);
        }
        if (marialVar == null) {
            timberyard(2);
        }
        if (marialVar2 == null) {
            timberyard(3);
        }
        if (variance == null) {
            timberyard(4);
        }
        if (walachVar == null) {
            timberyard(5);
        }
        if (splinterproofVar == null) {
            timberyard(6);
        }
    }

    public static /* synthetic */ void timberyard(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.taiyuan
    public String toString() {
        String str = "";
        String str2 = graveside() ? "reified " : "";
        if (cutely() != Variance.INVARIANT) {
            str = cutely() + " ";
        }
        return String.format("%s%s%s", str2, str, getName());
    }
}
