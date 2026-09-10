package androidx.room.paging;

import androidx.paging.PagingSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.paging.CommonLimitOffsetImpl", f = "LimitOffsetPagingSource.kt", l = {102, 104}, m = "load")
final class CommonLimitOffsetImpl$load$1 extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ CommonLimitOffsetImpl f8316Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonLimitOffsetImpl$load$1(CommonLimitOffsetImpl commonLimitOffsetImpl, Continuation continuation) {
        super(continuation);
        this.f8316Y = commonLimitOffsetImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CommonLimitOffsetImpl$load$1 commonLimitOffsetImpl$load$1;
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        CommonLimitOffsetImpl commonLimitOffsetImpl = this.f8316Y;
        commonLimitOffsetImpl.getClass();
        int i2 = this.Z;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.Z = i2 - Integer.MIN_VALUE;
            commonLimitOffsetImpl$load$1 = this;
        } else {
            commonLimitOffsetImpl$load$1 = new CommonLimitOffsetImpl$load$1(commonLimitOffsetImpl, this);
        }
        Object obj2 = commonLimitOffsetImpl$load$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = commonLimitOffsetImpl$load$1.Z;
        if (i3 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        try {
            if (i3 == 1) {
                ResultKt.b(obj2);
                throw null;
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            return (PagingSource.LoadResult) obj2;
        } catch (Exception e2) {
            return new PagingSource.LoadResult.Error(e2);
        }
    }
}
