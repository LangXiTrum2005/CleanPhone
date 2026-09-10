package androidx.paging;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "onEvent")
final class SeparatorState$onEvent$1 extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ SeparatorState f7867Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorState$onEvent$1(SeparatorState separatorState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f7867Y = separatorState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SeparatorState$onEvent$1 separatorState$onEvent$1;
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        SeparatorState separatorState = this.f7867Y;
        separatorState.getClass();
        int i2 = this.Z;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.Z = i2 - Integer.MIN_VALUE;
            separatorState$onEvent$1 = this;
        } else {
            separatorState$onEvent$1 = new SeparatorState$onEvent$1(separatorState, this);
        }
        Object obj2 = separatorState$onEvent$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = separatorState$onEvent$1.Z;
        if (i3 == 0) {
            ResultKt.b(obj2);
            throw new NoWhenBranchMatchedException();
        }
        if (i3 == 1) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i3 == 2) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i3 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj2);
        throw null;
    }
}
