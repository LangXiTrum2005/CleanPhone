package androidx.room.support;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.support.QueryInterceptorDatabase$beginTransactionNonExclusive$1", f = "QueryInterceptorDatabase.android.kt", l = {}, m = "invokeSuspend")
final class QueryInterceptorDatabase$beginTransactionNonExclusive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ QueryInterceptorDatabase X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryInterceptorDatabase$beginTransactionNonExclusive$1(QueryInterceptorDatabase queryInterceptorDatabase, Continuation continuation) {
        super(2, continuation);
        this.X = queryInterceptorDatabase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QueryInterceptorDatabase$beginTransactionNonExclusive$1(this.X, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((QueryInterceptorDatabase$beginTransactionNonExclusive$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        throw null;
    }
}
