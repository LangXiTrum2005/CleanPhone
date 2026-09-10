package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/TimeoutCoroutine;", "U", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TimeoutCoroutine<U, T extends U> extends ScopeCoroutine<T> implements Runnable {
    public final long f0;

    public TimeoutCoroutine(long j, ContinuationImpl continuationImpl) {
        super(continuationImpl, continuationImpl.getF45023Y());
        this.f0 = j;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final String d0() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.d0());
        sb.append("(timeMillis=");
        return androidx.media3.extractor.text.ttml.a.o(sb, this.f0, ')');
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    @Override // java.lang.Runnable
    public final void run() {
        String strJ;
        Delay delayB = DelayKt.b(this.Z);
        DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics = delayB instanceof DelayWithTimeoutDiagnostics ? (DelayWithTimeoutDiagnostics) delayB : null;
        long j = this.f0;
        if (delayWithTimeoutDiagnostics != null) {
            Duration.Companion companion = Duration.f44719Y;
            DurationKt.h(j, DurationUnit.MILLISECONDS);
            strJ = delayWithTimeoutDiagnostics.d();
            if (strJ == null) {
                strJ = androidx.media3.extractor.text.ttml.a.j(j, "Timed out waiting for ", " ms");
            }
        } else {
            strJ = androidx.media3.extractor.text.ttml.a.j(j, "Timed out waiting for ", " ms");
        }
        E(new TimeoutCancellationException(strJ, this));
    }
}
