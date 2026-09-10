package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.formularize;
import p002kotlin.reflect.jvm.internal.impl.descriptors.premeiotic;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: VariableDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class supplicat extends cutely implements premeiotic {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public oilcan f30166polloi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public supplicat(apical apicalVar, marial marialVar, byname.marial marialVar2, oilcan oilcanVar, walach walachVar) {
        super(apicalVar, marialVar, marialVar2, walachVar);
        if (apicalVar == null) {
            timberyard(0);
        }
        if (marialVar == null) {
            timberyard(1);
        }
        if (marialVar2 == null) {
            timberyard(2);
        }
        if (walachVar == null) {
            timberyard(3);
        }
        this.f30166polloi = oilcanVar;
    }

    private static /* synthetic */ void timberyard(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public List<cultivated> beachfront() {
        List<cultivated> list = Collections.EMPTY_LIST;
        if (list == null) {
            timberyard(6);
        }
        return list;
    }

    public /* bridge */ /* synthetic */ formularize dern(TypeSubstitutor typeSubstitutor) {
        return dern(typeSubstitutor);
    }

    public void dhss(oilcan oilcanVar) {
        this.f30166polloi = oilcanVar;
    }

    public oilcan getReturnType() {
        oilcan type = getType();
        if (type == null) {
            timberyard(10);
        }
        return type;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.permissivist
    public oilcan getType() {
        oilcan oilcanVar = this.f30166polloi;
        if (oilcanVar == null) {
            timberyard(4);
        }
        return oilcanVar;
    }

    public List<clubfoot> getTypeParameters() {
        List<clubfoot> list = Collections.EMPTY_LIST;
        if (list == null) {
            timberyard(8);
        }
        return list;
    }

    public starveling kattegat() {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely
    /* JADX INFO: renamed from: outmarry, reason: merged with bridge method [inline-methods] */
    public premeiotic attabal() {
        premeiotic premeioticVar = (premeiotic) super.attabal();
        if (premeioticVar == null) {
            timberyard(5);
        }
        return premeioticVar;
    }

    public starveling polder() {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public boolean premeiotic() {
        return false;
    }

    public Collection<? extends attabal> wireman() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            timberyard(7);
        }
        return set;
    }
}
