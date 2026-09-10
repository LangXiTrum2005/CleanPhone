package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.grimness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.mathsort;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: PropertyAccessorDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class preprohormone extends cutely implements grimness {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final saran f30149adultoid;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final boolean f30150dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final CallableMemberDescriptor.Kind f30151gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final Modality f30152graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final boolean f30153molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f30154polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public dovishness f30155preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public molybdenite f30156rotuma;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public preprohormone(Modality modality, molybdenite molybdeniteVar, saran saranVar, marial marialVar, byname.marial marialVar2, boolean z, boolean z2, boolean z3, CallableMemberDescriptor.Kind kind, walach walachVar) {
        super(saranVar.saneness(), marialVar, marialVar2, walachVar);
        if (modality == null) {
            timberyard(0);
        }
        if (molybdeniteVar == null) {
            timberyard(1);
        }
        if (saranVar == null) {
            timberyard(2);
        }
        if (marialVar == null) {
            timberyard(3);
        }
        if (marialVar2 == null) {
            timberyard(4);
        }
        if (walachVar == null) {
            timberyard(5);
        }
        this.f30155preprohormone = null;
        this.f30152graveside = modality;
        this.f30156rotuma = molybdeniteVar;
        this.f30149adultoid = saranVar;
        this.f30154polloi = z;
        this.f30153molybdenite = z2;
        this.f30150dovishness = z3;
        this.f30151gintrap = kind;
    }

    private static /* synthetic */ void timberyard(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void achondroplasia(Collection<? extends CallableMemberDescriptor> collection2) {
        if (collection2 == null) {
            timberyard(16);
        }
    }

    public void attendance(molybdenite molybdeniteVar) {
        this.f30156rotuma = molybdeniteVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness
    public boolean claque() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean coffeecake() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.mathsort
    public dovishness dern(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            timberyard(7);
        }
        return this;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely
    /* JADX INFO: renamed from: dhss, reason: merged with bridge method [inline-methods] */
    public abstract grimness attabal();

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f30151gintrap;
        if (kind == null) {
            timberyard(6);
        }
        return kind;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public List<clubfoot> getTypeParameters() {
        List<clubfoot> list = Collections.EMPTY_LIST;
        if (list == null) {
            timberyard(9);
        }
        return list;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public molybdenite getVisibility() {
        molybdenite molybdeniteVar = this.f30156rotuma;
        if (molybdeniteVar == null) {
            timberyard(11);
        }
        return molybdeniteVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public List<starveling> gusty() {
        List<starveling> listGusty = starveling().gusty();
        if (listGusty == null) {
            timberyard(14);
        }
        return listGusty;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean isExternal() {
        return this.f30153molybdenite;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness
    public boolean isInfix() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness
    public boolean isInline() {
        return this.f30150dovishness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness
    public boolean isOperator() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness
    public boolean isSuspend() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness
    public boolean julian() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public starveling kattegat() {
        return starveling().kattegat();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public Modality kowloon() {
        Modality modality = this.f30152graveside;
        if (modality == null) {
            timberyard(10);
        }
        return modality;
    }

    public void mastfed(dovishness dovishnessVar) {
        this.f30155preprohormone = dovishnessVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: outmarry, reason: merged with bridge method [inline-methods] */
    public grimness merc(apical apicalVar, Modality modality, molybdenite molybdeniteVar, CallableMemberDescriptor.Kind kind, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public boolean peridotite() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public starveling polder() {
        return starveling().polder();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public boolean premeiotic() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness
    public boolean preprohormone() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public <V> V preterite(attabal.InterfaceC0672attabal<V> interfaceC0672attabal) {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness
    public dovishness sensatory() {
        return this.f30155preprohormone;
    }

    public void setterwort(boolean z) {
        this.f30154polloi = z;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.grimness
    public saran starveling() {
        saran saranVar = this.f30149adultoid;
        if (saranVar == null) {
            timberyard(13);
        }
        return saranVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.grimness
    public boolean stratoscope() {
        return this.f30154polloi;
    }

    public Collection<grimness> vesuvio(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (saran saranVar : starveling().wireman()) {
            mathsort getter = z ? saranVar.getGetter() : saranVar.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }
}
