package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public class ReflectProperties {

    public static class LazySoftVal<T> extends Val<T> implements Function0<T> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Lambda f43416Y;
        public volatile SoftReference Z;

        /* JADX WARN: Multi-variable type inference failed */
        public LazySoftVal(CallableMemberDescriptor callableMemberDescriptor, Function0 function0) {
            if (function0 == 0) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            }
            this.Z = null;
            this.f43416Y = (Lambda) function0;
            if (callableMemberDescriptor != null) {
                this.Z = new SoftReference(callableMemberDescriptor);
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object obj;
            SoftReference softReference = this.Z;
            Object obj2 = Val.X;
            if (softReference != null && (obj = softReference.get()) != null) {
                if (obj == obj2) {
                    return null;
                }
                return obj;
            }
            Object objInvoke = this.f43416Y.invoke();
            if (objInvoke != null) {
                obj2 = objInvoke;
            }
            this.Z = new SoftReference(obj2);
            return objInvoke;
        }
    }

    public static class LazyVal<T> extends Val<T> {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Lambda f43417Y;
        public volatile Object Z = null;

        /* JADX WARN: Multi-variable type inference failed */
        public LazyVal(Function0 function0) {
            this.f43417Y = (Lambda) function0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
        public final Object invoke() {
            Object obj = this.Z;
            Object obj2 = Val.X;
            if (obj != null) {
                if (obj == obj2) {
                    return null;
                }
                return obj;
            }
            Object objInvoke = this.f43417Y.invoke();
            if (objInvoke != null) {
                obj2 = objInvoke;
            }
            this.Z = obj2;
            return objInvoke;
        }
    }

    public static abstract class Val<T> {
        public static final Object X = new AnonymousClass1();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.ReflectProperties$Val$1, reason: invalid class name */
        public static class AnonymousClass1 {
        }
    }

    public static LazySoftVal a(CallableMemberDescriptor callableMemberDescriptor, Function0 function0) {
        if (function0 != null) {
            return new LazySoftVal(callableMemberDescriptor, function0);
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }
}
