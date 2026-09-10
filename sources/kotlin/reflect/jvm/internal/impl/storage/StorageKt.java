package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final class StorageKt {
    public static final Object a(NotNullLazyValue notNullLazyValue, KProperty p2) {
        Intrinsics.f(notNullLazyValue, "<this>");
        Intrinsics.f(p2, "p");
        return notNullLazyValue.invoke();
    }
}
