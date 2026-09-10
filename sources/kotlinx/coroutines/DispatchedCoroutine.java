package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/DispatchedCoroutine;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlinx/atomicfu/AtomicInt;", "_decision", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DispatchedCoroutine<T> extends ScopeCoroutine<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f0 = AtomicIntegerFieldUpdater.newUpdater(DispatchedCoroutine.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    public final void B(Object obj) {
        C(obj);
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    public final void C(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f0;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                DispatchedContinuationKt.a(CompletionStateKt.a(obj), IntrinsicsKt.b(this.e0));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
