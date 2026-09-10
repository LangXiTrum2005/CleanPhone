package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlinx.coroutines.intrinsics.CancellableKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/LazyDeferredCoroutine;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/DeferredCoroutine;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class LazyDeferredCoroutine<T> extends DeferredCoroutine<T> {
    @Override // kotlinx.coroutines.JobSupport
    public final void i0() {
        CancellableKt.a(null, this);
    }
}
