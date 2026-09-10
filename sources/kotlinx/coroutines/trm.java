package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Result;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Result;", "", "saneness", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/impassible;", "caller", "dern", "(Ljava/lang/Object;Lkotlinx/coroutines/impassible;)Ljava/lang/Object;", "state", "Lwretchedly/dern;", "uCont", "attabal", "(Ljava/lang/Object;Lwretchedly/dern;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class trm {
    public static final <T> Object attabal(Object obj, wretchedly.dern<? super T> dernVar) {
        if (!(obj instanceof stratoscope)) {
            return Result.m3351constructorimpl(obj);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m3351constructorimpl(p002kotlin.dern.attabal(((stratoscope) obj).cause));
    }

    public static final <T> Object dern(Object obj, impassible<?> impassibleVar) {
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(obj);
        return thM3354exceptionOrNullimpl == null ? obj : new stratoscope(thM3354exceptionOrNullimpl, false, 2, null);
    }

    public static final <T> Object saneness(Object obj) {
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(obj);
        return thM3354exceptionOrNullimpl == null ? obj : new stratoscope(thM3354exceptionOrNullimpl, false, 2, null);
    }
}
