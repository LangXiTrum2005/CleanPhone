package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.Segment;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreSegment;", "Lkotlinx/coroutines/internal/Segment;", "Lkotlinx/atomicfu/AtomicArray;", "", "acquirers", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SemaphoreSegment extends Segment<SemaphoreSegment> {
    public final /* synthetic */ AtomicReferenceArray f0;

    public SemaphoreSegment(long j, SemaphoreSegment semaphoreSegment, int i2) {
        super(j, semaphoreSegment, i2);
        this.f0 = new AtomicReferenceArray(SemaphoreKt.f);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final int g() {
        return SemaphoreKt.f;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final void h(int i2, CoroutineContext coroutineContext) {
        this.f0.set(i2, SemaphoreKt.f45111e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.Z + ", hashCode=" + hashCode() + AbstractJsonLexerKt.END_LIST;
    }
}
