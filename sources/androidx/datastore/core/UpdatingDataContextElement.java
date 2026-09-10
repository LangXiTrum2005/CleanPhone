package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/UpdatingDataContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UpdatingDataContextElement implements CoroutineContext.Element {
    public final UpdatingDataContextElement X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final DataStoreImpl f4696Y;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/UpdatingDataContextElement$Companion;", "", "Key", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/datastore/core/UpdatingDataContextElement$Companion$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/datastore/core/UpdatingDataContextElement;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Key implements CoroutineContext.Key<UpdatingDataContextElement> {
            public static final Key X = new Key();
        }
    }

    public UpdatingDataContextElement(UpdatingDataContextElement updatingDataContextElement, DataStoreImpl instance) {
        Intrinsics.f(instance, "instance");
        this.X = updatingDataContextElement;
        this.f4696Y = instance;
    }

    public final void c(DataStoreImpl dataStoreImpl) {
        if (this.f4696Y == dataStoreImpl) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        UpdatingDataContextElement updatingDataContextElement = this.X;
        if (updatingDataContextElement != null) {
            updatingDataContextElement.c(dataStoreImpl);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    /* JADX INFO: renamed from: getKey */
    public final CoroutineContext.Key getX() {
        return Companion.Key.X;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.c(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.d(this, coroutineContext);
    }
}
