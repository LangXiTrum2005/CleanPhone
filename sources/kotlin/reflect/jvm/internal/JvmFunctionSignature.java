package kotlin.reflect.jvm.internal;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "FakeJavaAnnotationConstructor", "JavaConstructor", "JavaMethod", "KotlinConstructor", "KotlinFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class JvmFunctionSignature {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f43372a;

        public FakeJavaAnnotationConstructor(Class jClass) {
            Intrinsics.f(jClass, "jClass");
            Object[] declaredMethods = jClass.getDeclaredMethods();
            Intrinsics.e(declaredMethods, "jClass.declaredMethods");
            JvmFunctionSignature$FakeJavaAnnotationConstructor$special$$inlined$sortedBy$1 jvmFunctionSignature$FakeJavaAnnotationConstructor$special$$inlined$sortedBy$1 = new JvmFunctionSignature$FakeJavaAnnotationConstructor$special$$inlined$sortedBy$1();
            if (declaredMethods.length != 0) {
                declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
                Intrinsics.e(declaredMethods, "copyOf(...)");
                if (declaredMethods.length > 1) {
                    Arrays.sort(declaredMethods, jvmFunctionSignature$FakeJavaAnnotationConstructor$special$$inlined$sortedBy$1);
                }
            }
            this.f43372a = ArraysKt.e(declaredMethods);
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: a */
        public final String getF43378b() {
            return CollectionsKt.D(this.f43372a, "", "<init>(", ")V", JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1.X, 24);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class JavaConstructor extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Constructor f43373a;

        public JavaConstructor(Constructor constructor) {
            Intrinsics.f(constructor, "constructor");
            this.f43373a = constructor;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: a */
        public final String getF43378b() {
            Class<?>[] parameterTypes = this.f43373a.getParameterTypes();
            Intrinsics.e(parameterTypes, "constructor.parameterTypes");
            return ArraysKt.I(parameterTypes, "<init>(", ")V", JvmFunctionSignature$JavaConstructor$asString$1.X, 24);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class JavaMethod extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f43374a;

        public JavaMethod(Method method) {
            Intrinsics.f(method, "method");
            this.f43374a = method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: a */
        public final String getF43378b() {
            return RuntimeTypeMapperKt.a(this.f43374a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", InAppPurchaseMetaData.KEY_SIGNATURE, "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class KotlinConstructor extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JvmMemberSignature.Method f43375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f43376b;

        public KotlinConstructor(JvmMemberSignature.Method method) {
            this.f43375a = method;
            this.f43376b = method.a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF43378b() {
            return this.f43376b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", InAppPurchaseMetaData.KEY_SIGNATURE, "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class KotlinFunction extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JvmMemberSignature.Method f43377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f43378b;

        public KotlinFunction(JvmMemberSignature.Method method) {
            this.f43377a = method;
            this.f43378b = method.a();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF43378b() {
            return this.f43378b;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF43378b();
}
