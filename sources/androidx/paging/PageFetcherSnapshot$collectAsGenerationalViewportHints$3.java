package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/paging/GenerationalViewportHint;", "Key", "", "Value", "previous", "next"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
final class PageFetcherSnapshot$collectAsGenerationalViewportHints$3 extends SuspendLambda implements Function3<GenerationalViewportHint, GenerationalViewportHint, Continuation<? super GenerationalViewportHint>, Object> {
    public /* synthetic */ GenerationalViewportHint X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ GenerationalViewportHint f7839Y;
    public final /* synthetic */ LoadType Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$3(LoadType loadType, Continuation continuation) {
        super(3, continuation);
        this.Z = loadType;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PageFetcherSnapshot$collectAsGenerationalViewportHints$3 pageFetcherSnapshot$collectAsGenerationalViewportHints$3 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$3(this.Z, (Continuation) obj3);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.X = (GenerationalViewportHint) obj;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$3.f7839Y = (GenerationalViewportHint) obj2;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$3.invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean zA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        GenerationalViewportHint previous = this.X;
        GenerationalViewportHint generationalViewportHint = this.f7839Y;
        Intrinsics.f(generationalViewportHint, "<this>");
        Intrinsics.f(previous, "previous");
        LoadType loadType = this.Z;
        int i2 = generationalViewportHint.f7803a;
        int i3 = previous.f7803a;
        if (i2 > i3) {
            zA = true;
        } else {
            zA = i2 < i3 ? false : HintHandlerKt.a(generationalViewportHint.f7804b, previous.f7804b, loadType);
        }
        return zA ? generationalViewportHint : previous;
    }
}
