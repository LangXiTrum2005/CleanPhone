package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;

/* JADX INFO: compiled from: ErasureProjectionComputer.kt */
/* JADX INFO: loaded from: classes5.dex */
public class dovishness {
    public static /* synthetic */ timberyard saneness(dovishness dovishnessVar, clubfoot clubfootVar, gintrap gintrapVar, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, oilcan oilcanVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i & 8) != 0) {
            oilcanVar = typeParameterUpperBoundEraser.dern(clubfootVar, gintrapVar);
        }
        return dovishnessVar.attabal(clubfootVar, gintrapVar, typeParameterUpperBoundEraser, oilcanVar);
    }

    public timberyard attabal(clubfoot parameter, gintrap typeAttr, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, oilcan erasedUpperBound) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        Intrinsics.checkNotNullParameter(erasedUpperBound, "erasedUpperBound");
        return new treadless(Variance.OUT_VARIANCE, erasedUpperBound);
    }
}
