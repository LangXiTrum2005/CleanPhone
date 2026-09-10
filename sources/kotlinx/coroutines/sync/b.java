package kotlinx.coroutines.sync;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ MutexImpl X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ MutexImpl.CancellableContinuationWithOwner f45114Y;

    public /* synthetic */ b(MutexImpl mutexImpl, MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner) {
        this.X = mutexImpl;
        this.f45114Y = cancellableContinuationWithOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f45114Y.getClass();
        this.X.b(null);
        return Unit.f43263a;
    }
}
