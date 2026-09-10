package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public interface SignaturePropagator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SignaturePropagator f43817a = new AnonymousClass1();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator$1, reason: invalid class name */
    public static class AnonymousClass1 implements SignaturePropagator {
        public static /* synthetic */ void c(int i2) {
            Object[] objArr = new Object[3];
            switch (i2) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i2 == 5 || i2 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        public final PropagatedSignature a(JavaMethod javaMethod, ClassDescriptor classDescriptor, KotlinType kotlinType, List list, ArrayList arrayList) {
            if (javaMethod == null) {
                c(0);
                throw null;
            }
            if (classDescriptor != null) {
                List list2 = Collections.EMPTY_LIST;
                return new PropagatedSignature(kotlinType, list, arrayList);
            }
            c(1);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        public final void b(JavaMethodDescriptor javaMethodDescriptor, List list) {
            if (list != null) {
                throw new UnsupportedOperationException("Should not be called");
            }
            c(6);
            throw null;
        }
    }

    public static class PropagatedSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KotlinType f43818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f43819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f43820c;
        public final List d;

        public PropagatedSignature(KotlinType kotlinType, List list, ArrayList arrayList) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 == null) {
                a(3);
                throw null;
            }
            this.f43818a = kotlinType;
            this.f43819b = list;
            this.f43820c = arrayList;
            this.d = list2;
        }

        public static /* synthetic */ void a(int i2) {
            String str = (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : 3];
            switch (i2) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i2 == 4) {
                objArr[1] = "getReturnType";
            } else if (i2 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i2 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i2 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i2 != 4 && i2 != 5 && i2 != 6 && i2 != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i2 != 4 && i2 != 5 && i2 != 6 && i2 != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }
    }

    PropagatedSignature a(JavaMethod javaMethod, ClassDescriptor classDescriptor, KotlinType kotlinType, List list, ArrayList arrayList);

    void b(JavaMethodDescriptor javaMethodDescriptor, List list);
}
