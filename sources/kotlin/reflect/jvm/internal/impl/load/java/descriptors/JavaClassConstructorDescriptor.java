package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public class JavaClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements JavaCallableMemberDescriptor {
    public Boolean G0;
    public Boolean H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaClassConstructorDescriptor(ClassDescriptor classDescriptor, JavaClassConstructorDescriptor javaClassConstructorDescriptor, Annotations annotations, boolean z2, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(classDescriptor, javaClassConstructorDescriptor, annotations, z2, kind, sourceElement);
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
        this.G0 = null;
        this.H0 = null;
    }

    public static JavaClassConstructorDescriptor T0(ClassDescriptor classDescriptor, Annotations annotations, boolean z2, JavaSourceElement javaSourceElement) {
        if (classDescriptor == null) {
            Z(4);
            throw null;
        }
        if (javaSourceElement != null) {
            return new JavaClassConstructorDescriptor(classDescriptor, null, annotations, z2, CallableMemberDescriptor.Kind.X, javaSourceElement);
        }
        Z(6);
        throw null;
    }

    public static /* synthetic */ void Z(int i2) {
        String str = (i2 == 11 || i2 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 11 || i2 == 18) ? 2 : 3];
        switch (i2) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i2 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i2 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 11 && i2 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final /* bridge */ /* synthetic */ FunctionDescriptorImpl G0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        return U0(declarationDescriptor, functionDescriptor, kind, annotations, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final void M0(boolean z2) {
        this.G0 = Boolean.valueOf(z2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final void N0(boolean z2) {
        this.H0 = Boolean.valueOf(z2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl
    /* JADX INFO: renamed from: P0 */
    public final /* bridge */ /* synthetic */ ClassConstructorDescriptorImpl G0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        return U0(declarationDescriptor, functionDescriptor, kind, annotations, sourceElement);
    }

    public final JavaClassConstructorDescriptor U0(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Annotations annotations, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            Z(7);
            throw null;
        }
        if (kind == null) {
            Z(8);
            throw null;
        }
        if (annotations == null) {
            Z(9);
            throw null;
        }
        if (sourceElement == null) {
            Z(10);
            throw null;
        }
        if (kind != CallableMemberDescriptor.Kind.X && kind != CallableMemberDescriptor.Kind.e0) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor + "\nkind: " + kind);
        }
        JavaClassConstructorDescriptor javaClassConstructorDescriptor = new JavaClassConstructorDescriptor((ClassDescriptor) declarationDescriptor, (JavaClassConstructorDescriptor) functionDescriptor, annotations, this.F0, kind, sourceElement);
        Boolean bool = this.G0;
        bool.getClass();
        javaClassConstructorDescriptor.G0 = bool;
        Boolean bool2 = this.H0;
        bool2.getClass();
        javaClassConstructorDescriptor.H0 = bool2;
        return javaClassConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final boolean Y() {
        return this.H0.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public final JavaCallableMemberDescriptor p0(KotlinType kotlinType, ArrayList arrayList, KotlinType kotlinType2, Pair pair) {
        JavaClassConstructorDescriptor javaClassConstructorDescriptorU0 = U0(d(), null, getKind(), getAnnotations(), f());
        javaClassConstructorDescriptorU0.J0(kotlinType == null ? null : DescriptorFactory.h(javaClassConstructorDescriptorU0, kotlinType, Annotations.Companion.f43614a), this.k0, EmptyList.X, getTypeParameters(), UtilKt.a(arrayList, e(), javaClassConstructorDescriptorU0), kotlinType2, q(), getVisibility());
        if (pair != null) {
            javaClassConstructorDescriptorU0.L0((CallableDescriptor.UserDataKey) pair.X, pair.f43249Y);
        }
        return javaClassConstructorDescriptorU0;
    }
}
