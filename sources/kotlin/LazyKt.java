package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlin/LazyKt__LazyJVMKt", "kotlin/LazyKt__LazyKt"}, k = 4, mv = {2, 1, 0}, xi = 49)
public final class LazyKt extends LazyKt__LazyKt {
    public static Lazy a(LazyThreadSafetyMode lazyThreadSafetyMode, Function0 initializer) {
        Intrinsics.f(initializer, "initializer");
        int iOrdinal = lazyThreadSafetyMode.ordinal();
        if (iOrdinal == 0) {
            return new SynchronizedLazyImpl(initializer);
        }
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f43260a;
        if (iOrdinal == 1) {
            SafePublicationLazyImpl safePublicationLazyImpl = new SafePublicationLazyImpl();
            safePublicationLazyImpl.X = initializer;
            safePublicationLazyImpl._value = uninitialized_value;
            return safePublicationLazyImpl;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        UnsafeLazyImpl unsafeLazyImpl = new UnsafeLazyImpl();
        unsafeLazyImpl.X = initializer;
        unsafeLazyImpl.f43264Y = uninitialized_value;
        return unsafeLazyImpl;
    }

    public static Lazy b(Function0 initializer) {
        Intrinsics.f(initializer, "initializer");
        return new SynchronizedLazyImpl(initializer);
    }
}
