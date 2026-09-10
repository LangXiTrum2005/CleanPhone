package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class OverridingUtilTypeSystemContext$newTypeCheckerState$1 extends TypeCheckerState {
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState
    public final boolean b(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        if (!(kotlinTypeMarker instanceof KotlinType)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (kotlinTypeMarker2 instanceof KotlinType) {
            throw null;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
