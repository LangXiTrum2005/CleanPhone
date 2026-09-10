package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "hint", "Landroidx/paging/ViewportHint;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
final class PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 extends SuspendLambda implements Function2<ViewportHint, Continuation<? super Boolean>, Object> {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ PageFetcherSnapshot f7848Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(PageFetcherSnapshot pageFetcherSnapshot, Continuation continuation) {
        super(2, continuation);
        this.f7848Y = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 pageFetcherSnapshot$startConsumingHints$1$jumpHint$1 = new PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(this.f7848Y, continuation);
        pageFetcherSnapshot$startConsumingHints$1$jumpHint$1.X = obj;
        return pageFetcherSnapshot$startConsumingHints$1$jumpHint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcherSnapshot$startConsumingHints$1$jumpHint$1) create((ViewportHint) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        ((ViewportHint) this.X).getClass();
        throw null;
    }
}
