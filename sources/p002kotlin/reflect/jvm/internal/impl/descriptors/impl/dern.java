package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import byname.competently;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polder;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import snook.cutely;

/* JADX INFO: compiled from: AbstractReceiverParameterDescriptor.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class dern extends taiyuan implements starveling {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dern(marial marialVar) {
        super(marialVar, competently.f15240impromptu);
        if (marialVar == null) {
            timberyard(0);
        }
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
            case 11:
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
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public List<cultivated> beachfront() {
        List<cultivated> list = Collections.EMPTY_LIST;
        if (list == null) {
            timberyard(7);
        }
        return list;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.triweekly
    public walach competently() {
        walach walachVar = walach.f30274attabal;
        if (walachVar == null) {
            timberyard(11);
        }
        return walachVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public <R, D> R dovishness(impassible<R, D> impassibleVar, D d) {
        return impassibleVar.formularize(this, d);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public oilcan getReturnType() {
        return getType();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.permissivist
    public oilcan getType() {
        oilcan type = getValue().getType();
        if (type == null) {
            timberyard(6);
        }
        return type;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public List<clubfoot> getTypeParameters() {
        List<clubfoot> list = Collections.EMPTY_LIST;
        if (list == null) {
            timberyard(5);
        }
        return list;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public molybdenite getVisibility() {
        molybdenite molybdeniteVar = polloi.f30204beachfront;
        if (molybdeniteVar == null) {
            timberyard(9);
        }
        return molybdeniteVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public starveling kattegat() {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public starveling polder() {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public boolean premeiotic() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public Collection<? extends attabal> wireman() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            timberyard(8);
        }
        return set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dern(marial marialVar, byname.marial marialVar2) {
        super(marialVar, marialVar2);
        if (marialVar == null) {
            timberyard(1);
        }
        if (marialVar2 == null) {
            timberyard(2);
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.mathsort
    public starveling dern(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            timberyard(3);
        }
        if (!typeSubstitutor.apical()) {
            oilcan oilcanVarArytenoidectomy = saneness() instanceof wireman ? typeSubstitutor.arytenoidectomy(getType(), Variance.OUT_VARIANCE) : typeSubstitutor.arytenoidectomy(getType(), Variance.INVARIANT);
            if (oilcanVarArytenoidectomy == null) {
                return null;
            }
            if (oilcanVarArytenoidectomy != getType()) {
                return new trm(saneness(), new cutely(oilcanVarArytenoidectomy), getAnnotations());
            }
        }
        return this;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.taiyuan, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    /* JADX INFO: renamed from: unconsolidated, reason: merged with bridge method [inline-methods] */
    public polder attabal() {
        return this;
    }
}
