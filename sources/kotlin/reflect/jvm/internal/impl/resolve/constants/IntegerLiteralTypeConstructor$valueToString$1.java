package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
final class IntegerLiteralTypeConstructor$valueToString$1 extends Lambda implements Function1<KotlinType, CharSequence> {
    public static final IntegerLiteralTypeConstructor$valueToString$1 X = new IntegerLiteralTypeConstructor$valueToString$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinType it = (KotlinType) obj;
        Intrinsics.f(it, "it");
        return it.toString();
    }
}
