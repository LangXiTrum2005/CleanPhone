package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes7.dex */
public class DescriptorFactory {

    public static class DefaultClassConstructorDescriptor extends ClassConstructorDescriptorImpl {
    }

    public static /* synthetic */ void a(int i2) {
        String str = (i2 == 12 || i2 == 23 || i2 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 12 || i2 == 23 || i2 == 25) ? 2 : 3];
        switch (i2) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i2 == 12) {
            objArr[1] = "createSetter";
        } else if (i2 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i2 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i2) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 12 && i2 != 23 && i2 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static ReceiverParameterDescriptorImpl b(CallableDescriptor callableDescriptor, KotlinType kotlinType, Name name, Annotations annotations, int i2) {
        if (annotations == null) {
            a(33);
            throw null;
        }
        if (kotlinType == null) {
            return null;
        }
        ContextReceiver contextReceiver = new ContextReceiver(callableDescriptor, kotlinType, name, null);
        Regex regex = NameUtils.f44172a;
        return new ReceiverParameterDescriptorImpl(callableDescriptor, contextReceiver, annotations, Name.g("_context_receiver_" + i2));
    }

    public static PropertyGetterDescriptorImpl c(PropertyDescriptor propertyDescriptor, Annotations annotations) {
        return i(propertyDescriptor, annotations, true, propertyDescriptor.f());
    }

    public static PropertySetterDescriptorImpl d(PropertyDescriptor propertyDescriptor, Annotations annotations) {
        Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1 = Annotations.Companion.f43614a;
        SourceElement sourceElementF = propertyDescriptor.f();
        if (sourceElementF != null) {
            return k(propertyDescriptor, annotations, annotations$Companion$EMPTY$1, true, propertyDescriptor.getVisibility(), sourceElementF);
        }
        a(6);
        throw null;
    }

    public static PropertyDescriptorImpl e(AbstractClassDescriptor abstractClassDescriptor) {
        if (abstractClassDescriptor == null) {
            a(26);
            throw null;
        }
        ClassDescriptor classDescriptorA = FindClassInModuleKt.a(DescriptorUtils.d(abstractClassDescriptor), StandardClassIds.t);
        if (classDescriptorA == null) {
            return null;
        }
        Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1 = Annotations.Companion.f43614a;
        Modality modality = Modality.X;
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f43564e;
        Name name = StandardNames.f43473b;
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.e0;
        PropertyDescriptorImpl propertyDescriptorImplI0 = PropertyDescriptorImpl.I0(abstractClassDescriptor, modality, descriptorVisibility, false, name, kind, abstractClassDescriptor.f());
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(propertyDescriptorImplI0, annotations$Companion$EMPTY$1, modality, descriptorVisibility, false, false, false, kind, null, abstractClassDescriptor.f());
        propertyDescriptorImplI0.K0(propertyGetterDescriptorImpl, null, null, null);
        TypeAttributes.f44529Y.getClass();
        TypeAttributes attributes = TypeAttributes.Z;
        TypeConstructor constructor = classDescriptorA.h();
        List arguments = Collections.singletonList(new TypeProjectionImpl(abstractClassDescriptor.o()));
        Intrinsics.f(attributes, "attributes");
        Intrinsics.f(constructor, "constructor");
        Intrinsics.f(arguments, "arguments");
        SimpleType simpleTypeD = KotlinTypeFactory.d(attributes, constructor, arguments, false, null);
        List list = Collections.EMPTY_LIST;
        propertyDescriptorImplI0.M0(simpleTypeD, list, null, null, list);
        propertyGetterDescriptorImpl.I0(propertyDescriptorImplI0.getReturnType());
        return propertyDescriptorImplI0;
    }

    public static SimpleFunctionDescriptorImpl f(AbstractClassDescriptor abstractClassDescriptor) {
        if (abstractClassDescriptor == null) {
            a(24);
            throw null;
        }
        Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1 = Annotations.Companion.f43614a;
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplQ0 = SimpleFunctionDescriptorImpl.Q0(abstractClassDescriptor, StandardNames.f43474c, CallableMemberDescriptor.Kind.e0, abstractClassDescriptor.f());
        ValueParameterDescriptorImpl valueParameterDescriptorImpl = new ValueParameterDescriptorImpl(simpleFunctionDescriptorImplQ0, null, 0, annotations$Companion$EMPTY$1, Name.g("value"), DescriptorUtilsKt.e(abstractClassDescriptor).t(), false, false, false, null, abstractClassDescriptor.f());
        List list = Collections.EMPTY_LIST;
        return simpleFunctionDescriptorImplQ0.J0(null, null, list, list, Collections.singletonList(valueParameterDescriptorImpl), abstractClassDescriptor.o(), Modality.X, DescriptorVisibilities.f43564e);
    }

    public static SimpleFunctionDescriptorImpl g(AbstractClassDescriptor abstractClassDescriptor) {
        if (abstractClassDescriptor == null) {
            a(22);
            throw null;
        }
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplQ0 = SimpleFunctionDescriptorImpl.Q0(abstractClassDescriptor, StandardNames.f43472a, CallableMemberDescriptor.Kind.e0, abstractClassDescriptor.f());
        List list = Collections.EMPTY_LIST;
        return simpleFunctionDescriptorImplQ0.J0(null, null, list, list, list, DescriptorUtilsKt.e(abstractClassDescriptor).g(abstractClassDescriptor.o()), Modality.X, DescriptorVisibilities.f43564e);
    }

    public static ReceiverParameterDescriptorImpl h(CallableDescriptor callableDescriptor, KotlinType kotlinType, Annotations annotations) {
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(callableDescriptor, new ExtensionReceiver(callableDescriptor, kotlinType, null), annotations);
    }

    public static PropertyGetterDescriptorImpl i(PropertyDescriptor propertyDescriptor, Annotations annotations, boolean z2, SourceElement sourceElement) {
        if (annotations == null) {
            a(18);
            throw null;
        }
        if (sourceElement != null) {
            return new PropertyGetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.q(), propertyDescriptor.getVisibility(), z2, false, false, CallableMemberDescriptor.Kind.X, null, sourceElement);
        }
        a(19);
        throw null;
    }

    public static ClassConstructorDescriptorImpl j(ClassDescriptor classDescriptor) {
        DescriptorVisibility descriptorVisibility;
        SourceElement sourceElement = SourceElement.f43591a;
        if (classDescriptor == null) {
            a(20);
            throw null;
        }
        DefaultClassConstructorDescriptor defaultClassConstructorDescriptor = new DefaultClassConstructorDescriptor(classDescriptor, null, Annotations.Companion.f43614a, true, CallableMemberDescriptor.Kind.X, sourceElement);
        List list = Collections.EMPTY_LIST;
        int i2 = DescriptorUtils.f44280a;
        ClassKind kind = classDescriptor.getKind();
        if (kind == ClassKind.Z || kind.d()) {
            descriptorVisibility = DescriptorVisibilities.f43561a;
            if (descriptorVisibility == null) {
                DescriptorUtils.a(49);
                throw null;
            }
        } else if (DescriptorUtils.q(classDescriptor)) {
            descriptorVisibility = DescriptorVisibilities.f43561a;
            if (descriptorVisibility == null) {
                DescriptorUtils.a(51);
                throw null;
            }
        } else if (DescriptorUtils.k(classDescriptor)) {
            descriptorVisibility = DescriptorVisibilities.k;
            if (descriptorVisibility == null) {
                DescriptorUtils.a(52);
                throw null;
            }
        } else {
            descriptorVisibility = DescriptorVisibilities.f43564e;
            if (descriptorVisibility == null) {
                DescriptorUtils.a(53);
                throw null;
            }
        }
        defaultClassConstructorDescriptor.R0(list, descriptorVisibility);
        return defaultClassConstructorDescriptor;
    }

    public static PropertySetterDescriptorImpl k(PropertyDescriptor propertyDescriptor, Annotations annotations, Annotations annotations2, boolean z2, DescriptorVisibility descriptorVisibility, SourceElement sourceElement) {
        if (annotations == null) {
            a(8);
            throw null;
        }
        if (annotations2 == null) {
            a(9);
            throw null;
        }
        if (descriptorVisibility == null) {
            a(10);
            throw null;
        }
        if (sourceElement == null) {
            a(11);
            throw null;
        }
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.q(), descriptorVisibility, z2, false, false, CallableMemberDescriptor.Kind.X, null, sourceElement);
        propertySetterDescriptorImpl.n0 = PropertySetterDescriptorImpl.H0(propertySetterDescriptorImpl, propertyDescriptor.getType(), annotations2);
        return propertySetterDescriptorImpl;
    }

    public static boolean l(FunctionDescriptor functionDescriptor) {
        return functionDescriptor.getKind() == CallableMemberDescriptor.Kind.e0 && DescriptorUtils.n(functionDescriptor.d(), ClassKind.Z);
    }
}
