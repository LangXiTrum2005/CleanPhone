package lo;

import com.applovin.shadow.okio.Segment;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f45666a = new o(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f45667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f45668c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f45667b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f45668c = atomicReferenceArr;
    }

    public static final void a(o segment) {
        kotlin.jvm.internal.n.f(segment, "segment");
        if (segment.f45664f != null || segment.f45665g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f45662d) {
            return;
        }
        AtomicReference atomicReference = f45668c[(int) (Thread.currentThread().getId() & (((long) f45667b) - 1))];
        o oVar = f45666a;
        o oVar2 = (o) atomicReference.getAndSet(oVar);
        if (oVar2 == oVar) {
            return;
        }
        int i10 = oVar2 != null ? oVar2.f45661c : 0;
        if (i10 >= 65536) {
            atomicReference.set(oVar2);
            return;
        }
        segment.f45664f = oVar2;
        segment.f45660b = 0;
        segment.f45661c = i10 + Segment.SIZE;
        atomicReference.set(segment);
    }

    public static final o b() {
        AtomicReference atomicReference = f45668c[(int) (Thread.currentThread().getId() & (((long) f45667b) - 1))];
        o oVar = f45666a;
        o oVar2 = (o) atomicReference.getAndSet(oVar);
        if (oVar2 == oVar) {
            return new o();
        }
        if (oVar2 == null) {
            atomicReference.set(null);
            return new o();
        }
        atomicReference.set(oVar2.f45664f);
        oVar2.f45664f = null;
        oVar2.f45661c = 0;
        return oVar2;
    }
}
