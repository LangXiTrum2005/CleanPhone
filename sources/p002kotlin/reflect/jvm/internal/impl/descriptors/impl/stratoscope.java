package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import byname.competently;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.creditor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.grimness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: PropertySetterDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class stratoscope extends preprohormone implements creditor {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public cultivated f30164cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public final creditor f30165cuirassed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stratoscope(saran saranVar, marial marialVar, Modality modality, molybdenite molybdeniteVar, boolean z, boolean z2, boolean z3, CallableMemberDescriptor.Kind kind, creditor creditorVar, walach walachVar) {
        super(modality, molybdeniteVar, saranVar, marialVar, byname.marial.impassible("<set-" + saranVar.getName() + ">"), z, z2, z3, kind, walachVar);
        if (saranVar == null) {
            timberyard(0);
        }
        if (marialVar == null) {
            timberyard(1);
        }
        if (modality == null) {
            timberyard(2);
        }
        if (molybdeniteVar == null) {
            timberyard(3);
        }
        if (kind == null) {
            timberyard(4);
        }
        if (walachVar == null) {
            timberyard(5);
        }
        this.f30165cuirassed = creditorVar != null ? creditorVar : this;
    }

    public static ValueParameterDescriptorImpl homozygous(creditor creditorVar, oilcan oilcanVar, marial marialVar) {
        if (creditorVar == null) {
            timberyard(7);
        }
        if (oilcanVar == null) {
            timberyard(8);
        }
        if (marialVar == null) {
            timberyard(9);
        }
        return new ValueParameterDescriptorImpl(creditorVar, null, 0, marialVar, competently.f15246triweekly, oilcanVar, false, false, false, null, walach.f30274attabal);
    }

    private static /* synthetic */ void timberyard(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD;
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public List<cultivated> beachfront() {
        cultivated cultivatedVar = this.f30164cord;
        if (cultivatedVar == null) {
            throw new IllegalStateException();
        }
        List<cultivated> listSingletonList = Collections.singletonList(cultivatedVar);
        if (listSingletonList == null) {
            timberyard(11);
        }
        return listSingletonList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public <R, D> R dovishness(impassible<R, D> impassibleVar, D d) {
        return impassibleVar.marial(this, d);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public oilcan getReturnType() {
        merc mercVarPermissivist = DescriptorUtilsKt.cutely(this).permissivist();
        if (mercVarPermissivist == null) {
            timberyard(12);
        }
        return mercVarPermissivist;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.preprohormone, p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely
    /* JADX INFO: renamed from: lampshade, reason: merged with bridge method [inline-methods] */
    public creditor attabal() {
        creditor creditorVar = this.f30165cuirassed;
        if (creditorVar == null) {
            timberyard(13);
        }
        return creditorVar;
    }

    public void libyan(cultivated cultivatedVar) {
        if (cultivatedVar == null) {
            timberyard(6);
        }
        this.f30164cord = cultivatedVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness, p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public Collection<? extends creditor> wireman() {
        Collection<grimness> collectionVesuvio = super.vesuvio(false);
        if (collectionVesuvio == null) {
            timberyard(10);
        }
        return collectionVesuvio;
    }
}
