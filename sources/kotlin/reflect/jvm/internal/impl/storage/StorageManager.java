package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public interface StorageManager {
    NotNullLazyValue a(Function0 function0);

    NullableLazyValue b(Function0 function0);

    NotNullLazyValue c(Function0 function0, Function1 function1, Function1 function2);
}
