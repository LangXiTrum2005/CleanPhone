package androidx.paging;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "Landroidx/paging/PagingSource$LoadResult$Page;", "Key", "Value", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.jvm.kt", l = {110}, m = "invokeSuspend")
final class LegacyPagingSource$load$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PagingSource.LoadResult.Page<Object, Object>>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ LegacyPagingSource f7806Y;
    public final /* synthetic */ DataSource.Params Z;
    public final /* synthetic */ PagingSource.LoadParams e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyPagingSource$load$2(LegacyPagingSource legacyPagingSource, DataSource.Params params, PagingSource.LoadParams loadParams, Continuation continuation) {
        super(2, continuation);
        this.f7806Y = legacyPagingSource;
        this.Z = params;
        this.e0 = loadParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LegacyPagingSource$load$2(this.f7806Y, this.Z, this.e0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LegacyPagingSource$load$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.f7806Y.getClass();
            this.X = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        ((DataSource.BaseResult) obj).getClass();
        throw null;
    }
}
