package androidx.core.util;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/util/AndroidXContinuationConsumer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/core/util/Consumer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AndroidXContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {
    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        if (compareAndSet(false, true)) {
            throw null;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
