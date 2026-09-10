package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PropertyAccessorDescriptorImpl extends DeclarationDescriptorNonRootImpl implements PropertyAccessorDescriptor {
    public boolean f0;
    public final boolean g0;
    public final Modality h0;
    public final PropertyDescriptor i0;
    public final boolean j0;
    public final CallableMemberDescriptor.Kind k0;
    public DescriptorVisibility l0;
    public FunctionDescriptor m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyAccessorDescriptorImpl(Modality modality, DescriptorVisibility descriptorVisibility, PropertyDescriptor propertyDescriptor, Annotations annotations, Name name, boolean z2, boolean z3, boolean z4, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(propertyDescriptor.d(), annotations, name, sourceElement);
        if (modality == null) {
            Z(0);
            throw null;
        }
        if (descriptorVisibility == null) {
            Z(1);
            throw null;
        }
        if (annotations == null) {
            Z(3);
            throw null;
        }
        if (sourceElement == null) {
            Z(5);
            throw null;
        }
        this.m0 = null;
        this.h0 = modality;
        this.l0 = descriptorVisibility;
        this.i0 = propertyDescriptor;
        this.f0 = z2;
        this.g0 = z3;
        this.j0 = z4;
        this.k0 = kind;
    }

    public static /* synthetic */ void Z(int i2) {
        String str;
        int i3;
        switch (i2) {
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
        switch (i2) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i3 = 2;
                break;
            case 7:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
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
        switch (i2) {
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
        switch (i2) {
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
        switch (i2) {
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor C0(ClassDescriptor classDescriptor, Modality modality, DelegatedDescriptorVisibility delegatedDescriptorVisibility) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    /* JADX INFO: renamed from: F0 */
    public abstract PropertyAccessorDescriptor y0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final ReceiverParameterDescriptor G() {
        return P().G();
    }

    public final ArrayList G0(boolean z2) {
        ArrayList arrayList = new ArrayList(0);
        for (PropertyDescriptor propertyDescriptor : P().l()) {
            CallableDescriptor getter = z2 ? propertyDescriptor.getGetter() : propertyDescriptor.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final ReceiverParameterDescriptor J() {
        return P().J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor
    public final PropertyDescriptor P() {
        PropertyDescriptor propertyDescriptor = this.i0;
        if (propertyDescriptor != null) {
            return propertyDescriptor;
        }
        Z(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean R() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final boolean Y() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final FunctionDescriptor b(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return this;
        }
        Z(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean d0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.k0;
        if (kind != null) {
            return kind;
        }
        Z(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        Z(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.l0;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        Z(11);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return this.g0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean isInline() {
        return this.j0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final FunctionDescriptor l0() {
        return this.m0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final Object n0(CallableDescriptor.UserDataKey userDataKey) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final Modality q() {
        Modality modality = this.h0;
        if (modality != null) {
            return modality;
        }
        Z(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final List r0() {
        List listR0 = P().r0();
        if (listR0 != null) {
            return listR0;
        }
        Z(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean w0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void x0(Collection collection) {
        if (collection != null) {
            return;
        }
        Z(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean y() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean z0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final /* bridge */ /* synthetic */ DeclarationDescriptorNonRoot b(TypeSubstitutor typeSubstitutor) {
        b(typeSubstitutor);
        return this;
    }
}
