package p002kotlin.coroutines.jvm.internal;

import igo.beachfront;
import igo.marial;
import java.io.Serializable;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH$¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR!\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lwretchedly/dern;", "", "Ligo/dern;", "Ljava/io/Serializable;", "completion", "<init>", "(Lwretchedly/dern;)V", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "create", "(Lwretchedly/dern;)Lwretchedly/dern;", "value", "(Ljava/lang/Object;Lwretchedly/dern;)Lwretchedly/dern;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lwretchedly/dern;", "getCompletion", "()Lwretchedly/dern;", "getCallerFrame", "()Ligo/dern;", "callerFrame", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseContinuationImpl implements dern<Object>, igo.dern, Serializable {
    private final dern<Object> completion;

    public BaseContinuationImpl(dern<Object> dernVar) {
        this.completion = dernVar;
    }

    public dern<Unit> create(dern<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // igo.dern
    public igo.dern getCallerFrame() {
        dern<Object> dernVar = this.completion;
        if (dernVar instanceof igo.dern) {
            return (igo.dern) dernVar;
        }
        return null;
    }

    public final dern<Object> getCompletion() {
        return this.completion;
    }

    @Override // wretchedly.dern
    public abstract /* synthetic */ CoroutineContext getContext();

    public StackTraceElement getStackTraceElement() {
        return marial.dern(this);
    }

    public abstract Object invokeSuspend(Object result);

    @Override // wretchedly.dern
    public final void resumeWith(Object result) {
        dern<Object> dernVar = this;
        while (true) {
            beachfront.saneness(dernVar);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) dernVar;
            dern<Object> dernVar2 = baseContinuationImpl.completion;
            Intrinsics.beachfront(dernVar2);
            try {
                Object objInvokeSuspend = baseContinuationImpl.invokeSuspend(result);
                if (objInvokeSuspend == attabal.beachfront()) {
                    return;
                } else {
                    result = Result.m3351constructorimpl(objInvokeSuspend);
                }
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                result = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
            baseContinuationImpl.releaseIntercepted();
            if (!(dernVar2 instanceof BaseContinuationImpl)) {
                dernVar2.resumeWith(result);
                return;
            }
            dernVar = dernVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public dern<Unit> create(Object value, dern<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
