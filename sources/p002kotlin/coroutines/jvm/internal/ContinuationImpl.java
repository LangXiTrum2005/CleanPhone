package p002kotlin.coroutines.jvm.internal;

import igo.saneness;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lwretchedly/dern;", "", "completion", "Lkotlin/coroutines/CoroutineContext;", "_context", "<init>", "(Lwretchedly/dern;Lkotlin/coroutines/CoroutineContext;)V", "(Lwretchedly/dern;)V", "intercepted", "()Lwretchedly/dern;", "", "releaseIntercepted", "()V", "Lkotlin/coroutines/CoroutineContext;", "Lwretchedly/dern;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final CoroutineContext _context;
    private transient dern<Object> intercepted;

    public ContinuationImpl(dern<Object> dernVar, CoroutineContext coroutineContext) {
        super(dernVar);
        this._context = coroutineContext;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl, wretchedly.dern
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.beachfront(coroutineContext);
        return coroutineContext;
    }

    public final dern<Object> intercepted() {
        dern<Object> dernVarTimberyard = this.intercepted;
        if (dernVarTimberyard == null) {
            p002kotlin.coroutines.dern dernVar = (p002kotlin.coroutines.dern) getContext().get(p002kotlin.coroutines.dern.INSTANCE);
            if (dernVar == null || (dernVarTimberyard = dernVar.timberyard(this)) == null) {
                dernVarTimberyard = this;
            }
            this.intercepted = dernVarTimberyard;
        }
        return dernVarTimberyard;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        dern<?> dernVar = this.intercepted;
        if (dernVar != null && dernVar != this) {
            CoroutineContext.Element element = getContext().get(p002kotlin.coroutines.dern.INSTANCE);
            Intrinsics.beachfront(element);
            ((p002kotlin.coroutines.dern) element).kattegat(dernVar);
        }
        this.intercepted = saneness.f28410kowloon;
    }

    public ContinuationImpl(dern<Object> dernVar) {
        this(dernVar, dernVar != null ? dernVar.getContext() : null);
    }
}
