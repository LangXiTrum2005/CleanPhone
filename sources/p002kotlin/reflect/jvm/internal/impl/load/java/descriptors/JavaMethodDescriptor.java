package p002kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.List;
import java.util.Map;
import methylmercury.competently;
import p002kotlin.Pair;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.oilcan;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.resolve.wireman;
import p002kotlin.reflect.jvm.internal.impl.util.OperatorChecks;

/* JADX INFO: loaded from: classes5.dex */
public class JavaMethodDescriptor extends oilcan implements methylmercury.attabal {

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public ParameterNamesStatus f30406hydrovane;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public final boolean f30407walach;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public static final p002kotlin.reflect.jvm.internal.impl.descriptors.attabal.InterfaceC0672attabal<cultivated> f30405peridotite = new attabal();

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
    public static final p002kotlin.reflect.jvm.internal.impl.descriptors.attabal.InterfaceC0672attabal<Boolean> f30404mathsort = new saneness();

    public enum ParameterNamesStatus {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);

        public final boolean isStable;
        public final boolean isSynthesized;

        ParameterNamesStatus(boolean z, boolean z2) {
            this.isStable = z;
            this.isSynthesized = z2;
        }

        public static /* synthetic */ void attabal(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        public static ParameterNamesStatus get(boolean z, boolean z2) {
            ParameterNamesStatus parameterNamesStatus;
            if (z) {
                parameterNamesStatus = z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED;
            } else {
                parameterNamesStatus = z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            }
            if (parameterNamesStatus == null) {
                attabal(0);
            }
            return parameterNamesStatus;
        }
    }

    public static class attabal implements p002kotlin.reflect.jvm.internal.impl.descriptors.attabal.InterfaceC0672attabal<cultivated> {
    }

    public static class saneness implements p002kotlin.reflect.jvm.internal.impl.descriptors.attabal.InterfaceC0672attabal<Boolean> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaMethodDescriptor(apical apicalVar, hydrovane hydrovaneVar, marial marialVar, byname.marial marialVar2, CallableMemberDescriptor.Kind kind, walach walachVar, boolean z) {
        super(apicalVar, hydrovaneVar, marialVar, marialVar2, kind, walachVar);
        if (apicalVar == null) {
            timberyard(0);
        }
        if (marialVar == null) {
            timberyard(1);
        }
        if (marialVar2 == null) {
            timberyard(2);
        }
        if (kind == null) {
            timberyard(3);
        }
        if (walachVar == null) {
            timberyard(4);
        }
        this.f30406hydrovane = null;
        this.f30407walach = z;
    }

    private static /* synthetic */ void timberyard(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = MobileAdsBridgeBase.initializeMethodName;
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static JavaMethodDescriptor vir(apical apicalVar, marial marialVar, byname.marial marialVar2, walach walachVar, boolean z) {
        if (apicalVar == null) {
            timberyard(5);
        }
        if (marialVar == null) {
            timberyard(6);
        }
        if (marialVar2 == null) {
            timberyard(7);
        }
        if (walachVar == null) {
            timberyard(8);
        }
        return new JavaMethodDescriptor(apicalVar, null, marialVar, marialVar2, CallableMemberDescriptor.Kind.DECLARATION, walachVar, z);
    }

    public void incorrectly(boolean z, boolean z2) {
        this.f30406hydrovane = ParameterNamesStatus.get(z, z2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon
    public boolean lampshade() {
        return this.f30406hydrovane.isStable;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.oilcan
    public oilcan liable(starveling starvelingVar, starveling starvelingVar2, List<starveling> list, List<? extends clubfoot> list2, List<cultivated> list3, p002kotlin.reflect.jvm.internal.impl.types.oilcan oilcanVar, Modality modality, molybdenite molybdeniteVar, Map<? extends p002kotlin.reflect.jvm.internal.impl.descriptors.attabal.InterfaceC0672attabal<?>, ?> map) {
        if (list == null) {
            timberyard(9);
        }
        if (list2 == null) {
            timberyard(10);
        }
        if (list3 == null) {
            timberyard(11);
        }
        if (molybdeniteVar == null) {
            timberyard(12);
        }
        oilcan oilcanVarLiable = super.liable(starvelingVar, starvelingVar2, list, list2, list3, oilcanVar, modality, molybdeniteVar, map);
        tarboosh(OperatorChecks.f31832attabal.attabal(oilcanVarLiable).attabal());
        if (oilcanVarLiable == null) {
            timberyard(13);
        }
        return oilcanVarLiable;
    }

    @Override // methylmercury.attabal
    /* JADX INFO: renamed from: miliaria, reason: merged with bridge method [inline-methods] */
    public JavaMethodDescriptor splinterproof(p002kotlin.reflect.jvm.internal.impl.types.oilcan oilcanVar, List<p002kotlin.reflect.jvm.internal.impl.types.oilcan> list, p002kotlin.reflect.jvm.internal.impl.types.oilcan oilcanVar2, Pair<p002kotlin.reflect.jvm.internal.impl.descriptors.attabal.InterfaceC0672attabal<?>, ?> pair) {
        if (list == null) {
            timberyard(19);
        }
        if (oilcanVar2 == null) {
            timberyard(20);
        }
        JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) monoploid().saneness(competently.attabal(list, beachfront(), this)).formularize(oilcanVar2).marial(oilcanVar == null ? null : wireman.taiyuan(this, oilcanVar, marial.f29950impromptu.saneness())).attabal().apical().build();
        if (pair != null) {
            javaMethodDescriptor.sakeen(pair.getFirst(), pair.getSecond());
        }
        if (javaMethodDescriptor == null) {
            timberyard(21);
        }
        return javaMethodDescriptor;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public boolean premeiotic() {
        return this.f30406hydrovane.isSynthesized;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.oilcan, p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon
    /* JADX INFO: renamed from: twybill, reason: merged with bridge method [inline-methods] */
    public JavaMethodDescriptor vesuvio(apical apicalVar, dovishness dovishnessVar, CallableMemberDescriptor.Kind kind, byname.marial marialVar, marial marialVar2, walach walachVar) {
        if (apicalVar == null) {
            timberyard(14);
        }
        if (kind == null) {
            timberyard(15);
        }
        if (marialVar2 == null) {
            timberyard(16);
        }
        if (walachVar == null) {
            timberyard(17);
        }
        hydrovane hydrovaneVar = (hydrovane) dovishnessVar;
        if (marialVar == null) {
            marialVar = getName();
        }
        JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(apicalVar, hydrovaneVar, marialVar2, marialVar, kind, walachVar, this.f30407walach);
        javaMethodDescriptor.incorrectly(lampshade(), premeiotic());
        return javaMethodDescriptor;
    }
}
