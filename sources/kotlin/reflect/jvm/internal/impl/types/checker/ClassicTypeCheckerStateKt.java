package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* JADX INFO: loaded from: classes7.dex */
public final class ClassicTypeCheckerStateKt {
    public static TypeCheckerState a(boolean z2, KotlinTypePreparator kotlinTypePreparator, int i2) {
        KotlinTypeRefiner.Default r5 = KotlinTypeRefiner.Default.f44564a;
        SimpleClassicTypeSystemContext simpleClassicTypeSystemContext = SimpleClassicTypeSystemContext.f44576a;
        if ((i2 & 8) != 0) {
            kotlinTypePreparator = KotlinTypePreparator.Default.f44563a;
        }
        return new TypeCheckerState(z2, true, simpleClassicTypeSystemContext, kotlinTypePreparator, r5);
    }
}
