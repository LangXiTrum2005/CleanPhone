package p002kotlin.reflect.jvm.internal.impl.types.checker;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* JADX INFO: compiled from: ClassicTypeCheckerState.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal {
    public static final TypeCheckerState attabal(boolean z, boolean z2, saneness typeSystemContext, KotlinTypePreparator kotlinTypePreparator, beachfront kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new TypeCheckerState(z, z2, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    public static /* synthetic */ TypeCheckerState saneness(boolean z, boolean z2, saneness sanenessVar, KotlinTypePreparator kotlinTypePreparator, beachfront beachfrontVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            sanenessVar = kowloon.f31733attabal;
        }
        if ((i & 8) != 0) {
            kotlinTypePreparator = KotlinTypePreparator.attabal.f31707attabal;
        }
        if ((i & 16) != 0) {
            beachfrontVar = beachfront.attabal.f31721attabal;
        }
        return attabal(z, z2, sanenessVar, kotlinTypePreparator, beachfrontVar);
    }
}
