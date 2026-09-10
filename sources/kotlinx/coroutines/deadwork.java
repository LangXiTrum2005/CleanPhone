package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Supervisor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/deadwork;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lpigboat/rotuma;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lwretchedly/dern;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lwretchedly/dern;)V", "", "cause", "", "hydrovane", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class deadwork<T> extends pigboat.rotuma<T> {
    public deadwork(CoroutineContext coroutineContext, wretchedly.dern<? super T> dernVar) {
        super(coroutineContext, dernVar);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean hydrovane(Throwable cause) {
        return false;
    }
}
