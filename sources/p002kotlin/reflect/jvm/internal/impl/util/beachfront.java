package p002kotlin.reflect.jvm.internal.impl.util;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface beachfront {

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class attabal {
        public static String attabal(beachfront beachfrontVar, dovishness functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            if (beachfrontVar.saneness(functionDescriptor)) {
                return null;
            }
            return beachfrontVar.getDescription();
        }
    }

    String attabal(dovishness dovishnessVar);

    String getDescription();

    boolean saneness(dovishness dovishnessVar);
}
