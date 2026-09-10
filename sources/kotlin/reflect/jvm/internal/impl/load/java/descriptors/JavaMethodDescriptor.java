package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.util.Check;
import kotlin.reflect.jvm.internal.impl.util.CheckResult;
import kotlin.reflect.jvm.internal.impl.util.Checks;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes7.dex */
public class JavaMethodDescriptor extends SimpleFunctionDescriptorImpl implements JavaCallableMemberDescriptor {
    public static final CallableDescriptor.UserDataKey H0 = new AnonymousClass1();
    public static final CallableDescriptor.UserDataKey I0 = new AnonymousClass2();
    public ParameterNamesStatus F0;
    public final boolean G0;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$1, reason: invalid class name */
    public static class AnonymousClass1 implements CallableDescriptor.UserDataKey<ValueParameterDescriptor> {
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$2, reason: invalid class name */
    public static class AnonymousClass2 implements CallableDescriptor.UserDataKey<Boolean> {
    }

    public enum ParameterNamesStatus {
        Z("NON_STABLE_DECLARED", false),
        e0("STABLE_DECLARED", false),
        f0("NON_STABLE_SYNTHESIZED", true),
        g0("STABLE_SYNTHESIZED", true);

        public final boolean X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final boolean f43821Y;

        ParameterNamesStatus(String str, boolean z2) {
            this.X = z;
            this.f43821Y = z2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaMethodDescriptor(DeclarationDescriptor declarationDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor, Annotations annotations, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, boolean z2) {
        super(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
        if (declarationDescriptor == null) {
            Z(0);
            throw null;
        }
        if (annotations == null) {
            Z(1);
            throw null;
        }
        if (name == null) {
            Z(2);
            throw null;
        }
        if (kind == null) {
            Z(3);
            throw null;
        }
        if (sourceElement == null) {
            Z(4);
            throw null;
        }
        this.F0 = null;
        this.G0 = z2;
    }

    public static JavaMethodDescriptor U0(DeclarationDescriptor declarationDescriptor, LazyJavaAnnotations lazyJavaAnnotations, Name name, JavaSourceElement javaSourceElement, boolean z2) {
        if (declarationDescriptor == null) {
            Z(5);
            throw null;
        }
        if (name == null) {
            Z(7);
            throw null;
        }
        if (javaSourceElement != null) {
            return new JavaMethodDescriptor(declarationDescriptor, null, lazyJavaAnnotations, name, CallableMemberDescriptor.Kind.X, javaSourceElement, z2);
        }
        Z(8);
        throw null;
    }

    public static /* synthetic */ void Z(int i2) {
        String str = (i2 == 13 || i2 == 18 || i2 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 13 || i2 == 18 || i2 == 21) ? 2 : 3];
        switch (i2) {
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
        if (i2 == 13) {
            objArr[1] = MobileAdsBridgeBase.initializeMethodName;
        } else if (i2 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i2 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i2) {
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
        if (i2 != 13 && i2 != 18 && i2 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl G0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        if (declarationDescriptor == null) {
            Z(14);
            throw null;
        }
        if (kind == null) {
            Z(15);
            throw null;
        }
        if (annotations == null) {
            Z(16);
            throw null;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name == null) {
            name = getName();
        }
        JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement, this.G0);
        ParameterNamesStatus parameterNamesStatus = this.F0;
        javaMethodDescriptor.V0(parameterNamesStatus.X, parameterNamesStatus.f43821Y);
        return javaMethodDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    public final SimpleFunctionDescriptorImpl T0(ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl, ReceiverParameterDescriptor receiverParameterDescriptor, List list, List list2, List list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map map) {
        CheckResult illegalSignature;
        if (list == null) {
            Z(9);
            throw null;
        }
        if (list2 == null) {
            Z(10);
            throw null;
        }
        if (list3 == null) {
            Z(11);
            throw null;
        }
        if (descriptorVisibility == null) {
            Z(12);
            throw null;
        }
        super.T0(receiverParameterDescriptorImpl, receiverParameterDescriptor, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
        List list4 = OperatorChecks.f44620a;
        for (Checks checks : OperatorChecks.f44620a) {
            checks.getClass();
            Name name = checks.f44608a;
            if (name == null || Intrinsics.a(getName(), name)) {
                Regex regex = checks.f44609b;
                if (regex != null) {
                    String strB = getName().b();
                    Intrinsics.e(strB, "functionDescriptor.name.asString()");
                    if (!regex.b(strB)) {
                        continue;
                    }
                }
                Collection collection = checks.f44610c;
                if (collection == null || collection.contains(getName())) {
                    for (Check check : checks.f44611e) {
                        if (check.b(this) != null) {
                            illegalSignature = new CheckResult.IllegalSignature(false);
                            this.n0 = illegalSignature.f44605a;
                            return this;
                        }
                    }
                    illegalSignature = ((String) checks.d.invoke(this)) != null ? new CheckResult.IllegalSignature(false) : CheckResult.SuccessCheck.f44607b;
                    this.n0 = illegalSignature.f44605a;
                    return this;
                }
            }
        }
        illegalSignature = CheckResult.IllegalFunctionName.f44606b;
        this.n0 = illegalSignature.f44605a;
        return this;
    }

    public final void V0(boolean z2, boolean z3) {
        ParameterNamesStatus parameterNamesStatus;
        if (z2) {
            parameterNamesStatus = z3 ? ParameterNamesStatus.g0 : ParameterNamesStatus.e0;
        } else {
            parameterNamesStatus = z3 ? ParameterNamesStatus.f0 : ParameterNamesStatus.Z;
        }
        this.F0 = parameterNamesStatus;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final boolean Y() {
        return this.F0.f43821Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public final JavaCallableMemberDescriptor p0(KotlinType kotlinType, ArrayList arrayList, KotlinType kotlinType2, Pair pair) {
        ArrayList arrayListA = UtilKt.a(arrayList, e(), this);
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImplH = kotlinType == null ? null : DescriptorFactory.h(this, kotlinType, Annotations.Companion.f43614a);
        FunctionDescriptorImpl.CopyConfiguration copyConfigurationK0 = K0(TypeSubstitutor.f44550b);
        copyConfigurationK0.g = arrayListA;
        copyConfigurationK0.k = kotlinType2;
        copyConfigurationK0.f43644i = receiverParameterDescriptorImplH;
        copyConfigurationK0.f43647p = true;
        copyConfigurationK0.o = true;
        JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) copyConfigurationK0.x.H0(copyConfigurationK0);
        if (pair != null) {
            javaMethodDescriptor.L0((CallableDescriptor.UserDataKey) pair.X, pair.f43249Y);
        }
        if (javaMethodDescriptor != null) {
            return javaMethodDescriptor;
        }
        Z(21);
        throw null;
    }
}
