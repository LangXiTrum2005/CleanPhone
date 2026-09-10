package p002kotlin.reflect.jvm.internal.impl.resolve;

import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;

/* JADX INFO: loaded from: classes5.dex */
public interface ExternalOverridabilityCondition {

    public enum Contract {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum Result {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    Contract attabal();

    Result saneness(attabal attabalVar, attabal attabalVar2, wireman wiremanVar);
}
