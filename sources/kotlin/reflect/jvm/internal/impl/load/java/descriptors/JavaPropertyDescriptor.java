package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;

/* JADX INFO: loaded from: classes7.dex */
public class JavaPropertyDescriptor extends PropertyDescriptorImpl implements JavaCallableMemberDescriptor {
    public final boolean B0;
    public final Pair C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaPropertyDescriptor(DeclarationDescriptor declarationDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z2, Name name, SourceElement sourceElement, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, boolean z3, Pair pair) {
        super(declarationDescriptor, propertyDescriptor, annotations, modality, descriptorVisibility, z2, name, kind, sourceElement, false, false, false, false, false);
        if (declarationDescriptor == null) {
            Z(0);
            throw null;
        }
        if (annotations == null) {
            Z(1);
            throw null;
        }
        if (modality == null) {
            Z(2);
            throw null;
        }
        if (descriptorVisibility == null) {
            Z(3);
            throw null;
        }
        if (name == null) {
            Z(4);
            throw null;
        }
        if (sourceElement == null) {
            Z(5);
            throw null;
        }
        if (kind == null) {
            Z(6);
            throw null;
        }
        this.B0 = z3;
        this.C0 = pair;
    }

    public static JavaPropertyDescriptor N0(DeclarationDescriptor declarationDescriptor, LazyJavaAnnotations lazyJavaAnnotations, DescriptorVisibility descriptorVisibility, boolean z2, Name name, JavaSourceElement javaSourceElement, boolean z3) {
        Modality modality = Modality.X;
        if (declarationDescriptor == null) {
            Z(7);
            throw null;
        }
        if (name == null) {
            Z(11);
            throw null;
        }
        if (javaSourceElement != null) {
            return new JavaPropertyDescriptor(declarationDescriptor, lazyJavaAnnotations, modality, descriptorVisibility, z2, name, javaSourceElement, null, CallableMemberDescriptor.Kind.X, z3, null);
        }
        Z(12);
        throw null;
    }

    public static /* synthetic */ void Z(int i2) {
        String str = i2 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 21 ? 3 : 2];
        switch (i2) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i2 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    public final PropertyDescriptorImpl J0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, Name name) {
        SourceElement sourceElement = SourceElement.f43591a;
        if (declarationDescriptor == null) {
            Z(13);
            throw null;
        }
        if (modality == null) {
            Z(14);
            throw null;
        }
        if (descriptorVisibility == null) {
            Z(15);
            throw null;
        }
        if (kind == null) {
            Z(16);
            throw null;
        }
        if (name == null) {
            Z(17);
            throw null;
        }
        return new JavaPropertyDescriptor(declarationDescriptor, getAnnotations(), modality, descriptorVisibility, this.g0, name, sourceElement, propertyDescriptor, kind, this.B0, this.C0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    public final void L0(KotlinType kotlinType) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final boolean Y() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public final boolean isConst() {
        KotlinType type = getType();
        if (!this.B0) {
            return false;
        }
        Intrinsics.f(type, "type");
        if (((!KotlinBuiltIns.F(type) && !UnsignedTypes.a(type)) || TypeUtils.e(type)) && !KotlinBuiltIns.G(type)) {
            return false;
        }
        Annotations annotations = TypeEnhancementKt.f43957a;
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.f43773p;
        Intrinsics.e(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return !ClassicTypeSystemContext.DefaultImpls.w(type, ENHANCED_NULLABILITY_ANNOTATION) || KotlinBuiltIns.G(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final Object n0(CallableDescriptor.UserDataKey userDataKey) {
        CallableDescriptor.UserDataKey userDataKey2 = JavaMethodDescriptor.I0;
        Pair pair = this.C0;
        if (pair == null || !((CallableDescriptor.UserDataKey) pair.X).equals(userDataKey2)) {
            return null;
        }
        return pair.f43249Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public final JavaCallableMemberDescriptor p0(KotlinType kotlinType, ArrayList arrayList, KotlinType kotlinType2, Pair pair) {
        KotlinType kotlinType3;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        PropertyDescriptor propertyDescriptorY0 = y0() == this ? null : y0();
        JavaPropertyDescriptor javaPropertyDescriptor = new JavaPropertyDescriptor(d(), getAnnotations(), q(), getVisibility(), this.g0, getName(), f(), propertyDescriptorY0, getKind(), this.B0, pair);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = this.x0;
        if (propertyGetterDescriptorImpl2 != null) {
            PropertyGetterDescriptorImpl propertyGetterDescriptorImpl3 = new PropertyGetterDescriptorImpl(javaPropertyDescriptor, propertyGetterDescriptorImpl2.getAnnotations(), propertyGetterDescriptorImpl2.q(), propertyGetterDescriptorImpl2.getVisibility(), propertyGetterDescriptorImpl2.f0, propertyGetterDescriptorImpl2.g0, propertyGetterDescriptorImpl2.j0, getKind(), propertyDescriptorY0 == null ? null : propertyDescriptorY0.getGetter(), propertyGetterDescriptorImpl2.f());
            propertyGetterDescriptorImpl3.m0 = propertyGetterDescriptorImpl2.m0;
            kotlinType3 = kotlinType2;
            propertyGetterDescriptorImpl3.n0 = kotlinType3;
            propertyGetterDescriptorImpl = propertyGetterDescriptorImpl3;
        } else {
            kotlinType3 = kotlinType2;
            propertyGetterDescriptorImpl = null;
        }
        PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = this.y0;
        if (propertySetterDescriptorImpl2 != null) {
            propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(javaPropertyDescriptor, propertySetterDescriptorImpl2.getAnnotations(), propertySetterDescriptorImpl2.q(), propertySetterDescriptorImpl2.getVisibility(), propertySetterDescriptorImpl2.f0, propertySetterDescriptorImpl2.g0, propertySetterDescriptorImpl2.j0, getKind(), propertyDescriptorY0 == null ? null : propertyDescriptorY0.getSetter(), propertySetterDescriptorImpl2.f());
            propertySetterDescriptorImpl.m0 = propertySetterDescriptorImpl.m0;
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) propertySetterDescriptorImpl2.e().get(0);
            if (valueParameterDescriptor == null) {
                PropertySetterDescriptorImpl.Z(6);
                throw null;
            }
            propertySetterDescriptorImpl.n0 = valueParameterDescriptor;
        } else {
            propertySetterDescriptorImpl = null;
        }
        javaPropertyDescriptor.K0(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, this.z0, this.A0);
        ?? r2 = this.i0;
        if (r2 != 0) {
            javaPropertyDescriptor.G0(this.h0, r2);
        }
        javaPropertyDescriptor.x0(l());
        javaPropertyDescriptor.M0(kotlinType3, getTypeParameters(), this.u0, kotlinType != null ? DescriptorFactory.h(this, kotlinType, Annotations.Companion.f43614a) : null, EmptyList.X);
        return javaPropertyDescriptor;
    }
}
