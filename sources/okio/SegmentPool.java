package okio;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/SegmentPool;", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SegmentPool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Segment f45161a = new Segment(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f45162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f45163c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f45162b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i2 = 0; i2 < iHighestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference();
        }
        f45163c = atomicReferenceArr;
    }

    public static final void a(Segment segment) {
        Intrinsics.f(segment, "segment");
        if (segment.f != null || segment.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.d) {
            return;
        }
        AtomicReference atomicReference = f45163c[(int) (Thread.currentThread().getId() & (((long) f45162b) - 1))];
        Segment segment2 = f45161a;
        Segment segment3 = (Segment) atomicReference.getAndSet(segment2);
        if (segment3 == segment2) {
            return;
        }
        int i2 = segment3 != null ? segment3.f45159c : 0;
        if (i2 >= 65536) {
            atomicReference.set(segment3);
            return;
        }
        segment.f = segment3;
        segment.f45158b = 0;
        segment.f45159c = i2 + com.applovin.shadow.okio.Segment.SIZE;
        atomicReference.set(segment);
    }

    public static final Segment b() {
        AtomicReference atomicReference = f45163c[(int) (Thread.currentThread().getId() & (((long) f45162b) - 1))];
        Segment segment = f45161a;
        Segment segment2 = (Segment) atomicReference.getAndSet(segment);
        if (segment2 == segment) {
            return new Segment();
        }
        if (segment2 == null) {
            atomicReference.set(null);
            return new Segment();
        }
        atomicReference.set(segment2.f);
        segment2.f = null;
        segment2.f45159c = 0;
        return segment2;
    }
}
