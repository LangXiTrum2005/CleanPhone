package kotlinx.coroutines.channels;

import p002kotlin.Metadata;
import p002kotlin.Unit;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"E", "Lkotlinx/coroutines/channels/polloi;", "element", "Lkotlinx/coroutines/channels/impromptu;", "", "attabal", "(Lkotlinx/coroutines/channels/polloi;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
public final /* synthetic */ class ChannelsKt__ChannelsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object attabal(polloi<? super E> polloiVar, E e) {
        Object objTriweekly = polloiVar.triweekly(e);
        if (objTriweekly instanceof impromptu.dern) {
            return ((impromptu) kotlinx.coroutines.taiyuan.saneness(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(polloiVar, e, null), 1, null)).getHolder();
        }
        return impromptu.INSTANCE.dern(Unit.f29295attabal);
    }
}
