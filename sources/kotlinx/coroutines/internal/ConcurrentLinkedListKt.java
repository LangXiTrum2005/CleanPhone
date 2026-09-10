package kotlinx.coroutines.internal;

import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0003H\u0082\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", BidResponsed.KEY_CUR, "", "condition", "addConditionally", "(Lkotlinx/atomicfu/AtomicInt;ILkotlin/jvm/functions/Function1;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConcurrentLinkedListKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Symbol f45026a = new Symbol("CLOSED");

    public static final Object a(Segment segment, long j, Function2 function2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (segment.Z >= j && !segment.d()) {
                return segment;
            }
            Object obj = ConcurrentLinkedListNode.X.get(segment);
            Symbol symbol = f45026a;
            if (obj == symbol) {
                return symbol;
            }
            Segment segment2 = (Segment) ((ConcurrentLinkedListNode) obj);
            if (segment2 == null) {
                segment2 = (Segment) function2.invoke(Long.valueOf(segment.Z + 1), segment);
                do {
                    atomicReferenceFieldUpdater = ConcurrentLinkedListNode.X;
                    if (atomicReferenceFieldUpdater.compareAndSet(segment, null, segment2)) {
                        if (segment.d()) {
                            segment.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(segment) == null);
            }
            segment = segment2;
        }
    }
}
