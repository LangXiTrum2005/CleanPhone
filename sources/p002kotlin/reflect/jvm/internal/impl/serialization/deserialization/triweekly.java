package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;

/* JADX INFO: compiled from: ErrorReporter.java */
/* JADX INFO: loaded from: classes5.dex */
public interface triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final triweekly f31624attabal = new attabal();

    /* JADX INFO: compiled from: ErrorReporter.java */
    public static class attabal implements triweekly {
        public static /* synthetic */ void dern(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.triweekly
        public void attabal(CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor == null) {
                dern(2);
            }
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.triweekly
        public void saneness(wireman wiremanVar, List<String> list) {
            if (wiremanVar == null) {
                dern(0);
            }
            if (list == null) {
                dern(1);
            }
        }
    }

    void attabal(CallableMemberDescriptor callableMemberDescriptor);

    void saneness(wireman wiremanVar, List<String> list);
}
