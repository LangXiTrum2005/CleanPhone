package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public class ClassConstructorDescriptorImpl extends FunctionDescriptorImpl implements ClassConstructorDescriptor {
    public final boolean F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassConstructorDescriptorImpl(ClassDescriptor classDescriptor, ConstructorDescriptor constructorDescriptor, Annotations annotations, boolean z2, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(kind, classDescriptor, constructorDescriptor, sourceElement, annotations, SpecialNames.f44176e);
        if (classDescriptor == null) {
            Z(0);
            throw null;
        }
        if (annotations == null) {
            Z(1);
            throw null;
        }
        if (kind == null) {
            Z(2);
            throw null;
        }
        if (sourceElement == null) {
            Z(3);
            throw null;
        }
        this.F0 = z2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public static /* synthetic */ void Z(int i2) {
        String str;
        int i3;
        if (i2 != 21 && i2 != 27) {
            switch (i2) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i2 != 21 && i2 != 27) {
            switch (i2) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i3 = 2;
                    break;
                default:
                    i3 = 3;
                    break;
            }
        } else {
            i3 = 2;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i2 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i2 != 27) {
            switch (i2) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 21 && i2 != 27) {
            switch (i2) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor C0(ClassDescriptor classDescriptor, Modality modality, DelegatedDescriptorVisibility delegatedDescriptorVisibility) {
        return (ClassConstructorDescriptor) super.C0(classDescriptor, modality, delegatedDescriptorVisibility);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* JADX INFO: renamed from: F0 */
    public final FunctionDescriptor C0(ClassDescriptor classDescriptor, Modality modality, DelegatedDescriptorVisibility delegatedDescriptorVisibility) {
        return (ClassConstructorDescriptor) super.C0(classDescriptor, modality, delegatedDescriptorVisibility);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public ClassConstructorDescriptorImpl G0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        if (declarationDescriptor == null) {
            Z(23);
            throw null;
        }
        if (kind == null) {
            Z(24);
            throw null;
        }
        if (annotations == null) {
            Z(25);
            throw null;
        }
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.X;
        if (kind == kind2 || kind == CallableMemberDescriptor.Kind.e0) {
            return new ClassConstructorDescriptorImpl((ClassDescriptor) declarationDescriptor, this, annotations, this.F0, kind2, sourceElement);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor + "\nkind: " + kind);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final ClassDescriptor d() {
        ClassDescriptor classDescriptor = (ClassDescriptor) super.d();
        if (classDescriptor != null) {
            return classDescriptor;
        }
        Z(17);
        throw null;
    }

    public final void R0(List list, DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            Z(13);
            throw null;
        }
        if (descriptorVisibility != null) {
            S0(list, descriptorVisibility, d().p());
        } else {
            Z(14);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public final void S0(List list, DescriptorVisibility descriptorVisibility, List list2) {
        ReceiverParameterDescriptor receiverParameterDescriptorE0;
        List listS;
        if (list == null) {
            Z(10);
            throw null;
        }
        if (descriptorVisibility == null) {
            Z(11);
            throw null;
        }
        if (list2 == null) {
            Z(12);
            throw null;
        }
        ClassDescriptor classDescriptorD = d();
        if (classDescriptorD.w()) {
            DeclarationDescriptor declarationDescriptorD = classDescriptorD.d();
            if (declarationDescriptorD instanceof ClassDescriptor) {
                receiverParameterDescriptorE0 = ((ClassDescriptor) declarationDescriptorD).E0();
            } else {
                receiverParameterDescriptorE0 = null;
            }
        } else {
            receiverParameterDescriptorE0 = null;
        }
        ClassDescriptor classDescriptorD2 = d();
        if (classDescriptorD2.S().isEmpty()) {
            listS = Collections.EMPTY_LIST;
            if (listS == null) {
                Z(16);
                throw null;
            }
        } else {
            listS = classDescriptorD2.S();
            if (listS == null) {
                Z(15);
                throw null;
            }
        }
        J0(null, receiverParameterDescriptorE0, listS, list2, list, null, Modality.X, descriptorVisibility);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public final boolean U() {
        return this.F0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
    public final ClassDescriptor V() {
        ClassDescriptor classDescriptorD = d();
        if (classDescriptorD != null) {
            return classDescriptorD;
        }
        Z(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final Collection l() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        Z(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object v(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.k(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void x0(Collection collection) {
        if (collection != null) {
            return;
        }
        Z(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final ClassConstructorDescriptor b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return (ClassConstructorDescriptor) super.b(typeSubstitutor);
        }
        Z(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    /* JADX INFO: renamed from: a */
    public final ClassConstructorDescriptor y0() {
        ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) super.y0();
        if (classConstructorDescriptor != null) {
            return classConstructorDescriptor;
        }
        Z(19);
        throw null;
    }
}
