package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public class DescriptorSubstitutor {
    public static /* synthetic */ void a(int i2) {
        String str = i2 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 4 ? 3 : 2];
        switch (i2) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i2 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i2 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i2 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static TypeSubstitutor b(List list, TypeSubstitution typeSubstitution, DeclarationDescriptor declarationDescriptor, ArrayList arrayList) {
        if (typeSubstitution == null) {
            a(1);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        TypeSubstitutor typeSubstitutorC = c(list, typeSubstitution, declarationDescriptor, arrayList, null);
        if (typeSubstitutorC != null) {
            return typeSubstitutorC;
        }
        throw new AssertionError("Substitution failed");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b6  */
    public static TypeSubstitutor c(List list, final TypeSubstitution typeSubstitution, DeclarationDescriptor declarationDescriptor, ArrayList arrayList, boolean[] zArr) {
        TypeSubstitutor typeSubstitutor;
        if (typeSubstitution == null) {
            a(6);
            throw null;
        }
        if (declarationDescriptor == null) {
            a(7);
            throw null;
        }
        if (arrayList == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it.next();
            TypeParameterDescriptorImpl typeParameterDescriptorImplI0 = TypeParameterDescriptorImpl.I0(declarationDescriptor, typeParameterDescriptor.getAnnotations(), typeParameterDescriptor.t(), typeParameterDescriptor.j(), typeParameterDescriptor.getName(), i2, typeParameterDescriptor.H());
            map.put(typeParameterDescriptor.h(), new TypeProjectionImpl(typeParameterDescriptorImplI0.o()));
            map2.put(typeParameterDescriptor, typeParameterDescriptorImplI0);
            arrayList.add(typeParameterDescriptorImplI0);
            i2++;
        }
        TypeConstructorSubstitution$Companion$createByConstructorsMap$1 typeConstructorSubstitution$Companion$createByConstructorsMap$1 = new TypeConstructorSubstitution$Companion$createByConstructorsMap$1(map);
        TypeSubstitutor typeSubstitutorE = TypeSubstitutor.e(typeSubstitution, typeConstructorSubstitution$Companion$createByConstructorsMap$1);
        TypeSubstitutor typeSubstitutorE2 = TypeSubstitutor.e(new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution$replaceWithNonApproximating$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public final Annotations c(Annotations annotations) {
                Intrinsics.f(annotations, "annotations");
                return typeSubstitution.c(annotations);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public final TypeProjection d(KotlinType kotlinType) {
                return typeSubstitution.d(kotlinType);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public final boolean e() {
                return typeSubstitution.e();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public final KotlinType f(KotlinType topLevelType, Variance position) {
                Intrinsics.f(topLevelType, "topLevelType");
                Intrinsics.f(position, "position");
                return typeSubstitution.f(topLevelType, position);
            }
        }, typeConstructorSubstitution$Companion$createByConstructorsMap$1);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) it2.next();
            TypeParameterDescriptorImpl typeParameterDescriptorImpl = (TypeParameterDescriptorImpl) map2.get(typeParameterDescriptor2);
            for (KotlinType kotlinType : typeParameterDescriptor2.getUpperBounds()) {
                ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
                if (classifierDescriptorC instanceof TypeParameterDescriptor) {
                    TypeParameterDescriptor typeParameter = (TypeParameterDescriptor) classifierDescriptorC;
                    Intrinsics.f(typeParameter, "typeParameter");
                    if (TypeUtilsKt.h(typeParameter, null, null)) {
                        typeSubstitutor = typeSubstitutorE;
                    } else {
                        typeSubstitutor = typeSubstitutorE2;
                    }
                } else {
                    typeSubstitutor = typeSubstitutorE2;
                }
                KotlinType kotlinTypeI = typeSubstitutor.i(kotlinType, Variance.OUT_VARIANCE);
                if (kotlinTypeI == null) {
                    return null;
                }
                if (kotlinTypeI != kotlinType && zArr != null) {
                    zArr[0] = true;
                }
                if (typeParameterDescriptorImpl.m0) {
                    throw new IllegalStateException("Type parameter descriptor is already initialized: " + typeParameterDescriptorImpl.K0());
                }
                if (!KotlinTypeKt.a(kotlinTypeI)) {
                    typeParameterDescriptorImpl.l0.add(kotlinTypeI);
                }
            }
            if (typeParameterDescriptorImpl.m0) {
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + typeParameterDescriptorImpl.K0());
            }
            typeParameterDescriptorImpl.m0 = true;
        }
        return typeSubstitutorE;
    }
}
