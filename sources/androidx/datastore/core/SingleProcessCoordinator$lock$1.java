package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {66, 41}, m = "lock")
final class SingleProcessCoordinator$lock$1<T> extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MutexImpl f4691Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ SingleProcessCoordinator e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessCoordinator$lock$1(SingleProcessCoordinator singleProcessCoordinator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e0 = singleProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.Z = obj;
        this.f0 |= Integer.MIN_VALUE;
        return this.e0.d(null, this);
    }
}
