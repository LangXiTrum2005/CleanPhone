package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes7.dex */
public final class KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1 extends Lambda implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intrinsics.f((KotlinTypeRefiner) obj, "<anonymous parameter 0>");
        return null;
    }
}
