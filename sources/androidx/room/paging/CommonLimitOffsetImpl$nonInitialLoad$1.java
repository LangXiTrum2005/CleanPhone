package androidx.room.paging;

import androidx.room.paging.util.RoomPagingUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.paging.CommonLimitOffsetImpl", f = "LimitOffsetPagingSource.kt", l = {145, 153}, m = "nonInitialLoad")
final class CommonLimitOffsetImpl$nonInitialLoad$1 extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ CommonLimitOffsetImpl f8317Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonLimitOffsetImpl$nonInitialLoad$1(CommonLimitOffsetImpl commonLimitOffsetImpl, Continuation continuation) {
        super(continuation);
        this.f8317Y = commonLimitOffsetImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CommonLimitOffsetImpl$nonInitialLoad$1 commonLimitOffsetImpl$nonInitialLoad$1;
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        CommonLimitOffsetImpl commonLimitOffsetImpl = this.f8317Y;
        commonLimitOffsetImpl.getClass();
        int i2 = this.Z;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.Z = i2 - Integer.MIN_VALUE;
            commonLimitOffsetImpl$nonInitialLoad$1 = this;
        } else {
            commonLimitOffsetImpl$nonInitialLoad$1 = new CommonLimitOffsetImpl$nonInitialLoad$1(commonLimitOffsetImpl, this);
        }
        Object objA = commonLimitOffsetImpl$nonInitialLoad$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = commonLimitOffsetImpl$nonInitialLoad$1.Z;
        if (i3 == 0) {
            ResultKt.b(objA);
            commonLimitOffsetImpl$nonInitialLoad$1.Z = 1;
            objA = RoomPagingUtil.a(commonLimitOffsetImpl$nonInitialLoad$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
                throw null;
            }
            ResultKt.b(objA);
        }
        throw null;
    }
}
