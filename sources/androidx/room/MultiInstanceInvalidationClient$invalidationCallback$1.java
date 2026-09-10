package androidx.room;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/MultiInstanceInvalidationClient$invalidationCallback$1", "Landroidx/room/IMultiInstanceInvalidationCallback$Stub;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiInstanceInvalidationClient$invalidationCallback$1 extends IMultiInstanceInvalidationCallback.Stub {
    public final /* synthetic */ MultiInstanceInvalidationClient X;

    public MultiInstanceInvalidationClient$invalidationCallback$1(MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        this.X = multiInstanceInvalidationClient;
        attachInterface(this, IMultiInstanceInvalidationCallback.N8);
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public final void f(String[] tables) {
        Intrinsics.f(tables, "tables");
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.X;
        BuildersKt.c(multiInstanceInvalidationClient.d, null, null, new MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(tables, multiInstanceInvalidationClient, null), 3);
    }
}
