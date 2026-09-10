package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public class SimpleFunctionDescriptorImpl extends FunctionDescriptorImpl implements SimpleFunctionDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleFunctionDescriptorImpl(DeclarationDescriptor declarationDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor, Annotations annotations, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(kind, declarationDescriptor, simpleFunctionDescriptor, sourceElement, annotations, name);
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
        if (sourceElement != null) {
        } else {
            Z(4);
            throw null;
        }
    }

    public static SimpleFunctionDescriptorImpl Q0(ClassDescriptor classDescriptor, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1 = Annotations.Companion.f43614a;
        if (classDescriptor == null) {
            Z(5);
            throw null;
        }
        if (name == null) {
            Z(7);
            throw null;
        }
        if (sourceElement != null) {
            return new SimpleFunctionDescriptorImpl(classDescriptor, null, annotations$Companion$EMPTY$1, name, kind, sourceElement);
        }
        Z(9);
        throw null;
    }

    public static /* synthetic */ void Z(int i2) {
        String str = (i2 == 13 || i2 == 18 || i2 == 23 || i2 == 24 || i2 == 29 || i2 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 13 || i2 == 18 || i2 == 23 || i2 == 24 || i2 == 29 || i2 == 30) ? 2 : 3];
        switch (i2) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i2 == 13 || i2 == 18 || i2 == 23) {
            objArr[1] = MobileAdsBridgeBase.initializeMethodName;
        } else if (i2 == 24) {
            objArr[1] = "getOriginal";
        } else if (i2 == 29) {
            objArr[1] = "copy";
        } else if (i2 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i2) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 13 && i2 != 18 && i2 != 23 && i2 != 24 && i2 != 29 && i2 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public FunctionDescriptor.CopyBuilder A0() {
        return K0(TypeSubstitutor.f44550b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public FunctionDescriptorImpl G0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        if (declarationDescriptor == null) {
            Z(25);
            throw null;
        }
        if (kind == null) {
            Z(26);
            throw null;
        }
        if (annotations == null) {
            Z(27);
            throw null;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name == null) {
            name = getName();
        }
        return new SimpleFunctionDescriptorImpl(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public SimpleFunctionDescriptor C0(ClassDescriptor classDescriptor, Modality modality, DelegatedDescriptorVisibility delegatedDescriptorVisibility) {
        return (SimpleFunctionDescriptor) super.C0(classDescriptor, modality, delegatedDescriptorVisibility);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final SimpleFunctionDescriptor y0() {
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) super.y0();
        if (simpleFunctionDescriptor != null) {
            return simpleFunctionDescriptor;
        }
        Z(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final SimpleFunctionDescriptorImpl J0(ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl, ReceiverParameterDescriptor receiverParameterDescriptor, List list, List list2, List list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            Z(14);
            throw null;
        }
        if (list2 == null) {
            Z(15);
            throw null;
        }
        if (list3 == null) {
            Z(16);
            throw null;
        }
        if (descriptorVisibility != null) {
            return T0(receiverParameterDescriptorImpl, receiverParameterDescriptor, list, list2, list3, kotlinType, modality, descriptorVisibility, null);
        }
        Z(17);
        throw null;
    }

    public SimpleFunctionDescriptorImpl T0(ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl, ReceiverParameterDescriptor receiverParameterDescriptor, List list, List list2, List list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map map) {
        if (list == null) {
            Z(19);
            throw null;
        }
        if (list2 == null) {
            Z(20);
            throw null;
        }
        if (list3 == null) {
            Z(21);
            throw null;
        }
        if (descriptorVisibility == null) {
            Z(22);
            throw null;
        }
        super.J0(receiverParameterDescriptorImpl, receiverParameterDescriptor, list, list2, list3, kotlinType, modality, descriptorVisibility);
        if (map != null && !map.isEmpty()) {
            this.E0 = new LinkedHashMap(map);
        }
        return this;
    }
}
