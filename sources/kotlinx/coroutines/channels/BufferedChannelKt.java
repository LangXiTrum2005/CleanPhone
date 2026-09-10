package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BufferedChannelKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ChannelSegment f44785a = new ChannelSegment(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44786b = SystemPropsKt.d(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44787c = SystemPropsKt.d(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final Symbol d = new Symbol("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Symbol f44788e = new Symbol("SHOULD_BUFFER");
    public static final Symbol f = new Symbol("S_RESUMING_BY_RCV");
    public static final Symbol g = new Symbol("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Symbol f44789h = new Symbol("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Symbol f44790i = new Symbol("DONE_RCV");
    public static final Symbol j = new Symbol("INTERRUPTED_SEND");
    public static final Symbol k = new Symbol("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Symbol f44791l = new Symbol("CHANNEL_CLOSED");
    public static final Symbol m = new Symbol("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Symbol f44792n = new Symbol("SUSPEND_NO_WAITER");
    public static final Symbol o = new Symbol("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Symbol f44793p = new Symbol("NO_RECEIVE_RESULT");
    public static final Symbol q = new Symbol("CLOSE_HANDLER_CLOSED");
    public static final Symbol r = new Symbol("CLOSE_HANDLER_INVOKED");
    public static final Symbol s = new Symbol("NO_CLOSE_CAUSE");

    public static final boolean a(CancellableContinuation cancellableContinuation, Object obj, Function3 function3) {
        Symbol symbolC = cancellableContinuation.c(obj, function3);
        if (symbolC == null) {
            return false;
        }
        cancellableContinuation.A(symbolC);
        return true;
    }
}
