package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", l = {380}, m = "receiveOrNull")
final class ReceiveChannel$receiveOrNull$1<E> extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f44835Y;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        int i2 = (this.f44835Y | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f44835Y = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.f44835Y = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Object obj2 = ((ChannelResult) obj).f44798a;
        if (obj2 instanceof ChannelResult.Failed) {
            return null;
        }
        return obj2;
    }
}
