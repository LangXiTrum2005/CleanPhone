package duvetyn;

import com.ironsource.D1;
import java.util.concurrent.atomic.AtomicReference;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SegmentPool.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lduvetyn/yemenite;", "", "<init>", "()V", "Lduvetyn/oilcan;", "dern", "()Lduvetyn/oilcan;", D1.i, "", "saneness", "(Lduvetyn/oilcan;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "attabal", "()Ljava/util/concurrent/atomic/AtomicReference;", "", "I", "getMAX_SIZE", "()I", "MAX_SIZE", "Lduvetyn/oilcan;", "LOCK", "wireman", "HASH_BUCKET_COUNT", "", "marial", "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class yemenite {

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final AtomicReference<oilcan>[] hashBuckets;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final int HASH_BUCKET_COUNT;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final yemenite f25498attabal = new yemenite();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final int MAX_SIZE = 65536;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final oilcan LOCK = new oilcan(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = iHighestOneBit;
        AtomicReference<oilcan>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        hashBuckets = atomicReferenceArr;
    }

    public static final oilcan dern() {
        AtomicReference<oilcan> atomicReferenceAttabal = f25498attabal.attabal();
        oilcan oilcanVar = LOCK;
        oilcan andSet = atomicReferenceAttabal.getAndSet(oilcanVar);
        if (andSet == oilcanVar) {
            return new oilcan();
        }
        if (andSet == null) {
            atomicReferenceAttabal.set(null);
            return new oilcan();
        }
        atomicReferenceAttabal.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }

    public static final void saneness(oilcan segment) {
        AtomicReference<oilcan> atomicReferenceAttabal;
        oilcan oilcanVar;
        oilcan andSet;
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.next != null || segment.prev != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.shared || (andSet = (atomicReferenceAttabal = f25498attabal.attabal()).getAndSet((oilcanVar = LOCK))) == oilcanVar) {
            return;
        }
        int i = andSet != null ? andSet.limit : 0;
        if (i >= MAX_SIZE) {
            atomicReferenceAttabal.set(andSet);
            return;
        }
        segment.next = andSet;
        segment.pos = 0;
        segment.limit = i + 8192;
        atomicReferenceAttabal.set(segment);
    }

    public final AtomicReference<oilcan> attabal() {
        return hashBuckets[(int) (Thread.currentThread().getId() & (((long) HASH_BUCKET_COUNT) - 1))];
    }
}
