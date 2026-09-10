package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
final class RawTypeImpl$render$newArgs$1 extends Lambda implements Function1<String, CharSequence> {
    public static final RawTypeImpl$render$newArgs$1 X = new RawTypeImpl$render$newArgs$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.f(it, "it");
        return "(raw) ".concat(it);
    }
}
