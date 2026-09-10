package p002kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class saneness {
    public final competently attabal(dovishness functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        for (Checks checks : saneness()) {
            if (checks.saneness(functionDescriptor)) {
                return checks.attabal(functionDescriptor);
            }
        }
        return competently.attabal.f31849saneness;
    }

    public abstract List<Checks> saneness();
}
