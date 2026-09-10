package kotlin;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/DeepRecursiveScopeImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lkotlin/DeepRecursiveScope;", "Lkotlin/coroutines/Continuation;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DeepRecursiveScopeImpl<T, R> extends DeepRecursiveScope<T, R> implements Continuation<R> {
    public Function3 X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Unit f43245Y;
    public Continuation Z;
    public Object e0;

    @Override // kotlin.DeepRecursiveScope
    public final void a(Continuation continuation) {
        Unit unit = Unit.f43263a;
        this.Z = continuation;
        this.f43245Y = unit;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getF45023Y() {
        return EmptyCoroutineContext.X;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.Z = null;
        this.e0 = obj;
    }
}
