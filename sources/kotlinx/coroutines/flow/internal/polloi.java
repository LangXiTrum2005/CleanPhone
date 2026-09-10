package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/flow/internal/polloi;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lwretchedly/dern;", "Ligo/dern;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "uCont", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lwretchedly/dern;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "kowloon", "Lwretchedly/dern;", "arytenoidectomy", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCallerFrame", "()Ligo/dern;", "callerFrame", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class polloi<T> implements wretchedly.dern<T>, igo.dern {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext context;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final wretchedly.dern<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public polloi(wretchedly.dern<? super T> dernVar, CoroutineContext coroutineContext) {
        this.uCont = dernVar;
        this.context = coroutineContext;
    }

    @Override // igo.dern
    public igo.dern getCallerFrame() {
        wretchedly.dern<T> dernVar = this.uCont;
        if (dernVar instanceof igo.dern) {
            return (igo.dern) dernVar;
        }
        return null;
    }

    @Override // wretchedly.dern
    public CoroutineContext getContext() {
        return this.context;
    }

    @Override // wretchedly.dern
    public void resumeWith(Object result) {
        this.uCont.resumeWith(result);
    }
}
