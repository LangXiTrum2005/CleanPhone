package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public interface ErrorReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ErrorReporter f44408a = new AnonymousClass1();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter$1, reason: invalid class name */
    public static class AnonymousClass1 implements ErrorReporter {
        public static /* synthetic */ void c(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i2 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
        public final void a(ClassDescriptor classDescriptor, ArrayList arrayList) {
            if (classDescriptor != null) {
                return;
            }
            c(0);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
        public final void b(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor != null) {
                return;
            }
            c(2);
            throw null;
        }
    }

    void a(ClassDescriptor classDescriptor, ArrayList arrayList);

    void b(CallableMemberDescriptor callableMemberDescriptor);
}
