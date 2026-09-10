package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0004\"\b\b\u0002\u0010\u0003*\u00020\u0004*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "Landroidx/paging/PagingSource$LoadResult$Page;", "K", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PagedList$Companion$create$resolvedInitialPage$1", f = "PagedList.kt", l = {178}, m = "invokeSuspend")
final class PagedList$Companion$create$resolvedInitialPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PagingSource.LoadResult.Page<Object, Object>>, Object> {
    public int X;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.X = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        PagingSource.LoadResult loadResult = (PagingSource.LoadResult) obj;
        if (loadResult instanceof PagingSource.LoadResult.Page) {
            return (PagingSource.LoadResult.Page) loadResult;
        }
        if (loadResult instanceof PagingSource.LoadResult.Error) {
            throw ((PagingSource.LoadResult.Error) loadResult).X;
        }
        if (loadResult instanceof PagingSource.LoadResult.Invalid) {
            throw new IllegalStateException("Failed to create PagedList. The provided PagingSource returned LoadResult.Invalid, but a LoadResult.Page was expected. To use a PagingSource which supports invalidation, use a PagedList builder that accepts a factory method for PagingSource or DataSource.Factory, such as LivePagedList.");
        }
        throw new NoWhenBranchMatchedException();
    }
}
