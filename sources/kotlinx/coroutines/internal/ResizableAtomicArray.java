package kotlinx.coroutines.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/internal/ResizableAtomicArray;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResizableAtomicArray<T> {
    private volatile AtomicReferenceArray<T> array;

    public ResizableAtomicArray(int i2) {
        this.array = new AtomicReferenceArray<>(i2);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i2) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i2 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i2);
        }
        return null;
    }

    public final void c(int i2, CoroutineScheduler.Worker worker) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i2 < length) {
            atomicReferenceArray.set(i2, worker);
            return;
        }
        int i3 = i2 + 1;
        int i4 = length * 2;
        if (i3 < i4) {
            i3 = i4;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(i3);
        for (int i5 = 0; i5 < length; i5++) {
            atomicReferenceArray2.set(i5, atomicReferenceArray.get(i5));
        }
        atomicReferenceArray2.set(i2, worker);
        this.array = atomicReferenceArray2;
    }
}
