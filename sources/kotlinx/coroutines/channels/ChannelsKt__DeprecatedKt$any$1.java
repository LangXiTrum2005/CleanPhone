package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", l = {434}, m = "any")
final class ChannelsKt__DeprecatedKt$any$1<E> extends ContinuationImpl {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f44803Y;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.X = obj;
        int i2 = (this.f44803Y | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f44803Y = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                throw null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            throw null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ChannelsKt.a(null, th);
                throw th2;
            }
        }
    }
}
