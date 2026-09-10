package p002kotlin.reflect.jvm.internal.impl.load.java;

import p002kotlin.reflect.jvm.internal.impl.builtins.dern;
import p002kotlin.reflect.jvm.internal.impl.builtins.saneness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.adultoid;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.marial;

/* JADX INFO: compiled from: DescriptorsJvmAbiUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public final class beachfront {
    public static /* synthetic */ void attabal(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean dern(apical apicalVar) {
        if (apicalVar == null) {
            attabal(1);
        }
        return marial.rotuma(apicalVar) && marial.gintrap(apicalVar.saneness()) && !wireman((wireman) apicalVar);
    }

    public static boolean marial(saran saranVar) {
        if (saranVar == null) {
            attabal(0);
        }
        if (saranVar.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return false;
        }
        if (dern(saranVar.saneness())) {
            return true;
        }
        return marial.rotuma(saranVar.saneness()) && saneness(saranVar);
    }

    public static boolean saneness(CallableMemberDescriptor callableMemberDescriptor) {
        adultoid adultoidVarIgbo;
        if (callableMemberDescriptor == null) {
            attabal(3);
        }
        if ((callableMemberDescriptor instanceof saran) && (adultoidVarIgbo = ((saran) callableMemberDescriptor).igbo()) != null && adultoidVarIgbo.getAnnotations().restrictive(molybdenite.f30603saneness)) {
            return true;
        }
        return callableMemberDescriptor.getAnnotations().restrictive(molybdenite.f30603saneness);
    }

    public static boolean wireman(wireman wiremanVar) {
        if (wiremanVar == null) {
            attabal(2);
        }
        return dern.attabal(saneness.f29883attabal, wiremanVar);
    }
}
