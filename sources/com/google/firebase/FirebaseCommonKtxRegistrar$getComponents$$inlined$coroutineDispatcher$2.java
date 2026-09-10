package com.google.firebase;

import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExecutorsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2<T> implements ComponentFactory {
    public static final FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2 X = new FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2();

    @Override // com.google.firebase.components.ComponentFactory
    public final Object b(ComponentContainer componentContainer) {
        Object objE = componentContainer.e(new Qualified(Lightweight.class, Executor.class));
        Intrinsics.e(objE, "get(...)");
        return ExecutorsKt.b((Executor) objE);
    }
}
