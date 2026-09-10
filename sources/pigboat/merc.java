package pigboat;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: ThreadLocal.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006*\u001e\b\u0000\u0010\u0007\u001a\u0004\b\u0000\u0010\u0000\"\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\b"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lpigboat/stratoscope;", "name", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "attabal", "(Lpigboat/stratoscope;)Ljava/lang/ThreadLocal;", "CommonThreadLocal", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class merc {
    public static final <T> ThreadLocal<T> attabal(stratoscope stratoscopeVar) {
        return new ThreadLocal<>();
    }
}
