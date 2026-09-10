package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class LazyActorCoroutine$onSend$1 extends FunctionReferenceImpl implements Function3<LazyActorCoroutine<?>, SelectInstance<?>, Object, Unit> {
    static {
        new LazyActorCoroutine$onSend$1(3, LazyActorCoroutine.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyActorCoroutine lazyActorCoroutine = (LazyActorCoroutine) obj;
        int i2 = LazyActorCoroutine.f0;
        lazyActorCoroutine.getClass();
        CancellableKt.a(null, lazyActorCoroutine);
        BufferedChannel bufferedChannel = lazyActorCoroutine.e0;
        bufferedChannel.getClass();
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.X;
        TypeIntrinsics.d(3, bufferedChannel$onSend$1);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.X;
        TypeIntrinsics.d(3, bufferedChannel$onSend$2);
        new SelectClause2Impl(bufferedChannel, bufferedChannel$onSend$1, bufferedChannel$onSend$2).getF45078b().invoke(lazyActorCoroutine, (SelectInstance) obj2, obj3);
        return Unit.f43263a;
    }
}
