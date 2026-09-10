package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.grimness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.privatdozent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: PropertyGetterDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class cuirassed extends preprohormone implements privatdozent {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public oilcan f30052cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public final privatdozent f30053cuirassed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuirassed(saran saranVar, marial marialVar, Modality modality, molybdenite molybdeniteVar, boolean z, boolean z2, boolean z3, CallableMemberDescriptor.Kind kind, privatdozent privatdozentVar, walach walachVar) {
        super(modality, molybdeniteVar, saranVar, marialVar, byname.marial.impassible("<get-" + saranVar.getName() + ">"), z, z2, z3, kind, walachVar);
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
        this.f30053cuirassed = privatdozentVar != null ? privatdozentVar : this;
    }

    private static /* synthetic */ void timberyard(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public List<cultivated> beachfront() {
        List<cultivated> list = Collections.EMPTY_LIST;
        if (list == null) {
            timberyard(7);
        }
        return list;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public <R, D> R dovishness(impassible<R, D> impassibleVar, D d) {
        return impassibleVar.competently(this, d);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public oilcan getReturnType() {
        return this.f30052cord;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.preprohormone, p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely
    /* JADX INFO: renamed from: homozygous, reason: merged with bridge method [inline-methods] */
    public privatdozent attabal() {
        privatdozent privatdozentVar = this.f30053cuirassed;
        if (privatdozentVar == null) {
            timberyard(8);
        }
        return privatdozentVar;
    }

    public void lampshade(oilcan oilcanVar) {
        if (oilcanVar == null) {
            oilcanVar = starveling().getType();
        }
        this.f30052cord = oilcanVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness, p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public Collection<? extends privatdozent> wireman() {
        Collection<grimness> collectionVesuvio = super.vesuvio(true);
        if (collectionVesuvio == null) {
            timberyard(6);
        }
        return collectionVesuvio;
    }
}
