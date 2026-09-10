package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.Result;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/gintrap;", "Lkotlin/Result;", "result", "", "wireman", "(Lkotlinx/coroutines/gintrap;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/monroe;", "parent", "saneness", "(Lkotlinx/coroutines/monroe;)Lkotlinx/coroutines/gintrap;", "value", "attabal", "(Ljava/lang/Object;)Lkotlinx/coroutines/gintrap;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class preprohormone {
    public static final <T> gintrap<T> attabal(T t) {
        rotuma rotumaVar = new rotuma(null);
        rotumaVar.saran(t);
        return rotumaVar;
    }

    public static /* synthetic */ gintrap dern(monroe monroeVar, int i, Object obj) {
        if ((i & 1) != 0) {
            monroeVar = null;
        }
        return saneness(monroeVar);
    }

    public static final <T> gintrap<T> saneness(monroe monroeVar) {
        return new rotuma(monroeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean wireman(gintrap<T> gintrapVar, Object obj) {
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(obj);
        return thM3354exceptionOrNullimpl == null ? gintrapVar.saran(obj) : gintrapVar.seminary(thM3354exceptionOrNullimpl);
    }
}
